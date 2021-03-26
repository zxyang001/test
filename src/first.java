public class first {
    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     * 异或 ^,  他就是如果2个数字相等为0  不想等的话按二进制的比 10=01^11  10^11=01
     */
    public static int singleNumber(int[] nums) {
        int value = nums[0];
        for (int i = 1; i < nums.length; i++) {
            value = value ^ nums[i];
        }
        return value;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 4, 4, 3, 4, 4};
        System.out.println(majorityElement(nums));

    }

    /**
     * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于n/2的元素。
     * <p>
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     */
    public static int majorityElement(int[] nums) {
        int count = 0;
        int value = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (value == nums[i]) {
                count++;
                continue;
            }
            count--;
            if (count == 0) {
                value = nums[i];
                count++;
            }
        }
        return value;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix.length - 1;
        while (col < matrix[0].length || row > 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {

            } else {

            }
        }
        return false;
    }

    /**
     * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
     *
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
     *
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int end = m + n - 1;
        while (j >= 0) {
            nums1[end--] = (i >= 0 && nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }

    }
}

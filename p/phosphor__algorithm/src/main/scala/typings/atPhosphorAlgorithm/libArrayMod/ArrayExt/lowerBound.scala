package typings.atPhosphorAlgorithm.libArrayMod.ArrayExt

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/array", "ArrayExt.lowerBound")
@js.native
object lowerBound extends js.Object {
  /**
    * Find the index of the first element which compares `>=` to a value.
    *
    * @param array - The sorted array-like object to search.
    *
    * @param value - The value to locate in the array.
    *
    * @param fn - The 3-way comparison function to apply to the values.
    *   It should return `< 0` if an element is less than a value, `0` if
    *   an element is equal to a value, or `> 0` if an element is greater
    *   than a value.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The index of the first element which compares `>=` to the
    *   value, or `length` if there is no such element. If the computed
    *   index for `stop` is less than `start`, then the computed index
    *   for `start` is returned.
    *
    * #### Notes
    * The array must already be sorted in ascending order according to
    * the comparison function.
    *
    * #### Complexity
    * Logarithmic.
    *
    * #### Undefined Behavior
    * Searching a range which is not sorted in ascending order.
    *
    * A `start` or `stop` which is non-integral.
    *
    * Modifying the length of the array while searching.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * function numberCmp(a: number, b: number): number {
    *   return a - b;
    * }
    *
    * let data = [0, 3, 4, 7, 7, 9];
    * ArrayExt.lowerBound(data, 0, numberCmp);   // 0
    * ArrayExt.lowerBound(data, 6, numberCmp);   // 3
    * ArrayExt.lowerBound(data, 7, numberCmp);   // 3
    * ArrayExt.lowerBound(data, -1, numberCmp);  // 0
    * ArrayExt.lowerBound(data, 10, numberCmp);  // 6
    * ```
    */
  def apply[T, U](array: ArrayLike[T], value: U, fn: js.Function2[/* element */ T, /* value */ U, Double]): Double = js.native
  def apply[T, U](
    array: ArrayLike[T],
    value: U,
    fn: js.Function2[/* element */ T, /* value */ U, Double],
    start: Double
  ): Double = js.native
  def apply[T, U](
    array: ArrayLike[T],
    value: U,
    fn: js.Function2[/* element */ T, /* value */ U, Double],
    start: Double,
    stop: Double
  ): Double = js.native
}


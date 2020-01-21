package typings.phosphorAlgorithm.arrayMod.ArrayExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/array", "ArrayExt.reverse")
@js.native
object reverse extends js.Object {
  /**
    * Reverse an array in-place.
    *
    * @param array - The mutable array-like object of interest.
    *
    * @param start - The index of the first element in the range to be
    *   reversed, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   reversed, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * A `start` or  `stop` index which is non-integral.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * let data = [0, 1, 2, 3, 4];
    * ArrayExt.reverse(data, 1, 3);  // [0, 3, 2, 1, 4]
    * ArrayExt.reverse(data, 3);     // [0, 3, 2, 4, 1]
    * ArrayExt.reverse(data);        // [1, 4, 2, 3, 0]
    * ```
    */
  def apply[T](array: MutableArrayLike[T]): Unit = js.native
  def apply[T](array: MutableArrayLike[T], start: Double): Unit = js.native
  def apply[T](array: MutableArrayLike[T], start: Double, stop: Double): Unit = js.native
}


package typings.atPhosphorAlgorithm.libArrayMod.ArrayExt

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/array", "ArrayExt.shallowEqual")
@js.native
object shallowEqual extends js.Object {
  /**
    * Test whether two arrays are shallowly equal.
    *
    * @param a - The first array-like object to compare.
    *
    * @param b - The second array-like object to compare.
    *
    * @param fn - The comparison function to apply to the elements. It
    *   should return `true` if the elements are "equal". The default
    *   compares elements using strict `===` equality.
    *
    * @returns Whether the two arrays are shallowly equal.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * Modifying the length of the arrays while comparing.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * let d1 = [0, 3, 4, 7, 7, 9];
    * let d2 = [0, 3, 4, 7, 7, 9];
    * let d3 = [42];
    * ArrayExt.shallowEqual(d1, d2);  // true
    * ArrayExt.shallowEqual(d2, d3);  // false
    * ```
    */
  def apply[T](a: ArrayLike[T], b: ArrayLike[T]): Boolean = js.native
  def apply[T](a: ArrayLike[T], b: ArrayLike[T], fn: js.Function2[/* a */ T, /* b */ T, Boolean]): Boolean = js.native
}


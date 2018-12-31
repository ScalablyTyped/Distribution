package typings
package multisortLib.multisortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multisort", JSImport.Namespace)
@js.native
object multisortModMembers extends js.Object {
  def apply[T](
    criterions: multisortLib.multisortMod.multisortNs.Criterion[T] | js.Array[multisortLib.multisortMod.multisortNs.Criterion[T]]
  ): multisortLib.multisortMod.multisortNs.SortFunction[T] = js.native
  /**
    * Sorts given array by given criterions.
    * @param toSort Array to sort.
    * @param sortings Sort criterions.
    */
  def apply[T](
    toSort: js.Array[T],
    criterions: multisortLib.multisortMod.multisortNs.Criterion[T] | js.Array[multisortLib.multisortMod.multisortNs.Criterion[T]]
  ): js.Array[T] = js.native
}


package typings
package pDashSettleLib.pDashSettleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-settle", JSImport.Namespace)
@js.native
object pDashSettleModMembers extends js.Object {
  /**
    * Returns a Promise that is fulfilled when all promises in `input` are settled.
    *
    * The fulfilled value is an array of objects with the following properties:
    *
    * * `isFulfilled`
    * * `isRejected`
    * * `value` or `reason` (Depending on whether the promise fulfilled or rejected)
    */
  def apply[T](input: stdLib.Iterable[js.Thenable[T]]): js.Promise[js.Array[pDashSettleLib.pDashSettleMod.pSettleNs.SettledResult[T]]] = js.native
}


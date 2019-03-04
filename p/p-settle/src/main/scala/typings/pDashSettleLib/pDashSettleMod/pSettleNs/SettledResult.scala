package typings
package pDashSettleLib.pDashSettleMod.pSettleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettledResult[T] extends js.Object {
  var isFulfilled: scala.Boolean
  var isRejected: scala.Boolean
  /** If the promise was rejected, the reason */
  var reason: js.UndefOr[js.Any] = js.undefined
  /** If the promise was fulfilled, the resolved value */
  var value: js.UndefOr[T] = js.undefined
}

object SettledResult {
  @scala.inline
  def apply[T](isFulfilled: scala.Boolean, isRejected: scala.Boolean, reason: js.Any = null, value: T = null): SettledResult[T] = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled, isRejected = isRejected)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettledResult[T]]
  }
}


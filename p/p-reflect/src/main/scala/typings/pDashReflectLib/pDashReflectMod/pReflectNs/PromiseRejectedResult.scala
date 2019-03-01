package typings
package pDashReflectLib.pDashReflectMod.pReflectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseRejectedResult
  extends PromiseResult[js.Any] {
  var isFulfilled: pDashReflectLib.pDashReflectLibNumbers.`false`
  var isRejected: pDashReflectLib.pDashReflectLibNumbers.`true`
  var reason: js.Any
}

object PromiseRejectedResult {
  @scala.inline
  def apply(
    isFulfilled: pDashReflectLib.pDashReflectLibNumbers.`false`,
    isRejected: pDashReflectLib.pDashReflectLibNumbers.`true`,
    reason: js.Any
  ): PromiseRejectedResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isFulfilled")(isFulfilled)
    __obj.updateDynamic("isRejected")(isRejected)
    __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[PromiseRejectedResult]
  }
}


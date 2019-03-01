package typings
package pDashReflectLib.pDashReflectMod.pReflectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseFulfilledResult[T] extends PromiseResult[T] {
  var isFulfilled: pDashReflectLib.pDashReflectLibNumbers.`true`
  var isRejected: pDashReflectLib.pDashReflectLibNumbers.`false`
  var value: T
}

object PromiseFulfilledResult {
  @scala.inline
  def apply[T](
    isFulfilled: pDashReflectLib.pDashReflectLibNumbers.`true`,
    isRejected: pDashReflectLib.pDashReflectLibNumbers.`false`,
    value: T
  ): PromiseFulfilledResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isFulfilled")(isFulfilled)
    __obj.updateDynamic("isRejected")(isRejected)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseFulfilledResult[T]]
  }
}


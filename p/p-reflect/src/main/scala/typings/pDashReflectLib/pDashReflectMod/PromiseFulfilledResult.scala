package typings
package pDashReflectLib.pDashReflectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseFulfilledResult[ValueType] extends PromiseResult[ValueType] {
  var isFulfilled: pDashReflectLib.pDashReflectLibNumbers.`true`
  var isRejected: pDashReflectLib.pDashReflectLibNumbers.`false`
  var value: ValueType
}

object PromiseFulfilledResult {
  @scala.inline
  def apply[ValueType](
    isFulfilled: pDashReflectLib.pDashReflectLibNumbers.`true`,
    isRejected: pDashReflectLib.pDashReflectLibNumbers.`false`,
    value: ValueType
  ): PromiseFulfilledResult[ValueType] = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled, isRejected = isRejected, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PromiseFulfilledResult[ValueType]]
  }
}


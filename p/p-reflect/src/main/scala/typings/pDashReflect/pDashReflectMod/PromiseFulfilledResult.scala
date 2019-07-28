package typings.pDashReflect.pDashReflectMod

import typings.pDashReflect.pDashReflectNumbers.`false`
import typings.pDashReflect.pDashReflectNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseFulfilledResult[ValueType] extends PromiseResult[ValueType] {
  var isFulfilled: `true`
  var isRejected: `false`
  var value: ValueType
}

object PromiseFulfilledResult {
  @scala.inline
  def apply[ValueType](isFulfilled: `true`, isRejected: `false`, value: ValueType): PromiseFulfilledResult[ValueType] = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled, isRejected = isRejected, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PromiseFulfilledResult[ValueType]]
  }
}


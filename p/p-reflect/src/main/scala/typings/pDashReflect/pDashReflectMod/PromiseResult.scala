package typings.pDashReflect.pDashReflectMod

import typings.pDashReflect.pDashReflectNumbers.`false`
import typings.pDashReflect.pDashReflectNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pDashReflect.pDashReflectMod.PromiseFulfilledResult[ValueType]
  - typings.pDashReflect.pDashReflectMod.PromiseRejectedResult
*/
trait PromiseResult[ValueType] extends js.Object

object PromiseResult {
  @scala.inline
  def PromiseFulfilledResult[ValueType](isFulfilled: `true`, isRejected: `false`, value: ValueType): PromiseResult[ValueType] = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PromiseResult[ValueType]]
  }
  @scala.inline
  def PromiseRejectedResult[ValueType](isFulfilled: `false`, isRejected: `true`, reason: js.Any): PromiseResult[ValueType] = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PromiseResult[ValueType]]
  }
}


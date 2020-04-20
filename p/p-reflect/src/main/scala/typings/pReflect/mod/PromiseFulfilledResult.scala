package typings.pReflect.mod

import typings.pReflect.pReflectBooleans.`false`
import typings.pReflect.pReflectBooleans.`true`
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
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseFulfilledResult[ValueType]]
  }
}


package typings.pReflect.mod

import typings.pReflect.pReflectBooleans.`false`
import typings.pReflect.pReflectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseFulfilledResult[ValueType] extends PromiseResult[ValueType] {
  var isFulfilled: `true` = js.native
  var isRejected: `false` = js.native
  var value: ValueType = js.native
}

object PromiseFulfilledResult {
  @scala.inline
  def apply[ValueType](isFulfilled: `true`, isRejected: `false`, value: ValueType): PromiseFulfilledResult[ValueType] = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseFulfilledResult[ValueType]]
  }
  @scala.inline
  implicit class PromiseFulfilledResultOps[Self <: PromiseFulfilledResult[_], ValueType] (val x: Self with PromiseFulfilledResult[ValueType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsFulfilled(value: `true`): Self = this.set("isFulfilled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRejected(value: `false`): Self = this.set("isRejected", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: ValueType): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


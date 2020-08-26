package typings.pReflect.mod

import typings.pReflect.pReflectBooleans.`false`
import typings.pReflect.pReflectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseRejectedResult
  extends PromiseResult[js.Any] {
  var isFulfilled: `false` = js.native
  var isRejected: `true` = js.native
  var reason: js.Any = js.native
}

object PromiseRejectedResult {
  @scala.inline
  def apply(isFulfilled: `false`, isRejected: `true`, reason: js.Any): PromiseRejectedResult = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseRejectedResult]
  }
  @scala.inline
  implicit class PromiseRejectedResultOps[Self <: PromiseRejectedResult] (val x: Self) extends AnyVal {
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
    def setIsFulfilled(value: `false`): Self = this.set("isFulfilled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRejected(value: `true`): Self = this.set("isRejected", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: js.Any): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}


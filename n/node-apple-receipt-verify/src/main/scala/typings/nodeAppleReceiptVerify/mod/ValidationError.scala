package typings.nodeAppleReceiptVerify.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError extends Error {
  var appleStatus: Double = js.native
  var isRetryable: Boolean = js.native
}

object ValidationError {
  @scala.inline
  def apply(appleStatus: Double, isRetryable: Boolean, message: String, name: String): ValidationError = {
    val __obj = js.Dynamic.literal(appleStatus = appleStatus.asInstanceOf[js.Any], isRetryable = isRetryable.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
  @scala.inline
  implicit class ValidationErrorOps[Self <: ValidationError] (val x: Self) extends AnyVal {
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
    def setAppleStatus(value: Double): Self = this.set("appleStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRetryable(value: Boolean): Self = this.set("isRetryable", value.asInstanceOf[js.Any])
  }
  
}


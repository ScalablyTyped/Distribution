package typings.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  var display_message: String = js.native
  var error_code: String = js.native
  var error_message: String = js.native
  var error_type: String = js.native
}

object Error {
  @scala.inline
  def apply(display_message: String, error_code: String, error_message: String, error_type: String): Error = {
    val __obj = js.Dynamic.literal(display_message = display_message.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
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
    def setDisplay_message(value: String): Self = this.set("display_message", value.asInstanceOf[js.Any])
    @scala.inline
    def setError_code(value: String): Self = this.set("error_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setError_message(value: String): Self = this.set("error_message", value.asInstanceOf[js.Any])
    @scala.inline
    def setError_type(value: String): Self = this.set("error_type", value.asInstanceOf[js.Any])
  }
  
}


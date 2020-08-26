package typings.postmark.defaultResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultResponse extends js.Object {
  var ErrorCode: Double = js.native
  var Message: String = js.native
}

object DefaultResponse {
  @scala.inline
  def apply(ErrorCode: Double, Message: String): DefaultResponse = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultResponse]
  }
  @scala.inline
  implicit class DefaultResponseOps[Self <: DefaultResponse] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: Double): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
  }
  
}


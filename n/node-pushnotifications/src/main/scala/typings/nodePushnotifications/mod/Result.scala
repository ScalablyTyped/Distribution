package typings.nodePushnotifications.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var failure: Double = js.native
  var message: js.Array[Message] = js.native
  var method: String = js.native
  var success: Double = js.native
}

object Result {
  @scala.inline
  def apply(failure: Double, message: js.Array[Message], method: String, success: Double): Result = {
    val __obj = js.Dynamic.literal(failure = failure.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setFailure(value: Double): Self = this.set("failure", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageVarargs(value: Message*): Self = this.set("message", js.Array(value :_*))
    @scala.inline
    def setMessage(value: js.Array[Message]): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Double): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}


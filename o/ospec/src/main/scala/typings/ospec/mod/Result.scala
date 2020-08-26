package typings.ospec.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var context: String = js.native
  var error: Error | Null = js.native
  var message: String = js.native
  var pass: Boolean | Null = js.native
  var testError: Error | Null = js.native
}

object Result {
  @scala.inline
  def apply(context: String, message: String): Result = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
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
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
    @scala.inline
    def setPass(value: Boolean): Self = this.set("pass", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassNull: Self = this.set("pass", null)
    @scala.inline
    def setTestError(value: Error): Self = this.set("testError", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestErrorNull: Self = this.set("testError", null)
  }
  
}


package typings.micro.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  statusCode :number,   originalError :std.Error | undefined} */
@js.native
trait ErrorstatusCodenumberorig extends js.Object {
  var message: String = js.native
  var name: String = js.native
  var originalError: js.UndefOr[Error] = js.native
  var stack: js.UndefOr[String] = js.native
  var statusCode: Double = js.native
}

object ErrorstatusCodenumberorig {
  @scala.inline
  def apply(message: String, name: String, statusCode: Double): ErrorstatusCodenumberorig = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorstatusCodenumberorig]
  }
  @scala.inline
  implicit class ErrorstatusCodenumberorigOps[Self <: ErrorstatusCodenumberorig] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalError(value: Error): Self = this.set("originalError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalError: Self = this.set("originalError", js.undefined)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}


package typings.nodemailer.smtpConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAuthenticationResponse extends js.Object {
  var code: js.UndefOr[Double] = js.native
  var command: String = js.native
  var response: String = js.native
  var status: Double = js.native
  var text: String = js.native
}

object CustomAuthenticationResponse {
  @scala.inline
  def apply(command: String, response: String, status: Double, text: String): CustomAuthenticationResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAuthenticationResponse]
  }
  @scala.inline
  implicit class CustomAuthenticationResponseOps[Self <: CustomAuthenticationResponse] (val x: Self) extends AnyVal {
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
  }
  
}


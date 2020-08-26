package typings.nodemailer.smtpConnectionMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMTPError extends ErrnoException {
  /** command which provoked an error */
  var command: js.UndefOr[String] = js.native
  /** the last response received from the server (if the error is caused by an error response from the server) */
  var response: js.UndefOr[String] = js.native
  /** the numeric response code of the response string (if available) */
  var responseCode: js.UndefOr[Double] = js.native
}

object SMTPError {
  @scala.inline
  def apply(message: String, name: String): SMTPError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMTPError]
  }
  @scala.inline
  implicit class SMTPErrorOps[Self <: SMTPError] (val x: Self) extends AnyVal {
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
    def deleteCommand: Self = this.set("command", js.undefined)
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setResponseCode(value: Double): Self = this.set("responseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseCode: Self = this.set("responseCode", js.undefined)
  }
  
}


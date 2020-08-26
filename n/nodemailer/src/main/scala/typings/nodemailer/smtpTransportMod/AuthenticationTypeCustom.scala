package typings.nodemailer.smtpTransportMod

import typings.nodemailer.nodemailerStrings.CUSTOM
import typings.nodemailer.smtpConnectionMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationTypeCustom extends Credentials {
  var method: String = js.native
  var `type`: CUSTOM = js.native
}

object AuthenticationTypeCustom {
  @scala.inline
  def apply(method: String, pass: String, `type`: CUSTOM, user: String): AuthenticationTypeCustom = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeCustom]
  }
  @scala.inline
  implicit class AuthenticationTypeCustomOps[Self <: AuthenticationTypeCustom] (val x: Self) extends AnyVal {
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CUSTOM): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


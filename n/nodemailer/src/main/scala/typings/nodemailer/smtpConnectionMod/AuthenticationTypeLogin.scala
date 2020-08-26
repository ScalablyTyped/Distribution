package typings.nodemailer.smtpConnectionMod

import typings.nodemailer.nodemailerStrings.LOGIN
import typings.nodemailer.nodemailerStrings.Login_
import typings.nodemailer.nodemailerStrings.login__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationTypeLogin
  extends Credentials
     with AuthenticationType {
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ or ‘custom’ */
  var `type`: js.UndefOr[login__ | Login_ | LOGIN] = js.native
}

object AuthenticationTypeLogin {
  @scala.inline
  def apply(pass: String, user: String): AuthenticationTypeLogin = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeLogin]
  }
  @scala.inline
  implicit class AuthenticationTypeLoginOps[Self <: AuthenticationTypeLogin] (val x: Self) extends AnyVal {
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
    def setType(value: login__ | Login_ | LOGIN): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


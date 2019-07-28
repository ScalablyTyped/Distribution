package typings.nodemailer.libSmtpDashConnectionMod

import typings.nodemailer.nodemailerStrings.LOGIN
import typings.nodemailer.nodemailerStrings.Login
import typings.nodemailer.nodemailerStrings.login
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTypeLogin
  extends Credentials
     with AuthenticationType {
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ or ‘custom’ */
  var `type`: js.UndefOr[login | Login | LOGIN] = js.undefined
}

object AuthenticationTypeLogin {
  @scala.inline
  def apply(pass: String, user: String, `type`: login | Login | LOGIN = null): AuthenticationTypeLogin = {
    val __obj = js.Dynamic.literal(pass = pass, user = user)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeLogin]
  }
}


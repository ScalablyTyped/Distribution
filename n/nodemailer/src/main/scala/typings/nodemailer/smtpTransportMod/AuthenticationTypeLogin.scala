package typings.nodemailer.smtpTransportMod

import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerStrings.LOGIN
import typings.nodemailer.smtpConnectionMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTypeLogin extends AuthenticationType {
  var credentials: Credentials
  var method: String | `false`
  var `type`: LOGIN
  var user: String
}

object AuthenticationTypeLogin {
  @scala.inline
  def apply(credentials: Credentials, method: String | `false`, `type`: LOGIN, user: String): AuthenticationTypeLogin = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeLogin]
  }
}


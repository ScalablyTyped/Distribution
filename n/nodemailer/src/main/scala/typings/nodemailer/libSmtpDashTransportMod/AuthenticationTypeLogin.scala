package typings.nodemailer.libSmtpDashTransportMod

import typings.nodemailer.libSmtpDashConnectionMod.Credentials
import typings.nodemailer.nodemailerNumbers.`false`
import typings.nodemailer.nodemailerStrings.LOGIN
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
    val __obj = js.Dynamic.literal(credentials = credentials, method = method.asInstanceOf[js.Any], user = user)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AuthenticationTypeLogin]
  }
}


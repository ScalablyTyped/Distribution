package typings
package nodemailerLib.libSmtpDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTypeLogin extends AuthenticationType {
  var credentials: nodemailerLib.libSmtpDashConnectionMod.Credentials
  var method: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false`
  var `type`: nodemailerLib.nodemailerLibStrings.LOGIN
  var user: java.lang.String
}

object AuthenticationTypeLogin {
  @scala.inline
  def apply(
    credentials: nodemailerLib.libSmtpDashConnectionMod.Credentials,
    method: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false`,
    `type`: nodemailerLib.nodemailerLibStrings.LOGIN,
    user: java.lang.String
  ): AuthenticationTypeLogin = {
    val __obj = js.Dynamic.literal(credentials = credentials, method = method.asInstanceOf[js.Any], user = user)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AuthenticationTypeLogin]
  }
}


package typings
package nodemailerLib.libSmtpDashConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTypeLogin
  extends Credentials
     with AuthenticationType {
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ */
  var `type`: js.UndefOr[
    nodemailerLib.nodemailerLibStrings.login | nodemailerLib.nodemailerLibStrings.Login | nodemailerLib.nodemailerLibStrings.LOGIN
  ] = js.undefined
}

object AuthenticationTypeLogin {
  @scala.inline
  def apply(
    pass: java.lang.String,
    user: java.lang.String,
    `type`: nodemailerLib.nodemailerLibStrings.login | nodemailerLib.nodemailerLibStrings.Login | nodemailerLib.nodemailerLibStrings.LOGIN = null
  ): AuthenticationTypeLogin = {
    val __obj = js.Dynamic.literal(pass = pass, user = user)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeLogin]
  }
}


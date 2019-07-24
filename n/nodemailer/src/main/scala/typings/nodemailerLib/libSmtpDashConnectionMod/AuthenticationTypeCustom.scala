package typings
package nodemailerLib.libSmtpDashConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTypeCustom
  extends Credentials
     with AuthenticationType {
  var method: java.lang.String
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ or ‘custom’ */
  var `type`: nodemailerLib.nodemailerLibStrings.custom | nodemailerLib.nodemailerLibStrings.Custom | nodemailerLib.nodemailerLibStrings.CUSTOM
}

object AuthenticationTypeCustom {
  @scala.inline
  def apply(
    method: java.lang.String,
    pass: java.lang.String,
    `type`: nodemailerLib.nodemailerLibStrings.custom | nodemailerLib.nodemailerLibStrings.Custom | nodemailerLib.nodemailerLibStrings.CUSTOM,
    user: java.lang.String
  ): AuthenticationTypeCustom = {
    val __obj = js.Dynamic.literal(method = method, pass = pass, user = user)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeCustom]
  }
}


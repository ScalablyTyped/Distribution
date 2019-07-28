package typings.nodemailer.libSmtpDashConnectionMod

import typings.nodemailer.nodemailerStrings.CUSTOM
import typings.nodemailer.nodemailerStrings.Custom
import typings.nodemailer.nodemailerStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTypeCustom
  extends Credentials
     with AuthenticationType {
  var method: String
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ or ‘custom’ */
  var `type`: custom | Custom | CUSTOM
}

object AuthenticationTypeCustom {
  @scala.inline
  def apply(method: String, pass: String, `type`: custom | Custom | CUSTOM, user: String): AuthenticationTypeCustom = {
    val __obj = js.Dynamic.literal(method = method, pass = pass, user = user)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeCustom]
  }
}


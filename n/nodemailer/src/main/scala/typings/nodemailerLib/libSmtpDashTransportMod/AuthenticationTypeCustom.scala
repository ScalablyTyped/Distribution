package typings
package nodemailerLib.libSmtpDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTypeCustom
  extends nodemailerLib.libSmtpDashConnectionMod.Credentials {
  var method: java.lang.String
  var `type`: nodemailerLib.nodemailerLibStrings.CUSTOM
}

object AuthenticationTypeCustom {
  @scala.inline
  def apply(
    method: java.lang.String,
    pass: java.lang.String,
    `type`: nodemailerLib.nodemailerLibStrings.CUSTOM,
    user: java.lang.String
  ): AuthenticationTypeCustom = {
    val __obj = js.Dynamic.literal(method = method, pass = pass, user = user)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AuthenticationTypeCustom]
  }
}


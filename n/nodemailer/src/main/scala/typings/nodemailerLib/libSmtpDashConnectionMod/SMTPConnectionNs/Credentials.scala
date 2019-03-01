package typings
package nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  /** then password */
  var pass: java.lang.String
  /** the username */
  var user: java.lang.String
}

object Credentials {
  @scala.inline
  def apply(pass: java.lang.String, user: java.lang.String): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pass")(pass)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Credentials]
  }
}


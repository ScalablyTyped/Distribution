package typings.nodemailer.libSmtpDashConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  /** then password */
  var pass: String
  /** the username */
  var user: String
}

object Credentials {
  @scala.inline
  def apply(pass: String, user: String): Credentials = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Credentials]
  }
}


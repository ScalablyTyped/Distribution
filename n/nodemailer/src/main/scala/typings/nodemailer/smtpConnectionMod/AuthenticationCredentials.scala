package typings.nodemailer.smtpConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationCredentials extends js.Object {
  /** normal authentication object */
  var credentials: Credentials
}

object AuthenticationCredentials {
  @scala.inline
  def apply(credentials: Credentials): AuthenticationCredentials = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationCredentials]
  }
}


package typings.meteorPrime8consultingOauth2.OAuth2Server

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthCode extends js.Object {
  var authCode: String
  var clientId: String
  var expires: Date
  var userId: String
}

object AuthCode {
  @scala.inline
  def apply(authCode: String, clientId: String, expires: Date, userId: String): AuthCode = {
    val __obj = js.Dynamic.literal(authCode = authCode.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthCode]
  }
}


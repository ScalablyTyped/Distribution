package typings.meteorDashPrime8consultingDashOauth2.OAuth2Server

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
    val __obj = js.Dynamic.literal(authCode = authCode, clientId = clientId, expires = expires, userId = userId)
  
    __obj.asInstanceOf[AuthCode]
  }
}


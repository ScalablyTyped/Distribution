package typings.meteorDashPrime8consultingDashOauth2.OAuth2Server

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessToken extends js.Object {
  var accessToken: String
  var clientId: String
  var expires: Date
  var userId: String
}

object AccessToken {
  @scala.inline
  def apply(accessToken: String, clientId: String, expires: Date, userId: String): AccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, clientId = clientId, expires = expires, userId = userId)
  
    __obj.asInstanceOf[AccessToken]
  }
}


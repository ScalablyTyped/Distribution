package typings.meteorDashPrime8consultingDashOauth2.OAuth2Server

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshToken extends js.Object {
  var clientId: String
  var expires: Date
  var refreshToken: String
  var userId: String
}

object RefreshToken {
  @scala.inline
  def apply(clientId: String, expires: Date, refreshToken: String, userId: String): RefreshToken = {
    val __obj = js.Dynamic.literal(clientId = clientId, expires = expires, refreshToken = refreshToken, userId = userId)
  
    __obj.asInstanceOf[RefreshToken]
  }
}


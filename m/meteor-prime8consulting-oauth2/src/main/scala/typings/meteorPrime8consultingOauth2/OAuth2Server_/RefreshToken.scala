package typings.meteorPrime8consultingOauth2.OAuth2Server_

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
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RefreshToken]
  }
}


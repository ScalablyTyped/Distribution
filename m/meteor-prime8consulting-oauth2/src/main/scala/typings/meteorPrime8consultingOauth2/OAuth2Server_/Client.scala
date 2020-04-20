package typings.meteorPrime8consultingOauth2.OAuth2Server_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var active: Boolean
  var clientId: String
  var clientSecret: String
  var redirectUri: String
}

object Client {
  @scala.inline
  def apply(active: Boolean, clientId: String, clientSecret: String, redirectUri: String): Client = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}


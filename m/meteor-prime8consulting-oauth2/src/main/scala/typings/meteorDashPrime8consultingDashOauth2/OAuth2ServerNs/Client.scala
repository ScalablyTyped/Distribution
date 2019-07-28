package typings.meteorDashPrime8consultingDashOauth2.OAuth2ServerNs

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
    val __obj = js.Dynamic.literal(active = active, clientId = clientId, clientSecret = clientSecret, redirectUri = redirectUri)
  
    __obj.asInstanceOf[Client]
  }
}


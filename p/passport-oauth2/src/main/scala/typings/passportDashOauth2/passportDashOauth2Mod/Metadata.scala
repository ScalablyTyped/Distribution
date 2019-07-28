package typings.passportDashOauth2.passportDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var authorizationURL: String
  var clientID: String
  var tokenURL: String
}

object Metadata {
  @scala.inline
  def apply(authorizationURL: String, clientID: String, tokenURL: String): Metadata = {
    val __obj = js.Dynamic.literal(authorizationURL = authorizationURL, clientID = clientID, tokenURL = tokenURL)
  
    __obj.asInstanceOf[Metadata]
  }
}


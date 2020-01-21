package typings.passportOauth2.mod

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
    val __obj = js.Dynamic.literal(authorizationURL = authorizationURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], tokenURL = tokenURL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Metadata]
  }
}


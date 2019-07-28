package typings.oauth2orize.oauth2orizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2Req extends js.Object {
  var clientID: String
  var redirectURI: String
  var scope: String
  var state: String
  var transactionID: String
  var `type`: String
}

object OAuth2Req {
  @scala.inline
  def apply(
    clientID: String,
    redirectURI: String,
    scope: String,
    state: String,
    transactionID: String,
    `type`: String
  ): OAuth2Req = {
    val __obj = js.Dynamic.literal(clientID = clientID, redirectURI = redirectURI, scope = scope, state = state, transactionID = transactionID)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OAuth2Req]
  }
}


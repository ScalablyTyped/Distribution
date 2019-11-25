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
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], redirectURI = redirectURI.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2Req]
  }
}


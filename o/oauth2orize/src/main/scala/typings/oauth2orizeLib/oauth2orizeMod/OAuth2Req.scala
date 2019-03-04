package typings
package oauth2orizeLib.oauth2orizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2Req extends js.Object {
  var clientID: java.lang.String
  var redirectURI: java.lang.String
  var scope: java.lang.String
  var state: java.lang.String
  var transactionID: java.lang.String
  var `type`: java.lang.String
}

object OAuth2Req {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    redirectURI: java.lang.String,
    scope: java.lang.String,
    state: java.lang.String,
    transactionID: java.lang.String,
    `type`: java.lang.String
  ): OAuth2Req = {
    val __obj = js.Dynamic.literal(clientID = clientID, redirectURI = redirectURI, scope = scope, state = state, transactionID = transactionID)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OAuth2Req]
  }
}


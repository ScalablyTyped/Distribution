package typings
package oauth2orizeLib.oauth2orizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2 extends js.Object {
  var client: js.Any
  var info: OAuth2Info
  var redirectURI: java.lang.String
  var req: OAuth2Req
  var transactionID: java.lang.String
  var user: js.Any
}

object OAuth2 {
  @scala.inline
  def apply(
    client: js.Any,
    info: OAuth2Info,
    redirectURI: java.lang.String,
    req: OAuth2Req,
    transactionID: java.lang.String,
    user: js.Any
  ): OAuth2 = {
    val __obj = js.Dynamic.literal(client = client, info = info, redirectURI = redirectURI, req = req, transactionID = transactionID, user = user)
  
    __obj.asInstanceOf[OAuth2]
  }
}


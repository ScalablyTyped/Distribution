package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsCreateRemoveTokenResponse extends js.Object {
  var expires_at: String
  var token: String
}

object ActionsCreateRemoveTokenResponse {
  @scala.inline
  def apply(expires_at: String, token: String): ActionsCreateRemoveTokenResponse = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsCreateRemoveTokenResponse]
  }
}


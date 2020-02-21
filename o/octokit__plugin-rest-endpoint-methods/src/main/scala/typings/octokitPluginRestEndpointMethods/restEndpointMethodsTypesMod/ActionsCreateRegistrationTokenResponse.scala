package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsCreateRegistrationTokenResponse extends js.Object {
  var expires_at: String
  var token: String
}

object ActionsCreateRegistrationTokenResponse {
  @scala.inline
  def apply(expires_at: String, token: String): ActionsCreateRegistrationTokenResponse = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsCreateRegistrationTokenResponse]
  }
}


package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsCheckAuthorizationParams extends js.Object {
  var access_token: String
  var client_id: String
}

object OauthAuthorizationsCheckAuthorizationParams {
  @scala.inline
  def apply(access_token: String, client_id: String): OauthAuthorizationsCheckAuthorizationParams = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OauthAuthorizationsCheckAuthorizationParams]
  }
}


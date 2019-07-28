package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsResetAuthorizationEndpoint extends js.Object {
  var access_token: String
  var client_id: String
}

object OauthAuthorizationsResetAuthorizationEndpoint {
  @scala.inline
  def apply(access_token: String, client_id: String): OauthAuthorizationsResetAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(access_token = access_token, client_id = client_id)
  
    __obj.asInstanceOf[OauthAuthorizationsResetAuthorizationEndpoint]
  }
}


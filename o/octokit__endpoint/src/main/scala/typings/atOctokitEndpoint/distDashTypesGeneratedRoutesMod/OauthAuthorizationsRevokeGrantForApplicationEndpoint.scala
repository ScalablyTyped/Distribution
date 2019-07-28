package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsRevokeGrantForApplicationEndpoint extends js.Object {
  var access_token: String
  var client_id: String
}

object OauthAuthorizationsRevokeGrantForApplicationEndpoint {
  @scala.inline
  def apply(access_token: String, client_id: String): OauthAuthorizationsRevokeGrantForApplicationEndpoint = {
    val __obj = js.Dynamic.literal(access_token = access_token, client_id = client_id)
  
    __obj.asInstanceOf[OauthAuthorizationsRevokeGrantForApplicationEndpoint]
  }
}


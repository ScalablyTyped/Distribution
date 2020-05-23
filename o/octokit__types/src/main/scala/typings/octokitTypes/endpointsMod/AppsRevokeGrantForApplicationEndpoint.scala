package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsRevokeGrantForApplicationEndpoint extends js.Object {
  var access_token: String
  var client_id: String
}

object AppsRevokeGrantForApplicationEndpoint {
  @scala.inline
  def apply(access_token: String, client_id: String): AppsRevokeGrantForApplicationEndpoint = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsRevokeGrantForApplicationEndpoint]
  }
}


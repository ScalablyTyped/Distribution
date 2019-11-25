package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsRevokeGrantForApplicationParams extends js.Object {
  var access_token: String
  var client_id: String
}

object AppsRevokeGrantForApplicationParams {
  @scala.inline
  def apply(access_token: String, client_id: String): AppsRevokeGrantForApplicationParams = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsRevokeGrantForApplicationParams]
  }
}


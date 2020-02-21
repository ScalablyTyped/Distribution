package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCheckAuthorizationParams extends js.Object {
  var access_token: String
  var client_id: String
}

object AppsCheckAuthorizationParams {
  @scala.inline
  def apply(access_token: String, client_id: String): AppsCheckAuthorizationParams = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsCheckAuthorizationParams]
  }
}


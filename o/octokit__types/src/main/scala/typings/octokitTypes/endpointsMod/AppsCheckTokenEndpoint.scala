package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCheckTokenEndpoint extends js.Object {
  /**
    * The OAuth access token used to authenticate to the GitHub API.
    */
  var access_token: js.UndefOr[String] = js.undefined
  var client_id: String
}

object AppsCheckTokenEndpoint {
  @scala.inline
  def apply(client_id: String, access_token: String = null): AppsCheckTokenEndpoint = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCheckTokenEndpoint]
  }
}


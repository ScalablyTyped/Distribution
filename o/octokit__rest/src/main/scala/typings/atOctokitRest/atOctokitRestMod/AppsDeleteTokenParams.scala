package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsDeleteTokenParams extends js.Object {
  /**
    * The OAuth access token used to authenticate to the GitHub API.
    */
  var access_token: js.UndefOr[String] = js.undefined
  var client_id: String
}

object AppsDeleteTokenParams {
  @scala.inline
  def apply(client_id: String, access_token: String = null): AppsDeleteTokenParams = {
    val __obj = js.Dynamic.literal(client_id = client_id)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    __obj.asInstanceOf[AppsDeleteTokenParams]
  }
}


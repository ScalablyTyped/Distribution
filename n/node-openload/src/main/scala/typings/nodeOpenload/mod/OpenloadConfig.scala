package typings.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenloadConfig extends js.Object {
  /* the api_key, available directly from the WebUI after successful login */
  var api_key: String
  /* the api_login, a string available from the WebUI, NOT the user's e-mail */
  var api_login: String
  /* the api_version to target, needed for forming the URL, by default 1 */
  var api_version: js.UndefOr[Double] = js.undefined
}

object OpenloadConfig {
  @scala.inline
  def apply(api_key: String, api_login: String, api_version: js.UndefOr[Double] = js.undefined): OpenloadConfig = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], api_login = api_login.asInstanceOf[js.Any])
    if (!js.isUndefined(api_version)) __obj.updateDynamic("api_version")(api_version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenloadConfig]
  }
}


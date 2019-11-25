package typings.nodeDashZendesk.nodeDashZendeskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var asUser: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var disableGlobalState: js.UndefOr[Boolean] = js.undefined
  var oauth: js.UndefOr[Boolean] = js.undefined
  var remoteUri: String
  var token: String
  var username: String
}

object ClientOptions {
  @scala.inline
  def apply(
    remoteUri: String,
    token: String,
    username: String,
    asUser: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableGlobalState: js.UndefOr[Boolean] = js.undefined,
    oauth: js.UndefOr[Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(remoteUri = remoteUri.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (asUser != null) __obj.updateDynamic("asUser")(asUser.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGlobalState)) __obj.updateDynamic("disableGlobalState")(disableGlobalState.asInstanceOf[js.Any])
    if (!js.isUndefined(oauth)) __obj.updateDynamic("oauth")(oauth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}


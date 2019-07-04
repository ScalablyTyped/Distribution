package typings
package nodeDashZendeskLib.nodeDashZendeskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var asUser: js.UndefOr[java.lang.String] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var disableGlobalState: js.UndefOr[scala.Boolean] = js.undefined
  var oauth: js.UndefOr[scala.Boolean] = js.undefined
  var remoteUri: java.lang.String
  var token: java.lang.String
  var username: java.lang.String
}

object ClientOptions {
  @scala.inline
  def apply(
    remoteUri: java.lang.String,
    token: java.lang.String,
    username: java.lang.String,
    asUser: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    disableGlobalState: js.UndefOr[scala.Boolean] = js.undefined,
    oauth: js.UndefOr[scala.Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(remoteUri = remoteUri, token = token, username = username)
    if (asUser != null) __obj.updateDynamic("asUser")(asUser)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(disableGlobalState)) __obj.updateDynamic("disableGlobalState")(disableGlobalState)
    if (!js.isUndefined(oauth)) __obj.updateDynamic("oauth")(oauth)
    __obj.asInstanceOf[ClientOptions]
  }
}


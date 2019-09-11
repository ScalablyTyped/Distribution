package typings.openidDashClient.openidDashClientMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceAuthorizationParameters
  extends /* key */ StringDictionary[js.Any] {
  var client_id: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
}

object DeviceAuthorizationParameters {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    client_id: String = null,
    scope: String = null
  ): DeviceAuthorizationParameters = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[DeviceAuthorizationParameters]
  }
}


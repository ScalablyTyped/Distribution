package typings.openidClient.mod

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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    client_id: String = null,
    scope: String = null
  ): DeviceAuthorizationParameters = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceAuthorizationParameters]
  }
}


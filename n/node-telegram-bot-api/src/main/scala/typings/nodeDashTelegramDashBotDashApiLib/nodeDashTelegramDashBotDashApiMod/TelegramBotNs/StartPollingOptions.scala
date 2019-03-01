package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartPollingOptions extends ConstructorOptions {
  var restart: js.UndefOr[scala.Boolean] = js.undefined
}

object StartPollingOptions {
  @scala.inline
  def apply(
    baseApiUrl: java.lang.String = null,
    filepath: js.UndefOr[scala.Boolean] = js.undefined,
    onlyFirstMatch: js.UndefOr[scala.Boolean] = js.undefined,
    polling: scala.Boolean | PollingOptions = null,
    request: requestLib.requestMod.requestNs.Options = null,
    restart: js.UndefOr[scala.Boolean] = js.undefined,
    webHook: scala.Boolean | WebHookOptions = null
  ): StartPollingOptions = {
    val __obj = js.Dynamic.literal()
    if (baseApiUrl != null) __obj.updateDynamic("baseApiUrl")(baseApiUrl)
    if (!js.isUndefined(filepath)) __obj.updateDynamic("filepath")(filepath)
    if (!js.isUndefined(onlyFirstMatch)) __obj.updateDynamic("onlyFirstMatch")(onlyFirstMatch)
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (!js.isUndefined(restart)) __obj.updateDynamic("restart")(restart)
    if (webHook != null) __obj.updateDynamic("webHook")(webHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPollingOptions]
  }
}


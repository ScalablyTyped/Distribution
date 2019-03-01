package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  var baseApiUrl: js.UndefOr[java.lang.String] = js.undefined
  var filepath: js.UndefOr[scala.Boolean] = js.undefined
  var onlyFirstMatch: js.UndefOr[scala.Boolean] = js.undefined
  var polling: js.UndefOr[scala.Boolean | PollingOptions] = js.undefined
  var request: js.UndefOr[requestLib.requestMod.requestNs.Options] = js.undefined
  var webHook: js.UndefOr[scala.Boolean | WebHookOptions] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    baseApiUrl: java.lang.String = null,
    filepath: js.UndefOr[scala.Boolean] = js.undefined,
    onlyFirstMatch: js.UndefOr[scala.Boolean] = js.undefined,
    polling: scala.Boolean | PollingOptions = null,
    request: requestLib.requestMod.requestNs.Options = null,
    webHook: scala.Boolean | WebHookOptions = null
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (baseApiUrl != null) __obj.updateDynamic("baseApiUrl")(baseApiUrl)
    if (!js.isUndefined(filepath)) __obj.updateDynamic("filepath")(filepath)
    if (!js.isUndefined(onlyFirstMatch)) __obj.updateDynamic("onlyFirstMatch")(onlyFirstMatch)
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (webHook != null) __obj.updateDynamic("webHook")(webHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorOptions]
  }
}


package typings.nodeTelegramBotApi.mod

import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  var baseApiUrl: js.UndefOr[String] = js.undefined
  var filepath: js.UndefOr[Boolean] = js.undefined
  var onlyFirstMatch: js.UndefOr[Boolean] = js.undefined
  var polling: js.UndefOr[Boolean | PollingOptions] = js.undefined
  var request: js.UndefOr[Options] = js.undefined
  var webHook: js.UndefOr[Boolean | WebHookOptions] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    baseApiUrl: String = null,
    filepath: js.UndefOr[Boolean] = js.undefined,
    onlyFirstMatch: js.UndefOr[Boolean] = js.undefined,
    polling: Boolean | PollingOptions = null,
    request: Options = null,
    webHook: Boolean | WebHookOptions = null
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (baseApiUrl != null) __obj.updateDynamic("baseApiUrl")(baseApiUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(filepath)) __obj.updateDynamic("filepath")(filepath.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyFirstMatch)) __obj.updateDynamic("onlyFirstMatch")(onlyFirstMatch.get.asInstanceOf[js.Any])
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (webHook != null) __obj.updateDynamic("webHook")(webHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorOptions]
  }
}


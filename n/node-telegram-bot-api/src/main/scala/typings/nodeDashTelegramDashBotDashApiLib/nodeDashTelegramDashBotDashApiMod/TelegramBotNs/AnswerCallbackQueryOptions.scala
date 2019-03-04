package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnswerCallbackQueryOptions extends js.Object {
  var cache_time: js.UndefOr[scala.Double] = js.undefined
  var callback_query_id: java.lang.String
  var show_alert: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object AnswerCallbackQueryOptions {
  @scala.inline
  def apply(
    callback_query_id: java.lang.String,
    cache_time: scala.Int | scala.Double = null,
    show_alert: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null,
    url: java.lang.String = null
  ): AnswerCallbackQueryOptions = {
    val __obj = js.Dynamic.literal(callback_query_id = callback_query_id)
    if (cache_time != null) __obj.updateDynamic("cache_time")(cache_time.asInstanceOf[js.Any])
    if (!js.isUndefined(show_alert)) __obj.updateDynamic("show_alert")(show_alert)
    if (text != null) __obj.updateDynamic("text")(text)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[AnswerCallbackQueryOptions]
  }
}


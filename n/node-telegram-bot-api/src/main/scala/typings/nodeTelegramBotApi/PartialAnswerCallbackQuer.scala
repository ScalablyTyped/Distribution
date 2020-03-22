package typings.nodeTelegramBotApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<node-telegram-bot-api.node-telegram-bot-api.AnswerCallbackQueryOptions> */
trait PartialAnswerCallbackQuer extends js.Object {
  var cache_time: js.UndefOr[Double] = js.undefined
  var callback_query_id: js.UndefOr[String] = js.undefined
  var show_alert: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object PartialAnswerCallbackQuer {
  @scala.inline
  def apply(
    cache_time: Int | Double = null,
    callback_query_id: String = null,
    show_alert: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    url: String = null
  ): PartialAnswerCallbackQuer = {
    val __obj = js.Dynamic.literal()
    if (cache_time != null) __obj.updateDynamic("cache_time")(cache_time.asInstanceOf[js.Any])
    if (callback_query_id != null) __obj.updateDynamic("callback_query_id")(callback_query_id.asInstanceOf[js.Any])
    if (!js.isUndefined(show_alert)) __obj.updateDynamic("show_alert")(show_alert.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAnswerCallbackQuer]
  }
}


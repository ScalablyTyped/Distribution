package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineKeyboardButton extends js.Object {
  var callback_data: js.UndefOr[String] = js.undefined
  var callback_game: js.UndefOr[CallbackGame] = js.undefined
  var pay: js.UndefOr[Boolean] = js.undefined
  var switch_inline_query: js.UndefOr[String] = js.undefined
  var switch_inline_query_current_chat: js.UndefOr[String] = js.undefined
  var text: String
  var url: js.UndefOr[String] = js.undefined
}

object InlineKeyboardButton {
  @scala.inline
  def apply(
    text: String,
    callback_data: String = null,
    callback_game: CallbackGame = null,
    pay: js.UndefOr[Boolean] = js.undefined,
    switch_inline_query: String = null,
    switch_inline_query_current_chat: String = null,
    url: String = null
  ): InlineKeyboardButton = {
    val __obj = js.Dynamic.literal(text = text)
    if (callback_data != null) __obj.updateDynamic("callback_data")(callback_data)
    if (callback_game != null) __obj.updateDynamic("callback_game")(callback_game)
    if (!js.isUndefined(pay)) __obj.updateDynamic("pay")(pay)
    if (switch_inline_query != null) __obj.updateDynamic("switch_inline_query")(switch_inline_query)
    if (switch_inline_query_current_chat != null) __obj.updateDynamic("switch_inline_query_current_chat")(switch_inline_query_current_chat)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[InlineKeyboardButton]
  }
}


package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineKeyboardButton extends js.Object {
  var callback_data: js.UndefOr[String] = js.undefined
  var callback_game: js.UndefOr[CallbackGame] = js.undefined
  var login_url: js.UndefOr[LoginUrl] = js.undefined
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
    login_url: LoginUrl = null,
    pay: js.UndefOr[Boolean] = js.undefined,
    switch_inline_query: String = null,
    switch_inline_query_current_chat: String = null,
    url: String = null
  ): InlineKeyboardButton = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (callback_data != null) __obj.updateDynamic("callback_data")(callback_data.asInstanceOf[js.Any])
    if (callback_game != null) __obj.updateDynamic("callback_game")(callback_game.asInstanceOf[js.Any])
    if (login_url != null) __obj.updateDynamic("login_url")(login_url.asInstanceOf[js.Any])
    if (!js.isUndefined(pay)) __obj.updateDynamic("pay")(pay.get.asInstanceOf[js.Any])
    if (switch_inline_query != null) __obj.updateDynamic("switch_inline_query")(switch_inline_query.asInstanceOf[js.Any])
    if (switch_inline_query_current_chat != null) __obj.updateDynamic("switch_inline_query_current_chat")(switch_inline_query_current_chat.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineKeyboardButton]
  }
}


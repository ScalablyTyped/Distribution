package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineKeyboardButton extends js.Object {
  var callback_data: js.UndefOr[java.lang.String] = js.undefined
  var callback_game: js.UndefOr[CallbackGame] = js.undefined
  var pay: js.UndefOr[scala.Boolean] = js.undefined
  var switch_inline_query: js.UndefOr[java.lang.String] = js.undefined
  var switch_inline_query_current_chat: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object InlineKeyboardButton {
  @scala.inline
  def apply(
    text: java.lang.String,
    callback_data: java.lang.String = null,
    callback_game: CallbackGame = null,
    pay: js.UndefOr[scala.Boolean] = js.undefined,
    switch_inline_query: java.lang.String = null,
    switch_inline_query_current_chat: java.lang.String = null,
    url: java.lang.String = null
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


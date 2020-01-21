package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineKeyboardMarkup extends js.Object {
  var inline_keyboard: js.Array[js.Array[InlineKeyboardButton]]
}

object InlineKeyboardMarkup {
  @scala.inline
  def apply(inline_keyboard: js.Array[js.Array[InlineKeyboardButton]]): InlineKeyboardMarkup = {
    val __obj = js.Dynamic.literal(inline_keyboard = inline_keyboard.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InlineKeyboardMarkup]
  }
}


package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineKeyboardMarkup extends js.Object {
  var inline_keyboard: js.Array[js.Array[InlineKeyboardButton]]
}

object InlineKeyboardMarkup {
  @scala.inline
  def apply(inline_keyboard: js.Array[js.Array[InlineKeyboardButton]]): InlineKeyboardMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inline_keyboard")(inline_keyboard)
    __obj.asInstanceOf[InlineKeyboardMarkup]
  }
}


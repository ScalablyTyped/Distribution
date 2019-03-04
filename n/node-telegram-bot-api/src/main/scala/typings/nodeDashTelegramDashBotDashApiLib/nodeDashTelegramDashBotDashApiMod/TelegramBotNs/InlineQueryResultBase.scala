package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultBase extends js.Object {
  var id: java.lang.String
  var reply_markup: js.UndefOr[InlineKeyboardMarkup] = js.undefined
}

object InlineQueryResultBase {
  @scala.inline
  def apply(id: java.lang.String, reply_markup: InlineKeyboardMarkup = null): InlineQueryResultBase = {
    val __obj = js.Dynamic.literal(id = id)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    __obj.asInstanceOf[InlineQueryResultBase]
  }
}


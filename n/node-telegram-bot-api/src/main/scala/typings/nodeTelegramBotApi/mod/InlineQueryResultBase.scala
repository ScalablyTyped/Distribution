package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultBase extends js.Object {
  var id: String
  var reply_markup: js.UndefOr[InlineKeyboardMarkup] = js.undefined
}

object InlineQueryResultBase {
  @scala.inline
  def apply(id: String, reply_markup: InlineKeyboardMarkup = null): InlineQueryResultBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultBase]
  }
}


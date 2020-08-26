package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineQueryResultBase extends js.Object {
  var id: String = js.native
  var reply_markup: js.UndefOr[InlineKeyboardMarkup] = js.native
}

object InlineQueryResultBase {
  @scala.inline
  def apply(id: String): InlineQueryResultBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultBase]
  }
  @scala.inline
  implicit class InlineQueryResultBaseOps[Self <: InlineQueryResultBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setReply_markup(value: InlineKeyboardMarkup): Self = this.set("reply_markup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReply_markup: Self = this.set("reply_markup", js.undefined)
  }
  
}


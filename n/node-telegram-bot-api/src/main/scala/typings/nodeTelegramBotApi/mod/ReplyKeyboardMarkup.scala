package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplyKeyboardMarkup extends js.Object {
  var keyboard: js.Array[js.Array[KeyboardButton]] = js.native
  var one_time_keyboard: js.UndefOr[Boolean] = js.native
  var resize_keyboard: js.UndefOr[Boolean] = js.native
  var selective: js.UndefOr[Boolean] = js.native
}

object ReplyKeyboardMarkup {
  @scala.inline
  def apply(keyboard: js.Array[js.Array[KeyboardButton]]): ReplyKeyboardMarkup = {
    val __obj = js.Dynamic.literal(keyboard = keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyKeyboardMarkup]
  }
  @scala.inline
  implicit class ReplyKeyboardMarkupOps[Self <: ReplyKeyboardMarkup] (val x: Self) extends AnyVal {
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
    def setKeyboardVarargs(value: js.Array[KeyboardButton]*): Self = this.set("keyboard", js.Array(value :_*))
    @scala.inline
    def setKeyboard(value: js.Array[js.Array[KeyboardButton]]): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def setOne_time_keyboard(value: Boolean): Self = this.set("one_time_keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOne_time_keyboard: Self = this.set("one_time_keyboard", js.undefined)
    @scala.inline
    def setResize_keyboard(value: Boolean): Self = this.set("resize_keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize_keyboard: Self = this.set("resize_keyboard", js.undefined)
    @scala.inline
    def setSelective(value: Boolean): Self = this.set("selective", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelective: Self = this.set("selective", js.undefined)
  }
  
}


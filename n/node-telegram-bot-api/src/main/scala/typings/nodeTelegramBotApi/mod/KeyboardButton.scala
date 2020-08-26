package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardButton extends js.Object {
  var request_contact: js.UndefOr[Boolean] = js.native
  var request_location: js.UndefOr[Boolean] = js.native
  var text: String = js.native
}

object KeyboardButton {
  @scala.inline
  def apply(text: String): KeyboardButton = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardButton]
  }
  @scala.inline
  implicit class KeyboardButtonOps[Self <: KeyboardButton] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest_contact(value: Boolean): Self = this.set("request_contact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest_contact: Self = this.set("request_contact", js.undefined)
    @scala.inline
    def setRequest_location(value: Boolean): Self = this.set("request_location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest_location: Self = this.set("request_location", js.undefined)
  }
  
}


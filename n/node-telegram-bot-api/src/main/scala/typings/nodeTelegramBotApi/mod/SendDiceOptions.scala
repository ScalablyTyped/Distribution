package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendDiceOptions extends SendBasicOptions {
  var emoji: js.UndefOr[String] = js.native
}

object SendDiceOptions {
  @scala.inline
  def apply(): SendDiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendDiceOptions]
  }
  @scala.inline
  implicit class SendDiceOptionsOps[Self <: SendDiceOptions] (val x: Self) extends AnyVal {
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
    def setEmoji(value: String): Self = this.set("emoji", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmoji: Self = this.set("emoji", js.undefined)
  }
  
}


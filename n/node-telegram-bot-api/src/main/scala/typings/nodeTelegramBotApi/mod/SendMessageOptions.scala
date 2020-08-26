package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessageOptions extends SendBasicOptions {
  var disable_web_page_preview: js.UndefOr[Boolean] = js.native
  var parse_mode: js.UndefOr[ParseMode] = js.native
}

object SendMessageOptions {
  @scala.inline
  def apply(): SendMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageOptions]
  }
  @scala.inline
  implicit class SendMessageOptionsOps[Self <: SendMessageOptions] (val x: Self) extends AnyVal {
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
    def setDisable_web_page_preview(value: Boolean): Self = this.set("disable_web_page_preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable_web_page_preview: Self = this.set("disable_web_page_preview", js.undefined)
    @scala.inline
    def setParse_mode(value: ParseMode): Self = this.set("parse_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParse_mode: Self = this.set("parse_mode", js.undefined)
  }
  
}


package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendDocumentOptions extends SendBasicOptions {
  var caption: js.UndefOr[String] = js.native
  var parse_mode: js.UndefOr[ParseMode] = js.native
}

object SendDocumentOptions {
  @scala.inline
  def apply(): SendDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendDocumentOptions]
  }
  @scala.inline
  implicit class SendDocumentOptionsOps[Self <: SendDocumentOptions] (val x: Self) extends AnyVal {
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setParse_mode(value: ParseMode): Self = this.set("parse_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParse_mode: Self = this.set("parse_mode", js.undefined)
  }
  
}


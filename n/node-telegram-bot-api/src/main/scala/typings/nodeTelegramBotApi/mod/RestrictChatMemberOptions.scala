package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestrictChatMemberOptions extends js.Object {
  var can_add_web_page_previews: js.UndefOr[Boolean] = js.native
  var can_send_media_messages: js.UndefOr[Boolean] = js.native
  var can_send_messages: js.UndefOr[Boolean] = js.native
  var can_send_other_messages: js.UndefOr[Boolean] = js.native
  var until_date: js.UndefOr[Double] = js.native
}

object RestrictChatMemberOptions {
  @scala.inline
  def apply(): RestrictChatMemberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestrictChatMemberOptions]
  }
  @scala.inline
  implicit class RestrictChatMemberOptionsOps[Self <: RestrictChatMemberOptions] (val x: Self) extends AnyVal {
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
    def setCan_add_web_page_previews(value: Boolean): Self = this.set("can_add_web_page_previews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCan_add_web_page_previews: Self = this.set("can_add_web_page_previews", js.undefined)
    @scala.inline
    def setCan_send_media_messages(value: Boolean): Self = this.set("can_send_media_messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCan_send_media_messages: Self = this.set("can_send_media_messages", js.undefined)
    @scala.inline
    def setCan_send_messages(value: Boolean): Self = this.set("can_send_messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCan_send_messages: Self = this.set("can_send_messages", js.undefined)
    @scala.inline
    def setCan_send_other_messages(value: Boolean): Self = this.set("can_send_other_messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCan_send_other_messages: Self = this.set("can_send_other_messages", js.undefined)
    @scala.inline
    def setUntil_date(value: Double): Self = this.set("until_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUntil_date: Self = this.set("until_date", js.undefined)
  }
  
}


package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatPermissions extends js.Object {
  var can_add_web_page_previews: js.UndefOr[Boolean] = js.native
  var can_change_info: js.UndefOr[Boolean] = js.native
  var can_invite_users: js.UndefOr[Boolean] = js.native
  var can_pin_messages: js.UndefOr[Boolean] = js.native
  var can_send_media_messages: js.UndefOr[Boolean] = js.native
  var can_send_messages: js.UndefOr[Boolean] = js.native
  var can_send_other_messages: js.UndefOr[Boolean] = js.native
  var can_send_polls: js.UndefOr[Boolean] = js.native
}

object ChatPermissions {
  @scala.inline
  def apply(): ChatPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatPermissions]
  }
  @scala.inline
  implicit class ChatPermissionsOps[Self <: ChatPermissions] (val x: Self) extends AnyVal {
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
    def setCan_change_info(value: Boolean): Self = this.set("can_change_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCan_change_info: Self = this.set("can_change_info", js.undefined)
    @scala.inline
    def setCan_invite_users(value: Boolean): Self = this.set("can_invite_users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCan_invite_users: Self = this.set("can_invite_users", js.undefined)
    @scala.inline
    def setCan_pin_messages(value: Boolean): Self = this.set("can_pin_messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCan_pin_messages: Self = this.set("can_pin_messages", js.undefined)
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
    def setCan_send_polls(value: Boolean): Self = this.set("can_send_polls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCan_send_polls: Self = this.set("can_send_polls", js.undefined)
  }
  
}


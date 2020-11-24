package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatMember extends js.Object {
  
  var can_add_web_page_previews: js.UndefOr[Boolean] = js.native
  
  var can_be_edited: js.UndefOr[Boolean] = js.native
  
  var can_change_info: js.UndefOr[Boolean] = js.native
  
  var can_delete_messages: js.UndefOr[Boolean] = js.native
  
  var can_edit_messages: js.UndefOr[Boolean] = js.native
  
  var can_invite_users: js.UndefOr[Boolean] = js.native
  
  var can_pin_messages: js.UndefOr[Boolean] = js.native
  
  var can_post_messages: js.UndefOr[Boolean] = js.native
  
  var can_promote_members: js.UndefOr[Boolean] = js.native
  
  var can_restrict_members: js.UndefOr[Boolean] = js.native
  
  var can_send_media_messages: js.UndefOr[Boolean] = js.native
  
  var can_send_messages: js.UndefOr[Boolean] = js.native
  
  var can_send_other_messages: js.UndefOr[Boolean] = js.native
  
  var can_send_polls: Boolean = js.native
  
  var is_member: js.UndefOr[Boolean] = js.native
  
  var status: ChatMemberStatus = js.native
  
  var until_date: js.UndefOr[Double] = js.native
  
  var user: User = js.native
}
object ChatMember {
  
  @scala.inline
  def apply(can_send_polls: Boolean, status: ChatMemberStatus, user: User): ChatMember = {
    val __obj = js.Dynamic.literal(can_send_polls = can_send_polls.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMember]
  }
  
  @scala.inline
  implicit class ChatMemberOps[Self <: ChatMember] (val x: Self) extends AnyVal {
    
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
    def setCan_send_polls(value: Boolean): Self = this.set("can_send_polls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ChatMemberStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_add_web_page_previews(value: Boolean): Self = this.set("can_add_web_page_previews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_add_web_page_previews: Self = this.set("can_add_web_page_previews", js.undefined)
    
    @scala.inline
    def setCan_be_edited(value: Boolean): Self = this.set("can_be_edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_be_edited: Self = this.set("can_be_edited", js.undefined)
    
    @scala.inline
    def setCan_change_info(value: Boolean): Self = this.set("can_change_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_change_info: Self = this.set("can_change_info", js.undefined)
    
    @scala.inline
    def setCan_delete_messages(value: Boolean): Self = this.set("can_delete_messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_delete_messages: Self = this.set("can_delete_messages", js.undefined)
    
    @scala.inline
    def setCan_edit_messages(value: Boolean): Self = this.set("can_edit_messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_edit_messages: Self = this.set("can_edit_messages", js.undefined)
    
    @scala.inline
    def setCan_invite_users(value: Boolean): Self = this.set("can_invite_users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_invite_users: Self = this.set("can_invite_users", js.undefined)
    
    @scala.inline
    def setCan_pin_messages(value: Boolean): Self = this.set("can_pin_messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_pin_messages: Self = this.set("can_pin_messages", js.undefined)
    
    @scala.inline
    def setCan_post_messages(value: Boolean): Self = this.set("can_post_messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_post_messages: Self = this.set("can_post_messages", js.undefined)
    
    @scala.inline
    def setCan_promote_members(value: Boolean): Self = this.set("can_promote_members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_promote_members: Self = this.set("can_promote_members", js.undefined)
    
    @scala.inline
    def setCan_restrict_members(value: Boolean): Self = this.set("can_restrict_members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_restrict_members: Self = this.set("can_restrict_members", js.undefined)
    
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
    def setIs_member(value: Boolean): Self = this.set("is_member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_member: Self = this.set("is_member", js.undefined)
    
    @scala.inline
    def setUntil_date(value: Double): Self = this.set("until_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUntil_date: Self = this.set("until_date", js.undefined)
  }
}

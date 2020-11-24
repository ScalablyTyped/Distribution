package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromoteChatMemberOptions extends js.Object {
  
  var can_change_info: js.UndefOr[Boolean] = js.native
  
  var can_delete_messages: js.UndefOr[Boolean] = js.native
  
  var can_edit_messages: js.UndefOr[Boolean] = js.native
  
  var can_invite_users: js.UndefOr[Boolean] = js.native
  
  var can_pin_messages: js.UndefOr[Boolean] = js.native
  
  var can_post_messages: js.UndefOr[Boolean] = js.native
  
  var can_promote_members: js.UndefOr[Boolean] = js.native
  
  var can_restrict_members: js.UndefOr[Boolean] = js.native
}
object PromoteChatMemberOptions {
  
  @scala.inline
  def apply(): PromoteChatMemberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromoteChatMemberOptions]
  }
  
  @scala.inline
  implicit class PromoteChatMemberOptionsOps[Self <: PromoteChatMemberOptions] (val x: Self) extends AnyVal {
    
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
  }
}

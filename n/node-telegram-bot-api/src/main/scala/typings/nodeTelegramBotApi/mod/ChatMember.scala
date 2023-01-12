package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMember extends StObject {
  
  var can_add_web_page_previews: js.UndefOr[Boolean] = js.undefined
  
  var can_be_edited: js.UndefOr[Boolean] = js.undefined
  
  var can_change_info: js.UndefOr[Boolean] = js.undefined
  
  var can_delete_messages: js.UndefOr[Boolean] = js.undefined
  
  var can_edit_messages: js.UndefOr[Boolean] = js.undefined
  
  var can_invite_users: js.UndefOr[Boolean] = js.undefined
  
  var can_pin_messages: js.UndefOr[Boolean] = js.undefined
  
  var can_post_messages: js.UndefOr[Boolean] = js.undefined
  
  var can_promote_members: js.UndefOr[Boolean] = js.undefined
  
  var can_restrict_members: js.UndefOr[Boolean] = js.undefined
  
  var can_send_media_messages: js.UndefOr[Boolean] = js.undefined
  
  var can_send_messages: js.UndefOr[Boolean] = js.undefined
  
  var can_send_other_messages: js.UndefOr[Boolean] = js.undefined
  
  var can_send_polls: js.UndefOr[Boolean] = js.undefined
  
  var is_member: js.UndefOr[Boolean] = js.undefined
  
  var status: ChatMemberStatus
  
  var until_date: js.UndefOr[Double] = js.undefined
  
  var user: User
}
object ChatMember {
  
  inline def apply(status: ChatMemberStatus, user: User): ChatMember = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatMember] (val x: Self) extends AnyVal {
    
    inline def setCan_add_web_page_previews(value: Boolean): Self = StObject.set(x, "can_add_web_page_previews", value.asInstanceOf[js.Any])
    
    inline def setCan_add_web_page_previewsUndefined: Self = StObject.set(x, "can_add_web_page_previews", js.undefined)
    
    inline def setCan_be_edited(value: Boolean): Self = StObject.set(x, "can_be_edited", value.asInstanceOf[js.Any])
    
    inline def setCan_be_editedUndefined: Self = StObject.set(x, "can_be_edited", js.undefined)
    
    inline def setCan_change_info(value: Boolean): Self = StObject.set(x, "can_change_info", value.asInstanceOf[js.Any])
    
    inline def setCan_change_infoUndefined: Self = StObject.set(x, "can_change_info", js.undefined)
    
    inline def setCan_delete_messages(value: Boolean): Self = StObject.set(x, "can_delete_messages", value.asInstanceOf[js.Any])
    
    inline def setCan_delete_messagesUndefined: Self = StObject.set(x, "can_delete_messages", js.undefined)
    
    inline def setCan_edit_messages(value: Boolean): Self = StObject.set(x, "can_edit_messages", value.asInstanceOf[js.Any])
    
    inline def setCan_edit_messagesUndefined: Self = StObject.set(x, "can_edit_messages", js.undefined)
    
    inline def setCan_invite_users(value: Boolean): Self = StObject.set(x, "can_invite_users", value.asInstanceOf[js.Any])
    
    inline def setCan_invite_usersUndefined: Self = StObject.set(x, "can_invite_users", js.undefined)
    
    inline def setCan_pin_messages(value: Boolean): Self = StObject.set(x, "can_pin_messages", value.asInstanceOf[js.Any])
    
    inline def setCan_pin_messagesUndefined: Self = StObject.set(x, "can_pin_messages", js.undefined)
    
    inline def setCan_post_messages(value: Boolean): Self = StObject.set(x, "can_post_messages", value.asInstanceOf[js.Any])
    
    inline def setCan_post_messagesUndefined: Self = StObject.set(x, "can_post_messages", js.undefined)
    
    inline def setCan_promote_members(value: Boolean): Self = StObject.set(x, "can_promote_members", value.asInstanceOf[js.Any])
    
    inline def setCan_promote_membersUndefined: Self = StObject.set(x, "can_promote_members", js.undefined)
    
    inline def setCan_restrict_members(value: Boolean): Self = StObject.set(x, "can_restrict_members", value.asInstanceOf[js.Any])
    
    inline def setCan_restrict_membersUndefined: Self = StObject.set(x, "can_restrict_members", js.undefined)
    
    inline def setCan_send_media_messages(value: Boolean): Self = StObject.set(x, "can_send_media_messages", value.asInstanceOf[js.Any])
    
    inline def setCan_send_media_messagesUndefined: Self = StObject.set(x, "can_send_media_messages", js.undefined)
    
    inline def setCan_send_messages(value: Boolean): Self = StObject.set(x, "can_send_messages", value.asInstanceOf[js.Any])
    
    inline def setCan_send_messagesUndefined: Self = StObject.set(x, "can_send_messages", js.undefined)
    
    inline def setCan_send_other_messages(value: Boolean): Self = StObject.set(x, "can_send_other_messages", value.asInstanceOf[js.Any])
    
    inline def setCan_send_other_messagesUndefined: Self = StObject.set(x, "can_send_other_messages", js.undefined)
    
    inline def setCan_send_polls(value: Boolean): Self = StObject.set(x, "can_send_polls", value.asInstanceOf[js.Any])
    
    inline def setCan_send_pollsUndefined: Self = StObject.set(x, "can_send_polls", js.undefined)
    
    inline def setIs_member(value: Boolean): Self = StObject.set(x, "is_member", value.asInstanceOf[js.Any])
    
    inline def setIs_memberUndefined: Self = StObject.set(x, "is_member", js.undefined)
    
    inline def setStatus(value: ChatMemberStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUntil_date(value: Double): Self = StObject.set(x, "until_date", value.asInstanceOf[js.Any])
    
    inline def setUntil_dateUndefined: Self = StObject.set(x, "until_date", js.undefined)
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}

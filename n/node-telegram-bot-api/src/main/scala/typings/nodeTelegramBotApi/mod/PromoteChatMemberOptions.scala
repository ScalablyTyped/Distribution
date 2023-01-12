package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromoteChatMemberOptions extends StObject {
  
  var can_change_info: js.UndefOr[Boolean] = js.undefined
  
  var can_delete_messages: js.UndefOr[Boolean] = js.undefined
  
  var can_edit_messages: js.UndefOr[Boolean] = js.undefined
  
  var can_invite_users: js.UndefOr[Boolean] = js.undefined
  
  var can_manage_video_chats: js.UndefOr[Boolean] = js.undefined
  
  var can_pin_messages: js.UndefOr[Boolean] = js.undefined
  
  var can_post_messages: js.UndefOr[Boolean] = js.undefined
  
  var can_promote_members: js.UndefOr[Boolean] = js.undefined
  
  var can_restrict_members: js.UndefOr[Boolean] = js.undefined
}
object PromoteChatMemberOptions {
  
  inline def apply(): PromoteChatMemberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromoteChatMemberOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PromoteChatMemberOptions] (val x: Self) extends AnyVal {
    
    inline def setCan_change_info(value: Boolean): Self = StObject.set(x, "can_change_info", value.asInstanceOf[js.Any])
    
    inline def setCan_change_infoUndefined: Self = StObject.set(x, "can_change_info", js.undefined)
    
    inline def setCan_delete_messages(value: Boolean): Self = StObject.set(x, "can_delete_messages", value.asInstanceOf[js.Any])
    
    inline def setCan_delete_messagesUndefined: Self = StObject.set(x, "can_delete_messages", js.undefined)
    
    inline def setCan_edit_messages(value: Boolean): Self = StObject.set(x, "can_edit_messages", value.asInstanceOf[js.Any])
    
    inline def setCan_edit_messagesUndefined: Self = StObject.set(x, "can_edit_messages", js.undefined)
    
    inline def setCan_invite_users(value: Boolean): Self = StObject.set(x, "can_invite_users", value.asInstanceOf[js.Any])
    
    inline def setCan_invite_usersUndefined: Self = StObject.set(x, "can_invite_users", js.undefined)
    
    inline def setCan_manage_video_chats(value: Boolean): Self = StObject.set(x, "can_manage_video_chats", value.asInstanceOf[js.Any])
    
    inline def setCan_manage_video_chatsUndefined: Self = StObject.set(x, "can_manage_video_chats", js.undefined)
    
    inline def setCan_pin_messages(value: Boolean): Self = StObject.set(x, "can_pin_messages", value.asInstanceOf[js.Any])
    
    inline def setCan_pin_messagesUndefined: Self = StObject.set(x, "can_pin_messages", js.undefined)
    
    inline def setCan_post_messages(value: Boolean): Self = StObject.set(x, "can_post_messages", value.asInstanceOf[js.Any])
    
    inline def setCan_post_messagesUndefined: Self = StObject.set(x, "can_post_messages", js.undefined)
    
    inline def setCan_promote_members(value: Boolean): Self = StObject.set(x, "can_promote_members", value.asInstanceOf[js.Any])
    
    inline def setCan_promote_membersUndefined: Self = StObject.set(x, "can_promote_members", js.undefined)
    
    inline def setCan_restrict_members(value: Boolean): Self = StObject.set(x, "can_restrict_members", value.asInstanceOf[js.Any])
    
    inline def setCan_restrict_membersUndefined: Self = StObject.set(x, "can_restrict_members", js.undefined)
  }
}

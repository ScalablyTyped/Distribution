package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatAdministratorRights extends StObject {
  
  var can_change_info: Boolean
  
  var can_delete_messages: Boolean
  
  var can_edit_messages: js.UndefOr[Boolean] = js.undefined
  
  var can_invite_users: Boolean
  
  var can_manage_chat: Boolean
  
  var can_manage_topics: js.UndefOr[Boolean] = js.undefined
  
  var can_manage_video_chats: Boolean
  
  var can_pin_messages: js.UndefOr[Boolean] = js.undefined
  
  var can_post_messages: js.UndefOr[Boolean] = js.undefined
  
  var can_promote_members: Boolean
  
  var can_restrict_members: Boolean
  
  var is_anonymous: Boolean
}
object ChatAdministratorRights {
  
  inline def apply(
    can_change_info: Boolean,
    can_delete_messages: Boolean,
    can_invite_users: Boolean,
    can_manage_chat: Boolean,
    can_manage_video_chats: Boolean,
    can_promote_members: Boolean,
    can_restrict_members: Boolean,
    is_anonymous: Boolean
  ): ChatAdministratorRights = {
    val __obj = js.Dynamic.literal(can_change_info = can_change_info.asInstanceOf[js.Any], can_delete_messages = can_delete_messages.asInstanceOf[js.Any], can_invite_users = can_invite_users.asInstanceOf[js.Any], can_manage_chat = can_manage_chat.asInstanceOf[js.Any], can_manage_video_chats = can_manage_video_chats.asInstanceOf[js.Any], can_promote_members = can_promote_members.asInstanceOf[js.Any], can_restrict_members = can_restrict_members.asInstanceOf[js.Any], is_anonymous = is_anonymous.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatAdministratorRights]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatAdministratorRights] (val x: Self) extends AnyVal {
    
    inline def setCan_change_info(value: Boolean): Self = StObject.set(x, "can_change_info", value.asInstanceOf[js.Any])
    
    inline def setCan_delete_messages(value: Boolean): Self = StObject.set(x, "can_delete_messages", value.asInstanceOf[js.Any])
    
    inline def setCan_edit_messages(value: Boolean): Self = StObject.set(x, "can_edit_messages", value.asInstanceOf[js.Any])
    
    inline def setCan_edit_messagesUndefined: Self = StObject.set(x, "can_edit_messages", js.undefined)
    
    inline def setCan_invite_users(value: Boolean): Self = StObject.set(x, "can_invite_users", value.asInstanceOf[js.Any])
    
    inline def setCan_manage_chat(value: Boolean): Self = StObject.set(x, "can_manage_chat", value.asInstanceOf[js.Any])
    
    inline def setCan_manage_topics(value: Boolean): Self = StObject.set(x, "can_manage_topics", value.asInstanceOf[js.Any])
    
    inline def setCan_manage_topicsUndefined: Self = StObject.set(x, "can_manage_topics", js.undefined)
    
    inline def setCan_manage_video_chats(value: Boolean): Self = StObject.set(x, "can_manage_video_chats", value.asInstanceOf[js.Any])
    
    inline def setCan_pin_messages(value: Boolean): Self = StObject.set(x, "can_pin_messages", value.asInstanceOf[js.Any])
    
    inline def setCan_pin_messagesUndefined: Self = StObject.set(x, "can_pin_messages", js.undefined)
    
    inline def setCan_post_messages(value: Boolean): Self = StObject.set(x, "can_post_messages", value.asInstanceOf[js.Any])
    
    inline def setCan_post_messagesUndefined: Self = StObject.set(x, "can_post_messages", js.undefined)
    
    inline def setCan_promote_members(value: Boolean): Self = StObject.set(x, "can_promote_members", value.asInstanceOf[js.Any])
    
    inline def setCan_restrict_members(value: Boolean): Self = StObject.set(x, "can_restrict_members", value.asInstanceOf[js.Any])
    
    inline def setIs_anonymous(value: Boolean): Self = StObject.set(x, "is_anonymous", value.asInstanceOf[js.Any])
  }
}

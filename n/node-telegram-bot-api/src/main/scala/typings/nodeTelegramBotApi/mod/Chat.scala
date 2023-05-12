package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chat extends StObject {
  
  var active_usernames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @deprecated since version Telegram Bot API 4.4 - July 29, 2019
    */
  var all_members_are_administrators: js.UndefOr[Boolean] = js.undefined
  
  var bio: js.UndefOr[String] = js.undefined
  
  var can_set_sticker_set: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var emoji_status_custom_emoji_id: js.UndefOr[String] = js.undefined
  
  var first_name: js.UndefOr[String] = js.undefined
  
  var has_aggressive_anti_spam_enabled: js.UndefOr[Boolean] = js.undefined
  
  var has_hidden_members: js.UndefOr[Boolean] = js.undefined
  
  var has_private_forwards: js.UndefOr[Boolean] = js.undefined
  
  var has_protected_content: js.UndefOr[Boolean] = js.undefined
  
  var has_restricted_voice_and_video_messages: js.UndefOr[Boolean] = js.undefined
  
  var id: Double
  
  var invite_link: js.UndefOr[String] = js.undefined
  
  var is_forum: js.UndefOr[Boolean] = js.undefined
  
  var join_by_request: js.UndefOr[Boolean] = js.undefined
  
  var join_to_send_messages: js.UndefOr[Boolean] = js.undefined
  
  var last_name: js.UndefOr[String] = js.undefined
  
  var linked_chat_id: js.UndefOr[Double] = js.undefined
  
  var location: js.UndefOr[ChatLocation] = js.undefined
  
  var message_auto_delete_time: js.UndefOr[Double] = js.undefined
  
  var permissions: js.UndefOr[ChatPermissions] = js.undefined
  
  var photo: js.UndefOr[ChatPhoto] = js.undefined
  
  var pinned_message: js.UndefOr[Message] = js.undefined
  
  var slow_mode_delay: js.UndefOr[Double] = js.undefined
  
  var sticker_set_name: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: ChatType
  
  var username: js.UndefOr[String] = js.undefined
}
object Chat {
  
  inline def apply(id: Double, `type`: ChatType): Chat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chat] (val x: Self) extends AnyVal {
    
    inline def setActive_usernames(value: js.Array[String]): Self = StObject.set(x, "active_usernames", value.asInstanceOf[js.Any])
    
    inline def setActive_usernamesUndefined: Self = StObject.set(x, "active_usernames", js.undefined)
    
    inline def setActive_usernamesVarargs(value: String*): Self = StObject.set(x, "active_usernames", js.Array(value*))
    
    inline def setAll_members_are_administrators(value: Boolean): Self = StObject.set(x, "all_members_are_administrators", value.asInstanceOf[js.Any])
    
    inline def setAll_members_are_administratorsUndefined: Self = StObject.set(x, "all_members_are_administrators", js.undefined)
    
    inline def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
    
    inline def setBioUndefined: Self = StObject.set(x, "bio", js.undefined)
    
    inline def setCan_set_sticker_set(value: Boolean): Self = StObject.set(x, "can_set_sticker_set", value.asInstanceOf[js.Any])
    
    inline def setCan_set_sticker_setUndefined: Self = StObject.set(x, "can_set_sticker_set", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEmoji_status_custom_emoji_id(value: String): Self = StObject.set(x, "emoji_status_custom_emoji_id", value.asInstanceOf[js.Any])
    
    inline def setEmoji_status_custom_emoji_idUndefined: Self = StObject.set(x, "emoji_status_custom_emoji_id", js.undefined)
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    inline def setHas_aggressive_anti_spam_enabled(value: Boolean): Self = StObject.set(x, "has_aggressive_anti_spam_enabled", value.asInstanceOf[js.Any])
    
    inline def setHas_aggressive_anti_spam_enabledUndefined: Self = StObject.set(x, "has_aggressive_anti_spam_enabled", js.undefined)
    
    inline def setHas_hidden_members(value: Boolean): Self = StObject.set(x, "has_hidden_members", value.asInstanceOf[js.Any])
    
    inline def setHas_hidden_membersUndefined: Self = StObject.set(x, "has_hidden_members", js.undefined)
    
    inline def setHas_private_forwards(value: Boolean): Self = StObject.set(x, "has_private_forwards", value.asInstanceOf[js.Any])
    
    inline def setHas_private_forwardsUndefined: Self = StObject.set(x, "has_private_forwards", js.undefined)
    
    inline def setHas_protected_content(value: Boolean): Self = StObject.set(x, "has_protected_content", value.asInstanceOf[js.Any])
    
    inline def setHas_protected_contentUndefined: Self = StObject.set(x, "has_protected_content", js.undefined)
    
    inline def setHas_restricted_voice_and_video_messages(value: Boolean): Self = StObject.set(x, "has_restricted_voice_and_video_messages", value.asInstanceOf[js.Any])
    
    inline def setHas_restricted_voice_and_video_messagesUndefined: Self = StObject.set(x, "has_restricted_voice_and_video_messages", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvite_link(value: String): Self = StObject.set(x, "invite_link", value.asInstanceOf[js.Any])
    
    inline def setInvite_linkUndefined: Self = StObject.set(x, "invite_link", js.undefined)
    
    inline def setIs_forum(value: Boolean): Self = StObject.set(x, "is_forum", value.asInstanceOf[js.Any])
    
    inline def setIs_forumUndefined: Self = StObject.set(x, "is_forum", js.undefined)
    
    inline def setJoin_by_request(value: Boolean): Self = StObject.set(x, "join_by_request", value.asInstanceOf[js.Any])
    
    inline def setJoin_by_requestUndefined: Self = StObject.set(x, "join_by_request", js.undefined)
    
    inline def setJoin_to_send_messages(value: Boolean): Self = StObject.set(x, "join_to_send_messages", value.asInstanceOf[js.Any])
    
    inline def setJoin_to_send_messagesUndefined: Self = StObject.set(x, "join_to_send_messages", js.undefined)
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    inline def setLinked_chat_id(value: Double): Self = StObject.set(x, "linked_chat_id", value.asInstanceOf[js.Any])
    
    inline def setLinked_chat_idUndefined: Self = StObject.set(x, "linked_chat_id", js.undefined)
    
    inline def setLocation(value: ChatLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMessage_auto_delete_time(value: Double): Self = StObject.set(x, "message_auto_delete_time", value.asInstanceOf[js.Any])
    
    inline def setMessage_auto_delete_timeUndefined: Self = StObject.set(x, "message_auto_delete_time", js.undefined)
    
    inline def setPermissions(value: ChatPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPhoto(value: ChatPhoto): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setPinned_message(value: Message): Self = StObject.set(x, "pinned_message", value.asInstanceOf[js.Any])
    
    inline def setPinned_messageUndefined: Self = StObject.set(x, "pinned_message", js.undefined)
    
    inline def setSlow_mode_delay(value: Double): Self = StObject.set(x, "slow_mode_delay", value.asInstanceOf[js.Any])
    
    inline def setSlow_mode_delayUndefined: Self = StObject.set(x, "slow_mode_delay", js.undefined)
    
    inline def setSticker_set_name(value: String): Self = StObject.set(x, "sticker_set_name", value.asInstanceOf[js.Any])
    
    inline def setSticker_set_nameUndefined: Self = StObject.set(x, "sticker_set_name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: ChatType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}

package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chat extends StObject {
  
  /**
    * @deprecated since version Telegram Bot API 4.4 - July 29, 2019
    */
  var all_members_are_administrators: js.UndefOr[Boolean] = js.undefined
  
  var can_set_sticker_set: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var first_name: js.UndefOr[String] = js.undefined
  
  var id: Double
  
  var invite_link: js.UndefOr[String] = js.undefined
  
  var last_name: js.UndefOr[String] = js.undefined
  
  var permissions: js.UndefOr[ChatPermissions] = js.undefined
  
  var photo: js.UndefOr[ChatPhoto] = js.undefined
  
  var pinned_message: js.UndefOr[Message] = js.undefined
  
  var sticker_set_name: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: ChatType
  
  var username: js.UndefOr[String] = js.undefined
}
object Chat {
  
  @scala.inline
  def apply(id: Double, `type`: ChatType): Chat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chat]
  }
  
  @scala.inline
  implicit class ChatMutableBuilder[Self <: Chat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll_members_are_administrators(value: Boolean): Self = StObject.set(x, "all_members_are_administrators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll_members_are_administratorsUndefined: Self = StObject.set(x, "all_members_are_administrators", js.undefined)
    
    @scala.inline
    def setCan_set_sticker_set(value: Boolean): Self = StObject.set(x, "can_set_sticker_set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_set_sticker_setUndefined: Self = StObject.set(x, "can_set_sticker_set", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvite_link(value: String): Self = StObject.set(x, "invite_link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvite_linkUndefined: Self = StObject.set(x, "invite_link", js.undefined)
    
    @scala.inline
    def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    @scala.inline
    def setPermissions(value: ChatPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPhoto(value: ChatPhoto): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    @scala.inline
    def setPinned_message(value: Message): Self = StObject.set(x, "pinned_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned_messageUndefined: Self = StObject.set(x, "pinned_message", js.undefined)
    
    @scala.inline
    def setSticker_set_name(value: String): Self = StObject.set(x, "sticker_set_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSticker_set_nameUndefined: Self = StObject.set(x, "sticker_set_name", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: ChatType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}

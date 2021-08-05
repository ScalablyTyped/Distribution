package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamMessagingSettings extends StObject {
  
  // If set to true, @channel mentions are allowed.
  var allowChannelMentions: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If set to true, owners can delete any message.
  var allowOwnerDeleteMessages: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If set to true, @team mentions are allowed.
  var allowTeamMentions: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If set to true, users can delete their messages.
  var allowUserDeleteMessages: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If set to true, users can edit their messages.
  var allowUserEditMessages: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object TeamMessagingSettings {
  
  inline def apply(): TeamMessagingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamMessagingSettings]
  }
  
  extension [Self <: TeamMessagingSettings](x: Self) {
    
    inline def setAllowChannelMentions(value: NullableOption[Boolean]): Self = StObject.set(x, "allowChannelMentions", value.asInstanceOf[js.Any])
    
    inline def setAllowChannelMentionsNull: Self = StObject.set(x, "allowChannelMentions", null)
    
    inline def setAllowChannelMentionsUndefined: Self = StObject.set(x, "allowChannelMentions", js.undefined)
    
    inline def setAllowOwnerDeleteMessages(value: NullableOption[Boolean]): Self = StObject.set(x, "allowOwnerDeleteMessages", value.asInstanceOf[js.Any])
    
    inline def setAllowOwnerDeleteMessagesNull: Self = StObject.set(x, "allowOwnerDeleteMessages", null)
    
    inline def setAllowOwnerDeleteMessagesUndefined: Self = StObject.set(x, "allowOwnerDeleteMessages", js.undefined)
    
    inline def setAllowTeamMentions(value: NullableOption[Boolean]): Self = StObject.set(x, "allowTeamMentions", value.asInstanceOf[js.Any])
    
    inline def setAllowTeamMentionsNull: Self = StObject.set(x, "allowTeamMentions", null)
    
    inline def setAllowTeamMentionsUndefined: Self = StObject.set(x, "allowTeamMentions", js.undefined)
    
    inline def setAllowUserDeleteMessages(value: NullableOption[Boolean]): Self = StObject.set(x, "allowUserDeleteMessages", value.asInstanceOf[js.Any])
    
    inline def setAllowUserDeleteMessagesNull: Self = StObject.set(x, "allowUserDeleteMessages", null)
    
    inline def setAllowUserDeleteMessagesUndefined: Self = StObject.set(x, "allowUserDeleteMessages", js.undefined)
    
    inline def setAllowUserEditMessages(value: NullableOption[Boolean]): Self = StObject.set(x, "allowUserEditMessages", value.asInstanceOf[js.Any])
    
    inline def setAllowUserEditMessagesNull: Self = StObject.set(x, "allowUserEditMessages", null)
    
    inline def setAllowUserEditMessagesUndefined: Self = StObject.set(x, "allowUserEditMessages", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamMessagingSettings extends StObject {
  
  // If set to true, @channel mentions are allowed.
  var allowChannelMentions: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // If set to true, owners can delete any message.
  var allowOwnerDeleteMessages: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // If set to true, @team mentions are allowed.
  var allowTeamMentions: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // If set to true, users can delete their messages.
  var allowUserDeleteMessages: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // If set to true, users can edit their messages.
  var allowUserEditMessages: js.UndefOr[NullableOption[Boolean]] = js.native
}
object TeamMessagingSettings {
  
  @scala.inline
  def apply(): TeamMessagingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamMessagingSettings]
  }
  
  @scala.inline
  implicit class TeamMessagingSettingsMutableBuilder[Self <: TeamMessagingSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowChannelMentions(value: NullableOption[Boolean]): Self = StObject.set(x, "allowChannelMentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowChannelMentionsNull: Self = StObject.set(x, "allowChannelMentions", null)
    
    @scala.inline
    def setAllowChannelMentionsUndefined: Self = StObject.set(x, "allowChannelMentions", js.undefined)
    
    @scala.inline
    def setAllowOwnerDeleteMessages(value: NullableOption[Boolean]): Self = StObject.set(x, "allowOwnerDeleteMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOwnerDeleteMessagesNull: Self = StObject.set(x, "allowOwnerDeleteMessages", null)
    
    @scala.inline
    def setAllowOwnerDeleteMessagesUndefined: Self = StObject.set(x, "allowOwnerDeleteMessages", js.undefined)
    
    @scala.inline
    def setAllowTeamMentions(value: NullableOption[Boolean]): Self = StObject.set(x, "allowTeamMentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTeamMentionsNull: Self = StObject.set(x, "allowTeamMentions", null)
    
    @scala.inline
    def setAllowTeamMentionsUndefined: Self = StObject.set(x, "allowTeamMentions", js.undefined)
    
    @scala.inline
    def setAllowUserDeleteMessages(value: NullableOption[Boolean]): Self = StObject.set(x, "allowUserDeleteMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUserDeleteMessagesNull: Self = StObject.set(x, "allowUserDeleteMessages", null)
    
    @scala.inline
    def setAllowUserDeleteMessagesUndefined: Self = StObject.set(x, "allowUserDeleteMessages", js.undefined)
    
    @scala.inline
    def setAllowUserEditMessages(value: NullableOption[Boolean]): Self = StObject.set(x, "allowUserEditMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUserEditMessagesNull: Self = StObject.set(x, "allowUserEditMessages", null)
    
    @scala.inline
    def setAllowUserEditMessagesUndefined: Self = StObject.set(x, "allowUserEditMessages", js.undefined)
  }
}

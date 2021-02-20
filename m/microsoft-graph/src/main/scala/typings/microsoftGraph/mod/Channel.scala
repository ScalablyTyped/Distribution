package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends Entity {
  
  // Optional textual description for the channel.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Channel name as it will appear to the user in Microsoft Teams.
  var displayName: js.UndefOr[String] = js.native
  
  // The email address for sending messages to the channel. Read-only.
  var email: js.UndefOr[NullableOption[String]] = js.native
  
  // Metadata for the location where the channel's files are stored.
  var filesFolder: js.UndefOr[NullableOption[DriveItem]] = js.native
  
  /**
    * Indicates whether the channel should automatically be marked 'favorite' for all members of the team. Can only be set
    * programmatically with Create team. Default: false.
    */
  var isFavoriteByDefault: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var members: js.UndefOr[NullableOption[js.Array[ConversationMember]]] = js.native
  
  var membershipType: js.UndefOr[NullableOption[ChannelMembershipType]] = js.native
  
  // A collection of all the messages in the channel. A navigation property. Nullable.
  var messages: js.UndefOr[NullableOption[js.Array[ChatMessage]]] = js.native
  
  // A collection of all the tabs in the channel. A navigation property.
  var tabs: js.UndefOr[NullableOption[js.Array[TeamsTab]]] = js.native
  
  /**
    * A hyperlink that will go to the channel in Microsoft Teams. This is the URL that you get when you right-click a channel
    * in Microsoft Teams and select Get link to channel. This URL should be treated as an opaque blob, and not parsed.
    * Read-only.
    */
  var webUrl: js.UndefOr[NullableOption[String]] = js.native
}
object Channel {
  
  @scala.inline
  def apply(): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: NullableOption[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNull: Self = StObject.set(x, "email", null)
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFilesFolder(value: NullableOption[DriveItem]): Self = StObject.set(x, "filesFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesFolderNull: Self = StObject.set(x, "filesFolder", null)
    
    @scala.inline
    def setFilesFolderUndefined: Self = StObject.set(x, "filesFolder", js.undefined)
    
    @scala.inline
    def setIsFavoriteByDefault(value: NullableOption[Boolean]): Self = StObject.set(x, "isFavoriteByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFavoriteByDefaultNull: Self = StObject.set(x, "isFavoriteByDefault", null)
    
    @scala.inline
    def setIsFavoriteByDefaultUndefined: Self = StObject.set(x, "isFavoriteByDefault", js.undefined)
    
    @scala.inline
    def setMembers(value: NullableOption[js.Array[ConversationMember]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersNull: Self = StObject.set(x, "members", null)
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: ConversationMember*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setMembershipType(value: NullableOption[ChannelMembershipType]): Self = StObject.set(x, "membershipType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipTypeNull: Self = StObject.set(x, "membershipType", null)
    
    @scala.inline
    def setMembershipTypeUndefined: Self = StObject.set(x, "membershipType", js.undefined)
    
    @scala.inline
    def setMessages(value: NullableOption[js.Array[ChatMessage]]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesNull: Self = StObject.set(x, "messages", null)
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: ChatMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: NullableOption[js.Array[TeamsTab]]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsNull: Self = StObject.set(x, "tabs", null)
    
    @scala.inline
    def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    @scala.inline
    def setTabsVarargs(value: TeamsTab*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    
    @scala.inline
    def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    @scala.inline
    def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}

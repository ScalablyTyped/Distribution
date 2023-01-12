package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel
  extends StObject
     with Entity {
  
  // Read only. Timestamp at which the channel was created.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Optional textual description for the channel.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Channel name as it will appear to the user in Microsoft Teams.
  var displayName: js.UndefOr[String] = js.undefined
  
  // The email address for sending messages to the channel. Read-only.
  var email: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Metadata for the location where the channel's files are stored.
  var filesFolder: js.UndefOr[NullableOption[DriveItem]] = js.undefined
  
  /**
    * Indicates whether the channel should automatically be marked 'favorite' for all members of the team. Can only be set
    * programmatically with Create team. Default: false.
    */
  var isFavoriteByDefault: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // A collection of membership records associated with the channel.
  var members: js.UndefOr[NullableOption[js.Array[ConversationMember]]] = js.undefined
  
  /**
    * The type of the channel. Can be set during creation and can't be changed. The possible values are: standard, private,
    * unknownFutureValue, shared. The default value is standard. Note that you must use the Prefer:
    * include-unknown-enum-members request header to get the following value in this evolvable enum: shared.
    */
  var membershipType: js.UndefOr[NullableOption[ChannelMembershipType]] = js.undefined
  
  // A collection of all the messages in the channel. A navigation property. Nullable.
  var messages: js.UndefOr[NullableOption[js.Array[ChatMessage]]] = js.undefined
  
  // A collection of teams with which a channel is shared.
  var sharedWithTeams: js.UndefOr[NullableOption[js.Array[SharedWithChannelTeamInfo]]] = js.undefined
  
  // A collection of all the tabs in the channel. A navigation property.
  var tabs: js.UndefOr[NullableOption[js.Array[TeamsTab]]] = js.undefined
  
  // The ID of the Azure Active Directory tenant.
  var tenantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A hyperlink that will go to the channel in Microsoft Teams. This is the URL that you get when you right-click a channel
    * in Microsoft Teams and select Get link to channel. This URL should be treated as an opaque blob, and not parsed.
    * Read-only.
    */
  var webUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object Channel {
  
  inline def apply(): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: NullableOption[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFilesFolder(value: NullableOption[DriveItem]): Self = StObject.set(x, "filesFolder", value.asInstanceOf[js.Any])
    
    inline def setFilesFolderNull: Self = StObject.set(x, "filesFolder", null)
    
    inline def setFilesFolderUndefined: Self = StObject.set(x, "filesFolder", js.undefined)
    
    inline def setIsFavoriteByDefault(value: NullableOption[Boolean]): Self = StObject.set(x, "isFavoriteByDefault", value.asInstanceOf[js.Any])
    
    inline def setIsFavoriteByDefaultNull: Self = StObject.set(x, "isFavoriteByDefault", null)
    
    inline def setIsFavoriteByDefaultUndefined: Self = StObject.set(x, "isFavoriteByDefault", js.undefined)
    
    inline def setMembers(value: NullableOption[js.Array[ConversationMember]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: ConversationMember*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setMembershipType(value: NullableOption[ChannelMembershipType]): Self = StObject.set(x, "membershipType", value.asInstanceOf[js.Any])
    
    inline def setMembershipTypeNull: Self = StObject.set(x, "membershipType", null)
    
    inline def setMembershipTypeUndefined: Self = StObject.set(x, "membershipType", js.undefined)
    
    inline def setMessages(value: NullableOption[js.Array[ChatMessage]]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesNull: Self = StObject.set(x, "messages", null)
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: ChatMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setSharedWithTeams(value: NullableOption[js.Array[SharedWithChannelTeamInfo]]): Self = StObject.set(x, "sharedWithTeams", value.asInstanceOf[js.Any])
    
    inline def setSharedWithTeamsNull: Self = StObject.set(x, "sharedWithTeams", null)
    
    inline def setSharedWithTeamsUndefined: Self = StObject.set(x, "sharedWithTeams", js.undefined)
    
    inline def setSharedWithTeamsVarargs(value: SharedWithChannelTeamInfo*): Self = StObject.set(x, "sharedWithTeams", js.Array(value*))
    
    inline def setTabs(value: NullableOption[js.Array[TeamsTab]]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsNull: Self = StObject.set(x, "tabs", null)
    
    inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    inline def setTabsVarargs(value: TeamsTab*): Self = StObject.set(x, "tabs", js.Array(value*))
    
    inline def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}

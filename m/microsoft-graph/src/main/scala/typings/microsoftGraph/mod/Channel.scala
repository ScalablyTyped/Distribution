package typings.microsoftGraph.mod

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
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: NullableOption[String]): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEmailNull: Self = this.set("email", null)
    
    @scala.inline
    def setFilesFolder(value: NullableOption[DriveItem]): Self = this.set("filesFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilesFolder: Self = this.set("filesFolder", js.undefined)
    
    @scala.inline
    def setFilesFolderNull: Self = this.set("filesFolder", null)
    
    @scala.inline
    def setIsFavoriteByDefault(value: NullableOption[Boolean]): Self = this.set("isFavoriteByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFavoriteByDefault: Self = this.set("isFavoriteByDefault", js.undefined)
    
    @scala.inline
    def setIsFavoriteByDefaultNull: Self = this.set("isFavoriteByDefault", null)
    
    @scala.inline
    def setMembersVarargs(value: ConversationMember*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: NullableOption[js.Array[ConversationMember]]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    
    @scala.inline
    def setMembersNull: Self = this.set("members", null)
    
    @scala.inline
    def setMembershipType(value: NullableOption[ChannelMembershipType]): Self = this.set("membershipType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembershipType: Self = this.set("membershipType", js.undefined)
    
    @scala.inline
    def setMembershipTypeNull: Self = this.set("membershipType", null)
    
    @scala.inline
    def setMessagesVarargs(value: ChatMessage*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: NullableOption[js.Array[ChatMessage]]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMessagesNull: Self = this.set("messages", null)
    
    @scala.inline
    def setTabsVarargs(value: TeamsTab*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: NullableOption[js.Array[TeamsTab]]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    
    @scala.inline
    def setTabsNull: Self = this.set("tabs", null)
    
    @scala.inline
    def setWebUrl(value: NullableOption[String]): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
    
    @scala.inline
    def setWebUrlNull: Self = this.set("webUrl", null)
  }
}

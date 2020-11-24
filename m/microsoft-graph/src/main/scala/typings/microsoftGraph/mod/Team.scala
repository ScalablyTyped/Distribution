package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Team extends Entity {
  
  // The collection of channels &amp; messages associated with the team.
  var channels: js.UndefOr[NullableOption[js.Array[Channel]]] = js.native
  
  /**
    * An optional label. Typically describes the data or business sensitivity of the team. Must match one of a pre-configured
    * set in the tenant's directory.
    */
  var classification: js.UndefOr[NullableOption[String]] = js.native
  
  // An optional description for the team.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // The name of the team.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Settings to configure use of Giphy, memes, and stickers in the team.
  var funSettings: js.UndefOr[NullableOption[TeamFunSettings]] = js.native
  
  var group: js.UndefOr[NullableOption[Group]] = js.native
  
  // Settings to configure whether guests can create, update, or delete channels in the team.
  var guestSettings: js.UndefOr[NullableOption[TeamGuestSettings]] = js.native
  
  // The apps installed in this team.
  var installedApps: js.UndefOr[NullableOption[js.Array[TeamsAppInstallation]]] = js.native
  
  // A unique ID for the team that has been used in a few places such as the audit log/Office 365 Management Activity API.
  var internalId: js.UndefOr[NullableOption[String]] = js.native
  
  // Whether this team is in read-only mode.
  var isArchived: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Settings to configure whether members can perform certain actions, for example, create channels and add bots, in the
    * team.
    */
  var memberSettings: js.UndefOr[NullableOption[TeamMemberSettings]] = js.native
  
  // Members and owners of the team.
  var members: js.UndefOr[NullableOption[js.Array[ConversationMember]]] = js.native
  
  // Settings to configure messaging and mentions in the team.
  var messagingSettings: js.UndefOr[NullableOption[TeamMessagingSettings]] = js.native
  
  // The async operations that ran or are running on this team.
  var operations: js.UndefOr[NullableOption[js.Array[TeamsAsyncOperation]]] = js.native
  
  // The general channel for the team.
  var primaryChannel: js.UndefOr[NullableOption[Channel]] = js.native
  
  // The schedule of shifts for this team.
  var schedule: js.UndefOr[NullableOption[Schedule]] = js.native
  
  /**
    * Optional. Indicates whether the team is intended for a particular use case. Each team specialization has access to
    * unique behaviors and experiences targeted to its use case.
    */
  var specialization: js.UndefOr[NullableOption[TeamSpecialization]] = js.native
  
  // The template this team was created from. See available templates.
  var template: js.UndefOr[NullableOption[TeamsTemplate]] = js.native
  
  // The visibility of the group and team. Defaults to Public.
  var visibility: js.UndefOr[NullableOption[TeamVisibilityType]] = js.native
  
  /**
    * A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that you get when you right-click a
    * team in the Microsoft Teams client and select Get link to team. This URL should be treated as an opaque blob, and not
    * parsed.
    */
  var webUrl: js.UndefOr[NullableOption[String]] = js.native
}
object Team {
  
  @scala.inline
  def apply(): Team = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Team]
  }
  
  @scala.inline
  implicit class TeamOps[Self <: Team] (val x: Self) extends AnyVal {
    
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
    def setChannelsVarargs(value: Channel*): Self = this.set("channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: NullableOption[js.Array[Channel]]): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    
    @scala.inline
    def setChannelsNull: Self = this.set("channels", null)
    
    @scala.inline
    def setClassification(value: NullableOption[String]): Self = this.set("classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassification: Self = this.set("classification", js.undefined)
    
    @scala.inline
    def setClassificationNull: Self = this.set("classification", null)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setFunSettings(value: NullableOption[TeamFunSettings]): Self = this.set("funSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunSettings: Self = this.set("funSettings", js.undefined)
    
    @scala.inline
    def setFunSettingsNull: Self = this.set("funSettings", null)
    
    @scala.inline
    def setGroup(value: NullableOption[Group]): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setGroupNull: Self = this.set("group", null)
    
    @scala.inline
    def setGuestSettings(value: NullableOption[TeamGuestSettings]): Self = this.set("guestSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuestSettings: Self = this.set("guestSettings", js.undefined)
    
    @scala.inline
    def setGuestSettingsNull: Self = this.set("guestSettings", null)
    
    @scala.inline
    def setInstalledAppsVarargs(value: TeamsAppInstallation*): Self = this.set("installedApps", js.Array(value :_*))
    
    @scala.inline
    def setInstalledApps(value: NullableOption[js.Array[TeamsAppInstallation]]): Self = this.set("installedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstalledApps: Self = this.set("installedApps", js.undefined)
    
    @scala.inline
    def setInstalledAppsNull: Self = this.set("installedApps", null)
    
    @scala.inline
    def setInternalId(value: NullableOption[String]): Self = this.set("internalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalId: Self = this.set("internalId", js.undefined)
    
    @scala.inline
    def setInternalIdNull: Self = this.set("internalId", null)
    
    @scala.inline
    def setIsArchived(value: NullableOption[Boolean]): Self = this.set("isArchived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsArchived: Self = this.set("isArchived", js.undefined)
    
    @scala.inline
    def setIsArchivedNull: Self = this.set("isArchived", null)
    
    @scala.inline
    def setMemberSettings(value: NullableOption[TeamMemberSettings]): Self = this.set("memberSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberSettings: Self = this.set("memberSettings", js.undefined)
    
    @scala.inline
    def setMemberSettingsNull: Self = this.set("memberSettings", null)
    
    @scala.inline
    def setMembersVarargs(value: ConversationMember*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: NullableOption[js.Array[ConversationMember]]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    
    @scala.inline
    def setMembersNull: Self = this.set("members", null)
    
    @scala.inline
    def setMessagingSettings(value: NullableOption[TeamMessagingSettings]): Self = this.set("messagingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessagingSettings: Self = this.set("messagingSettings", js.undefined)
    
    @scala.inline
    def setMessagingSettingsNull: Self = this.set("messagingSettings", null)
    
    @scala.inline
    def setOperationsVarargs(value: TeamsAsyncOperation*): Self = this.set("operations", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: NullableOption[js.Array[TeamsAsyncOperation]]): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
    
    @scala.inline
    def setOperationsNull: Self = this.set("operations", null)
    
    @scala.inline
    def setPrimaryChannel(value: NullableOption[Channel]): Self = this.set("primaryChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryChannel: Self = this.set("primaryChannel", js.undefined)
    
    @scala.inline
    def setPrimaryChannelNull: Self = this.set("primaryChannel", null)
    
    @scala.inline
    def setSchedule(value: NullableOption[Schedule]): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    
    @scala.inline
    def setScheduleNull: Self = this.set("schedule", null)
    
    @scala.inline
    def setSpecialization(value: NullableOption[TeamSpecialization]): Self = this.set("specialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecialization: Self = this.set("specialization", js.undefined)
    
    @scala.inline
    def setSpecializationNull: Self = this.set("specialization", null)
    
    @scala.inline
    def setTemplate(value: NullableOption[TeamsTemplate]): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateNull: Self = this.set("template", null)
    
    @scala.inline
    def setVisibility(value: NullableOption[TeamVisibilityType]): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    
    @scala.inline
    def setVisibilityNull: Self = this.set("visibility", null)
    
    @scala.inline
    def setWebUrl(value: NullableOption[String]): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
    
    @scala.inline
    def setWebUrlNull: Self = this.set("webUrl", null)
  }
}

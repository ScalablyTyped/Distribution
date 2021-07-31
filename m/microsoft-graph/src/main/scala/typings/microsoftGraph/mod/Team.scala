package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Team
  extends StObject
     with Entity {
  
  // The collection of channels &amp; messages associated with the team.
  var channels: js.UndefOr[NullableOption[js.Array[Channel]]] = js.undefined
  
  /**
    * An optional label. Typically describes the data or business sensitivity of the team. Must match one of a pre-configured
    * set in the tenant's directory.
    */
  var classification: js.UndefOr[NullableOption[String]] = js.undefined
  
  // An optional description for the team.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the team.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Settings to configure use of Giphy, memes, and stickers in the team.
  var funSettings: js.UndefOr[NullableOption[TeamFunSettings]] = js.undefined
  
  var group: js.UndefOr[NullableOption[Group]] = js.undefined
  
  // Settings to configure whether guests can create, update, or delete channels in the team.
  var guestSettings: js.UndefOr[NullableOption[TeamGuestSettings]] = js.undefined
  
  // The apps installed in this team.
  var installedApps: js.UndefOr[NullableOption[js.Array[TeamsAppInstallation]]] = js.undefined
  
  // A unique ID for the team that has been used in a few places such as the audit log/Office 365 Management Activity API.
  var internalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Whether this team is in read-only mode.
  var isArchived: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Settings to configure whether members can perform certain actions, for example, create channels and add bots, in the
    * team.
    */
  var memberSettings: js.UndefOr[NullableOption[TeamMemberSettings]] = js.undefined
  
  // Members and owners of the team.
  var members: js.UndefOr[NullableOption[js.Array[ConversationMember]]] = js.undefined
  
  // Settings to configure messaging and mentions in the team.
  var messagingSettings: js.UndefOr[NullableOption[TeamMessagingSettings]] = js.undefined
  
  // The async operations that ran or are running on this team.
  var operations: js.UndefOr[NullableOption[js.Array[TeamsAsyncOperation]]] = js.undefined
  
  // The general channel for the team.
  var primaryChannel: js.UndefOr[NullableOption[Channel]] = js.undefined
  
  // The schedule of shifts for this team.
  var schedule: js.UndefOr[NullableOption[Schedule]] = js.undefined
  
  /**
    * Optional. Indicates whether the team is intended for a particular use case. Each team specialization has access to
    * unique behaviors and experiences targeted to its use case.
    */
  var specialization: js.UndefOr[NullableOption[TeamSpecialization]] = js.undefined
  
  // The template this team was created from. See available templates.
  var template: js.UndefOr[NullableOption[TeamsTemplate]] = js.undefined
  
  // The visibility of the group and team. Defaults to Public.
  var visibility: js.UndefOr[NullableOption[TeamVisibilityType]] = js.undefined
  
  /**
    * A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that you get when you right-click a
    * team in the Microsoft Teams client and select Get link to team. This URL should be treated as an opaque blob, and not
    * parsed.
    */
  var webUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object Team {
  
  @scala.inline
  def apply(): Team = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Team]
  }
  
  @scala.inline
  implicit class TeamMutableBuilder[Self <: Team] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: NullableOption[js.Array[Channel]]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsNull: Self = StObject.set(x, "channels", null)
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setClassification(value: NullableOption[String]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationNull: Self = StObject.set(x, "classification", null)
    
    @scala.inline
    def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFunSettings(value: NullableOption[TeamFunSettings]): Self = StObject.set(x, "funSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunSettingsNull: Self = StObject.set(x, "funSettings", null)
    
    @scala.inline
    def setFunSettingsUndefined: Self = StObject.set(x, "funSettings", js.undefined)
    
    @scala.inline
    def setGroup(value: NullableOption[Group]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNull: Self = StObject.set(x, "group", null)
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setGuestSettings(value: NullableOption[TeamGuestSettings]): Self = StObject.set(x, "guestSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestSettingsNull: Self = StObject.set(x, "guestSettings", null)
    
    @scala.inline
    def setGuestSettingsUndefined: Self = StObject.set(x, "guestSettings", js.undefined)
    
    @scala.inline
    def setInstalledApps(value: NullableOption[js.Array[TeamsAppInstallation]]): Self = StObject.set(x, "installedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledAppsNull: Self = StObject.set(x, "installedApps", null)
    
    @scala.inline
    def setInstalledAppsUndefined: Self = StObject.set(x, "installedApps", js.undefined)
    
    @scala.inline
    def setInstalledAppsVarargs(value: TeamsAppInstallation*): Self = StObject.set(x, "installedApps", js.Array(value :_*))
    
    @scala.inline
    def setInternalId(value: NullableOption[String]): Self = StObject.set(x, "internalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalIdNull: Self = StObject.set(x, "internalId", null)
    
    @scala.inline
    def setInternalIdUndefined: Self = StObject.set(x, "internalId", js.undefined)
    
    @scala.inline
    def setIsArchived(value: NullableOption[Boolean]): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsArchivedNull: Self = StObject.set(x, "isArchived", null)
    
    @scala.inline
    def setIsArchivedUndefined: Self = StObject.set(x, "isArchived", js.undefined)
    
    @scala.inline
    def setMemberSettings(value: NullableOption[TeamMemberSettings]): Self = StObject.set(x, "memberSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberSettingsNull: Self = StObject.set(x, "memberSettings", null)
    
    @scala.inline
    def setMemberSettingsUndefined: Self = StObject.set(x, "memberSettings", js.undefined)
    
    @scala.inline
    def setMembers(value: NullableOption[js.Array[ConversationMember]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersNull: Self = StObject.set(x, "members", null)
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: ConversationMember*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setMessagingSettings(value: NullableOption[TeamMessagingSettings]): Self = StObject.set(x, "messagingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagingSettingsNull: Self = StObject.set(x, "messagingSettings", null)
    
    @scala.inline
    def setMessagingSettingsUndefined: Self = StObject.set(x, "messagingSettings", js.undefined)
    
    @scala.inline
    def setOperations(value: NullableOption[js.Array[TeamsAsyncOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: TeamsAsyncOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
    
    @scala.inline
    def setPrimaryChannel(value: NullableOption[Channel]): Self = StObject.set(x, "primaryChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryChannelNull: Self = StObject.set(x, "primaryChannel", null)
    
    @scala.inline
    def setPrimaryChannelUndefined: Self = StObject.set(x, "primaryChannel", js.undefined)
    
    @scala.inline
    def setSchedule(value: NullableOption[Schedule]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleNull: Self = StObject.set(x, "schedule", null)
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setSpecialization(value: NullableOption[TeamSpecialization]): Self = StObject.set(x, "specialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecializationNull: Self = StObject.set(x, "specialization", null)
    
    @scala.inline
    def setSpecializationUndefined: Self = StObject.set(x, "specialization", js.undefined)
    
    @scala.inline
    def setTemplate(value: NullableOption[TeamsTemplate]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNull: Self = StObject.set(x, "template", null)
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setVisibility(value: NullableOption[TeamVisibilityType]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityNull: Self = StObject.set(x, "visibility", null)
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    @scala.inline
    def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    @scala.inline
    def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}

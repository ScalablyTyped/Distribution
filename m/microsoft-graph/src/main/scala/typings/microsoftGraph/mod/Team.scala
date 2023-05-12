package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Team
  extends StObject
     with Entity {
  
  // List of channels either hosted in or shared with the team (incoming channels).
  var allChannels: js.UndefOr[NullableOption[js.Array[Channel]]] = js.undefined
  
  // The collection of channels and messages associated with the team.
  var channels: js.UndefOr[NullableOption[js.Array[Channel]]] = js.undefined
  
  /**
    * An optional label. Typically describes the data or business sensitivity of the team. Must match one of a pre-configured
    * set in the tenant's directory.
    */
  var classification: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Timestamp at which the team was created.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // An optional description for the team. Maximum length: 1024 characters.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the team.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Settings to configure use of Giphy, memes, and stickers in the team.
  var funSettings: js.UndefOr[NullableOption[TeamFunSettings]] = js.undefined
  
  var group: js.UndefOr[NullableOption[Group]] = js.undefined
  
  // Settings to configure whether guests can create, update, or delete channels in the team.
  var guestSettings: js.UndefOr[NullableOption[TeamGuestSettings]] = js.undefined
  
  // List of channels shared with the team.
  var incomingChannels: js.UndefOr[NullableOption[js.Array[Channel]]] = js.undefined
  
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
  
  // The profile photo for the team.
  var photo: js.UndefOr[NullableOption[ProfilePhoto]] = js.undefined
  
  // The general channel for the team.
  var primaryChannel: js.UndefOr[NullableOption[Channel]] = js.undefined
  
  // The schedule of shifts for this team.
  var schedule: js.UndefOr[NullableOption[Schedule]] = js.undefined
  
  /**
    * Optional. Indicates whether the team is intended for a particular use case. Each team specialization has access to
    * unique behaviors and experiences targeted to its use case.
    */
  var specialization: js.UndefOr[NullableOption[TeamSpecialization]] = js.undefined
  
  // Contains summary information about the team, including number of owners, members, and guests.
  var summary: js.UndefOr[NullableOption[TeamSummary]] = js.undefined
  
  // The tags associated with the team.
  var tags: js.UndefOr[NullableOption[js.Array[TeamworkTag]]] = js.undefined
  
  // The template this team was created from. See available templates.
  var template: js.UndefOr[NullableOption[TeamsTemplate]] = js.undefined
  
  // The ID of the Azure Active Directory tenant.
  var tenantId: js.UndefOr[NullableOption[String]] = js.undefined
  
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
  
  inline def apply(): Team = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Team]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Team] (val x: Self) extends AnyVal {
    
    inline def setAllChannels(value: NullableOption[js.Array[Channel]]): Self = StObject.set(x, "allChannels", value.asInstanceOf[js.Any])
    
    inline def setAllChannelsNull: Self = StObject.set(x, "allChannels", null)
    
    inline def setAllChannelsUndefined: Self = StObject.set(x, "allChannels", js.undefined)
    
    inline def setAllChannelsVarargs(value: Channel*): Self = StObject.set(x, "allChannels", js.Array(value*))
    
    inline def setChannels(value: NullableOption[js.Array[Channel]]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsNull: Self = StObject.set(x, "channels", null)
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setClassification(value: NullableOption[String]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationNull: Self = StObject.set(x, "classification", null)
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFunSettings(value: NullableOption[TeamFunSettings]): Self = StObject.set(x, "funSettings", value.asInstanceOf[js.Any])
    
    inline def setFunSettingsNull: Self = StObject.set(x, "funSettings", null)
    
    inline def setFunSettingsUndefined: Self = StObject.set(x, "funSettings", js.undefined)
    
    inline def setGroup(value: NullableOption[Group]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGuestSettings(value: NullableOption[TeamGuestSettings]): Self = StObject.set(x, "guestSettings", value.asInstanceOf[js.Any])
    
    inline def setGuestSettingsNull: Self = StObject.set(x, "guestSettings", null)
    
    inline def setGuestSettingsUndefined: Self = StObject.set(x, "guestSettings", js.undefined)
    
    inline def setIncomingChannels(value: NullableOption[js.Array[Channel]]): Self = StObject.set(x, "incomingChannels", value.asInstanceOf[js.Any])
    
    inline def setIncomingChannelsNull: Self = StObject.set(x, "incomingChannels", null)
    
    inline def setIncomingChannelsUndefined: Self = StObject.set(x, "incomingChannels", js.undefined)
    
    inline def setIncomingChannelsVarargs(value: Channel*): Self = StObject.set(x, "incomingChannels", js.Array(value*))
    
    inline def setInstalledApps(value: NullableOption[js.Array[TeamsAppInstallation]]): Self = StObject.set(x, "installedApps", value.asInstanceOf[js.Any])
    
    inline def setInstalledAppsNull: Self = StObject.set(x, "installedApps", null)
    
    inline def setInstalledAppsUndefined: Self = StObject.set(x, "installedApps", js.undefined)
    
    inline def setInstalledAppsVarargs(value: TeamsAppInstallation*): Self = StObject.set(x, "installedApps", js.Array(value*))
    
    inline def setInternalId(value: NullableOption[String]): Self = StObject.set(x, "internalId", value.asInstanceOf[js.Any])
    
    inline def setInternalIdNull: Self = StObject.set(x, "internalId", null)
    
    inline def setInternalIdUndefined: Self = StObject.set(x, "internalId", js.undefined)
    
    inline def setIsArchived(value: NullableOption[Boolean]): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
    
    inline def setIsArchivedNull: Self = StObject.set(x, "isArchived", null)
    
    inline def setIsArchivedUndefined: Self = StObject.set(x, "isArchived", js.undefined)
    
    inline def setMemberSettings(value: NullableOption[TeamMemberSettings]): Self = StObject.set(x, "memberSettings", value.asInstanceOf[js.Any])
    
    inline def setMemberSettingsNull: Self = StObject.set(x, "memberSettings", null)
    
    inline def setMemberSettingsUndefined: Self = StObject.set(x, "memberSettings", js.undefined)
    
    inline def setMembers(value: NullableOption[js.Array[ConversationMember]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: ConversationMember*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setMessagingSettings(value: NullableOption[TeamMessagingSettings]): Self = StObject.set(x, "messagingSettings", value.asInstanceOf[js.Any])
    
    inline def setMessagingSettingsNull: Self = StObject.set(x, "messagingSettings", null)
    
    inline def setMessagingSettingsUndefined: Self = StObject.set(x, "messagingSettings", js.undefined)
    
    inline def setOperations(value: NullableOption[js.Array[TeamsAsyncOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: TeamsAsyncOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setPhoto(value: NullableOption[ProfilePhoto]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoNull: Self = StObject.set(x, "photo", null)
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setPrimaryChannel(value: NullableOption[Channel]): Self = StObject.set(x, "primaryChannel", value.asInstanceOf[js.Any])
    
    inline def setPrimaryChannelNull: Self = StObject.set(x, "primaryChannel", null)
    
    inline def setPrimaryChannelUndefined: Self = StObject.set(x, "primaryChannel", js.undefined)
    
    inline def setSchedule(value: NullableOption[Schedule]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleNull: Self = StObject.set(x, "schedule", null)
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setSpecialization(value: NullableOption[TeamSpecialization]): Self = StObject.set(x, "specialization", value.asInstanceOf[js.Any])
    
    inline def setSpecializationNull: Self = StObject.set(x, "specialization", null)
    
    inline def setSpecializationUndefined: Self = StObject.set(x, "specialization", js.undefined)
    
    inline def setSummary(value: NullableOption[TeamSummary]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setTags(value: NullableOption[js.Array[TeamworkTag]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: TeamworkTag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTemplate(value: NullableOption[TeamsTemplate]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateNull: Self = StObject.set(x, "template", null)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setVisibility(value: NullableOption[TeamVisibilityType]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityNull: Self = StObject.set(x, "visibility", null)
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    inline def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}

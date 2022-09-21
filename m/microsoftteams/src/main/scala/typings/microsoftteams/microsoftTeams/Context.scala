package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  /**
    * Personal app icon y coordinate position
    */
  var appIconPosition: js.UndefOr[Double] = js.undefined
  
  /**
    * Unique ID for the current session for use in correlating telemetry data.
    */
  var appSessionId: js.UndefOr[String] = js.undefined
  
  /**
    * The Microsoft Teams ID for the channel with which the content is associated.
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * The name for the channel with which the content is associated.
    */
  var channelName: js.UndefOr[String] = js.undefined
  
  /**
    * The relative path to the SharePoint folder associated with the channel.
    */
  var channelRelativeUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the channel with which the content is associated.
    */
  var channelType: js.UndefOr[ChannelType] = js.undefined
  
  /**
    * The Microsoft Teams ID for the chat with which the content is associated.
    */
  var chatId: js.UndefOr[String] = js.undefined
  
  /**
    * The OneNote section ID that is linked to the channel.
    */
  var defaultOneNoteSectionId: js.UndefOr[String] = js.undefined
  
  /**
    * The developer-defined unique ID for the entity this content points to.
    */
  var entityId: String
  
  /**
    * The context where tab url is loaded (content, task, setting, remove, sidePanel)
    */
  var frameContext: js.UndefOr[FrameContexts] = js.undefined
  
  /**
    * The Office 365 group ID for the team with which the content is associated.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the host client. Possible values are : android, ios, web, desktop, rigel
    */
  var hostClientType: js.UndefOr[HostClientType] = js.undefined
  
  /**
    * The AAD group ID of the host team.
    */
  var hostTeamGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The tenant ID of the host team.
    */
  var hostTeamTenantId: js.UndefOr[String] = js.undefined
  
  /**
    * Represents whether calling is allowed for the current logged in User
    */
  var isCallingAllowed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indication whether the tab is in full-screen mode.
    */
  var isFullScreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indication whether the tab is in a pop out window
    */
  var isMultiWindow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents whether PSTN calling is allowed for the current logged in User
    */
  var isPSTNCallingAllowed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether team is archived.
    * Apps should use this as a signal to prevent any changes to content associated with archived teams.
    */
  var isTeamArchived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current locale that the user has configured for the app formatted as
    * languageId-countryId (for example, en-us).
    */
  var locale: String
  
  /**
    * A value suitable for use as a login_hint when authenticating with Azure AD.
    * Because a malicious party can run your content in a browser, this value should
    * be used only as a hint as to who the user is and never as proof of identity.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var loginHint: js.UndefOr[String] = js.undefined
  
  /**
    * Meeting Id used by tab when running in meeting context
    */
  var meetingId: js.UndefOr[String] = js.undefined
  
  /**
    * More detailed locale info from the user's OS if available. Can be used together with
    * the @microsoft/globe NPM package to ensure your app respects the user's OS date and
    * time format configuration
    */
  var osLocaleInfo: js.UndefOr[LocaleInfo] = js.undefined
  
  /**
    * The ID of the parent message from which this task module was launched.
    * This is only available in task modules launched from bot cards.
    */
  var parentMessageId: js.UndefOr[String] = js.undefined
  
  /**
    * Current ring ID
    */
  var ringId: js.UndefOr[String] = js.undefined
  
  /**
    * Unique ID for the current Teams session for use in correlating telemetry data.
    */
  var sessionId: js.UndefOr[String] = js.undefined
  
  /**
    * SharePoint context. This is only available when hosted in SharePoint.
    */
  var sharepoint: js.UndefOr[Any] = js.undefined
  
  /**
    * Source origin from where the tab is opened
    */
  var sourceOrigin: js.UndefOr[String] = js.undefined
  
  /**
    * The developer-defined unique ID for the sub-entity this content points to.
    * This field should be used to restore to a specific state within an entity,
    * such as scrolling to or activating a specific piece of content.
    */
  var subEntityId: js.UndefOr[String] = js.undefined
  
  /**
    * The Microsoft Teams ID for the team with which the content is associated.
    */
  var teamId: js.UndefOr[String] = js.undefined
  
  /**
    * The name for the team with which the content is associated.
    */
  var teamName: js.UndefOr[String] = js.undefined
  
  /**
    * The domain of the root SharePoint site associated with the team.
    */
  var teamSiteDomain: js.UndefOr[String] = js.undefined
  
  /**
    * The relative path to the SharePoint site associated with the team.
    */
  var teamSitePath: js.UndefOr[String] = js.undefined
  
  /**
    * The root SharePoint site associated with the team.
    */
  var teamSiteUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Team Template ID if there was a Team Template associated with the creation of the team.
    */
  var teamTemplateId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the team.
    */
  var teamType: js.UndefOr[TeamType] = js.undefined
  
  /**
    * The type of license for the current users tenant.
    */
  var tenantSKU: js.UndefOr[String] = js.undefined
  
  /**
    * The current UI theme.
    */
  var theme: js.UndefOr[String] = js.undefined
  
  /**
    * The Azure AD tenant ID of the current user.
    * Because a malicious party can run your content in a browser, this value should
    * be used only as a hint as to who the user is and never as proof of identity.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var tid: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated Use loginHint or userPrincipalName.
    * The UPN of the current user.
    * Because a malicious party can run your content in a browser, this value should
    * be used only as a hint as to who the user is and never as proof of identity.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var upn: js.UndefOr[String] = js.undefined
  
  /**
    * Time when the user clicked on the tab
    */
  var userClickTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Where the user prefers the file to be opened from by default during file open
    */
  var userFileOpenPreference: js.UndefOr[FileOpenPreference] = js.undefined
  
  /**
    * The license type for the current user.
    */
  var userLicenseType: js.UndefOr[String] = js.undefined
  
  /**
    * The Azure AD object id of the current user.
    * Because a malicious party run your content in a browser, this value should
    * be used only as a hint as to who the user is and never as proof of identity.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var userObjectId: js.UndefOr[String] = js.undefined
  
  /**
    * The UPN of the current user. This may be an externally-authenticated UPN (e.g., guest users).
    * Because a malicious party run your content in a browser, this value should
    * be used only as a hint as to who the user is and never as proof of identity.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var userPrincipalName: js.UndefOr[String] = js.undefined
  
  /**
    * The user's role in the team.
    * Because a malicious party can run your content in a browser, this value should
    * be used only as a hint as to the user's role, and never as proof of her role.
    */
  var userTeamRole: js.UndefOr[UserTeamRole] = js.undefined
}
object Context {
  
  inline def apply(entityId: String, locale: String): Context = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setAppIconPosition(value: Double): Self = StObject.set(x, "appIconPosition", value.asInstanceOf[js.Any])
    
    inline def setAppIconPositionUndefined: Self = StObject.set(x, "appIconPosition", js.undefined)
    
    inline def setAppSessionId(value: String): Self = StObject.set(x, "appSessionId", value.asInstanceOf[js.Any])
    
    inline def setAppSessionIdUndefined: Self = StObject.set(x, "appSessionId", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
    
    inline def setChannelRelativeUrl(value: String): Self = StObject.set(x, "channelRelativeUrl", value.asInstanceOf[js.Any])
    
    inline def setChannelRelativeUrlUndefined: Self = StObject.set(x, "channelRelativeUrl", js.undefined)
    
    inline def setChannelType(value: ChannelType): Self = StObject.set(x, "channelType", value.asInstanceOf[js.Any])
    
    inline def setChannelTypeUndefined: Self = StObject.set(x, "channelType", js.undefined)
    
    inline def setChatId(value: String): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
    
    inline def setChatIdUndefined: Self = StObject.set(x, "chatId", js.undefined)
    
    inline def setDefaultOneNoteSectionId(value: String): Self = StObject.set(x, "defaultOneNoteSectionId", value.asInstanceOf[js.Any])
    
    inline def setDefaultOneNoteSectionIdUndefined: Self = StObject.set(x, "defaultOneNoteSectionId", js.undefined)
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setFrameContext(value: FrameContexts): Self = StObject.set(x, "frameContext", value.asInstanceOf[js.Any])
    
    inline def setFrameContextUndefined: Self = StObject.set(x, "frameContext", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setHostClientType(value: HostClientType): Self = StObject.set(x, "hostClientType", value.asInstanceOf[js.Any])
    
    inline def setHostClientTypeUndefined: Self = StObject.set(x, "hostClientType", js.undefined)
    
    inline def setHostTeamGroupId(value: String): Self = StObject.set(x, "hostTeamGroupId", value.asInstanceOf[js.Any])
    
    inline def setHostTeamGroupIdUndefined: Self = StObject.set(x, "hostTeamGroupId", js.undefined)
    
    inline def setHostTeamTenantId(value: String): Self = StObject.set(x, "hostTeamTenantId", value.asInstanceOf[js.Any])
    
    inline def setHostTeamTenantIdUndefined: Self = StObject.set(x, "hostTeamTenantId", js.undefined)
    
    inline def setIsCallingAllowed(value: Boolean): Self = StObject.set(x, "isCallingAllowed", value.asInstanceOf[js.Any])
    
    inline def setIsCallingAllowedUndefined: Self = StObject.set(x, "isCallingAllowed", js.undefined)
    
    inline def setIsFullScreen(value: Boolean): Self = StObject.set(x, "isFullScreen", value.asInstanceOf[js.Any])
    
    inline def setIsFullScreenUndefined: Self = StObject.set(x, "isFullScreen", js.undefined)
    
    inline def setIsMultiWindow(value: Boolean): Self = StObject.set(x, "isMultiWindow", value.asInstanceOf[js.Any])
    
    inline def setIsMultiWindowUndefined: Self = StObject.set(x, "isMultiWindow", js.undefined)
    
    inline def setIsPSTNCallingAllowed(value: Boolean): Self = StObject.set(x, "isPSTNCallingAllowed", value.asInstanceOf[js.Any])
    
    inline def setIsPSTNCallingAllowedUndefined: Self = StObject.set(x, "isPSTNCallingAllowed", js.undefined)
    
    inline def setIsTeamArchived(value: Boolean): Self = StObject.set(x, "isTeamArchived", value.asInstanceOf[js.Any])
    
    inline def setIsTeamArchivedUndefined: Self = StObject.set(x, "isTeamArchived", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
    
    inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
    
    inline def setMeetingId(value: String): Self = StObject.set(x, "meetingId", value.asInstanceOf[js.Any])
    
    inline def setMeetingIdUndefined: Self = StObject.set(x, "meetingId", js.undefined)
    
    inline def setOsLocaleInfo(value: LocaleInfo): Self = StObject.set(x, "osLocaleInfo", value.asInstanceOf[js.Any])
    
    inline def setOsLocaleInfoUndefined: Self = StObject.set(x, "osLocaleInfo", js.undefined)
    
    inline def setParentMessageId(value: String): Self = StObject.set(x, "parentMessageId", value.asInstanceOf[js.Any])
    
    inline def setParentMessageIdUndefined: Self = StObject.set(x, "parentMessageId", js.undefined)
    
    inline def setRingId(value: String): Self = StObject.set(x, "ringId", value.asInstanceOf[js.Any])
    
    inline def setRingIdUndefined: Self = StObject.set(x, "ringId", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setSharepoint(value: Any): Self = StObject.set(x, "sharepoint", value.asInstanceOf[js.Any])
    
    inline def setSharepointUndefined: Self = StObject.set(x, "sharepoint", js.undefined)
    
    inline def setSourceOrigin(value: String): Self = StObject.set(x, "sourceOrigin", value.asInstanceOf[js.Any])
    
    inline def setSourceOriginUndefined: Self = StObject.set(x, "sourceOrigin", js.undefined)
    
    inline def setSubEntityId(value: String): Self = StObject.set(x, "subEntityId", value.asInstanceOf[js.Any])
    
    inline def setSubEntityIdUndefined: Self = StObject.set(x, "subEntityId", js.undefined)
    
    inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
    
    inline def setTeamName(value: String): Self = StObject.set(x, "teamName", value.asInstanceOf[js.Any])
    
    inline def setTeamNameUndefined: Self = StObject.set(x, "teamName", js.undefined)
    
    inline def setTeamSiteDomain(value: String): Self = StObject.set(x, "teamSiteDomain", value.asInstanceOf[js.Any])
    
    inline def setTeamSiteDomainUndefined: Self = StObject.set(x, "teamSiteDomain", js.undefined)
    
    inline def setTeamSitePath(value: String): Self = StObject.set(x, "teamSitePath", value.asInstanceOf[js.Any])
    
    inline def setTeamSitePathUndefined: Self = StObject.set(x, "teamSitePath", js.undefined)
    
    inline def setTeamSiteUrl(value: String): Self = StObject.set(x, "teamSiteUrl", value.asInstanceOf[js.Any])
    
    inline def setTeamSiteUrlUndefined: Self = StObject.set(x, "teamSiteUrl", js.undefined)
    
    inline def setTeamTemplateId(value: String): Self = StObject.set(x, "teamTemplateId", value.asInstanceOf[js.Any])
    
    inline def setTeamTemplateIdUndefined: Self = StObject.set(x, "teamTemplateId", js.undefined)
    
    inline def setTeamType(value: TeamType): Self = StObject.set(x, "teamType", value.asInstanceOf[js.Any])
    
    inline def setTeamTypeUndefined: Self = StObject.set(x, "teamType", js.undefined)
    
    inline def setTenantSKU(value: String): Self = StObject.set(x, "tenantSKU", value.asInstanceOf[js.Any])
    
    inline def setTenantSKUUndefined: Self = StObject.set(x, "tenantSKU", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTid(value: String): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
    
    inline def setTidUndefined: Self = StObject.set(x, "tid", js.undefined)
    
    inline def setUpn(value: String): Self = StObject.set(x, "upn", value.asInstanceOf[js.Any])
    
    inline def setUpnUndefined: Self = StObject.set(x, "upn", js.undefined)
    
    inline def setUserClickTime(value: Double): Self = StObject.set(x, "userClickTime", value.asInstanceOf[js.Any])
    
    inline def setUserClickTimeUndefined: Self = StObject.set(x, "userClickTime", js.undefined)
    
    inline def setUserFileOpenPreference(value: FileOpenPreference): Self = StObject.set(x, "userFileOpenPreference", value.asInstanceOf[js.Any])
    
    inline def setUserFileOpenPreferenceUndefined: Self = StObject.set(x, "userFileOpenPreference", js.undefined)
    
    inline def setUserLicenseType(value: String): Self = StObject.set(x, "userLicenseType", value.asInstanceOf[js.Any])
    
    inline def setUserLicenseTypeUndefined: Self = StObject.set(x, "userLicenseType", js.undefined)
    
    inline def setUserObjectId(value: String): Self = StObject.set(x, "userObjectId", value.asInstanceOf[js.Any])
    
    inline def setUserObjectIdUndefined: Self = StObject.set(x, "userObjectId", js.undefined)
    
    inline def setUserPrincipalName(value: String): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
    
    inline def setUserTeamRole(value: UserTeamRole): Self = StObject.set(x, "userTeamRole", value.asInstanceOf[js.Any])
    
    inline def setUserTeamRoleUndefined: Self = StObject.set(x, "userTeamRole", js.undefined)
  }
}

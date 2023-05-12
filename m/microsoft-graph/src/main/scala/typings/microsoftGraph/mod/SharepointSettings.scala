package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharepointSettings
  extends StObject
     with Entity {
  
  var allowedDomainGuidsForSyncApp: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var availableManagedPathsForSiteCreation: js.UndefOr[js.Array[String]] = js.undefined
  
  var deletedUserPersonalSiteRetentionPeriodInDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  var excludedFileExtensionsForSyncApp: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var idleSessionSignOut: js.UndefOr[NullableOption[IdleSessionSignOut]] = js.undefined
  
  var imageTaggingOption: js.UndefOr[NullableOption[ImageTaggingChoice]] = js.undefined
  
  var isCommentingOnSitePagesEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isFileActivityNotificationEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isLegacyAuthProtocolsEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isLoopEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isMacSyncAppEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isRequireAcceptingUserToMatchInvitedUserEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isResharingByExternalUsersEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isSharePointMobileNotificationEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isSharePointNewsfeedEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isSiteCreationEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isSiteCreationUIEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isSitePagesCreationEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isSitesStorageLimitAutomatic: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isSyncButtonHiddenOnPersonalSite: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isUnmanagedSyncAppForTenantRestricted: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var personalSiteDefaultStorageLimitInMB: js.UndefOr[NullableOption[Double]] = js.undefined
  
  var sharingAllowedDomainList: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var sharingBlockedDomainList: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var sharingCapability: js.UndefOr[NullableOption[SharingCapabilities]] = js.undefined
  
  var sharingDomainRestrictionMode: js.UndefOr[NullableOption[SharingDomainRestrictionMode]] = js.undefined
  
  var siteCreationDefaultManagedPath: js.UndefOr[String] = js.undefined
  
  var siteCreationDefaultStorageLimitInMB: js.UndefOr[NullableOption[Double]] = js.undefined
  
  var tenantDefaultTimezone: js.UndefOr[NullableOption[String]] = js.undefined
}
object SharepointSettings {
  
  inline def apply(): SharepointSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharepointSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharepointSettings] (val x: Self) extends AnyVal {
    
    inline def setAllowedDomainGuidsForSyncApp(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "allowedDomainGuidsForSyncApp", value.asInstanceOf[js.Any])
    
    inline def setAllowedDomainGuidsForSyncAppNull: Self = StObject.set(x, "allowedDomainGuidsForSyncApp", null)
    
    inline def setAllowedDomainGuidsForSyncAppUndefined: Self = StObject.set(x, "allowedDomainGuidsForSyncApp", js.undefined)
    
    inline def setAllowedDomainGuidsForSyncAppVarargs(value: String*): Self = StObject.set(x, "allowedDomainGuidsForSyncApp", js.Array(value*))
    
    inline def setAvailableManagedPathsForSiteCreation(value: js.Array[String]): Self = StObject.set(x, "availableManagedPathsForSiteCreation", value.asInstanceOf[js.Any])
    
    inline def setAvailableManagedPathsForSiteCreationUndefined: Self = StObject.set(x, "availableManagedPathsForSiteCreation", js.undefined)
    
    inline def setAvailableManagedPathsForSiteCreationVarargs(value: String*): Self = StObject.set(x, "availableManagedPathsForSiteCreation", js.Array(value*))
    
    inline def setDeletedUserPersonalSiteRetentionPeriodInDays(value: NullableOption[Double]): Self = StObject.set(x, "deletedUserPersonalSiteRetentionPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setDeletedUserPersonalSiteRetentionPeriodInDaysNull: Self = StObject.set(x, "deletedUserPersonalSiteRetentionPeriodInDays", null)
    
    inline def setDeletedUserPersonalSiteRetentionPeriodInDaysUndefined: Self = StObject.set(x, "deletedUserPersonalSiteRetentionPeriodInDays", js.undefined)
    
    inline def setExcludedFileExtensionsForSyncApp(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "excludedFileExtensionsForSyncApp", value.asInstanceOf[js.Any])
    
    inline def setExcludedFileExtensionsForSyncAppNull: Self = StObject.set(x, "excludedFileExtensionsForSyncApp", null)
    
    inline def setExcludedFileExtensionsForSyncAppUndefined: Self = StObject.set(x, "excludedFileExtensionsForSyncApp", js.undefined)
    
    inline def setExcludedFileExtensionsForSyncAppVarargs(value: String*): Self = StObject.set(x, "excludedFileExtensionsForSyncApp", js.Array(value*))
    
    inline def setIdleSessionSignOut(value: NullableOption[IdleSessionSignOut]): Self = StObject.set(x, "idleSessionSignOut", value.asInstanceOf[js.Any])
    
    inline def setIdleSessionSignOutNull: Self = StObject.set(x, "idleSessionSignOut", null)
    
    inline def setIdleSessionSignOutUndefined: Self = StObject.set(x, "idleSessionSignOut", js.undefined)
    
    inline def setImageTaggingOption(value: NullableOption[ImageTaggingChoice]): Self = StObject.set(x, "imageTaggingOption", value.asInstanceOf[js.Any])
    
    inline def setImageTaggingOptionNull: Self = StObject.set(x, "imageTaggingOption", null)
    
    inline def setImageTaggingOptionUndefined: Self = StObject.set(x, "imageTaggingOption", js.undefined)
    
    inline def setIsCommentingOnSitePagesEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isCommentingOnSitePagesEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsCommentingOnSitePagesEnabledNull: Self = StObject.set(x, "isCommentingOnSitePagesEnabled", null)
    
    inline def setIsCommentingOnSitePagesEnabledUndefined: Self = StObject.set(x, "isCommentingOnSitePagesEnabled", js.undefined)
    
    inline def setIsFileActivityNotificationEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isFileActivityNotificationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsFileActivityNotificationEnabledNull: Self = StObject.set(x, "isFileActivityNotificationEnabled", null)
    
    inline def setIsFileActivityNotificationEnabledUndefined: Self = StObject.set(x, "isFileActivityNotificationEnabled", js.undefined)
    
    inline def setIsLegacyAuthProtocolsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isLegacyAuthProtocolsEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsLegacyAuthProtocolsEnabledNull: Self = StObject.set(x, "isLegacyAuthProtocolsEnabled", null)
    
    inline def setIsLegacyAuthProtocolsEnabledUndefined: Self = StObject.set(x, "isLegacyAuthProtocolsEnabled", js.undefined)
    
    inline def setIsLoopEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isLoopEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsLoopEnabledNull: Self = StObject.set(x, "isLoopEnabled", null)
    
    inline def setIsLoopEnabledUndefined: Self = StObject.set(x, "isLoopEnabled", js.undefined)
    
    inline def setIsMacSyncAppEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isMacSyncAppEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsMacSyncAppEnabledNull: Self = StObject.set(x, "isMacSyncAppEnabled", null)
    
    inline def setIsMacSyncAppEnabledUndefined: Self = StObject.set(x, "isMacSyncAppEnabled", js.undefined)
    
    inline def setIsRequireAcceptingUserToMatchInvitedUserEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isRequireAcceptingUserToMatchInvitedUserEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsRequireAcceptingUserToMatchInvitedUserEnabledNull: Self = StObject.set(x, "isRequireAcceptingUserToMatchInvitedUserEnabled", null)
    
    inline def setIsRequireAcceptingUserToMatchInvitedUserEnabledUndefined: Self = StObject.set(x, "isRequireAcceptingUserToMatchInvitedUserEnabled", js.undefined)
    
    inline def setIsResharingByExternalUsersEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isResharingByExternalUsersEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsResharingByExternalUsersEnabledNull: Self = StObject.set(x, "isResharingByExternalUsersEnabled", null)
    
    inline def setIsResharingByExternalUsersEnabledUndefined: Self = StObject.set(x, "isResharingByExternalUsersEnabled", js.undefined)
    
    inline def setIsSharePointMobileNotificationEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isSharePointMobileNotificationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsSharePointMobileNotificationEnabledNull: Self = StObject.set(x, "isSharePointMobileNotificationEnabled", null)
    
    inline def setIsSharePointMobileNotificationEnabledUndefined: Self = StObject.set(x, "isSharePointMobileNotificationEnabled", js.undefined)
    
    inline def setIsSharePointNewsfeedEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isSharePointNewsfeedEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsSharePointNewsfeedEnabledNull: Self = StObject.set(x, "isSharePointNewsfeedEnabled", null)
    
    inline def setIsSharePointNewsfeedEnabledUndefined: Self = StObject.set(x, "isSharePointNewsfeedEnabled", js.undefined)
    
    inline def setIsSiteCreationEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isSiteCreationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsSiteCreationEnabledNull: Self = StObject.set(x, "isSiteCreationEnabled", null)
    
    inline def setIsSiteCreationEnabledUndefined: Self = StObject.set(x, "isSiteCreationEnabled", js.undefined)
    
    inline def setIsSiteCreationUIEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isSiteCreationUIEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsSiteCreationUIEnabledNull: Self = StObject.set(x, "isSiteCreationUIEnabled", null)
    
    inline def setIsSiteCreationUIEnabledUndefined: Self = StObject.set(x, "isSiteCreationUIEnabled", js.undefined)
    
    inline def setIsSitePagesCreationEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isSitePagesCreationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsSitePagesCreationEnabledNull: Self = StObject.set(x, "isSitePagesCreationEnabled", null)
    
    inline def setIsSitePagesCreationEnabledUndefined: Self = StObject.set(x, "isSitePagesCreationEnabled", js.undefined)
    
    inline def setIsSitesStorageLimitAutomatic(value: NullableOption[Boolean]): Self = StObject.set(x, "isSitesStorageLimitAutomatic", value.asInstanceOf[js.Any])
    
    inline def setIsSitesStorageLimitAutomaticNull: Self = StObject.set(x, "isSitesStorageLimitAutomatic", null)
    
    inline def setIsSitesStorageLimitAutomaticUndefined: Self = StObject.set(x, "isSitesStorageLimitAutomatic", js.undefined)
    
    inline def setIsSyncButtonHiddenOnPersonalSite(value: NullableOption[Boolean]): Self = StObject.set(x, "isSyncButtonHiddenOnPersonalSite", value.asInstanceOf[js.Any])
    
    inline def setIsSyncButtonHiddenOnPersonalSiteNull: Self = StObject.set(x, "isSyncButtonHiddenOnPersonalSite", null)
    
    inline def setIsSyncButtonHiddenOnPersonalSiteUndefined: Self = StObject.set(x, "isSyncButtonHiddenOnPersonalSite", js.undefined)
    
    inline def setIsUnmanagedSyncAppForTenantRestricted(value: NullableOption[Boolean]): Self = StObject.set(x, "isUnmanagedSyncAppForTenantRestricted", value.asInstanceOf[js.Any])
    
    inline def setIsUnmanagedSyncAppForTenantRestrictedNull: Self = StObject.set(x, "isUnmanagedSyncAppForTenantRestricted", null)
    
    inline def setIsUnmanagedSyncAppForTenantRestrictedUndefined: Self = StObject.set(x, "isUnmanagedSyncAppForTenantRestricted", js.undefined)
    
    inline def setPersonalSiteDefaultStorageLimitInMB(value: NullableOption[Double]): Self = StObject.set(x, "personalSiteDefaultStorageLimitInMB", value.asInstanceOf[js.Any])
    
    inline def setPersonalSiteDefaultStorageLimitInMBNull: Self = StObject.set(x, "personalSiteDefaultStorageLimitInMB", null)
    
    inline def setPersonalSiteDefaultStorageLimitInMBUndefined: Self = StObject.set(x, "personalSiteDefaultStorageLimitInMB", js.undefined)
    
    inline def setSharingAllowedDomainList(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "sharingAllowedDomainList", value.asInstanceOf[js.Any])
    
    inline def setSharingAllowedDomainListNull: Self = StObject.set(x, "sharingAllowedDomainList", null)
    
    inline def setSharingAllowedDomainListUndefined: Self = StObject.set(x, "sharingAllowedDomainList", js.undefined)
    
    inline def setSharingAllowedDomainListVarargs(value: String*): Self = StObject.set(x, "sharingAllowedDomainList", js.Array(value*))
    
    inline def setSharingBlockedDomainList(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "sharingBlockedDomainList", value.asInstanceOf[js.Any])
    
    inline def setSharingBlockedDomainListNull: Self = StObject.set(x, "sharingBlockedDomainList", null)
    
    inline def setSharingBlockedDomainListUndefined: Self = StObject.set(x, "sharingBlockedDomainList", js.undefined)
    
    inline def setSharingBlockedDomainListVarargs(value: String*): Self = StObject.set(x, "sharingBlockedDomainList", js.Array(value*))
    
    inline def setSharingCapability(value: NullableOption[SharingCapabilities]): Self = StObject.set(x, "sharingCapability", value.asInstanceOf[js.Any])
    
    inline def setSharingCapabilityNull: Self = StObject.set(x, "sharingCapability", null)
    
    inline def setSharingCapabilityUndefined: Self = StObject.set(x, "sharingCapability", js.undefined)
    
    inline def setSharingDomainRestrictionMode(value: NullableOption[SharingDomainRestrictionMode]): Self = StObject.set(x, "sharingDomainRestrictionMode", value.asInstanceOf[js.Any])
    
    inline def setSharingDomainRestrictionModeNull: Self = StObject.set(x, "sharingDomainRestrictionMode", null)
    
    inline def setSharingDomainRestrictionModeUndefined: Self = StObject.set(x, "sharingDomainRestrictionMode", js.undefined)
    
    inline def setSiteCreationDefaultManagedPath(value: String): Self = StObject.set(x, "siteCreationDefaultManagedPath", value.asInstanceOf[js.Any])
    
    inline def setSiteCreationDefaultManagedPathUndefined: Self = StObject.set(x, "siteCreationDefaultManagedPath", js.undefined)
    
    inline def setSiteCreationDefaultStorageLimitInMB(value: NullableOption[Double]): Self = StObject.set(x, "siteCreationDefaultStorageLimitInMB", value.asInstanceOf[js.Any])
    
    inline def setSiteCreationDefaultStorageLimitInMBNull: Self = StObject.set(x, "siteCreationDefaultStorageLimitInMB", null)
    
    inline def setSiteCreationDefaultStorageLimitInMBUndefined: Self = StObject.set(x, "siteCreationDefaultStorageLimitInMB", js.undefined)
    
    inline def setTenantDefaultTimezone(value: NullableOption[String]): Self = StObject.set(x, "tenantDefaultTimezone", value.asInstanceOf[js.Any])
    
    inline def setTenantDefaultTimezoneNull: Self = StObject.set(x, "tenantDefaultTimezone", null)
    
    inline def setTenantDefaultTimezoneUndefined: Self = StObject.set(x, "tenantDefaultTimezone", js.undefined)
  }
}

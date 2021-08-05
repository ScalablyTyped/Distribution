package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceAppManagement
  extends StObject
     with Entity {
  
  // Android managed app policies.
  var androidManagedAppProtections: js.UndefOr[NullableOption[js.Array[AndroidManagedAppProtection]]] = js.undefined
  
  // Default managed app policies.
  var defaultManagedAppProtections: js.UndefOr[NullableOption[js.Array[DefaultManagedAppProtection]]] = js.undefined
  
  // iOS managed app policies.
  var iosManagedAppProtections: js.UndefOr[NullableOption[js.Array[IosManagedAppProtection]]] = js.undefined
  
  // Whether the account is enabled for syncing applications from the Microsoft Store for Business.
  var isEnabledForMicrosoftStoreForBusiness: js.UndefOr[Boolean] = js.undefined
  
  // Managed app policies.
  var managedAppPolicies: js.UndefOr[NullableOption[js.Array[ManagedAppPolicy]]] = js.undefined
  
  // The managed app registrations.
  var managedAppRegistrations: js.UndefOr[NullableOption[js.Array[ManagedAppRegistration]]] = js.undefined
  
  // The managed app statuses.
  var managedAppStatuses: js.UndefOr[NullableOption[js.Array[ManagedAppStatus]]] = js.undefined
  
  // The Managed eBook.
  var managedEBooks: js.UndefOr[NullableOption[js.Array[ManagedEBook]]] = js.undefined
  
  // Windows information protection for apps running on devices which are MDM enrolled.
  var mdmWindowsInformationProtectionPolicies: js.UndefOr[NullableOption[js.Array[MdmWindowsInformationProtectionPolicy]]] = js.undefined
  
  /**
    * The locale information used to sync applications from the Microsoft Store for Business. Cultures that are specific to a
    * country/region. The names of these cultures follow RFC 4646 (Windows Vista and later). The format is
    * -&amp;lt;country/regioncode2&amp;gt;, where is a lowercase two-letter code derived from ISO 639-1 and
    * &amp;lt;country/regioncode2&amp;gt; is an uppercase two-letter code derived from ISO 3166. For example, en-US for
    * English (United States) is a specific culture.
    */
  var microsoftStoreForBusinessLanguage: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The last time an application sync from the Microsoft Store for Business was completed.
  var microsoftStoreForBusinessLastCompletedApplicationSyncTime: js.UndefOr[String] = js.undefined
  
  // The last time the apps from the Microsoft Store for Business were synced successfully for the account.
  var microsoftStoreForBusinessLastSuccessfulSyncDateTime: js.UndefOr[String] = js.undefined
  
  // The mobile app categories.
  var mobileAppCategories: js.UndefOr[NullableOption[js.Array[MobileAppCategory]]] = js.undefined
  
  // The Managed Device Mobile Application Configurations.
  var mobileAppConfigurations: js.UndefOr[NullableOption[js.Array[ManagedDeviceMobileAppConfiguration]]] = js.undefined
  
  // The mobile apps.
  var mobileApps: js.UndefOr[NullableOption[js.Array[MobileApp]]] = js.undefined
  
  // Targeted managed app configurations.
  var targetedManagedAppConfigurations: js.UndefOr[NullableOption[js.Array[TargetedManagedAppConfiguration]]] = js.undefined
  
  // List of Vpp tokens for this organization.
  var vppTokens: js.UndefOr[NullableOption[js.Array[VppToken]]] = js.undefined
  
  // Windows information protection for apps running on devices which are not MDM enrolled.
  var windowsInformationProtectionPolicies: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionPolicy]]] = js.undefined
}
object DeviceAppManagement {
  
  inline def apply(): DeviceAppManagement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceAppManagement]
  }
  
  extension [Self <: DeviceAppManagement](x: Self) {
    
    inline def setAndroidManagedAppProtections(value: NullableOption[js.Array[AndroidManagedAppProtection]]): Self = StObject.set(x, "androidManagedAppProtections", value.asInstanceOf[js.Any])
    
    inline def setAndroidManagedAppProtectionsNull: Self = StObject.set(x, "androidManagedAppProtections", null)
    
    inline def setAndroidManagedAppProtectionsUndefined: Self = StObject.set(x, "androidManagedAppProtections", js.undefined)
    
    inline def setAndroidManagedAppProtectionsVarargs(value: AndroidManagedAppProtection*): Self = StObject.set(x, "androidManagedAppProtections", js.Array(value :_*))
    
    inline def setDefaultManagedAppProtections(value: NullableOption[js.Array[DefaultManagedAppProtection]]): Self = StObject.set(x, "defaultManagedAppProtections", value.asInstanceOf[js.Any])
    
    inline def setDefaultManagedAppProtectionsNull: Self = StObject.set(x, "defaultManagedAppProtections", null)
    
    inline def setDefaultManagedAppProtectionsUndefined: Self = StObject.set(x, "defaultManagedAppProtections", js.undefined)
    
    inline def setDefaultManagedAppProtectionsVarargs(value: DefaultManagedAppProtection*): Self = StObject.set(x, "defaultManagedAppProtections", js.Array(value :_*))
    
    inline def setIosManagedAppProtections(value: NullableOption[js.Array[IosManagedAppProtection]]): Self = StObject.set(x, "iosManagedAppProtections", value.asInstanceOf[js.Any])
    
    inline def setIosManagedAppProtectionsNull: Self = StObject.set(x, "iosManagedAppProtections", null)
    
    inline def setIosManagedAppProtectionsUndefined: Self = StObject.set(x, "iosManagedAppProtections", js.undefined)
    
    inline def setIosManagedAppProtectionsVarargs(value: IosManagedAppProtection*): Self = StObject.set(x, "iosManagedAppProtections", js.Array(value :_*))
    
    inline def setIsEnabledForMicrosoftStoreForBusiness(value: Boolean): Self = StObject.set(x, "isEnabledForMicrosoftStoreForBusiness", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledForMicrosoftStoreForBusinessUndefined: Self = StObject.set(x, "isEnabledForMicrosoftStoreForBusiness", js.undefined)
    
    inline def setManagedAppPolicies(value: NullableOption[js.Array[ManagedAppPolicy]]): Self = StObject.set(x, "managedAppPolicies", value.asInstanceOf[js.Any])
    
    inline def setManagedAppPoliciesNull: Self = StObject.set(x, "managedAppPolicies", null)
    
    inline def setManagedAppPoliciesUndefined: Self = StObject.set(x, "managedAppPolicies", js.undefined)
    
    inline def setManagedAppPoliciesVarargs(value: ManagedAppPolicy*): Self = StObject.set(x, "managedAppPolicies", js.Array(value :_*))
    
    inline def setManagedAppRegistrations(value: NullableOption[js.Array[ManagedAppRegistration]]): Self = StObject.set(x, "managedAppRegistrations", value.asInstanceOf[js.Any])
    
    inline def setManagedAppRegistrationsNull: Self = StObject.set(x, "managedAppRegistrations", null)
    
    inline def setManagedAppRegistrationsUndefined: Self = StObject.set(x, "managedAppRegistrations", js.undefined)
    
    inline def setManagedAppRegistrationsVarargs(value: ManagedAppRegistration*): Self = StObject.set(x, "managedAppRegistrations", js.Array(value :_*))
    
    inline def setManagedAppStatuses(value: NullableOption[js.Array[ManagedAppStatus]]): Self = StObject.set(x, "managedAppStatuses", value.asInstanceOf[js.Any])
    
    inline def setManagedAppStatusesNull: Self = StObject.set(x, "managedAppStatuses", null)
    
    inline def setManagedAppStatusesUndefined: Self = StObject.set(x, "managedAppStatuses", js.undefined)
    
    inline def setManagedAppStatusesVarargs(value: ManagedAppStatus*): Self = StObject.set(x, "managedAppStatuses", js.Array(value :_*))
    
    inline def setManagedEBooks(value: NullableOption[js.Array[ManagedEBook]]): Self = StObject.set(x, "managedEBooks", value.asInstanceOf[js.Any])
    
    inline def setManagedEBooksNull: Self = StObject.set(x, "managedEBooks", null)
    
    inline def setManagedEBooksUndefined: Self = StObject.set(x, "managedEBooks", js.undefined)
    
    inline def setManagedEBooksVarargs(value: ManagedEBook*): Self = StObject.set(x, "managedEBooks", js.Array(value :_*))
    
    inline def setMdmWindowsInformationProtectionPolicies(value: NullableOption[js.Array[MdmWindowsInformationProtectionPolicy]]): Self = StObject.set(x, "mdmWindowsInformationProtectionPolicies", value.asInstanceOf[js.Any])
    
    inline def setMdmWindowsInformationProtectionPoliciesNull: Self = StObject.set(x, "mdmWindowsInformationProtectionPolicies", null)
    
    inline def setMdmWindowsInformationProtectionPoliciesUndefined: Self = StObject.set(x, "mdmWindowsInformationProtectionPolicies", js.undefined)
    
    inline def setMdmWindowsInformationProtectionPoliciesVarargs(value: MdmWindowsInformationProtectionPolicy*): Self = StObject.set(x, "mdmWindowsInformationProtectionPolicies", js.Array(value :_*))
    
    inline def setMicrosoftStoreForBusinessLanguage(value: NullableOption[String]): Self = StObject.set(x, "microsoftStoreForBusinessLanguage", value.asInstanceOf[js.Any])
    
    inline def setMicrosoftStoreForBusinessLanguageNull: Self = StObject.set(x, "microsoftStoreForBusinessLanguage", null)
    
    inline def setMicrosoftStoreForBusinessLanguageUndefined: Self = StObject.set(x, "microsoftStoreForBusinessLanguage", js.undefined)
    
    inline def setMicrosoftStoreForBusinessLastCompletedApplicationSyncTime(value: String): Self = StObject.set(x, "microsoftStoreForBusinessLastCompletedApplicationSyncTime", value.asInstanceOf[js.Any])
    
    inline def setMicrosoftStoreForBusinessLastCompletedApplicationSyncTimeUndefined: Self = StObject.set(x, "microsoftStoreForBusinessLastCompletedApplicationSyncTime", js.undefined)
    
    inline def setMicrosoftStoreForBusinessLastSuccessfulSyncDateTime(value: String): Self = StObject.set(x, "microsoftStoreForBusinessLastSuccessfulSyncDateTime", value.asInstanceOf[js.Any])
    
    inline def setMicrosoftStoreForBusinessLastSuccessfulSyncDateTimeUndefined: Self = StObject.set(x, "microsoftStoreForBusinessLastSuccessfulSyncDateTime", js.undefined)
    
    inline def setMobileAppCategories(value: NullableOption[js.Array[MobileAppCategory]]): Self = StObject.set(x, "mobileAppCategories", value.asInstanceOf[js.Any])
    
    inline def setMobileAppCategoriesNull: Self = StObject.set(x, "mobileAppCategories", null)
    
    inline def setMobileAppCategoriesUndefined: Self = StObject.set(x, "mobileAppCategories", js.undefined)
    
    inline def setMobileAppCategoriesVarargs(value: MobileAppCategory*): Self = StObject.set(x, "mobileAppCategories", js.Array(value :_*))
    
    inline def setMobileAppConfigurations(value: NullableOption[js.Array[ManagedDeviceMobileAppConfiguration]]): Self = StObject.set(x, "mobileAppConfigurations", value.asInstanceOf[js.Any])
    
    inline def setMobileAppConfigurationsNull: Self = StObject.set(x, "mobileAppConfigurations", null)
    
    inline def setMobileAppConfigurationsUndefined: Self = StObject.set(x, "mobileAppConfigurations", js.undefined)
    
    inline def setMobileAppConfigurationsVarargs(value: ManagedDeviceMobileAppConfiguration*): Self = StObject.set(x, "mobileAppConfigurations", js.Array(value :_*))
    
    inline def setMobileApps(value: NullableOption[js.Array[MobileApp]]): Self = StObject.set(x, "mobileApps", value.asInstanceOf[js.Any])
    
    inline def setMobileAppsNull: Self = StObject.set(x, "mobileApps", null)
    
    inline def setMobileAppsUndefined: Self = StObject.set(x, "mobileApps", js.undefined)
    
    inline def setMobileAppsVarargs(value: MobileApp*): Self = StObject.set(x, "mobileApps", js.Array(value :_*))
    
    inline def setTargetedManagedAppConfigurations(value: NullableOption[js.Array[TargetedManagedAppConfiguration]]): Self = StObject.set(x, "targetedManagedAppConfigurations", value.asInstanceOf[js.Any])
    
    inline def setTargetedManagedAppConfigurationsNull: Self = StObject.set(x, "targetedManagedAppConfigurations", null)
    
    inline def setTargetedManagedAppConfigurationsUndefined: Self = StObject.set(x, "targetedManagedAppConfigurations", js.undefined)
    
    inline def setTargetedManagedAppConfigurationsVarargs(value: TargetedManagedAppConfiguration*): Self = StObject.set(x, "targetedManagedAppConfigurations", js.Array(value :_*))
    
    inline def setVppTokens(value: NullableOption[js.Array[VppToken]]): Self = StObject.set(x, "vppTokens", value.asInstanceOf[js.Any])
    
    inline def setVppTokensNull: Self = StObject.set(x, "vppTokens", null)
    
    inline def setVppTokensUndefined: Self = StObject.set(x, "vppTokens", js.undefined)
    
    inline def setVppTokensVarargs(value: VppToken*): Self = StObject.set(x, "vppTokens", js.Array(value :_*))
    
    inline def setWindowsInformationProtectionPolicies(value: NullableOption[js.Array[WindowsInformationProtectionPolicy]]): Self = StObject.set(x, "windowsInformationProtectionPolicies", value.asInstanceOf[js.Any])
    
    inline def setWindowsInformationProtectionPoliciesNull: Self = StObject.set(x, "windowsInformationProtectionPolicies", null)
    
    inline def setWindowsInformationProtectionPoliciesUndefined: Self = StObject.set(x, "windowsInformationProtectionPolicies", js.undefined)
    
    inline def setWindowsInformationProtectionPoliciesVarargs(value: WindowsInformationProtectionPolicy*): Self = StObject.set(x, "windowsInformationProtectionPolicies", js.Array(value :_*))
  }
}

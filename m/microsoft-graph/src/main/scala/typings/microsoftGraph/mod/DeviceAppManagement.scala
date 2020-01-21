package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceAppManagement extends Entity {
  // Android managed app policies.
  var androidManagedAppProtections: js.UndefOr[js.Array[AndroidManagedAppProtection]] = js.undefined
  // Default managed app policies.
  var defaultManagedAppProtections: js.UndefOr[js.Array[DefaultManagedAppProtection]] = js.undefined
  // iOS managed app policies.
  var iosManagedAppProtections: js.UndefOr[js.Array[IosManagedAppProtection]] = js.undefined
  // Whether the account is enabled for syncing applications from the Microsoft Store for Business.
  var isEnabledForMicrosoftStoreForBusiness: js.UndefOr[Boolean] = js.undefined
  // Managed app policies.
  var managedAppPolicies: js.UndefOr[js.Array[ManagedAppPolicy]] = js.undefined
  // The managed app registrations.
  var managedAppRegistrations: js.UndefOr[js.Array[ManagedAppRegistration]] = js.undefined
  // The managed app statuses.
  var managedAppStatuses: js.UndefOr[js.Array[ManagedAppStatus]] = js.undefined
  // The Managed eBook.
  var managedEBooks: js.UndefOr[js.Array[ManagedEBook]] = js.undefined
  // Windows information protection for apps running on devices which are MDM enrolled.
  var mdmWindowsInformationProtectionPolicies: js.UndefOr[js.Array[MdmWindowsInformationProtectionPolicy]] = js.undefined
  /**
    * The locale information used to sync applications from the Microsoft Store for Business. Cultures that are specific to a
    * country/region. The names of these cultures follow RFC 4646 (Windows Vista and later). The format is
    * -&amp;lt;country/regioncode2&amp;gt;, where is a lowercase two-letter code derived from ISO 639-1 and
    * &amp;lt;country/regioncode2&amp;gt; is an uppercase two-letter code derived from ISO 3166. For example, en-US for
    * English (United States) is a specific culture.
    */
  var microsoftStoreForBusinessLanguage: js.UndefOr[String] = js.undefined
  // The last time an application sync from the Microsoft Store for Business was completed.
  var microsoftStoreForBusinessLastCompletedApplicationSyncTime: js.UndefOr[String] = js.undefined
  // The last time the apps from the Microsoft Store for Business were synced successfully for the account.
  var microsoftStoreForBusinessLastSuccessfulSyncDateTime: js.UndefOr[String] = js.undefined
  // The mobile app categories.
  var mobileAppCategories: js.UndefOr[js.Array[MobileAppCategory]] = js.undefined
  // The Managed Device Mobile Application Configurations.
  var mobileAppConfigurations: js.UndefOr[js.Array[ManagedDeviceMobileAppConfiguration]] = js.undefined
  // The mobile apps.
  var mobileApps: js.UndefOr[js.Array[MobileApp]] = js.undefined
  // Targeted managed app configurations.
  var targetedManagedAppConfigurations: js.UndefOr[js.Array[TargetedManagedAppConfiguration]] = js.undefined
  // List of Vpp tokens for this organization.
  var vppTokens: js.UndefOr[js.Array[VppToken]] = js.undefined
  // Windows information protection for apps running on devices which are not MDM enrolled.
  var windowsInformationProtectionPolicies: js.UndefOr[js.Array[WindowsInformationProtectionPolicy]] = js.undefined
}

object DeviceAppManagement {
  @scala.inline
  def apply(
    androidManagedAppProtections: js.Array[AndroidManagedAppProtection] = null,
    defaultManagedAppProtections: js.Array[DefaultManagedAppProtection] = null,
    id: String = null,
    iosManagedAppProtections: js.Array[IosManagedAppProtection] = null,
    isEnabledForMicrosoftStoreForBusiness: js.UndefOr[Boolean] = js.undefined,
    managedAppPolicies: js.Array[ManagedAppPolicy] = null,
    managedAppRegistrations: js.Array[ManagedAppRegistration] = null,
    managedAppStatuses: js.Array[ManagedAppStatus] = null,
    managedEBooks: js.Array[ManagedEBook] = null,
    mdmWindowsInformationProtectionPolicies: js.Array[MdmWindowsInformationProtectionPolicy] = null,
    microsoftStoreForBusinessLanguage: String = null,
    microsoftStoreForBusinessLastCompletedApplicationSyncTime: String = null,
    microsoftStoreForBusinessLastSuccessfulSyncDateTime: String = null,
    mobileAppCategories: js.Array[MobileAppCategory] = null,
    mobileAppConfigurations: js.Array[ManagedDeviceMobileAppConfiguration] = null,
    mobileApps: js.Array[MobileApp] = null,
    targetedManagedAppConfigurations: js.Array[TargetedManagedAppConfiguration] = null,
    vppTokens: js.Array[VppToken] = null,
    windowsInformationProtectionPolicies: js.Array[WindowsInformationProtectionPolicy] = null
  ): DeviceAppManagement = {
    val __obj = js.Dynamic.literal()
    if (androidManagedAppProtections != null) __obj.updateDynamic("androidManagedAppProtections")(androidManagedAppProtections.asInstanceOf[js.Any])
    if (defaultManagedAppProtections != null) __obj.updateDynamic("defaultManagedAppProtections")(defaultManagedAppProtections.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (iosManagedAppProtections != null) __obj.updateDynamic("iosManagedAppProtections")(iosManagedAppProtections.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnabledForMicrosoftStoreForBusiness)) __obj.updateDynamic("isEnabledForMicrosoftStoreForBusiness")(isEnabledForMicrosoftStoreForBusiness.asInstanceOf[js.Any])
    if (managedAppPolicies != null) __obj.updateDynamic("managedAppPolicies")(managedAppPolicies.asInstanceOf[js.Any])
    if (managedAppRegistrations != null) __obj.updateDynamic("managedAppRegistrations")(managedAppRegistrations.asInstanceOf[js.Any])
    if (managedAppStatuses != null) __obj.updateDynamic("managedAppStatuses")(managedAppStatuses.asInstanceOf[js.Any])
    if (managedEBooks != null) __obj.updateDynamic("managedEBooks")(managedEBooks.asInstanceOf[js.Any])
    if (mdmWindowsInformationProtectionPolicies != null) __obj.updateDynamic("mdmWindowsInformationProtectionPolicies")(mdmWindowsInformationProtectionPolicies.asInstanceOf[js.Any])
    if (microsoftStoreForBusinessLanguage != null) __obj.updateDynamic("microsoftStoreForBusinessLanguage")(microsoftStoreForBusinessLanguage.asInstanceOf[js.Any])
    if (microsoftStoreForBusinessLastCompletedApplicationSyncTime != null) __obj.updateDynamic("microsoftStoreForBusinessLastCompletedApplicationSyncTime")(microsoftStoreForBusinessLastCompletedApplicationSyncTime.asInstanceOf[js.Any])
    if (microsoftStoreForBusinessLastSuccessfulSyncDateTime != null) __obj.updateDynamic("microsoftStoreForBusinessLastSuccessfulSyncDateTime")(microsoftStoreForBusinessLastSuccessfulSyncDateTime.asInstanceOf[js.Any])
    if (mobileAppCategories != null) __obj.updateDynamic("mobileAppCategories")(mobileAppCategories.asInstanceOf[js.Any])
    if (mobileAppConfigurations != null) __obj.updateDynamic("mobileAppConfigurations")(mobileAppConfigurations.asInstanceOf[js.Any])
    if (mobileApps != null) __obj.updateDynamic("mobileApps")(mobileApps.asInstanceOf[js.Any])
    if (targetedManagedAppConfigurations != null) __obj.updateDynamic("targetedManagedAppConfigurations")(targetedManagedAppConfigurations.asInstanceOf[js.Any])
    if (vppTokens != null) __obj.updateDynamic("vppTokens")(vppTokens.asInstanceOf[js.Any])
    if (windowsInformationProtectionPolicies != null) __obj.updateDynamic("windowsInformationProtectionPolicies")(windowsInformationProtectionPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceAppManagement]
  }
}


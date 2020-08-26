package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceAppManagement extends Entity {
  // Android managed app policies.
  var androidManagedAppProtections: js.UndefOr[js.Array[AndroidManagedAppProtection]] = js.native
  // Default managed app policies.
  var defaultManagedAppProtections: js.UndefOr[js.Array[DefaultManagedAppProtection]] = js.native
  // iOS managed app policies.
  var iosManagedAppProtections: js.UndefOr[js.Array[IosManagedAppProtection]] = js.native
  // Whether the account is enabled for syncing applications from the Microsoft Store for Business.
  var isEnabledForMicrosoftStoreForBusiness: js.UndefOr[Boolean] = js.native
  // Managed app policies.
  var managedAppPolicies: js.UndefOr[js.Array[ManagedAppPolicy]] = js.native
  // The managed app registrations.
  var managedAppRegistrations: js.UndefOr[js.Array[ManagedAppRegistration]] = js.native
  // The managed app statuses.
  var managedAppStatuses: js.UndefOr[js.Array[ManagedAppStatus]] = js.native
  // The Managed eBook.
  var managedEBooks: js.UndefOr[js.Array[ManagedEBook]] = js.native
  // Windows information protection for apps running on devices which are MDM enrolled.
  var mdmWindowsInformationProtectionPolicies: js.UndefOr[js.Array[MdmWindowsInformationProtectionPolicy]] = js.native
  /**
    * The locale information used to sync applications from the Microsoft Store for Business. Cultures that are specific to a
    * country/region. The names of these cultures follow RFC 4646 (Windows Vista and later). The format is
    * -&amp;lt;country/regioncode2&amp;gt;, where is a lowercase two-letter code derived from ISO 639-1 and
    * &amp;lt;country/regioncode2&amp;gt; is an uppercase two-letter code derived from ISO 3166. For example, en-US for
    * English (United States) is a specific culture.
    */
  var microsoftStoreForBusinessLanguage: js.UndefOr[String] = js.native
  // The last time an application sync from the Microsoft Store for Business was completed.
  var microsoftStoreForBusinessLastCompletedApplicationSyncTime: js.UndefOr[String] = js.native
  // The last time the apps from the Microsoft Store for Business were synced successfully for the account.
  var microsoftStoreForBusinessLastSuccessfulSyncDateTime: js.UndefOr[String] = js.native
  // The mobile app categories.
  var mobileAppCategories: js.UndefOr[js.Array[MobileAppCategory]] = js.native
  // The Managed Device Mobile Application Configurations.
  var mobileAppConfigurations: js.UndefOr[js.Array[ManagedDeviceMobileAppConfiguration]] = js.native
  // The mobile apps.
  var mobileApps: js.UndefOr[js.Array[MobileApp]] = js.native
  // Targeted managed app configurations.
  var targetedManagedAppConfigurations: js.UndefOr[js.Array[TargetedManagedAppConfiguration]] = js.native
  // List of Vpp tokens for this organization.
  var vppTokens: js.UndefOr[js.Array[VppToken]] = js.native
  // Windows information protection for apps running on devices which are not MDM enrolled.
  var windowsInformationProtectionPolicies: js.UndefOr[js.Array[WindowsInformationProtectionPolicy]] = js.native
}

object DeviceAppManagement {
  @scala.inline
  def apply(): DeviceAppManagement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceAppManagement]
  }
  @scala.inline
  implicit class DeviceAppManagementOps[Self <: DeviceAppManagement] (val x: Self) extends AnyVal {
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
    def setAndroidManagedAppProtectionsVarargs(value: AndroidManagedAppProtection*): Self = this.set("androidManagedAppProtections", js.Array(value :_*))
    @scala.inline
    def setAndroidManagedAppProtections(value: js.Array[AndroidManagedAppProtection]): Self = this.set("androidManagedAppProtections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidManagedAppProtections: Self = this.set("androidManagedAppProtections", js.undefined)
    @scala.inline
    def setDefaultManagedAppProtectionsVarargs(value: DefaultManagedAppProtection*): Self = this.set("defaultManagedAppProtections", js.Array(value :_*))
    @scala.inline
    def setDefaultManagedAppProtections(value: js.Array[DefaultManagedAppProtection]): Self = this.set("defaultManagedAppProtections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultManagedAppProtections: Self = this.set("defaultManagedAppProtections", js.undefined)
    @scala.inline
    def setIosManagedAppProtectionsVarargs(value: IosManagedAppProtection*): Self = this.set("iosManagedAppProtections", js.Array(value :_*))
    @scala.inline
    def setIosManagedAppProtections(value: js.Array[IosManagedAppProtection]): Self = this.set("iosManagedAppProtections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosManagedAppProtections: Self = this.set("iosManagedAppProtections", js.undefined)
    @scala.inline
    def setIsEnabledForMicrosoftStoreForBusiness(value: Boolean): Self = this.set("isEnabledForMicrosoftStoreForBusiness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEnabledForMicrosoftStoreForBusiness: Self = this.set("isEnabledForMicrosoftStoreForBusiness", js.undefined)
    @scala.inline
    def setManagedAppPoliciesVarargs(value: ManagedAppPolicy*): Self = this.set("managedAppPolicies", js.Array(value :_*))
    @scala.inline
    def setManagedAppPolicies(value: js.Array[ManagedAppPolicy]): Self = this.set("managedAppPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedAppPolicies: Self = this.set("managedAppPolicies", js.undefined)
    @scala.inline
    def setManagedAppRegistrationsVarargs(value: ManagedAppRegistration*): Self = this.set("managedAppRegistrations", js.Array(value :_*))
    @scala.inline
    def setManagedAppRegistrations(value: js.Array[ManagedAppRegistration]): Self = this.set("managedAppRegistrations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedAppRegistrations: Self = this.set("managedAppRegistrations", js.undefined)
    @scala.inline
    def setManagedAppStatusesVarargs(value: ManagedAppStatus*): Self = this.set("managedAppStatuses", js.Array(value :_*))
    @scala.inline
    def setManagedAppStatuses(value: js.Array[ManagedAppStatus]): Self = this.set("managedAppStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedAppStatuses: Self = this.set("managedAppStatuses", js.undefined)
    @scala.inline
    def setManagedEBooksVarargs(value: ManagedEBook*): Self = this.set("managedEBooks", js.Array(value :_*))
    @scala.inline
    def setManagedEBooks(value: js.Array[ManagedEBook]): Self = this.set("managedEBooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedEBooks: Self = this.set("managedEBooks", js.undefined)
    @scala.inline
    def setMdmWindowsInformationProtectionPoliciesVarargs(value: MdmWindowsInformationProtectionPolicy*): Self = this.set("mdmWindowsInformationProtectionPolicies", js.Array(value :_*))
    @scala.inline
    def setMdmWindowsInformationProtectionPolicies(value: js.Array[MdmWindowsInformationProtectionPolicy]): Self = this.set("mdmWindowsInformationProtectionPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMdmWindowsInformationProtectionPolicies: Self = this.set("mdmWindowsInformationProtectionPolicies", js.undefined)
    @scala.inline
    def setMicrosoftStoreForBusinessLanguage(value: String): Self = this.set("microsoftStoreForBusinessLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrosoftStoreForBusinessLanguage: Self = this.set("microsoftStoreForBusinessLanguage", js.undefined)
    @scala.inline
    def setMicrosoftStoreForBusinessLastCompletedApplicationSyncTime(value: String): Self = this.set("microsoftStoreForBusinessLastCompletedApplicationSyncTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrosoftStoreForBusinessLastCompletedApplicationSyncTime: Self = this.set("microsoftStoreForBusinessLastCompletedApplicationSyncTime", js.undefined)
    @scala.inline
    def setMicrosoftStoreForBusinessLastSuccessfulSyncDateTime(value: String): Self = this.set("microsoftStoreForBusinessLastSuccessfulSyncDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrosoftStoreForBusinessLastSuccessfulSyncDateTime: Self = this.set("microsoftStoreForBusinessLastSuccessfulSyncDateTime", js.undefined)
    @scala.inline
    def setMobileAppCategoriesVarargs(value: MobileAppCategory*): Self = this.set("mobileAppCategories", js.Array(value :_*))
    @scala.inline
    def setMobileAppCategories(value: js.Array[MobileAppCategory]): Self = this.set("mobileAppCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileAppCategories: Self = this.set("mobileAppCategories", js.undefined)
    @scala.inline
    def setMobileAppConfigurationsVarargs(value: ManagedDeviceMobileAppConfiguration*): Self = this.set("mobileAppConfigurations", js.Array(value :_*))
    @scala.inline
    def setMobileAppConfigurations(value: js.Array[ManagedDeviceMobileAppConfiguration]): Self = this.set("mobileAppConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileAppConfigurations: Self = this.set("mobileAppConfigurations", js.undefined)
    @scala.inline
    def setMobileAppsVarargs(value: MobileApp*): Self = this.set("mobileApps", js.Array(value :_*))
    @scala.inline
    def setMobileApps(value: js.Array[MobileApp]): Self = this.set("mobileApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileApps: Self = this.set("mobileApps", js.undefined)
    @scala.inline
    def setTargetedManagedAppConfigurationsVarargs(value: TargetedManagedAppConfiguration*): Self = this.set("targetedManagedAppConfigurations", js.Array(value :_*))
    @scala.inline
    def setTargetedManagedAppConfigurations(value: js.Array[TargetedManagedAppConfiguration]): Self = this.set("targetedManagedAppConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetedManagedAppConfigurations: Self = this.set("targetedManagedAppConfigurations", js.undefined)
    @scala.inline
    def setVppTokensVarargs(value: VppToken*): Self = this.set("vppTokens", js.Array(value :_*))
    @scala.inline
    def setVppTokens(value: js.Array[VppToken]): Self = this.set("vppTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVppTokens: Self = this.set("vppTokens", js.undefined)
    @scala.inline
    def setWindowsInformationProtectionPoliciesVarargs(value: WindowsInformationProtectionPolicy*): Self = this.set("windowsInformationProtectionPolicies", js.Array(value :_*))
    @scala.inline
    def setWindowsInformationProtectionPolicies(value: js.Array[WindowsInformationProtectionPolicy]): Self = this.set("windowsInformationProtectionPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowsInformationProtectionPolicies: Self = this.set("windowsInformationProtectionPolicies", js.undefined)
  }
  
}


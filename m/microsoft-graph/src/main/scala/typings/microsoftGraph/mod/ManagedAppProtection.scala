package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedAppProtection extends ManagedAppPolicy {
  
  // Data storage locations where a user may store managed data.
  var allowedDataStorageLocations: js.UndefOr[js.Array[ManagedAppDataStorageLocation]] = js.native
  
  // Sources from which data is allowed to be transferred. Possible values are: allApps, managedApps, none.
  var allowedInboundDataTransferSources: js.UndefOr[ManagedAppDataTransferLevel] = js.native
  
  /**
    * The level to which the clipboard may be shared between apps on the managed device. Possible values are: allApps,
    * managedAppsWithPasteIn, managedApps, blocked.
    */
  var allowedOutboundClipboardSharingLevel: js.UndefOr[ManagedAppClipboardSharingLevel] = js.native
  
  // Destinations to which data is allowed to be transferred. Possible values are: allApps, managedApps, none.
  var allowedOutboundDataTransferDestinations: js.UndefOr[ManagedAppDataTransferLevel] = js.native
  
  // Indicates whether contacts can be synced to the user's device.
  var contactSyncBlocked: js.UndefOr[Boolean] = js.native
  
  // Indicates whether the backup of a managed app's data is blocked.
  var dataBackupBlocked: js.UndefOr[Boolean] = js.native
  
  // Indicates whether device compliance is required.
  var deviceComplianceRequired: js.UndefOr[Boolean] = js.native
  
  // Indicates whether use of the app pin is required if the device pin is set.
  var disableAppPinIfDevicePinIsSet: js.UndefOr[Boolean] = js.native
  
  // Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
  var fingerprintBlocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates in which managed browser(s) that internet links should be opened. When this property is configured,
    * ManagedBrowserToOpenLinksRequired should be true. Possible values are: notConfigured, microsoftEdge.
    */
  var managedBrowser: js.UndefOr[ManagedBrowserType] = js.native
  
  /**
    * Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by
    * CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
    */
  var managedBrowserToOpenLinksRequired: js.UndefOr[Boolean] = js.native
  
  // Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
  var maximumPinRetries: js.UndefOr[Double] = js.native
  
  // Minimum pin length required for an app-level pin if PinRequired is set to True
  var minimumPinLength: js.UndefOr[Double] = js.native
  
  // Versions less than the specified version will block the managed app from accessing company data.
  var minimumRequiredAppVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Versions less than the specified version will block the managed app from accessing company data.
  var minimumRequiredOsVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Versions less than the specified version will result in warning message on the managed app.
  var minimumWarningAppVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Versions less than the specified version will result in warning message on the managed app from accessing company data.
  var minimumWarningOsVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates whether organizational credentials are required for app use.
  var organizationalCredentialsRequired: js.UndefOr[Boolean] = js.native
  
  // TimePeriod before the all-level pin must be reset if PinRequired is set to True.
  var periodBeforePinReset: js.UndefOr[String] = js.native
  
  // The period after which access is checked when the device is not connected to the internet.
  var periodOfflineBeforeAccessCheck: js.UndefOr[String] = js.native
  
  // The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
  var periodOfflineBeforeWipeIsEnforced: js.UndefOr[String] = js.native
  
  // The period after which access is checked when the device is connected to the internet.
  var periodOnlineBeforeAccessCheck: js.UndefOr[String] = js.native
  
  /**
    * Character set which may be used for an app-level pin if PinRequired is set to True. Possible values are: numeric,
    * alphanumericAndSymbol.
    */
  var pinCharacterSet: js.UndefOr[ManagedAppPinCharacterSet] = js.native
  
  // Indicates whether an app-level pin is required.
  var pinRequired: js.UndefOr[Boolean] = js.native
  
  // Indicates whether printing is allowed from managed apps.
  var printBlocked: js.UndefOr[Boolean] = js.native
  
  // Indicates whether users may use the 'Save As' menu item to save a copy of protected files.
  var saveAsBlocked: js.UndefOr[Boolean] = js.native
  
  // Indicates whether simplePin is blocked.
  var simplePinBlocked: js.UndefOr[Boolean] = js.native
}
object ManagedAppProtection {
  
  @scala.inline
  def apply(): ManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppProtection]
  }
  
  @scala.inline
  implicit class ManagedAppProtectionOps[Self <: ManagedAppProtection] (val x: Self) extends AnyVal {
    
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
    def setAllowedDataStorageLocationsVarargs(value: ManagedAppDataStorageLocation*): Self = this.set("allowedDataStorageLocations", js.Array(value :_*))
    
    @scala.inline
    def setAllowedDataStorageLocations(value: js.Array[ManagedAppDataStorageLocation]): Self = this.set("allowedDataStorageLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedDataStorageLocations: Self = this.set("allowedDataStorageLocations", js.undefined)
    
    @scala.inline
    def setAllowedInboundDataTransferSources(value: ManagedAppDataTransferLevel): Self = this.set("allowedInboundDataTransferSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedInboundDataTransferSources: Self = this.set("allowedInboundDataTransferSources", js.undefined)
    
    @scala.inline
    def setAllowedOutboundClipboardSharingLevel(value: ManagedAppClipboardSharingLevel): Self = this.set("allowedOutboundClipboardSharingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedOutboundClipboardSharingLevel: Self = this.set("allowedOutboundClipboardSharingLevel", js.undefined)
    
    @scala.inline
    def setAllowedOutboundDataTransferDestinations(value: ManagedAppDataTransferLevel): Self = this.set("allowedOutboundDataTransferDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedOutboundDataTransferDestinations: Self = this.set("allowedOutboundDataTransferDestinations", js.undefined)
    
    @scala.inline
    def setContactSyncBlocked(value: Boolean): Self = this.set("contactSyncBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactSyncBlocked: Self = this.set("contactSyncBlocked", js.undefined)
    
    @scala.inline
    def setDataBackupBlocked(value: Boolean): Self = this.set("dataBackupBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataBackupBlocked: Self = this.set("dataBackupBlocked", js.undefined)
    
    @scala.inline
    def setDeviceComplianceRequired(value: Boolean): Self = this.set("deviceComplianceRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceComplianceRequired: Self = this.set("deviceComplianceRequired", js.undefined)
    
    @scala.inline
    def setDisableAppPinIfDevicePinIsSet(value: Boolean): Self = this.set("disableAppPinIfDevicePinIsSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAppPinIfDevicePinIsSet: Self = this.set("disableAppPinIfDevicePinIsSet", js.undefined)
    
    @scala.inline
    def setFingerprintBlocked(value: Boolean): Self = this.set("fingerprintBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprintBlocked: Self = this.set("fingerprintBlocked", js.undefined)
    
    @scala.inline
    def setManagedBrowser(value: ManagedBrowserType): Self = this.set("managedBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedBrowser: Self = this.set("managedBrowser", js.undefined)
    
    @scala.inline
    def setManagedBrowserToOpenLinksRequired(value: Boolean): Self = this.set("managedBrowserToOpenLinksRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedBrowserToOpenLinksRequired: Self = this.set("managedBrowserToOpenLinksRequired", js.undefined)
    
    @scala.inline
    def setMaximumPinRetries(value: Double): Self = this.set("maximumPinRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumPinRetries: Self = this.set("maximumPinRetries", js.undefined)
    
    @scala.inline
    def setMinimumPinLength(value: Double): Self = this.set("minimumPinLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumPinLength: Self = this.set("minimumPinLength", js.undefined)
    
    @scala.inline
    def setMinimumRequiredAppVersion(value: NullableOption[String]): Self = this.set("minimumRequiredAppVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumRequiredAppVersion: Self = this.set("minimumRequiredAppVersion", js.undefined)
    
    @scala.inline
    def setMinimumRequiredAppVersionNull: Self = this.set("minimumRequiredAppVersion", null)
    
    @scala.inline
    def setMinimumRequiredOsVersion(value: NullableOption[String]): Self = this.set("minimumRequiredOsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumRequiredOsVersion: Self = this.set("minimumRequiredOsVersion", js.undefined)
    
    @scala.inline
    def setMinimumRequiredOsVersionNull: Self = this.set("minimumRequiredOsVersion", null)
    
    @scala.inline
    def setMinimumWarningAppVersion(value: NullableOption[String]): Self = this.set("minimumWarningAppVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumWarningAppVersion: Self = this.set("minimumWarningAppVersion", js.undefined)
    
    @scala.inline
    def setMinimumWarningAppVersionNull: Self = this.set("minimumWarningAppVersion", null)
    
    @scala.inline
    def setMinimumWarningOsVersion(value: NullableOption[String]): Self = this.set("minimumWarningOsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumWarningOsVersion: Self = this.set("minimumWarningOsVersion", js.undefined)
    
    @scala.inline
    def setMinimumWarningOsVersionNull: Self = this.set("minimumWarningOsVersion", null)
    
    @scala.inline
    def setOrganizationalCredentialsRequired(value: Boolean): Self = this.set("organizationalCredentialsRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationalCredentialsRequired: Self = this.set("organizationalCredentialsRequired", js.undefined)
    
    @scala.inline
    def setPeriodBeforePinReset(value: String): Self = this.set("periodBeforePinReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodBeforePinReset: Self = this.set("periodBeforePinReset", js.undefined)
    
    @scala.inline
    def setPeriodOfflineBeforeAccessCheck(value: String): Self = this.set("periodOfflineBeforeAccessCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodOfflineBeforeAccessCheck: Self = this.set("periodOfflineBeforeAccessCheck", js.undefined)
    
    @scala.inline
    def setPeriodOfflineBeforeWipeIsEnforced(value: String): Self = this.set("periodOfflineBeforeWipeIsEnforced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodOfflineBeforeWipeIsEnforced: Self = this.set("periodOfflineBeforeWipeIsEnforced", js.undefined)
    
    @scala.inline
    def setPeriodOnlineBeforeAccessCheck(value: String): Self = this.set("periodOnlineBeforeAccessCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodOnlineBeforeAccessCheck: Self = this.set("periodOnlineBeforeAccessCheck", js.undefined)
    
    @scala.inline
    def setPinCharacterSet(value: ManagedAppPinCharacterSet): Self = this.set("pinCharacterSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinCharacterSet: Self = this.set("pinCharacterSet", js.undefined)
    
    @scala.inline
    def setPinRequired(value: Boolean): Self = this.set("pinRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinRequired: Self = this.set("pinRequired", js.undefined)
    
    @scala.inline
    def setPrintBlocked(value: Boolean): Self = this.set("printBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintBlocked: Self = this.set("printBlocked", js.undefined)
    
    @scala.inline
    def setSaveAsBlocked(value: Boolean): Self = this.set("saveAsBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveAsBlocked: Self = this.set("saveAsBlocked", js.undefined)
    
    @scala.inline
    def setSimplePinBlocked(value: Boolean): Self = this.set("simplePinBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimplePinBlocked: Self = this.set("simplePinBlocked", js.undefined)
  }
}

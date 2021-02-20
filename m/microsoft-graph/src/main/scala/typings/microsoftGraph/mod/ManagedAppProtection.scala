package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ManagedAppProtectionMutableBuilder[Self <: ManagedAppProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedDataStorageLocations(value: js.Array[ManagedAppDataStorageLocation]): Self = StObject.set(x, "allowedDataStorageLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedDataStorageLocationsUndefined: Self = StObject.set(x, "allowedDataStorageLocations", js.undefined)
    
    @scala.inline
    def setAllowedDataStorageLocationsVarargs(value: ManagedAppDataStorageLocation*): Self = StObject.set(x, "allowedDataStorageLocations", js.Array(value :_*))
    
    @scala.inline
    def setAllowedInboundDataTransferSources(value: ManagedAppDataTransferLevel): Self = StObject.set(x, "allowedInboundDataTransferSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedInboundDataTransferSourcesUndefined: Self = StObject.set(x, "allowedInboundDataTransferSources", js.undefined)
    
    @scala.inline
    def setAllowedOutboundClipboardSharingLevel(value: ManagedAppClipboardSharingLevel): Self = StObject.set(x, "allowedOutboundClipboardSharingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedOutboundClipboardSharingLevelUndefined: Self = StObject.set(x, "allowedOutboundClipboardSharingLevel", js.undefined)
    
    @scala.inline
    def setAllowedOutboundDataTransferDestinations(value: ManagedAppDataTransferLevel): Self = StObject.set(x, "allowedOutboundDataTransferDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedOutboundDataTransferDestinationsUndefined: Self = StObject.set(x, "allowedOutboundDataTransferDestinations", js.undefined)
    
    @scala.inline
    def setContactSyncBlocked(value: Boolean): Self = StObject.set(x, "contactSyncBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactSyncBlockedUndefined: Self = StObject.set(x, "contactSyncBlocked", js.undefined)
    
    @scala.inline
    def setDataBackupBlocked(value: Boolean): Self = StObject.set(x, "dataBackupBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataBackupBlockedUndefined: Self = StObject.set(x, "dataBackupBlocked", js.undefined)
    
    @scala.inline
    def setDeviceComplianceRequired(value: Boolean): Self = StObject.set(x, "deviceComplianceRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceComplianceRequiredUndefined: Self = StObject.set(x, "deviceComplianceRequired", js.undefined)
    
    @scala.inline
    def setDisableAppPinIfDevicePinIsSet(value: Boolean): Self = StObject.set(x, "disableAppPinIfDevicePinIsSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAppPinIfDevicePinIsSetUndefined: Self = StObject.set(x, "disableAppPinIfDevicePinIsSet", js.undefined)
    
    @scala.inline
    def setFingerprintBlocked(value: Boolean): Self = StObject.set(x, "fingerprintBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintBlockedUndefined: Self = StObject.set(x, "fingerprintBlocked", js.undefined)
    
    @scala.inline
    def setManagedBrowser(value: ManagedBrowserType): Self = StObject.set(x, "managedBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedBrowserToOpenLinksRequired(value: Boolean): Self = StObject.set(x, "managedBrowserToOpenLinksRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedBrowserToOpenLinksRequiredUndefined: Self = StObject.set(x, "managedBrowserToOpenLinksRequired", js.undefined)
    
    @scala.inline
    def setManagedBrowserUndefined: Self = StObject.set(x, "managedBrowser", js.undefined)
    
    @scala.inline
    def setMaximumPinRetries(value: Double): Self = StObject.set(x, "maximumPinRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPinRetriesUndefined: Self = StObject.set(x, "maximumPinRetries", js.undefined)
    
    @scala.inline
    def setMinimumPinLength(value: Double): Self = StObject.set(x, "minimumPinLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumPinLengthUndefined: Self = StObject.set(x, "minimumPinLength", js.undefined)
    
    @scala.inline
    def setMinimumRequiredAppVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumRequiredAppVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumRequiredAppVersionNull: Self = StObject.set(x, "minimumRequiredAppVersion", null)
    
    @scala.inline
    def setMinimumRequiredAppVersionUndefined: Self = StObject.set(x, "minimumRequiredAppVersion", js.undefined)
    
    @scala.inline
    def setMinimumRequiredOsVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumRequiredOsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumRequiredOsVersionNull: Self = StObject.set(x, "minimumRequiredOsVersion", null)
    
    @scala.inline
    def setMinimumRequiredOsVersionUndefined: Self = StObject.set(x, "minimumRequiredOsVersion", js.undefined)
    
    @scala.inline
    def setMinimumWarningAppVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumWarningAppVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumWarningAppVersionNull: Self = StObject.set(x, "minimumWarningAppVersion", null)
    
    @scala.inline
    def setMinimumWarningAppVersionUndefined: Self = StObject.set(x, "minimumWarningAppVersion", js.undefined)
    
    @scala.inline
    def setMinimumWarningOsVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumWarningOsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumWarningOsVersionNull: Self = StObject.set(x, "minimumWarningOsVersion", null)
    
    @scala.inline
    def setMinimumWarningOsVersionUndefined: Self = StObject.set(x, "minimumWarningOsVersion", js.undefined)
    
    @scala.inline
    def setOrganizationalCredentialsRequired(value: Boolean): Self = StObject.set(x, "organizationalCredentialsRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationalCredentialsRequiredUndefined: Self = StObject.set(x, "organizationalCredentialsRequired", js.undefined)
    
    @scala.inline
    def setPeriodBeforePinReset(value: String): Self = StObject.set(x, "periodBeforePinReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodBeforePinResetUndefined: Self = StObject.set(x, "periodBeforePinReset", js.undefined)
    
    @scala.inline
    def setPeriodOfflineBeforeAccessCheck(value: String): Self = StObject.set(x, "periodOfflineBeforeAccessCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodOfflineBeforeAccessCheckUndefined: Self = StObject.set(x, "periodOfflineBeforeAccessCheck", js.undefined)
    
    @scala.inline
    def setPeriodOfflineBeforeWipeIsEnforced(value: String): Self = StObject.set(x, "periodOfflineBeforeWipeIsEnforced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodOfflineBeforeWipeIsEnforcedUndefined: Self = StObject.set(x, "periodOfflineBeforeWipeIsEnforced", js.undefined)
    
    @scala.inline
    def setPeriodOnlineBeforeAccessCheck(value: String): Self = StObject.set(x, "periodOnlineBeforeAccessCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodOnlineBeforeAccessCheckUndefined: Self = StObject.set(x, "periodOnlineBeforeAccessCheck", js.undefined)
    
    @scala.inline
    def setPinCharacterSet(value: ManagedAppPinCharacterSet): Self = StObject.set(x, "pinCharacterSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinCharacterSetUndefined: Self = StObject.set(x, "pinCharacterSet", js.undefined)
    
    @scala.inline
    def setPinRequired(value: Boolean): Self = StObject.set(x, "pinRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinRequiredUndefined: Self = StObject.set(x, "pinRequired", js.undefined)
    
    @scala.inline
    def setPrintBlocked(value: Boolean): Self = StObject.set(x, "printBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintBlockedUndefined: Self = StObject.set(x, "printBlocked", js.undefined)
    
    @scala.inline
    def setSaveAsBlocked(value: Boolean): Self = StObject.set(x, "saveAsBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveAsBlockedUndefined: Self = StObject.set(x, "saveAsBlocked", js.undefined)
    
    @scala.inline
    def setSimplePinBlocked(value: Boolean): Self = StObject.set(x, "simplePinBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimplePinBlockedUndefined: Self = StObject.set(x, "simplePinBlocked", js.undefined)
  }
}

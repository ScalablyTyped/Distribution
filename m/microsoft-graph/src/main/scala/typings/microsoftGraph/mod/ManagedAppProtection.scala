package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedAppProtection
  extends StObject
     with ManagedAppPolicy {
  
  // Data storage locations where a user may store managed data.
  var allowedDataStorageLocations: js.UndefOr[js.Array[ManagedAppDataStorageLocation]] = js.undefined
  
  // Sources from which data is allowed to be transferred. Possible values are: allApps, managedApps, none.
  var allowedInboundDataTransferSources: js.UndefOr[ManagedAppDataTransferLevel] = js.undefined
  
  /**
    * The level to which the clipboard may be shared between apps on the managed device. Possible values are: allApps,
    * managedAppsWithPasteIn, managedApps, blocked.
    */
  var allowedOutboundClipboardSharingLevel: js.UndefOr[ManagedAppClipboardSharingLevel] = js.undefined
  
  // Destinations to which data is allowed to be transferred. Possible values are: allApps, managedApps, none.
  var allowedOutboundDataTransferDestinations: js.UndefOr[ManagedAppDataTransferLevel] = js.undefined
  
  // Indicates whether contacts can be synced to the user's device.
  var contactSyncBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether the backup of a managed app's data is blocked.
  var dataBackupBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether device compliance is required.
  var deviceComplianceRequired: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether use of the app pin is required if the device pin is set.
  var disableAppPinIfDevicePinIsSet: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
  var fingerprintBlocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates in which managed browser(s) that internet links should be opened. When this property is configured,
    * ManagedBrowserToOpenLinksRequired should be true. Possible values are: notConfigured, microsoftEdge.
    */
  var managedBrowser: js.UndefOr[ManagedBrowserType] = js.undefined
  
  /**
    * Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by
    * CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
    */
  var managedBrowserToOpenLinksRequired: js.UndefOr[Boolean] = js.undefined
  
  // Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
  var maximumPinRetries: js.UndefOr[Double] = js.undefined
  
  // Minimum pin length required for an app-level pin if PinRequired is set to True
  var minimumPinLength: js.UndefOr[Double] = js.undefined
  
  // Versions less than the specified version will block the managed app from accessing company data.
  var minimumRequiredAppVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Versions less than the specified version will block the managed app from accessing company data.
  var minimumRequiredOsVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Versions less than the specified version will result in warning message on the managed app.
  var minimumWarningAppVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Versions less than the specified version will result in warning message on the managed app from accessing company data.
  var minimumWarningOsVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether organizational credentials are required for app use.
  var organizationalCredentialsRequired: js.UndefOr[Boolean] = js.undefined
  
  // TimePeriod before the all-level pin must be reset if PinRequired is set to True.
  var periodBeforePinReset: js.UndefOr[String] = js.undefined
  
  // The period after which access is checked when the device is not connected to the internet.
  var periodOfflineBeforeAccessCheck: js.UndefOr[String] = js.undefined
  
  // The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
  var periodOfflineBeforeWipeIsEnforced: js.UndefOr[String] = js.undefined
  
  // The period after which access is checked when the device is connected to the internet.
  var periodOnlineBeforeAccessCheck: js.UndefOr[String] = js.undefined
  
  /**
    * Character set which may be used for an app-level pin if PinRequired is set to True. Possible values are: numeric,
    * alphanumericAndSymbol.
    */
  var pinCharacterSet: js.UndefOr[ManagedAppPinCharacterSet] = js.undefined
  
  // Indicates whether an app-level pin is required.
  var pinRequired: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether printing is allowed from managed apps.
  var printBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether users may use the 'Save As' menu item to save a copy of protected files.
  var saveAsBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether simplePin is blocked.
  var simplePinBlocked: js.UndefOr[Boolean] = js.undefined
}
object ManagedAppProtection {
  
  inline def apply(): ManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppProtection]
  }
  
  extension [Self <: ManagedAppProtection](x: Self) {
    
    inline def setAllowedDataStorageLocations(value: js.Array[ManagedAppDataStorageLocation]): Self = StObject.set(x, "allowedDataStorageLocations", value.asInstanceOf[js.Any])
    
    inline def setAllowedDataStorageLocationsUndefined: Self = StObject.set(x, "allowedDataStorageLocations", js.undefined)
    
    inline def setAllowedDataStorageLocationsVarargs(value: ManagedAppDataStorageLocation*): Self = StObject.set(x, "allowedDataStorageLocations", js.Array(value*))
    
    inline def setAllowedInboundDataTransferSources(value: ManagedAppDataTransferLevel): Self = StObject.set(x, "allowedInboundDataTransferSources", value.asInstanceOf[js.Any])
    
    inline def setAllowedInboundDataTransferSourcesUndefined: Self = StObject.set(x, "allowedInboundDataTransferSources", js.undefined)
    
    inline def setAllowedOutboundClipboardSharingLevel(value: ManagedAppClipboardSharingLevel): Self = StObject.set(x, "allowedOutboundClipboardSharingLevel", value.asInstanceOf[js.Any])
    
    inline def setAllowedOutboundClipboardSharingLevelUndefined: Self = StObject.set(x, "allowedOutboundClipboardSharingLevel", js.undefined)
    
    inline def setAllowedOutboundDataTransferDestinations(value: ManagedAppDataTransferLevel): Self = StObject.set(x, "allowedOutboundDataTransferDestinations", value.asInstanceOf[js.Any])
    
    inline def setAllowedOutboundDataTransferDestinationsUndefined: Self = StObject.set(x, "allowedOutboundDataTransferDestinations", js.undefined)
    
    inline def setContactSyncBlocked(value: Boolean): Self = StObject.set(x, "contactSyncBlocked", value.asInstanceOf[js.Any])
    
    inline def setContactSyncBlockedUndefined: Self = StObject.set(x, "contactSyncBlocked", js.undefined)
    
    inline def setDataBackupBlocked(value: Boolean): Self = StObject.set(x, "dataBackupBlocked", value.asInstanceOf[js.Any])
    
    inline def setDataBackupBlockedUndefined: Self = StObject.set(x, "dataBackupBlocked", js.undefined)
    
    inline def setDeviceComplianceRequired(value: Boolean): Self = StObject.set(x, "deviceComplianceRequired", value.asInstanceOf[js.Any])
    
    inline def setDeviceComplianceRequiredUndefined: Self = StObject.set(x, "deviceComplianceRequired", js.undefined)
    
    inline def setDisableAppPinIfDevicePinIsSet(value: Boolean): Self = StObject.set(x, "disableAppPinIfDevicePinIsSet", value.asInstanceOf[js.Any])
    
    inline def setDisableAppPinIfDevicePinIsSetUndefined: Self = StObject.set(x, "disableAppPinIfDevicePinIsSet", js.undefined)
    
    inline def setFingerprintBlocked(value: Boolean): Self = StObject.set(x, "fingerprintBlocked", value.asInstanceOf[js.Any])
    
    inline def setFingerprintBlockedUndefined: Self = StObject.set(x, "fingerprintBlocked", js.undefined)
    
    inline def setManagedBrowser(value: ManagedBrowserType): Self = StObject.set(x, "managedBrowser", value.asInstanceOf[js.Any])
    
    inline def setManagedBrowserToOpenLinksRequired(value: Boolean): Self = StObject.set(x, "managedBrowserToOpenLinksRequired", value.asInstanceOf[js.Any])
    
    inline def setManagedBrowserToOpenLinksRequiredUndefined: Self = StObject.set(x, "managedBrowserToOpenLinksRequired", js.undefined)
    
    inline def setManagedBrowserUndefined: Self = StObject.set(x, "managedBrowser", js.undefined)
    
    inline def setMaximumPinRetries(value: Double): Self = StObject.set(x, "maximumPinRetries", value.asInstanceOf[js.Any])
    
    inline def setMaximumPinRetriesUndefined: Self = StObject.set(x, "maximumPinRetries", js.undefined)
    
    inline def setMinimumPinLength(value: Double): Self = StObject.set(x, "minimumPinLength", value.asInstanceOf[js.Any])
    
    inline def setMinimumPinLengthUndefined: Self = StObject.set(x, "minimumPinLength", js.undefined)
    
    inline def setMinimumRequiredAppVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumRequiredAppVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumRequiredAppVersionNull: Self = StObject.set(x, "minimumRequiredAppVersion", null)
    
    inline def setMinimumRequiredAppVersionUndefined: Self = StObject.set(x, "minimumRequiredAppVersion", js.undefined)
    
    inline def setMinimumRequiredOsVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumRequiredOsVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumRequiredOsVersionNull: Self = StObject.set(x, "minimumRequiredOsVersion", null)
    
    inline def setMinimumRequiredOsVersionUndefined: Self = StObject.set(x, "minimumRequiredOsVersion", js.undefined)
    
    inline def setMinimumWarningAppVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumWarningAppVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumWarningAppVersionNull: Self = StObject.set(x, "minimumWarningAppVersion", null)
    
    inline def setMinimumWarningAppVersionUndefined: Self = StObject.set(x, "minimumWarningAppVersion", js.undefined)
    
    inline def setMinimumWarningOsVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumWarningOsVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumWarningOsVersionNull: Self = StObject.set(x, "minimumWarningOsVersion", null)
    
    inline def setMinimumWarningOsVersionUndefined: Self = StObject.set(x, "minimumWarningOsVersion", js.undefined)
    
    inline def setOrganizationalCredentialsRequired(value: Boolean): Self = StObject.set(x, "organizationalCredentialsRequired", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalCredentialsRequiredUndefined: Self = StObject.set(x, "organizationalCredentialsRequired", js.undefined)
    
    inline def setPeriodBeforePinReset(value: String): Self = StObject.set(x, "periodBeforePinReset", value.asInstanceOf[js.Any])
    
    inline def setPeriodBeforePinResetUndefined: Self = StObject.set(x, "periodBeforePinReset", js.undefined)
    
    inline def setPeriodOfflineBeforeAccessCheck(value: String): Self = StObject.set(x, "periodOfflineBeforeAccessCheck", value.asInstanceOf[js.Any])
    
    inline def setPeriodOfflineBeforeAccessCheckUndefined: Self = StObject.set(x, "periodOfflineBeforeAccessCheck", js.undefined)
    
    inline def setPeriodOfflineBeforeWipeIsEnforced(value: String): Self = StObject.set(x, "periodOfflineBeforeWipeIsEnforced", value.asInstanceOf[js.Any])
    
    inline def setPeriodOfflineBeforeWipeIsEnforcedUndefined: Self = StObject.set(x, "periodOfflineBeforeWipeIsEnforced", js.undefined)
    
    inline def setPeriodOnlineBeforeAccessCheck(value: String): Self = StObject.set(x, "periodOnlineBeforeAccessCheck", value.asInstanceOf[js.Any])
    
    inline def setPeriodOnlineBeforeAccessCheckUndefined: Self = StObject.set(x, "periodOnlineBeforeAccessCheck", js.undefined)
    
    inline def setPinCharacterSet(value: ManagedAppPinCharacterSet): Self = StObject.set(x, "pinCharacterSet", value.asInstanceOf[js.Any])
    
    inline def setPinCharacterSetUndefined: Self = StObject.set(x, "pinCharacterSet", js.undefined)
    
    inline def setPinRequired(value: Boolean): Self = StObject.set(x, "pinRequired", value.asInstanceOf[js.Any])
    
    inline def setPinRequiredUndefined: Self = StObject.set(x, "pinRequired", js.undefined)
    
    inline def setPrintBlocked(value: Boolean): Self = StObject.set(x, "printBlocked", value.asInstanceOf[js.Any])
    
    inline def setPrintBlockedUndefined: Self = StObject.set(x, "printBlocked", js.undefined)
    
    inline def setSaveAsBlocked(value: Boolean): Self = StObject.set(x, "saveAsBlocked", value.asInstanceOf[js.Any])
    
    inline def setSaveAsBlockedUndefined: Self = StObject.set(x, "saveAsBlocked", js.undefined)
    
    inline def setSimplePinBlocked(value: Boolean): Self = StObject.set(x, "simplePinBlocked", value.asInstanceOf[js.Any])
    
    inline def setSimplePinBlockedUndefined: Self = StObject.set(x, "simplePinBlocked", js.undefined)
  }
}

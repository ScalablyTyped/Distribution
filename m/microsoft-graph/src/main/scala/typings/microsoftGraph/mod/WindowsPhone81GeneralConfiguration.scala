package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsPhone81GeneralConfiguration
  extends StObject
     with DeviceConfiguration {
  
  // Value indicating whether this policy only applies to Windows Phone 8.1. This property is read-only.
  var applyOnlyToWindowsPhone81: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block copy paste.
  var appsBlockCopyPaste: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block bluetooth.
  var bluetoothBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block camera.
  var cameraBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block Wi-Fi tethering. Has no impact if Wi-Fi is blocked.
  var cellularBlockWifiTethering: js.UndefOr[Boolean] = js.undefined
  
  // List that is in the AppComplianceList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var compliantAppListType: js.UndefOr[AppListType] = js.undefined
  
  /**
    * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection
    * can contain a maximum of 10000 elements.
    */
  var compliantAppsList: js.UndefOr[NullableOption[js.Array[AppListItem]]] = js.undefined
  
  // Indicates whether or not to block diagnostic data submission.
  var diagnosticDataBlockSubmission: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block custom email accounts.
  var emailBlockAddingAccounts: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block location services.
  var locationServicesBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block using a Microsoft Account.
  var microsoftAccountBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block Near-Field Communication.
  var nfcBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block syncing the calendar.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.undefined
  
  // Number of days before the password expires.
  var passwordExpirationDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of character sets a password must contain.
  var passwordMinimumCharacterSetCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum length of passwords.
  var passwordMinimumLength: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minutes of inactivity before screen timeout.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of previous passwords to block. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Indicates whether or not to require a password.
  var passwordRequired: js.UndefOr[Boolean] = js.undefined
  
  // Password type that is required. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  
  // Number of sign in failures allowed before factory reset.
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Indicates whether or not to block screenshots.
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block removable storage.
  var storageBlockRemovableStorage: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to require encryption.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block the web browser.
  var webBrowserBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
  var wifiBlockAutomaticConnectHotspots: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block Wi-Fi hotspot reporting. Has no impact if Wi-Fi is blocked.
  var wifiBlockHotspotReporting: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block Wi-Fi.
  var wifiBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block the Windows Store.
  var windowsStoreBlocked: js.UndefOr[Boolean] = js.undefined
}
object WindowsPhone81GeneralConfiguration {
  
  inline def apply(): WindowsPhone81GeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsPhone81GeneralConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsPhone81GeneralConfiguration] (val x: Self) extends AnyVal {
    
    inline def setApplyOnlyToWindowsPhone81(value: Boolean): Self = StObject.set(x, "applyOnlyToWindowsPhone81", value.asInstanceOf[js.Any])
    
    inline def setApplyOnlyToWindowsPhone81Undefined: Self = StObject.set(x, "applyOnlyToWindowsPhone81", js.undefined)
    
    inline def setAppsBlockCopyPaste(value: Boolean): Self = StObject.set(x, "appsBlockCopyPaste", value.asInstanceOf[js.Any])
    
    inline def setAppsBlockCopyPasteUndefined: Self = StObject.set(x, "appsBlockCopyPaste", js.undefined)
    
    inline def setBluetoothBlocked(value: Boolean): Self = StObject.set(x, "bluetoothBlocked", value.asInstanceOf[js.Any])
    
    inline def setBluetoothBlockedUndefined: Self = StObject.set(x, "bluetoothBlocked", js.undefined)
    
    inline def setCameraBlocked(value: Boolean): Self = StObject.set(x, "cameraBlocked", value.asInstanceOf[js.Any])
    
    inline def setCameraBlockedUndefined: Self = StObject.set(x, "cameraBlocked", js.undefined)
    
    inline def setCellularBlockWifiTethering(value: Boolean): Self = StObject.set(x, "cellularBlockWifiTethering", value.asInstanceOf[js.Any])
    
    inline def setCellularBlockWifiTetheringUndefined: Self = StObject.set(x, "cellularBlockWifiTethering", js.undefined)
    
    inline def setCompliantAppListType(value: AppListType): Self = StObject.set(x, "compliantAppListType", value.asInstanceOf[js.Any])
    
    inline def setCompliantAppListTypeUndefined: Self = StObject.set(x, "compliantAppListType", js.undefined)
    
    inline def setCompliantAppsList(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "compliantAppsList", value.asInstanceOf[js.Any])
    
    inline def setCompliantAppsListNull: Self = StObject.set(x, "compliantAppsList", null)
    
    inline def setCompliantAppsListUndefined: Self = StObject.set(x, "compliantAppsList", js.undefined)
    
    inline def setCompliantAppsListVarargs(value: AppListItem*): Self = StObject.set(x, "compliantAppsList", js.Array(value*))
    
    inline def setDiagnosticDataBlockSubmission(value: Boolean): Self = StObject.set(x, "diagnosticDataBlockSubmission", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticDataBlockSubmissionUndefined: Self = StObject.set(x, "diagnosticDataBlockSubmission", js.undefined)
    
    inline def setEmailBlockAddingAccounts(value: Boolean): Self = StObject.set(x, "emailBlockAddingAccounts", value.asInstanceOf[js.Any])
    
    inline def setEmailBlockAddingAccountsUndefined: Self = StObject.set(x, "emailBlockAddingAccounts", js.undefined)
    
    inline def setLocationServicesBlocked(value: Boolean): Self = StObject.set(x, "locationServicesBlocked", value.asInstanceOf[js.Any])
    
    inline def setLocationServicesBlockedUndefined: Self = StObject.set(x, "locationServicesBlocked", js.undefined)
    
    inline def setMicrosoftAccountBlocked(value: Boolean): Self = StObject.set(x, "microsoftAccountBlocked", value.asInstanceOf[js.Any])
    
    inline def setMicrosoftAccountBlockedUndefined: Self = StObject.set(x, "microsoftAccountBlocked", js.undefined)
    
    inline def setNfcBlocked(value: Boolean): Self = StObject.set(x, "nfcBlocked", value.asInstanceOf[js.Any])
    
    inline def setNfcBlockedUndefined: Self = StObject.set(x, "nfcBlocked", js.undefined)
    
    inline def setPasswordBlockSimple(value: Boolean): Self = StObject.set(x, "passwordBlockSimple", value.asInstanceOf[js.Any])
    
    inline def setPasswordBlockSimpleUndefined: Self = StObject.set(x, "passwordBlockSimple", js.undefined)
    
    inline def setPasswordExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordExpirationDays", value.asInstanceOf[js.Any])
    
    inline def setPasswordExpirationDaysNull: Self = StObject.set(x, "passwordExpirationDays", null)
    
    inline def setPasswordExpirationDaysUndefined: Self = StObject.set(x, "passwordExpirationDays", js.undefined)
    
    inline def setPasswordMinimumCharacterSetCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinimumCharacterSetCountNull: Self = StObject.set(x, "passwordMinimumCharacterSetCount", null)
    
    inline def setPasswordMinimumCharacterSetCountUndefined: Self = StObject.set(x, "passwordMinimumCharacterSetCount", js.undefined)
    
    inline def setPasswordMinimumLength(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinimumLength", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinimumLengthNull: Self = StObject.set(x, "passwordMinimumLength", null)
    
    inline def setPasswordMinimumLengthUndefined: Self = StObject.set(x, "passwordMinimumLength", js.undefined)
    
    inline def setPasswordMinutesOfInactivityBeforeScreenTimeout(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinutesOfInactivityBeforeScreenTimeout", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinutesOfInactivityBeforeScreenTimeoutNull: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeScreenTimeout", null)
    
    inline def setPasswordMinutesOfInactivityBeforeScreenTimeoutUndefined: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeScreenTimeout", js.undefined)
    
    inline def setPasswordPreviousPasswordBlockCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    
    inline def setPasswordPreviousPasswordBlockCountNull: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", null)
    
    inline def setPasswordPreviousPasswordBlockCountUndefined: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", js.undefined)
    
    inline def setPasswordRequired(value: Boolean): Self = StObject.set(x, "passwordRequired", value.asInstanceOf[js.Any])
    
    inline def setPasswordRequiredType(value: RequiredPasswordType): Self = StObject.set(x, "passwordRequiredType", value.asInstanceOf[js.Any])
    
    inline def setPasswordRequiredTypeUndefined: Self = StObject.set(x, "passwordRequiredType", js.undefined)
    
    inline def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
    
    inline def setPasswordSignInFailureCountBeforeFactoryReset(value: NullableOption[Double]): Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", value.asInstanceOf[js.Any])
    
    inline def setPasswordSignInFailureCountBeforeFactoryResetNull: Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", null)
    
    inline def setPasswordSignInFailureCountBeforeFactoryResetUndefined: Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", js.undefined)
    
    inline def setScreenCaptureBlocked(value: Boolean): Self = StObject.set(x, "screenCaptureBlocked", value.asInstanceOf[js.Any])
    
    inline def setScreenCaptureBlockedUndefined: Self = StObject.set(x, "screenCaptureBlocked", js.undefined)
    
    inline def setStorageBlockRemovableStorage(value: Boolean): Self = StObject.set(x, "storageBlockRemovableStorage", value.asInstanceOf[js.Any])
    
    inline def setStorageBlockRemovableStorageUndefined: Self = StObject.set(x, "storageBlockRemovableStorage", js.undefined)
    
    inline def setStorageRequireEncryption(value: Boolean): Self = StObject.set(x, "storageRequireEncryption", value.asInstanceOf[js.Any])
    
    inline def setStorageRequireEncryptionUndefined: Self = StObject.set(x, "storageRequireEncryption", js.undefined)
    
    inline def setWebBrowserBlocked(value: Boolean): Self = StObject.set(x, "webBrowserBlocked", value.asInstanceOf[js.Any])
    
    inline def setWebBrowserBlockedUndefined: Self = StObject.set(x, "webBrowserBlocked", js.undefined)
    
    inline def setWifiBlockAutomaticConnectHotspots(value: Boolean): Self = StObject.set(x, "wifiBlockAutomaticConnectHotspots", value.asInstanceOf[js.Any])
    
    inline def setWifiBlockAutomaticConnectHotspotsUndefined: Self = StObject.set(x, "wifiBlockAutomaticConnectHotspots", js.undefined)
    
    inline def setWifiBlockHotspotReporting(value: Boolean): Self = StObject.set(x, "wifiBlockHotspotReporting", value.asInstanceOf[js.Any])
    
    inline def setWifiBlockHotspotReportingUndefined: Self = StObject.set(x, "wifiBlockHotspotReporting", js.undefined)
    
    inline def setWifiBlocked(value: Boolean): Self = StObject.set(x, "wifiBlocked", value.asInstanceOf[js.Any])
    
    inline def setWifiBlockedUndefined: Self = StObject.set(x, "wifiBlocked", js.undefined)
    
    inline def setWindowsStoreBlocked(value: Boolean): Self = StObject.set(x, "windowsStoreBlocked", value.asInstanceOf[js.Any])
    
    inline def setWindowsStoreBlockedUndefined: Self = StObject.set(x, "windowsStoreBlocked", js.undefined)
  }
}

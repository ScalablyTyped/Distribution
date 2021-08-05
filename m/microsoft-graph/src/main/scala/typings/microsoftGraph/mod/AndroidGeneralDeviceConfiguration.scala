package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidGeneralDeviceConfiguration
  extends StObject
     with DeviceConfiguration {
  
  // Indicates whether or not to block clipboard sharing to copy and paste between applications.
  var appsBlockClipboardSharing: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block copy and paste within applications.
  var appsBlockCopyPaste: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block the YouTube app.
  var appsBlockYouTube: js.UndefOr[Boolean] = js.undefined
  
  // List of apps to be hidden on the KNOX device. This collection can contain a maximum of 500 elements.
  var appsHideList: js.UndefOr[NullableOption[js.Array[AppListItem]]] = js.undefined
  
  // List of apps which can be installed on the KNOX device. This collection can contain a maximum of 500 elements.
  var appsInstallAllowList: js.UndefOr[NullableOption[js.Array[AppListItem]]] = js.undefined
  
  /**
    * List of apps which are blocked from being launched on the KNOX device. This collection can contain a maximum of 500
    * elements.
    */
  var appsLaunchBlockList: js.UndefOr[NullableOption[js.Array[AppListItem]]] = js.undefined
  
  // Indicates whether or not to block Bluetooth.
  var bluetoothBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block the use of the camera.
  var cameraBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block data roaming.
  var cellularBlockDataRoaming: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block SMS/MMS messaging.
  var cellularBlockMessaging: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block voice roaming.
  var cellularBlockVoiceRoaming: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block syncing Wi-Fi tethering.
  var cellularBlockWiFiTethering: js.UndefOr[Boolean] = js.undefined
  
  // Type of list that is in the CompliantAppsList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var compliantAppListType: js.UndefOr[AppListType] = js.undefined
  
  /**
    * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection
    * can contain a maximum of 10000 elements.
    */
  var compliantAppsList: js.UndefOr[NullableOption[js.Array[AppListItem]]] = js.undefined
  
  // Indicates whether or not to allow device sharing mode.
  var deviceSharingAllowed: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block diagnostic data submission.
  var diagnosticDataBlockSubmission: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block user performing a factory reset.
  var factoryResetBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block Google account auto sync.
  var googleAccountBlockAutoSync: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block the Google Play store.
  var googlePlayStoreBlocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of apps that will be allowed to run when the device is in Kiosk Mode. This collection can contain a maximum of
    * 500 elements.
    */
  var kioskModeApps: js.UndefOr[NullableOption[js.Array[AppListItem]]] = js.undefined
  
  // Indicates whether or not to block the screen sleep button while in Kiosk Mode.
  var kioskModeBlockSleepButton: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block the volume buttons while in Kiosk Mode.
  var kioskModeBlockVolumeButtons: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block location services.
  var locationServicesBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block Near-Field Communication.
  var nfcBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block fingerprint unlock.
  var passwordBlockFingerprintUnlock: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block Smart Lock and other trust agents.
  var passwordBlockTrustAgents: js.UndefOr[Boolean] = js.undefined
  
  // Number of days before the password expires. Valid values 1 to 365
  var passwordExpirationDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum length of passwords. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of previous passwords to block. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Indicates whether or not to require a password.
  var passwordRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Type of password that is required. Possible values are: deviceDefault, alphabetic, alphanumeric,
    * alphanumericWithSymbols, lowSecurityBiometric, numeric, numericComplex, any.
    */
  var passwordRequiredType: js.UndefOr[AndroidRequiredPasswordType] = js.undefined
  
  // Number of sign in failures allowed before factory reset. Valid values 1 to 16
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Indicates whether or not to block powering off the device.
  var powerOffBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block screenshots.
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Require the Android Verify apps feature is turned on.
  var securityRequireVerifyApps: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block Google Backup.
  var storageBlockGoogleBackup: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block removable storage usage.
  var storageBlockRemovableStorage: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to require device encryption.
  var storageRequireDeviceEncryption: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to require removable storage encryption.
  var storageRequireRemovableStorageEncryption: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block the use of the Voice Assistant.
  var voiceAssistantBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block voice dialing.
  var voiceDialingBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block the web browser's auto fill feature.
  var webBrowserBlockAutofill: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block JavaScript within the web browser.
  var webBrowserBlockJavaScript: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block popups within the web browser.
  var webBrowserBlockPopups: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block the web browser.
  var webBrowserBlocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Cookie settings within the web browser. Possible values are: browserDefault, blockAlways, allowCurrentWebSite,
    * allowFromWebsitesVisited, allowAlways.
    */
  var webBrowserCookieSettings: js.UndefOr[WebBrowserCookieSettings] = js.undefined
  
  // Indicates whether or not to block syncing Wi-Fi.
  var wiFiBlocked: js.UndefOr[Boolean] = js.undefined
}
object AndroidGeneralDeviceConfiguration {
  
  inline def apply(): AndroidGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidGeneralDeviceConfiguration]
  }
  
  extension [Self <: AndroidGeneralDeviceConfiguration](x: Self) {
    
    inline def setAppsBlockClipboardSharing(value: Boolean): Self = StObject.set(x, "appsBlockClipboardSharing", value.asInstanceOf[js.Any])
    
    inline def setAppsBlockClipboardSharingUndefined: Self = StObject.set(x, "appsBlockClipboardSharing", js.undefined)
    
    inline def setAppsBlockCopyPaste(value: Boolean): Self = StObject.set(x, "appsBlockCopyPaste", value.asInstanceOf[js.Any])
    
    inline def setAppsBlockCopyPasteUndefined: Self = StObject.set(x, "appsBlockCopyPaste", js.undefined)
    
    inline def setAppsBlockYouTube(value: Boolean): Self = StObject.set(x, "appsBlockYouTube", value.asInstanceOf[js.Any])
    
    inline def setAppsBlockYouTubeUndefined: Self = StObject.set(x, "appsBlockYouTube", js.undefined)
    
    inline def setAppsHideList(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "appsHideList", value.asInstanceOf[js.Any])
    
    inline def setAppsHideListNull: Self = StObject.set(x, "appsHideList", null)
    
    inline def setAppsHideListUndefined: Self = StObject.set(x, "appsHideList", js.undefined)
    
    inline def setAppsHideListVarargs(value: AppListItem*): Self = StObject.set(x, "appsHideList", js.Array(value :_*))
    
    inline def setAppsInstallAllowList(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "appsInstallAllowList", value.asInstanceOf[js.Any])
    
    inline def setAppsInstallAllowListNull: Self = StObject.set(x, "appsInstallAllowList", null)
    
    inline def setAppsInstallAllowListUndefined: Self = StObject.set(x, "appsInstallAllowList", js.undefined)
    
    inline def setAppsInstallAllowListVarargs(value: AppListItem*): Self = StObject.set(x, "appsInstallAllowList", js.Array(value :_*))
    
    inline def setAppsLaunchBlockList(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "appsLaunchBlockList", value.asInstanceOf[js.Any])
    
    inline def setAppsLaunchBlockListNull: Self = StObject.set(x, "appsLaunchBlockList", null)
    
    inline def setAppsLaunchBlockListUndefined: Self = StObject.set(x, "appsLaunchBlockList", js.undefined)
    
    inline def setAppsLaunchBlockListVarargs(value: AppListItem*): Self = StObject.set(x, "appsLaunchBlockList", js.Array(value :_*))
    
    inline def setBluetoothBlocked(value: Boolean): Self = StObject.set(x, "bluetoothBlocked", value.asInstanceOf[js.Any])
    
    inline def setBluetoothBlockedUndefined: Self = StObject.set(x, "bluetoothBlocked", js.undefined)
    
    inline def setCameraBlocked(value: Boolean): Self = StObject.set(x, "cameraBlocked", value.asInstanceOf[js.Any])
    
    inline def setCameraBlockedUndefined: Self = StObject.set(x, "cameraBlocked", js.undefined)
    
    inline def setCellularBlockDataRoaming(value: Boolean): Self = StObject.set(x, "cellularBlockDataRoaming", value.asInstanceOf[js.Any])
    
    inline def setCellularBlockDataRoamingUndefined: Self = StObject.set(x, "cellularBlockDataRoaming", js.undefined)
    
    inline def setCellularBlockMessaging(value: Boolean): Self = StObject.set(x, "cellularBlockMessaging", value.asInstanceOf[js.Any])
    
    inline def setCellularBlockMessagingUndefined: Self = StObject.set(x, "cellularBlockMessaging", js.undefined)
    
    inline def setCellularBlockVoiceRoaming(value: Boolean): Self = StObject.set(x, "cellularBlockVoiceRoaming", value.asInstanceOf[js.Any])
    
    inline def setCellularBlockVoiceRoamingUndefined: Self = StObject.set(x, "cellularBlockVoiceRoaming", js.undefined)
    
    inline def setCellularBlockWiFiTethering(value: Boolean): Self = StObject.set(x, "cellularBlockWiFiTethering", value.asInstanceOf[js.Any])
    
    inline def setCellularBlockWiFiTetheringUndefined: Self = StObject.set(x, "cellularBlockWiFiTethering", js.undefined)
    
    inline def setCompliantAppListType(value: AppListType): Self = StObject.set(x, "compliantAppListType", value.asInstanceOf[js.Any])
    
    inline def setCompliantAppListTypeUndefined: Self = StObject.set(x, "compliantAppListType", js.undefined)
    
    inline def setCompliantAppsList(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "compliantAppsList", value.asInstanceOf[js.Any])
    
    inline def setCompliantAppsListNull: Self = StObject.set(x, "compliantAppsList", null)
    
    inline def setCompliantAppsListUndefined: Self = StObject.set(x, "compliantAppsList", js.undefined)
    
    inline def setCompliantAppsListVarargs(value: AppListItem*): Self = StObject.set(x, "compliantAppsList", js.Array(value :_*))
    
    inline def setDeviceSharingAllowed(value: Boolean): Self = StObject.set(x, "deviceSharingAllowed", value.asInstanceOf[js.Any])
    
    inline def setDeviceSharingAllowedUndefined: Self = StObject.set(x, "deviceSharingAllowed", js.undefined)
    
    inline def setDiagnosticDataBlockSubmission(value: Boolean): Self = StObject.set(x, "diagnosticDataBlockSubmission", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticDataBlockSubmissionUndefined: Self = StObject.set(x, "diagnosticDataBlockSubmission", js.undefined)
    
    inline def setFactoryResetBlocked(value: Boolean): Self = StObject.set(x, "factoryResetBlocked", value.asInstanceOf[js.Any])
    
    inline def setFactoryResetBlockedUndefined: Self = StObject.set(x, "factoryResetBlocked", js.undefined)
    
    inline def setGoogleAccountBlockAutoSync(value: Boolean): Self = StObject.set(x, "googleAccountBlockAutoSync", value.asInstanceOf[js.Any])
    
    inline def setGoogleAccountBlockAutoSyncUndefined: Self = StObject.set(x, "googleAccountBlockAutoSync", js.undefined)
    
    inline def setGooglePlayStoreBlocked(value: Boolean): Self = StObject.set(x, "googlePlayStoreBlocked", value.asInstanceOf[js.Any])
    
    inline def setGooglePlayStoreBlockedUndefined: Self = StObject.set(x, "googlePlayStoreBlocked", js.undefined)
    
    inline def setKioskModeApps(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "kioskModeApps", value.asInstanceOf[js.Any])
    
    inline def setKioskModeAppsNull: Self = StObject.set(x, "kioskModeApps", null)
    
    inline def setKioskModeAppsUndefined: Self = StObject.set(x, "kioskModeApps", js.undefined)
    
    inline def setKioskModeAppsVarargs(value: AppListItem*): Self = StObject.set(x, "kioskModeApps", js.Array(value :_*))
    
    inline def setKioskModeBlockSleepButton(value: Boolean): Self = StObject.set(x, "kioskModeBlockSleepButton", value.asInstanceOf[js.Any])
    
    inline def setKioskModeBlockSleepButtonUndefined: Self = StObject.set(x, "kioskModeBlockSleepButton", js.undefined)
    
    inline def setKioskModeBlockVolumeButtons(value: Boolean): Self = StObject.set(x, "kioskModeBlockVolumeButtons", value.asInstanceOf[js.Any])
    
    inline def setKioskModeBlockVolumeButtonsUndefined: Self = StObject.set(x, "kioskModeBlockVolumeButtons", js.undefined)
    
    inline def setLocationServicesBlocked(value: Boolean): Self = StObject.set(x, "locationServicesBlocked", value.asInstanceOf[js.Any])
    
    inline def setLocationServicesBlockedUndefined: Self = StObject.set(x, "locationServicesBlocked", js.undefined)
    
    inline def setNfcBlocked(value: Boolean): Self = StObject.set(x, "nfcBlocked", value.asInstanceOf[js.Any])
    
    inline def setNfcBlockedUndefined: Self = StObject.set(x, "nfcBlocked", js.undefined)
    
    inline def setPasswordBlockFingerprintUnlock(value: Boolean): Self = StObject.set(x, "passwordBlockFingerprintUnlock", value.asInstanceOf[js.Any])
    
    inline def setPasswordBlockFingerprintUnlockUndefined: Self = StObject.set(x, "passwordBlockFingerprintUnlock", js.undefined)
    
    inline def setPasswordBlockTrustAgents(value: Boolean): Self = StObject.set(x, "passwordBlockTrustAgents", value.asInstanceOf[js.Any])
    
    inline def setPasswordBlockTrustAgentsUndefined: Self = StObject.set(x, "passwordBlockTrustAgents", js.undefined)
    
    inline def setPasswordExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordExpirationDays", value.asInstanceOf[js.Any])
    
    inline def setPasswordExpirationDaysNull: Self = StObject.set(x, "passwordExpirationDays", null)
    
    inline def setPasswordExpirationDaysUndefined: Self = StObject.set(x, "passwordExpirationDays", js.undefined)
    
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
    
    inline def setPasswordRequiredType(value: AndroidRequiredPasswordType): Self = StObject.set(x, "passwordRequiredType", value.asInstanceOf[js.Any])
    
    inline def setPasswordRequiredTypeUndefined: Self = StObject.set(x, "passwordRequiredType", js.undefined)
    
    inline def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
    
    inline def setPasswordSignInFailureCountBeforeFactoryReset(value: NullableOption[Double]): Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", value.asInstanceOf[js.Any])
    
    inline def setPasswordSignInFailureCountBeforeFactoryResetNull: Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", null)
    
    inline def setPasswordSignInFailureCountBeforeFactoryResetUndefined: Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", js.undefined)
    
    inline def setPowerOffBlocked(value: Boolean): Self = StObject.set(x, "powerOffBlocked", value.asInstanceOf[js.Any])
    
    inline def setPowerOffBlockedUndefined: Self = StObject.set(x, "powerOffBlocked", js.undefined)
    
    inline def setScreenCaptureBlocked(value: Boolean): Self = StObject.set(x, "screenCaptureBlocked", value.asInstanceOf[js.Any])
    
    inline def setScreenCaptureBlockedUndefined: Self = StObject.set(x, "screenCaptureBlocked", js.undefined)
    
    inline def setSecurityRequireVerifyApps(value: Boolean): Self = StObject.set(x, "securityRequireVerifyApps", value.asInstanceOf[js.Any])
    
    inline def setSecurityRequireVerifyAppsUndefined: Self = StObject.set(x, "securityRequireVerifyApps", js.undefined)
    
    inline def setStorageBlockGoogleBackup(value: Boolean): Self = StObject.set(x, "storageBlockGoogleBackup", value.asInstanceOf[js.Any])
    
    inline def setStorageBlockGoogleBackupUndefined: Self = StObject.set(x, "storageBlockGoogleBackup", js.undefined)
    
    inline def setStorageBlockRemovableStorage(value: Boolean): Self = StObject.set(x, "storageBlockRemovableStorage", value.asInstanceOf[js.Any])
    
    inline def setStorageBlockRemovableStorageUndefined: Self = StObject.set(x, "storageBlockRemovableStorage", js.undefined)
    
    inline def setStorageRequireDeviceEncryption(value: Boolean): Self = StObject.set(x, "storageRequireDeviceEncryption", value.asInstanceOf[js.Any])
    
    inline def setStorageRequireDeviceEncryptionUndefined: Self = StObject.set(x, "storageRequireDeviceEncryption", js.undefined)
    
    inline def setStorageRequireRemovableStorageEncryption(value: Boolean): Self = StObject.set(x, "storageRequireRemovableStorageEncryption", value.asInstanceOf[js.Any])
    
    inline def setStorageRequireRemovableStorageEncryptionUndefined: Self = StObject.set(x, "storageRequireRemovableStorageEncryption", js.undefined)
    
    inline def setVoiceAssistantBlocked(value: Boolean): Self = StObject.set(x, "voiceAssistantBlocked", value.asInstanceOf[js.Any])
    
    inline def setVoiceAssistantBlockedUndefined: Self = StObject.set(x, "voiceAssistantBlocked", js.undefined)
    
    inline def setVoiceDialingBlocked(value: Boolean): Self = StObject.set(x, "voiceDialingBlocked", value.asInstanceOf[js.Any])
    
    inline def setVoiceDialingBlockedUndefined: Self = StObject.set(x, "voiceDialingBlocked", js.undefined)
    
    inline def setWebBrowserBlockAutofill(value: Boolean): Self = StObject.set(x, "webBrowserBlockAutofill", value.asInstanceOf[js.Any])
    
    inline def setWebBrowserBlockAutofillUndefined: Self = StObject.set(x, "webBrowserBlockAutofill", js.undefined)
    
    inline def setWebBrowserBlockJavaScript(value: Boolean): Self = StObject.set(x, "webBrowserBlockJavaScript", value.asInstanceOf[js.Any])
    
    inline def setWebBrowserBlockJavaScriptUndefined: Self = StObject.set(x, "webBrowserBlockJavaScript", js.undefined)
    
    inline def setWebBrowserBlockPopups(value: Boolean): Self = StObject.set(x, "webBrowserBlockPopups", value.asInstanceOf[js.Any])
    
    inline def setWebBrowserBlockPopupsUndefined: Self = StObject.set(x, "webBrowserBlockPopups", js.undefined)
    
    inline def setWebBrowserBlocked(value: Boolean): Self = StObject.set(x, "webBrowserBlocked", value.asInstanceOf[js.Any])
    
    inline def setWebBrowserBlockedUndefined: Self = StObject.set(x, "webBrowserBlocked", js.undefined)
    
    inline def setWebBrowserCookieSettings(value: WebBrowserCookieSettings): Self = StObject.set(x, "webBrowserCookieSettings", value.asInstanceOf[js.Any])
    
    inline def setWebBrowserCookieSettingsUndefined: Self = StObject.set(x, "webBrowserCookieSettings", js.undefined)
    
    inline def setWiFiBlocked(value: Boolean): Self = StObject.set(x, "wiFiBlocked", value.asInstanceOf[js.Any])
    
    inline def setWiFiBlockedUndefined: Self = StObject.set(x, "wiFiBlocked", js.undefined)
  }
}

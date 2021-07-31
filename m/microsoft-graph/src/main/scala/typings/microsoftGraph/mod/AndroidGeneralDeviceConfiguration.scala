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
  
  @scala.inline
  def apply(): AndroidGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidGeneralDeviceConfiguration]
  }
  
  @scala.inline
  implicit class AndroidGeneralDeviceConfigurationMutableBuilder[Self <: AndroidGeneralDeviceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsBlockClipboardSharing(value: Boolean): Self = StObject.set(x, "appsBlockClipboardSharing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsBlockClipboardSharingUndefined: Self = StObject.set(x, "appsBlockClipboardSharing", js.undefined)
    
    @scala.inline
    def setAppsBlockCopyPaste(value: Boolean): Self = StObject.set(x, "appsBlockCopyPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsBlockCopyPasteUndefined: Self = StObject.set(x, "appsBlockCopyPaste", js.undefined)
    
    @scala.inline
    def setAppsBlockYouTube(value: Boolean): Self = StObject.set(x, "appsBlockYouTube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsBlockYouTubeUndefined: Self = StObject.set(x, "appsBlockYouTube", js.undefined)
    
    @scala.inline
    def setAppsHideList(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "appsHideList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsHideListNull: Self = StObject.set(x, "appsHideList", null)
    
    @scala.inline
    def setAppsHideListUndefined: Self = StObject.set(x, "appsHideList", js.undefined)
    
    @scala.inline
    def setAppsHideListVarargs(value: AppListItem*): Self = StObject.set(x, "appsHideList", js.Array(value :_*))
    
    @scala.inline
    def setAppsInstallAllowList(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "appsInstallAllowList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsInstallAllowListNull: Self = StObject.set(x, "appsInstallAllowList", null)
    
    @scala.inline
    def setAppsInstallAllowListUndefined: Self = StObject.set(x, "appsInstallAllowList", js.undefined)
    
    @scala.inline
    def setAppsInstallAllowListVarargs(value: AppListItem*): Self = StObject.set(x, "appsInstallAllowList", js.Array(value :_*))
    
    @scala.inline
    def setAppsLaunchBlockList(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "appsLaunchBlockList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsLaunchBlockListNull: Self = StObject.set(x, "appsLaunchBlockList", null)
    
    @scala.inline
    def setAppsLaunchBlockListUndefined: Self = StObject.set(x, "appsLaunchBlockList", js.undefined)
    
    @scala.inline
    def setAppsLaunchBlockListVarargs(value: AppListItem*): Self = StObject.set(x, "appsLaunchBlockList", js.Array(value :_*))
    
    @scala.inline
    def setBluetoothBlocked(value: Boolean): Self = StObject.set(x, "bluetoothBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetoothBlockedUndefined: Self = StObject.set(x, "bluetoothBlocked", js.undefined)
    
    @scala.inline
    def setCameraBlocked(value: Boolean): Self = StObject.set(x, "cameraBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraBlockedUndefined: Self = StObject.set(x, "cameraBlocked", js.undefined)
    
    @scala.inline
    def setCellularBlockDataRoaming(value: Boolean): Self = StObject.set(x, "cellularBlockDataRoaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularBlockDataRoamingUndefined: Self = StObject.set(x, "cellularBlockDataRoaming", js.undefined)
    
    @scala.inline
    def setCellularBlockMessaging(value: Boolean): Self = StObject.set(x, "cellularBlockMessaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularBlockMessagingUndefined: Self = StObject.set(x, "cellularBlockMessaging", js.undefined)
    
    @scala.inline
    def setCellularBlockVoiceRoaming(value: Boolean): Self = StObject.set(x, "cellularBlockVoiceRoaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularBlockVoiceRoamingUndefined: Self = StObject.set(x, "cellularBlockVoiceRoaming", js.undefined)
    
    @scala.inline
    def setCellularBlockWiFiTethering(value: Boolean): Self = StObject.set(x, "cellularBlockWiFiTethering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularBlockWiFiTetheringUndefined: Self = StObject.set(x, "cellularBlockWiFiTethering", js.undefined)
    
    @scala.inline
    def setCompliantAppListType(value: AppListType): Self = StObject.set(x, "compliantAppListType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompliantAppListTypeUndefined: Self = StObject.set(x, "compliantAppListType", js.undefined)
    
    @scala.inline
    def setCompliantAppsList(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "compliantAppsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompliantAppsListNull: Self = StObject.set(x, "compliantAppsList", null)
    
    @scala.inline
    def setCompliantAppsListUndefined: Self = StObject.set(x, "compliantAppsList", js.undefined)
    
    @scala.inline
    def setCompliantAppsListVarargs(value: AppListItem*): Self = StObject.set(x, "compliantAppsList", js.Array(value :_*))
    
    @scala.inline
    def setDeviceSharingAllowed(value: Boolean): Self = StObject.set(x, "deviceSharingAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceSharingAllowedUndefined: Self = StObject.set(x, "deviceSharingAllowed", js.undefined)
    
    @scala.inline
    def setDiagnosticDataBlockSubmission(value: Boolean): Self = StObject.set(x, "diagnosticDataBlockSubmission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticDataBlockSubmissionUndefined: Self = StObject.set(x, "diagnosticDataBlockSubmission", js.undefined)
    
    @scala.inline
    def setFactoryResetBlocked(value: Boolean): Self = StObject.set(x, "factoryResetBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactoryResetBlockedUndefined: Self = StObject.set(x, "factoryResetBlocked", js.undefined)
    
    @scala.inline
    def setGoogleAccountBlockAutoSync(value: Boolean): Self = StObject.set(x, "googleAccountBlockAutoSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleAccountBlockAutoSyncUndefined: Self = StObject.set(x, "googleAccountBlockAutoSync", js.undefined)
    
    @scala.inline
    def setGooglePlayStoreBlocked(value: Boolean): Self = StObject.set(x, "googlePlayStoreBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGooglePlayStoreBlockedUndefined: Self = StObject.set(x, "googlePlayStoreBlocked", js.undefined)
    
    @scala.inline
    def setKioskModeApps(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "kioskModeApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeAppsNull: Self = StObject.set(x, "kioskModeApps", null)
    
    @scala.inline
    def setKioskModeAppsUndefined: Self = StObject.set(x, "kioskModeApps", js.undefined)
    
    @scala.inline
    def setKioskModeAppsVarargs(value: AppListItem*): Self = StObject.set(x, "kioskModeApps", js.Array(value :_*))
    
    @scala.inline
    def setKioskModeBlockSleepButton(value: Boolean): Self = StObject.set(x, "kioskModeBlockSleepButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeBlockSleepButtonUndefined: Self = StObject.set(x, "kioskModeBlockSleepButton", js.undefined)
    
    @scala.inline
    def setKioskModeBlockVolumeButtons(value: Boolean): Self = StObject.set(x, "kioskModeBlockVolumeButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeBlockVolumeButtonsUndefined: Self = StObject.set(x, "kioskModeBlockVolumeButtons", js.undefined)
    
    @scala.inline
    def setLocationServicesBlocked(value: Boolean): Self = StObject.set(x, "locationServicesBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationServicesBlockedUndefined: Self = StObject.set(x, "locationServicesBlocked", js.undefined)
    
    @scala.inline
    def setNfcBlocked(value: Boolean): Self = StObject.set(x, "nfcBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNfcBlockedUndefined: Self = StObject.set(x, "nfcBlocked", js.undefined)
    
    @scala.inline
    def setPasswordBlockFingerprintUnlock(value: Boolean): Self = StObject.set(x, "passwordBlockFingerprintUnlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordBlockFingerprintUnlockUndefined: Self = StObject.set(x, "passwordBlockFingerprintUnlock", js.undefined)
    
    @scala.inline
    def setPasswordBlockTrustAgents(value: Boolean): Self = StObject.set(x, "passwordBlockTrustAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordBlockTrustAgentsUndefined: Self = StObject.set(x, "passwordBlockTrustAgents", js.undefined)
    
    @scala.inline
    def setPasswordExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordExpirationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordExpirationDaysNull: Self = StObject.set(x, "passwordExpirationDays", null)
    
    @scala.inline
    def setPasswordExpirationDaysUndefined: Self = StObject.set(x, "passwordExpirationDays", js.undefined)
    
    @scala.inline
    def setPasswordMinimumLength(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordMinimumLengthNull: Self = StObject.set(x, "passwordMinimumLength", null)
    
    @scala.inline
    def setPasswordMinimumLengthUndefined: Self = StObject.set(x, "passwordMinimumLength", js.undefined)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeScreenTimeout(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinutesOfInactivityBeforeScreenTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeScreenTimeoutNull: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeScreenTimeout", null)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeScreenTimeoutUndefined: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeScreenTimeout", js.undefined)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCountNull: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", null)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCountUndefined: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", js.undefined)
    
    @scala.inline
    def setPasswordRequired(value: Boolean): Self = StObject.set(x, "passwordRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequiredType(value: AndroidRequiredPasswordType): Self = StObject.set(x, "passwordRequiredType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequiredTypeUndefined: Self = StObject.set(x, "passwordRequiredType", js.undefined)
    
    @scala.inline
    def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
    
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryReset(value: NullableOption[Double]): Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryResetNull: Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", null)
    
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryResetUndefined: Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", js.undefined)
    
    @scala.inline
    def setPowerOffBlocked(value: Boolean): Self = StObject.set(x, "powerOffBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerOffBlockedUndefined: Self = StObject.set(x, "powerOffBlocked", js.undefined)
    
    @scala.inline
    def setScreenCaptureBlocked(value: Boolean): Self = StObject.set(x, "screenCaptureBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenCaptureBlockedUndefined: Self = StObject.set(x, "screenCaptureBlocked", js.undefined)
    
    @scala.inline
    def setSecurityRequireVerifyApps(value: Boolean): Self = StObject.set(x, "securityRequireVerifyApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityRequireVerifyAppsUndefined: Self = StObject.set(x, "securityRequireVerifyApps", js.undefined)
    
    @scala.inline
    def setStorageBlockGoogleBackup(value: Boolean): Self = StObject.set(x, "storageBlockGoogleBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageBlockGoogleBackupUndefined: Self = StObject.set(x, "storageBlockGoogleBackup", js.undefined)
    
    @scala.inline
    def setStorageBlockRemovableStorage(value: Boolean): Self = StObject.set(x, "storageBlockRemovableStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageBlockRemovableStorageUndefined: Self = StObject.set(x, "storageBlockRemovableStorage", js.undefined)
    
    @scala.inline
    def setStorageRequireDeviceEncryption(value: Boolean): Self = StObject.set(x, "storageRequireDeviceEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageRequireDeviceEncryptionUndefined: Self = StObject.set(x, "storageRequireDeviceEncryption", js.undefined)
    
    @scala.inline
    def setStorageRequireRemovableStorageEncryption(value: Boolean): Self = StObject.set(x, "storageRequireRemovableStorageEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageRequireRemovableStorageEncryptionUndefined: Self = StObject.set(x, "storageRequireRemovableStorageEncryption", js.undefined)
    
    @scala.inline
    def setVoiceAssistantBlocked(value: Boolean): Self = StObject.set(x, "voiceAssistantBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceAssistantBlockedUndefined: Self = StObject.set(x, "voiceAssistantBlocked", js.undefined)
    
    @scala.inline
    def setVoiceDialingBlocked(value: Boolean): Self = StObject.set(x, "voiceDialingBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceDialingBlockedUndefined: Self = StObject.set(x, "voiceDialingBlocked", js.undefined)
    
    @scala.inline
    def setWebBrowserBlockAutofill(value: Boolean): Self = StObject.set(x, "webBrowserBlockAutofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebBrowserBlockAutofillUndefined: Self = StObject.set(x, "webBrowserBlockAutofill", js.undefined)
    
    @scala.inline
    def setWebBrowserBlockJavaScript(value: Boolean): Self = StObject.set(x, "webBrowserBlockJavaScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebBrowserBlockJavaScriptUndefined: Self = StObject.set(x, "webBrowserBlockJavaScript", js.undefined)
    
    @scala.inline
    def setWebBrowserBlockPopups(value: Boolean): Self = StObject.set(x, "webBrowserBlockPopups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebBrowserBlockPopupsUndefined: Self = StObject.set(x, "webBrowserBlockPopups", js.undefined)
    
    @scala.inline
    def setWebBrowserBlocked(value: Boolean): Self = StObject.set(x, "webBrowserBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebBrowserBlockedUndefined: Self = StObject.set(x, "webBrowserBlocked", js.undefined)
    
    @scala.inline
    def setWebBrowserCookieSettings(value: WebBrowserCookieSettings): Self = StObject.set(x, "webBrowserCookieSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebBrowserCookieSettingsUndefined: Self = StObject.set(x, "webBrowserCookieSettings", js.undefined)
    
    @scala.inline
    def setWiFiBlocked(value: Boolean): Self = StObject.set(x, "wiFiBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWiFiBlockedUndefined: Self = StObject.set(x, "wiFiBlocked", js.undefined)
  }
}

package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidGeneralDeviceConfiguration extends DeviceConfiguration {
  // Indicates whether or not to block clipboard sharing to copy and paste between applications.
  var appsBlockClipboardSharing: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block copy and paste within applications.
  var appsBlockCopyPaste: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the YouTube app.
  var appsBlockYouTube: js.UndefOr[Boolean] = js.native
  // List of apps to be hidden on the KNOX device. This collection can contain a maximum of 500 elements.
  var appsHideList: js.UndefOr[js.Array[AppListItem]] = js.native
  // List of apps which can be installed on the KNOX device. This collection can contain a maximum of 500 elements.
  var appsInstallAllowList: js.UndefOr[js.Array[AppListItem]] = js.native
  /**
    * List of apps which are blocked from being launched on the KNOX device. This collection can contain a maximum of 500
    * elements.
    */
  var appsLaunchBlockList: js.UndefOr[js.Array[AppListItem]] = js.native
  // Indicates whether or not to block Bluetooth.
  var bluetoothBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the use of the camera.
  var cameraBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block data roaming.
  var cellularBlockDataRoaming: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block SMS/MMS messaging.
  var cellularBlockMessaging: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block voice roaming.
  var cellularBlockVoiceRoaming: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block syncing Wi-Fi tethering.
  var cellularBlockWiFiTethering: js.UndefOr[Boolean] = js.native
  // Type of list that is in the CompliantAppsList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var compliantAppListType: js.UndefOr[AppListType] = js.native
  /**
    * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection
    * can contain a maximum of 10000 elements.
    */
  var compliantAppsList: js.UndefOr[js.Array[AppListItem]] = js.native
  // Indicates whether or not to allow device sharing mode.
  var deviceSharingAllowed: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block diagnostic data submission.
  var diagnosticDataBlockSubmission: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block user performing a factory reset.
  var factoryResetBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Google account auto sync.
  var googleAccountBlockAutoSync: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the Google Play store.
  var googlePlayStoreBlocked: js.UndefOr[Boolean] = js.native
  /**
    * A list of apps that will be allowed to run when the device is in Kiosk Mode. This collection can contain a maximum of
    * 500 elements.
    */
  var kioskModeApps: js.UndefOr[js.Array[AppListItem]] = js.native
  // Indicates whether or not to block the screen sleep button while in Kiosk Mode.
  var kioskModeBlockSleepButton: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the volume buttons while in Kiosk Mode.
  var kioskModeBlockVolumeButtons: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block location services.
  var locationServicesBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Near-Field Communication.
  var nfcBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block fingerprint unlock.
  var passwordBlockFingerprintUnlock: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Smart Lock and other trust agents.
  var passwordBlockTrustAgents: js.UndefOr[Boolean] = js.native
  // Number of days before the password expires. Valid values 1 to 365
  var passwordExpirationDays: js.UndefOr[Double] = js.native
  // Minimum length of passwords. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.native
  // Number of previous passwords to block. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
  // Indicates whether or not to require a password.
  var passwordRequired: js.UndefOr[Boolean] = js.native
  /**
    * Type of password that is required. Possible values are: deviceDefault, alphabetic, alphanumeric,
    * alphanumericWithSymbols, lowSecurityBiometric, numeric, numericComplex, any.
    */
  var passwordRequiredType: js.UndefOr[AndroidRequiredPasswordType] = js.native
  // Number of sign in failures allowed before factory reset. Valid values 1 to 16
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.native
  // Indicates whether or not to block powering off the device.
  var powerOffBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block screenshots.
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.native
  // Require the Android Verify apps feature is turned on.
  var securityRequireVerifyApps: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Google Backup.
  var storageBlockGoogleBackup: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block removable storage usage.
  var storageBlockRemovableStorage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require device encryption.
  var storageRequireDeviceEncryption: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require removable storage encryption.
  var storageRequireRemovableStorageEncryption: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the use of the Voice Assistant.
  var voiceAssistantBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block voice dialing.
  var voiceDialingBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the web browser's auto fill feature.
  var webBrowserBlockAutofill: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block JavaScript within the web browser.
  var webBrowserBlockJavaScript: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block popups within the web browser.
  var webBrowserBlockPopups: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the web browser.
  var webBrowserBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Cookie settings within the web browser. Possible values are: browserDefault, blockAlways, allowCurrentWebSite,
    * allowFromWebsitesVisited, allowAlways.
    */
  var webBrowserCookieSettings: js.UndefOr[WebBrowserCookieSettings] = js.native
  // Indicates whether or not to block syncing Wi-Fi.
  var wiFiBlocked: js.UndefOr[Boolean] = js.native
}

object AndroidGeneralDeviceConfiguration {
  @scala.inline
  def apply(): AndroidGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidGeneralDeviceConfiguration]
  }
  @scala.inline
  implicit class AndroidGeneralDeviceConfigurationOps[Self <: AndroidGeneralDeviceConfiguration] (val x: Self) extends AnyVal {
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
    def setAppsBlockClipboardSharing(value: Boolean): Self = this.set("appsBlockClipboardSharing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsBlockClipboardSharing: Self = this.set("appsBlockClipboardSharing", js.undefined)
    @scala.inline
    def setAppsBlockCopyPaste(value: Boolean): Self = this.set("appsBlockCopyPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsBlockCopyPaste: Self = this.set("appsBlockCopyPaste", js.undefined)
    @scala.inline
    def setAppsBlockYouTube(value: Boolean): Self = this.set("appsBlockYouTube", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsBlockYouTube: Self = this.set("appsBlockYouTube", js.undefined)
    @scala.inline
    def setAppsHideListVarargs(value: AppListItem*): Self = this.set("appsHideList", js.Array(value :_*))
    @scala.inline
    def setAppsHideList(value: js.Array[AppListItem]): Self = this.set("appsHideList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsHideList: Self = this.set("appsHideList", js.undefined)
    @scala.inline
    def setAppsInstallAllowListVarargs(value: AppListItem*): Self = this.set("appsInstallAllowList", js.Array(value :_*))
    @scala.inline
    def setAppsInstallAllowList(value: js.Array[AppListItem]): Self = this.set("appsInstallAllowList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsInstallAllowList: Self = this.set("appsInstallAllowList", js.undefined)
    @scala.inline
    def setAppsLaunchBlockListVarargs(value: AppListItem*): Self = this.set("appsLaunchBlockList", js.Array(value :_*))
    @scala.inline
    def setAppsLaunchBlockList(value: js.Array[AppListItem]): Self = this.set("appsLaunchBlockList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsLaunchBlockList: Self = this.set("appsLaunchBlockList", js.undefined)
    @scala.inline
    def setBluetoothBlocked(value: Boolean): Self = this.set("bluetoothBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBluetoothBlocked: Self = this.set("bluetoothBlocked", js.undefined)
    @scala.inline
    def setCameraBlocked(value: Boolean): Self = this.set("cameraBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraBlocked: Self = this.set("cameraBlocked", js.undefined)
    @scala.inline
    def setCellularBlockDataRoaming(value: Boolean): Self = this.set("cellularBlockDataRoaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellularBlockDataRoaming: Self = this.set("cellularBlockDataRoaming", js.undefined)
    @scala.inline
    def setCellularBlockMessaging(value: Boolean): Self = this.set("cellularBlockMessaging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellularBlockMessaging: Self = this.set("cellularBlockMessaging", js.undefined)
    @scala.inline
    def setCellularBlockVoiceRoaming(value: Boolean): Self = this.set("cellularBlockVoiceRoaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellularBlockVoiceRoaming: Self = this.set("cellularBlockVoiceRoaming", js.undefined)
    @scala.inline
    def setCellularBlockWiFiTethering(value: Boolean): Self = this.set("cellularBlockWiFiTethering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellularBlockWiFiTethering: Self = this.set("cellularBlockWiFiTethering", js.undefined)
    @scala.inline
    def setCompliantAppListType(value: AppListType): Self = this.set("compliantAppListType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompliantAppListType: Self = this.set("compliantAppListType", js.undefined)
    @scala.inline
    def setCompliantAppsListVarargs(value: AppListItem*): Self = this.set("compliantAppsList", js.Array(value :_*))
    @scala.inline
    def setCompliantAppsList(value: js.Array[AppListItem]): Self = this.set("compliantAppsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompliantAppsList: Self = this.set("compliantAppsList", js.undefined)
    @scala.inline
    def setDeviceSharingAllowed(value: Boolean): Self = this.set("deviceSharingAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceSharingAllowed: Self = this.set("deviceSharingAllowed", js.undefined)
    @scala.inline
    def setDiagnosticDataBlockSubmission(value: Boolean): Self = this.set("diagnosticDataBlockSubmission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnosticDataBlockSubmission: Self = this.set("diagnosticDataBlockSubmission", js.undefined)
    @scala.inline
    def setFactoryResetBlocked(value: Boolean): Self = this.set("factoryResetBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactoryResetBlocked: Self = this.set("factoryResetBlocked", js.undefined)
    @scala.inline
    def setGoogleAccountBlockAutoSync(value: Boolean): Self = this.set("googleAccountBlockAutoSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleAccountBlockAutoSync: Self = this.set("googleAccountBlockAutoSync", js.undefined)
    @scala.inline
    def setGooglePlayStoreBlocked(value: Boolean): Self = this.set("googlePlayStoreBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGooglePlayStoreBlocked: Self = this.set("googlePlayStoreBlocked", js.undefined)
    @scala.inline
    def setKioskModeAppsVarargs(value: AppListItem*): Self = this.set("kioskModeApps", js.Array(value :_*))
    @scala.inline
    def setKioskModeApps(value: js.Array[AppListItem]): Self = this.set("kioskModeApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeApps: Self = this.set("kioskModeApps", js.undefined)
    @scala.inline
    def setKioskModeBlockSleepButton(value: Boolean): Self = this.set("kioskModeBlockSleepButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeBlockSleepButton: Self = this.set("kioskModeBlockSleepButton", js.undefined)
    @scala.inline
    def setKioskModeBlockVolumeButtons(value: Boolean): Self = this.set("kioskModeBlockVolumeButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeBlockVolumeButtons: Self = this.set("kioskModeBlockVolumeButtons", js.undefined)
    @scala.inline
    def setLocationServicesBlocked(value: Boolean): Self = this.set("locationServicesBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationServicesBlocked: Self = this.set("locationServicesBlocked", js.undefined)
    @scala.inline
    def setNfcBlocked(value: Boolean): Self = this.set("nfcBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNfcBlocked: Self = this.set("nfcBlocked", js.undefined)
    @scala.inline
    def setPasswordBlockFingerprintUnlock(value: Boolean): Self = this.set("passwordBlockFingerprintUnlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordBlockFingerprintUnlock: Self = this.set("passwordBlockFingerprintUnlock", js.undefined)
    @scala.inline
    def setPasswordBlockTrustAgents(value: Boolean): Self = this.set("passwordBlockTrustAgents", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordBlockTrustAgents: Self = this.set("passwordBlockTrustAgents", js.undefined)
    @scala.inline
    def setPasswordExpirationDays(value: Double): Self = this.set("passwordExpirationDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordExpirationDays: Self = this.set("passwordExpirationDays", js.undefined)
    @scala.inline
    def setPasswordMinimumLength(value: Double): Self = this.set("passwordMinimumLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinimumLength: Self = this.set("passwordMinimumLength", js.undefined)
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeScreenTimeout(value: Double): Self = this.set("passwordMinutesOfInactivityBeforeScreenTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinutesOfInactivityBeforeScreenTimeout: Self = this.set("passwordMinutesOfInactivityBeforeScreenTimeout", js.undefined)
    @scala.inline
    def setPasswordPreviousPasswordBlockCount(value: Double): Self = this.set("passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordPreviousPasswordBlockCount: Self = this.set("passwordPreviousPasswordBlockCount", js.undefined)
    @scala.inline
    def setPasswordRequired(value: Boolean): Self = this.set("passwordRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordRequired: Self = this.set("passwordRequired", js.undefined)
    @scala.inline
    def setPasswordRequiredType(value: AndroidRequiredPasswordType): Self = this.set("passwordRequiredType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordRequiredType: Self = this.set("passwordRequiredType", js.undefined)
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryReset(value: Double): Self = this.set("passwordSignInFailureCountBeforeFactoryReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordSignInFailureCountBeforeFactoryReset: Self = this.set("passwordSignInFailureCountBeforeFactoryReset", js.undefined)
    @scala.inline
    def setPowerOffBlocked(value: Boolean): Self = this.set("powerOffBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePowerOffBlocked: Self = this.set("powerOffBlocked", js.undefined)
    @scala.inline
    def setScreenCaptureBlocked(value: Boolean): Self = this.set("screenCaptureBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenCaptureBlocked: Self = this.set("screenCaptureBlocked", js.undefined)
    @scala.inline
    def setSecurityRequireVerifyApps(value: Boolean): Self = this.set("securityRequireVerifyApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityRequireVerifyApps: Self = this.set("securityRequireVerifyApps", js.undefined)
    @scala.inline
    def setStorageBlockGoogleBackup(value: Boolean): Self = this.set("storageBlockGoogleBackup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageBlockGoogleBackup: Self = this.set("storageBlockGoogleBackup", js.undefined)
    @scala.inline
    def setStorageBlockRemovableStorage(value: Boolean): Self = this.set("storageBlockRemovableStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageBlockRemovableStorage: Self = this.set("storageBlockRemovableStorage", js.undefined)
    @scala.inline
    def setStorageRequireDeviceEncryption(value: Boolean): Self = this.set("storageRequireDeviceEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageRequireDeviceEncryption: Self = this.set("storageRequireDeviceEncryption", js.undefined)
    @scala.inline
    def setStorageRequireRemovableStorageEncryption(value: Boolean): Self = this.set("storageRequireRemovableStorageEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageRequireRemovableStorageEncryption: Self = this.set("storageRequireRemovableStorageEncryption", js.undefined)
    @scala.inline
    def setVoiceAssistantBlocked(value: Boolean): Self = this.set("voiceAssistantBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceAssistantBlocked: Self = this.set("voiceAssistantBlocked", js.undefined)
    @scala.inline
    def setVoiceDialingBlocked(value: Boolean): Self = this.set("voiceDialingBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceDialingBlocked: Self = this.set("voiceDialingBlocked", js.undefined)
    @scala.inline
    def setWebBrowserBlockAutofill(value: Boolean): Self = this.set("webBrowserBlockAutofill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebBrowserBlockAutofill: Self = this.set("webBrowserBlockAutofill", js.undefined)
    @scala.inline
    def setWebBrowserBlockJavaScript(value: Boolean): Self = this.set("webBrowserBlockJavaScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebBrowserBlockJavaScript: Self = this.set("webBrowserBlockJavaScript", js.undefined)
    @scala.inline
    def setWebBrowserBlockPopups(value: Boolean): Self = this.set("webBrowserBlockPopups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebBrowserBlockPopups: Self = this.set("webBrowserBlockPopups", js.undefined)
    @scala.inline
    def setWebBrowserBlocked(value: Boolean): Self = this.set("webBrowserBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebBrowserBlocked: Self = this.set("webBrowserBlocked", js.undefined)
    @scala.inline
    def setWebBrowserCookieSettings(value: WebBrowserCookieSettings): Self = this.set("webBrowserCookieSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebBrowserCookieSettings: Self = this.set("webBrowserCookieSettings", js.undefined)
    @scala.inline
    def setWiFiBlocked(value: Boolean): Self = this.set("wiFiBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWiFiBlocked: Self = this.set("wiFiBlocked", js.undefined)
  }
  
}


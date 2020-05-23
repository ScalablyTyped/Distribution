package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidGeneralDeviceConfiguration extends DeviceConfiguration {
  // Indicates whether or not to block clipboard sharing to copy and paste between applications.
  var appsBlockClipboardSharing: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block copy and paste within applications.
  var appsBlockCopyPaste: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the YouTube app.
  var appsBlockYouTube: js.UndefOr[Boolean] = js.undefined
  // List of apps to be hidden on the KNOX device. This collection can contain a maximum of 500 elements.
  var appsHideList: js.UndefOr[js.Array[AppListItem]] = js.undefined
  // List of apps which can be installed on the KNOX device. This collection can contain a maximum of 500 elements.
  var appsInstallAllowList: js.UndefOr[js.Array[AppListItem]] = js.undefined
  /**
    * List of apps which are blocked from being launched on the KNOX device. This collection can contain a maximum of 500
    * elements.
    */
  var appsLaunchBlockList: js.UndefOr[js.Array[AppListItem]] = js.undefined
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
  var compliantAppsList: js.UndefOr[js.Array[AppListItem]] = js.undefined
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
  var kioskModeApps: js.UndefOr[js.Array[AppListItem]] = js.undefined
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
  var passwordExpirationDays: js.UndefOr[Double] = js.undefined
  // Minimum length of passwords. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[Double] = js.undefined
  // Minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.undefined
  // Number of previous passwords to block. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined
  // Indicates whether or not to require a password.
  var passwordRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * Type of password that is required. Possible values are: deviceDefault, alphabetic, alphanumeric,
    * alphanumericWithSymbols, lowSecurityBiometric, numeric, numericComplex, any.
    */
  var passwordRequiredType: js.UndefOr[AndroidRequiredPasswordType] = js.undefined
  // Number of sign in failures allowed before factory reset. Valid values 1 to 16
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.undefined
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
  def apply(
    appsBlockClipboardSharing: js.UndefOr[Boolean] = js.undefined,
    appsBlockCopyPaste: js.UndefOr[Boolean] = js.undefined,
    appsBlockYouTube: js.UndefOr[Boolean] = js.undefined,
    appsHideList: js.Array[AppListItem] = null,
    appsInstallAllowList: js.Array[AppListItem] = null,
    appsLaunchBlockList: js.Array[AppListItem] = null,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    bluetoothBlocked: js.UndefOr[Boolean] = js.undefined,
    cameraBlocked: js.UndefOr[Boolean] = js.undefined,
    cellularBlockDataRoaming: js.UndefOr[Boolean] = js.undefined,
    cellularBlockMessaging: js.UndefOr[Boolean] = js.undefined,
    cellularBlockVoiceRoaming: js.UndefOr[Boolean] = js.undefined,
    cellularBlockWiFiTethering: js.UndefOr[Boolean] = js.undefined,
    compliantAppListType: AppListType = null,
    compliantAppsList: js.Array[AppListItem] = null,
    createdDateTime: String = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceSharingAllowed: js.UndefOr[Boolean] = js.undefined,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    diagnosticDataBlockSubmission: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    factoryResetBlocked: js.UndefOr[Boolean] = js.undefined,
    googleAccountBlockAutoSync: js.UndefOr[Boolean] = js.undefined,
    googlePlayStoreBlocked: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kioskModeApps: js.Array[AppListItem] = null,
    kioskModeBlockSleepButton: js.UndefOr[Boolean] = js.undefined,
    kioskModeBlockVolumeButtons: js.UndefOr[Boolean] = js.undefined,
    lastModifiedDateTime: String = null,
    locationServicesBlocked: js.UndefOr[Boolean] = js.undefined,
    nfcBlocked: js.UndefOr[Boolean] = js.undefined,
    passwordBlockFingerprintUnlock: js.UndefOr[Boolean] = js.undefined,
    passwordBlockTrustAgents: js.UndefOr[Boolean] = js.undefined,
    passwordExpirationDays: js.UndefOr[Double] = js.undefined,
    passwordMinimumLength: js.UndefOr[Double] = js.undefined,
    passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.undefined,
    passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined,
    passwordRequired: js.UndefOr[Boolean] = js.undefined,
    passwordRequiredType: AndroidRequiredPasswordType = null,
    passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.undefined,
    powerOffBlocked: js.UndefOr[Boolean] = js.undefined,
    screenCaptureBlocked: js.UndefOr[Boolean] = js.undefined,
    securityRequireVerifyApps: js.UndefOr[Boolean] = js.undefined,
    storageBlockGoogleBackup: js.UndefOr[Boolean] = js.undefined,
    storageBlockRemovableStorage: js.UndefOr[Boolean] = js.undefined,
    storageRequireDeviceEncryption: js.UndefOr[Boolean] = js.undefined,
    storageRequireRemovableStorageEncryption: js.UndefOr[Boolean] = js.undefined,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: js.UndefOr[Double] = js.undefined,
    voiceAssistantBlocked: js.UndefOr[Boolean] = js.undefined,
    voiceDialingBlocked: js.UndefOr[Boolean] = js.undefined,
    webBrowserBlockAutofill: js.UndefOr[Boolean] = js.undefined,
    webBrowserBlockJavaScript: js.UndefOr[Boolean] = js.undefined,
    webBrowserBlockPopups: js.UndefOr[Boolean] = js.undefined,
    webBrowserBlocked: js.UndefOr[Boolean] = js.undefined,
    webBrowserCookieSettings: WebBrowserCookieSettings = null,
    wiFiBlocked: js.UndefOr[Boolean] = js.undefined
  ): AndroidGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appsBlockClipboardSharing)) __obj.updateDynamic("appsBlockClipboardSharing")(appsBlockClipboardSharing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appsBlockCopyPaste)) __obj.updateDynamic("appsBlockCopyPaste")(appsBlockCopyPaste.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appsBlockYouTube)) __obj.updateDynamic("appsBlockYouTube")(appsBlockYouTube.get.asInstanceOf[js.Any])
    if (appsHideList != null) __obj.updateDynamic("appsHideList")(appsHideList.asInstanceOf[js.Any])
    if (appsInstallAllowList != null) __obj.updateDynamic("appsInstallAllowList")(appsInstallAllowList.asInstanceOf[js.Any])
    if (appsLaunchBlockList != null) __obj.updateDynamic("appsLaunchBlockList")(appsLaunchBlockList.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (!js.isUndefined(bluetoothBlocked)) __obj.updateDynamic("bluetoothBlocked")(bluetoothBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cameraBlocked)) __obj.updateDynamic("cameraBlocked")(cameraBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellularBlockDataRoaming)) __obj.updateDynamic("cellularBlockDataRoaming")(cellularBlockDataRoaming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellularBlockMessaging)) __obj.updateDynamic("cellularBlockMessaging")(cellularBlockMessaging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellularBlockVoiceRoaming)) __obj.updateDynamic("cellularBlockVoiceRoaming")(cellularBlockVoiceRoaming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellularBlockWiFiTethering)) __obj.updateDynamic("cellularBlockWiFiTethering")(cellularBlockWiFiTethering.get.asInstanceOf[js.Any])
    if (compliantAppListType != null) __obj.updateDynamic("compliantAppListType")(compliantAppListType.asInstanceOf[js.Any])
    if (compliantAppsList != null) __obj.updateDynamic("compliantAppsList")(compliantAppsList.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceSharingAllowed)) __obj.updateDynamic("deviceSharingAllowed")(deviceSharingAllowed.get.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(diagnosticDataBlockSubmission)) __obj.updateDynamic("diagnosticDataBlockSubmission")(diagnosticDataBlockSubmission.get.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(factoryResetBlocked)) __obj.updateDynamic("factoryResetBlocked")(factoryResetBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(googleAccountBlockAutoSync)) __obj.updateDynamic("googleAccountBlockAutoSync")(googleAccountBlockAutoSync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(googlePlayStoreBlocked)) __obj.updateDynamic("googlePlayStoreBlocked")(googlePlayStoreBlocked.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kioskModeApps != null) __obj.updateDynamic("kioskModeApps")(kioskModeApps.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeBlockSleepButton)) __obj.updateDynamic("kioskModeBlockSleepButton")(kioskModeBlockSleepButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeBlockVolumeButtons)) __obj.updateDynamic("kioskModeBlockVolumeButtons")(kioskModeBlockVolumeButtons.get.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(locationServicesBlocked)) __obj.updateDynamic("locationServicesBlocked")(locationServicesBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nfcBlocked)) __obj.updateDynamic("nfcBlocked")(nfcBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordBlockFingerprintUnlock)) __obj.updateDynamic("passwordBlockFingerprintUnlock")(passwordBlockFingerprintUnlock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordBlockTrustAgents)) __obj.updateDynamic("passwordBlockTrustAgents")(passwordBlockTrustAgents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordExpirationDays)) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumLength)) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinutesOfInactivityBeforeScreenTimeout)) __obj.updateDynamic("passwordMinutesOfInactivityBeforeScreenTimeout")(passwordMinutesOfInactivityBeforeScreenTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordPreviousPasswordBlockCount)) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequired)) __obj.updateDynamic("passwordRequired")(passwordRequired.get.asInstanceOf[js.Any])
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordSignInFailureCountBeforeFactoryReset)) __obj.updateDynamic("passwordSignInFailureCountBeforeFactoryReset")(passwordSignInFailureCountBeforeFactoryReset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(powerOffBlocked)) __obj.updateDynamic("powerOffBlocked")(powerOffBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenCaptureBlocked)) __obj.updateDynamic("screenCaptureBlocked")(screenCaptureBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(securityRequireVerifyApps)) __obj.updateDynamic("securityRequireVerifyApps")(securityRequireVerifyApps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(storageBlockGoogleBackup)) __obj.updateDynamic("storageBlockGoogleBackup")(storageBlockGoogleBackup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(storageBlockRemovableStorage)) __obj.updateDynamic("storageBlockRemovableStorage")(storageBlockRemovableStorage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(storageRequireDeviceEncryption)) __obj.updateDynamic("storageRequireDeviceEncryption")(storageRequireDeviceEncryption.get.asInstanceOf[js.Any])
    if (!js.isUndefined(storageRequireRemovableStorageEncryption)) __obj.updateDynamic("storageRequireRemovableStorageEncryption")(storageRequireRemovableStorageEncryption.get.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceAssistantBlocked)) __obj.updateDynamic("voiceAssistantBlocked")(voiceAssistantBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceDialingBlocked)) __obj.updateDynamic("voiceDialingBlocked")(voiceDialingBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webBrowserBlockAutofill)) __obj.updateDynamic("webBrowserBlockAutofill")(webBrowserBlockAutofill.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webBrowserBlockJavaScript)) __obj.updateDynamic("webBrowserBlockJavaScript")(webBrowserBlockJavaScript.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webBrowserBlockPopups)) __obj.updateDynamic("webBrowserBlockPopups")(webBrowserBlockPopups.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webBrowserBlocked)) __obj.updateDynamic("webBrowserBlocked")(webBrowserBlocked.get.asInstanceOf[js.Any])
    if (webBrowserCookieSettings != null) __obj.updateDynamic("webBrowserCookieSettings")(webBrowserCookieSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(wiFiBlocked)) __obj.updateDynamic("wiFiBlocked")(wiFiBlocked.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidGeneralDeviceConfiguration]
  }
}


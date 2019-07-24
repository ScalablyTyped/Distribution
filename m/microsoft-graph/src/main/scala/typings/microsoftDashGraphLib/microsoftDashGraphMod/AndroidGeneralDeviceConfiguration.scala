package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidGeneralDeviceConfiguration extends DeviceConfiguration {
  // Indicates whether or not to block clipboard sharing to copy and paste between applications.
  var appsBlockClipboardSharing: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block copy and paste within applications.
  var appsBlockCopyPaste: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block the YouTube app.
  var appsBlockYouTube: js.UndefOr[scala.Boolean] = js.undefined
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
  var bluetoothBlocked: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block the use of the camera.
  var cameraBlocked: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block data roaming.
  var cellularBlockDataRoaming: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block SMS/MMS messaging.
  var cellularBlockMessaging: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block voice roaming.
  var cellularBlockVoiceRoaming: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block syncing Wi-Fi tethering.
  var cellularBlockWiFiTethering: js.UndefOr[scala.Boolean] = js.undefined
  // Type of list that is in the CompliantAppsList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var compliantAppListType: js.UndefOr[AppListType] = js.undefined
  /**
    * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection
    * can contain a maximum of 10000 elements.
    */
  var compliantAppsList: js.UndefOr[js.Array[AppListItem]] = js.undefined
  // Indicates whether or not to allow device sharing mode.
  var deviceSharingAllowed: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block diagnostic data submission.
  var diagnosticDataBlockSubmission: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block user performing a factory reset.
  var factoryResetBlocked: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block Google account auto sync.
  var googleAccountBlockAutoSync: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block the Google Play store.
  var googlePlayStoreBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A list of apps that will be allowed to run when the device is in Kiosk Mode. This collection can contain a maximum of
    * 500 elements.
    */
  var kioskModeApps: js.UndefOr[js.Array[AppListItem]] = js.undefined
  // Indicates whether or not to block the screen sleep button while in Kiosk Mode.
  var kioskModeBlockSleepButton: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block the volume buttons while in Kiosk Mode.
  var kioskModeBlockVolumeButtons: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block location services.
  var locationServicesBlocked: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block Near-Field Communication.
  var nfcBlocked: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block fingerprint unlock.
  var passwordBlockFingerprintUnlock: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block Smart Lock and other trust agents.
  var passwordBlockTrustAgents: js.UndefOr[scala.Boolean] = js.undefined
  // Number of days before the password expires. Valid values 1 to 365
  var passwordExpirationDays: js.UndefOr[scala.Double] = js.undefined
  // Minimum length of passwords. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[scala.Double] = js.undefined
  // Minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[scala.Double] = js.undefined
  // Number of previous passwords to block. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[scala.Double] = js.undefined
  // Indicates whether or not to require a password.
  var passwordRequired: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type of password that is required. Possible values are: deviceDefault, alphabetic, alphanumeric,
    * alphanumericWithSymbols, lowSecurityBiometric, numeric, numericComplex, any.
    */
  var passwordRequiredType: js.UndefOr[AndroidRequiredPasswordType] = js.undefined
  // Number of sign in failures allowed before factory reset. Valid values 1 to 16
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[scala.Double] = js.undefined
  // Indicates whether or not to block powering off the device.
  var powerOffBlocked: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block screenshots.
  var screenCaptureBlocked: js.UndefOr[scala.Boolean] = js.undefined
  // Require the Android Verify apps feature is turned on.
  var securityRequireVerifyApps: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block Google Backup.
  var storageBlockGoogleBackup: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block removable storage usage.
  var storageBlockRemovableStorage: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to require device encryption.
  var storageRequireDeviceEncryption: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to require removable storage encryption.
  var storageRequireRemovableStorageEncryption: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block the use of the Voice Assistant.
  var voiceAssistantBlocked: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block voice dialing.
  var voiceDialingBlocked: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block the web browser's auto fill feature.
  var webBrowserBlockAutofill: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block JavaScript within the web browser.
  var webBrowserBlockJavaScript: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block popups within the web browser.
  var webBrowserBlockPopups: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block the web browser.
  var webBrowserBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Cookie settings within the web browser. Possible values are: browserDefault, blockAlways, allowCurrentWebSite,
    * allowFromWebsitesVisited, allowAlways.
    */
  var webBrowserCookieSettings: js.UndefOr[WebBrowserCookieSettings] = js.undefined
  // Indicates whether or not to block syncing Wi-Fi.
  var wiFiBlocked: js.UndefOr[scala.Boolean] = js.undefined
}

object AndroidGeneralDeviceConfiguration {
  @scala.inline
  def apply(
    appsBlockClipboardSharing: js.UndefOr[scala.Boolean] = js.undefined,
    appsBlockCopyPaste: js.UndefOr[scala.Boolean] = js.undefined,
    appsBlockYouTube: js.UndefOr[scala.Boolean] = js.undefined,
    appsHideList: js.Array[AppListItem] = null,
    appsInstallAllowList: js.Array[AppListItem] = null,
    appsLaunchBlockList: js.Array[AppListItem] = null,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    bluetoothBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    cameraBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    cellularBlockDataRoaming: js.UndefOr[scala.Boolean] = js.undefined,
    cellularBlockMessaging: js.UndefOr[scala.Boolean] = js.undefined,
    cellularBlockVoiceRoaming: js.UndefOr[scala.Boolean] = js.undefined,
    cellularBlockWiFiTethering: js.UndefOr[scala.Boolean] = js.undefined,
    compliantAppListType: AppListType = null,
    compliantAppsList: js.Array[AppListItem] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceSharingAllowed: js.UndefOr[scala.Boolean] = js.undefined,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    diagnosticDataBlockSubmission: js.UndefOr[scala.Boolean] = js.undefined,
    displayName: java.lang.String = null,
    factoryResetBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    googleAccountBlockAutoSync: js.UndefOr[scala.Boolean] = js.undefined,
    googlePlayStoreBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    kioskModeApps: js.Array[AppListItem] = null,
    kioskModeBlockSleepButton: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeBlockVolumeButtons: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedDateTime: java.lang.String = null,
    locationServicesBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    nfcBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    passwordBlockFingerprintUnlock: js.UndefOr[scala.Boolean] = js.undefined,
    passwordBlockTrustAgents: js.UndefOr[scala.Boolean] = js.undefined,
    passwordExpirationDays: scala.Int | scala.Double = null,
    passwordMinimumLength: scala.Int | scala.Double = null,
    passwordMinutesOfInactivityBeforeScreenTimeout: scala.Int | scala.Double = null,
    passwordPreviousPasswordBlockCount: scala.Int | scala.Double = null,
    passwordRequired: js.UndefOr[scala.Boolean] = js.undefined,
    passwordRequiredType: AndroidRequiredPasswordType = null,
    passwordSignInFailureCountBeforeFactoryReset: scala.Int | scala.Double = null,
    powerOffBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    screenCaptureBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    securityRequireVerifyApps: js.UndefOr[scala.Boolean] = js.undefined,
    storageBlockGoogleBackup: js.UndefOr[scala.Boolean] = js.undefined,
    storageBlockRemovableStorage: js.UndefOr[scala.Boolean] = js.undefined,
    storageRequireDeviceEncryption: js.UndefOr[scala.Boolean] = js.undefined,
    storageRequireRemovableStorageEncryption: js.UndefOr[scala.Boolean] = js.undefined,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: scala.Int | scala.Double = null,
    voiceAssistantBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    voiceDialingBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    webBrowserBlockAutofill: js.UndefOr[scala.Boolean] = js.undefined,
    webBrowserBlockJavaScript: js.UndefOr[scala.Boolean] = js.undefined,
    webBrowserBlockPopups: js.UndefOr[scala.Boolean] = js.undefined,
    webBrowserBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    webBrowserCookieSettings: WebBrowserCookieSettings = null,
    wiFiBlocked: js.UndefOr[scala.Boolean] = js.undefined
  ): AndroidGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appsBlockClipboardSharing)) __obj.updateDynamic("appsBlockClipboardSharing")(appsBlockClipboardSharing)
    if (!js.isUndefined(appsBlockCopyPaste)) __obj.updateDynamic("appsBlockCopyPaste")(appsBlockCopyPaste)
    if (!js.isUndefined(appsBlockYouTube)) __obj.updateDynamic("appsBlockYouTube")(appsBlockYouTube)
    if (appsHideList != null) __obj.updateDynamic("appsHideList")(appsHideList)
    if (appsInstallAllowList != null) __obj.updateDynamic("appsInstallAllowList")(appsInstallAllowList)
    if (appsLaunchBlockList != null) __obj.updateDynamic("appsLaunchBlockList")(appsLaunchBlockList)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (!js.isUndefined(bluetoothBlocked)) __obj.updateDynamic("bluetoothBlocked")(bluetoothBlocked)
    if (!js.isUndefined(cameraBlocked)) __obj.updateDynamic("cameraBlocked")(cameraBlocked)
    if (!js.isUndefined(cellularBlockDataRoaming)) __obj.updateDynamic("cellularBlockDataRoaming")(cellularBlockDataRoaming)
    if (!js.isUndefined(cellularBlockMessaging)) __obj.updateDynamic("cellularBlockMessaging")(cellularBlockMessaging)
    if (!js.isUndefined(cellularBlockVoiceRoaming)) __obj.updateDynamic("cellularBlockVoiceRoaming")(cellularBlockVoiceRoaming)
    if (!js.isUndefined(cellularBlockWiFiTethering)) __obj.updateDynamic("cellularBlockWiFiTethering")(cellularBlockWiFiTethering)
    if (compliantAppListType != null) __obj.updateDynamic("compliantAppListType")(compliantAppListType)
    if (compliantAppsList != null) __obj.updateDynamic("compliantAppsList")(compliantAppsList)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (!js.isUndefined(deviceSharingAllowed)) __obj.updateDynamic("deviceSharingAllowed")(deviceSharingAllowed)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (!js.isUndefined(diagnosticDataBlockSubmission)) __obj.updateDynamic("diagnosticDataBlockSubmission")(diagnosticDataBlockSubmission)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(factoryResetBlocked)) __obj.updateDynamic("factoryResetBlocked")(factoryResetBlocked)
    if (!js.isUndefined(googleAccountBlockAutoSync)) __obj.updateDynamic("googleAccountBlockAutoSync")(googleAccountBlockAutoSync)
    if (!js.isUndefined(googlePlayStoreBlocked)) __obj.updateDynamic("googlePlayStoreBlocked")(googlePlayStoreBlocked)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kioskModeApps != null) __obj.updateDynamic("kioskModeApps")(kioskModeApps)
    if (!js.isUndefined(kioskModeBlockSleepButton)) __obj.updateDynamic("kioskModeBlockSleepButton")(kioskModeBlockSleepButton)
    if (!js.isUndefined(kioskModeBlockVolumeButtons)) __obj.updateDynamic("kioskModeBlockVolumeButtons")(kioskModeBlockVolumeButtons)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (!js.isUndefined(locationServicesBlocked)) __obj.updateDynamic("locationServicesBlocked")(locationServicesBlocked)
    if (!js.isUndefined(nfcBlocked)) __obj.updateDynamic("nfcBlocked")(nfcBlocked)
    if (!js.isUndefined(passwordBlockFingerprintUnlock)) __obj.updateDynamic("passwordBlockFingerprintUnlock")(passwordBlockFingerprintUnlock)
    if (!js.isUndefined(passwordBlockTrustAgents)) __obj.updateDynamic("passwordBlockTrustAgents")(passwordBlockTrustAgents)
    if (passwordExpirationDays != null) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.asInstanceOf[js.Any])
    if (passwordMinimumLength != null) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.asInstanceOf[js.Any])
    if (passwordMinutesOfInactivityBeforeScreenTimeout != null) __obj.updateDynamic("passwordMinutesOfInactivityBeforeScreenTimeout")(passwordMinutesOfInactivityBeforeScreenTimeout.asInstanceOf[js.Any])
    if (passwordPreviousPasswordBlockCount != null) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequired)) __obj.updateDynamic("passwordRequired")(passwordRequired)
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType)
    if (passwordSignInFailureCountBeforeFactoryReset != null) __obj.updateDynamic("passwordSignInFailureCountBeforeFactoryReset")(passwordSignInFailureCountBeforeFactoryReset.asInstanceOf[js.Any])
    if (!js.isUndefined(powerOffBlocked)) __obj.updateDynamic("powerOffBlocked")(powerOffBlocked)
    if (!js.isUndefined(screenCaptureBlocked)) __obj.updateDynamic("screenCaptureBlocked")(screenCaptureBlocked)
    if (!js.isUndefined(securityRequireVerifyApps)) __obj.updateDynamic("securityRequireVerifyApps")(securityRequireVerifyApps)
    if (!js.isUndefined(storageBlockGoogleBackup)) __obj.updateDynamic("storageBlockGoogleBackup")(storageBlockGoogleBackup)
    if (!js.isUndefined(storageBlockRemovableStorage)) __obj.updateDynamic("storageBlockRemovableStorage")(storageBlockRemovableStorage)
    if (!js.isUndefined(storageRequireDeviceEncryption)) __obj.updateDynamic("storageRequireDeviceEncryption")(storageRequireDeviceEncryption)
    if (!js.isUndefined(storageRequireRemovableStorageEncryption)) __obj.updateDynamic("storageRequireRemovableStorageEncryption")(storageRequireRemovableStorageEncryption)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceAssistantBlocked)) __obj.updateDynamic("voiceAssistantBlocked")(voiceAssistantBlocked)
    if (!js.isUndefined(voiceDialingBlocked)) __obj.updateDynamic("voiceDialingBlocked")(voiceDialingBlocked)
    if (!js.isUndefined(webBrowserBlockAutofill)) __obj.updateDynamic("webBrowserBlockAutofill")(webBrowserBlockAutofill)
    if (!js.isUndefined(webBrowserBlockJavaScript)) __obj.updateDynamic("webBrowserBlockJavaScript")(webBrowserBlockJavaScript)
    if (!js.isUndefined(webBrowserBlockPopups)) __obj.updateDynamic("webBrowserBlockPopups")(webBrowserBlockPopups)
    if (!js.isUndefined(webBrowserBlocked)) __obj.updateDynamic("webBrowserBlocked")(webBrowserBlocked)
    if (webBrowserCookieSettings != null) __obj.updateDynamic("webBrowserCookieSettings")(webBrowserCookieSettings)
    if (!js.isUndefined(wiFiBlocked)) __obj.updateDynamic("wiFiBlocked")(wiFiBlocked)
    __obj.asInstanceOf[AndroidGeneralDeviceConfiguration]
  }
}


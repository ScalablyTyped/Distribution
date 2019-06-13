package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsPhone81GeneralConfiguration extends DeviceConfiguration {
  /** Value indicating whether this policy only applies to Windows Phone 8.1. This property is read-only. */
  var applyOnlyToWindowsPhone81: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block copy paste. */
  var appsBlockCopyPaste: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block bluetooth. */
  var bluetoothBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block camera. */
  var cameraBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block Wi-Fi tethering. Has no impact if Wi-Fi is blocked. */
  var cellularBlockWifiTethering: js.UndefOr[scala.Boolean] = js.undefined
  /** List that is in the AppComplianceList. Possible values are: none, appsInListCompliant, appsNotInListCompliant. */
  var compliantAppListType: js.UndefOr[AppListType] = js.undefined
  /** List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements. */
  var compliantAppsList: js.UndefOr[js.Array[AppListItem]] = js.undefined
  /** Indicates whether or not to block diagnostic data submission. */
  var diagnosticDataBlockSubmission: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block custom email accounts. */
  var emailBlockAddingAccounts: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block location services. */
  var locationServicesBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block using a Microsoft Account. */
  var microsoftAccountBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block Near-Field Communication. */
  var nfcBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block syncing the calendar. */
  var passwordBlockSimple: js.UndefOr[scala.Boolean] = js.undefined
  /** Number of days before the password expires. */
  var passwordExpirationDays: js.UndefOr[scala.Double] = js.undefined
  /** Number of character sets a password must contain. */
  var passwordMinimumCharacterSetCount: js.UndefOr[scala.Double] = js.undefined
  /** Minimum length of passwords. */
  var passwordMinimumLength: js.UndefOr[scala.Double] = js.undefined
  /** Minutes of inactivity before screen timeout. */
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[scala.Double] = js.undefined
  /** Number of previous passwords to block. Valid values 0 to 24 */
  var passwordPreviousPasswordBlockCount: js.UndefOr[scala.Double] = js.undefined
  /** Indicates whether or not to require a password. */
  var passwordRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Password type that is required. Possible values are: deviceDefault, alphanumeric, numeric. */
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  /** Number of sign in failures allowed before factory reset. */
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[scala.Double] = js.undefined
  /** Indicates whether or not to block screenshots. */
  var screenCaptureBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block removable storage. */
  var storageBlockRemovableStorage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to require encryption. */
  var storageRequireEncryption: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the web browser. */
  var webBrowserBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked. */
  var wifiBlockAutomaticConnectHotspots: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block Wi-Fi hotspot reporting. Has no impact if Wi-Fi is blocked. */
  var wifiBlockHotspotReporting: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block Wi-Fi. */
  var wifiBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the Windows Store. */
  var windowsStoreBlocked: js.UndefOr[scala.Boolean] = js.undefined
}

object WindowsPhone81GeneralConfiguration {
  @scala.inline
  def apply(
    applyOnlyToWindowsPhone81: js.UndefOr[scala.Boolean] = js.undefined,
    appsBlockCopyPaste: js.UndefOr[scala.Boolean] = js.undefined,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    bluetoothBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    cameraBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    cellularBlockWifiTethering: js.UndefOr[scala.Boolean] = js.undefined,
    compliantAppListType: AppListType = null,
    compliantAppsList: js.Array[AppListItem] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    diagnosticDataBlockSubmission: js.UndefOr[scala.Boolean] = js.undefined,
    displayName: java.lang.String = null,
    emailBlockAddingAccounts: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    locationServicesBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    microsoftAccountBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    nfcBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    passwordBlockSimple: js.UndefOr[scala.Boolean] = js.undefined,
    passwordExpirationDays: scala.Int | scala.Double = null,
    passwordMinimumCharacterSetCount: scala.Int | scala.Double = null,
    passwordMinimumLength: scala.Int | scala.Double = null,
    passwordMinutesOfInactivityBeforeScreenTimeout: scala.Int | scala.Double = null,
    passwordPreviousPasswordBlockCount: scala.Int | scala.Double = null,
    passwordRequired: js.UndefOr[scala.Boolean] = js.undefined,
    passwordRequiredType: RequiredPasswordType = null,
    passwordSignInFailureCountBeforeFactoryReset: scala.Int | scala.Double = null,
    screenCaptureBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    storageBlockRemovableStorage: js.UndefOr[scala.Boolean] = js.undefined,
    storageRequireEncryption: js.UndefOr[scala.Boolean] = js.undefined,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: scala.Int | scala.Double = null,
    webBrowserBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    wifiBlockAutomaticConnectHotspots: js.UndefOr[scala.Boolean] = js.undefined,
    wifiBlockHotspotReporting: js.UndefOr[scala.Boolean] = js.undefined,
    wifiBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    windowsStoreBlocked: js.UndefOr[scala.Boolean] = js.undefined
  ): WindowsPhone81GeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyOnlyToWindowsPhone81)) __obj.updateDynamic("applyOnlyToWindowsPhone81")(applyOnlyToWindowsPhone81)
    if (!js.isUndefined(appsBlockCopyPaste)) __obj.updateDynamic("appsBlockCopyPaste")(appsBlockCopyPaste)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (!js.isUndefined(bluetoothBlocked)) __obj.updateDynamic("bluetoothBlocked")(bluetoothBlocked)
    if (!js.isUndefined(cameraBlocked)) __obj.updateDynamic("cameraBlocked")(cameraBlocked)
    if (!js.isUndefined(cellularBlockWifiTethering)) __obj.updateDynamic("cellularBlockWifiTethering")(cellularBlockWifiTethering)
    if (compliantAppListType != null) __obj.updateDynamic("compliantAppListType")(compliantAppListType)
    if (compliantAppsList != null) __obj.updateDynamic("compliantAppsList")(compliantAppsList)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (!js.isUndefined(diagnosticDataBlockSubmission)) __obj.updateDynamic("diagnosticDataBlockSubmission")(diagnosticDataBlockSubmission)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(emailBlockAddingAccounts)) __obj.updateDynamic("emailBlockAddingAccounts")(emailBlockAddingAccounts)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (!js.isUndefined(locationServicesBlocked)) __obj.updateDynamic("locationServicesBlocked")(locationServicesBlocked)
    if (!js.isUndefined(microsoftAccountBlocked)) __obj.updateDynamic("microsoftAccountBlocked")(microsoftAccountBlocked)
    if (!js.isUndefined(nfcBlocked)) __obj.updateDynamic("nfcBlocked")(nfcBlocked)
    if (!js.isUndefined(passwordBlockSimple)) __obj.updateDynamic("passwordBlockSimple")(passwordBlockSimple)
    if (passwordExpirationDays != null) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.asInstanceOf[js.Any])
    if (passwordMinimumCharacterSetCount != null) __obj.updateDynamic("passwordMinimumCharacterSetCount")(passwordMinimumCharacterSetCount.asInstanceOf[js.Any])
    if (passwordMinimumLength != null) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.asInstanceOf[js.Any])
    if (passwordMinutesOfInactivityBeforeScreenTimeout != null) __obj.updateDynamic("passwordMinutesOfInactivityBeforeScreenTimeout")(passwordMinutesOfInactivityBeforeScreenTimeout.asInstanceOf[js.Any])
    if (passwordPreviousPasswordBlockCount != null) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequired)) __obj.updateDynamic("passwordRequired")(passwordRequired)
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType)
    if (passwordSignInFailureCountBeforeFactoryReset != null) __obj.updateDynamic("passwordSignInFailureCountBeforeFactoryReset")(passwordSignInFailureCountBeforeFactoryReset.asInstanceOf[js.Any])
    if (!js.isUndefined(screenCaptureBlocked)) __obj.updateDynamic("screenCaptureBlocked")(screenCaptureBlocked)
    if (!js.isUndefined(storageBlockRemovableStorage)) __obj.updateDynamic("storageBlockRemovableStorage")(storageBlockRemovableStorage)
    if (!js.isUndefined(storageRequireEncryption)) __obj.updateDynamic("storageRequireEncryption")(storageRequireEncryption)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(webBrowserBlocked)) __obj.updateDynamic("webBrowserBlocked")(webBrowserBlocked)
    if (!js.isUndefined(wifiBlockAutomaticConnectHotspots)) __obj.updateDynamic("wifiBlockAutomaticConnectHotspots")(wifiBlockAutomaticConnectHotspots)
    if (!js.isUndefined(wifiBlockHotspotReporting)) __obj.updateDynamic("wifiBlockHotspotReporting")(wifiBlockHotspotReporting)
    if (!js.isUndefined(wifiBlocked)) __obj.updateDynamic("wifiBlocked")(wifiBlocked)
    if (!js.isUndefined(windowsStoreBlocked)) __obj.updateDynamic("windowsStoreBlocked")(windowsStoreBlocked)
    __obj.asInstanceOf[WindowsPhone81GeneralConfiguration]
  }
}


package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsPhone81GeneralConfiguration extends DeviceConfiguration {
  // Value indicating whether this policy only applies to Windows Phone 8.1. This property is read-only.
  var applyOnlyToWindowsPhone81: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block copy paste.
  var appsBlockCopyPaste: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block bluetooth.
  var bluetoothBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block camera.
  var cameraBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Wi-Fi tethering. Has no impact if Wi-Fi is blocked.
  var cellularBlockWifiTethering: js.UndefOr[Boolean] = js.native
  // List that is in the AppComplianceList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var compliantAppListType: js.UndefOr[AppListType] = js.native
  /**
    * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection
    * can contain a maximum of 10000 elements.
    */
  var compliantAppsList: js.UndefOr[js.Array[AppListItem]] = js.native
  // Indicates whether or not to block diagnostic data submission.
  var diagnosticDataBlockSubmission: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block custom email accounts.
  var emailBlockAddingAccounts: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block location services.
  var locationServicesBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block using a Microsoft Account.
  var microsoftAccountBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Near-Field Communication.
  var nfcBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block syncing the calendar.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.native
  // Number of days before the password expires.
  var passwordExpirationDays: js.UndefOr[Double] = js.native
  // Number of character sets a password must contain.
  var passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.native
  // Minimum length of passwords.
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before screen timeout.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.native
  // Number of previous passwords to block. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
  // Indicates whether or not to require a password.
  var passwordRequired: js.UndefOr[Boolean] = js.native
  // Password type that is required. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  // Number of sign in failures allowed before factory reset.
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.native
  // Indicates whether or not to block screenshots.
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block removable storage.
  var storageBlockRemovableStorage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require encryption.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the web browser.
  var webBrowserBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
  var wifiBlockAutomaticConnectHotspots: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Wi-Fi hotspot reporting. Has no impact if Wi-Fi is blocked.
  var wifiBlockHotspotReporting: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Wi-Fi.
  var wifiBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the Windows Store.
  var windowsStoreBlocked: js.UndefOr[Boolean] = js.native
}

object WindowsPhone81GeneralConfiguration {
  @scala.inline
  def apply(): WindowsPhone81GeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsPhone81GeneralConfiguration]
  }
  @scala.inline
  implicit class WindowsPhone81GeneralConfigurationOps[Self <: WindowsPhone81GeneralConfiguration] (val x: Self) extends AnyVal {
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
    def setApplyOnlyToWindowsPhone81(value: Boolean): Self = this.set("applyOnlyToWindowsPhone81", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyOnlyToWindowsPhone81: Self = this.set("applyOnlyToWindowsPhone81", js.undefined)
    @scala.inline
    def setAppsBlockCopyPaste(value: Boolean): Self = this.set("appsBlockCopyPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsBlockCopyPaste: Self = this.set("appsBlockCopyPaste", js.undefined)
    @scala.inline
    def setBluetoothBlocked(value: Boolean): Self = this.set("bluetoothBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBluetoothBlocked: Self = this.set("bluetoothBlocked", js.undefined)
    @scala.inline
    def setCameraBlocked(value: Boolean): Self = this.set("cameraBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraBlocked: Self = this.set("cameraBlocked", js.undefined)
    @scala.inline
    def setCellularBlockWifiTethering(value: Boolean): Self = this.set("cellularBlockWifiTethering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellularBlockWifiTethering: Self = this.set("cellularBlockWifiTethering", js.undefined)
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
    def setDiagnosticDataBlockSubmission(value: Boolean): Self = this.set("diagnosticDataBlockSubmission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnosticDataBlockSubmission: Self = this.set("diagnosticDataBlockSubmission", js.undefined)
    @scala.inline
    def setEmailBlockAddingAccounts(value: Boolean): Self = this.set("emailBlockAddingAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailBlockAddingAccounts: Self = this.set("emailBlockAddingAccounts", js.undefined)
    @scala.inline
    def setLocationServicesBlocked(value: Boolean): Self = this.set("locationServicesBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationServicesBlocked: Self = this.set("locationServicesBlocked", js.undefined)
    @scala.inline
    def setMicrosoftAccountBlocked(value: Boolean): Self = this.set("microsoftAccountBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrosoftAccountBlocked: Self = this.set("microsoftAccountBlocked", js.undefined)
    @scala.inline
    def setNfcBlocked(value: Boolean): Self = this.set("nfcBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNfcBlocked: Self = this.set("nfcBlocked", js.undefined)
    @scala.inline
    def setPasswordBlockSimple(value: Boolean): Self = this.set("passwordBlockSimple", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordBlockSimple: Self = this.set("passwordBlockSimple", js.undefined)
    @scala.inline
    def setPasswordExpirationDays(value: Double): Self = this.set("passwordExpirationDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordExpirationDays: Self = this.set("passwordExpirationDays", js.undefined)
    @scala.inline
    def setPasswordMinimumCharacterSetCount(value: Double): Self = this.set("passwordMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinimumCharacterSetCount: Self = this.set("passwordMinimumCharacterSetCount", js.undefined)
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
    def setPasswordRequiredType(value: RequiredPasswordType): Self = this.set("passwordRequiredType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordRequiredType: Self = this.set("passwordRequiredType", js.undefined)
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryReset(value: Double): Self = this.set("passwordSignInFailureCountBeforeFactoryReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordSignInFailureCountBeforeFactoryReset: Self = this.set("passwordSignInFailureCountBeforeFactoryReset", js.undefined)
    @scala.inline
    def setScreenCaptureBlocked(value: Boolean): Self = this.set("screenCaptureBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenCaptureBlocked: Self = this.set("screenCaptureBlocked", js.undefined)
    @scala.inline
    def setStorageBlockRemovableStorage(value: Boolean): Self = this.set("storageBlockRemovableStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageBlockRemovableStorage: Self = this.set("storageBlockRemovableStorage", js.undefined)
    @scala.inline
    def setStorageRequireEncryption(value: Boolean): Self = this.set("storageRequireEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageRequireEncryption: Self = this.set("storageRequireEncryption", js.undefined)
    @scala.inline
    def setWebBrowserBlocked(value: Boolean): Self = this.set("webBrowserBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebBrowserBlocked: Self = this.set("webBrowserBlocked", js.undefined)
    @scala.inline
    def setWifiBlockAutomaticConnectHotspots(value: Boolean): Self = this.set("wifiBlockAutomaticConnectHotspots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWifiBlockAutomaticConnectHotspots: Self = this.set("wifiBlockAutomaticConnectHotspots", js.undefined)
    @scala.inline
    def setWifiBlockHotspotReporting(value: Boolean): Self = this.set("wifiBlockHotspotReporting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWifiBlockHotspotReporting: Self = this.set("wifiBlockHotspotReporting", js.undefined)
    @scala.inline
    def setWifiBlocked(value: Boolean): Self = this.set("wifiBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWifiBlocked: Self = this.set("wifiBlocked", js.undefined)
    @scala.inline
    def setWindowsStoreBlocked(value: Boolean): Self = this.set("windowsStoreBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowsStoreBlocked: Self = this.set("windowsStoreBlocked", js.undefined)
  }
  
}


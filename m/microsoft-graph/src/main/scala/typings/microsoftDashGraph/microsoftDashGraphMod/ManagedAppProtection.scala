package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppProtection extends ManagedAppPolicy {
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
  // Indicates whether internet links should be opened in the managed browser app.
  var managedBrowserToOpenLinksRequired: js.UndefOr[Boolean] = js.undefined
  // Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
  var maximumPinRetries: js.UndefOr[Double] = js.undefined
  // Minimum pin length required for an app-level pin if PinRequired is set to True
  var minimumPinLength: js.UndefOr[Double] = js.undefined
  // Versions less than the specified version will block the managed app from accessing company data.
  var minimumRequiredAppVersion: js.UndefOr[String] = js.undefined
  // Versions less than the specified version will block the managed app from accessing company data.
  var minimumRequiredOsVersion: js.UndefOr[String] = js.undefined
  // Versions less than the specified version will result in warning message on the managed app.
  var minimumWarningAppVersion: js.UndefOr[String] = js.undefined
  // Versions less than the specified version will result in warning message on the managed app from accessing company data.
  var minimumWarningOsVersion: js.UndefOr[String] = js.undefined
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
  @scala.inline
  def apply(
    allowedDataStorageLocations: js.Array[ManagedAppDataStorageLocation] = null,
    allowedInboundDataTransferSources: ManagedAppDataTransferLevel = null,
    allowedOutboundClipboardSharingLevel: ManagedAppClipboardSharingLevel = null,
    allowedOutboundDataTransferDestinations: ManagedAppDataTransferLevel = null,
    contactSyncBlocked: js.UndefOr[Boolean] = js.undefined,
    createdDateTime: String = null,
    dataBackupBlocked: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    deviceComplianceRequired: js.UndefOr[Boolean] = js.undefined,
    disableAppPinIfDevicePinIsSet: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    fingerprintBlocked: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    lastModifiedDateTime: String = null,
    managedBrowserToOpenLinksRequired: js.UndefOr[Boolean] = js.undefined,
    maximumPinRetries: Int | Double = null,
    minimumPinLength: Int | Double = null,
    minimumRequiredAppVersion: String = null,
    minimumRequiredOsVersion: String = null,
    minimumWarningAppVersion: String = null,
    minimumWarningOsVersion: String = null,
    organizationalCredentialsRequired: js.UndefOr[Boolean] = js.undefined,
    periodBeforePinReset: String = null,
    periodOfflineBeforeAccessCheck: String = null,
    periodOfflineBeforeWipeIsEnforced: String = null,
    periodOnlineBeforeAccessCheck: String = null,
    pinCharacterSet: ManagedAppPinCharacterSet = null,
    pinRequired: js.UndefOr[Boolean] = js.undefined,
    printBlocked: js.UndefOr[Boolean] = js.undefined,
    saveAsBlocked: js.UndefOr[Boolean] = js.undefined,
    simplePinBlocked: js.UndefOr[Boolean] = js.undefined,
    version: String = null
  ): ManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    if (allowedDataStorageLocations != null) __obj.updateDynamic("allowedDataStorageLocations")(allowedDataStorageLocations.asInstanceOf[js.Any])
    if (allowedInboundDataTransferSources != null) __obj.updateDynamic("allowedInboundDataTransferSources")(allowedInboundDataTransferSources.asInstanceOf[js.Any])
    if (allowedOutboundClipboardSharingLevel != null) __obj.updateDynamic("allowedOutboundClipboardSharingLevel")(allowedOutboundClipboardSharingLevel.asInstanceOf[js.Any])
    if (allowedOutboundDataTransferDestinations != null) __obj.updateDynamic("allowedOutboundDataTransferDestinations")(allowedOutboundDataTransferDestinations.asInstanceOf[js.Any])
    if (!js.isUndefined(contactSyncBlocked)) __obj.updateDynamic("contactSyncBlocked")(contactSyncBlocked.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(dataBackupBlocked)) __obj.updateDynamic("dataBackupBlocked")(dataBackupBlocked.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceComplianceRequired)) __obj.updateDynamic("deviceComplianceRequired")(deviceComplianceRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAppPinIfDevicePinIsSet)) __obj.updateDynamic("disableAppPinIfDevicePinIsSet")(disableAppPinIfDevicePinIsSet.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(fingerprintBlocked)) __obj.updateDynamic("fingerprintBlocked")(fingerprintBlocked.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(managedBrowserToOpenLinksRequired)) __obj.updateDynamic("managedBrowserToOpenLinksRequired")(managedBrowserToOpenLinksRequired.asInstanceOf[js.Any])
    if (maximumPinRetries != null) __obj.updateDynamic("maximumPinRetries")(maximumPinRetries.asInstanceOf[js.Any])
    if (minimumPinLength != null) __obj.updateDynamic("minimumPinLength")(minimumPinLength.asInstanceOf[js.Any])
    if (minimumRequiredAppVersion != null) __obj.updateDynamic("minimumRequiredAppVersion")(minimumRequiredAppVersion.asInstanceOf[js.Any])
    if (minimumRequiredOsVersion != null) __obj.updateDynamic("minimumRequiredOsVersion")(minimumRequiredOsVersion.asInstanceOf[js.Any])
    if (minimumWarningAppVersion != null) __obj.updateDynamic("minimumWarningAppVersion")(minimumWarningAppVersion.asInstanceOf[js.Any])
    if (minimumWarningOsVersion != null) __obj.updateDynamic("minimumWarningOsVersion")(minimumWarningOsVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(organizationalCredentialsRequired)) __obj.updateDynamic("organizationalCredentialsRequired")(organizationalCredentialsRequired.asInstanceOf[js.Any])
    if (periodBeforePinReset != null) __obj.updateDynamic("periodBeforePinReset")(periodBeforePinReset.asInstanceOf[js.Any])
    if (periodOfflineBeforeAccessCheck != null) __obj.updateDynamic("periodOfflineBeforeAccessCheck")(periodOfflineBeforeAccessCheck.asInstanceOf[js.Any])
    if (periodOfflineBeforeWipeIsEnforced != null) __obj.updateDynamic("periodOfflineBeforeWipeIsEnforced")(periodOfflineBeforeWipeIsEnforced.asInstanceOf[js.Any])
    if (periodOnlineBeforeAccessCheck != null) __obj.updateDynamic("periodOnlineBeforeAccessCheck")(periodOnlineBeforeAccessCheck.asInstanceOf[js.Any])
    if (pinCharacterSet != null) __obj.updateDynamic("pinCharacterSet")(pinCharacterSet.asInstanceOf[js.Any])
    if (!js.isUndefined(pinRequired)) __obj.updateDynamic("pinRequired")(pinRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(printBlocked)) __obj.updateDynamic("printBlocked")(printBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(saveAsBlocked)) __obj.updateDynamic("saveAsBlocked")(saveAsBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(simplePinBlocked)) __obj.updateDynamic("simplePinBlocked")(simplePinBlocked.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedAppProtection]
  }
}


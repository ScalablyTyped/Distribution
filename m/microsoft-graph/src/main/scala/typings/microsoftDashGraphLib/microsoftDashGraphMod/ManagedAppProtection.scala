package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppProtection extends ManagedAppPolicy {
  /** Data storage locations where a user may store managed data. */
  var allowedDataStorageLocations: js.UndefOr[js.Array[ManagedAppDataStorageLocation]] = js.undefined
  /** Sources from which data is allowed to be transferred. Possible values are: allApps, managedApps, none. */
  var allowedInboundDataTransferSources: js.UndefOr[ManagedAppDataTransferLevel] = js.undefined
  /** The level to which the clipboard may be shared between apps on the managed device. Possible values are: allApps, managedAppsWithPasteIn, managedApps, blocked. */
  var allowedOutboundClipboardSharingLevel: js.UndefOr[ManagedAppClipboardSharingLevel] = js.undefined
  /** Destinations to which data is allowed to be transferred. Possible values are: allApps, managedApps, none. */
  var allowedOutboundDataTransferDestinations: js.UndefOr[ManagedAppDataTransferLevel] = js.undefined
  /** Indicates whether contacts can be synced to the user's device. */
  var contactSyncBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether the backup of a managed app's data is blocked. */
  var dataBackupBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether device compliance is required. */
  var deviceComplianceRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether use of the app pin is required if the device pin is set. */
  var disableAppPinIfDevicePinIsSet: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True. */
  var fingerprintBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether internet links should be opened in the managed browser app. */
  var managedBrowserToOpenLinksRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped. */
  var maximumPinRetries: js.UndefOr[scala.Double] = js.undefined
  /** Minimum pin length required for an app-level pin if PinRequired is set to True */
  var minimumPinLength: js.UndefOr[scala.Double] = js.undefined
  /** Versions less than the specified version will block the managed app from accessing company data. */
  var minimumRequiredAppVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Versions less than the specified version will block the managed app from accessing company data. */
  var minimumRequiredOsVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Versions less than the specified version will result in warning message on the managed app. */
  var minimumWarningAppVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Versions less than the specified version will result in warning message on the managed app from accessing company data. */
  var minimumWarningOsVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether organizational credentials are required for app use. */
  var organizationalCredentialsRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** TimePeriod before the all-level pin must be reset if PinRequired is set to True. */
  var periodBeforePinReset: js.UndefOr[java.lang.String] = js.undefined
  /** The period after which access is checked when the device is not connected to the internet. */
  var periodOfflineBeforeAccessCheck: js.UndefOr[java.lang.String] = js.undefined
  /** The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped. */
  var periodOfflineBeforeWipeIsEnforced: js.UndefOr[java.lang.String] = js.undefined
  /** The period after which access is checked when the device is connected to the internet. */
  var periodOnlineBeforeAccessCheck: js.UndefOr[java.lang.String] = js.undefined
  /** Character set which may be used for an app-level pin if PinRequired is set to True. Possible values are: numeric, alphanumericAndSymbol. */
  var pinCharacterSet: js.UndefOr[ManagedAppPinCharacterSet] = js.undefined
  /** Indicates whether an app-level pin is required. */
  var pinRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether printing is allowed from managed apps. */
  var printBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether users may use the 'Save As' menu item to save a copy of protected files. */
  var saveAsBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether simplePin is blocked. */
  var simplePinBlocked: js.UndefOr[scala.Boolean] = js.undefined
}

object ManagedAppProtection {
  @scala.inline
  def apply(
    allowedDataStorageLocations: js.Array[ManagedAppDataStorageLocation] = null,
    allowedInboundDataTransferSources: ManagedAppDataTransferLevel = null,
    allowedOutboundClipboardSharingLevel: ManagedAppClipboardSharingLevel = null,
    allowedOutboundDataTransferDestinations: ManagedAppDataTransferLevel = null,
    contactSyncBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    createdDateTime: java.lang.String = null,
    dataBackupBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    deviceComplianceRequired: js.UndefOr[scala.Boolean] = js.undefined,
    disableAppPinIfDevicePinIsSet: js.UndefOr[scala.Boolean] = js.undefined,
    displayName: java.lang.String = null,
    fingerprintBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    managedBrowserToOpenLinksRequired: js.UndefOr[scala.Boolean] = js.undefined,
    maximumPinRetries: scala.Int | scala.Double = null,
    minimumPinLength: scala.Int | scala.Double = null,
    minimumRequiredAppVersion: java.lang.String = null,
    minimumRequiredOsVersion: java.lang.String = null,
    minimumWarningAppVersion: java.lang.String = null,
    minimumWarningOsVersion: java.lang.String = null,
    organizationalCredentialsRequired: js.UndefOr[scala.Boolean] = js.undefined,
    periodBeforePinReset: java.lang.String = null,
    periodOfflineBeforeAccessCheck: java.lang.String = null,
    periodOfflineBeforeWipeIsEnforced: java.lang.String = null,
    periodOnlineBeforeAccessCheck: java.lang.String = null,
    pinCharacterSet: ManagedAppPinCharacterSet = null,
    pinRequired: js.UndefOr[scala.Boolean] = js.undefined,
    printBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    saveAsBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    simplePinBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null
  ): ManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    if (allowedDataStorageLocations != null) __obj.updateDynamic("allowedDataStorageLocations")(allowedDataStorageLocations)
    if (allowedInboundDataTransferSources != null) __obj.updateDynamic("allowedInboundDataTransferSources")(allowedInboundDataTransferSources)
    if (allowedOutboundClipboardSharingLevel != null) __obj.updateDynamic("allowedOutboundClipboardSharingLevel")(allowedOutboundClipboardSharingLevel)
    if (allowedOutboundDataTransferDestinations != null) __obj.updateDynamic("allowedOutboundDataTransferDestinations")(allowedOutboundDataTransferDestinations)
    if (!js.isUndefined(contactSyncBlocked)) __obj.updateDynamic("contactSyncBlocked")(contactSyncBlocked)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (!js.isUndefined(dataBackupBlocked)) __obj.updateDynamic("dataBackupBlocked")(dataBackupBlocked)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(deviceComplianceRequired)) __obj.updateDynamic("deviceComplianceRequired")(deviceComplianceRequired)
    if (!js.isUndefined(disableAppPinIfDevicePinIsSet)) __obj.updateDynamic("disableAppPinIfDevicePinIsSet")(disableAppPinIfDevicePinIsSet)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(fingerprintBlocked)) __obj.updateDynamic("fingerprintBlocked")(fingerprintBlocked)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (!js.isUndefined(managedBrowserToOpenLinksRequired)) __obj.updateDynamic("managedBrowserToOpenLinksRequired")(managedBrowserToOpenLinksRequired)
    if (maximumPinRetries != null) __obj.updateDynamic("maximumPinRetries")(maximumPinRetries.asInstanceOf[js.Any])
    if (minimumPinLength != null) __obj.updateDynamic("minimumPinLength")(minimumPinLength.asInstanceOf[js.Any])
    if (minimumRequiredAppVersion != null) __obj.updateDynamic("minimumRequiredAppVersion")(minimumRequiredAppVersion)
    if (minimumRequiredOsVersion != null) __obj.updateDynamic("minimumRequiredOsVersion")(minimumRequiredOsVersion)
    if (minimumWarningAppVersion != null) __obj.updateDynamic("minimumWarningAppVersion")(minimumWarningAppVersion)
    if (minimumWarningOsVersion != null) __obj.updateDynamic("minimumWarningOsVersion")(minimumWarningOsVersion)
    if (!js.isUndefined(organizationalCredentialsRequired)) __obj.updateDynamic("organizationalCredentialsRequired")(organizationalCredentialsRequired)
    if (periodBeforePinReset != null) __obj.updateDynamic("periodBeforePinReset")(periodBeforePinReset)
    if (periodOfflineBeforeAccessCheck != null) __obj.updateDynamic("periodOfflineBeforeAccessCheck")(periodOfflineBeforeAccessCheck)
    if (periodOfflineBeforeWipeIsEnforced != null) __obj.updateDynamic("periodOfflineBeforeWipeIsEnforced")(periodOfflineBeforeWipeIsEnforced)
    if (periodOnlineBeforeAccessCheck != null) __obj.updateDynamic("periodOnlineBeforeAccessCheck")(periodOnlineBeforeAccessCheck)
    if (pinCharacterSet != null) __obj.updateDynamic("pinCharacterSet")(pinCharacterSet)
    if (!js.isUndefined(pinRequired)) __obj.updateDynamic("pinRequired")(pinRequired)
    if (!js.isUndefined(printBlocked)) __obj.updateDynamic("printBlocked")(printBlocked)
    if (!js.isUndefined(saveAsBlocked)) __obj.updateDynamic("saveAsBlocked")(saveAsBlocked)
    if (!js.isUndefined(simplePinBlocked)) __obj.updateDynamic("simplePinBlocked")(simplePinBlocked)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ManagedAppProtection]
  }
}


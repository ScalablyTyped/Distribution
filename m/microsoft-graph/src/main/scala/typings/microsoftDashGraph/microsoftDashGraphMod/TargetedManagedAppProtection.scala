package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetedManagedAppProtection extends ManagedAppProtection {
  // Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
  var assignments: js.UndefOr[js.Array[TargetedManagedAppPolicyAssignment]] = js.undefined
  // Indicates if the policy is deployed to any inclusion groups or not.
  var isAssigned: js.UndefOr[Boolean] = js.undefined
}

object TargetedManagedAppProtection {
  @scala.inline
  def apply(
    allowedDataStorageLocations: js.Array[ManagedAppDataStorageLocation] = null,
    allowedInboundDataTransferSources: ManagedAppDataTransferLevel = null,
    allowedOutboundClipboardSharingLevel: ManagedAppClipboardSharingLevel = null,
    allowedOutboundDataTransferDestinations: ManagedAppDataTransferLevel = null,
    assignments: js.Array[TargetedManagedAppPolicyAssignment] = null,
    contactSyncBlocked: js.UndefOr[Boolean] = js.undefined,
    createdDateTime: String = null,
    dataBackupBlocked: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    deviceComplianceRequired: js.UndefOr[Boolean] = js.undefined,
    disableAppPinIfDevicePinIsSet: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    fingerprintBlocked: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    isAssigned: js.UndefOr[Boolean] = js.undefined,
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
  ): TargetedManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    if (allowedDataStorageLocations != null) __obj.updateDynamic("allowedDataStorageLocations")(allowedDataStorageLocations)
    if (allowedInboundDataTransferSources != null) __obj.updateDynamic("allowedInboundDataTransferSources")(allowedInboundDataTransferSources)
    if (allowedOutboundClipboardSharingLevel != null) __obj.updateDynamic("allowedOutboundClipboardSharingLevel")(allowedOutboundClipboardSharingLevel)
    if (allowedOutboundDataTransferDestinations != null) __obj.updateDynamic("allowedOutboundDataTransferDestinations")(allowedOutboundDataTransferDestinations)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (!js.isUndefined(contactSyncBlocked)) __obj.updateDynamic("contactSyncBlocked")(contactSyncBlocked)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (!js.isUndefined(dataBackupBlocked)) __obj.updateDynamic("dataBackupBlocked")(dataBackupBlocked)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(deviceComplianceRequired)) __obj.updateDynamic("deviceComplianceRequired")(deviceComplianceRequired)
    if (!js.isUndefined(disableAppPinIfDevicePinIsSet)) __obj.updateDynamic("disableAppPinIfDevicePinIsSet")(disableAppPinIfDevicePinIsSet)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(fingerprintBlocked)) __obj.updateDynamic("fingerprintBlocked")(fingerprintBlocked)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isAssigned)) __obj.updateDynamic("isAssigned")(isAssigned)
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
    __obj.asInstanceOf[TargetedManagedAppProtection]
  }
}


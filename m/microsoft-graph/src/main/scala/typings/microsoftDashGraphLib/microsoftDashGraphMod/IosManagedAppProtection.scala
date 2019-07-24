package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosManagedAppProtection extends TargetedManagedAppProtection {
  /**
    * Type of encryption which should be used for data in a managed app. Possible values are: useDeviceSettings,
    * afterDeviceRestart, whenDeviceLockedExceptOpenFiles, whenDeviceLocked.
    */
  var appDataEncryptionType: js.UndefOr[ManagedAppDataEncryptionType] = js.undefined
  // List of apps to which the policy is deployed.
  var apps: js.UndefOr[js.Array[ManagedMobileApp]] = js.undefined
  // Count of apps to which the current policy is deployed.
  var deployedAppCount: js.UndefOr[scala.Double] = js.undefined
  // Navigation property to deployment summary of the configuration.
  var deploymentSummary: js.UndefOr[ManagedAppPolicyDeploymentSummary] = js.undefined
  // Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
  var faceIdBlocked: js.UndefOr[scala.Boolean] = js.undefined
  // Versions less than the specified version will block the managed app from accessing company data.
  var minimumRequiredSdkVersion: js.UndefOr[java.lang.String] = js.undefined
}

object IosManagedAppProtection {
  @scala.inline
  def apply(
    allowedDataStorageLocations: js.Array[ManagedAppDataStorageLocation] = null,
    allowedInboundDataTransferSources: ManagedAppDataTransferLevel = null,
    allowedOutboundClipboardSharingLevel: ManagedAppClipboardSharingLevel = null,
    allowedOutboundDataTransferDestinations: ManagedAppDataTransferLevel = null,
    appDataEncryptionType: ManagedAppDataEncryptionType = null,
    apps: js.Array[ManagedMobileApp] = null,
    assignments: js.Array[TargetedManagedAppPolicyAssignment] = null,
    contactSyncBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    createdDateTime: java.lang.String = null,
    dataBackupBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    deployedAppCount: scala.Int | scala.Double = null,
    deploymentSummary: ManagedAppPolicyDeploymentSummary = null,
    description: java.lang.String = null,
    deviceComplianceRequired: js.UndefOr[scala.Boolean] = js.undefined,
    disableAppPinIfDevicePinIsSet: js.UndefOr[scala.Boolean] = js.undefined,
    displayName: java.lang.String = null,
    faceIdBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    fingerprintBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    isAssigned: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedDateTime: java.lang.String = null,
    managedBrowserToOpenLinksRequired: js.UndefOr[scala.Boolean] = js.undefined,
    maximumPinRetries: scala.Int | scala.Double = null,
    minimumPinLength: scala.Int | scala.Double = null,
    minimumRequiredAppVersion: java.lang.String = null,
    minimumRequiredOsVersion: java.lang.String = null,
    minimumRequiredSdkVersion: java.lang.String = null,
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
  ): IosManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    if (allowedDataStorageLocations != null) __obj.updateDynamic("allowedDataStorageLocations")(allowedDataStorageLocations)
    if (allowedInboundDataTransferSources != null) __obj.updateDynamic("allowedInboundDataTransferSources")(allowedInboundDataTransferSources)
    if (allowedOutboundClipboardSharingLevel != null) __obj.updateDynamic("allowedOutboundClipboardSharingLevel")(allowedOutboundClipboardSharingLevel)
    if (allowedOutboundDataTransferDestinations != null) __obj.updateDynamic("allowedOutboundDataTransferDestinations")(allowedOutboundDataTransferDestinations)
    if (appDataEncryptionType != null) __obj.updateDynamic("appDataEncryptionType")(appDataEncryptionType)
    if (apps != null) __obj.updateDynamic("apps")(apps)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (!js.isUndefined(contactSyncBlocked)) __obj.updateDynamic("contactSyncBlocked")(contactSyncBlocked)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (!js.isUndefined(dataBackupBlocked)) __obj.updateDynamic("dataBackupBlocked")(dataBackupBlocked)
    if (deployedAppCount != null) __obj.updateDynamic("deployedAppCount")(deployedAppCount.asInstanceOf[js.Any])
    if (deploymentSummary != null) __obj.updateDynamic("deploymentSummary")(deploymentSummary)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(deviceComplianceRequired)) __obj.updateDynamic("deviceComplianceRequired")(deviceComplianceRequired)
    if (!js.isUndefined(disableAppPinIfDevicePinIsSet)) __obj.updateDynamic("disableAppPinIfDevicePinIsSet")(disableAppPinIfDevicePinIsSet)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(faceIdBlocked)) __obj.updateDynamic("faceIdBlocked")(faceIdBlocked)
    if (!js.isUndefined(fingerprintBlocked)) __obj.updateDynamic("fingerprintBlocked")(fingerprintBlocked)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isAssigned)) __obj.updateDynamic("isAssigned")(isAssigned)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (!js.isUndefined(managedBrowserToOpenLinksRequired)) __obj.updateDynamic("managedBrowserToOpenLinksRequired")(managedBrowserToOpenLinksRequired)
    if (maximumPinRetries != null) __obj.updateDynamic("maximumPinRetries")(maximumPinRetries.asInstanceOf[js.Any])
    if (minimumPinLength != null) __obj.updateDynamic("minimumPinLength")(minimumPinLength.asInstanceOf[js.Any])
    if (minimumRequiredAppVersion != null) __obj.updateDynamic("minimumRequiredAppVersion")(minimumRequiredAppVersion)
    if (minimumRequiredOsVersion != null) __obj.updateDynamic("minimumRequiredOsVersion")(minimumRequiredOsVersion)
    if (minimumRequiredSdkVersion != null) __obj.updateDynamic("minimumRequiredSdkVersion")(minimumRequiredSdkVersion)
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
    __obj.asInstanceOf[IosManagedAppProtection]
  }
}


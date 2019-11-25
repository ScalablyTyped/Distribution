package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidManagedAppProtection extends TargetedManagedAppProtection {
  // List of apps to which the policy is deployed.
  var apps: js.UndefOr[js.Array[ManagedMobileApp]] = js.undefined
  // Count of apps to which the current policy is deployed.
  var deployedAppCount: js.UndefOr[Double] = js.undefined
  // Navigation property to deployment summary of the configuration.
  var deploymentSummary: js.UndefOr[ManagedAppPolicyDeploymentSummary] = js.undefined
  // When this setting is enabled, app level encryption is disabled if device level encryption is enabled
  var disableAppEncryptionIfDeviceEncryptionIsEnabled: js.UndefOr[Boolean] = js.undefined
  // Indicates whether application data for managed apps should be encrypted
  var encryptAppData: js.UndefOr[Boolean] = js.undefined
  // Define the oldest required Android security patch level a user can have to gain secure access to the app.
  var minimumRequiredPatchVersion: js.UndefOr[String] = js.undefined
  // Define the oldest recommended Android security patch level a user can have for secure access to the app.
  var minimumWarningPatchVersion: js.UndefOr[String] = js.undefined
  // Indicates whether a managed user can take screen captures of managed apps
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.undefined
}

object AndroidManagedAppProtection {
  @scala.inline
  def apply(
    allowedDataStorageLocations: js.Array[ManagedAppDataStorageLocation] = null,
    allowedInboundDataTransferSources: ManagedAppDataTransferLevel = null,
    allowedOutboundClipboardSharingLevel: ManagedAppClipboardSharingLevel = null,
    allowedOutboundDataTransferDestinations: ManagedAppDataTransferLevel = null,
    apps: js.Array[ManagedMobileApp] = null,
    assignments: js.Array[TargetedManagedAppPolicyAssignment] = null,
    contactSyncBlocked: js.UndefOr[Boolean] = js.undefined,
    createdDateTime: String = null,
    dataBackupBlocked: js.UndefOr[Boolean] = js.undefined,
    deployedAppCount: Int | Double = null,
    deploymentSummary: ManagedAppPolicyDeploymentSummary = null,
    description: String = null,
    deviceComplianceRequired: js.UndefOr[Boolean] = js.undefined,
    disableAppEncryptionIfDeviceEncryptionIsEnabled: js.UndefOr[Boolean] = js.undefined,
    disableAppPinIfDevicePinIsSet: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    encryptAppData: js.UndefOr[Boolean] = js.undefined,
    fingerprintBlocked: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    isAssigned: js.UndefOr[Boolean] = js.undefined,
    lastModifiedDateTime: String = null,
    managedBrowserToOpenLinksRequired: js.UndefOr[Boolean] = js.undefined,
    maximumPinRetries: Int | Double = null,
    minimumPinLength: Int | Double = null,
    minimumRequiredAppVersion: String = null,
    minimumRequiredOsVersion: String = null,
    minimumRequiredPatchVersion: String = null,
    minimumWarningAppVersion: String = null,
    minimumWarningOsVersion: String = null,
    minimumWarningPatchVersion: String = null,
    organizationalCredentialsRequired: js.UndefOr[Boolean] = js.undefined,
    periodBeforePinReset: String = null,
    periodOfflineBeforeAccessCheck: String = null,
    periodOfflineBeforeWipeIsEnforced: String = null,
    periodOnlineBeforeAccessCheck: String = null,
    pinCharacterSet: ManagedAppPinCharacterSet = null,
    pinRequired: js.UndefOr[Boolean] = js.undefined,
    printBlocked: js.UndefOr[Boolean] = js.undefined,
    saveAsBlocked: js.UndefOr[Boolean] = js.undefined,
    screenCaptureBlocked: js.UndefOr[Boolean] = js.undefined,
    simplePinBlocked: js.UndefOr[Boolean] = js.undefined,
    version: String = null
  ): AndroidManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    if (allowedDataStorageLocations != null) __obj.updateDynamic("allowedDataStorageLocations")(allowedDataStorageLocations.asInstanceOf[js.Any])
    if (allowedInboundDataTransferSources != null) __obj.updateDynamic("allowedInboundDataTransferSources")(allowedInboundDataTransferSources.asInstanceOf[js.Any])
    if (allowedOutboundClipboardSharingLevel != null) __obj.updateDynamic("allowedOutboundClipboardSharingLevel")(allowedOutboundClipboardSharingLevel.asInstanceOf[js.Any])
    if (allowedOutboundDataTransferDestinations != null) __obj.updateDynamic("allowedOutboundDataTransferDestinations")(allowedOutboundDataTransferDestinations.asInstanceOf[js.Any])
    if (apps != null) __obj.updateDynamic("apps")(apps.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (!js.isUndefined(contactSyncBlocked)) __obj.updateDynamic("contactSyncBlocked")(contactSyncBlocked.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(dataBackupBlocked)) __obj.updateDynamic("dataBackupBlocked")(dataBackupBlocked.asInstanceOf[js.Any])
    if (deployedAppCount != null) __obj.updateDynamic("deployedAppCount")(deployedAppCount.asInstanceOf[js.Any])
    if (deploymentSummary != null) __obj.updateDynamic("deploymentSummary")(deploymentSummary.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceComplianceRequired)) __obj.updateDynamic("deviceComplianceRequired")(deviceComplianceRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAppEncryptionIfDeviceEncryptionIsEnabled)) __obj.updateDynamic("disableAppEncryptionIfDeviceEncryptionIsEnabled")(disableAppEncryptionIfDeviceEncryptionIsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAppPinIfDevicePinIsSet)) __obj.updateDynamic("disableAppPinIfDevicePinIsSet")(disableAppPinIfDevicePinIsSet.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(encryptAppData)) __obj.updateDynamic("encryptAppData")(encryptAppData.asInstanceOf[js.Any])
    if (!js.isUndefined(fingerprintBlocked)) __obj.updateDynamic("fingerprintBlocked")(fingerprintBlocked.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isAssigned)) __obj.updateDynamic("isAssigned")(isAssigned.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(managedBrowserToOpenLinksRequired)) __obj.updateDynamic("managedBrowserToOpenLinksRequired")(managedBrowserToOpenLinksRequired.asInstanceOf[js.Any])
    if (maximumPinRetries != null) __obj.updateDynamic("maximumPinRetries")(maximumPinRetries.asInstanceOf[js.Any])
    if (minimumPinLength != null) __obj.updateDynamic("minimumPinLength")(minimumPinLength.asInstanceOf[js.Any])
    if (minimumRequiredAppVersion != null) __obj.updateDynamic("minimumRequiredAppVersion")(minimumRequiredAppVersion.asInstanceOf[js.Any])
    if (minimumRequiredOsVersion != null) __obj.updateDynamic("minimumRequiredOsVersion")(minimumRequiredOsVersion.asInstanceOf[js.Any])
    if (minimumRequiredPatchVersion != null) __obj.updateDynamic("minimumRequiredPatchVersion")(minimumRequiredPatchVersion.asInstanceOf[js.Any])
    if (minimumWarningAppVersion != null) __obj.updateDynamic("minimumWarningAppVersion")(minimumWarningAppVersion.asInstanceOf[js.Any])
    if (minimumWarningOsVersion != null) __obj.updateDynamic("minimumWarningOsVersion")(minimumWarningOsVersion.asInstanceOf[js.Any])
    if (minimumWarningPatchVersion != null) __obj.updateDynamic("minimumWarningPatchVersion")(minimumWarningPatchVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(organizationalCredentialsRequired)) __obj.updateDynamic("organizationalCredentialsRequired")(organizationalCredentialsRequired.asInstanceOf[js.Any])
    if (periodBeforePinReset != null) __obj.updateDynamic("periodBeforePinReset")(periodBeforePinReset.asInstanceOf[js.Any])
    if (periodOfflineBeforeAccessCheck != null) __obj.updateDynamic("periodOfflineBeforeAccessCheck")(periodOfflineBeforeAccessCheck.asInstanceOf[js.Any])
    if (periodOfflineBeforeWipeIsEnforced != null) __obj.updateDynamic("periodOfflineBeforeWipeIsEnforced")(periodOfflineBeforeWipeIsEnforced.asInstanceOf[js.Any])
    if (periodOnlineBeforeAccessCheck != null) __obj.updateDynamic("periodOnlineBeforeAccessCheck")(periodOnlineBeforeAccessCheck.asInstanceOf[js.Any])
    if (pinCharacterSet != null) __obj.updateDynamic("pinCharacterSet")(pinCharacterSet.asInstanceOf[js.Any])
    if (!js.isUndefined(pinRequired)) __obj.updateDynamic("pinRequired")(pinRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(printBlocked)) __obj.updateDynamic("printBlocked")(printBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(saveAsBlocked)) __obj.updateDynamic("saveAsBlocked")(saveAsBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(screenCaptureBlocked)) __obj.updateDynamic("screenCaptureBlocked")(screenCaptureBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(simplePinBlocked)) __obj.updateDynamic("simplePinBlocked")(simplePinBlocked.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidManagedAppProtection]
  }
}


package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultManagedAppProtection extends ManagedAppProtection {
  /**
    * Type of encryption which should be used for data in a managed app. (iOS Only). Possible values are: useDeviceSettings,
    * afterDeviceRestart, whenDeviceLockedExceptOpenFiles, whenDeviceLocked.
    */
  var appDataEncryptionType: js.UndefOr[ManagedAppDataEncryptionType] = js.undefined
  // List of apps to which the policy is deployed.
  var apps: js.UndefOr[js.Array[ManagedMobileApp]] = js.undefined
  // A set of string key and string value pairs to be sent to the affected users, unalterned by this service
  var customSettings: js.UndefOr[js.Array[KeyValuePair]] = js.undefined
  // Count of apps to which the current policy is deployed.
  var deployedAppCount: js.UndefOr[Double] = js.undefined
  // Navigation property to deployment summary of the configuration.
  var deploymentSummary: js.UndefOr[ManagedAppPolicyDeploymentSummary] = js.undefined
  // When this setting is enabled, app level encryption is disabled if device level encryption is enabled. (Android only)
  var disableAppEncryptionIfDeviceEncryptionIsEnabled: js.UndefOr[Boolean] = js.undefined
  // Indicates whether managed-app data should be encrypted. (Android only)
  var encryptAppData: js.UndefOr[Boolean] = js.undefined
  // Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. (iOS Only)
  var faceIdBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Define the oldest required Android security patch level a user can have to gain secure access to the app. (Android
    * only)
    */
  var minimumRequiredPatchVersion: js.UndefOr[String] = js.undefined
  // Versions less than the specified version will block the managed app from accessing company data. (iOS Only)
  var minimumRequiredSdkVersion: js.UndefOr[String] = js.undefined
  // Define the oldest recommended Android security patch level a user can have for secure access to the app. (Android only)
  var minimumWarningPatchVersion: js.UndefOr[String] = js.undefined
  // Indicates whether screen capture is blocked. (Android only)
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.undefined
}

object DefaultManagedAppProtection {
  @scala.inline
  def apply(
    allowedDataStorageLocations: js.Array[ManagedAppDataStorageLocation] = null,
    allowedInboundDataTransferSources: ManagedAppDataTransferLevel = null,
    allowedOutboundClipboardSharingLevel: ManagedAppClipboardSharingLevel = null,
    allowedOutboundDataTransferDestinations: ManagedAppDataTransferLevel = null,
    appDataEncryptionType: ManagedAppDataEncryptionType = null,
    apps: js.Array[ManagedMobileApp] = null,
    contactSyncBlocked: js.UndefOr[Boolean] = js.undefined,
    createdDateTime: String = null,
    customSettings: js.Array[KeyValuePair] = null,
    dataBackupBlocked: js.UndefOr[Boolean] = js.undefined,
    deployedAppCount: Int | Double = null,
    deploymentSummary: ManagedAppPolicyDeploymentSummary = null,
    description: String = null,
    deviceComplianceRequired: js.UndefOr[Boolean] = js.undefined,
    disableAppEncryptionIfDeviceEncryptionIsEnabled: js.UndefOr[Boolean] = js.undefined,
    disableAppPinIfDevicePinIsSet: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    encryptAppData: js.UndefOr[Boolean] = js.undefined,
    faceIdBlocked: js.UndefOr[Boolean] = js.undefined,
    fingerprintBlocked: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    lastModifiedDateTime: String = null,
    managedBrowserToOpenLinksRequired: js.UndefOr[Boolean] = js.undefined,
    maximumPinRetries: Int | Double = null,
    minimumPinLength: Int | Double = null,
    minimumRequiredAppVersion: String = null,
    minimumRequiredOsVersion: String = null,
    minimumRequiredPatchVersion: String = null,
    minimumRequiredSdkVersion: String = null,
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
  ): DefaultManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    if (allowedDataStorageLocations != null) __obj.updateDynamic("allowedDataStorageLocations")(allowedDataStorageLocations)
    if (allowedInboundDataTransferSources != null) __obj.updateDynamic("allowedInboundDataTransferSources")(allowedInboundDataTransferSources)
    if (allowedOutboundClipboardSharingLevel != null) __obj.updateDynamic("allowedOutboundClipboardSharingLevel")(allowedOutboundClipboardSharingLevel)
    if (allowedOutboundDataTransferDestinations != null) __obj.updateDynamic("allowedOutboundDataTransferDestinations")(allowedOutboundDataTransferDestinations)
    if (appDataEncryptionType != null) __obj.updateDynamic("appDataEncryptionType")(appDataEncryptionType)
    if (apps != null) __obj.updateDynamic("apps")(apps)
    if (!js.isUndefined(contactSyncBlocked)) __obj.updateDynamic("contactSyncBlocked")(contactSyncBlocked)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (customSettings != null) __obj.updateDynamic("customSettings")(customSettings)
    if (!js.isUndefined(dataBackupBlocked)) __obj.updateDynamic("dataBackupBlocked")(dataBackupBlocked)
    if (deployedAppCount != null) __obj.updateDynamic("deployedAppCount")(deployedAppCount.asInstanceOf[js.Any])
    if (deploymentSummary != null) __obj.updateDynamic("deploymentSummary")(deploymentSummary)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(deviceComplianceRequired)) __obj.updateDynamic("deviceComplianceRequired")(deviceComplianceRequired)
    if (!js.isUndefined(disableAppEncryptionIfDeviceEncryptionIsEnabled)) __obj.updateDynamic("disableAppEncryptionIfDeviceEncryptionIsEnabled")(disableAppEncryptionIfDeviceEncryptionIsEnabled)
    if (!js.isUndefined(disableAppPinIfDevicePinIsSet)) __obj.updateDynamic("disableAppPinIfDevicePinIsSet")(disableAppPinIfDevicePinIsSet)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(encryptAppData)) __obj.updateDynamic("encryptAppData")(encryptAppData)
    if (!js.isUndefined(faceIdBlocked)) __obj.updateDynamic("faceIdBlocked")(faceIdBlocked)
    if (!js.isUndefined(fingerprintBlocked)) __obj.updateDynamic("fingerprintBlocked")(fingerprintBlocked)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (!js.isUndefined(managedBrowserToOpenLinksRequired)) __obj.updateDynamic("managedBrowserToOpenLinksRequired")(managedBrowserToOpenLinksRequired)
    if (maximumPinRetries != null) __obj.updateDynamic("maximumPinRetries")(maximumPinRetries.asInstanceOf[js.Any])
    if (minimumPinLength != null) __obj.updateDynamic("minimumPinLength")(minimumPinLength.asInstanceOf[js.Any])
    if (minimumRequiredAppVersion != null) __obj.updateDynamic("minimumRequiredAppVersion")(minimumRequiredAppVersion)
    if (minimumRequiredOsVersion != null) __obj.updateDynamic("minimumRequiredOsVersion")(minimumRequiredOsVersion)
    if (minimumRequiredPatchVersion != null) __obj.updateDynamic("minimumRequiredPatchVersion")(minimumRequiredPatchVersion)
    if (minimumRequiredSdkVersion != null) __obj.updateDynamic("minimumRequiredSdkVersion")(minimumRequiredSdkVersion)
    if (minimumWarningAppVersion != null) __obj.updateDynamic("minimumWarningAppVersion")(minimumWarningAppVersion)
    if (minimumWarningOsVersion != null) __obj.updateDynamic("minimumWarningOsVersion")(minimumWarningOsVersion)
    if (minimumWarningPatchVersion != null) __obj.updateDynamic("minimumWarningPatchVersion")(minimumWarningPatchVersion)
    if (!js.isUndefined(organizationalCredentialsRequired)) __obj.updateDynamic("organizationalCredentialsRequired")(organizationalCredentialsRequired)
    if (periodBeforePinReset != null) __obj.updateDynamic("periodBeforePinReset")(periodBeforePinReset)
    if (periodOfflineBeforeAccessCheck != null) __obj.updateDynamic("periodOfflineBeforeAccessCheck")(periodOfflineBeforeAccessCheck)
    if (periodOfflineBeforeWipeIsEnforced != null) __obj.updateDynamic("periodOfflineBeforeWipeIsEnforced")(periodOfflineBeforeWipeIsEnforced)
    if (periodOnlineBeforeAccessCheck != null) __obj.updateDynamic("periodOnlineBeforeAccessCheck")(periodOnlineBeforeAccessCheck)
    if (pinCharacterSet != null) __obj.updateDynamic("pinCharacterSet")(pinCharacterSet)
    if (!js.isUndefined(pinRequired)) __obj.updateDynamic("pinRequired")(pinRequired)
    if (!js.isUndefined(printBlocked)) __obj.updateDynamic("printBlocked")(printBlocked)
    if (!js.isUndefined(saveAsBlocked)) __obj.updateDynamic("saveAsBlocked")(saveAsBlocked)
    if (!js.isUndefined(screenCaptureBlocked)) __obj.updateDynamic("screenCaptureBlocked")(screenCaptureBlocked)
    if (!js.isUndefined(simplePinBlocked)) __obj.updateDynamic("simplePinBlocked")(simplePinBlocked)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[DefaultManagedAppProtection]
  }
}


package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedDevice extends Entity {
  // Code that allows the Activation Lock on a device to be bypassed.
  var activationLockBypassCode: js.UndefOr[String] = js.undefined
  // Android security patch level
  var androidSecurityPatchLevel: js.UndefOr[String] = js.undefined
  // The unique identifier for the Azure Active Directory device. Read only.
  var azureADDeviceId: js.UndefOr[String] = js.undefined
  // Whether the device is Azure Active Directory registered.
  var azureADRegistered: js.UndefOr[Boolean] = js.undefined
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.undefined
  /**
    * Compliance state of the device. Possible values are: unknown, compliant, noncompliant, conflict, error, inGracePeriod,
    * configManager.
    */
  var complianceState: js.UndefOr[ComplianceState] = js.undefined
  // ConfigrMgr client enabled features
  var configurationManagerClientEnabledFeatures: js.UndefOr[ConfigurationManagerClientEnabledFeatures] = js.undefined
  // List of ComplexType deviceActionResult objects.
  var deviceActionResults: js.UndefOr[js.Array[DeviceActionResult]] = js.undefined
  // Device category
  var deviceCategory: js.UndefOr[DeviceCategory] = js.undefined
  // Device category display name
  var deviceCategoryDisplayName: js.UndefOr[String] = js.undefined
  // Device compliance policy states for this device.
  var deviceCompliancePolicyStates: js.UndefOr[js.Array[DeviceCompliancePolicyState]] = js.undefined
  // Device configuration states for this device.
  var deviceConfigurationStates: js.UndefOr[js.Array[DeviceConfigurationState]] = js.undefined
  /**
    * Enrollment type of the device. Possible values are: unknown, userEnrollment, deviceEnrollmentManager,
    * appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment,
    * windowsBulkAzureDomainJoin, windowsCoManagement.
    */
  var deviceEnrollmentType: js.UndefOr[DeviceEnrollmentType] = js.undefined
  // The device health attestation state.
  var deviceHealthAttestationState: js.UndefOr[DeviceHealthAttestationState] = js.undefined
  // Name of the device
  var deviceName: js.UndefOr[String] = js.undefined
  /**
    * Device registration state. Possible values are: notRegistered, registered, revoked, keyConflict, approvalPending,
    * certificateReset, notRegisteredPendingEnrollment, unknown.
    */
  var deviceRegistrationState: js.UndefOr[DeviceRegistrationState] = js.undefined
  // Whether the device is Exchange ActiveSync activated.
  var easActivated: js.UndefOr[Boolean] = js.undefined
  // Exchange ActivationSync activation time of the device.
  var easActivationDateTime: js.UndefOr[String] = js.undefined
  // Exchange ActiveSync Id of the device.
  var easDeviceId: js.UndefOr[String] = js.undefined
  // Email(s) for the user associated with the device
  var emailAddress: js.UndefOr[String] = js.undefined
  // Enrollment time of the device.
  var enrolledDateTime: js.UndefOr[String] = js.undefined
  // The Access State of the device in Exchange. Possible values are: none, unknown, allowed, blocked, quarantined.
  var exchangeAccessState: js.UndefOr[DeviceManagementExchangeAccessState] = js.undefined
  /**
    * The reason for the device's access state in Exchange. Possible values are: none, unknown, exchangeGlobalRule,
    * exchangeIndividualRule, exchangeDeviceRule, exchangeUpgrade, exchangeMailboxPolicy, other, compliant, notCompliant,
    * notEnrolled, unknownLocation, mfaRequired, azureADBlockDueToAccessPolicy, compromisedPassword,
    * deviceNotKnownWithManagedApp.
    */
  var exchangeAccessStateReason: js.UndefOr[DeviceManagementExchangeAccessStateReason] = js.undefined
  // Last time the device contacted Exchange.
  var exchangeLastSuccessfulSyncDateTime: js.UndefOr[String] = js.undefined
  // Free Storage in Bytes
  var freeStorageSpaceInBytes: js.UndefOr[Double] = js.undefined
  // IMEI
  var imei: js.UndefOr[String] = js.undefined
  // Device encryption status
  var isEncrypted: js.UndefOr[Boolean] = js.undefined
  // Device supervised status
  var isSupervised: js.UndefOr[Boolean] = js.undefined
  // whether the device is jail broken or rooted.
  var jailBroken: js.UndefOr[String] = js.undefined
  // The date and time that the device last completed a successful sync with Intune.
  var lastSyncDateTime: js.UndefOr[String] = js.undefined
  // Automatically generated name to identify a device. Can be overwritten to a user friendly name.
  var managedDeviceName: js.UndefOr[String] = js.undefined
  // Ownership of the device. Can be 'company' or 'personal'. Possible values are: unknown, company, personal.
  var managedDeviceOwnerType: js.UndefOr[ManagedDeviceOwnerType] = js.undefined
  /**
    * Management channel of the device. Intune, EAS, etc. Possible values are: eas, mdm, easMdm, intuneClient,
    * easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown,
    * jamf, googleCloudDevicePolicyController.
    */
  var managementAgent: js.UndefOr[ManagementAgentType] = js.undefined
  // Manufacturer of the device
  var manufacturer: js.UndefOr[String] = js.undefined
  // MEID
  var meid: js.UndefOr[String] = js.undefined
  // Model of the device
  var model: js.UndefOr[String] = js.undefined
  // Operating system of the device. Windows, iOS, etc.
  var operatingSystem: js.UndefOr[String] = js.undefined
  // Operating system version of the device.
  var osVersion: js.UndefOr[String] = js.undefined
  /**
    * Indicates the threat state of a device when a Mobile Threat Defense partner is in use by the account and device. Read
    * Only. Possible values are: unknown, activated, deactivated, secured, lowSeverity, mediumSeverity, highSeverity,
    * unresponsive, compromised, misconfigured.
    */
  var partnerReportedThreatState: js.UndefOr[ManagedDevicePartnerReportedHealthState] = js.undefined
  // Phone number of the device
  var phoneNumber: js.UndefOr[String] = js.undefined
  // An error string that identifies issues when creating Remote Assistance session objects.
  var remoteAssistanceSessionErrorDetails: js.UndefOr[String] = js.undefined
  // Url that allows a Remote Assistance session to be established with the device.
  var remoteAssistanceSessionUrl: js.UndefOr[String] = js.undefined
  // SerialNumber
  var serialNumber: js.UndefOr[String] = js.undefined
  // Subscriber Carrier
  var subscriberCarrier: js.UndefOr[String] = js.undefined
  // Total Storage in Bytes
  var totalStorageSpaceInBytes: js.UndefOr[Double] = js.undefined
  // User display name
  var userDisplayName: js.UndefOr[String] = js.undefined
  // Unique Identifier for the user associated with the device
  var userId: js.UndefOr[String] = js.undefined
  // Device user principal name
  var userPrincipalName: js.UndefOr[String] = js.undefined
  // Wi-Fi MAC
  var wiFiMacAddress: js.UndefOr[String] = js.undefined
}

object ManagedDevice {
  @scala.inline
  def apply(
    activationLockBypassCode: String = null,
    androidSecurityPatchLevel: String = null,
    azureADDeviceId: String = null,
    azureADRegistered: js.UndefOr[Boolean] = js.undefined,
    complianceGracePeriodExpirationDateTime: String = null,
    complianceState: ComplianceState = null,
    configurationManagerClientEnabledFeatures: ConfigurationManagerClientEnabledFeatures = null,
    deviceActionResults: js.Array[DeviceActionResult] = null,
    deviceCategory: DeviceCategory = null,
    deviceCategoryDisplayName: String = null,
    deviceCompliancePolicyStates: js.Array[DeviceCompliancePolicyState] = null,
    deviceConfigurationStates: js.Array[DeviceConfigurationState] = null,
    deviceEnrollmentType: DeviceEnrollmentType = null,
    deviceHealthAttestationState: DeviceHealthAttestationState = null,
    deviceName: String = null,
    deviceRegistrationState: DeviceRegistrationState = null,
    easActivated: js.UndefOr[Boolean] = js.undefined,
    easActivationDateTime: String = null,
    easDeviceId: String = null,
    emailAddress: String = null,
    enrolledDateTime: String = null,
    exchangeAccessState: DeviceManagementExchangeAccessState = null,
    exchangeAccessStateReason: DeviceManagementExchangeAccessStateReason = null,
    exchangeLastSuccessfulSyncDateTime: String = null,
    freeStorageSpaceInBytes: Int | Double = null,
    id: String = null,
    imei: String = null,
    isEncrypted: js.UndefOr[Boolean] = js.undefined,
    isSupervised: js.UndefOr[Boolean] = js.undefined,
    jailBroken: String = null,
    lastSyncDateTime: String = null,
    managedDeviceName: String = null,
    managedDeviceOwnerType: ManagedDeviceOwnerType = null,
    managementAgent: ManagementAgentType = null,
    manufacturer: String = null,
    meid: String = null,
    model: String = null,
    operatingSystem: String = null,
    osVersion: String = null,
    partnerReportedThreatState: ManagedDevicePartnerReportedHealthState = null,
    phoneNumber: String = null,
    remoteAssistanceSessionErrorDetails: String = null,
    remoteAssistanceSessionUrl: String = null,
    serialNumber: String = null,
    subscriberCarrier: String = null,
    totalStorageSpaceInBytes: Int | Double = null,
    userDisplayName: String = null,
    userId: String = null,
    userPrincipalName: String = null,
    wiFiMacAddress: String = null
  ): ManagedDevice = {
    val __obj = js.Dynamic.literal()
    if (activationLockBypassCode != null) __obj.updateDynamic("activationLockBypassCode")(activationLockBypassCode.asInstanceOf[js.Any])
    if (androidSecurityPatchLevel != null) __obj.updateDynamic("androidSecurityPatchLevel")(androidSecurityPatchLevel.asInstanceOf[js.Any])
    if (azureADDeviceId != null) __obj.updateDynamic("azureADDeviceId")(azureADDeviceId.asInstanceOf[js.Any])
    if (!js.isUndefined(azureADRegistered)) __obj.updateDynamic("azureADRegistered")(azureADRegistered.asInstanceOf[js.Any])
    if (complianceGracePeriodExpirationDateTime != null) __obj.updateDynamic("complianceGracePeriodExpirationDateTime")(complianceGracePeriodExpirationDateTime.asInstanceOf[js.Any])
    if (complianceState != null) __obj.updateDynamic("complianceState")(complianceState.asInstanceOf[js.Any])
    if (configurationManagerClientEnabledFeatures != null) __obj.updateDynamic("configurationManagerClientEnabledFeatures")(configurationManagerClientEnabledFeatures.asInstanceOf[js.Any])
    if (deviceActionResults != null) __obj.updateDynamic("deviceActionResults")(deviceActionResults.asInstanceOf[js.Any])
    if (deviceCategory != null) __obj.updateDynamic("deviceCategory")(deviceCategory.asInstanceOf[js.Any])
    if (deviceCategoryDisplayName != null) __obj.updateDynamic("deviceCategoryDisplayName")(deviceCategoryDisplayName.asInstanceOf[js.Any])
    if (deviceCompliancePolicyStates != null) __obj.updateDynamic("deviceCompliancePolicyStates")(deviceCompliancePolicyStates.asInstanceOf[js.Any])
    if (deviceConfigurationStates != null) __obj.updateDynamic("deviceConfigurationStates")(deviceConfigurationStates.asInstanceOf[js.Any])
    if (deviceEnrollmentType != null) __obj.updateDynamic("deviceEnrollmentType")(deviceEnrollmentType.asInstanceOf[js.Any])
    if (deviceHealthAttestationState != null) __obj.updateDynamic("deviceHealthAttestationState")(deviceHealthAttestationState.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (deviceRegistrationState != null) __obj.updateDynamic("deviceRegistrationState")(deviceRegistrationState.asInstanceOf[js.Any])
    if (!js.isUndefined(easActivated)) __obj.updateDynamic("easActivated")(easActivated.asInstanceOf[js.Any])
    if (easActivationDateTime != null) __obj.updateDynamic("easActivationDateTime")(easActivationDateTime.asInstanceOf[js.Any])
    if (easDeviceId != null) __obj.updateDynamic("easDeviceId")(easDeviceId.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (enrolledDateTime != null) __obj.updateDynamic("enrolledDateTime")(enrolledDateTime.asInstanceOf[js.Any])
    if (exchangeAccessState != null) __obj.updateDynamic("exchangeAccessState")(exchangeAccessState.asInstanceOf[js.Any])
    if (exchangeAccessStateReason != null) __obj.updateDynamic("exchangeAccessStateReason")(exchangeAccessStateReason.asInstanceOf[js.Any])
    if (exchangeLastSuccessfulSyncDateTime != null) __obj.updateDynamic("exchangeLastSuccessfulSyncDateTime")(exchangeLastSuccessfulSyncDateTime.asInstanceOf[js.Any])
    if (freeStorageSpaceInBytes != null) __obj.updateDynamic("freeStorageSpaceInBytes")(freeStorageSpaceInBytes.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imei != null) __obj.updateDynamic("imei")(imei.asInstanceOf[js.Any])
    if (!js.isUndefined(isEncrypted)) __obj.updateDynamic("isEncrypted")(isEncrypted.asInstanceOf[js.Any])
    if (!js.isUndefined(isSupervised)) __obj.updateDynamic("isSupervised")(isSupervised.asInstanceOf[js.Any])
    if (jailBroken != null) __obj.updateDynamic("jailBroken")(jailBroken.asInstanceOf[js.Any])
    if (lastSyncDateTime != null) __obj.updateDynamic("lastSyncDateTime")(lastSyncDateTime.asInstanceOf[js.Any])
    if (managedDeviceName != null) __obj.updateDynamic("managedDeviceName")(managedDeviceName.asInstanceOf[js.Any])
    if (managedDeviceOwnerType != null) __obj.updateDynamic("managedDeviceOwnerType")(managedDeviceOwnerType.asInstanceOf[js.Any])
    if (managementAgent != null) __obj.updateDynamic("managementAgent")(managementAgent.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (meid != null) __obj.updateDynamic("meid")(meid.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem.asInstanceOf[js.Any])
    if (osVersion != null) __obj.updateDynamic("osVersion")(osVersion.asInstanceOf[js.Any])
    if (partnerReportedThreatState != null) __obj.updateDynamic("partnerReportedThreatState")(partnerReportedThreatState.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (remoteAssistanceSessionErrorDetails != null) __obj.updateDynamic("remoteAssistanceSessionErrorDetails")(remoteAssistanceSessionErrorDetails.asInstanceOf[js.Any])
    if (remoteAssistanceSessionUrl != null) __obj.updateDynamic("remoteAssistanceSessionUrl")(remoteAssistanceSessionUrl.asInstanceOf[js.Any])
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber.asInstanceOf[js.Any])
    if (subscriberCarrier != null) __obj.updateDynamic("subscriberCarrier")(subscriberCarrier.asInstanceOf[js.Any])
    if (totalStorageSpaceInBytes != null) __obj.updateDynamic("totalStorageSpaceInBytes")(totalStorageSpaceInBytes.asInstanceOf[js.Any])
    if (userDisplayName != null) __obj.updateDynamic("userDisplayName")(userDisplayName.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName.asInstanceOf[js.Any])
    if (wiFiMacAddress != null) __obj.updateDynamic("wiFiMacAddress")(wiFiMacAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedDevice]
  }
}


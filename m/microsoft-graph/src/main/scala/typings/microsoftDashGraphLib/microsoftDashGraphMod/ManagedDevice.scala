package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedDevice extends Entity {
  // Code that allows the Activation Lock on a device to be bypassed.
  var activationLockBypassCode: js.UndefOr[java.lang.String] = js.undefined
  // Android security patch level
  var androidSecurityPatchLevel: js.UndefOr[java.lang.String] = js.undefined
  // The unique identifier for the Azure Active Directory device. Read only.
  var azureADDeviceId: js.UndefOr[java.lang.String] = js.undefined
  // Whether the device is Azure Active Directory registered.
  var azureADRegistered: js.UndefOr[scala.Boolean] = js.undefined
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[java.lang.String] = js.undefined
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
  var deviceCategoryDisplayName: js.UndefOr[java.lang.String] = js.undefined
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
  var deviceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Device registration state. Possible values are: notRegistered, registered, revoked, keyConflict, approvalPending,
    * certificateReset, notRegisteredPendingEnrollment, unknown.
    */
  var deviceRegistrationState: js.UndefOr[DeviceRegistrationState] = js.undefined
  // Whether the device is Exchange ActiveSync activated.
  var easActivated: js.UndefOr[scala.Boolean] = js.undefined
  // Exchange ActivationSync activation time of the device.
  var easActivationDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Exchange ActiveSync Id of the device.
  var easDeviceId: js.UndefOr[java.lang.String] = js.undefined
  // Email(s) for the user associated with the device
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  // Enrollment time of the device.
  var enrolledDateTime: js.UndefOr[java.lang.String] = js.undefined
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
  var exchangeLastSuccessfulSyncDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Free Storage in Bytes
  var freeStorageSpaceInBytes: js.UndefOr[scala.Double] = js.undefined
  // IMEI
  var imei: js.UndefOr[java.lang.String] = js.undefined
  // Device encryption status
  var isEncrypted: js.UndefOr[scala.Boolean] = js.undefined
  // Device supervised status
  var isSupervised: js.UndefOr[scala.Boolean] = js.undefined
  // whether the device is jail broken or rooted.
  var jailBroken: js.UndefOr[java.lang.String] = js.undefined
  // The date and time that the device last completed a successful sync with Intune.
  var lastSyncDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Automatically generated name to identify a device. Can be overwritten to a user friendly name.
  var managedDeviceName: js.UndefOr[java.lang.String] = js.undefined
  // Ownership of the device. Can be 'company' or 'personal'. Possible values are: unknown, company, personal.
  var managedDeviceOwnerType: js.UndefOr[ManagedDeviceOwnerType] = js.undefined
  /**
    * Management channel of the device. Intune, EAS, etc. Possible values are: eas, mdm, easMdm, intuneClient,
    * easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown,
    * jamf, googleCloudDevicePolicyController.
    */
  var managementAgent: js.UndefOr[ManagementAgentType] = js.undefined
  // Manufacturer of the device
  var manufacturer: js.UndefOr[java.lang.String] = js.undefined
  // MEID
  var meid: js.UndefOr[java.lang.String] = js.undefined
  // Model of the device
  var model: js.UndefOr[java.lang.String] = js.undefined
  // Operating system of the device. Windows, iOS, etc.
  var operatingSystem: js.UndefOr[java.lang.String] = js.undefined
  // Operating system version of the device.
  var osVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates the threat state of a device when a Mobile Threat Defense partner is in use by the account and device. Read
    * Only. Possible values are: unknown, activated, deactivated, secured, lowSeverity, mediumSeverity, highSeverity,
    * unresponsive, compromised, misconfigured.
    */
  var partnerReportedThreatState: js.UndefOr[ManagedDevicePartnerReportedHealthState] = js.undefined
  // Phone number of the device
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  // An error string that identifies issues when creating Remote Assistance session objects.
  var remoteAssistanceSessionErrorDetails: js.UndefOr[java.lang.String] = js.undefined
  // Url that allows a Remote Assistance session to be established with the device.
  var remoteAssistanceSessionUrl: js.UndefOr[java.lang.String] = js.undefined
  // SerialNumber
  var serialNumber: js.UndefOr[java.lang.String] = js.undefined
  // Subscriber Carrier
  var subscriberCarrier: js.UndefOr[java.lang.String] = js.undefined
  // Total Storage in Bytes
  var totalStorageSpaceInBytes: js.UndefOr[scala.Double] = js.undefined
  // User display name
  var userDisplayName: js.UndefOr[java.lang.String] = js.undefined
  // Unique Identifier for the user associated with the device
  var userId: js.UndefOr[java.lang.String] = js.undefined
  // Device user principal name
  var userPrincipalName: js.UndefOr[java.lang.String] = js.undefined
  // Wi-Fi MAC
  var wiFiMacAddress: js.UndefOr[java.lang.String] = js.undefined
}

object ManagedDevice {
  @scala.inline
  def apply(
    activationLockBypassCode: java.lang.String = null,
    androidSecurityPatchLevel: java.lang.String = null,
    azureADDeviceId: java.lang.String = null,
    azureADRegistered: js.UndefOr[scala.Boolean] = js.undefined,
    complianceGracePeriodExpirationDateTime: java.lang.String = null,
    complianceState: ComplianceState = null,
    configurationManagerClientEnabledFeatures: ConfigurationManagerClientEnabledFeatures = null,
    deviceActionResults: js.Array[DeviceActionResult] = null,
    deviceCategory: DeviceCategory = null,
    deviceCategoryDisplayName: java.lang.String = null,
    deviceCompliancePolicyStates: js.Array[DeviceCompliancePolicyState] = null,
    deviceConfigurationStates: js.Array[DeviceConfigurationState] = null,
    deviceEnrollmentType: DeviceEnrollmentType = null,
    deviceHealthAttestationState: DeviceHealthAttestationState = null,
    deviceName: java.lang.String = null,
    deviceRegistrationState: DeviceRegistrationState = null,
    easActivated: js.UndefOr[scala.Boolean] = js.undefined,
    easActivationDateTime: java.lang.String = null,
    easDeviceId: java.lang.String = null,
    emailAddress: java.lang.String = null,
    enrolledDateTime: java.lang.String = null,
    exchangeAccessState: DeviceManagementExchangeAccessState = null,
    exchangeAccessStateReason: DeviceManagementExchangeAccessStateReason = null,
    exchangeLastSuccessfulSyncDateTime: java.lang.String = null,
    freeStorageSpaceInBytes: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    imei: java.lang.String = null,
    isEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    isSupervised: js.UndefOr[scala.Boolean] = js.undefined,
    jailBroken: java.lang.String = null,
    lastSyncDateTime: java.lang.String = null,
    managedDeviceName: java.lang.String = null,
    managedDeviceOwnerType: ManagedDeviceOwnerType = null,
    managementAgent: ManagementAgentType = null,
    manufacturer: java.lang.String = null,
    meid: java.lang.String = null,
    model: java.lang.String = null,
    operatingSystem: java.lang.String = null,
    osVersion: java.lang.String = null,
    partnerReportedThreatState: ManagedDevicePartnerReportedHealthState = null,
    phoneNumber: java.lang.String = null,
    remoteAssistanceSessionErrorDetails: java.lang.String = null,
    remoteAssistanceSessionUrl: java.lang.String = null,
    serialNumber: java.lang.String = null,
    subscriberCarrier: java.lang.String = null,
    totalStorageSpaceInBytes: scala.Int | scala.Double = null,
    userDisplayName: java.lang.String = null,
    userId: java.lang.String = null,
    userPrincipalName: java.lang.String = null,
    wiFiMacAddress: java.lang.String = null
  ): ManagedDevice = {
    val __obj = js.Dynamic.literal()
    if (activationLockBypassCode != null) __obj.updateDynamic("activationLockBypassCode")(activationLockBypassCode)
    if (androidSecurityPatchLevel != null) __obj.updateDynamic("androidSecurityPatchLevel")(androidSecurityPatchLevel)
    if (azureADDeviceId != null) __obj.updateDynamic("azureADDeviceId")(azureADDeviceId)
    if (!js.isUndefined(azureADRegistered)) __obj.updateDynamic("azureADRegistered")(azureADRegistered)
    if (complianceGracePeriodExpirationDateTime != null) __obj.updateDynamic("complianceGracePeriodExpirationDateTime")(complianceGracePeriodExpirationDateTime)
    if (complianceState != null) __obj.updateDynamic("complianceState")(complianceState)
    if (configurationManagerClientEnabledFeatures != null) __obj.updateDynamic("configurationManagerClientEnabledFeatures")(configurationManagerClientEnabledFeatures)
    if (deviceActionResults != null) __obj.updateDynamic("deviceActionResults")(deviceActionResults)
    if (deviceCategory != null) __obj.updateDynamic("deviceCategory")(deviceCategory)
    if (deviceCategoryDisplayName != null) __obj.updateDynamic("deviceCategoryDisplayName")(deviceCategoryDisplayName)
    if (deviceCompliancePolicyStates != null) __obj.updateDynamic("deviceCompliancePolicyStates")(deviceCompliancePolicyStates)
    if (deviceConfigurationStates != null) __obj.updateDynamic("deviceConfigurationStates")(deviceConfigurationStates)
    if (deviceEnrollmentType != null) __obj.updateDynamic("deviceEnrollmentType")(deviceEnrollmentType)
    if (deviceHealthAttestationState != null) __obj.updateDynamic("deviceHealthAttestationState")(deviceHealthAttestationState)
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName)
    if (deviceRegistrationState != null) __obj.updateDynamic("deviceRegistrationState")(deviceRegistrationState)
    if (!js.isUndefined(easActivated)) __obj.updateDynamic("easActivated")(easActivated)
    if (easActivationDateTime != null) __obj.updateDynamic("easActivationDateTime")(easActivationDateTime)
    if (easDeviceId != null) __obj.updateDynamic("easDeviceId")(easDeviceId)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (enrolledDateTime != null) __obj.updateDynamic("enrolledDateTime")(enrolledDateTime)
    if (exchangeAccessState != null) __obj.updateDynamic("exchangeAccessState")(exchangeAccessState)
    if (exchangeAccessStateReason != null) __obj.updateDynamic("exchangeAccessStateReason")(exchangeAccessStateReason)
    if (exchangeLastSuccessfulSyncDateTime != null) __obj.updateDynamic("exchangeLastSuccessfulSyncDateTime")(exchangeLastSuccessfulSyncDateTime)
    if (freeStorageSpaceInBytes != null) __obj.updateDynamic("freeStorageSpaceInBytes")(freeStorageSpaceInBytes.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (imei != null) __obj.updateDynamic("imei")(imei)
    if (!js.isUndefined(isEncrypted)) __obj.updateDynamic("isEncrypted")(isEncrypted)
    if (!js.isUndefined(isSupervised)) __obj.updateDynamic("isSupervised")(isSupervised)
    if (jailBroken != null) __obj.updateDynamic("jailBroken")(jailBroken)
    if (lastSyncDateTime != null) __obj.updateDynamic("lastSyncDateTime")(lastSyncDateTime)
    if (managedDeviceName != null) __obj.updateDynamic("managedDeviceName")(managedDeviceName)
    if (managedDeviceOwnerType != null) __obj.updateDynamic("managedDeviceOwnerType")(managedDeviceOwnerType)
    if (managementAgent != null) __obj.updateDynamic("managementAgent")(managementAgent)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (meid != null) __obj.updateDynamic("meid")(meid)
    if (model != null) __obj.updateDynamic("model")(model)
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem)
    if (osVersion != null) __obj.updateDynamic("osVersion")(osVersion)
    if (partnerReportedThreatState != null) __obj.updateDynamic("partnerReportedThreatState")(partnerReportedThreatState)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (remoteAssistanceSessionErrorDetails != null) __obj.updateDynamic("remoteAssistanceSessionErrorDetails")(remoteAssistanceSessionErrorDetails)
    if (remoteAssistanceSessionUrl != null) __obj.updateDynamic("remoteAssistanceSessionUrl")(remoteAssistanceSessionUrl)
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber)
    if (subscriberCarrier != null) __obj.updateDynamic("subscriberCarrier")(subscriberCarrier)
    if (totalStorageSpaceInBytes != null) __obj.updateDynamic("totalStorageSpaceInBytes")(totalStorageSpaceInBytes.asInstanceOf[js.Any])
    if (userDisplayName != null) __obj.updateDynamic("userDisplayName")(userDisplayName)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName)
    if (wiFiMacAddress != null) __obj.updateDynamic("wiFiMacAddress")(wiFiMacAddress)
    __obj.asInstanceOf[ManagedDevice]
  }
}


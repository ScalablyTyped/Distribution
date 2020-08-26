package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedDevice extends Entity {
  // Code that allows the Activation Lock on a device to be bypassed.
  var activationLockBypassCode: js.UndefOr[String] = js.native
  // Android security patch level
  var androidSecurityPatchLevel: js.UndefOr[String] = js.native
  // The unique identifier for the Azure Active Directory device. Read only.
  var azureADDeviceId: js.UndefOr[String] = js.native
  // Whether the device is Azure Active Directory registered.
  var azureADRegistered: js.UndefOr[Boolean] = js.native
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.native
  /**
    * Compliance state of the device. Possible values are: unknown, compliant, noncompliant, conflict, error, inGracePeriod,
    * configManager.
    */
  var complianceState: js.UndefOr[ComplianceState] = js.native
  // ConfigrMgr client enabled features
  var configurationManagerClientEnabledFeatures: js.UndefOr[ConfigurationManagerClientEnabledFeatures] = js.native
  // List of ComplexType deviceActionResult objects.
  var deviceActionResults: js.UndefOr[js.Array[DeviceActionResult]] = js.native
  // Device category
  var deviceCategory: js.UndefOr[DeviceCategory] = js.native
  // Device category display name
  var deviceCategoryDisplayName: js.UndefOr[String] = js.native
  // Device compliance policy states for this device.
  var deviceCompliancePolicyStates: js.UndefOr[js.Array[DeviceCompliancePolicyState]] = js.native
  // Device configuration states for this device.
  var deviceConfigurationStates: js.UndefOr[js.Array[DeviceConfigurationState]] = js.native
  /**
    * Enrollment type of the device. Possible values are: unknown, userEnrollment, deviceEnrollmentManager,
    * appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment,
    * windowsBulkAzureDomainJoin, windowsCoManagement.
    */
  var deviceEnrollmentType: js.UndefOr[DeviceEnrollmentType] = js.native
  // The device health attestation state.
  var deviceHealthAttestationState: js.UndefOr[DeviceHealthAttestationState] = js.native
  // Name of the device
  var deviceName: js.UndefOr[String] = js.native
  /**
    * Device registration state. Possible values are: notRegistered, registered, revoked, keyConflict, approvalPending,
    * certificateReset, notRegisteredPendingEnrollment, unknown.
    */
  var deviceRegistrationState: js.UndefOr[DeviceRegistrationState] = js.native
  // Whether the device is Exchange ActiveSync activated.
  var easActivated: js.UndefOr[Boolean] = js.native
  // Exchange ActivationSync activation time of the device.
  var easActivationDateTime: js.UndefOr[String] = js.native
  // Exchange ActiveSync Id of the device.
  var easDeviceId: js.UndefOr[String] = js.native
  // Email(s) for the user associated with the device
  var emailAddress: js.UndefOr[String] = js.native
  // Enrollment time of the device.
  var enrolledDateTime: js.UndefOr[String] = js.native
  // The Access State of the device in Exchange. Possible values are: none, unknown, allowed, blocked, quarantined.
  var exchangeAccessState: js.UndefOr[DeviceManagementExchangeAccessState] = js.native
  /**
    * The reason for the device's access state in Exchange. Possible values are: none, unknown, exchangeGlobalRule,
    * exchangeIndividualRule, exchangeDeviceRule, exchangeUpgrade, exchangeMailboxPolicy, other, compliant, notCompliant,
    * notEnrolled, unknownLocation, mfaRequired, azureADBlockDueToAccessPolicy, compromisedPassword,
    * deviceNotKnownWithManagedApp.
    */
  var exchangeAccessStateReason: js.UndefOr[DeviceManagementExchangeAccessStateReason] = js.native
  // Last time the device contacted Exchange.
  var exchangeLastSuccessfulSyncDateTime: js.UndefOr[String] = js.native
  // Free Storage in Bytes
  var freeStorageSpaceInBytes: js.UndefOr[Double] = js.native
  // IMEI
  var imei: js.UndefOr[String] = js.native
  // Device encryption status
  var isEncrypted: js.UndefOr[Boolean] = js.native
  // Device supervised status
  var isSupervised: js.UndefOr[Boolean] = js.native
  // whether the device is jail broken or rooted.
  var jailBroken: js.UndefOr[String] = js.native
  // The date and time that the device last completed a successful sync with Intune.
  var lastSyncDateTime: js.UndefOr[String] = js.native
  // Automatically generated name to identify a device. Can be overwritten to a user friendly name.
  var managedDeviceName: js.UndefOr[String] = js.native
  // Ownership of the device. Can be 'company' or 'personal'. Possible values are: unknown, company, personal.
  var managedDeviceOwnerType: js.UndefOr[ManagedDeviceOwnerType] = js.native
  /**
    * Management channel of the device. Intune, EAS, etc. Possible values are: eas, mdm, easMdm, intuneClient,
    * easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown,
    * jamf, googleCloudDevicePolicyController.
    */
  var managementAgent: js.UndefOr[ManagementAgentType] = js.native
  // Manufacturer of the device
  var manufacturer: js.UndefOr[String] = js.native
  // MEID
  var meid: js.UndefOr[String] = js.native
  // Model of the device
  var model: js.UndefOr[String] = js.native
  // Operating system of the device. Windows, iOS, etc.
  var operatingSystem: js.UndefOr[String] = js.native
  // Operating system version of the device.
  var osVersion: js.UndefOr[String] = js.native
  /**
    * Indicates the threat state of a device when a Mobile Threat Defense partner is in use by the account and device. Read
    * Only. Possible values are: unknown, activated, deactivated, secured, lowSeverity, mediumSeverity, highSeverity,
    * unresponsive, compromised, misconfigured.
    */
  var partnerReportedThreatState: js.UndefOr[ManagedDevicePartnerReportedHealthState] = js.native
  // Phone number of the device
  var phoneNumber: js.UndefOr[String] = js.native
  // An error string that identifies issues when creating Remote Assistance session objects.
  var remoteAssistanceSessionErrorDetails: js.UndefOr[String] = js.native
  // Url that allows a Remote Assistance session to be established with the device.
  var remoteAssistanceSessionUrl: js.UndefOr[String] = js.native
  // SerialNumber
  var serialNumber: js.UndefOr[String] = js.native
  // Subscriber Carrier
  var subscriberCarrier: js.UndefOr[String] = js.native
  // Total Storage in Bytes
  var totalStorageSpaceInBytes: js.UndefOr[Double] = js.native
  // User display name
  var userDisplayName: js.UndefOr[String] = js.native
  // Unique Identifier for the user associated with the device
  var userId: js.UndefOr[String] = js.native
  // Device user principal name
  var userPrincipalName: js.UndefOr[String] = js.native
  // Wi-Fi MAC
  var wiFiMacAddress: js.UndefOr[String] = js.native
}

object ManagedDevice {
  @scala.inline
  def apply(): ManagedDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDevice]
  }
  @scala.inline
  implicit class ManagedDeviceOps[Self <: ManagedDevice] (val x: Self) extends AnyVal {
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
    def setActivationLockBypassCode(value: String): Self = this.set("activationLockBypassCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivationLockBypassCode: Self = this.set("activationLockBypassCode", js.undefined)
    @scala.inline
    def setAndroidSecurityPatchLevel(value: String): Self = this.set("androidSecurityPatchLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidSecurityPatchLevel: Self = this.set("androidSecurityPatchLevel", js.undefined)
    @scala.inline
    def setAzureADDeviceId(value: String): Self = this.set("azureADDeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAzureADDeviceId: Self = this.set("azureADDeviceId", js.undefined)
    @scala.inline
    def setAzureADRegistered(value: Boolean): Self = this.set("azureADRegistered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAzureADRegistered: Self = this.set("azureADRegistered", js.undefined)
    @scala.inline
    def setComplianceGracePeriodExpirationDateTime(value: String): Self = this.set("complianceGracePeriodExpirationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceGracePeriodExpirationDateTime: Self = this.set("complianceGracePeriodExpirationDateTime", js.undefined)
    @scala.inline
    def setComplianceState(value: ComplianceState): Self = this.set("complianceState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceState: Self = this.set("complianceState", js.undefined)
    @scala.inline
    def setConfigurationManagerClientEnabledFeatures(value: ConfigurationManagerClientEnabledFeatures): Self = this.set("configurationManagerClientEnabledFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationManagerClientEnabledFeatures: Self = this.set("configurationManagerClientEnabledFeatures", js.undefined)
    @scala.inline
    def setDeviceActionResultsVarargs(value: DeviceActionResult*): Self = this.set("deviceActionResults", js.Array(value :_*))
    @scala.inline
    def setDeviceActionResults(value: js.Array[DeviceActionResult]): Self = this.set("deviceActionResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceActionResults: Self = this.set("deviceActionResults", js.undefined)
    @scala.inline
    def setDeviceCategory(value: DeviceCategory): Self = this.set("deviceCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceCategory: Self = this.set("deviceCategory", js.undefined)
    @scala.inline
    def setDeviceCategoryDisplayName(value: String): Self = this.set("deviceCategoryDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceCategoryDisplayName: Self = this.set("deviceCategoryDisplayName", js.undefined)
    @scala.inline
    def setDeviceCompliancePolicyStatesVarargs(value: DeviceCompliancePolicyState*): Self = this.set("deviceCompliancePolicyStates", js.Array(value :_*))
    @scala.inline
    def setDeviceCompliancePolicyStates(value: js.Array[DeviceCompliancePolicyState]): Self = this.set("deviceCompliancePolicyStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceCompliancePolicyStates: Self = this.set("deviceCompliancePolicyStates", js.undefined)
    @scala.inline
    def setDeviceConfigurationStatesVarargs(value: DeviceConfigurationState*): Self = this.set("deviceConfigurationStates", js.Array(value :_*))
    @scala.inline
    def setDeviceConfigurationStates(value: js.Array[DeviceConfigurationState]): Self = this.set("deviceConfigurationStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceConfigurationStates: Self = this.set("deviceConfigurationStates", js.undefined)
    @scala.inline
    def setDeviceEnrollmentType(value: DeviceEnrollmentType): Self = this.set("deviceEnrollmentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceEnrollmentType: Self = this.set("deviceEnrollmentType", js.undefined)
    @scala.inline
    def setDeviceHealthAttestationState(value: DeviceHealthAttestationState): Self = this.set("deviceHealthAttestationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceHealthAttestationState: Self = this.set("deviceHealthAttestationState", js.undefined)
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    @scala.inline
    def setDeviceRegistrationState(value: DeviceRegistrationState): Self = this.set("deviceRegistrationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceRegistrationState: Self = this.set("deviceRegistrationState", js.undefined)
    @scala.inline
    def setEasActivated(value: Boolean): Self = this.set("easActivated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasActivated: Self = this.set("easActivated", js.undefined)
    @scala.inline
    def setEasActivationDateTime(value: String): Self = this.set("easActivationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasActivationDateTime: Self = this.set("easActivationDateTime", js.undefined)
    @scala.inline
    def setEasDeviceId(value: String): Self = this.set("easDeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasDeviceId: Self = this.set("easDeviceId", js.undefined)
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    @scala.inline
    def setEnrolledDateTime(value: String): Self = this.set("enrolledDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnrolledDateTime: Self = this.set("enrolledDateTime", js.undefined)
    @scala.inline
    def setExchangeAccessState(value: DeviceManagementExchangeAccessState): Self = this.set("exchangeAccessState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExchangeAccessState: Self = this.set("exchangeAccessState", js.undefined)
    @scala.inline
    def setExchangeAccessStateReason(value: DeviceManagementExchangeAccessStateReason): Self = this.set("exchangeAccessStateReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExchangeAccessStateReason: Self = this.set("exchangeAccessStateReason", js.undefined)
    @scala.inline
    def setExchangeLastSuccessfulSyncDateTime(value: String): Self = this.set("exchangeLastSuccessfulSyncDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExchangeLastSuccessfulSyncDateTime: Self = this.set("exchangeLastSuccessfulSyncDateTime", js.undefined)
    @scala.inline
    def setFreeStorageSpaceInBytes(value: Double): Self = this.set("freeStorageSpaceInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeStorageSpaceInBytes: Self = this.set("freeStorageSpaceInBytes", js.undefined)
    @scala.inline
    def setImei(value: String): Self = this.set("imei", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImei: Self = this.set("imei", js.undefined)
    @scala.inline
    def setIsEncrypted(value: Boolean): Self = this.set("isEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEncrypted: Self = this.set("isEncrypted", js.undefined)
    @scala.inline
    def setIsSupervised(value: Boolean): Self = this.set("isSupervised", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSupervised: Self = this.set("isSupervised", js.undefined)
    @scala.inline
    def setJailBroken(value: String): Self = this.set("jailBroken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJailBroken: Self = this.set("jailBroken", js.undefined)
    @scala.inline
    def setLastSyncDateTime(value: String): Self = this.set("lastSyncDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSyncDateTime: Self = this.set("lastSyncDateTime", js.undefined)
    @scala.inline
    def setManagedDeviceName(value: String): Self = this.set("managedDeviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedDeviceName: Self = this.set("managedDeviceName", js.undefined)
    @scala.inline
    def setManagedDeviceOwnerType(value: ManagedDeviceOwnerType): Self = this.set("managedDeviceOwnerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedDeviceOwnerType: Self = this.set("managedDeviceOwnerType", js.undefined)
    @scala.inline
    def setManagementAgent(value: ManagementAgentType): Self = this.set("managementAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagementAgent: Self = this.set("managementAgent", js.undefined)
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    @scala.inline
    def setMeid(value: String): Self = this.set("meid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeid: Self = this.set("meid", js.undefined)
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setOperatingSystem(value: String): Self = this.set("operatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystem: Self = this.set("operatingSystem", js.undefined)
    @scala.inline
    def setOsVersion(value: String): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOsVersion: Self = this.set("osVersion", js.undefined)
    @scala.inline
    def setPartnerReportedThreatState(value: ManagedDevicePartnerReportedHealthState): Self = this.set("partnerReportedThreatState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartnerReportedThreatState: Self = this.set("partnerReportedThreatState", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setRemoteAssistanceSessionErrorDetails(value: String): Self = this.set("remoteAssistanceSessionErrorDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteAssistanceSessionErrorDetails: Self = this.set("remoteAssistanceSessionErrorDetails", js.undefined)
    @scala.inline
    def setRemoteAssistanceSessionUrl(value: String): Self = this.set("remoteAssistanceSessionUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteAssistanceSessionUrl: Self = this.set("remoteAssistanceSessionUrl", js.undefined)
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
    @scala.inline
    def setSubscriberCarrier(value: String): Self = this.set("subscriberCarrier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriberCarrier: Self = this.set("subscriberCarrier", js.undefined)
    @scala.inline
    def setTotalStorageSpaceInBytes(value: Double): Self = this.set("totalStorageSpaceInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalStorageSpaceInBytes: Self = this.set("totalStorageSpaceInBytes", js.undefined)
    @scala.inline
    def setUserDisplayName(value: String): Self = this.set("userDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDisplayName: Self = this.set("userDisplayName", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    @scala.inline
    def setUserPrincipalName(value: String): Self = this.set("userPrincipalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPrincipalName: Self = this.set("userPrincipalName", js.undefined)
    @scala.inline
    def setWiFiMacAddress(value: String): Self = this.set("wiFiMacAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWiFiMacAddress: Self = this.set("wiFiMacAddress", js.undefined)
  }
  
}


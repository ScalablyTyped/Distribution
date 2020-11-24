package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedDevice extends Entity {
  
  // Code that allows the Activation Lock on a device to be bypassed.
  var activationLockBypassCode: js.UndefOr[NullableOption[String]] = js.native
  
  // Android security patch level
  var androidSecurityPatchLevel: js.UndefOr[NullableOption[String]] = js.native
  
  // The unique identifier for the Azure Active Directory device. Read only.
  var azureADDeviceId: js.UndefOr[NullableOption[String]] = js.native
  
  // Whether the device is Azure Active Directory registered.
  var azureADRegistered: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.native
  
  /**
    * Compliance state of the device. Possible values are: unknown, compliant, noncompliant, conflict, error, inGracePeriod,
    * configManager.
    */
  var complianceState: js.UndefOr[ComplianceState] = js.native
  
  // ConfigrMgr client enabled features
  var configurationManagerClientEnabledFeatures: js.UndefOr[NullableOption[ConfigurationManagerClientEnabledFeatures]] = js.native
  
  // List of ComplexType deviceActionResult objects.
  var deviceActionResults: js.UndefOr[NullableOption[js.Array[DeviceActionResult]]] = js.native
  
  // Device category
  var deviceCategory: js.UndefOr[NullableOption[DeviceCategory]] = js.native
  
  // Device category display name
  var deviceCategoryDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Device compliance policy states for this device.
  var deviceCompliancePolicyStates: js.UndefOr[NullableOption[js.Array[DeviceCompliancePolicyState]]] = js.native
  
  // Device configuration states for this device.
  var deviceConfigurationStates: js.UndefOr[NullableOption[js.Array[DeviceConfigurationState]]] = js.native
  
  /**
    * Enrollment type of the device. Possible values are: unknown, userEnrollment, deviceEnrollmentManager,
    * appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment,
    * windowsBulkAzureDomainJoin, windowsCoManagement.
    */
  var deviceEnrollmentType: js.UndefOr[DeviceEnrollmentType] = js.native
  
  // The device health attestation state.
  var deviceHealthAttestationState: js.UndefOr[NullableOption[DeviceHealthAttestationState]] = js.native
  
  // Name of the device
  var deviceName: js.UndefOr[NullableOption[String]] = js.native
  
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
  var easDeviceId: js.UndefOr[NullableOption[String]] = js.native
  
  // Email(s) for the user associated with the device
  var emailAddress: js.UndefOr[NullableOption[String]] = js.native
  
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
  var imei: js.UndefOr[NullableOption[String]] = js.native
  
  // Device encryption status
  var isEncrypted: js.UndefOr[Boolean] = js.native
  
  // Device supervised status
  var isSupervised: js.UndefOr[Boolean] = js.native
  
  // whether the device is jail broken or rooted.
  var jailBroken: js.UndefOr[NullableOption[String]] = js.native
  
  // The date and time that the device last completed a successful sync with Intune.
  var lastSyncDateTime: js.UndefOr[String] = js.native
  
  // Automatically generated name to identify a device. Can be overwritten to a user friendly name.
  var managedDeviceName: js.UndefOr[NullableOption[String]] = js.native
  
  // Ownership of the device. Can be 'company' or 'personal'. Possible values are: unknown, company, personal.
  var managedDeviceOwnerType: js.UndefOr[ManagedDeviceOwnerType] = js.native
  
  /**
    * Management channel of the device. Intune, EAS, etc. Possible values are: eas, mdm, easMdm, intuneClient,
    * easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown,
    * jamf, googleCloudDevicePolicyController.
    */
  var managementAgent: js.UndefOr[ManagementAgentType] = js.native
  
  // Manufacturer of the device
  var manufacturer: js.UndefOr[NullableOption[String]] = js.native
  
  // MEID
  var meid: js.UndefOr[NullableOption[String]] = js.native
  
  // Model of the device
  var model: js.UndefOr[NullableOption[String]] = js.native
  
  // Operating system of the device. Windows, iOS, etc.
  var operatingSystem: js.UndefOr[NullableOption[String]] = js.native
  
  // Operating system version of the device.
  var osVersion: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Indicates the threat state of a device when a Mobile Threat Defense partner is in use by the account and device. Read
    * Only. Possible values are: unknown, activated, deactivated, secured, lowSeverity, mediumSeverity, highSeverity,
    * unresponsive, compromised, misconfigured.
    */
  var partnerReportedThreatState: js.UndefOr[ManagedDevicePartnerReportedHealthState] = js.native
  
  // Phone number of the device
  var phoneNumber: js.UndefOr[NullableOption[String]] = js.native
  
  // An error string that identifies issues when creating Remote Assistance session objects.
  var remoteAssistanceSessionErrorDetails: js.UndefOr[NullableOption[String]] = js.native
  
  // Url that allows a Remote Assistance session to be established with the device.
  var remoteAssistanceSessionUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // SerialNumber
  var serialNumber: js.UndefOr[NullableOption[String]] = js.native
  
  // Subscriber Carrier
  var subscriberCarrier: js.UndefOr[NullableOption[String]] = js.native
  
  // Total Storage in Bytes
  var totalStorageSpaceInBytes: js.UndefOr[Double] = js.native
  
  // User display name
  var userDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Unique Identifier for the user associated with the device
  var userId: js.UndefOr[NullableOption[String]] = js.native
  
  // Device user principal name
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.native
  
  // Wi-Fi MAC
  var wiFiMacAddress: js.UndefOr[NullableOption[String]] = js.native
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
    def setActivationLockBypassCode(value: NullableOption[String]): Self = this.set("activationLockBypassCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivationLockBypassCode: Self = this.set("activationLockBypassCode", js.undefined)
    
    @scala.inline
    def setActivationLockBypassCodeNull: Self = this.set("activationLockBypassCode", null)
    
    @scala.inline
    def setAndroidSecurityPatchLevel(value: NullableOption[String]): Self = this.set("androidSecurityPatchLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidSecurityPatchLevel: Self = this.set("androidSecurityPatchLevel", js.undefined)
    
    @scala.inline
    def setAndroidSecurityPatchLevelNull: Self = this.set("androidSecurityPatchLevel", null)
    
    @scala.inline
    def setAzureADDeviceId(value: NullableOption[String]): Self = this.set("azureADDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzureADDeviceId: Self = this.set("azureADDeviceId", js.undefined)
    
    @scala.inline
    def setAzureADDeviceIdNull: Self = this.set("azureADDeviceId", null)
    
    @scala.inline
    def setAzureADRegistered(value: NullableOption[Boolean]): Self = this.set("azureADRegistered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzureADRegistered: Self = this.set("azureADRegistered", js.undefined)
    
    @scala.inline
    def setAzureADRegisteredNull: Self = this.set("azureADRegistered", null)
    
    @scala.inline
    def setComplianceGracePeriodExpirationDateTime(value: String): Self = this.set("complianceGracePeriodExpirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceGracePeriodExpirationDateTime: Self = this.set("complianceGracePeriodExpirationDateTime", js.undefined)
    
    @scala.inline
    def setComplianceState(value: ComplianceState): Self = this.set("complianceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceState: Self = this.set("complianceState", js.undefined)
    
    @scala.inline
    def setConfigurationManagerClientEnabledFeatures(value: NullableOption[ConfigurationManagerClientEnabledFeatures]): Self = this.set("configurationManagerClientEnabledFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationManagerClientEnabledFeatures: Self = this.set("configurationManagerClientEnabledFeatures", js.undefined)
    
    @scala.inline
    def setConfigurationManagerClientEnabledFeaturesNull: Self = this.set("configurationManagerClientEnabledFeatures", null)
    
    @scala.inline
    def setDeviceActionResultsVarargs(value: DeviceActionResult*): Self = this.set("deviceActionResults", js.Array(value :_*))
    
    @scala.inline
    def setDeviceActionResults(value: NullableOption[js.Array[DeviceActionResult]]): Self = this.set("deviceActionResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceActionResults: Self = this.set("deviceActionResults", js.undefined)
    
    @scala.inline
    def setDeviceActionResultsNull: Self = this.set("deviceActionResults", null)
    
    @scala.inline
    def setDeviceCategory(value: NullableOption[DeviceCategory]): Self = this.set("deviceCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceCategory: Self = this.set("deviceCategory", js.undefined)
    
    @scala.inline
    def setDeviceCategoryNull: Self = this.set("deviceCategory", null)
    
    @scala.inline
    def setDeviceCategoryDisplayName(value: NullableOption[String]): Self = this.set("deviceCategoryDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceCategoryDisplayName: Self = this.set("deviceCategoryDisplayName", js.undefined)
    
    @scala.inline
    def setDeviceCategoryDisplayNameNull: Self = this.set("deviceCategoryDisplayName", null)
    
    @scala.inline
    def setDeviceCompliancePolicyStatesVarargs(value: DeviceCompliancePolicyState*): Self = this.set("deviceCompliancePolicyStates", js.Array(value :_*))
    
    @scala.inline
    def setDeviceCompliancePolicyStates(value: NullableOption[js.Array[DeviceCompliancePolicyState]]): Self = this.set("deviceCompliancePolicyStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceCompliancePolicyStates: Self = this.set("deviceCompliancePolicyStates", js.undefined)
    
    @scala.inline
    def setDeviceCompliancePolicyStatesNull: Self = this.set("deviceCompliancePolicyStates", null)
    
    @scala.inline
    def setDeviceConfigurationStatesVarargs(value: DeviceConfigurationState*): Self = this.set("deviceConfigurationStates", js.Array(value :_*))
    
    @scala.inline
    def setDeviceConfigurationStates(value: NullableOption[js.Array[DeviceConfigurationState]]): Self = this.set("deviceConfigurationStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceConfigurationStates: Self = this.set("deviceConfigurationStates", js.undefined)
    
    @scala.inline
    def setDeviceConfigurationStatesNull: Self = this.set("deviceConfigurationStates", null)
    
    @scala.inline
    def setDeviceEnrollmentType(value: DeviceEnrollmentType): Self = this.set("deviceEnrollmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceEnrollmentType: Self = this.set("deviceEnrollmentType", js.undefined)
    
    @scala.inline
    def setDeviceHealthAttestationState(value: NullableOption[DeviceHealthAttestationState]): Self = this.set("deviceHealthAttestationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceHealthAttestationState: Self = this.set("deviceHealthAttestationState", js.undefined)
    
    @scala.inline
    def setDeviceHealthAttestationStateNull: Self = this.set("deviceHealthAttestationState", null)
    
    @scala.inline
    def setDeviceName(value: NullableOption[String]): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    
    @scala.inline
    def setDeviceNameNull: Self = this.set("deviceName", null)
    
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
    def setEasDeviceId(value: NullableOption[String]): Self = this.set("easDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasDeviceId: Self = this.set("easDeviceId", js.undefined)
    
    @scala.inline
    def setEasDeviceIdNull: Self = this.set("easDeviceId", null)
    
    @scala.inline
    def setEmailAddress(value: NullableOption[String]): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    
    @scala.inline
    def setEmailAddressNull: Self = this.set("emailAddress", null)
    
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
    def setImei(value: NullableOption[String]): Self = this.set("imei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImei: Self = this.set("imei", js.undefined)
    
    @scala.inline
    def setImeiNull: Self = this.set("imei", null)
    
    @scala.inline
    def setIsEncrypted(value: Boolean): Self = this.set("isEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEncrypted: Self = this.set("isEncrypted", js.undefined)
    
    @scala.inline
    def setIsSupervised(value: Boolean): Self = this.set("isSupervised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSupervised: Self = this.set("isSupervised", js.undefined)
    
    @scala.inline
    def setJailBroken(value: NullableOption[String]): Self = this.set("jailBroken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJailBroken: Self = this.set("jailBroken", js.undefined)
    
    @scala.inline
    def setJailBrokenNull: Self = this.set("jailBroken", null)
    
    @scala.inline
    def setLastSyncDateTime(value: String): Self = this.set("lastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSyncDateTime: Self = this.set("lastSyncDateTime", js.undefined)
    
    @scala.inline
    def setManagedDeviceName(value: NullableOption[String]): Self = this.set("managedDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedDeviceName: Self = this.set("managedDeviceName", js.undefined)
    
    @scala.inline
    def setManagedDeviceNameNull: Self = this.set("managedDeviceName", null)
    
    @scala.inline
    def setManagedDeviceOwnerType(value: ManagedDeviceOwnerType): Self = this.set("managedDeviceOwnerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedDeviceOwnerType: Self = this.set("managedDeviceOwnerType", js.undefined)
    
    @scala.inline
    def setManagementAgent(value: ManagementAgentType): Self = this.set("managementAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagementAgent: Self = this.set("managementAgent", js.undefined)
    
    @scala.inline
    def setManufacturer(value: NullableOption[String]): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    
    @scala.inline
    def setManufacturerNull: Self = this.set("manufacturer", null)
    
    @scala.inline
    def setMeid(value: NullableOption[String]): Self = this.set("meid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeid: Self = this.set("meid", js.undefined)
    
    @scala.inline
    def setMeidNull: Self = this.set("meid", null)
    
    @scala.inline
    def setModel(value: NullableOption[String]): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setModelNull: Self = this.set("model", null)
    
    @scala.inline
    def setOperatingSystem(value: NullableOption[String]): Self = this.set("operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystem: Self = this.set("operatingSystem", js.undefined)
    
    @scala.inline
    def setOperatingSystemNull: Self = this.set("operatingSystem", null)
    
    @scala.inline
    def setOsVersion(value: NullableOption[String]): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsVersion: Self = this.set("osVersion", js.undefined)
    
    @scala.inline
    def setOsVersionNull: Self = this.set("osVersion", null)
    
    @scala.inline
    def setPartnerReportedThreatState(value: ManagedDevicePartnerReportedHealthState): Self = this.set("partnerReportedThreatState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerReportedThreatState: Self = this.set("partnerReportedThreatState", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: NullableOption[String]): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    
    @scala.inline
    def setPhoneNumberNull: Self = this.set("phoneNumber", null)
    
    @scala.inline
    def setRemoteAssistanceSessionErrorDetails(value: NullableOption[String]): Self = this.set("remoteAssistanceSessionErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteAssistanceSessionErrorDetails: Self = this.set("remoteAssistanceSessionErrorDetails", js.undefined)
    
    @scala.inline
    def setRemoteAssistanceSessionErrorDetailsNull: Self = this.set("remoteAssistanceSessionErrorDetails", null)
    
    @scala.inline
    def setRemoteAssistanceSessionUrl(value: NullableOption[String]): Self = this.set("remoteAssistanceSessionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteAssistanceSessionUrl: Self = this.set("remoteAssistanceSessionUrl", js.undefined)
    
    @scala.inline
    def setRemoteAssistanceSessionUrlNull: Self = this.set("remoteAssistanceSessionUrl", null)
    
    @scala.inline
    def setSerialNumber(value: NullableOption[String]): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
    
    @scala.inline
    def setSerialNumberNull: Self = this.set("serialNumber", null)
    
    @scala.inline
    def setSubscriberCarrier(value: NullableOption[String]): Self = this.set("subscriberCarrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriberCarrier: Self = this.set("subscriberCarrier", js.undefined)
    
    @scala.inline
    def setSubscriberCarrierNull: Self = this.set("subscriberCarrier", null)
    
    @scala.inline
    def setTotalStorageSpaceInBytes(value: Double): Self = this.set("totalStorageSpaceInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalStorageSpaceInBytes: Self = this.set("totalStorageSpaceInBytes", js.undefined)
    
    @scala.inline
    def setUserDisplayName(value: NullableOption[String]): Self = this.set("userDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDisplayName: Self = this.set("userDisplayName", js.undefined)
    
    @scala.inline
    def setUserDisplayNameNull: Self = this.set("userDisplayName", null)
    
    @scala.inline
    def setUserId(value: NullableOption[String]): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    
    @scala.inline
    def setUserIdNull: Self = this.set("userId", null)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = this.set("userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPrincipalName: Self = this.set("userPrincipalName", js.undefined)
    
    @scala.inline
    def setUserPrincipalNameNull: Self = this.set("userPrincipalName", null)
    
    @scala.inline
    def setWiFiMacAddress(value: NullableOption[String]): Self = this.set("wiFiMacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWiFiMacAddress: Self = this.set("wiFiMacAddress", js.undefined)
    
    @scala.inline
    def setWiFiMacAddressNull: Self = this.set("wiFiMacAddress", null)
  }
}

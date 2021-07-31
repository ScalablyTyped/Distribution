package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedDevice
  extends StObject
     with Entity {
  
  // Code that allows the Activation Lock on a device to be bypassed.
  var activationLockBypassCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Android security patch level
  var androidSecurityPatchLevel: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier for the Azure Active Directory device. Read only.
  var azureADDeviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Whether the device is Azure Active Directory registered.
  var azureADRegistered: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Compliance state of the device. Possible values are: unknown, compliant, noncompliant, conflict, error, inGracePeriod,
    * configManager.
    */
  var complianceState: js.UndefOr[ComplianceState] = js.undefined
  
  // ConfigrMgr client enabled features
  var configurationManagerClientEnabledFeatures: js.UndefOr[NullableOption[ConfigurationManagerClientEnabledFeatures]] = js.undefined
  
  // List of ComplexType deviceActionResult objects.
  var deviceActionResults: js.UndefOr[NullableOption[js.Array[DeviceActionResult]]] = js.undefined
  
  // Device category
  var deviceCategory: js.UndefOr[NullableOption[DeviceCategory]] = js.undefined
  
  // Device category display name
  var deviceCategoryDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Device compliance policy states for this device.
  var deviceCompliancePolicyStates: js.UndefOr[NullableOption[js.Array[DeviceCompliancePolicyState]]] = js.undefined
  
  // Device configuration states for this device.
  var deviceConfigurationStates: js.UndefOr[NullableOption[js.Array[DeviceConfigurationState]]] = js.undefined
  
  /**
    * Enrollment type of the device. Possible values are: unknown, userEnrollment, deviceEnrollmentManager,
    * appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment,
    * windowsBulkAzureDomainJoin, windowsCoManagement.
    */
  var deviceEnrollmentType: js.UndefOr[DeviceEnrollmentType] = js.undefined
  
  // The device health attestation state.
  var deviceHealthAttestationState: js.UndefOr[NullableOption[DeviceHealthAttestationState]] = js.undefined
  
  // Name of the device
  var deviceName: js.UndefOr[NullableOption[String]] = js.undefined
  
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
  var easDeviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Email(s) for the user associated with the device
  var emailAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
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
  var imei: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Device encryption status
  var isEncrypted: js.UndefOr[Boolean] = js.undefined
  
  // Device supervised status
  var isSupervised: js.UndefOr[Boolean] = js.undefined
  
  // whether the device is jail broken or rooted.
  var jailBroken: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time that the device last completed a successful sync with Intune.
  var lastSyncDateTime: js.UndefOr[String] = js.undefined
  
  // Automatically generated name to identify a device. Can be overwritten to a user friendly name.
  var managedDeviceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Ownership of the device. Can be 'company' or 'personal'. Possible values are: unknown, company, personal.
  var managedDeviceOwnerType: js.UndefOr[ManagedDeviceOwnerType] = js.undefined
  
  /**
    * Management channel of the device. Intune, EAS, etc. Possible values are: eas, mdm, easMdm, intuneClient,
    * easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown,
    * jamf, googleCloudDevicePolicyController.
    */
  var managementAgent: js.UndefOr[ManagementAgentType] = js.undefined
  
  // Manufacturer of the device
  var manufacturer: js.UndefOr[NullableOption[String]] = js.undefined
  
  // MEID
  var meid: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Model of the device
  var model: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Operating system of the device. Windows, iOS, etc.
  var operatingSystem: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Operating system version of the device.
  var osVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Indicates the threat state of a device when a Mobile Threat Defense partner is in use by the account and device. Read
    * Only. Possible values are: unknown, activated, deactivated, secured, lowSeverity, mediumSeverity, highSeverity,
    * unresponsive, compromised, misconfigured.
    */
  var partnerReportedThreatState: js.UndefOr[ManagedDevicePartnerReportedHealthState] = js.undefined
  
  // Phone number of the device
  var phoneNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // An error string that identifies issues when creating Remote Assistance session objects.
  var remoteAssistanceSessionErrorDetails: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Url that allows a Remote Assistance session to be established with the device.
  var remoteAssistanceSessionUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // SerialNumber
  var serialNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Subscriber Carrier
  var subscriberCarrier: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Total Storage in Bytes
  var totalStorageSpaceInBytes: js.UndefOr[Double] = js.undefined
  
  // User display name
  var userDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique Identifier for the user associated with the device
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Device user principal name
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Wi-Fi MAC
  var wiFiMacAddress: js.UndefOr[NullableOption[String]] = js.undefined
}
object ManagedDevice {
  
  @scala.inline
  def apply(): ManagedDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDevice]
  }
  
  @scala.inline
  implicit class ManagedDeviceMutableBuilder[Self <: ManagedDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivationLockBypassCode(value: NullableOption[String]): Self = StObject.set(x, "activationLockBypassCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationLockBypassCodeNull: Self = StObject.set(x, "activationLockBypassCode", null)
    
    @scala.inline
    def setActivationLockBypassCodeUndefined: Self = StObject.set(x, "activationLockBypassCode", js.undefined)
    
    @scala.inline
    def setAndroidSecurityPatchLevel(value: NullableOption[String]): Self = StObject.set(x, "androidSecurityPatchLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidSecurityPatchLevelNull: Self = StObject.set(x, "androidSecurityPatchLevel", null)
    
    @scala.inline
    def setAndroidSecurityPatchLevelUndefined: Self = StObject.set(x, "androidSecurityPatchLevel", js.undefined)
    
    @scala.inline
    def setAzureADDeviceId(value: NullableOption[String]): Self = StObject.set(x, "azureADDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureADDeviceIdNull: Self = StObject.set(x, "azureADDeviceId", null)
    
    @scala.inline
    def setAzureADDeviceIdUndefined: Self = StObject.set(x, "azureADDeviceId", js.undefined)
    
    @scala.inline
    def setAzureADRegistered(value: NullableOption[Boolean]): Self = StObject.set(x, "azureADRegistered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureADRegisteredNull: Self = StObject.set(x, "azureADRegistered", null)
    
    @scala.inline
    def setAzureADRegisteredUndefined: Self = StObject.set(x, "azureADRegistered", js.undefined)
    
    @scala.inline
    def setComplianceGracePeriodExpirationDateTime(value: String): Self = StObject.set(x, "complianceGracePeriodExpirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceGracePeriodExpirationDateTimeUndefined: Self = StObject.set(x, "complianceGracePeriodExpirationDateTime", js.undefined)
    
    @scala.inline
    def setComplianceState(value: ComplianceState): Self = StObject.set(x, "complianceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceStateUndefined: Self = StObject.set(x, "complianceState", js.undefined)
    
    @scala.inline
    def setConfigurationManagerClientEnabledFeatures(value: NullableOption[ConfigurationManagerClientEnabledFeatures]): Self = StObject.set(x, "configurationManagerClientEnabledFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationManagerClientEnabledFeaturesNull: Self = StObject.set(x, "configurationManagerClientEnabledFeatures", null)
    
    @scala.inline
    def setConfigurationManagerClientEnabledFeaturesUndefined: Self = StObject.set(x, "configurationManagerClientEnabledFeatures", js.undefined)
    
    @scala.inline
    def setDeviceActionResults(value: NullableOption[js.Array[DeviceActionResult]]): Self = StObject.set(x, "deviceActionResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceActionResultsNull: Self = StObject.set(x, "deviceActionResults", null)
    
    @scala.inline
    def setDeviceActionResultsUndefined: Self = StObject.set(x, "deviceActionResults", js.undefined)
    
    @scala.inline
    def setDeviceActionResultsVarargs(value: DeviceActionResult*): Self = StObject.set(x, "deviceActionResults", js.Array(value :_*))
    
    @scala.inline
    def setDeviceCategory(value: NullableOption[DeviceCategory]): Self = StObject.set(x, "deviceCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCategoryDisplayName(value: NullableOption[String]): Self = StObject.set(x, "deviceCategoryDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCategoryDisplayNameNull: Self = StObject.set(x, "deviceCategoryDisplayName", null)
    
    @scala.inline
    def setDeviceCategoryDisplayNameUndefined: Self = StObject.set(x, "deviceCategoryDisplayName", js.undefined)
    
    @scala.inline
    def setDeviceCategoryNull: Self = StObject.set(x, "deviceCategory", null)
    
    @scala.inline
    def setDeviceCategoryUndefined: Self = StObject.set(x, "deviceCategory", js.undefined)
    
    @scala.inline
    def setDeviceCompliancePolicyStates(value: NullableOption[js.Array[DeviceCompliancePolicyState]]): Self = StObject.set(x, "deviceCompliancePolicyStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCompliancePolicyStatesNull: Self = StObject.set(x, "deviceCompliancePolicyStates", null)
    
    @scala.inline
    def setDeviceCompliancePolicyStatesUndefined: Self = StObject.set(x, "deviceCompliancePolicyStates", js.undefined)
    
    @scala.inline
    def setDeviceCompliancePolicyStatesVarargs(value: DeviceCompliancePolicyState*): Self = StObject.set(x, "deviceCompliancePolicyStates", js.Array(value :_*))
    
    @scala.inline
    def setDeviceConfigurationStates(value: NullableOption[js.Array[DeviceConfigurationState]]): Self = StObject.set(x, "deviceConfigurationStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceConfigurationStatesNull: Self = StObject.set(x, "deviceConfigurationStates", null)
    
    @scala.inline
    def setDeviceConfigurationStatesUndefined: Self = StObject.set(x, "deviceConfigurationStates", js.undefined)
    
    @scala.inline
    def setDeviceConfigurationStatesVarargs(value: DeviceConfigurationState*): Self = StObject.set(x, "deviceConfigurationStates", js.Array(value :_*))
    
    @scala.inline
    def setDeviceEnrollmentType(value: DeviceEnrollmentType): Self = StObject.set(x, "deviceEnrollmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceEnrollmentTypeUndefined: Self = StObject.set(x, "deviceEnrollmentType", js.undefined)
    
    @scala.inline
    def setDeviceHealthAttestationState(value: NullableOption[DeviceHealthAttestationState]): Self = StObject.set(x, "deviceHealthAttestationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceHealthAttestationStateNull: Self = StObject.set(x, "deviceHealthAttestationState", null)
    
    @scala.inline
    def setDeviceHealthAttestationStateUndefined: Self = StObject.set(x, "deviceHealthAttestationState", js.undefined)
    
    @scala.inline
    def setDeviceName(value: NullableOption[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameNull: Self = StObject.set(x, "deviceName", null)
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    @scala.inline
    def setDeviceRegistrationState(value: DeviceRegistrationState): Self = StObject.set(x, "deviceRegistrationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceRegistrationStateUndefined: Self = StObject.set(x, "deviceRegistrationState", js.undefined)
    
    @scala.inline
    def setEasActivated(value: Boolean): Self = StObject.set(x, "easActivated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasActivatedUndefined: Self = StObject.set(x, "easActivated", js.undefined)
    
    @scala.inline
    def setEasActivationDateTime(value: String): Self = StObject.set(x, "easActivationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasActivationDateTimeUndefined: Self = StObject.set(x, "easActivationDateTime", js.undefined)
    
    @scala.inline
    def setEasDeviceId(value: NullableOption[String]): Self = StObject.set(x, "easDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasDeviceIdNull: Self = StObject.set(x, "easDeviceId", null)
    
    @scala.inline
    def setEasDeviceIdUndefined: Self = StObject.set(x, "easDeviceId", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setEnrolledDateTime(value: String): Self = StObject.set(x, "enrolledDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrolledDateTimeUndefined: Self = StObject.set(x, "enrolledDateTime", js.undefined)
    
    @scala.inline
    def setExchangeAccessState(value: DeviceManagementExchangeAccessState): Self = StObject.set(x, "exchangeAccessState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeAccessStateReason(value: DeviceManagementExchangeAccessStateReason): Self = StObject.set(x, "exchangeAccessStateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeAccessStateReasonUndefined: Self = StObject.set(x, "exchangeAccessStateReason", js.undefined)
    
    @scala.inline
    def setExchangeAccessStateUndefined: Self = StObject.set(x, "exchangeAccessState", js.undefined)
    
    @scala.inline
    def setExchangeLastSuccessfulSyncDateTime(value: String): Self = StObject.set(x, "exchangeLastSuccessfulSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeLastSuccessfulSyncDateTimeUndefined: Self = StObject.set(x, "exchangeLastSuccessfulSyncDateTime", js.undefined)
    
    @scala.inline
    def setFreeStorageSpaceInBytes(value: Double): Self = StObject.set(x, "freeStorageSpaceInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeStorageSpaceInBytesUndefined: Self = StObject.set(x, "freeStorageSpaceInBytes", js.undefined)
    
    @scala.inline
    def setImei(value: NullableOption[String]): Self = StObject.set(x, "imei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImeiNull: Self = StObject.set(x, "imei", null)
    
    @scala.inline
    def setImeiUndefined: Self = StObject.set(x, "imei", js.undefined)
    
    @scala.inline
    def setIsEncrypted(value: Boolean): Self = StObject.set(x, "isEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEncryptedUndefined: Self = StObject.set(x, "isEncrypted", js.undefined)
    
    @scala.inline
    def setIsSupervised(value: Boolean): Self = StObject.set(x, "isSupervised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSupervisedUndefined: Self = StObject.set(x, "isSupervised", js.undefined)
    
    @scala.inline
    def setJailBroken(value: NullableOption[String]): Self = StObject.set(x, "jailBroken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJailBrokenNull: Self = StObject.set(x, "jailBroken", null)
    
    @scala.inline
    def setJailBrokenUndefined: Self = StObject.set(x, "jailBroken", js.undefined)
    
    @scala.inline
    def setLastSyncDateTime(value: String): Self = StObject.set(x, "lastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSyncDateTimeUndefined: Self = StObject.set(x, "lastSyncDateTime", js.undefined)
    
    @scala.inline
    def setManagedDeviceName(value: NullableOption[String]): Self = StObject.set(x, "managedDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedDeviceNameNull: Self = StObject.set(x, "managedDeviceName", null)
    
    @scala.inline
    def setManagedDeviceNameUndefined: Self = StObject.set(x, "managedDeviceName", js.undefined)
    
    @scala.inline
    def setManagedDeviceOwnerType(value: ManagedDeviceOwnerType): Self = StObject.set(x, "managedDeviceOwnerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedDeviceOwnerTypeUndefined: Self = StObject.set(x, "managedDeviceOwnerType", js.undefined)
    
    @scala.inline
    def setManagementAgent(value: ManagementAgentType): Self = StObject.set(x, "managementAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementAgentUndefined: Self = StObject.set(x, "managementAgent", js.undefined)
    
    @scala.inline
    def setManufacturer(value: NullableOption[String]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    @scala.inline
    def setMeid(value: NullableOption[String]): Self = StObject.set(x, "meid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeidNull: Self = StObject.set(x, "meid", null)
    
    @scala.inline
    def setMeidUndefined: Self = StObject.set(x, "meid", js.undefined)
    
    @scala.inline
    def setModel(value: NullableOption[String]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelNull: Self = StObject.set(x, "model", null)
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: NullableOption[String]): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemNull: Self = StObject.set(x, "operatingSystem", null)
    
    @scala.inline
    def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
    
    @scala.inline
    def setOsVersion(value: NullableOption[String]): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
    
    @scala.inline
    def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    @scala.inline
    def setPartnerReportedThreatState(value: ManagedDevicePartnerReportedHealthState): Self = StObject.set(x, "partnerReportedThreatState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerReportedThreatStateUndefined: Self = StObject.set(x, "partnerReportedThreatState", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: NullableOption[String]): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setRemoteAssistanceSessionErrorDetails(value: NullableOption[String]): Self = StObject.set(x, "remoteAssistanceSessionErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAssistanceSessionErrorDetailsNull: Self = StObject.set(x, "remoteAssistanceSessionErrorDetails", null)
    
    @scala.inline
    def setRemoteAssistanceSessionErrorDetailsUndefined: Self = StObject.set(x, "remoteAssistanceSessionErrorDetails", js.undefined)
    
    @scala.inline
    def setRemoteAssistanceSessionUrl(value: NullableOption[String]): Self = StObject.set(x, "remoteAssistanceSessionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAssistanceSessionUrlNull: Self = StObject.set(x, "remoteAssistanceSessionUrl", null)
    
    @scala.inline
    def setRemoteAssistanceSessionUrlUndefined: Self = StObject.set(x, "remoteAssistanceSessionUrl", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: NullableOption[String]): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    @scala.inline
    def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    @scala.inline
    def setSubscriberCarrier(value: NullableOption[String]): Self = StObject.set(x, "subscriberCarrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriberCarrierNull: Self = StObject.set(x, "subscriberCarrier", null)
    
    @scala.inline
    def setSubscriberCarrierUndefined: Self = StObject.set(x, "subscriberCarrier", js.undefined)
    
    @scala.inline
    def setTotalStorageSpaceInBytes(value: Double): Self = StObject.set(x, "totalStorageSpaceInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalStorageSpaceInBytesUndefined: Self = StObject.set(x, "totalStorageSpaceInBytes", js.undefined)
    
    @scala.inline
    def setUserDisplayName(value: NullableOption[String]): Self = StObject.set(x, "userDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDisplayNameNull: Self = StObject.set(x, "userDisplayName", null)
    
    @scala.inline
    def setUserDisplayNameUndefined: Self = StObject.set(x, "userDisplayName", js.undefined)
    
    @scala.inline
    def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    @scala.inline
    def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
    
    @scala.inline
    def setWiFiMacAddress(value: NullableOption[String]): Self = StObject.set(x, "wiFiMacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWiFiMacAddressNull: Self = StObject.set(x, "wiFiMacAddress", null)
    
    @scala.inline
    def setWiFiMacAddressUndefined: Self = StObject.set(x, "wiFiMacAddress", js.undefined)
  }
}

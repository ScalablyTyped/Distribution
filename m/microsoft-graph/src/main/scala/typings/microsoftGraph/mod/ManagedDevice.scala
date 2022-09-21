package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedDevice
  extends StObject
     with Entity {
  
  // Code that allows the Activation Lock on a device to be bypassed. This property is read-only.
  var activationLockBypassCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Android security patch level. This property is read-only.
  var androidSecurityPatchLevel: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
  var azureADDeviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Whether the device is Azure Active Directory registered. This property is read-only.
  var azureADRegistered: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The DateTime when device compliance grace period expires. This property is read-only.
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Compliance state of the device. This property is read-only. Possible values are: unknown, compliant, noncompliant,
    * conflict, error, inGracePeriod, configManager.
    */
  var complianceState: js.UndefOr[ComplianceState] = js.undefined
  
  // ConfigrMgr client enabled features. This property is read-only.
  var configurationManagerClientEnabledFeatures: js.UndefOr[NullableOption[ConfigurationManagerClientEnabledFeatures]] = js.undefined
  
  // List of ComplexType deviceActionResult objects. This property is read-only.
  var deviceActionResults: js.UndefOr[NullableOption[js.Array[DeviceActionResult]]] = js.undefined
  
  // Device category
  var deviceCategory: js.UndefOr[NullableOption[DeviceCategory]] = js.undefined
  
  // Device category display name. This property is read-only.
  var deviceCategoryDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Device compliance policy states for this device.
  var deviceCompliancePolicyStates: js.UndefOr[NullableOption[js.Array[DeviceCompliancePolicyState]]] = js.undefined
  
  // Device configuration states for this device.
  var deviceConfigurationStates: js.UndefOr[NullableOption[js.Array[DeviceConfigurationState]]] = js.undefined
  
  /**
    * Enrollment type of the device. This property is read-only. Possible values are: unknown, userEnrollment,
    * deviceEnrollmentManager, appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless,
    * windowsAutoEnrollment, windowsBulkAzureDomainJoin, windowsCoManagement, windowsAzureADJoinUsingDeviceAuth,
    * appleUserEnrollment, appleUserEnrollmentWithServiceAccount.
    */
  var deviceEnrollmentType: js.UndefOr[DeviceEnrollmentType] = js.undefined
  
  // The device health attestation state. This property is read-only.
  var deviceHealthAttestationState: js.UndefOr[NullableOption[DeviceHealthAttestationState]] = js.undefined
  
  // Name of the device. This property is read-only.
  var deviceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Device registration state. This property is read-only. Possible values are: notRegistered, registered, revoked,
    * keyConflict, approvalPending, certificateReset, notRegisteredPendingEnrollment, unknown.
    */
  var deviceRegistrationState: js.UndefOr[DeviceRegistrationState] = js.undefined
  
  // Whether the device is Exchange ActiveSync activated. This property is read-only.
  var easActivated: js.UndefOr[Boolean] = js.undefined
  
  // Exchange ActivationSync activation time of the device. This property is read-only.
  var easActivationDateTime: js.UndefOr[String] = js.undefined
  
  // Exchange ActiveSync Id of the device. This property is read-only.
  var easDeviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Email(s) for the user associated with the device. This property is read-only.
  var emailAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Enrollment time of the device. This property is read-only.
  var enrolledDateTime: js.UndefOr[String] = js.undefined
  
  // Ethernet MAC. This property is read-only.
  var ethernetMacAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The Access State of the device in Exchange. This property is read-only. Possible values are: none, unknown, allowed,
    * blocked, quarantined.
    */
  var exchangeAccessState: js.UndefOr[DeviceManagementExchangeAccessState] = js.undefined
  
  /**
    * The reason for the device's access state in Exchange. This property is read-only. Possible values are: none, unknown,
    * exchangeGlobalRule, exchangeIndividualRule, exchangeDeviceRule, exchangeUpgrade, exchangeMailboxPolicy, other,
    * compliant, notCompliant, notEnrolled, unknownLocation, mfaRequired, azureADBlockDueToAccessPolicy, compromisedPassword,
    * deviceNotKnownWithManagedApp.
    */
  var exchangeAccessStateReason: js.UndefOr[DeviceManagementExchangeAccessStateReason] = js.undefined
  
  // Last time the device contacted Exchange. This property is read-only.
  var exchangeLastSuccessfulSyncDateTime: js.UndefOr[String] = js.undefined
  
  // Free Storage in Bytes. This property is read-only.
  var freeStorageSpaceInBytes: js.UndefOr[Double] = js.undefined
  
  // Integrated Circuit Card Identifier, it is A SIM card's unique identification number. This property is read-only.
  var iccid: js.UndefOr[NullableOption[String]] = js.undefined
  
  // IMEI. This property is read-only.
  var imei: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Device encryption status. This property is read-only.
  var isEncrypted: js.UndefOr[Boolean] = js.undefined
  
  // Device supervised status. This property is read-only.
  var isSupervised: js.UndefOr[Boolean] = js.undefined
  
  // whether the device is jail broken or rooted. This property is read-only.
  var jailBroken: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time that the device last completed a successful sync with Intune. This property is read-only.
  var lastSyncDateTime: js.UndefOr[String] = js.undefined
  
  // Automatically generated name to identify a device. Can be overwritten to a user friendly name.
  var managedDeviceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Ownership of the device. Can be 'company' or 'personal'. Possible values are: unknown, company, personal.
  var managedDeviceOwnerType: js.UndefOr[ManagedDeviceOwnerType] = js.undefined
  
  /**
    * Management channel of the device. Intune, EAS, etc. This property is read-only. Possible values are: eas, mdm, easMdm,
    * intuneClient, easIntuneClient, configurationManagerClient, configurationManagerClientMdm,
    * configurationManagerClientMdmEas, unknown, jamf, googleCloudDevicePolicyController.
    */
  var managementAgent: js.UndefOr[ManagementAgentType] = js.undefined
  
  // Manufacturer of the device. This property is read-only.
  var manufacturer: js.UndefOr[NullableOption[String]] = js.undefined
  
  // MEID. This property is read-only.
  var meid: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Model of the device. This property is read-only.
  var model: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Notes on the device created by IT Admin
  var notes: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Operating system of the device. Windows, iOS, etc. This property is read-only.
  var operatingSystem: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Operating system version of the device. This property is read-only.
  var osVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Indicates the threat state of a device when a Mobile Threat Defense partner is in use by the account and device. Read
    * Only. This property is read-only. Possible values are: unknown, activated, deactivated, secured, lowSeverity,
    * mediumSeverity, highSeverity, unresponsive, compromised, misconfigured.
    */
  var partnerReportedThreatState: js.UndefOr[ManagedDevicePartnerReportedHealthState] = js.undefined
  
  // Phone number of the device. This property is read-only.
  var phoneNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Total Memory in Bytes. This property is read-only.
  var physicalMemoryInBytes: js.UndefOr[Double] = js.undefined
  
  // An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.
  var remoteAssistanceSessionErrorDetails: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Url that allows a Remote Assistance session to be established with the device. This property is read-only.
  var remoteAssistanceSessionUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // SerialNumber. This property is read-only.
  var serialNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Subscriber Carrier. This property is read-only.
  var subscriberCarrier: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Total Storage in Bytes. This property is read-only.
  var totalStorageSpaceInBytes: js.UndefOr[Double] = js.undefined
  
  // Unique Device Identifier for iOS and macOS devices. This property is read-only.
  var udid: js.UndefOr[NullableOption[String]] = js.undefined
  
  // User display name. This property is read-only.
  var userDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique Identifier for the user associated with the device. This property is read-only.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Device user principal name. This property is read-only.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Wi-Fi MAC. This property is read-only.
  var wiFiMacAddress: js.UndefOr[NullableOption[String]] = js.undefined
}
object ManagedDevice {
  
  inline def apply(): ManagedDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDevice]
  }
  
  extension [Self <: ManagedDevice](x: Self) {
    
    inline def setActivationLockBypassCode(value: NullableOption[String]): Self = StObject.set(x, "activationLockBypassCode", value.asInstanceOf[js.Any])
    
    inline def setActivationLockBypassCodeNull: Self = StObject.set(x, "activationLockBypassCode", null)
    
    inline def setActivationLockBypassCodeUndefined: Self = StObject.set(x, "activationLockBypassCode", js.undefined)
    
    inline def setAndroidSecurityPatchLevel(value: NullableOption[String]): Self = StObject.set(x, "androidSecurityPatchLevel", value.asInstanceOf[js.Any])
    
    inline def setAndroidSecurityPatchLevelNull: Self = StObject.set(x, "androidSecurityPatchLevel", null)
    
    inline def setAndroidSecurityPatchLevelUndefined: Self = StObject.set(x, "androidSecurityPatchLevel", js.undefined)
    
    inline def setAzureADDeviceId(value: NullableOption[String]): Self = StObject.set(x, "azureADDeviceId", value.asInstanceOf[js.Any])
    
    inline def setAzureADDeviceIdNull: Self = StObject.set(x, "azureADDeviceId", null)
    
    inline def setAzureADDeviceIdUndefined: Self = StObject.set(x, "azureADDeviceId", js.undefined)
    
    inline def setAzureADRegistered(value: NullableOption[Boolean]): Self = StObject.set(x, "azureADRegistered", value.asInstanceOf[js.Any])
    
    inline def setAzureADRegisteredNull: Self = StObject.set(x, "azureADRegistered", null)
    
    inline def setAzureADRegisteredUndefined: Self = StObject.set(x, "azureADRegistered", js.undefined)
    
    inline def setComplianceGracePeriodExpirationDateTime(value: String): Self = StObject.set(x, "complianceGracePeriodExpirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setComplianceGracePeriodExpirationDateTimeUndefined: Self = StObject.set(x, "complianceGracePeriodExpirationDateTime", js.undefined)
    
    inline def setComplianceState(value: ComplianceState): Self = StObject.set(x, "complianceState", value.asInstanceOf[js.Any])
    
    inline def setComplianceStateUndefined: Self = StObject.set(x, "complianceState", js.undefined)
    
    inline def setConfigurationManagerClientEnabledFeatures(value: NullableOption[ConfigurationManagerClientEnabledFeatures]): Self = StObject.set(x, "configurationManagerClientEnabledFeatures", value.asInstanceOf[js.Any])
    
    inline def setConfigurationManagerClientEnabledFeaturesNull: Self = StObject.set(x, "configurationManagerClientEnabledFeatures", null)
    
    inline def setConfigurationManagerClientEnabledFeaturesUndefined: Self = StObject.set(x, "configurationManagerClientEnabledFeatures", js.undefined)
    
    inline def setDeviceActionResults(value: NullableOption[js.Array[DeviceActionResult]]): Self = StObject.set(x, "deviceActionResults", value.asInstanceOf[js.Any])
    
    inline def setDeviceActionResultsNull: Self = StObject.set(x, "deviceActionResults", null)
    
    inline def setDeviceActionResultsUndefined: Self = StObject.set(x, "deviceActionResults", js.undefined)
    
    inline def setDeviceActionResultsVarargs(value: DeviceActionResult*): Self = StObject.set(x, "deviceActionResults", js.Array(value*))
    
    inline def setDeviceCategory(value: NullableOption[DeviceCategory]): Self = StObject.set(x, "deviceCategory", value.asInstanceOf[js.Any])
    
    inline def setDeviceCategoryDisplayName(value: NullableOption[String]): Self = StObject.set(x, "deviceCategoryDisplayName", value.asInstanceOf[js.Any])
    
    inline def setDeviceCategoryDisplayNameNull: Self = StObject.set(x, "deviceCategoryDisplayName", null)
    
    inline def setDeviceCategoryDisplayNameUndefined: Self = StObject.set(x, "deviceCategoryDisplayName", js.undefined)
    
    inline def setDeviceCategoryNull: Self = StObject.set(x, "deviceCategory", null)
    
    inline def setDeviceCategoryUndefined: Self = StObject.set(x, "deviceCategory", js.undefined)
    
    inline def setDeviceCompliancePolicyStates(value: NullableOption[js.Array[DeviceCompliancePolicyState]]): Self = StObject.set(x, "deviceCompliancePolicyStates", value.asInstanceOf[js.Any])
    
    inline def setDeviceCompliancePolicyStatesNull: Self = StObject.set(x, "deviceCompliancePolicyStates", null)
    
    inline def setDeviceCompliancePolicyStatesUndefined: Self = StObject.set(x, "deviceCompliancePolicyStates", js.undefined)
    
    inline def setDeviceCompliancePolicyStatesVarargs(value: DeviceCompliancePolicyState*): Self = StObject.set(x, "deviceCompliancePolicyStates", js.Array(value*))
    
    inline def setDeviceConfigurationStates(value: NullableOption[js.Array[DeviceConfigurationState]]): Self = StObject.set(x, "deviceConfigurationStates", value.asInstanceOf[js.Any])
    
    inline def setDeviceConfigurationStatesNull: Self = StObject.set(x, "deviceConfigurationStates", null)
    
    inline def setDeviceConfigurationStatesUndefined: Self = StObject.set(x, "deviceConfigurationStates", js.undefined)
    
    inline def setDeviceConfigurationStatesVarargs(value: DeviceConfigurationState*): Self = StObject.set(x, "deviceConfigurationStates", js.Array(value*))
    
    inline def setDeviceEnrollmentType(value: DeviceEnrollmentType): Self = StObject.set(x, "deviceEnrollmentType", value.asInstanceOf[js.Any])
    
    inline def setDeviceEnrollmentTypeUndefined: Self = StObject.set(x, "deviceEnrollmentType", js.undefined)
    
    inline def setDeviceHealthAttestationState(value: NullableOption[DeviceHealthAttestationState]): Self = StObject.set(x, "deviceHealthAttestationState", value.asInstanceOf[js.Any])
    
    inline def setDeviceHealthAttestationStateNull: Self = StObject.set(x, "deviceHealthAttestationState", null)
    
    inline def setDeviceHealthAttestationStateUndefined: Self = StObject.set(x, "deviceHealthAttestationState", js.undefined)
    
    inline def setDeviceName(value: NullableOption[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameNull: Self = StObject.set(x, "deviceName", null)
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setDeviceRegistrationState(value: DeviceRegistrationState): Self = StObject.set(x, "deviceRegistrationState", value.asInstanceOf[js.Any])
    
    inline def setDeviceRegistrationStateUndefined: Self = StObject.set(x, "deviceRegistrationState", js.undefined)
    
    inline def setEasActivated(value: Boolean): Self = StObject.set(x, "easActivated", value.asInstanceOf[js.Any])
    
    inline def setEasActivatedUndefined: Self = StObject.set(x, "easActivated", js.undefined)
    
    inline def setEasActivationDateTime(value: String): Self = StObject.set(x, "easActivationDateTime", value.asInstanceOf[js.Any])
    
    inline def setEasActivationDateTimeUndefined: Self = StObject.set(x, "easActivationDateTime", js.undefined)
    
    inline def setEasDeviceId(value: NullableOption[String]): Self = StObject.set(x, "easDeviceId", value.asInstanceOf[js.Any])
    
    inline def setEasDeviceIdNull: Self = StObject.set(x, "easDeviceId", null)
    
    inline def setEasDeviceIdUndefined: Self = StObject.set(x, "easDeviceId", js.undefined)
    
    inline def setEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setEnrolledDateTime(value: String): Self = StObject.set(x, "enrolledDateTime", value.asInstanceOf[js.Any])
    
    inline def setEnrolledDateTimeUndefined: Self = StObject.set(x, "enrolledDateTime", js.undefined)
    
    inline def setEthernetMacAddress(value: NullableOption[String]): Self = StObject.set(x, "ethernetMacAddress", value.asInstanceOf[js.Any])
    
    inline def setEthernetMacAddressNull: Self = StObject.set(x, "ethernetMacAddress", null)
    
    inline def setEthernetMacAddressUndefined: Self = StObject.set(x, "ethernetMacAddress", js.undefined)
    
    inline def setExchangeAccessState(value: DeviceManagementExchangeAccessState): Self = StObject.set(x, "exchangeAccessState", value.asInstanceOf[js.Any])
    
    inline def setExchangeAccessStateReason(value: DeviceManagementExchangeAccessStateReason): Self = StObject.set(x, "exchangeAccessStateReason", value.asInstanceOf[js.Any])
    
    inline def setExchangeAccessStateReasonUndefined: Self = StObject.set(x, "exchangeAccessStateReason", js.undefined)
    
    inline def setExchangeAccessStateUndefined: Self = StObject.set(x, "exchangeAccessState", js.undefined)
    
    inline def setExchangeLastSuccessfulSyncDateTime(value: String): Self = StObject.set(x, "exchangeLastSuccessfulSyncDateTime", value.asInstanceOf[js.Any])
    
    inline def setExchangeLastSuccessfulSyncDateTimeUndefined: Self = StObject.set(x, "exchangeLastSuccessfulSyncDateTime", js.undefined)
    
    inline def setFreeStorageSpaceInBytes(value: Double): Self = StObject.set(x, "freeStorageSpaceInBytes", value.asInstanceOf[js.Any])
    
    inline def setFreeStorageSpaceInBytesUndefined: Self = StObject.set(x, "freeStorageSpaceInBytes", js.undefined)
    
    inline def setIccid(value: NullableOption[String]): Self = StObject.set(x, "iccid", value.asInstanceOf[js.Any])
    
    inline def setIccidNull: Self = StObject.set(x, "iccid", null)
    
    inline def setIccidUndefined: Self = StObject.set(x, "iccid", js.undefined)
    
    inline def setImei(value: NullableOption[String]): Self = StObject.set(x, "imei", value.asInstanceOf[js.Any])
    
    inline def setImeiNull: Self = StObject.set(x, "imei", null)
    
    inline def setImeiUndefined: Self = StObject.set(x, "imei", js.undefined)
    
    inline def setIsEncrypted(value: Boolean): Self = StObject.set(x, "isEncrypted", value.asInstanceOf[js.Any])
    
    inline def setIsEncryptedUndefined: Self = StObject.set(x, "isEncrypted", js.undefined)
    
    inline def setIsSupervised(value: Boolean): Self = StObject.set(x, "isSupervised", value.asInstanceOf[js.Any])
    
    inline def setIsSupervisedUndefined: Self = StObject.set(x, "isSupervised", js.undefined)
    
    inline def setJailBroken(value: NullableOption[String]): Self = StObject.set(x, "jailBroken", value.asInstanceOf[js.Any])
    
    inline def setJailBrokenNull: Self = StObject.set(x, "jailBroken", null)
    
    inline def setJailBrokenUndefined: Self = StObject.set(x, "jailBroken", js.undefined)
    
    inline def setLastSyncDateTime(value: String): Self = StObject.set(x, "lastSyncDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastSyncDateTimeUndefined: Self = StObject.set(x, "lastSyncDateTime", js.undefined)
    
    inline def setManagedDeviceName(value: NullableOption[String]): Self = StObject.set(x, "managedDeviceName", value.asInstanceOf[js.Any])
    
    inline def setManagedDeviceNameNull: Self = StObject.set(x, "managedDeviceName", null)
    
    inline def setManagedDeviceNameUndefined: Self = StObject.set(x, "managedDeviceName", js.undefined)
    
    inline def setManagedDeviceOwnerType(value: ManagedDeviceOwnerType): Self = StObject.set(x, "managedDeviceOwnerType", value.asInstanceOf[js.Any])
    
    inline def setManagedDeviceOwnerTypeUndefined: Self = StObject.set(x, "managedDeviceOwnerType", js.undefined)
    
    inline def setManagementAgent(value: ManagementAgentType): Self = StObject.set(x, "managementAgent", value.asInstanceOf[js.Any])
    
    inline def setManagementAgentUndefined: Self = StObject.set(x, "managementAgent", js.undefined)
    
    inline def setManufacturer(value: NullableOption[String]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setMeid(value: NullableOption[String]): Self = StObject.set(x, "meid", value.asInstanceOf[js.Any])
    
    inline def setMeidNull: Self = StObject.set(x, "meid", null)
    
    inline def setMeidUndefined: Self = StObject.set(x, "meid", js.undefined)
    
    inline def setModel(value: NullableOption[String]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setNotes(value: NullableOption[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setOperatingSystem(value: NullableOption[String]): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemNull: Self = StObject.set(x, "operatingSystem", null)
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
    
    inline def setOsVersion(value: NullableOption[String]): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setPartnerReportedThreatState(value: ManagedDevicePartnerReportedHealthState): Self = StObject.set(x, "partnerReportedThreatState", value.asInstanceOf[js.Any])
    
    inline def setPartnerReportedThreatStateUndefined: Self = StObject.set(x, "partnerReportedThreatState", js.undefined)
    
    inline def setPhoneNumber(value: NullableOption[String]): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPhysicalMemoryInBytes(value: Double): Self = StObject.set(x, "physicalMemoryInBytes", value.asInstanceOf[js.Any])
    
    inline def setPhysicalMemoryInBytesUndefined: Self = StObject.set(x, "physicalMemoryInBytes", js.undefined)
    
    inline def setRemoteAssistanceSessionErrorDetails(value: NullableOption[String]): Self = StObject.set(x, "remoteAssistanceSessionErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setRemoteAssistanceSessionErrorDetailsNull: Self = StObject.set(x, "remoteAssistanceSessionErrorDetails", null)
    
    inline def setRemoteAssistanceSessionErrorDetailsUndefined: Self = StObject.set(x, "remoteAssistanceSessionErrorDetails", js.undefined)
    
    inline def setRemoteAssistanceSessionUrl(value: NullableOption[String]): Self = StObject.set(x, "remoteAssistanceSessionUrl", value.asInstanceOf[js.Any])
    
    inline def setRemoteAssistanceSessionUrlNull: Self = StObject.set(x, "remoteAssistanceSessionUrl", null)
    
    inline def setRemoteAssistanceSessionUrlUndefined: Self = StObject.set(x, "remoteAssistanceSessionUrl", js.undefined)
    
    inline def setSerialNumber(value: NullableOption[String]): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setSubscriberCarrier(value: NullableOption[String]): Self = StObject.set(x, "subscriberCarrier", value.asInstanceOf[js.Any])
    
    inline def setSubscriberCarrierNull: Self = StObject.set(x, "subscriberCarrier", null)
    
    inline def setSubscriberCarrierUndefined: Self = StObject.set(x, "subscriberCarrier", js.undefined)
    
    inline def setTotalStorageSpaceInBytes(value: Double): Self = StObject.set(x, "totalStorageSpaceInBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalStorageSpaceInBytesUndefined: Self = StObject.set(x, "totalStorageSpaceInBytes", js.undefined)
    
    inline def setUdid(value: NullableOption[String]): Self = StObject.set(x, "udid", value.asInstanceOf[js.Any])
    
    inline def setUdidNull: Self = StObject.set(x, "udid", null)
    
    inline def setUdidUndefined: Self = StObject.set(x, "udid", js.undefined)
    
    inline def setUserDisplayName(value: NullableOption[String]): Self = StObject.set(x, "userDisplayName", value.asInstanceOf[js.Any])
    
    inline def setUserDisplayNameNull: Self = StObject.set(x, "userDisplayName", null)
    
    inline def setUserDisplayNameUndefined: Self = StObject.set(x, "userDisplayName", js.undefined)
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
    
    inline def setWiFiMacAddress(value: NullableOption[String]): Self = StObject.set(x, "wiFiMacAddress", value.asInstanceOf[js.Any])
    
    inline def setWiFiMacAddressNull: Self = StObject.set(x, "wiFiMacAddress", null)
    
    inline def setWiFiMacAddressUndefined: Self = StObject.set(x, "wiFiMacAddress", js.undefined)
  }
}

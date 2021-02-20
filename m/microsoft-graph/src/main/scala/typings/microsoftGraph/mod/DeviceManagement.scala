package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceManagement extends Entity {
  
  // Apple push notification certificate.
  var applePushNotificationCertificate: js.UndefOr[NullableOption[ApplePushNotificationCertificate]] = js.native
  
  // The list of Compliance Management Partners configured by the tenant.
  var complianceManagementPartners: js.UndefOr[NullableOption[js.Array[ComplianceManagementPartner]]] = js.native
  
  /**
    * The Exchange on premises conditional access settings. On premises conditional access will require devices to be both
    * enrolled and compliant for mail access
    */
  var conditionalAccessSettings: js.UndefOr[NullableOption[OnPremisesConditionalAccessSettings]] = js.native
  
  // The list of detected apps associated with a device.
  var detectedApps: js.UndefOr[NullableOption[js.Array[DetectedApp]]] = js.native
  
  // The list of device categories with the tenant.
  var deviceCategories: js.UndefOr[NullableOption[js.Array[DeviceCategory]]] = js.native
  
  // The device compliance policies.
  var deviceCompliancePolicies: js.UndefOr[NullableOption[js.Array[DeviceCompliancePolicy]]] = js.native
  
  // The device compliance state summary for this account.
  var deviceCompliancePolicyDeviceStateSummary: js.UndefOr[NullableOption[DeviceCompliancePolicyDeviceStateSummary]] = js.native
  
  // The summary states of compliance policy settings for this account.
  var deviceCompliancePolicySettingStateSummaries: js.UndefOr[NullableOption[js.Array[DeviceCompliancePolicySettingStateSummary]]] = js.native
  
  // The device configuration device state summary for this account.
  var deviceConfigurationDeviceStateSummaries: js.UndefOr[NullableOption[DeviceConfigurationDeviceStateSummary]] = js.native
  
  // The device configurations.
  var deviceConfigurations: js.UndefOr[NullableOption[js.Array[DeviceConfiguration]]] = js.native
  
  // The list of device enrollment configurations
  var deviceEnrollmentConfigurations: js.UndefOr[NullableOption[js.Array[DeviceEnrollmentConfiguration]]] = js.native
  
  // The list of Device Management Partners configured by the tenant.
  var deviceManagementPartners: js.UndefOr[NullableOption[js.Array[DeviceManagementPartner]]] = js.native
  
  // The list of Exchange Connectors configured by the tenant.
  var exchangeConnectors: js.UndefOr[NullableOption[js.Array[DeviceManagementExchangeConnector]]] = js.native
  
  // Intune Account Id for given tenant
  var intuneAccountId: js.UndefOr[String] = js.native
  
  /**
    * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the
    * end user web portal.
    */
  var intuneBrand: js.UndefOr[NullableOption[IntuneBrand]] = js.native
  
  // The IOS software update installation statuses for this account.
  var iosUpdateStatuses: js.UndefOr[NullableOption[js.Array[IosUpdateDeviceStatus]]] = js.native
  
  // Device overview
  var managedDeviceOverview: js.UndefOr[NullableOption[ManagedDeviceOverview]] = js.native
  
  // The list of managed devices.
  var managedDevices: js.UndefOr[NullableOption[js.Array[ManagedDevice]]] = js.native
  
  // The list of Mobile threat Defense connectors configured by the tenant.
  var mobileThreatDefenseConnectors: js.UndefOr[NullableOption[js.Array[MobileThreatDefenseConnector]]] = js.native
  
  // The Notification Message Templates.
  var notificationMessageTemplates: js.UndefOr[NullableOption[js.Array[NotificationMessageTemplate]]] = js.native
  
  // The remote assist partners.
  var remoteAssistancePartners: js.UndefOr[NullableOption[js.Array[RemoteAssistancePartner]]] = js.native
  
  // The Resource Operations.
  var resourceOperations: js.UndefOr[NullableOption[js.Array[ResourceOperation]]] = js.native
  
  // The Role Assignments.
  var roleAssignments: js.UndefOr[NullableOption[js.Array[DeviceAndAppManagementRoleAssignment]]] = js.native
  
  // The Role Definitions.
  var roleDefinitions: js.UndefOr[NullableOption[js.Array[RoleDefinition]]] = js.native
  
  // Account level settings.
  var settings: js.UndefOr[NullableOption[DeviceManagementSettings]] = js.native
  
  // The software update status summary.
  var softwareUpdateStatusSummary: js.UndefOr[NullableOption[SoftwareUpdateStatusSummary]] = js.native
  
  /**
    * Tenant mobile device management subscription state. The possible values are: pending, active, warning, disabled,
    * deleted, blocked, lockedOut.
    */
  var subscriptionState: js.UndefOr[DeviceManagementSubscriptionState] = js.native
  
  // The telecom expense management partners.
  var telecomExpenseManagementPartners: js.UndefOr[NullableOption[js.Array[TelecomExpenseManagementPartner]]] = js.native
  
  // The terms and conditions associated with device management of the company.
  var termsAndConditions: js.UndefOr[NullableOption[js.Array[TermsAndConditions]]] = js.native
  
  // The list of troubleshooting events for the tenant.
  var troubleshootingEvents: js.UndefOr[NullableOption[js.Array[DeviceManagementTroubleshootingEvent]]] = js.native
  
  // The windows information protection app learning summaries.
  var windowsInformationProtectionAppLearningSummaries: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionAppLearningSummary]]] = js.native
  
  // The windows information protection network learning summaries.
  var windowsInformationProtectionNetworkLearningSummaries: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionNetworkLearningSummary]]] = js.native
}
object DeviceManagement {
  
  @scala.inline
  def apply(): DeviceManagement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagement]
  }
  
  @scala.inline
  implicit class DeviceManagementMutableBuilder[Self <: DeviceManagement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplePushNotificationCertificate(value: NullableOption[ApplePushNotificationCertificate]): Self = StObject.set(x, "applePushNotificationCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplePushNotificationCertificateNull: Self = StObject.set(x, "applePushNotificationCertificate", null)
    
    @scala.inline
    def setApplePushNotificationCertificateUndefined: Self = StObject.set(x, "applePushNotificationCertificate", js.undefined)
    
    @scala.inline
    def setComplianceManagementPartners(value: NullableOption[js.Array[ComplianceManagementPartner]]): Self = StObject.set(x, "complianceManagementPartners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceManagementPartnersNull: Self = StObject.set(x, "complianceManagementPartners", null)
    
    @scala.inline
    def setComplianceManagementPartnersUndefined: Self = StObject.set(x, "complianceManagementPartners", js.undefined)
    
    @scala.inline
    def setComplianceManagementPartnersVarargs(value: ComplianceManagementPartner*): Self = StObject.set(x, "complianceManagementPartners", js.Array(value :_*))
    
    @scala.inline
    def setConditionalAccessSettings(value: NullableOption[OnPremisesConditionalAccessSettings]): Self = StObject.set(x, "conditionalAccessSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalAccessSettingsNull: Self = StObject.set(x, "conditionalAccessSettings", null)
    
    @scala.inline
    def setConditionalAccessSettingsUndefined: Self = StObject.set(x, "conditionalAccessSettings", js.undefined)
    
    @scala.inline
    def setDetectedApps(value: NullableOption[js.Array[DetectedApp]]): Self = StObject.set(x, "detectedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedAppsNull: Self = StObject.set(x, "detectedApps", null)
    
    @scala.inline
    def setDetectedAppsUndefined: Self = StObject.set(x, "detectedApps", js.undefined)
    
    @scala.inline
    def setDetectedAppsVarargs(value: DetectedApp*): Self = StObject.set(x, "detectedApps", js.Array(value :_*))
    
    @scala.inline
    def setDeviceCategories(value: NullableOption[js.Array[DeviceCategory]]): Self = StObject.set(x, "deviceCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCategoriesNull: Self = StObject.set(x, "deviceCategories", null)
    
    @scala.inline
    def setDeviceCategoriesUndefined: Self = StObject.set(x, "deviceCategories", js.undefined)
    
    @scala.inline
    def setDeviceCategoriesVarargs(value: DeviceCategory*): Self = StObject.set(x, "deviceCategories", js.Array(value :_*))
    
    @scala.inline
    def setDeviceCompliancePolicies(value: NullableOption[js.Array[DeviceCompliancePolicy]]): Self = StObject.set(x, "deviceCompliancePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCompliancePoliciesNull: Self = StObject.set(x, "deviceCompliancePolicies", null)
    
    @scala.inline
    def setDeviceCompliancePoliciesUndefined: Self = StObject.set(x, "deviceCompliancePolicies", js.undefined)
    
    @scala.inline
    def setDeviceCompliancePoliciesVarargs(value: DeviceCompliancePolicy*): Self = StObject.set(x, "deviceCompliancePolicies", js.Array(value :_*))
    
    @scala.inline
    def setDeviceCompliancePolicyDeviceStateSummary(value: NullableOption[DeviceCompliancePolicyDeviceStateSummary]): Self = StObject.set(x, "deviceCompliancePolicyDeviceStateSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCompliancePolicyDeviceStateSummaryNull: Self = StObject.set(x, "deviceCompliancePolicyDeviceStateSummary", null)
    
    @scala.inline
    def setDeviceCompliancePolicyDeviceStateSummaryUndefined: Self = StObject.set(x, "deviceCompliancePolicyDeviceStateSummary", js.undefined)
    
    @scala.inline
    def setDeviceCompliancePolicySettingStateSummaries(value: NullableOption[js.Array[DeviceCompliancePolicySettingStateSummary]]): Self = StObject.set(x, "deviceCompliancePolicySettingStateSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCompliancePolicySettingStateSummariesNull: Self = StObject.set(x, "deviceCompliancePolicySettingStateSummaries", null)
    
    @scala.inline
    def setDeviceCompliancePolicySettingStateSummariesUndefined: Self = StObject.set(x, "deviceCompliancePolicySettingStateSummaries", js.undefined)
    
    @scala.inline
    def setDeviceCompliancePolicySettingStateSummariesVarargs(value: DeviceCompliancePolicySettingStateSummary*): Self = StObject.set(x, "deviceCompliancePolicySettingStateSummaries", js.Array(value :_*))
    
    @scala.inline
    def setDeviceConfigurationDeviceStateSummaries(value: NullableOption[DeviceConfigurationDeviceStateSummary]): Self = StObject.set(x, "deviceConfigurationDeviceStateSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceConfigurationDeviceStateSummariesNull: Self = StObject.set(x, "deviceConfigurationDeviceStateSummaries", null)
    
    @scala.inline
    def setDeviceConfigurationDeviceStateSummariesUndefined: Self = StObject.set(x, "deviceConfigurationDeviceStateSummaries", js.undefined)
    
    @scala.inline
    def setDeviceConfigurations(value: NullableOption[js.Array[DeviceConfiguration]]): Self = StObject.set(x, "deviceConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceConfigurationsNull: Self = StObject.set(x, "deviceConfigurations", null)
    
    @scala.inline
    def setDeviceConfigurationsUndefined: Self = StObject.set(x, "deviceConfigurations", js.undefined)
    
    @scala.inline
    def setDeviceConfigurationsVarargs(value: DeviceConfiguration*): Self = StObject.set(x, "deviceConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDeviceEnrollmentConfigurations(value: NullableOption[js.Array[DeviceEnrollmentConfiguration]]): Self = StObject.set(x, "deviceEnrollmentConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceEnrollmentConfigurationsNull: Self = StObject.set(x, "deviceEnrollmentConfigurations", null)
    
    @scala.inline
    def setDeviceEnrollmentConfigurationsUndefined: Self = StObject.set(x, "deviceEnrollmentConfigurations", js.undefined)
    
    @scala.inline
    def setDeviceEnrollmentConfigurationsVarargs(value: DeviceEnrollmentConfiguration*): Self = StObject.set(x, "deviceEnrollmentConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDeviceManagementPartners(value: NullableOption[js.Array[DeviceManagementPartner]]): Self = StObject.set(x, "deviceManagementPartners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceManagementPartnersNull: Self = StObject.set(x, "deviceManagementPartners", null)
    
    @scala.inline
    def setDeviceManagementPartnersUndefined: Self = StObject.set(x, "deviceManagementPartners", js.undefined)
    
    @scala.inline
    def setDeviceManagementPartnersVarargs(value: DeviceManagementPartner*): Self = StObject.set(x, "deviceManagementPartners", js.Array(value :_*))
    
    @scala.inline
    def setExchangeConnectors(value: NullableOption[js.Array[DeviceManagementExchangeConnector]]): Self = StObject.set(x, "exchangeConnectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeConnectorsNull: Self = StObject.set(x, "exchangeConnectors", null)
    
    @scala.inline
    def setExchangeConnectorsUndefined: Self = StObject.set(x, "exchangeConnectors", js.undefined)
    
    @scala.inline
    def setExchangeConnectorsVarargs(value: DeviceManagementExchangeConnector*): Self = StObject.set(x, "exchangeConnectors", js.Array(value :_*))
    
    @scala.inline
    def setIntuneAccountId(value: String): Self = StObject.set(x, "intuneAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntuneAccountIdUndefined: Self = StObject.set(x, "intuneAccountId", js.undefined)
    
    @scala.inline
    def setIntuneBrand(value: NullableOption[IntuneBrand]): Self = StObject.set(x, "intuneBrand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntuneBrandNull: Self = StObject.set(x, "intuneBrand", null)
    
    @scala.inline
    def setIntuneBrandUndefined: Self = StObject.set(x, "intuneBrand", js.undefined)
    
    @scala.inline
    def setIosUpdateStatuses(value: NullableOption[js.Array[IosUpdateDeviceStatus]]): Self = StObject.set(x, "iosUpdateStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosUpdateStatusesNull: Self = StObject.set(x, "iosUpdateStatuses", null)
    
    @scala.inline
    def setIosUpdateStatusesUndefined: Self = StObject.set(x, "iosUpdateStatuses", js.undefined)
    
    @scala.inline
    def setIosUpdateStatusesVarargs(value: IosUpdateDeviceStatus*): Self = StObject.set(x, "iosUpdateStatuses", js.Array(value :_*))
    
    @scala.inline
    def setManagedDeviceOverview(value: NullableOption[ManagedDeviceOverview]): Self = StObject.set(x, "managedDeviceOverview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedDeviceOverviewNull: Self = StObject.set(x, "managedDeviceOverview", null)
    
    @scala.inline
    def setManagedDeviceOverviewUndefined: Self = StObject.set(x, "managedDeviceOverview", js.undefined)
    
    @scala.inline
    def setManagedDevices(value: NullableOption[js.Array[ManagedDevice]]): Self = StObject.set(x, "managedDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedDevicesNull: Self = StObject.set(x, "managedDevices", null)
    
    @scala.inline
    def setManagedDevicesUndefined: Self = StObject.set(x, "managedDevices", js.undefined)
    
    @scala.inline
    def setManagedDevicesVarargs(value: ManagedDevice*): Self = StObject.set(x, "managedDevices", js.Array(value :_*))
    
    @scala.inline
    def setMobileThreatDefenseConnectors(value: NullableOption[js.Array[MobileThreatDefenseConnector]]): Self = StObject.set(x, "mobileThreatDefenseConnectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileThreatDefenseConnectorsNull: Self = StObject.set(x, "mobileThreatDefenseConnectors", null)
    
    @scala.inline
    def setMobileThreatDefenseConnectorsUndefined: Self = StObject.set(x, "mobileThreatDefenseConnectors", js.undefined)
    
    @scala.inline
    def setMobileThreatDefenseConnectorsVarargs(value: MobileThreatDefenseConnector*): Self = StObject.set(x, "mobileThreatDefenseConnectors", js.Array(value :_*))
    
    @scala.inline
    def setNotificationMessageTemplates(value: NullableOption[js.Array[NotificationMessageTemplate]]): Self = StObject.set(x, "notificationMessageTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationMessageTemplatesNull: Self = StObject.set(x, "notificationMessageTemplates", null)
    
    @scala.inline
    def setNotificationMessageTemplatesUndefined: Self = StObject.set(x, "notificationMessageTemplates", js.undefined)
    
    @scala.inline
    def setNotificationMessageTemplatesVarargs(value: NotificationMessageTemplate*): Self = StObject.set(x, "notificationMessageTemplates", js.Array(value :_*))
    
    @scala.inline
    def setRemoteAssistancePartners(value: NullableOption[js.Array[RemoteAssistancePartner]]): Self = StObject.set(x, "remoteAssistancePartners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAssistancePartnersNull: Self = StObject.set(x, "remoteAssistancePartners", null)
    
    @scala.inline
    def setRemoteAssistancePartnersUndefined: Self = StObject.set(x, "remoteAssistancePartners", js.undefined)
    
    @scala.inline
    def setRemoteAssistancePartnersVarargs(value: RemoteAssistancePartner*): Self = StObject.set(x, "remoteAssistancePartners", js.Array(value :_*))
    
    @scala.inline
    def setResourceOperations(value: NullableOption[js.Array[ResourceOperation]]): Self = StObject.set(x, "resourceOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOperationsNull: Self = StObject.set(x, "resourceOperations", null)
    
    @scala.inline
    def setResourceOperationsUndefined: Self = StObject.set(x, "resourceOperations", js.undefined)
    
    @scala.inline
    def setResourceOperationsVarargs(value: ResourceOperation*): Self = StObject.set(x, "resourceOperations", js.Array(value :_*))
    
    @scala.inline
    def setRoleAssignments(value: NullableOption[js.Array[DeviceAndAppManagementRoleAssignment]]): Self = StObject.set(x, "roleAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleAssignmentsNull: Self = StObject.set(x, "roleAssignments", null)
    
    @scala.inline
    def setRoleAssignmentsUndefined: Self = StObject.set(x, "roleAssignments", js.undefined)
    
    @scala.inline
    def setRoleAssignmentsVarargs(value: DeviceAndAppManagementRoleAssignment*): Self = StObject.set(x, "roleAssignments", js.Array(value :_*))
    
    @scala.inline
    def setRoleDefinitions(value: NullableOption[js.Array[RoleDefinition]]): Self = StObject.set(x, "roleDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleDefinitionsNull: Self = StObject.set(x, "roleDefinitions", null)
    
    @scala.inline
    def setRoleDefinitionsUndefined: Self = StObject.set(x, "roleDefinitions", js.undefined)
    
    @scala.inline
    def setRoleDefinitionsVarargs(value: RoleDefinition*): Self = StObject.set(x, "roleDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: NullableOption[DeviceManagementSettings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsNull: Self = StObject.set(x, "settings", null)
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setSoftwareUpdateStatusSummary(value: NullableOption[SoftwareUpdateStatusSummary]): Self = StObject.set(x, "softwareUpdateStatusSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareUpdateStatusSummaryNull: Self = StObject.set(x, "softwareUpdateStatusSummary", null)
    
    @scala.inline
    def setSoftwareUpdateStatusSummaryUndefined: Self = StObject.set(x, "softwareUpdateStatusSummary", js.undefined)
    
    @scala.inline
    def setSubscriptionState(value: DeviceManagementSubscriptionState): Self = StObject.set(x, "subscriptionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionStateUndefined: Self = StObject.set(x, "subscriptionState", js.undefined)
    
    @scala.inline
    def setTelecomExpenseManagementPartners(value: NullableOption[js.Array[TelecomExpenseManagementPartner]]): Self = StObject.set(x, "telecomExpenseManagementPartners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelecomExpenseManagementPartnersNull: Self = StObject.set(x, "telecomExpenseManagementPartners", null)
    
    @scala.inline
    def setTelecomExpenseManagementPartnersUndefined: Self = StObject.set(x, "telecomExpenseManagementPartners", js.undefined)
    
    @scala.inline
    def setTelecomExpenseManagementPartnersVarargs(value: TelecomExpenseManagementPartner*): Self = StObject.set(x, "telecomExpenseManagementPartners", js.Array(value :_*))
    
    @scala.inline
    def setTermsAndConditions(value: NullableOption[js.Array[TermsAndConditions]]): Self = StObject.set(x, "termsAndConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsAndConditionsNull: Self = StObject.set(x, "termsAndConditions", null)
    
    @scala.inline
    def setTermsAndConditionsUndefined: Self = StObject.set(x, "termsAndConditions", js.undefined)
    
    @scala.inline
    def setTermsAndConditionsVarargs(value: TermsAndConditions*): Self = StObject.set(x, "termsAndConditions", js.Array(value :_*))
    
    @scala.inline
    def setTroubleshootingEvents(value: NullableOption[js.Array[DeviceManagementTroubleshootingEvent]]): Self = StObject.set(x, "troubleshootingEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTroubleshootingEventsNull: Self = StObject.set(x, "troubleshootingEvents", null)
    
    @scala.inline
    def setTroubleshootingEventsUndefined: Self = StObject.set(x, "troubleshootingEvents", js.undefined)
    
    @scala.inline
    def setTroubleshootingEventsVarargs(value: DeviceManagementTroubleshootingEvent*): Self = StObject.set(x, "troubleshootingEvents", js.Array(value :_*))
    
    @scala.inline
    def setWindowsInformationProtectionAppLearningSummaries(value: NullableOption[js.Array[WindowsInformationProtectionAppLearningSummary]]): Self = StObject.set(x, "windowsInformationProtectionAppLearningSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsInformationProtectionAppLearningSummariesNull: Self = StObject.set(x, "windowsInformationProtectionAppLearningSummaries", null)
    
    @scala.inline
    def setWindowsInformationProtectionAppLearningSummariesUndefined: Self = StObject.set(x, "windowsInformationProtectionAppLearningSummaries", js.undefined)
    
    @scala.inline
    def setWindowsInformationProtectionAppLearningSummariesVarargs(value: WindowsInformationProtectionAppLearningSummary*): Self = StObject.set(x, "windowsInformationProtectionAppLearningSummaries", js.Array(value :_*))
    
    @scala.inline
    def setWindowsInformationProtectionNetworkLearningSummaries(value: NullableOption[js.Array[WindowsInformationProtectionNetworkLearningSummary]]): Self = StObject.set(x, "windowsInformationProtectionNetworkLearningSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsInformationProtectionNetworkLearningSummariesNull: Self = StObject.set(x, "windowsInformationProtectionNetworkLearningSummaries", null)
    
    @scala.inline
    def setWindowsInformationProtectionNetworkLearningSummariesUndefined: Self = StObject.set(x, "windowsInformationProtectionNetworkLearningSummaries", js.undefined)
    
    @scala.inline
    def setWindowsInformationProtectionNetworkLearningSummariesVarargs(value: WindowsInformationProtectionNetworkLearningSummary*): Self = StObject.set(x, "windowsInformationProtectionNetworkLearningSummaries", js.Array(value :_*))
  }
}

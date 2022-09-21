package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceManagement
  extends StObject
     with Entity {
  
  // Apple push notification certificate.
  var applePushNotificationCertificate: js.UndefOr[NullableOption[ApplePushNotificationCertificate]] = js.undefined
  
  // The list of Compliance Management Partners configured by the tenant.
  var complianceManagementPartners: js.UndefOr[NullableOption[js.Array[ComplianceManagementPartner]]] = js.undefined
  
  /**
    * The Exchange on premises conditional access settings. On premises conditional access will require devices to be both
    * enrolled and compliant for mail access
    */
  var conditionalAccessSettings: js.UndefOr[NullableOption[OnPremisesConditionalAccessSettings]] = js.undefined
  
  // The list of detected apps associated with a device.
  var detectedApps: js.UndefOr[NullableOption[js.Array[DetectedApp]]] = js.undefined
  
  // The list of device categories with the tenant.
  var deviceCategories: js.UndefOr[NullableOption[js.Array[DeviceCategory]]] = js.undefined
  
  // The device compliance policies.
  var deviceCompliancePolicies: js.UndefOr[NullableOption[js.Array[DeviceCompliancePolicy]]] = js.undefined
  
  // The device compliance state summary for this account.
  var deviceCompliancePolicyDeviceStateSummary: js.UndefOr[NullableOption[DeviceCompliancePolicyDeviceStateSummary]] = js.undefined
  
  // The summary states of compliance policy settings for this account.
  var deviceCompliancePolicySettingStateSummaries: js.UndefOr[NullableOption[js.Array[DeviceCompliancePolicySettingStateSummary]]] = js.undefined
  
  // The device configuration device state summary for this account.
  var deviceConfigurationDeviceStateSummaries: js.UndefOr[NullableOption[DeviceConfigurationDeviceStateSummary]] = js.undefined
  
  // The device configurations.
  var deviceConfigurations: js.UndefOr[NullableOption[js.Array[DeviceConfiguration]]] = js.undefined
  
  // The list of device enrollment configurations
  var deviceEnrollmentConfigurations: js.UndefOr[NullableOption[js.Array[DeviceEnrollmentConfiguration]]] = js.undefined
  
  // The list of Device Management Partners configured by the tenant.
  var deviceManagementPartners: js.UndefOr[NullableOption[js.Array[DeviceManagementPartner]]] = js.undefined
  
  // The list of Exchange Connectors configured by the tenant.
  var exchangeConnectors: js.UndefOr[NullableOption[js.Array[DeviceManagementExchangeConnector]]] = js.undefined
  
  // Collection of imported Windows autopilot devices.
  var importedWindowsAutopilotDeviceIdentities: js.UndefOr[NullableOption[js.Array[ImportedWindowsAutopilotDeviceIdentity]]] = js.undefined
  
  // Intune Account Id for given tenant
  var intuneAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the
    * end user web portal.
    */
  var intuneBrand: js.UndefOr[NullableOption[IntuneBrand]] = js.undefined
  
  // The IOS software update installation statuses for this account.
  var iosUpdateStatuses: js.UndefOr[NullableOption[js.Array[IosUpdateDeviceStatus]]] = js.undefined
  
  // Device overview
  var managedDeviceOverview: js.UndefOr[NullableOption[ManagedDeviceOverview]] = js.undefined
  
  // The list of managed devices.
  var managedDevices: js.UndefOr[NullableOption[js.Array[ManagedDevice]]] = js.undefined
  
  // The list of Mobile threat Defense connectors configured by the tenant.
  var mobileThreatDefenseConnectors: js.UndefOr[NullableOption[js.Array[MobileThreatDefenseConnector]]] = js.undefined
  
  // The Notification Message Templates.
  var notificationMessageTemplates: js.UndefOr[NullableOption[js.Array[NotificationMessageTemplate]]] = js.undefined
  
  // The remote assist partners.
  var remoteAssistancePartners: js.UndefOr[NullableOption[js.Array[RemoteAssistancePartner]]] = js.undefined
  
  // Reports singleton
  var reports: js.UndefOr[NullableOption[DeviceManagementReports]] = js.undefined
  
  // The Resource Operations.
  var resourceOperations: js.UndefOr[NullableOption[js.Array[ResourceOperation]]] = js.undefined
  
  // The Role Assignments.
  var roleAssignments: js.UndefOr[NullableOption[js.Array[DeviceAndAppManagementRoleAssignment]]] = js.undefined
  
  // The Role Definitions.
  var roleDefinitions: js.UndefOr[NullableOption[js.Array[RoleDefinition]]] = js.undefined
  
  // Account level settings.
  var settings: js.UndefOr[NullableOption[DeviceManagementSettings]] = js.undefined
  
  // The software update status summary.
  var softwareUpdateStatusSummary: js.UndefOr[NullableOption[SoftwareUpdateStatusSummary]] = js.undefined
  
  /**
    * Tenant mobile device management subscription state. Possible values are: pending, active, warning, disabled, deleted,
    * blocked, lockedOut.
    */
  var subscriptionState: js.UndefOr[DeviceManagementSubscriptionState] = js.undefined
  
  // The telecom expense management partners.
  var telecomExpenseManagementPartners: js.UndefOr[NullableOption[js.Array[TelecomExpenseManagementPartner]]] = js.undefined
  
  // The terms and conditions associated with device management of the company.
  var termsAndConditions: js.UndefOr[NullableOption[js.Array[TermsAndConditions]]] = js.undefined
  
  // The list of troubleshooting events for the tenant.
  var troubleshootingEvents: js.UndefOr[NullableOption[js.Array[DeviceManagementTroubleshootingEvent]]] = js.undefined
  
  // The Windows autopilot device identities contained collection.
  var windowsAutopilotDeviceIdentities: js.UndefOr[NullableOption[js.Array[WindowsAutopilotDeviceIdentity]]] = js.undefined
  
  // The windows information protection app learning summaries.
  var windowsInformationProtectionAppLearningSummaries: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionAppLearningSummary]]] = js.undefined
  
  // The windows information protection network learning summaries.
  var windowsInformationProtectionNetworkLearningSummaries: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionNetworkLearningSummary]]] = js.undefined
}
object DeviceManagement {
  
  inline def apply(): DeviceManagement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagement]
  }
  
  extension [Self <: DeviceManagement](x: Self) {
    
    inline def setApplePushNotificationCertificate(value: NullableOption[ApplePushNotificationCertificate]): Self = StObject.set(x, "applePushNotificationCertificate", value.asInstanceOf[js.Any])
    
    inline def setApplePushNotificationCertificateNull: Self = StObject.set(x, "applePushNotificationCertificate", null)
    
    inline def setApplePushNotificationCertificateUndefined: Self = StObject.set(x, "applePushNotificationCertificate", js.undefined)
    
    inline def setComplianceManagementPartners(value: NullableOption[js.Array[ComplianceManagementPartner]]): Self = StObject.set(x, "complianceManagementPartners", value.asInstanceOf[js.Any])
    
    inline def setComplianceManagementPartnersNull: Self = StObject.set(x, "complianceManagementPartners", null)
    
    inline def setComplianceManagementPartnersUndefined: Self = StObject.set(x, "complianceManagementPartners", js.undefined)
    
    inline def setComplianceManagementPartnersVarargs(value: ComplianceManagementPartner*): Self = StObject.set(x, "complianceManagementPartners", js.Array(value*))
    
    inline def setConditionalAccessSettings(value: NullableOption[OnPremisesConditionalAccessSettings]): Self = StObject.set(x, "conditionalAccessSettings", value.asInstanceOf[js.Any])
    
    inline def setConditionalAccessSettingsNull: Self = StObject.set(x, "conditionalAccessSettings", null)
    
    inline def setConditionalAccessSettingsUndefined: Self = StObject.set(x, "conditionalAccessSettings", js.undefined)
    
    inline def setDetectedApps(value: NullableOption[js.Array[DetectedApp]]): Self = StObject.set(x, "detectedApps", value.asInstanceOf[js.Any])
    
    inline def setDetectedAppsNull: Self = StObject.set(x, "detectedApps", null)
    
    inline def setDetectedAppsUndefined: Self = StObject.set(x, "detectedApps", js.undefined)
    
    inline def setDetectedAppsVarargs(value: DetectedApp*): Self = StObject.set(x, "detectedApps", js.Array(value*))
    
    inline def setDeviceCategories(value: NullableOption[js.Array[DeviceCategory]]): Self = StObject.set(x, "deviceCategories", value.asInstanceOf[js.Any])
    
    inline def setDeviceCategoriesNull: Self = StObject.set(x, "deviceCategories", null)
    
    inline def setDeviceCategoriesUndefined: Self = StObject.set(x, "deviceCategories", js.undefined)
    
    inline def setDeviceCategoriesVarargs(value: DeviceCategory*): Self = StObject.set(x, "deviceCategories", js.Array(value*))
    
    inline def setDeviceCompliancePolicies(value: NullableOption[js.Array[DeviceCompliancePolicy]]): Self = StObject.set(x, "deviceCompliancePolicies", value.asInstanceOf[js.Any])
    
    inline def setDeviceCompliancePoliciesNull: Self = StObject.set(x, "deviceCompliancePolicies", null)
    
    inline def setDeviceCompliancePoliciesUndefined: Self = StObject.set(x, "deviceCompliancePolicies", js.undefined)
    
    inline def setDeviceCompliancePoliciesVarargs(value: DeviceCompliancePolicy*): Self = StObject.set(x, "deviceCompliancePolicies", js.Array(value*))
    
    inline def setDeviceCompliancePolicyDeviceStateSummary(value: NullableOption[DeviceCompliancePolicyDeviceStateSummary]): Self = StObject.set(x, "deviceCompliancePolicyDeviceStateSummary", value.asInstanceOf[js.Any])
    
    inline def setDeviceCompliancePolicyDeviceStateSummaryNull: Self = StObject.set(x, "deviceCompliancePolicyDeviceStateSummary", null)
    
    inline def setDeviceCompliancePolicyDeviceStateSummaryUndefined: Self = StObject.set(x, "deviceCompliancePolicyDeviceStateSummary", js.undefined)
    
    inline def setDeviceCompliancePolicySettingStateSummaries(value: NullableOption[js.Array[DeviceCompliancePolicySettingStateSummary]]): Self = StObject.set(x, "deviceCompliancePolicySettingStateSummaries", value.asInstanceOf[js.Any])
    
    inline def setDeviceCompliancePolicySettingStateSummariesNull: Self = StObject.set(x, "deviceCompliancePolicySettingStateSummaries", null)
    
    inline def setDeviceCompliancePolicySettingStateSummariesUndefined: Self = StObject.set(x, "deviceCompliancePolicySettingStateSummaries", js.undefined)
    
    inline def setDeviceCompliancePolicySettingStateSummariesVarargs(value: DeviceCompliancePolicySettingStateSummary*): Self = StObject.set(x, "deviceCompliancePolicySettingStateSummaries", js.Array(value*))
    
    inline def setDeviceConfigurationDeviceStateSummaries(value: NullableOption[DeviceConfigurationDeviceStateSummary]): Self = StObject.set(x, "deviceConfigurationDeviceStateSummaries", value.asInstanceOf[js.Any])
    
    inline def setDeviceConfigurationDeviceStateSummariesNull: Self = StObject.set(x, "deviceConfigurationDeviceStateSummaries", null)
    
    inline def setDeviceConfigurationDeviceStateSummariesUndefined: Self = StObject.set(x, "deviceConfigurationDeviceStateSummaries", js.undefined)
    
    inline def setDeviceConfigurations(value: NullableOption[js.Array[DeviceConfiguration]]): Self = StObject.set(x, "deviceConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDeviceConfigurationsNull: Self = StObject.set(x, "deviceConfigurations", null)
    
    inline def setDeviceConfigurationsUndefined: Self = StObject.set(x, "deviceConfigurations", js.undefined)
    
    inline def setDeviceConfigurationsVarargs(value: DeviceConfiguration*): Self = StObject.set(x, "deviceConfigurations", js.Array(value*))
    
    inline def setDeviceEnrollmentConfigurations(value: NullableOption[js.Array[DeviceEnrollmentConfiguration]]): Self = StObject.set(x, "deviceEnrollmentConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDeviceEnrollmentConfigurationsNull: Self = StObject.set(x, "deviceEnrollmentConfigurations", null)
    
    inline def setDeviceEnrollmentConfigurationsUndefined: Self = StObject.set(x, "deviceEnrollmentConfigurations", js.undefined)
    
    inline def setDeviceEnrollmentConfigurationsVarargs(value: DeviceEnrollmentConfiguration*): Self = StObject.set(x, "deviceEnrollmentConfigurations", js.Array(value*))
    
    inline def setDeviceManagementPartners(value: NullableOption[js.Array[DeviceManagementPartner]]): Self = StObject.set(x, "deviceManagementPartners", value.asInstanceOf[js.Any])
    
    inline def setDeviceManagementPartnersNull: Self = StObject.set(x, "deviceManagementPartners", null)
    
    inline def setDeviceManagementPartnersUndefined: Self = StObject.set(x, "deviceManagementPartners", js.undefined)
    
    inline def setDeviceManagementPartnersVarargs(value: DeviceManagementPartner*): Self = StObject.set(x, "deviceManagementPartners", js.Array(value*))
    
    inline def setExchangeConnectors(value: NullableOption[js.Array[DeviceManagementExchangeConnector]]): Self = StObject.set(x, "exchangeConnectors", value.asInstanceOf[js.Any])
    
    inline def setExchangeConnectorsNull: Self = StObject.set(x, "exchangeConnectors", null)
    
    inline def setExchangeConnectorsUndefined: Self = StObject.set(x, "exchangeConnectors", js.undefined)
    
    inline def setExchangeConnectorsVarargs(value: DeviceManagementExchangeConnector*): Self = StObject.set(x, "exchangeConnectors", js.Array(value*))
    
    inline def setImportedWindowsAutopilotDeviceIdentities(value: NullableOption[js.Array[ImportedWindowsAutopilotDeviceIdentity]]): Self = StObject.set(x, "importedWindowsAutopilotDeviceIdentities", value.asInstanceOf[js.Any])
    
    inline def setImportedWindowsAutopilotDeviceIdentitiesNull: Self = StObject.set(x, "importedWindowsAutopilotDeviceIdentities", null)
    
    inline def setImportedWindowsAutopilotDeviceIdentitiesUndefined: Self = StObject.set(x, "importedWindowsAutopilotDeviceIdentities", js.undefined)
    
    inline def setImportedWindowsAutopilotDeviceIdentitiesVarargs(value: ImportedWindowsAutopilotDeviceIdentity*): Self = StObject.set(x, "importedWindowsAutopilotDeviceIdentities", js.Array(value*))
    
    inline def setIntuneAccountId(value: String): Self = StObject.set(x, "intuneAccountId", value.asInstanceOf[js.Any])
    
    inline def setIntuneAccountIdUndefined: Self = StObject.set(x, "intuneAccountId", js.undefined)
    
    inline def setIntuneBrand(value: NullableOption[IntuneBrand]): Self = StObject.set(x, "intuneBrand", value.asInstanceOf[js.Any])
    
    inline def setIntuneBrandNull: Self = StObject.set(x, "intuneBrand", null)
    
    inline def setIntuneBrandUndefined: Self = StObject.set(x, "intuneBrand", js.undefined)
    
    inline def setIosUpdateStatuses(value: NullableOption[js.Array[IosUpdateDeviceStatus]]): Self = StObject.set(x, "iosUpdateStatuses", value.asInstanceOf[js.Any])
    
    inline def setIosUpdateStatusesNull: Self = StObject.set(x, "iosUpdateStatuses", null)
    
    inline def setIosUpdateStatusesUndefined: Self = StObject.set(x, "iosUpdateStatuses", js.undefined)
    
    inline def setIosUpdateStatusesVarargs(value: IosUpdateDeviceStatus*): Self = StObject.set(x, "iosUpdateStatuses", js.Array(value*))
    
    inline def setManagedDeviceOverview(value: NullableOption[ManagedDeviceOverview]): Self = StObject.set(x, "managedDeviceOverview", value.asInstanceOf[js.Any])
    
    inline def setManagedDeviceOverviewNull: Self = StObject.set(x, "managedDeviceOverview", null)
    
    inline def setManagedDeviceOverviewUndefined: Self = StObject.set(x, "managedDeviceOverview", js.undefined)
    
    inline def setManagedDevices(value: NullableOption[js.Array[ManagedDevice]]): Self = StObject.set(x, "managedDevices", value.asInstanceOf[js.Any])
    
    inline def setManagedDevicesNull: Self = StObject.set(x, "managedDevices", null)
    
    inline def setManagedDevicesUndefined: Self = StObject.set(x, "managedDevices", js.undefined)
    
    inline def setManagedDevicesVarargs(value: ManagedDevice*): Self = StObject.set(x, "managedDevices", js.Array(value*))
    
    inline def setMobileThreatDefenseConnectors(value: NullableOption[js.Array[MobileThreatDefenseConnector]]): Self = StObject.set(x, "mobileThreatDefenseConnectors", value.asInstanceOf[js.Any])
    
    inline def setMobileThreatDefenseConnectorsNull: Self = StObject.set(x, "mobileThreatDefenseConnectors", null)
    
    inline def setMobileThreatDefenseConnectorsUndefined: Self = StObject.set(x, "mobileThreatDefenseConnectors", js.undefined)
    
    inline def setMobileThreatDefenseConnectorsVarargs(value: MobileThreatDefenseConnector*): Self = StObject.set(x, "mobileThreatDefenseConnectors", js.Array(value*))
    
    inline def setNotificationMessageTemplates(value: NullableOption[js.Array[NotificationMessageTemplate]]): Self = StObject.set(x, "notificationMessageTemplates", value.asInstanceOf[js.Any])
    
    inline def setNotificationMessageTemplatesNull: Self = StObject.set(x, "notificationMessageTemplates", null)
    
    inline def setNotificationMessageTemplatesUndefined: Self = StObject.set(x, "notificationMessageTemplates", js.undefined)
    
    inline def setNotificationMessageTemplatesVarargs(value: NotificationMessageTemplate*): Self = StObject.set(x, "notificationMessageTemplates", js.Array(value*))
    
    inline def setRemoteAssistancePartners(value: NullableOption[js.Array[RemoteAssistancePartner]]): Self = StObject.set(x, "remoteAssistancePartners", value.asInstanceOf[js.Any])
    
    inline def setRemoteAssistancePartnersNull: Self = StObject.set(x, "remoteAssistancePartners", null)
    
    inline def setRemoteAssistancePartnersUndefined: Self = StObject.set(x, "remoteAssistancePartners", js.undefined)
    
    inline def setRemoteAssistancePartnersVarargs(value: RemoteAssistancePartner*): Self = StObject.set(x, "remoteAssistancePartners", js.Array(value*))
    
    inline def setReports(value: NullableOption[DeviceManagementReports]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setReportsNull: Self = StObject.set(x, "reports", null)
    
    inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    inline def setResourceOperations(value: NullableOption[js.Array[ResourceOperation]]): Self = StObject.set(x, "resourceOperations", value.asInstanceOf[js.Any])
    
    inline def setResourceOperationsNull: Self = StObject.set(x, "resourceOperations", null)
    
    inline def setResourceOperationsUndefined: Self = StObject.set(x, "resourceOperations", js.undefined)
    
    inline def setResourceOperationsVarargs(value: ResourceOperation*): Self = StObject.set(x, "resourceOperations", js.Array(value*))
    
    inline def setRoleAssignments(value: NullableOption[js.Array[DeviceAndAppManagementRoleAssignment]]): Self = StObject.set(x, "roleAssignments", value.asInstanceOf[js.Any])
    
    inline def setRoleAssignmentsNull: Self = StObject.set(x, "roleAssignments", null)
    
    inline def setRoleAssignmentsUndefined: Self = StObject.set(x, "roleAssignments", js.undefined)
    
    inline def setRoleAssignmentsVarargs(value: DeviceAndAppManagementRoleAssignment*): Self = StObject.set(x, "roleAssignments", js.Array(value*))
    
    inline def setRoleDefinitions(value: NullableOption[js.Array[RoleDefinition]]): Self = StObject.set(x, "roleDefinitions", value.asInstanceOf[js.Any])
    
    inline def setRoleDefinitionsNull: Self = StObject.set(x, "roleDefinitions", null)
    
    inline def setRoleDefinitionsUndefined: Self = StObject.set(x, "roleDefinitions", js.undefined)
    
    inline def setRoleDefinitionsVarargs(value: RoleDefinition*): Self = StObject.set(x, "roleDefinitions", js.Array(value*))
    
    inline def setSettings(value: NullableOption[DeviceManagementSettings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsNull: Self = StObject.set(x, "settings", null)
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSoftwareUpdateStatusSummary(value: NullableOption[SoftwareUpdateStatusSummary]): Self = StObject.set(x, "softwareUpdateStatusSummary", value.asInstanceOf[js.Any])
    
    inline def setSoftwareUpdateStatusSummaryNull: Self = StObject.set(x, "softwareUpdateStatusSummary", null)
    
    inline def setSoftwareUpdateStatusSummaryUndefined: Self = StObject.set(x, "softwareUpdateStatusSummary", js.undefined)
    
    inline def setSubscriptionState(value: DeviceManagementSubscriptionState): Self = StObject.set(x, "subscriptionState", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionStateUndefined: Self = StObject.set(x, "subscriptionState", js.undefined)
    
    inline def setTelecomExpenseManagementPartners(value: NullableOption[js.Array[TelecomExpenseManagementPartner]]): Self = StObject.set(x, "telecomExpenseManagementPartners", value.asInstanceOf[js.Any])
    
    inline def setTelecomExpenseManagementPartnersNull: Self = StObject.set(x, "telecomExpenseManagementPartners", null)
    
    inline def setTelecomExpenseManagementPartnersUndefined: Self = StObject.set(x, "telecomExpenseManagementPartners", js.undefined)
    
    inline def setTelecomExpenseManagementPartnersVarargs(value: TelecomExpenseManagementPartner*): Self = StObject.set(x, "telecomExpenseManagementPartners", js.Array(value*))
    
    inline def setTermsAndConditions(value: NullableOption[js.Array[TermsAndConditions]]): Self = StObject.set(x, "termsAndConditions", value.asInstanceOf[js.Any])
    
    inline def setTermsAndConditionsNull: Self = StObject.set(x, "termsAndConditions", null)
    
    inline def setTermsAndConditionsUndefined: Self = StObject.set(x, "termsAndConditions", js.undefined)
    
    inline def setTermsAndConditionsVarargs(value: TermsAndConditions*): Self = StObject.set(x, "termsAndConditions", js.Array(value*))
    
    inline def setTroubleshootingEvents(value: NullableOption[js.Array[DeviceManagementTroubleshootingEvent]]): Self = StObject.set(x, "troubleshootingEvents", value.asInstanceOf[js.Any])
    
    inline def setTroubleshootingEventsNull: Self = StObject.set(x, "troubleshootingEvents", null)
    
    inline def setTroubleshootingEventsUndefined: Self = StObject.set(x, "troubleshootingEvents", js.undefined)
    
    inline def setTroubleshootingEventsVarargs(value: DeviceManagementTroubleshootingEvent*): Self = StObject.set(x, "troubleshootingEvents", js.Array(value*))
    
    inline def setWindowsAutopilotDeviceIdentities(value: NullableOption[js.Array[WindowsAutopilotDeviceIdentity]]): Self = StObject.set(x, "windowsAutopilotDeviceIdentities", value.asInstanceOf[js.Any])
    
    inline def setWindowsAutopilotDeviceIdentitiesNull: Self = StObject.set(x, "windowsAutopilotDeviceIdentities", null)
    
    inline def setWindowsAutopilotDeviceIdentitiesUndefined: Self = StObject.set(x, "windowsAutopilotDeviceIdentities", js.undefined)
    
    inline def setWindowsAutopilotDeviceIdentitiesVarargs(value: WindowsAutopilotDeviceIdentity*): Self = StObject.set(x, "windowsAutopilotDeviceIdentities", js.Array(value*))
    
    inline def setWindowsInformationProtectionAppLearningSummaries(value: NullableOption[js.Array[WindowsInformationProtectionAppLearningSummary]]): Self = StObject.set(x, "windowsInformationProtectionAppLearningSummaries", value.asInstanceOf[js.Any])
    
    inline def setWindowsInformationProtectionAppLearningSummariesNull: Self = StObject.set(x, "windowsInformationProtectionAppLearningSummaries", null)
    
    inline def setWindowsInformationProtectionAppLearningSummariesUndefined: Self = StObject.set(x, "windowsInformationProtectionAppLearningSummaries", js.undefined)
    
    inline def setWindowsInformationProtectionAppLearningSummariesVarargs(value: WindowsInformationProtectionAppLearningSummary*): Self = StObject.set(x, "windowsInformationProtectionAppLearningSummaries", js.Array(value*))
    
    inline def setWindowsInformationProtectionNetworkLearningSummaries(value: NullableOption[js.Array[WindowsInformationProtectionNetworkLearningSummary]]): Self = StObject.set(x, "windowsInformationProtectionNetworkLearningSummaries", value.asInstanceOf[js.Any])
    
    inline def setWindowsInformationProtectionNetworkLearningSummariesNull: Self = StObject.set(x, "windowsInformationProtectionNetworkLearningSummaries", null)
    
    inline def setWindowsInformationProtectionNetworkLearningSummariesUndefined: Self = StObject.set(x, "windowsInformationProtectionNetworkLearningSummaries", js.undefined)
    
    inline def setWindowsInformationProtectionNetworkLearningSummariesVarargs(value: WindowsInformationProtectionNetworkLearningSummary*): Self = StObject.set(x, "windowsInformationProtectionNetworkLearningSummaries", js.Array(value*))
  }
}

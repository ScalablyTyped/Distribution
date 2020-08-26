package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceManagement extends Entity {
  // Apple push notification certificate.
  var applePushNotificationCertificate: js.UndefOr[ApplePushNotificationCertificate] = js.native
  // The list of Compliance Management Partners configured by the tenant.
  var complianceManagementPartners: js.UndefOr[js.Array[ComplianceManagementPartner]] = js.native
  /**
    * The Exchange on premises conditional access settings. On premises conditional access will require devices to be both
    * enrolled and compliant for mail access
    */
  var conditionalAccessSettings: js.UndefOr[OnPremisesConditionalAccessSettings] = js.native
  // The list of detected apps associated with a device.
  var detectedApps: js.UndefOr[js.Array[DetectedApp]] = js.native
  // The list of device categories with the tenant.
  var deviceCategories: js.UndefOr[js.Array[DeviceCategory]] = js.native
  // The device compliance policies.
  var deviceCompliancePolicies: js.UndefOr[js.Array[DeviceCompliancePolicy]] = js.native
  // The device compliance state summary for this account.
  var deviceCompliancePolicyDeviceStateSummary: js.UndefOr[DeviceCompliancePolicyDeviceStateSummary] = js.native
  // The summary states of compliance policy settings for this account.
  var deviceCompliancePolicySettingStateSummaries: js.UndefOr[js.Array[DeviceCompliancePolicySettingStateSummary]] = js.native
  // The device configuration device state summary for this account.
  var deviceConfigurationDeviceStateSummaries: js.UndefOr[DeviceConfigurationDeviceStateSummary] = js.native
  // The device configurations.
  var deviceConfigurations: js.UndefOr[js.Array[DeviceConfiguration]] = js.native
  // The list of device enrollment configurations
  var deviceEnrollmentConfigurations: js.UndefOr[js.Array[DeviceEnrollmentConfiguration]] = js.native
  // The list of Device Management Partners configured by the tenant.
  var deviceManagementPartners: js.UndefOr[js.Array[DeviceManagementPartner]] = js.native
  // The list of Exchange Connectors configured by the tenant.
  var exchangeConnectors: js.UndefOr[js.Array[DeviceManagementExchangeConnector]] = js.native
  // Intune Account Id for given tenant
  var intuneAccountId: js.UndefOr[String] = js.native
  /**
    * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the
    * end user web portal.
    */
  var intuneBrand: js.UndefOr[IntuneBrand] = js.native
  // The IOS software update installation statuses for this account.
  var iosUpdateStatuses: js.UndefOr[js.Array[IosUpdateDeviceStatus]] = js.native
  // Device overview
  var managedDeviceOverview: js.UndefOr[ManagedDeviceOverview] = js.native
  // The list of managed devices.
  var managedDevices: js.UndefOr[js.Array[ManagedDevice]] = js.native
  // The list of Mobile threat Defense connectors configured by the tenant.
  var mobileThreatDefenseConnectors: js.UndefOr[js.Array[MobileThreatDefenseConnector]] = js.native
  // The Notification Message Templates.
  var notificationMessageTemplates: js.UndefOr[js.Array[NotificationMessageTemplate]] = js.native
  // The remote assist partners.
  var remoteAssistancePartners: js.UndefOr[js.Array[RemoteAssistancePartner]] = js.native
  // The Resource Operations.
  var resourceOperations: js.UndefOr[js.Array[ResourceOperation]] = js.native
  // The Role Assignments.
  var roleAssignments: js.UndefOr[js.Array[DeviceAndAppManagementRoleAssignment]] = js.native
  // The Role Definitions.
  var roleDefinitions: js.UndefOr[js.Array[RoleDefinition]] = js.native
  // Account level settings.
  var settings: js.UndefOr[DeviceManagementSettings] = js.native
  // The software update status summary.
  var softwareUpdateStatusSummary: js.UndefOr[SoftwareUpdateStatusSummary] = js.native
  /**
    * Tenant mobile device management subscription state. The possible values are: pending, active, warning, disabled,
    * deleted, blocked, lockedOut.
    */
  var subscriptionState: js.UndefOr[DeviceManagementSubscriptionState] = js.native
  // The telecom expense management partners.
  var telecomExpenseManagementPartners: js.UndefOr[js.Array[TelecomExpenseManagementPartner]] = js.native
  // The terms and conditions associated with device management of the company.
  var termsAndConditions: js.UndefOr[js.Array[TermsAndConditions]] = js.native
  // The list of troubleshooting events for the tenant.
  var troubleshootingEvents: js.UndefOr[js.Array[DeviceManagementTroubleshootingEvent]] = js.native
  // The windows information protection app learning summaries.
  var windowsInformationProtectionAppLearningSummaries: js.UndefOr[js.Array[WindowsInformationProtectionAppLearningSummary]] = js.native
  // The windows information protection network learning summaries.
  var windowsInformationProtectionNetworkLearningSummaries: js.UndefOr[js.Array[WindowsInformationProtectionNetworkLearningSummary]] = js.native
}

object DeviceManagement {
  @scala.inline
  def apply(): DeviceManagement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagement]
  }
  @scala.inline
  implicit class DeviceManagementOps[Self <: DeviceManagement] (val x: Self) extends AnyVal {
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
    def setApplePushNotificationCertificate(value: ApplePushNotificationCertificate): Self = this.set("applePushNotificationCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplePushNotificationCertificate: Self = this.set("applePushNotificationCertificate", js.undefined)
    @scala.inline
    def setComplianceManagementPartnersVarargs(value: ComplianceManagementPartner*): Self = this.set("complianceManagementPartners", js.Array(value :_*))
    @scala.inline
    def setComplianceManagementPartners(value: js.Array[ComplianceManagementPartner]): Self = this.set("complianceManagementPartners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceManagementPartners: Self = this.set("complianceManagementPartners", js.undefined)
    @scala.inline
    def setConditionalAccessSettings(value: OnPremisesConditionalAccessSettings): Self = this.set("conditionalAccessSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionalAccessSettings: Self = this.set("conditionalAccessSettings", js.undefined)
    @scala.inline
    def setDetectedAppsVarargs(value: DetectedApp*): Self = this.set("detectedApps", js.Array(value :_*))
    @scala.inline
    def setDetectedApps(value: js.Array[DetectedApp]): Self = this.set("detectedApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectedApps: Self = this.set("detectedApps", js.undefined)
    @scala.inline
    def setDeviceCategoriesVarargs(value: DeviceCategory*): Self = this.set("deviceCategories", js.Array(value :_*))
    @scala.inline
    def setDeviceCategories(value: js.Array[DeviceCategory]): Self = this.set("deviceCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceCategories: Self = this.set("deviceCategories", js.undefined)
    @scala.inline
    def setDeviceCompliancePoliciesVarargs(value: DeviceCompliancePolicy*): Self = this.set("deviceCompliancePolicies", js.Array(value :_*))
    @scala.inline
    def setDeviceCompliancePolicies(value: js.Array[DeviceCompliancePolicy]): Self = this.set("deviceCompliancePolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceCompliancePolicies: Self = this.set("deviceCompliancePolicies", js.undefined)
    @scala.inline
    def setDeviceCompliancePolicyDeviceStateSummary(value: DeviceCompliancePolicyDeviceStateSummary): Self = this.set("deviceCompliancePolicyDeviceStateSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceCompliancePolicyDeviceStateSummary: Self = this.set("deviceCompliancePolicyDeviceStateSummary", js.undefined)
    @scala.inline
    def setDeviceCompliancePolicySettingStateSummariesVarargs(value: DeviceCompliancePolicySettingStateSummary*): Self = this.set("deviceCompliancePolicySettingStateSummaries", js.Array(value :_*))
    @scala.inline
    def setDeviceCompliancePolicySettingStateSummaries(value: js.Array[DeviceCompliancePolicySettingStateSummary]): Self = this.set("deviceCompliancePolicySettingStateSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceCompliancePolicySettingStateSummaries: Self = this.set("deviceCompliancePolicySettingStateSummaries", js.undefined)
    @scala.inline
    def setDeviceConfigurationDeviceStateSummaries(value: DeviceConfigurationDeviceStateSummary): Self = this.set("deviceConfigurationDeviceStateSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceConfigurationDeviceStateSummaries: Self = this.set("deviceConfigurationDeviceStateSummaries", js.undefined)
    @scala.inline
    def setDeviceConfigurationsVarargs(value: DeviceConfiguration*): Self = this.set("deviceConfigurations", js.Array(value :_*))
    @scala.inline
    def setDeviceConfigurations(value: js.Array[DeviceConfiguration]): Self = this.set("deviceConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceConfigurations: Self = this.set("deviceConfigurations", js.undefined)
    @scala.inline
    def setDeviceEnrollmentConfigurationsVarargs(value: DeviceEnrollmentConfiguration*): Self = this.set("deviceEnrollmentConfigurations", js.Array(value :_*))
    @scala.inline
    def setDeviceEnrollmentConfigurations(value: js.Array[DeviceEnrollmentConfiguration]): Self = this.set("deviceEnrollmentConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceEnrollmentConfigurations: Self = this.set("deviceEnrollmentConfigurations", js.undefined)
    @scala.inline
    def setDeviceManagementPartnersVarargs(value: DeviceManagementPartner*): Self = this.set("deviceManagementPartners", js.Array(value :_*))
    @scala.inline
    def setDeviceManagementPartners(value: js.Array[DeviceManagementPartner]): Self = this.set("deviceManagementPartners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceManagementPartners: Self = this.set("deviceManagementPartners", js.undefined)
    @scala.inline
    def setExchangeConnectorsVarargs(value: DeviceManagementExchangeConnector*): Self = this.set("exchangeConnectors", js.Array(value :_*))
    @scala.inline
    def setExchangeConnectors(value: js.Array[DeviceManagementExchangeConnector]): Self = this.set("exchangeConnectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExchangeConnectors: Self = this.set("exchangeConnectors", js.undefined)
    @scala.inline
    def setIntuneAccountId(value: String): Self = this.set("intuneAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntuneAccountId: Self = this.set("intuneAccountId", js.undefined)
    @scala.inline
    def setIntuneBrand(value: IntuneBrand): Self = this.set("intuneBrand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntuneBrand: Self = this.set("intuneBrand", js.undefined)
    @scala.inline
    def setIosUpdateStatusesVarargs(value: IosUpdateDeviceStatus*): Self = this.set("iosUpdateStatuses", js.Array(value :_*))
    @scala.inline
    def setIosUpdateStatuses(value: js.Array[IosUpdateDeviceStatus]): Self = this.set("iosUpdateStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosUpdateStatuses: Self = this.set("iosUpdateStatuses", js.undefined)
    @scala.inline
    def setManagedDeviceOverview(value: ManagedDeviceOverview): Self = this.set("managedDeviceOverview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedDeviceOverview: Self = this.set("managedDeviceOverview", js.undefined)
    @scala.inline
    def setManagedDevicesVarargs(value: ManagedDevice*): Self = this.set("managedDevices", js.Array(value :_*))
    @scala.inline
    def setManagedDevices(value: js.Array[ManagedDevice]): Self = this.set("managedDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedDevices: Self = this.set("managedDevices", js.undefined)
    @scala.inline
    def setMobileThreatDefenseConnectorsVarargs(value: MobileThreatDefenseConnector*): Self = this.set("mobileThreatDefenseConnectors", js.Array(value :_*))
    @scala.inline
    def setMobileThreatDefenseConnectors(value: js.Array[MobileThreatDefenseConnector]): Self = this.set("mobileThreatDefenseConnectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileThreatDefenseConnectors: Self = this.set("mobileThreatDefenseConnectors", js.undefined)
    @scala.inline
    def setNotificationMessageTemplatesVarargs(value: NotificationMessageTemplate*): Self = this.set("notificationMessageTemplates", js.Array(value :_*))
    @scala.inline
    def setNotificationMessageTemplates(value: js.Array[NotificationMessageTemplate]): Self = this.set("notificationMessageTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationMessageTemplates: Self = this.set("notificationMessageTemplates", js.undefined)
    @scala.inline
    def setRemoteAssistancePartnersVarargs(value: RemoteAssistancePartner*): Self = this.set("remoteAssistancePartners", js.Array(value :_*))
    @scala.inline
    def setRemoteAssistancePartners(value: js.Array[RemoteAssistancePartner]): Self = this.set("remoteAssistancePartners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteAssistancePartners: Self = this.set("remoteAssistancePartners", js.undefined)
    @scala.inline
    def setResourceOperationsVarargs(value: ResourceOperation*): Self = this.set("resourceOperations", js.Array(value :_*))
    @scala.inline
    def setResourceOperations(value: js.Array[ResourceOperation]): Self = this.set("resourceOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceOperations: Self = this.set("resourceOperations", js.undefined)
    @scala.inline
    def setRoleAssignmentsVarargs(value: DeviceAndAppManagementRoleAssignment*): Self = this.set("roleAssignments", js.Array(value :_*))
    @scala.inline
    def setRoleAssignments(value: js.Array[DeviceAndAppManagementRoleAssignment]): Self = this.set("roleAssignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleAssignments: Self = this.set("roleAssignments", js.undefined)
    @scala.inline
    def setRoleDefinitionsVarargs(value: RoleDefinition*): Self = this.set("roleDefinitions", js.Array(value :_*))
    @scala.inline
    def setRoleDefinitions(value: js.Array[RoleDefinition]): Self = this.set("roleDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleDefinitions: Self = this.set("roleDefinitions", js.undefined)
    @scala.inline
    def setSettings(value: DeviceManagementSettings): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    @scala.inline
    def setSoftwareUpdateStatusSummary(value: SoftwareUpdateStatusSummary): Self = this.set("softwareUpdateStatusSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoftwareUpdateStatusSummary: Self = this.set("softwareUpdateStatusSummary", js.undefined)
    @scala.inline
    def setSubscriptionState(value: DeviceManagementSubscriptionState): Self = this.set("subscriptionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptionState: Self = this.set("subscriptionState", js.undefined)
    @scala.inline
    def setTelecomExpenseManagementPartnersVarargs(value: TelecomExpenseManagementPartner*): Self = this.set("telecomExpenseManagementPartners", js.Array(value :_*))
    @scala.inline
    def setTelecomExpenseManagementPartners(value: js.Array[TelecomExpenseManagementPartner]): Self = this.set("telecomExpenseManagementPartners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTelecomExpenseManagementPartners: Self = this.set("telecomExpenseManagementPartners", js.undefined)
    @scala.inline
    def setTermsAndConditionsVarargs(value: TermsAndConditions*): Self = this.set("termsAndConditions", js.Array(value :_*))
    @scala.inline
    def setTermsAndConditions(value: js.Array[TermsAndConditions]): Self = this.set("termsAndConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTermsAndConditions: Self = this.set("termsAndConditions", js.undefined)
    @scala.inline
    def setTroubleshootingEventsVarargs(value: DeviceManagementTroubleshootingEvent*): Self = this.set("troubleshootingEvents", js.Array(value :_*))
    @scala.inline
    def setTroubleshootingEvents(value: js.Array[DeviceManagementTroubleshootingEvent]): Self = this.set("troubleshootingEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTroubleshootingEvents: Self = this.set("troubleshootingEvents", js.undefined)
    @scala.inline
    def setWindowsInformationProtectionAppLearningSummariesVarargs(value: WindowsInformationProtectionAppLearningSummary*): Self = this.set("windowsInformationProtectionAppLearningSummaries", js.Array(value :_*))
    @scala.inline
    def setWindowsInformationProtectionAppLearningSummaries(value: js.Array[WindowsInformationProtectionAppLearningSummary]): Self = this.set("windowsInformationProtectionAppLearningSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowsInformationProtectionAppLearningSummaries: Self = this.set("windowsInformationProtectionAppLearningSummaries", js.undefined)
    @scala.inline
    def setWindowsInformationProtectionNetworkLearningSummariesVarargs(value: WindowsInformationProtectionNetworkLearningSummary*): Self = this.set("windowsInformationProtectionNetworkLearningSummaries", js.Array(value :_*))
    @scala.inline
    def setWindowsInformationProtectionNetworkLearningSummaries(value: js.Array[WindowsInformationProtectionNetworkLearningSummary]): Self = this.set("windowsInformationProtectionNetworkLearningSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowsInformationProtectionNetworkLearningSummaries: Self = this.set("windowsInformationProtectionNetworkLearningSummaries", js.undefined)
  }
  
}


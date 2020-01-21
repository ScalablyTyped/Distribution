package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceManagement extends Entity {
  // Apple push notification certificate.
  var applePushNotificationCertificate: js.UndefOr[ApplePushNotificationCertificate] = js.undefined
  /**
    * The Exchange on premises conditional access settings. On premises conditional access will require devices to be both
    * enrolled and compliant for mail access
    */
  var conditionalAccessSettings: js.UndefOr[OnPremisesConditionalAccessSettings] = js.undefined
  // The list of detected apps associated with a device.
  var detectedApps: js.UndefOr[js.Array[DetectedApp]] = js.undefined
  // The list of device categories with the tenant.
  var deviceCategories: js.UndefOr[js.Array[DeviceCategory]] = js.undefined
  // The device compliance policies.
  var deviceCompliancePolicies: js.UndefOr[js.Array[DeviceCompliancePolicy]] = js.undefined
  // The device compliance state summary for this account.
  var deviceCompliancePolicyDeviceStateSummary: js.UndefOr[DeviceCompliancePolicyDeviceStateSummary] = js.undefined
  // The summary states of compliance policy settings for this account.
  var deviceCompliancePolicySettingStateSummaries: js.UndefOr[js.Array[DeviceCompliancePolicySettingStateSummary]] = js.undefined
  // The device configuration device state summary for this account.
  var deviceConfigurationDeviceStateSummaries: js.UndefOr[DeviceConfigurationDeviceStateSummary] = js.undefined
  // The device configurations.
  var deviceConfigurations: js.UndefOr[js.Array[DeviceConfiguration]] = js.undefined
  // The list of device enrollment configurations
  var deviceEnrollmentConfigurations: js.UndefOr[js.Array[DeviceEnrollmentConfiguration]] = js.undefined
  // The list of Device Management Partners configured by the tenant.
  var deviceManagementPartners: js.UndefOr[js.Array[DeviceManagementPartner]] = js.undefined
  // The list of Exchange Connectors configured by the tenant.
  var exchangeConnectors: js.UndefOr[js.Array[DeviceManagementExchangeConnector]] = js.undefined
  /**
    * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the
    * end user web portal.
    */
  var intuneBrand: js.UndefOr[IntuneBrand] = js.undefined
  // The IOS software update installation statuses for this account.
  var iosUpdateStatuses: js.UndefOr[js.Array[IosUpdateDeviceStatus]] = js.undefined
  // Device overview
  var managedDeviceOverview: js.UndefOr[ManagedDeviceOverview] = js.undefined
  // The list of managed devices.
  var managedDevices: js.UndefOr[js.Array[ManagedDevice]] = js.undefined
  // The list of Mobile threat Defense connectors configured by the tenant.
  var mobileThreatDefenseConnectors: js.UndefOr[js.Array[MobileThreatDefenseConnector]] = js.undefined
  // The Notification Message Templates.
  var notificationMessageTemplates: js.UndefOr[js.Array[NotificationMessageTemplate]] = js.undefined
  // The remote assist partners.
  var remoteAssistancePartners: js.UndefOr[js.Array[RemoteAssistancePartner]] = js.undefined
  // The Resource Operations.
  var resourceOperations: js.UndefOr[js.Array[ResourceOperation]] = js.undefined
  // The Role Assignments.
  var roleAssignments: js.UndefOr[js.Array[DeviceAndAppManagementRoleAssignment]] = js.undefined
  // The Role Definitions.
  var roleDefinitions: js.UndefOr[js.Array[RoleDefinition]] = js.undefined
  // Account level settings.
  var settings: js.UndefOr[DeviceManagementSettings] = js.undefined
  // The software update status summary.
  var softwareUpdateStatusSummary: js.UndefOr[SoftwareUpdateStatusSummary] = js.undefined
  /**
    * Tenant mobile device management subscription state. The possible values are: pending, active, warning, disabled,
    * deleted, blocked, lockedOut.
    */
  var subscriptionState: js.UndefOr[DeviceManagementSubscriptionState] = js.undefined
  // The telecom expense management partners.
  var telecomExpenseManagementPartners: js.UndefOr[js.Array[TelecomExpenseManagementPartner]] = js.undefined
  // The terms and conditions associated with device management of the company.
  var termsAndConditions: js.UndefOr[js.Array[TermsAndConditions]] = js.undefined
  // The list of troubleshooting events for the tenant.
  var troubleshootingEvents: js.UndefOr[js.Array[DeviceManagementTroubleshootingEvent]] = js.undefined
  // The windows information protection app learning summaries.
  var windowsInformationProtectionAppLearningSummaries: js.UndefOr[js.Array[WindowsInformationProtectionAppLearningSummary]] = js.undefined
  // The windows information protection network learning summaries.
  var windowsInformationProtectionNetworkLearningSummaries: js.UndefOr[js.Array[WindowsInformationProtectionNetworkLearningSummary]] = js.undefined
}

object DeviceManagement {
  @scala.inline
  def apply(
    applePushNotificationCertificate: ApplePushNotificationCertificate = null,
    conditionalAccessSettings: OnPremisesConditionalAccessSettings = null,
    detectedApps: js.Array[DetectedApp] = null,
    deviceCategories: js.Array[DeviceCategory] = null,
    deviceCompliancePolicies: js.Array[DeviceCompliancePolicy] = null,
    deviceCompliancePolicyDeviceStateSummary: DeviceCompliancePolicyDeviceStateSummary = null,
    deviceCompliancePolicySettingStateSummaries: js.Array[DeviceCompliancePolicySettingStateSummary] = null,
    deviceConfigurationDeviceStateSummaries: DeviceConfigurationDeviceStateSummary = null,
    deviceConfigurations: js.Array[DeviceConfiguration] = null,
    deviceEnrollmentConfigurations: js.Array[DeviceEnrollmentConfiguration] = null,
    deviceManagementPartners: js.Array[DeviceManagementPartner] = null,
    exchangeConnectors: js.Array[DeviceManagementExchangeConnector] = null,
    id: String = null,
    intuneBrand: IntuneBrand = null,
    iosUpdateStatuses: js.Array[IosUpdateDeviceStatus] = null,
    managedDeviceOverview: ManagedDeviceOverview = null,
    managedDevices: js.Array[ManagedDevice] = null,
    mobileThreatDefenseConnectors: js.Array[MobileThreatDefenseConnector] = null,
    notificationMessageTemplates: js.Array[NotificationMessageTemplate] = null,
    remoteAssistancePartners: js.Array[RemoteAssistancePartner] = null,
    resourceOperations: js.Array[ResourceOperation] = null,
    roleAssignments: js.Array[DeviceAndAppManagementRoleAssignment] = null,
    roleDefinitions: js.Array[RoleDefinition] = null,
    settings: DeviceManagementSettings = null,
    softwareUpdateStatusSummary: SoftwareUpdateStatusSummary = null,
    subscriptionState: DeviceManagementSubscriptionState = null,
    telecomExpenseManagementPartners: js.Array[TelecomExpenseManagementPartner] = null,
    termsAndConditions: js.Array[TermsAndConditions] = null,
    troubleshootingEvents: js.Array[DeviceManagementTroubleshootingEvent] = null,
    windowsInformationProtectionAppLearningSummaries: js.Array[WindowsInformationProtectionAppLearningSummary] = null,
    windowsInformationProtectionNetworkLearningSummaries: js.Array[WindowsInformationProtectionNetworkLearningSummary] = null
  ): DeviceManagement = {
    val __obj = js.Dynamic.literal()
    if (applePushNotificationCertificate != null) __obj.updateDynamic("applePushNotificationCertificate")(applePushNotificationCertificate.asInstanceOf[js.Any])
    if (conditionalAccessSettings != null) __obj.updateDynamic("conditionalAccessSettings")(conditionalAccessSettings.asInstanceOf[js.Any])
    if (detectedApps != null) __obj.updateDynamic("detectedApps")(detectedApps.asInstanceOf[js.Any])
    if (deviceCategories != null) __obj.updateDynamic("deviceCategories")(deviceCategories.asInstanceOf[js.Any])
    if (deviceCompliancePolicies != null) __obj.updateDynamic("deviceCompliancePolicies")(deviceCompliancePolicies.asInstanceOf[js.Any])
    if (deviceCompliancePolicyDeviceStateSummary != null) __obj.updateDynamic("deviceCompliancePolicyDeviceStateSummary")(deviceCompliancePolicyDeviceStateSummary.asInstanceOf[js.Any])
    if (deviceCompliancePolicySettingStateSummaries != null) __obj.updateDynamic("deviceCompliancePolicySettingStateSummaries")(deviceCompliancePolicySettingStateSummaries.asInstanceOf[js.Any])
    if (deviceConfigurationDeviceStateSummaries != null) __obj.updateDynamic("deviceConfigurationDeviceStateSummaries")(deviceConfigurationDeviceStateSummaries.asInstanceOf[js.Any])
    if (deviceConfigurations != null) __obj.updateDynamic("deviceConfigurations")(deviceConfigurations.asInstanceOf[js.Any])
    if (deviceEnrollmentConfigurations != null) __obj.updateDynamic("deviceEnrollmentConfigurations")(deviceEnrollmentConfigurations.asInstanceOf[js.Any])
    if (deviceManagementPartners != null) __obj.updateDynamic("deviceManagementPartners")(deviceManagementPartners.asInstanceOf[js.Any])
    if (exchangeConnectors != null) __obj.updateDynamic("exchangeConnectors")(exchangeConnectors.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (intuneBrand != null) __obj.updateDynamic("intuneBrand")(intuneBrand.asInstanceOf[js.Any])
    if (iosUpdateStatuses != null) __obj.updateDynamic("iosUpdateStatuses")(iosUpdateStatuses.asInstanceOf[js.Any])
    if (managedDeviceOverview != null) __obj.updateDynamic("managedDeviceOverview")(managedDeviceOverview.asInstanceOf[js.Any])
    if (managedDevices != null) __obj.updateDynamic("managedDevices")(managedDevices.asInstanceOf[js.Any])
    if (mobileThreatDefenseConnectors != null) __obj.updateDynamic("mobileThreatDefenseConnectors")(mobileThreatDefenseConnectors.asInstanceOf[js.Any])
    if (notificationMessageTemplates != null) __obj.updateDynamic("notificationMessageTemplates")(notificationMessageTemplates.asInstanceOf[js.Any])
    if (remoteAssistancePartners != null) __obj.updateDynamic("remoteAssistancePartners")(remoteAssistancePartners.asInstanceOf[js.Any])
    if (resourceOperations != null) __obj.updateDynamic("resourceOperations")(resourceOperations.asInstanceOf[js.Any])
    if (roleAssignments != null) __obj.updateDynamic("roleAssignments")(roleAssignments.asInstanceOf[js.Any])
    if (roleDefinitions != null) __obj.updateDynamic("roleDefinitions")(roleDefinitions.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (softwareUpdateStatusSummary != null) __obj.updateDynamic("softwareUpdateStatusSummary")(softwareUpdateStatusSummary.asInstanceOf[js.Any])
    if (subscriptionState != null) __obj.updateDynamic("subscriptionState")(subscriptionState.asInstanceOf[js.Any])
    if (telecomExpenseManagementPartners != null) __obj.updateDynamic("telecomExpenseManagementPartners")(telecomExpenseManagementPartners.asInstanceOf[js.Any])
    if (termsAndConditions != null) __obj.updateDynamic("termsAndConditions")(termsAndConditions.asInstanceOf[js.Any])
    if (troubleshootingEvents != null) __obj.updateDynamic("troubleshootingEvents")(troubleshootingEvents.asInstanceOf[js.Any])
    if (windowsInformationProtectionAppLearningSummaries != null) __obj.updateDynamic("windowsInformationProtectionAppLearningSummaries")(windowsInformationProtectionAppLearningSummaries.asInstanceOf[js.Any])
    if (windowsInformationProtectionNetworkLearningSummaries != null) __obj.updateDynamic("windowsInformationProtectionNetworkLearningSummaries")(windowsInformationProtectionNetworkLearningSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceManagement]
  }
}


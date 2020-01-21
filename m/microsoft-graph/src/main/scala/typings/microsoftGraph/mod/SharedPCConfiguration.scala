package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedPCConfiguration extends DeviceConfiguration {
  // Specifies how accounts are managed on a shared PC. Only applies when disableAccountManager is false.
  var accountManagerPolicy: js.UndefOr[SharedPCAccountManagerPolicy] = js.undefined
  // Specifies whether local storage is allowed on a shared PC.
  var allowLocalStorage: js.UndefOr[Boolean] = js.undefined
  // Indicates which type of accounts are allowed to use on a shared PC. Possible values are: guest, domain.
  var allowedAccounts: js.UndefOr[SharedPCAllowedAccountType] = js.undefined
  // Disables the account manager for shared PC mode.
  var disableAccountManager: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether the default shared PC education environment policies should be disabled. For Windows 10 RS2 and
    * later, this policy will be applied without setting Enabled to true.
    */
  var disableEduPolicies: js.UndefOr[Boolean] = js.undefined
  // Specifies whether the default shared PC power policies should be disabled.
  var disablePowerPolicies: js.UndefOr[Boolean] = js.undefined
  // Disables the requirement to sign in whenever the device wakes up from sleep mode.
  var disableSignInOnResume: js.UndefOr[Boolean] = js.undefined
  // Enables shared PC mode and applies the shared pc policies.
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the time in seconds that a device must sit idle before the PC goes to sleep. Setting this value to 0 prevents
    * the sleep timeout from occurring.
    */
  var idleTimeBeforeSleepInSeconds: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the display text for the account shown on the sign-in screen which launches the app specified by
    * SetKioskAppUserModelId. Only applies when KioskAppUserModelId is set.
    */
  var kioskAppDisplayName: js.UndefOr[String] = js.undefined
  // Specifies the application user model ID of the app to use with assigned access.
  var kioskAppUserModelId: js.UndefOr[String] = js.undefined
  // Specifies the daily start time of maintenance hour.
  var maintenanceStartTime: js.UndefOr[String] = js.undefined
}

object SharedPCConfiguration {
  @scala.inline
  def apply(
    accountManagerPolicy: SharedPCAccountManagerPolicy = null,
    allowLocalStorage: js.UndefOr[Boolean] = js.undefined,
    allowedAccounts: SharedPCAllowedAccountType = null,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    createdDateTime: String = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    disableAccountManager: js.UndefOr[Boolean] = js.undefined,
    disableEduPolicies: js.UndefOr[Boolean] = js.undefined,
    disablePowerPolicies: js.UndefOr[Boolean] = js.undefined,
    disableSignInOnResume: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    idleTimeBeforeSleepInSeconds: Int | Double = null,
    kioskAppDisplayName: String = null,
    kioskAppUserModelId: String = null,
    lastModifiedDateTime: String = null,
    maintenanceStartTime: String = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: Int | Double = null
  ): SharedPCConfiguration = {
    val __obj = js.Dynamic.literal()
    if (accountManagerPolicy != null) __obj.updateDynamic("accountManagerPolicy")(accountManagerPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(allowLocalStorage)) __obj.updateDynamic("allowLocalStorage")(allowLocalStorage.asInstanceOf[js.Any])
    if (allowedAccounts != null) __obj.updateDynamic("allowedAccounts")(allowedAccounts.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAccountManager)) __obj.updateDynamic("disableAccountManager")(disableAccountManager.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEduPolicies)) __obj.updateDynamic("disableEduPolicies")(disableEduPolicies.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePowerPolicies)) __obj.updateDynamic("disablePowerPolicies")(disablePowerPolicies.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSignInOnResume)) __obj.updateDynamic("disableSignInOnResume")(disableSignInOnResume.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idleTimeBeforeSleepInSeconds != null) __obj.updateDynamic("idleTimeBeforeSleepInSeconds")(idleTimeBeforeSleepInSeconds.asInstanceOf[js.Any])
    if (kioskAppDisplayName != null) __obj.updateDynamic("kioskAppDisplayName")(kioskAppDisplayName.asInstanceOf[js.Any])
    if (kioskAppUserModelId != null) __obj.updateDynamic("kioskAppUserModelId")(kioskAppUserModelId.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (maintenanceStartTime != null) __obj.updateDynamic("maintenanceStartTime")(maintenanceStartTime.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedPCConfiguration]
  }
}


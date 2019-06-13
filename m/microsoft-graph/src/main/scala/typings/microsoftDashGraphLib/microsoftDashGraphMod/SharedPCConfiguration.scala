package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedPCConfiguration extends DeviceConfiguration {
  /** Specifies how accounts are managed on a shared PC. Only applies when disableAccountManager is false. */
  var accountManagerPolicy: js.UndefOr[SharedPCAccountManagerPolicy] = js.undefined
  /** Specifies whether local storage is allowed on a shared PC. */
  var allowLocalStorage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates which type of accounts are allowed to use on a shared PC. Possible values are: guest, domain. */
  var allowedAccounts: js.UndefOr[SharedPCAllowedAccountType] = js.undefined
  /** Disables the account manager for shared PC mode. */
  var disableAccountManager: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether the default shared PC education environment policies should be disabled. For Windows 10 RS2 and later, this policy will be applied without setting Enabled to true. */
  var disableEduPolicies: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether the default shared PC power policies should be disabled. */
  var disablePowerPolicies: js.UndefOr[scala.Boolean] = js.undefined
  /** Disables the requirement to sign in whenever the device wakes up from sleep mode. */
  var disableSignInOnResume: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables shared PC mode and applies the shared pc policies. */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the time in seconds that a device must sit idle before the PC goes to sleep. Setting this value to 0 prevents the sleep timeout from occurring. */
  var idleTimeBeforeSleepInSeconds: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the display text for the account shown on the sign-in screen which launches the app specified by SetKioskAppUserModelId. Only applies when KioskAppUserModelId is set. */
  var kioskAppDisplayName: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the application user model ID of the app to use with assigned access. */
  var kioskAppUserModelId: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the daily start time of maintenance hour. */
  var maintenanceStartTime: js.UndefOr[java.lang.String] = js.undefined
}

object SharedPCConfiguration {
  @scala.inline
  def apply(
    accountManagerPolicy: SharedPCAccountManagerPolicy = null,
    allowLocalStorage: js.UndefOr[scala.Boolean] = js.undefined,
    allowedAccounts: SharedPCAllowedAccountType = null,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    disableAccountManager: js.UndefOr[scala.Boolean] = js.undefined,
    disableEduPolicies: js.UndefOr[scala.Boolean] = js.undefined,
    disablePowerPolicies: js.UndefOr[scala.Boolean] = js.undefined,
    disableSignInOnResume: js.UndefOr[scala.Boolean] = js.undefined,
    displayName: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    idleTimeBeforeSleepInSeconds: scala.Int | scala.Double = null,
    kioskAppDisplayName: java.lang.String = null,
    kioskAppUserModelId: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    maintenanceStartTime: java.lang.String = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: scala.Int | scala.Double = null
  ): SharedPCConfiguration = {
    val __obj = js.Dynamic.literal()
    if (accountManagerPolicy != null) __obj.updateDynamic("accountManagerPolicy")(accountManagerPolicy)
    if (!js.isUndefined(allowLocalStorage)) __obj.updateDynamic("allowLocalStorage")(allowLocalStorage)
    if (allowedAccounts != null) __obj.updateDynamic("allowedAccounts")(allowedAccounts)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (!js.isUndefined(disableAccountManager)) __obj.updateDynamic("disableAccountManager")(disableAccountManager)
    if (!js.isUndefined(disableEduPolicies)) __obj.updateDynamic("disableEduPolicies")(disableEduPolicies)
    if (!js.isUndefined(disablePowerPolicies)) __obj.updateDynamic("disablePowerPolicies")(disablePowerPolicies)
    if (!js.isUndefined(disableSignInOnResume)) __obj.updateDynamic("disableSignInOnResume")(disableSignInOnResume)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idleTimeBeforeSleepInSeconds != null) __obj.updateDynamic("idleTimeBeforeSleepInSeconds")(idleTimeBeforeSleepInSeconds.asInstanceOf[js.Any])
    if (kioskAppDisplayName != null) __obj.updateDynamic("kioskAppDisplayName")(kioskAppDisplayName)
    if (kioskAppUserModelId != null) __obj.updateDynamic("kioskAppUserModelId")(kioskAppUserModelId)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (maintenanceStartTime != null) __obj.updateDynamic("maintenanceStartTime")(maintenanceStartTime)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedPCConfiguration]
  }
}


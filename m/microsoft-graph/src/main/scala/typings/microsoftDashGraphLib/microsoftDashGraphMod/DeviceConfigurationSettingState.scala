package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConfigurationSettingState extends js.Object {
  /** Current value of setting on device */
  var currentValue: js.UndefOr[java.lang.String] = js.undefined
  /** Error code for the setting */
  var errorCode: js.UndefOr[scala.Double] = js.undefined
  /** Error description */
  var errorDescription: js.UndefOr[java.lang.String] = js.undefined
  /** Name of setting instance that is being reported. */
  var instanceDisplayName: js.UndefOr[java.lang.String] = js.undefined
  /** The setting that is being reported */
  var setting: js.UndefOr[java.lang.String] = js.undefined
  /** Localized/user friendly setting name that is being reported */
  var settingName: js.UndefOr[java.lang.String] = js.undefined
  /** Contributing policies */
  var sources: js.UndefOr[js.Array[SettingSource]] = js.undefined
  /** The compliance state of the setting. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant, error, conflict, notAssigned. */
  var state: js.UndefOr[ComplianceStatus] = js.undefined
  /** UserEmail */
  var userEmail: js.UndefOr[java.lang.String] = js.undefined
  /** UserId */
  var userId: js.UndefOr[java.lang.String] = js.undefined
  /** UserName */
  var userName: js.UndefOr[java.lang.String] = js.undefined
  /** UserPrincipalName. */
  var userPrincipalName: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceConfigurationSettingState {
  @scala.inline
  def apply(
    currentValue: java.lang.String = null,
    errorCode: scala.Int | scala.Double = null,
    errorDescription: java.lang.String = null,
    instanceDisplayName: java.lang.String = null,
    setting: java.lang.String = null,
    settingName: java.lang.String = null,
    sources: js.Array[SettingSource] = null,
    state: ComplianceStatus = null,
    userEmail: java.lang.String = null,
    userId: java.lang.String = null,
    userName: java.lang.String = null,
    userPrincipalName: java.lang.String = null
  ): DeviceConfigurationSettingState = {
    val __obj = js.Dynamic.literal()
    if (currentValue != null) __obj.updateDynamic("currentValue")(currentValue)
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorDescription != null) __obj.updateDynamic("errorDescription")(errorDescription)
    if (instanceDisplayName != null) __obj.updateDynamic("instanceDisplayName")(instanceDisplayName)
    if (setting != null) __obj.updateDynamic("setting")(setting)
    if (settingName != null) __obj.updateDynamic("settingName")(settingName)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    if (state != null) __obj.updateDynamic("state")(state)
    if (userEmail != null) __obj.updateDynamic("userEmail")(userEmail)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    if (userName != null) __obj.updateDynamic("userName")(userName)
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName)
    __obj.asInstanceOf[DeviceConfigurationSettingState]
  }
}


package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConfigurationSettingState extends js.Object {
  // Current value of setting on device
  var currentValue: js.UndefOr[String] = js.undefined
  // Error code for the setting
  var errorCode: js.UndefOr[Double] = js.undefined
  // Error description
  var errorDescription: js.UndefOr[String] = js.undefined
  // Name of setting instance that is being reported.
  var instanceDisplayName: js.UndefOr[String] = js.undefined
  // The setting that is being reported
  var setting: js.UndefOr[String] = js.undefined
  // Localized/user friendly setting name that is being reported
  var settingName: js.UndefOr[String] = js.undefined
  // Contributing policies
  var sources: js.UndefOr[js.Array[SettingSource]] = js.undefined
  /**
    * The compliance state of the setting. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant,
    * error, conflict, notAssigned.
    */
  var state: js.UndefOr[ComplianceStatus] = js.undefined
  // UserEmail
  var userEmail: js.UndefOr[String] = js.undefined
  // UserId
  var userId: js.UndefOr[String] = js.undefined
  // UserName
  var userName: js.UndefOr[String] = js.undefined
  // UserPrincipalName.
  var userPrincipalName: js.UndefOr[String] = js.undefined
}

object DeviceConfigurationSettingState {
  @scala.inline
  def apply(
    currentValue: String = null,
    errorCode: Int | Double = null,
    errorDescription: String = null,
    instanceDisplayName: String = null,
    setting: String = null,
    settingName: String = null,
    sources: js.Array[SettingSource] = null,
    state: ComplianceStatus = null,
    userEmail: String = null,
    userId: String = null,
    userName: String = null,
    userPrincipalName: String = null
  ): DeviceConfigurationSettingState = {
    val __obj = js.Dynamic.literal()
    if (currentValue != null) __obj.updateDynamic("currentValue")(currentValue.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorDescription != null) __obj.updateDynamic("errorDescription")(errorDescription.asInstanceOf[js.Any])
    if (instanceDisplayName != null) __obj.updateDynamic("instanceDisplayName")(instanceDisplayName.asInstanceOf[js.Any])
    if (setting != null) __obj.updateDynamic("setting")(setting.asInstanceOf[js.Any])
    if (settingName != null) __obj.updateDynamic("settingName")(settingName.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (userEmail != null) __obj.updateDynamic("userEmail")(userEmail.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfigurationSettingState]
  }
}


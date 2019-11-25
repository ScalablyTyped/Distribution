package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceComplianceSettingState extends Entity {
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.undefined
  // The Device Id that is being reported
  var deviceId: js.UndefOr[String] = js.undefined
  // The device model that is being reported
  var deviceModel: js.UndefOr[String] = js.undefined
  // The Device Name that is being reported
  var deviceName: js.UndefOr[String] = js.undefined
  // The setting class name and property name.
  var setting: js.UndefOr[String] = js.undefined
  // The Setting Name that is being reported
  var settingName: js.UndefOr[String] = js.undefined
  /**
    * The compliance state of the setting. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant,
    * error, conflict, notAssigned.
    */
  var state: js.UndefOr[ComplianceStatus] = js.undefined
  // The User email address that is being reported
  var userEmail: js.UndefOr[String] = js.undefined
  // The user Id that is being reported
  var userId: js.UndefOr[String] = js.undefined
  // The User Name that is being reported
  var userName: js.UndefOr[String] = js.undefined
  // The User PrincipalName that is being reported
  var userPrincipalName: js.UndefOr[String] = js.undefined
}

object DeviceComplianceSettingState {
  @scala.inline
  def apply(
    complianceGracePeriodExpirationDateTime: String = null,
    deviceId: String = null,
    deviceModel: String = null,
    deviceName: String = null,
    id: String = null,
    setting: String = null,
    settingName: String = null,
    state: ComplianceStatus = null,
    userEmail: String = null,
    userId: String = null,
    userName: String = null,
    userPrincipalName: String = null
  ): DeviceComplianceSettingState = {
    val __obj = js.Dynamic.literal()
    if (complianceGracePeriodExpirationDateTime != null) __obj.updateDynamic("complianceGracePeriodExpirationDateTime")(complianceGracePeriodExpirationDateTime.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceModel != null) __obj.updateDynamic("deviceModel")(deviceModel.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (setting != null) __obj.updateDynamic("setting")(setting.asInstanceOf[js.Any])
    if (settingName != null) __obj.updateDynamic("settingName")(settingName.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (userEmail != null) __obj.updateDynamic("userEmail")(userEmail.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceComplianceSettingState]
  }
}


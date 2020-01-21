package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConfigurationDeviceStatus extends Entity {
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.undefined
  // Device name of the DevicePolicyStatus.
  var deviceDisplayName: js.UndefOr[String] = js.undefined
  // The device model that is being reported
  var deviceModel: js.UndefOr[String] = js.undefined
  // Last modified date time of the policy report.
  var lastReportedDateTime: js.UndefOr[String] = js.undefined
  /**
    * Compliance status of the policy report. Possible values are: unknown, notApplicable, compliant, remediated,
    * nonCompliant, error, conflict, notAssigned.
    */
  var status: js.UndefOr[ComplianceStatus] = js.undefined
  // The User Name that is being reported
  var userName: js.UndefOr[String] = js.undefined
  // UserPrincipalName.
  var userPrincipalName: js.UndefOr[String] = js.undefined
}

object DeviceConfigurationDeviceStatus {
  @scala.inline
  def apply(
    complianceGracePeriodExpirationDateTime: String = null,
    deviceDisplayName: String = null,
    deviceModel: String = null,
    id: String = null,
    lastReportedDateTime: String = null,
    status: ComplianceStatus = null,
    userName: String = null,
    userPrincipalName: String = null
  ): DeviceConfigurationDeviceStatus = {
    val __obj = js.Dynamic.literal()
    if (complianceGracePeriodExpirationDateTime != null) __obj.updateDynamic("complianceGracePeriodExpirationDateTime")(complianceGracePeriodExpirationDateTime.asInstanceOf[js.Any])
    if (deviceDisplayName != null) __obj.updateDynamic("deviceDisplayName")(deviceDisplayName.asInstanceOf[js.Any])
    if (deviceModel != null) __obj.updateDynamic("deviceModel")(deviceModel.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastReportedDateTime != null) __obj.updateDynamic("lastReportedDateTime")(lastReportedDateTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfigurationDeviceStatus]
  }
}


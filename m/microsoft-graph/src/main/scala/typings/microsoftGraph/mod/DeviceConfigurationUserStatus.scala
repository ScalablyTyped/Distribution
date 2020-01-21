package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConfigurationUserStatus extends Entity {
  // Devices count for that user.
  var devicesCount: js.UndefOr[Double] = js.undefined
  // Last modified date time of the policy report.
  var lastReportedDateTime: js.UndefOr[String] = js.undefined
  /**
    * Compliance status of the policy report. Possible values are: unknown, notApplicable, compliant, remediated,
    * nonCompliant, error, conflict, notAssigned.
    */
  var status: js.UndefOr[ComplianceStatus] = js.undefined
  // User name of the DevicePolicyStatus.
  var userDisplayName: js.UndefOr[String] = js.undefined
  // UserPrincipalName.
  var userPrincipalName: js.UndefOr[String] = js.undefined
}

object DeviceConfigurationUserStatus {
  @scala.inline
  def apply(
    devicesCount: Int | Double = null,
    id: String = null,
    lastReportedDateTime: String = null,
    status: ComplianceStatus = null,
    userDisplayName: String = null,
    userPrincipalName: String = null
  ): DeviceConfigurationUserStatus = {
    val __obj = js.Dynamic.literal()
    if (devicesCount != null) __obj.updateDynamic("devicesCount")(devicesCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastReportedDateTime != null) __obj.updateDynamic("lastReportedDateTime")(lastReportedDateTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (userDisplayName != null) __obj.updateDynamic("userDisplayName")(userDisplayName.asInstanceOf[js.Any])
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfigurationUserStatus]
  }
}


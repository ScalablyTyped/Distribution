package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceComplianceUserStatus extends Entity {
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

object DeviceComplianceUserStatus {
  @scala.inline
  def apply(
    devicesCount: Int | Double = null,
    id: String = null,
    lastReportedDateTime: String = null,
    status: ComplianceStatus = null,
    userDisplayName: String = null,
    userPrincipalName: String = null
  ): DeviceComplianceUserStatus = {
    val __obj = js.Dynamic.literal()
    if (devicesCount != null) __obj.updateDynamic("devicesCount")(devicesCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastReportedDateTime != null) __obj.updateDynamic("lastReportedDateTime")(lastReportedDateTime)
    if (status != null) __obj.updateDynamic("status")(status)
    if (userDisplayName != null) __obj.updateDynamic("userDisplayName")(userDisplayName)
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName)
    __obj.asInstanceOf[DeviceComplianceUserStatus]
  }
}


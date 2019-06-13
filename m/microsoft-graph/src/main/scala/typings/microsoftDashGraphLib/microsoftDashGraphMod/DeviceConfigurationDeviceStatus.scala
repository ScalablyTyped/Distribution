package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConfigurationDeviceStatus extends Entity {
  /** The DateTime when device compliance grace period expires */
  var complianceGracePeriodExpirationDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Device name of the DevicePolicyStatus. */
  var deviceDisplayName: js.UndefOr[java.lang.String] = js.undefined
  /** The device model that is being reported */
  var deviceModel: js.UndefOr[java.lang.String] = js.undefined
  /** Last modified date time of the policy report. */
  var lastReportedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Compliance status of the policy report. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant, error, conflict, notAssigned. */
  var status: js.UndefOr[ComplianceStatus] = js.undefined
  /** The User Name that is being reported */
  var userName: js.UndefOr[java.lang.String] = js.undefined
  /** UserPrincipalName. */
  var userPrincipalName: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceConfigurationDeviceStatus {
  @scala.inline
  def apply(
    complianceGracePeriodExpirationDateTime: java.lang.String = null,
    deviceDisplayName: java.lang.String = null,
    deviceModel: java.lang.String = null,
    id: java.lang.String = null,
    lastReportedDateTime: java.lang.String = null,
    status: ComplianceStatus = null,
    userName: java.lang.String = null,
    userPrincipalName: java.lang.String = null
  ): DeviceConfigurationDeviceStatus = {
    val __obj = js.Dynamic.literal()
    if (complianceGracePeriodExpirationDateTime != null) __obj.updateDynamic("complianceGracePeriodExpirationDateTime")(complianceGracePeriodExpirationDateTime)
    if (deviceDisplayName != null) __obj.updateDynamic("deviceDisplayName")(deviceDisplayName)
    if (deviceModel != null) __obj.updateDynamic("deviceModel")(deviceModel)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastReportedDateTime != null) __obj.updateDynamic("lastReportedDateTime")(lastReportedDateTime)
    if (status != null) __obj.updateDynamic("status")(status)
    if (userName != null) __obj.updateDynamic("userName")(userName)
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName)
    __obj.asInstanceOf[DeviceConfigurationDeviceStatus]
  }
}


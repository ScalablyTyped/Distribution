package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosUpdateDeviceStatus extends Entity {
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.undefined
  // Device name of the DevicePolicyStatus.
  var deviceDisplayName: js.UndefOr[String] = js.undefined
  // The device id that is being reported.
  var deviceId: js.UndefOr[String] = js.undefined
  // The device model that is being reported
  var deviceModel: js.UndefOr[String] = js.undefined
  /**
    * The installation status of the policy report. Possible values are: success, available, idle, unknown, downloading,
    * downloadFailed, downloadRequiresComputer, downloadInsufficientSpace, downloadInsufficientPower,
    * downloadInsufficientNetwork, installing, installInsufficientSpace, installInsufficientPower,
    * installPhoneCallInProgress, installFailed, notSupportedOperation, sharedDeviceUserLoggedInError.
    */
  var installStatus: js.UndefOr[IosUpdatesInstallStatus] = js.undefined
  // Last modified date time of the policy report.
  var lastReportedDateTime: js.UndefOr[String] = js.undefined
  // The device version that is being reported.
  var osVersion: js.UndefOr[String] = js.undefined
  /**
    * Compliance status of the policy report. Possible values are: unknown, notApplicable, compliant, remediated,
    * nonCompliant, error, conflict, notAssigned.
    */
  var status: js.UndefOr[ComplianceStatus] = js.undefined
  // The User id that is being reported.
  var userId: js.UndefOr[String] = js.undefined
  // The User Name that is being reported
  var userName: js.UndefOr[String] = js.undefined
  // UserPrincipalName.
  var userPrincipalName: js.UndefOr[String] = js.undefined
}

object IosUpdateDeviceStatus {
  @scala.inline
  def apply(
    complianceGracePeriodExpirationDateTime: String = null,
    deviceDisplayName: String = null,
    deviceId: String = null,
    deviceModel: String = null,
    id: String = null,
    installStatus: IosUpdatesInstallStatus = null,
    lastReportedDateTime: String = null,
    osVersion: String = null,
    status: ComplianceStatus = null,
    userId: String = null,
    userName: String = null,
    userPrincipalName: String = null
  ): IosUpdateDeviceStatus = {
    val __obj = js.Dynamic.literal()
    if (complianceGracePeriodExpirationDateTime != null) __obj.updateDynamic("complianceGracePeriodExpirationDateTime")(complianceGracePeriodExpirationDateTime.asInstanceOf[js.Any])
    if (deviceDisplayName != null) __obj.updateDynamic("deviceDisplayName")(deviceDisplayName.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceModel != null) __obj.updateDynamic("deviceModel")(deviceModel.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (installStatus != null) __obj.updateDynamic("installStatus")(installStatus.asInstanceOf[js.Any])
    if (lastReportedDateTime != null) __obj.updateDynamic("lastReportedDateTime")(lastReportedDateTime.asInstanceOf[js.Any])
    if (osVersion != null) __obj.updateDynamic("osVersion")(osVersion.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosUpdateDeviceStatus]
  }
}


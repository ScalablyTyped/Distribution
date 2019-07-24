package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosUpdateDeviceStatus extends Entity {
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Device name of the DevicePolicyStatus.
  var deviceDisplayName: js.UndefOr[java.lang.String] = js.undefined
  // The device id that is being reported.
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  // The device model that is being reported
  var deviceModel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The installation status of the policy report. Possible values are: success, available, idle, unknown, downloading,
    * downloadFailed, downloadRequiresComputer, downloadInsufficientSpace, downloadInsufficientPower,
    * downloadInsufficientNetwork, installing, installInsufficientSpace, installInsufficientPower,
    * installPhoneCallInProgress, installFailed, notSupportedOperation, sharedDeviceUserLoggedInError.
    */
  var installStatus: js.UndefOr[IosUpdatesInstallStatus] = js.undefined
  // Last modified date time of the policy report.
  var lastReportedDateTime: js.UndefOr[java.lang.String] = js.undefined
  // The device version that is being reported.
  var osVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Compliance status of the policy report. Possible values are: unknown, notApplicable, compliant, remediated,
    * nonCompliant, error, conflict, notAssigned.
    */
  var status: js.UndefOr[ComplianceStatus] = js.undefined
  // The User id that is being reported.
  var userId: js.UndefOr[java.lang.String] = js.undefined
  // The User Name that is being reported
  var userName: js.UndefOr[java.lang.String] = js.undefined
  // UserPrincipalName.
  var userPrincipalName: js.UndefOr[java.lang.String] = js.undefined
}

object IosUpdateDeviceStatus {
  @scala.inline
  def apply(
    complianceGracePeriodExpirationDateTime: java.lang.String = null,
    deviceDisplayName: java.lang.String = null,
    deviceId: java.lang.String = null,
    deviceModel: java.lang.String = null,
    id: java.lang.String = null,
    installStatus: IosUpdatesInstallStatus = null,
    lastReportedDateTime: java.lang.String = null,
    osVersion: java.lang.String = null,
    status: ComplianceStatus = null,
    userId: java.lang.String = null,
    userName: java.lang.String = null,
    userPrincipalName: java.lang.String = null
  ): IosUpdateDeviceStatus = {
    val __obj = js.Dynamic.literal()
    if (complianceGracePeriodExpirationDateTime != null) __obj.updateDynamic("complianceGracePeriodExpirationDateTime")(complianceGracePeriodExpirationDateTime)
    if (deviceDisplayName != null) __obj.updateDynamic("deviceDisplayName")(deviceDisplayName)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (deviceModel != null) __obj.updateDynamic("deviceModel")(deviceModel)
    if (id != null) __obj.updateDynamic("id")(id)
    if (installStatus != null) __obj.updateDynamic("installStatus")(installStatus)
    if (lastReportedDateTime != null) __obj.updateDynamic("lastReportedDateTime")(lastReportedDateTime)
    if (osVersion != null) __obj.updateDynamic("osVersion")(osVersion)
    if (status != null) __obj.updateDynamic("status")(status)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    if (userName != null) __obj.updateDynamic("userName")(userName)
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName)
    __obj.asInstanceOf[IosUpdateDeviceStatus]
  }
}


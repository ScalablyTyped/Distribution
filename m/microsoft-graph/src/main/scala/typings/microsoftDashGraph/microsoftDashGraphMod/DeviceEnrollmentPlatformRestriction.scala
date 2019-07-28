package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceEnrollmentPlatformRestriction extends js.Object {
  // Max OS version supported
  var osMaximumVersion: js.UndefOr[String] = js.undefined
  // Min OS version supported
  var osMinimumVersion: js.UndefOr[String] = js.undefined
  // Block personally owned devices from enrolling
  var personalDeviceEnrollmentBlocked: js.UndefOr[Boolean] = js.undefined
  // Block the platform from enrolling
  var platformBlocked: js.UndefOr[Boolean] = js.undefined
}

object DeviceEnrollmentPlatformRestriction {
  @scala.inline
  def apply(
    osMaximumVersion: String = null,
    osMinimumVersion: String = null,
    personalDeviceEnrollmentBlocked: js.UndefOr[Boolean] = js.undefined,
    platformBlocked: js.UndefOr[Boolean] = js.undefined
  ): DeviceEnrollmentPlatformRestriction = {
    val __obj = js.Dynamic.literal()
    if (osMaximumVersion != null) __obj.updateDynamic("osMaximumVersion")(osMaximumVersion)
    if (osMinimumVersion != null) __obj.updateDynamic("osMinimumVersion")(osMinimumVersion)
    if (!js.isUndefined(personalDeviceEnrollmentBlocked)) __obj.updateDynamic("personalDeviceEnrollmentBlocked")(personalDeviceEnrollmentBlocked)
    if (!js.isUndefined(platformBlocked)) __obj.updateDynamic("platformBlocked")(platformBlocked)
    __obj.asInstanceOf[DeviceEnrollmentPlatformRestriction]
  }
}


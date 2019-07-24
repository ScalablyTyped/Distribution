package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceEnrollmentPlatformRestriction extends js.Object {
  // Max OS version supported
  var osMaximumVersion: js.UndefOr[java.lang.String] = js.undefined
  // Min OS version supported
  var osMinimumVersion: js.UndefOr[java.lang.String] = js.undefined
  // Block personally owned devices from enrolling
  var personalDeviceEnrollmentBlocked: js.UndefOr[scala.Boolean] = js.undefined
  // Block the platform from enrolling
  var platformBlocked: js.UndefOr[scala.Boolean] = js.undefined
}

object DeviceEnrollmentPlatformRestriction {
  @scala.inline
  def apply(
    osMaximumVersion: java.lang.String = null,
    osMinimumVersion: java.lang.String = null,
    personalDeviceEnrollmentBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    platformBlocked: js.UndefOr[scala.Boolean] = js.undefined
  ): DeviceEnrollmentPlatformRestriction = {
    val __obj = js.Dynamic.literal()
    if (osMaximumVersion != null) __obj.updateDynamic("osMaximumVersion")(osMaximumVersion)
    if (osMinimumVersion != null) __obj.updateDynamic("osMinimumVersion")(osMinimumVersion)
    if (!js.isUndefined(personalDeviceEnrollmentBlocked)) __obj.updateDynamic("personalDeviceEnrollmentBlocked")(personalDeviceEnrollmentBlocked)
    if (!js.isUndefined(platformBlocked)) __obj.updateDynamic("platformBlocked")(platformBlocked)
    __obj.asInstanceOf[DeviceEnrollmentPlatformRestriction]
  }
}


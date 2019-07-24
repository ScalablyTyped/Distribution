package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceEnrollmentPlatformRestrictionsConfiguration extends DeviceEnrollmentConfiguration {
  // Not yet documented
  var androidRestriction: js.UndefOr[DeviceEnrollmentPlatformRestriction] = js.undefined
  // Not yet documented
  var iosRestriction: js.UndefOr[DeviceEnrollmentPlatformRestriction] = js.undefined
  // Not yet documented
  var macOSRestriction: js.UndefOr[DeviceEnrollmentPlatformRestriction] = js.undefined
  // Not yet documented
  var windowsMobileRestriction: js.UndefOr[DeviceEnrollmentPlatformRestriction] = js.undefined
  // Not yet documented
  var windowsRestriction: js.UndefOr[DeviceEnrollmentPlatformRestriction] = js.undefined
}

object DeviceEnrollmentPlatformRestrictionsConfiguration {
  @scala.inline
  def apply(
    androidRestriction: DeviceEnrollmentPlatformRestriction = null,
    assignments: js.Array[EnrollmentConfigurationAssignment] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    iosRestriction: DeviceEnrollmentPlatformRestriction = null,
    lastModifiedDateTime: java.lang.String = null,
    macOSRestriction: DeviceEnrollmentPlatformRestriction = null,
    priority: scala.Int | scala.Double = null,
    version: scala.Int | scala.Double = null,
    windowsMobileRestriction: DeviceEnrollmentPlatformRestriction = null,
    windowsRestriction: DeviceEnrollmentPlatformRestriction = null
  ): DeviceEnrollmentPlatformRestrictionsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (androidRestriction != null) __obj.updateDynamic("androidRestriction")(androidRestriction)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (iosRestriction != null) __obj.updateDynamic("iosRestriction")(iosRestriction)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (macOSRestriction != null) __obj.updateDynamic("macOSRestriction")(macOSRestriction)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (windowsMobileRestriction != null) __obj.updateDynamic("windowsMobileRestriction")(windowsMobileRestriction)
    if (windowsRestriction != null) __obj.updateDynamic("windowsRestriction")(windowsRestriction)
    __obj.asInstanceOf[DeviceEnrollmentPlatformRestrictionsConfiguration]
  }
}


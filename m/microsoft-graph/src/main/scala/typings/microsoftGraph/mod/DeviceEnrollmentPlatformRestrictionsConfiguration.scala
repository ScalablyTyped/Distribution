package typings.microsoftGraph.mod

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
    createdDateTime: String = null,
    description: String = null,
    displayName: String = null,
    id: String = null,
    iosRestriction: DeviceEnrollmentPlatformRestriction = null,
    lastModifiedDateTime: String = null,
    macOSRestriction: DeviceEnrollmentPlatformRestriction = null,
    priority: Int | Double = null,
    version: Int | Double = null,
    windowsMobileRestriction: DeviceEnrollmentPlatformRestriction = null,
    windowsRestriction: DeviceEnrollmentPlatformRestriction = null
  ): DeviceEnrollmentPlatformRestrictionsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (androidRestriction != null) __obj.updateDynamic("androidRestriction")(androidRestriction.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (iosRestriction != null) __obj.updateDynamic("iosRestriction")(iosRestriction.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (macOSRestriction != null) __obj.updateDynamic("macOSRestriction")(macOSRestriction.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (windowsMobileRestriction != null) __obj.updateDynamic("windowsMobileRestriction")(windowsMobileRestriction.asInstanceOf[js.Any])
    if (windowsRestriction != null) __obj.updateDynamic("windowsRestriction")(windowsRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceEnrollmentPlatformRestrictionsConfiguration]
  }
}


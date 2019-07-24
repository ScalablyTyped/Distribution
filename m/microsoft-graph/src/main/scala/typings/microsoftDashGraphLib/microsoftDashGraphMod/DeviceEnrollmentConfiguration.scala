package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceEnrollmentConfiguration extends Entity {
  // The list of group assignments for the device configuration profile.
  var assignments: js.UndefOr[js.Array[EnrollmentConfigurationAssignment]] = js.undefined
  // Not yet documented
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Not yet documented
  var description: js.UndefOr[java.lang.String] = js.undefined
  // Not yet documented
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // Not yet documented
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Not yet documented
  var priority: js.UndefOr[scala.Double] = js.undefined
  // Not yet documented
  var version: js.UndefOr[scala.Double] = js.undefined
}

object DeviceEnrollmentConfiguration {
  @scala.inline
  def apply(
    assignments: js.Array[EnrollmentConfigurationAssignment] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    priority: scala.Int | scala.Double = null,
    version: scala.Int | scala.Double = null
  ): DeviceEnrollmentConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceEnrollmentConfiguration]
  }
}


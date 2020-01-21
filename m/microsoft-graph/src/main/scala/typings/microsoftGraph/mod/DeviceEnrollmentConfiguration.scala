package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceEnrollmentConfiguration extends Entity {
  // The list of group assignments for the device configuration profile.
  var assignments: js.UndefOr[js.Array[EnrollmentConfigurationAssignment]] = js.undefined
  // Not yet documented
  var createdDateTime: js.UndefOr[String] = js.undefined
  // Not yet documented
  var description: js.UndefOr[String] = js.undefined
  // Not yet documented
  var displayName: js.UndefOr[String] = js.undefined
  // Not yet documented
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  // Not yet documented
  var priority: js.UndefOr[Double] = js.undefined
  // Not yet documented
  var version: js.UndefOr[Double] = js.undefined
}

object DeviceEnrollmentConfiguration {
  @scala.inline
  def apply(
    assignments: js.Array[EnrollmentConfigurationAssignment] = null,
    createdDateTime: String = null,
    description: String = null,
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    priority: Int | Double = null,
    version: Int | Double = null
  ): DeviceEnrollmentConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceEnrollmentConfiguration]
  }
}


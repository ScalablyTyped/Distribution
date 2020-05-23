package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceEnrollmentLimitConfiguration extends DeviceEnrollmentConfiguration {
  // Not yet documented
  var limit: js.UndefOr[Double] = js.undefined
}

object DeviceEnrollmentLimitConfiguration {
  @scala.inline
  def apply(
    assignments: js.Array[EnrollmentConfigurationAssignment] = null,
    createdDateTime: String = null,
    description: String = null,
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined,
    version: js.UndefOr[Double] = js.undefined
  ): DeviceEnrollmentLimitConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceEnrollmentLimitConfiguration]
  }
}


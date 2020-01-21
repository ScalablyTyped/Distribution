package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignedPlan extends js.Object {
  /**
    * The date and time at which the plan was assigned; for example: 2013-01-02T19:32:30Z. The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
    * look like this: '2014-01-01T00:00:00Z'
    */
  var assignedDateTime: js.UndefOr[String] = js.undefined
  // For example, 'Enabled'.
  var capabilityStatus: js.UndefOr[String] = js.undefined
  // The name of the service; for example, 'Exchange'.
  var service: js.UndefOr[String] = js.undefined
  // A GUID that identifies the service plan.
  var servicePlanId: js.UndefOr[String] = js.undefined
}

object AssignedPlan {
  @scala.inline
  def apply(
    assignedDateTime: String = null,
    capabilityStatus: String = null,
    service: String = null,
    servicePlanId: String = null
  ): AssignedPlan = {
    val __obj = js.Dynamic.literal()
    if (assignedDateTime != null) __obj.updateDynamic("assignedDateTime")(assignedDateTime.asInstanceOf[js.Any])
    if (capabilityStatus != null) __obj.updateDynamic("capabilityStatus")(capabilityStatus.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (servicePlanId != null) __obj.updateDynamic("servicePlanId")(servicePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignedPlan]
  }
}


package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignedPlan extends js.Object {
  /**
    * The date and time at which the plan was assigned;
    * for example: 2013-01-02T19:32:30Z.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var assignedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** For example, 'Enabled'. */
  var capabilityStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the service; for example, 'Exchange'. */
  var service: js.UndefOr[java.lang.String] = js.undefined
  /** A GUID that identifies the service plan. */
  var servicePlanId: js.UndefOr[java.lang.String] = js.undefined
}

object AssignedPlan {
  @scala.inline
  def apply(
    assignedDateTime: java.lang.String = null,
    capabilityStatus: java.lang.String = null,
    service: java.lang.String = null,
    servicePlanId: java.lang.String = null
  ): AssignedPlan = {
    val __obj = js.Dynamic.literal()
    if (assignedDateTime != null) __obj.updateDynamic("assignedDateTime")(assignedDateTime)
    if (capabilityStatus != null) __obj.updateDynamic("capabilityStatus")(capabilityStatus)
    if (service != null) __obj.updateDynamic("service")(service)
    if (servicePlanId != null) __obj.updateDynamic("servicePlanId")(servicePlanId)
    __obj.asInstanceOf[AssignedPlan]
  }
}


package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerAssignment extends js.Object {
  // The identity of the user that performed the assignment of the task, i.e. the assignor.
  var assignedBy: js.UndefOr[IdentitySet] = js.undefined
  /**
    * The time at which the task was assigned. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var assignedDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Hint used to order assignees in a task. The format is defined as outlined here.
  var orderHint: js.UndefOr[java.lang.String] = js.undefined
}

object PlannerAssignment {
  @scala.inline
  def apply(
    assignedBy: IdentitySet = null,
    assignedDateTime: java.lang.String = null,
    orderHint: java.lang.String = null
  ): PlannerAssignment = {
    val __obj = js.Dynamic.literal()
    if (assignedBy != null) __obj.updateDynamic("assignedBy")(assignedBy)
    if (assignedDateTime != null) __obj.updateDynamic("assignedDateTime")(assignedDateTime)
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint)
    __obj.asInstanceOf[PlannerAssignment]
  }
}


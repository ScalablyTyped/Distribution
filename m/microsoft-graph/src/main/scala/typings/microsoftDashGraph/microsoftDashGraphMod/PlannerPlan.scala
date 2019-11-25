package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerPlan extends Entity {
  // Read-only. Nullable. Collection of buckets in the plan.
  var buckets: js.UndefOr[js.Array[PlannerBucket]] = js.undefined
  // Read-only. The user who created the plan.
  var createdBy: js.UndefOr[IdentitySet] = js.undefined
  /**
    * Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var createdDateTime: js.UndefOr[String] = js.undefined
  // Read-only. Nullable. Additional details about the plan.
  var details: js.UndefOr[PlannerPlanDetails] = js.undefined
  /**
    * ID of the Group that owns the plan. A valid group must exist before this field can be set. After it is set, this
    * property can’t be updated.
    */
  var owner: js.UndefOr[String] = js.undefined
  // Read-only. Nullable. Collection of tasks in the plan.
  var tasks: js.UndefOr[js.Array[PlannerTask]] = js.undefined
  // Required. Title of the plan.
  var title: js.UndefOr[String] = js.undefined
}

object PlannerPlan {
  @scala.inline
  def apply(
    buckets: js.Array[PlannerBucket] = null,
    createdBy: IdentitySet = null,
    createdDateTime: String = null,
    details: PlannerPlanDetails = null,
    id: String = null,
    owner: String = null,
    tasks: js.Array[PlannerTask] = null,
    title: String = null
  ): PlannerPlan = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlannerPlan]
  }
}


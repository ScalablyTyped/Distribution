package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Planner extends Entity {
  // Read-only. Nullable. Returns a collection of the specified buckets
  var buckets: js.UndefOr[js.Array[PlannerBucket]] = js.undefined
  // Read-only. Nullable. Returns a collection of the specified plans
  var plans: js.UndefOr[js.Array[PlannerPlan]] = js.undefined
  // Read-only. Nullable. Returns a collection of the specified tasks
  var tasks: js.UndefOr[js.Array[PlannerTask]] = js.undefined
}

object Planner {
  @scala.inline
  def apply(
    buckets: js.Array[PlannerBucket] = null,
    id: String = null,
    plans: js.Array[PlannerPlan] = null,
    tasks: js.Array[PlannerTask] = null
  ): Planner = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets)
    if (id != null) __obj.updateDynamic("id")(id)
    if (plans != null) __obj.updateDynamic("plans")(plans)
    if (tasks != null) __obj.updateDynamic("tasks")(tasks)
    __obj.asInstanceOf[Planner]
  }
}


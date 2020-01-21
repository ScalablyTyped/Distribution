package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerUser extends Entity {
  // Read-only. Nullable. Returns the plannerTasks assigned to the user.
  var plans: js.UndefOr[js.Array[PlannerPlan]] = js.undefined
  // Read-only. Nullable. Returns the plannerPlans shared with the user.
  var tasks: js.UndefOr[js.Array[PlannerTask]] = js.undefined
}

object PlannerUser {
  @scala.inline
  def apply(id: String = null, plans: js.Array[PlannerPlan] = null, tasks: js.Array[PlannerTask] = null): PlannerUser = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (plans != null) __obj.updateDynamic("plans")(plans.asInstanceOf[js.Any])
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlannerUser]
  }
}


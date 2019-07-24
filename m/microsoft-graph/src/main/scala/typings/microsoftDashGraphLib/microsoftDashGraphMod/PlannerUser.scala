package typings
package microsoftDashGraphLib.microsoftDashGraphMod

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
  def apply(
    id: java.lang.String = null,
    plans: js.Array[PlannerPlan] = null,
    tasks: js.Array[PlannerTask] = null
  ): PlannerUser = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (plans != null) __obj.updateDynamic("plans")(plans)
    if (tasks != null) __obj.updateDynamic("tasks")(tasks)
    __obj.asInstanceOf[PlannerUser]
  }
}


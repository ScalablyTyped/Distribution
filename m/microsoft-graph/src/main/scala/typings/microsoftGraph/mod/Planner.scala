package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Planner extends Entity {
  // Read-only. Nullable. Returns a collection of the specified buckets
  var buckets: js.UndefOr[js.Array[PlannerBucket]] = js.native
  // Read-only. Nullable. Returns a collection of the specified plans
  var plans: js.UndefOr[js.Array[PlannerPlan]] = js.native
  // Read-only. Nullable. Returns a collection of the specified tasks
  var tasks: js.UndefOr[js.Array[PlannerTask]] = js.native
}

object Planner {
  @scala.inline
  def apply(): Planner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Planner]
  }
  @scala.inline
  implicit class PlannerOps[Self <: Planner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucketsVarargs(value: PlannerBucket*): Self = this.set("buckets", js.Array(value :_*))
    @scala.inline
    def setBuckets(value: js.Array[PlannerBucket]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
    @scala.inline
    def setPlansVarargs(value: PlannerPlan*): Self = this.set("plans", js.Array(value :_*))
    @scala.inline
    def setPlans(value: js.Array[PlannerPlan]): Self = this.set("plans", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlans: Self = this.set("plans", js.undefined)
    @scala.inline
    def setTasksVarargs(value: PlannerTask*): Self = this.set("tasks", js.Array(value :_*))
    @scala.inline
    def setTasks(value: js.Array[PlannerTask]): Self = this.set("tasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTasks: Self = this.set("tasks", js.undefined)
  }
  
}


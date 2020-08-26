package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlannerBucket extends Entity {
  // Name of the bucket.
  var name: js.UndefOr[String] = js.native
  // Hint used to order items of this type in a list view. The format is defined as outlined here.
  var orderHint: js.UndefOr[String] = js.native
  // Plan ID to which the bucket belongs.
  var planId: js.UndefOr[String] = js.native
  // Read-only. Nullable. The collection of tasks in the bucket.
  var tasks: js.UndefOr[js.Array[PlannerTask]] = js.native
}

object PlannerBucket {
  @scala.inline
  def apply(): PlannerBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerBucket]
  }
  @scala.inline
  implicit class PlannerBucketOps[Self <: PlannerBucket] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrderHint(value: String): Self = this.set("orderHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderHint: Self = this.set("orderHint", js.undefined)
    @scala.inline
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanId: Self = this.set("planId", js.undefined)
    @scala.inline
    def setTasksVarargs(value: PlannerTask*): Self = this.set("tasks", js.Array(value :_*))
    @scala.inline
    def setTasks(value: js.Array[PlannerTask]): Self = this.set("tasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTasks: Self = this.set("tasks", js.undefined)
  }
  
}


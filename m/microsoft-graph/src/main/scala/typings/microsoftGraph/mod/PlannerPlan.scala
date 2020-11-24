package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlannerPlan extends Entity {
  
  // Read-only. Nullable. Collection of buckets in the plan.
  var buckets: js.UndefOr[NullableOption[js.Array[PlannerBucket]]] = js.native
  
  // Read-only. The user who created the plan.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  /**
    * Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only. Nullable. Additional details about the plan.
  var details: js.UndefOr[NullableOption[PlannerPlanDetails]] = js.native
  
  /**
    * ID of the Group that owns the plan. A valid group must exist before this field can be set. After it is set, this
    * property can’t be updated.
    */
  var owner: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only. Nullable. Collection of tasks in the plan.
  var tasks: js.UndefOr[NullableOption[js.Array[PlannerTask]]] = js.native
  
  // Required. Title of the plan.
  var title: js.UndefOr[String] = js.native
}
object PlannerPlan {
  
  @scala.inline
  def apply(): PlannerPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerPlan]
  }
  
  @scala.inline
  implicit class PlannerPlanOps[Self <: PlannerPlan] (val x: Self) extends AnyVal {
    
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
    def setBuckets(value: NullableOption[js.Array[PlannerBucket]]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
    
    @scala.inline
    def setBucketsNull: Self = this.set("buckets", null)
    
    @scala.inline
    def setCreatedBy(value: NullableOption[IdentitySet]): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setCreatedByNull: Self = this.set("createdBy", null)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTimeNull: Self = this.set("createdDateTime", null)
    
    @scala.inline
    def setDetails(value: NullableOption[PlannerPlanDetails]): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setDetailsNull: Self = this.set("details", null)
    
    @scala.inline
    def setOwner(value: NullableOption[String]): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setOwnerNull: Self = this.set("owner", null)
    
    @scala.inline
    def setTasksVarargs(value: PlannerTask*): Self = this.set("tasks", js.Array(value :_*))
    
    @scala.inline
    def setTasks(value: NullableOption[js.Array[PlannerTask]]): Self = this.set("tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTasks: Self = this.set("tasks", js.undefined)
    
    @scala.inline
    def setTasksNull: Self = this.set("tasks", null)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}

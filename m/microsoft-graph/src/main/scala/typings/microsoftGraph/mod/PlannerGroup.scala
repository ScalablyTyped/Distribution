package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlannerGroup extends Entity {
  
  // Read-only. Nullable. Returns the plannerPlans owned by the group.
  var plans: js.UndefOr[NullableOption[js.Array[PlannerPlan]]] = js.native
}
object PlannerGroup {
  
  @scala.inline
  def apply(): PlannerGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerGroup]
  }
  
  @scala.inline
  implicit class PlannerGroupOps[Self <: PlannerGroup] (val x: Self) extends AnyVal {
    
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
    def setPlansVarargs(value: PlannerPlan*): Self = this.set("plans", js.Array(value :_*))
    
    @scala.inline
    def setPlans(value: NullableOption[js.Array[PlannerPlan]]): Self = this.set("plans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlans: Self = this.set("plans", js.undefined)
    
    @scala.inline
    def setPlansNull: Self = this.set("plans", null)
  }
}

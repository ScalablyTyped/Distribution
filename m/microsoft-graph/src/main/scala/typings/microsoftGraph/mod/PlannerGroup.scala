package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerGroup
  extends StObject
     with Entity {
  
  // Read-only. Nullable. Returns the plannerPlans owned by the group.
  var plans: js.UndefOr[NullableOption[js.Array[PlannerPlan]]] = js.undefined
}
object PlannerGroup {
  
  @scala.inline
  def apply(): PlannerGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerGroup]
  }
  
  @scala.inline
  implicit class PlannerGroupMutableBuilder[Self <: PlannerGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlans(value: NullableOption[js.Array[PlannerPlan]]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlansNull: Self = StObject.set(x, "plans", null)
    
    @scala.inline
    def setPlansUndefined: Self = StObject.set(x, "plans", js.undefined)
    
    @scala.inline
    def setPlansVarargs(value: PlannerPlan*): Self = StObject.set(x, "plans", js.Array(value :_*))
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerUser
  extends StObject
     with Entity {
  
  // Read-only. Nullable. Returns the plannerTasks assigned to the user.
  var plans: js.UndefOr[NullableOption[js.Array[PlannerPlan]]] = js.undefined
  
  // Read-only. Nullable. Returns the plannerPlans shared with the user.
  var tasks: js.UndefOr[NullableOption[js.Array[PlannerTask]]] = js.undefined
}
object PlannerUser {
  
  @scala.inline
  def apply(): PlannerUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerUser]
  }
  
  @scala.inline
  implicit class PlannerUserMutableBuilder[Self <: PlannerUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlans(value: NullableOption[js.Array[PlannerPlan]]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlansNull: Self = StObject.set(x, "plans", null)
    
    @scala.inline
    def setPlansUndefined: Self = StObject.set(x, "plans", js.undefined)
    
    @scala.inline
    def setPlansVarargs(value: PlannerPlan*): Self = StObject.set(x, "plans", js.Array(value :_*))
    
    @scala.inline
    def setTasks(value: NullableOption[js.Array[PlannerTask]]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksNull: Self = StObject.set(x, "tasks", null)
    
    @scala.inline
    def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    @scala.inline
    def setTasksVarargs(value: PlannerTask*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}

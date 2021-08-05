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
  
  inline def apply(): PlannerUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerUser]
  }
  
  extension [Self <: PlannerUser](x: Self) {
    
    inline def setPlans(value: NullableOption[js.Array[PlannerPlan]]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansNull: Self = StObject.set(x, "plans", null)
    
    inline def setPlansUndefined: Self = StObject.set(x, "plans", js.undefined)
    
    inline def setPlansVarargs(value: PlannerPlan*): Self = StObject.set(x, "plans", js.Array(value :_*))
    
    inline def setTasks(value: NullableOption[js.Array[PlannerTask]]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksNull: Self = StObject.set(x, "tasks", null)
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: PlannerTask*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}

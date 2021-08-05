package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Planner
  extends StObject
     with Entity {
  
  // Read-only. Nullable. Returns a collection of the specified buckets
  var buckets: js.UndefOr[NullableOption[js.Array[PlannerBucket]]] = js.undefined
  
  // Read-only. Nullable. Returns a collection of the specified plans
  var plans: js.UndefOr[NullableOption[js.Array[PlannerPlan]]] = js.undefined
  
  // Read-only. Nullable. Returns a collection of the specified tasks
  var tasks: js.UndefOr[NullableOption[js.Array[PlannerTask]]] = js.undefined
}
object Planner {
  
  inline def apply(): Planner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Planner]
  }
  
  extension [Self <: Planner](x: Self) {
    
    inline def setBuckets(value: NullableOption[js.Array[PlannerBucket]]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsNull: Self = StObject.set(x, "buckets", null)
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: PlannerBucket*): Self = StObject.set(x, "buckets", js.Array(value :_*))
    
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

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Planner extends Entity {
  
  // Read-only. Nullable. Returns a collection of the specified buckets
  var buckets: js.UndefOr[NullableOption[js.Array[PlannerBucket]]] = js.native
  
  // Read-only. Nullable. Returns a collection of the specified plans
  var plans: js.UndefOr[NullableOption[js.Array[PlannerPlan]]] = js.native
  
  // Read-only. Nullable. Returns a collection of the specified tasks
  var tasks: js.UndefOr[NullableOption[js.Array[PlannerTask]]] = js.native
}
object Planner {
  
  @scala.inline
  def apply(): Planner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Planner]
  }
  
  @scala.inline
  implicit class PlannerMutableBuilder[Self <: Planner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: NullableOption[js.Array[PlannerBucket]]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsNull: Self = StObject.set(x, "buckets", null)
    
    @scala.inline
    def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: PlannerBucket*): Self = StObject.set(x, "buckets", js.Array(value :_*))
    
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

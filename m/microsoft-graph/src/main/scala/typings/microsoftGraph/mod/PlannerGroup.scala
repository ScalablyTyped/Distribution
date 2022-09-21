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
  
  inline def apply(): PlannerGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerGroup]
  }
  
  extension [Self <: PlannerGroup](x: Self) {
    
    inline def setPlans(value: NullableOption[js.Array[PlannerPlan]]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansNull: Self = StObject.set(x, "plans", null)
    
    inline def setPlansUndefined: Self = StObject.set(x, "plans", js.undefined)
    
    inline def setPlansVarargs(value: PlannerPlan*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}

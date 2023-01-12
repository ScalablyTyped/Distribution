package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerBucket
  extends StObject
     with Entity {
  
  // Name of the bucket.
  var name: js.UndefOr[String] = js.undefined
  
  // Hint used to order items of this type in a list view. The format is defined as outlined here.
  var orderHint: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Plan ID to which the bucket belongs.
  var planId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Read-only. Nullable. The collection of tasks in the bucket.
  var tasks: js.UndefOr[NullableOption[js.Array[PlannerTask]]] = js.undefined
}
object PlannerBucket {
  
  inline def apply(): PlannerBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerBucket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlannerBucket] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrderHint(value: NullableOption[String]): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    inline def setOrderHintNull: Self = StObject.set(x, "orderHint", null)
    
    inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
    
    inline def setPlanId(value: NullableOption[String]): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    inline def setPlanIdNull: Self = StObject.set(x, "planId", null)
    
    inline def setPlanIdUndefined: Self = StObject.set(x, "planId", js.undefined)
    
    inline def setTasks(value: NullableOption[js.Array[PlannerTask]]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksNull: Self = StObject.set(x, "tasks", null)
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: PlannerTask*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}

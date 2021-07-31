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
  
  @scala.inline
  def apply(): PlannerBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerBucket]
  }
  
  @scala.inline
  implicit class PlannerBucketMutableBuilder[Self <: PlannerBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrderHint(value: NullableOption[String]): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderHintNull: Self = StObject.set(x, "orderHint", null)
    
    @scala.inline
    def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
    
    @scala.inline
    def setPlanId(value: NullableOption[String]): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanIdNull: Self = StObject.set(x, "planId", null)
    
    @scala.inline
    def setPlanIdUndefined: Self = StObject.set(x, "planId", js.undefined)
    
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

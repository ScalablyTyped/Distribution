package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerPlan
  extends StObject
     with Entity {
  
  // Read-only. Nullable. Collection of buckets in the plan.
  var buckets: js.UndefOr[NullableOption[js.Array[PlannerBucket]]] = js.undefined
  
  // Identifies the container of the plan. After it is set, this property can’t be updated. Required.
  var container: js.UndefOr[NullableOption[PlannerPlanContainer]] = js.undefined
  
  // Read-only. The user who created the plan.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Read-only. Nullable. Additional details about the plan.
  var details: js.UndefOr[NullableOption[PlannerPlanDetails]] = js.undefined
  
  var owner: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Read-only. Nullable. Collection of tasks in the plan.
  var tasks: js.UndefOr[NullableOption[js.Array[PlannerTask]]] = js.undefined
  
  // Required. Title of the plan.
  var title: js.UndefOr[String] = js.undefined
}
object PlannerPlan {
  
  inline def apply(): PlannerPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerPlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlannerPlan] (val x: Self) extends AnyVal {
    
    inline def setBuckets(value: NullableOption[js.Array[PlannerBucket]]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsNull: Self = StObject.set(x, "buckets", null)
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: PlannerBucket*): Self = StObject.set(x, "buckets", js.Array(value*))
    
    inline def setContainer(value: NullableOption[PlannerPlanContainer]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDetails(value: NullableOption[PlannerPlanDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setOwner(value: NullableOption[String]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTasks(value: NullableOption[js.Array[PlannerTask]]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksNull: Self = StObject.set(x, "tasks", null)
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: PlannerTask*): Self = StObject.set(x, "tasks", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerPlanDetails
  extends StObject
     with Entity {
  
  // An object that specifies the descriptions of the 25 categories that can be associated with tasks in the plan.
  var categoryDescriptions: js.UndefOr[NullableOption[PlannerCategoryDescriptions]] = js.undefined
  
  /**
    * Set of user ids that this plan is shared with. If you are leveraging Microsoft 365 groups, use the Groups API to manage
    * group membership to share the group's plan. You can also add existing members of the group to this collection though it
    * is not required for them to access the plan owned by the group.
    */
  var sharedWith: js.UndefOr[NullableOption[PlannerUserIds]] = js.undefined
}
object PlannerPlanDetails {
  
  inline def apply(): PlannerPlanDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerPlanDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlannerPlanDetails] (val x: Self) extends AnyVal {
    
    inline def setCategoryDescriptions(value: NullableOption[PlannerCategoryDescriptions]): Self = StObject.set(x, "categoryDescriptions", value.asInstanceOf[js.Any])
    
    inline def setCategoryDescriptionsNull: Self = StObject.set(x, "categoryDescriptions", null)
    
    inline def setCategoryDescriptionsUndefined: Self = StObject.set(x, "categoryDescriptions", js.undefined)
    
    inline def setSharedWith(value: NullableOption[PlannerUserIds]): Self = StObject.set(x, "sharedWith", value.asInstanceOf[js.Any])
    
    inline def setSharedWithNull: Self = StObject.set(x, "sharedWith", null)
    
    inline def setSharedWithUndefined: Self = StObject.set(x, "sharedWith", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlannerPlanDetails extends Entity {
  
  // An object that specifies the descriptions of the six categories that can be associated with tasks in the plan
  var categoryDescriptions: js.UndefOr[NullableOption[PlannerCategoryDescriptions]] = js.native
  
  /**
    * Set of user ids that this plan is shared with. If you are leveraging Microsoft 365 groups, use the Groups API to manage
    * group membership to share the group's plan. You can also add existing members of the group to this collection though it
    * is not required for them to access the plan owned by the group.
    */
  var sharedWith: js.UndefOr[NullableOption[PlannerUserIds]] = js.native
}
object PlannerPlanDetails {
  
  @scala.inline
  def apply(): PlannerPlanDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerPlanDetails]
  }
  
  @scala.inline
  implicit class PlannerPlanDetailsMutableBuilder[Self <: PlannerPlanDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryDescriptions(value: NullableOption[PlannerCategoryDescriptions]): Self = StObject.set(x, "categoryDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryDescriptionsNull: Self = StObject.set(x, "categoryDescriptions", null)
    
    @scala.inline
    def setCategoryDescriptionsUndefined: Self = StObject.set(x, "categoryDescriptions", js.undefined)
    
    @scala.inline
    def setSharedWith(value: NullableOption[PlannerUserIds]): Self = StObject.set(x, "sharedWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedWithNull: Self = StObject.set(x, "sharedWith", null)
    
    @scala.inline
    def setSharedWithUndefined: Self = StObject.set(x, "sharedWith", js.undefined)
  }
}

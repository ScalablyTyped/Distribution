package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlannerPlanDetails extends Entity {
  // An object that specifies the descriptions of the six categories that can be associated with tasks in the plan
  var categoryDescriptions: js.UndefOr[PlannerCategoryDescriptions] = js.native
  /**
    * Set of user ids that this plan is shared with. If you are leveraging Microsoft 365 groups, use the Groups API to manage
    * group membership to share the group's plan. You can also add existing members of the group to this collection though it
    * is not required for them to access the plan owned by the group.
    */
  var sharedWith: js.UndefOr[PlannerUserIds] = js.native
}

object PlannerPlanDetails {
  @scala.inline
  def apply(): PlannerPlanDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerPlanDetails]
  }
  @scala.inline
  implicit class PlannerPlanDetailsOps[Self <: PlannerPlanDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategoryDescriptions(value: PlannerCategoryDescriptions): Self = this.set("categoryDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryDescriptions: Self = this.set("categoryDescriptions", js.undefined)
    @scala.inline
    def setSharedWith(value: PlannerUserIds): Self = this.set("sharedWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedWith: Self = this.set("sharedWith", js.undefined)
  }
  
}


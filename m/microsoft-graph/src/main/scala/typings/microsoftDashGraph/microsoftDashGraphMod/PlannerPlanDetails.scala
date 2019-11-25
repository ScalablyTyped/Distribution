package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerPlanDetails extends Entity {
  // An object that specifies the descriptions of the six categories that can be associated with tasks in the plan
  var categoryDescriptions: js.UndefOr[PlannerCategoryDescriptions] = js.undefined
  /**
    * Set of user ids that this plan is shared with. If you are leveraging Office 365 Groups, use the Groups API to manage
    * group membership to share the group's plan. You can also add existing members of the group to this collection though it
    * is not required for them to access the plan owned by the group.
    */
  var sharedWith: js.UndefOr[PlannerUserIds] = js.undefined
}

object PlannerPlanDetails {
  @scala.inline
  def apply(
    categoryDescriptions: PlannerCategoryDescriptions = null,
    id: String = null,
    sharedWith: PlannerUserIds = null
  ): PlannerPlanDetails = {
    val __obj = js.Dynamic.literal()
    if (categoryDescriptions != null) __obj.updateDynamic("categoryDescriptions")(categoryDescriptions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (sharedWith != null) __obj.updateDynamic("sharedWith")(sharedWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlannerPlanDetails]
  }
}


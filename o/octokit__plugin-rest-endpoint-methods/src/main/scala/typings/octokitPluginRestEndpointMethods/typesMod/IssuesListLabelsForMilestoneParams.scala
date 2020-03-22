package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListLabelsForMilestoneParams extends js.Object {
  var milestone_number: Double
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object IssuesListLabelsForMilestoneParams {
  @scala.inline
  def apply(
    milestone_number: Double,
    owner: String,
    repo: String,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): IssuesListLabelsForMilestoneParams = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesListLabelsForMilestoneParams]
  }
}


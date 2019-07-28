package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListLabelsForMilestoneEndpoint extends js.Object {
  var milestone_number: Double
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object IssuesListLabelsForMilestoneEndpoint {
  @scala.inline
  def apply(
    milestone_number: Double,
    owner: String,
    repo: String,
    number: Int | Double = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): IssuesListLabelsForMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number, owner = owner, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesListLabelsForMilestoneEndpoint]
  }
}


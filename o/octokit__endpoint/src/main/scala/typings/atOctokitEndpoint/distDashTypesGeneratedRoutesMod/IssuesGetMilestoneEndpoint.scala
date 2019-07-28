package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetMilestoneEndpoint extends js.Object {
  var milestone_number: Double
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var repo: String
}

object IssuesGetMilestoneEndpoint {
  @scala.inline
  def apply(milestone_number: Double, owner: String, repo: String, number: Int | Double = null): IssuesGetMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number, owner = owner, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesGetMilestoneEndpoint]
  }
}


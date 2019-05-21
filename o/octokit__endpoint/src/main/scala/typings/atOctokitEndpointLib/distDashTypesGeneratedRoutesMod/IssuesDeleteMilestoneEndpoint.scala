package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesDeleteMilestoneEndpoint extends js.Object {
  var milestone_number: scala.Double
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesDeleteMilestoneEndpoint {
  @scala.inline
  def apply(
    milestone_number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    number: scala.Int | scala.Double = null
  ): IssuesDeleteMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number, owner = owner, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesDeleteMilestoneEndpoint]
  }
}


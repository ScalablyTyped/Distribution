package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesRemoveLabelsEndpoint extends js.Object {
  var issue_number: Double
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var repo: String
}

object IssuesRemoveLabelsEndpoint {
  @scala.inline
  def apply(issue_number: Double, owner: String, repo: String, number: Int | Double = null): IssuesRemoveLabelsEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesRemoveLabelsEndpoint]
  }
}


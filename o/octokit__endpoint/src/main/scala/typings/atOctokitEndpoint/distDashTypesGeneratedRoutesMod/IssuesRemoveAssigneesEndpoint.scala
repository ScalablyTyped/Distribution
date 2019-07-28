package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesRemoveAssigneesEndpoint extends js.Object {
  var assignees: js.UndefOr[js.Array[String]] = js.undefined
  var issue_number: Double
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var repo: String
}

object IssuesRemoveAssigneesEndpoint {
  @scala.inline
  def apply(
    issue_number: Double,
    owner: String,
    repo: String,
    assignees: js.Array[String] = null,
    number: Int | Double = null
  ): IssuesRemoveAssigneesEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (assignees != null) __obj.updateDynamic("assignees")(assignees)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesRemoveAssigneesEndpoint]
  }
}


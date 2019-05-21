package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesRemoveAssigneesEndpoint extends js.Object {
  var assignees: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var issue_number: scala.Double
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesRemoveAssigneesEndpoint {
  @scala.inline
  def apply(
    issue_number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    assignees: js.Array[java.lang.String] = null,
    number: scala.Int | scala.Double = null
  ): IssuesRemoveAssigneesEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (assignees != null) __obj.updateDynamic("assignees")(assignees)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesRemoveAssigneesEndpoint]
  }
}


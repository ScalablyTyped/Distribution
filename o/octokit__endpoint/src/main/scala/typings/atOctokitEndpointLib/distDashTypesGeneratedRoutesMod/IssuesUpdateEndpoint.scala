package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateEndpoint extends js.Object {
  var assignee: js.UndefOr[java.lang.String] = js.undefined
  var assignees: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var body: js.UndefOr[java.lang.String] = js.undefined
  var issue_number: scala.Double
  var labels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var milestone: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  var state: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object IssuesUpdateEndpoint {
  @scala.inline
  def apply(
    issue_number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    assignee: java.lang.String = null,
    assignees: js.Array[java.lang.String] = null,
    body: java.lang.String = null,
    labels: js.Array[java.lang.String] = null,
    milestone: scala.Int | scala.Double = null,
    number: scala.Int | scala.Double = null,
    state: java.lang.String = null,
    title: java.lang.String = null
  ): IssuesUpdateEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (assignees != null) __obj.updateDynamic("assignees")(assignees)
    if (body != null) __obj.updateDynamic("body")(body)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IssuesUpdateEndpoint]
  }
}


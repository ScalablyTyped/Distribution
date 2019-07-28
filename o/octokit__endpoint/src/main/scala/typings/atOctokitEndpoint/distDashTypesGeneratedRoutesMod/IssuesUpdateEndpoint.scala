package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateEndpoint extends js.Object {
  var assignee: js.UndefOr[String] = js.undefined
  var assignees: js.UndefOr[js.Array[String]] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var issue_number: Double
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  var milestone: js.UndefOr[Double | Null] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var repo: String
  var state: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object IssuesUpdateEndpoint {
  @scala.inline
  def apply(
    issue_number: Double,
    owner: String,
    repo: String,
    assignee: String = null,
    assignees: js.Array[String] = null,
    body: String = null,
    labels: js.Array[String] = null,
    milestone: Int | Double = null,
    number: Int | Double = null,
    state: String = null,
    title: String = null
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


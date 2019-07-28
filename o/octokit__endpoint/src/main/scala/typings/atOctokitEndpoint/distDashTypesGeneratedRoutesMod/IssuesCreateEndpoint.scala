package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateEndpoint extends js.Object {
  var assignee: js.UndefOr[String] = js.undefined
  var assignees: js.UndefOr[js.Array[String]] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  var milestone: js.UndefOr[Double] = js.undefined
  var owner: String
  var repo: String
  var title: String
}

object IssuesCreateEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    title: String,
    assignee: String = null,
    assignees: js.Array[String] = null,
    body: String = null,
    labels: js.Array[String] = null,
    milestone: Int | Double = null
  ): IssuesCreateEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, title = title)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (assignees != null) __obj.updateDynamic("assignees")(assignees)
    if (body != null) __obj.updateDynamic("body")(body)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCreateEndpoint]
  }
}


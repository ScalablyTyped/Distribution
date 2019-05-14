package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreate_Options extends js.Object {
  var assignee: js.UndefOr[java.lang.String] = js.undefined
  var assignees: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var body: js.UndefOr[java.lang.String] = js.undefined
  var labels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var milestone: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  var title: java.lang.String
}

object IssuesCreate_Options {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    title: java.lang.String,
    assignee: java.lang.String = null,
    assignees: js.Array[java.lang.String] = null,
    body: java.lang.String = null,
    labels: js.Array[java.lang.String] = null,
    milestone: scala.Int | scala.Double = null
  ): IssuesCreate_Options = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, title = title)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (assignees != null) __obj.updateDynamic("assignees")(assignees)
    if (body != null) __obj.updateDynamic("body")(body)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCreate_Options]
  }
}


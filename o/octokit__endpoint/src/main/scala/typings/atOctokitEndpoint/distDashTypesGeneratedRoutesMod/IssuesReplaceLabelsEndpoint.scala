package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesReplaceLabelsEndpoint extends js.Object {
  var issue_number: Double
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var repo: String
}

object IssuesReplaceLabelsEndpoint {
  @scala.inline
  def apply(
    issue_number: Double,
    owner: String,
    repo: String,
    labels: js.Array[String] = null,
    number: Int | Double = null
  ): IssuesReplaceLabelsEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesReplaceLabelsEndpoint]
  }
}


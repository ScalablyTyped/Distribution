package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesAddLabelsEndpoint extends js.Object {
  var issue_number: Double
  var labels: js.Array[String]
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var repo: String
}

object IssuesAddLabelsEndpoint {
  @scala.inline
  def apply(
    issue_number: Double,
    labels: js.Array[String],
    owner: String,
    repo: String,
    number: Int | Double = null
  ): IssuesAddLabelsEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, labels = labels, owner = owner, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesAddLabelsEndpoint]
  }
}


package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesReplaceLabelsEndpoint extends js.Object {
  var issue_number: scala.Double
  var labels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesReplaceLabelsEndpoint {
  @scala.inline
  def apply(
    issue_number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    labels: js.Array[java.lang.String] = null,
    number: scala.Int | scala.Double = null
  ): IssuesReplaceLabelsEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesReplaceLabelsEndpoint]
  }
}


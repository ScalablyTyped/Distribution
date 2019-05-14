package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesAddLabels_Options extends js.Object {
  var issue_number: scala.Double
  var labels: js.Array[java.lang.String]
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesAddLabels_Options {
  @scala.inline
  def apply(
    issue_number: scala.Double,
    labels: js.Array[java.lang.String],
    owner: java.lang.String,
    repo: java.lang.String,
    number: scala.Int | scala.Double = null
  ): IssuesAddLabels_Options = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, labels = labels, owner = owner, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesAddLabels_Options]
  }
}


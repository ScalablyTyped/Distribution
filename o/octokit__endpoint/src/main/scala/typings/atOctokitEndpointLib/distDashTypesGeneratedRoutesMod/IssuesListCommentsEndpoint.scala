package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListCommentsEndpoint extends js.Object {
  var issue_number: scala.Double
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
  var since: js.UndefOr[java.lang.String] = js.undefined
}

object IssuesListCommentsEndpoint {
  @scala.inline
  def apply(
    issue_number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    number: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    since: java.lang.String = null
  ): IssuesListCommentsEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[IssuesListCommentsEndpoint]
  }
}


package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsListForIssueEndpoint extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var issue_number: scala.Double
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
}

object ReactionsListForIssueEndpoint {
  @scala.inline
  def apply(
    issue_number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    content: java.lang.String = null,
    number: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ReactionsListForIssueEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (content != null) __obj.updateDynamic("content")(content)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsListForIssueEndpoint]
  }
}


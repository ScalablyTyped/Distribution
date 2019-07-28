package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsListForIssueEndpoint extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var issue_number: Double
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object ReactionsListForIssueEndpoint {
  @scala.inline
  def apply(
    issue_number: Double,
    owner: String,
    repo: String,
    content: String = null,
    number: Int | Double = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReactionsListForIssueEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (content != null) __obj.updateDynamic("content")(content)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsListForIssueEndpoint]
  }
}


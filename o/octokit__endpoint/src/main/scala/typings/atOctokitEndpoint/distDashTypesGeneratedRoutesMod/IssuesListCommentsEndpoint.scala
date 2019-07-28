package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListCommentsEndpoint extends js.Object {
  var issue_number: Double
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  var since: js.UndefOr[String] = js.undefined
}

object IssuesListCommentsEndpoint {
  @scala.inline
  def apply(
    issue_number: Double,
    owner: String,
    repo: String,
    number: Int | Double = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    since: String = null
  ): IssuesListCommentsEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[IssuesListCommentsEndpoint]
  }
}


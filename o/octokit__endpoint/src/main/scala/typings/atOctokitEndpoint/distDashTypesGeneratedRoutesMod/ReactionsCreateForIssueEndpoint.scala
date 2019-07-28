package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForIssueEndpoint extends js.Object {
  var content: String
  var issue_number: Double
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var repo: String
}

object ReactionsCreateForIssueEndpoint {
  @scala.inline
  def apply(content: String, issue_number: Double, owner: String, repo: String, number: Int | Double = null): ReactionsCreateForIssueEndpoint = {
    val __obj = js.Dynamic.literal(content = content, issue_number = issue_number, owner = owner, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsCreateForIssueEndpoint]
  }
}


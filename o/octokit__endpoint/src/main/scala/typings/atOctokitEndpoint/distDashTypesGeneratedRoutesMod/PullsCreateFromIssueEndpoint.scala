package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateFromIssueEndpoint extends js.Object {
  var base: String
  var draft: js.UndefOr[Boolean] = js.undefined
  var head: String
  var issue: Double
  var maintainer_can_modify: js.UndefOr[Boolean] = js.undefined
  var owner: String
  var repo: String
}

object PullsCreateFromIssueEndpoint {
  @scala.inline
  def apply(
    base: String,
    head: String,
    issue: Double,
    owner: String,
    repo: String,
    draft: js.UndefOr[Boolean] = js.undefined,
    maintainer_can_modify: js.UndefOr[Boolean] = js.undefined
  ): PullsCreateFromIssueEndpoint = {
    val __obj = js.Dynamic.literal(base = base, head = head, issue = issue, owner = owner, repo = repo)
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft)
    if (!js.isUndefined(maintainer_can_modify)) __obj.updateDynamic("maintainer_can_modify")(maintainer_can_modify)
    __obj.asInstanceOf[PullsCreateFromIssueEndpoint]
  }
}


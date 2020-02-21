package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateFromIssueParams extends js.Object {
  var base: String
  var draft: js.UndefOr[Boolean] = js.undefined
  var head: String
  var issue: Double
  var maintainer_can_modify: js.UndefOr[Boolean] = js.undefined
  var owner: String
  var repo: String
}

object PullsCreateFromIssueParams {
  @scala.inline
  def apply(
    base: String,
    head: String,
    issue: Double,
    owner: String,
    repo: String,
    draft: js.UndefOr[Boolean] = js.undefined,
    maintainer_can_modify: js.UndefOr[Boolean] = js.undefined
  ): PullsCreateFromIssueParams = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft.asInstanceOf[js.Any])
    if (!js.isUndefined(maintainer_can_modify)) __obj.updateDynamic("maintainer_can_modify")(maintainer_can_modify.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateFromIssueParams]
  }
}


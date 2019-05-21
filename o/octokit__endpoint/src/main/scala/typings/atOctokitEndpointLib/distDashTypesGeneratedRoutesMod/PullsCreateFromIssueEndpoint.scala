package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateFromIssueEndpoint extends js.Object {
  var base: java.lang.String
  var draft: js.UndefOr[scala.Boolean] = js.undefined
  var head: java.lang.String
  var issue: scala.Double
  var maintainer_can_modify: js.UndefOr[scala.Boolean] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object PullsCreateFromIssueEndpoint {
  @scala.inline
  def apply(
    base: java.lang.String,
    head: java.lang.String,
    issue: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    draft: js.UndefOr[scala.Boolean] = js.undefined,
    maintainer_can_modify: js.UndefOr[scala.Boolean] = js.undefined
  ): PullsCreateFromIssueEndpoint = {
    val __obj = js.Dynamic.literal(base = base, head = head, issue = issue, owner = owner, repo = repo)
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft)
    if (!js.isUndefined(maintainer_can_modify)) __obj.updateDynamic("maintainer_can_modify")(maintainer_can_modify)
    __obj.asInstanceOf[PullsCreateFromIssueEndpoint]
  }
}


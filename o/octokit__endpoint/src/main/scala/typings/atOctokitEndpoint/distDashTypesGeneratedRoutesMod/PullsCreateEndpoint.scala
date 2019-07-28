package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateEndpoint extends js.Object {
  var base: String
  var body: js.UndefOr[String] = js.undefined
  var draft: js.UndefOr[Boolean] = js.undefined
  var head: String
  var maintainer_can_modify: js.UndefOr[Boolean] = js.undefined
  var owner: String
  var repo: String
  var title: String
}

object PullsCreateEndpoint {
  @scala.inline
  def apply(
    base: String,
    head: String,
    owner: String,
    repo: String,
    title: String,
    body: String = null,
    draft: js.UndefOr[Boolean] = js.undefined,
    maintainer_can_modify: js.UndefOr[Boolean] = js.undefined
  ): PullsCreateEndpoint = {
    val __obj = js.Dynamic.literal(base = base, head = head, owner = owner, repo = repo, title = title)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft)
    if (!js.isUndefined(maintainer_can_modify)) __obj.updateDynamic("maintainer_can_modify")(maintainer_can_modify)
    __obj.asInstanceOf[PullsCreateEndpoint]
  }
}


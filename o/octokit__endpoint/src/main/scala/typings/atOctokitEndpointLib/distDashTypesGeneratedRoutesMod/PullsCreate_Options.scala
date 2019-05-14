package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreate_Options extends js.Object {
  var base: java.lang.String
  var body: js.UndefOr[java.lang.String] = js.undefined
  var draft: js.UndefOr[scala.Boolean] = js.undefined
  var head: java.lang.String
  var maintainer_can_modify: js.UndefOr[scala.Boolean] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  var title: java.lang.String
}

object PullsCreate_Options {
  @scala.inline
  def apply(
    base: java.lang.String,
    head: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    title: java.lang.String,
    body: java.lang.String = null,
    draft: js.UndefOr[scala.Boolean] = js.undefined,
    maintainer_can_modify: js.UndefOr[scala.Boolean] = js.undefined
  ): PullsCreate_Options = {
    val __obj = js.Dynamic.literal(base = base, head = head, owner = owner, repo = repo, title = title)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft)
    if (!js.isUndefined(maintainer_can_modify)) __obj.updateDynamic("maintainer_can_modify")(maintainer_can_modify)
    __obj.asInstanceOf[PullsCreate_Options]
  }
}


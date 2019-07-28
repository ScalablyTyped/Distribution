package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListBranchesEndpoint extends js.Object {
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var `protected`: js.UndefOr[Boolean] = js.undefined
  var repo: String
}

object ReposListBranchesEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    page: Int | Double = null,
    per_page: Int | Double = null,
    `protected`: js.UndefOr[Boolean] = js.undefined
  ): ReposListBranchesEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (!js.isUndefined(`protected`)) __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[ReposListBranchesEndpoint]
  }
}


package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListProtectedBranchTeamRestrictionsEndpoint extends js.Object {
  var branch: String
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object ReposListProtectedBranchTeamRestrictionsEndpoint {
  @scala.inline
  def apply(
    branch: String,
    owner: String,
    repo: String,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReposListProtectedBranchTeamRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListProtectedBranchTeamRestrictionsEndpoint]
  }
}


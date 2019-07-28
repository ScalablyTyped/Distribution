package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListProtectedBranchTeamRestrictionsParams extends js.Object {
  var branch: String
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object ReposListProtectedBranchTeamRestrictionsParams {
  @scala.inline
  def apply(
    branch: String,
    owner: String,
    repo: String,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReposListProtectedBranchTeamRestrictionsParams = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListProtectedBranchTeamRestrictionsParams]
  }
}


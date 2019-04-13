package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionParams extends js.Object {
  var branch: java.lang.String
  /**
    * Enforce all configured restrictions for administrators. Set to `true` to enforce required status checks for repository administrators. Set to `null` to disable.
    */
  var enforce_admins: scala.Boolean | scala.Null
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * Require at least one approving review on a pull request, before merging. Set to `null` to disable.
    */
  var required_pull_request_reviews: ReposUpdateBranchProtectionParamsRequiredPullRequestReviews | scala.Null
  /**
    * Require status checks to pass before merging. Set to `null` to disable.
    */
  var required_status_checks: ReposUpdateBranchProtectionParamsRequiredStatusChecks | scala.Null
  /**
    * Restrict who can push to this branch. Team and user `restrictions` are only available for organization-owned repositories. Set to `null` to disable.
    */
  var restrictions: ReposUpdateBranchProtectionParamsRestrictions | scala.Null
}

object ReposUpdateBranchProtectionParams {
  @scala.inline
  def apply(
    branch: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    enforce_admins: js.UndefOr[scala.Boolean] = js.undefined,
    required_pull_request_reviews: ReposUpdateBranchProtectionParamsRequiredPullRequestReviews = null,
    required_status_checks: ReposUpdateBranchProtectionParamsRequiredStatusChecks = null,
    restrictions: ReposUpdateBranchProtectionParamsRestrictions = null
  ): ReposUpdateBranchProtectionParams = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
    if (!js.isUndefined(enforce_admins)) __obj.updateDynamic("enforce_admins")(enforce_admins)
    if (required_pull_request_reviews != null) __obj.updateDynamic("required_pull_request_reviews")(required_pull_request_reviews)
    if (required_status_checks != null) __obj.updateDynamic("required_status_checks")(required_status_checks)
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions)
    __obj.asInstanceOf[ReposUpdateBranchProtectionParams]
  }
}


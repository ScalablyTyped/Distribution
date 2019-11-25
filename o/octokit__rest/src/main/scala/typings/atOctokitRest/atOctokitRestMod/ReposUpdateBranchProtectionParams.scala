package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionParams extends js.Object {
  var branch: String
  /**
    * Enforce all configured restrictions for administrators. Set to `true` to enforce required status checks for repository administrators. Set to `null` to disable.
    */
  var enforce_admins: Boolean | Null
  var owner: String
  var repo: String
  /**
    * Require at least one approving review on a pull request, before merging. Set to `null` to disable.
    */
  var required_pull_request_reviews: ReposUpdateBranchProtectionParamsRequiredPullRequestReviews | Null
  /**
    * Require status checks to pass before merging. Set to `null` to disable.
    */
  var required_status_checks: ReposUpdateBranchProtectionParamsRequiredStatusChecks | Null
  /**
    * Restrict who can push to this branch. User, app, and team `restrictions` are only available for organization-owned repositories. Set to `null` to disable.
    */
  var restrictions: ReposUpdateBranchProtectionParamsRestrictions | Null
}

object ReposUpdateBranchProtectionParams {
  @scala.inline
  def apply(
    branch: String,
    owner: String,
    repo: String,
    enforce_admins: js.UndefOr[Boolean] = js.undefined,
    required_pull_request_reviews: ReposUpdateBranchProtectionParamsRequiredPullRequestReviews = null,
    required_status_checks: ReposUpdateBranchProtectionParamsRequiredStatusChecks = null,
    restrictions: ReposUpdateBranchProtectionParamsRestrictions = null
  ): ReposUpdateBranchProtectionParams = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (!js.isUndefined(enforce_admins)) __obj.updateDynamic("enforce_admins")(enforce_admins.asInstanceOf[js.Any])
    if (required_pull_request_reviews != null) __obj.updateDynamic("required_pull_request_reviews")(required_pull_request_reviews.asInstanceOf[js.Any])
    if (required_status_checks != null) __obj.updateDynamic("required_status_checks")(required_status_checks.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionParams]
  }
}


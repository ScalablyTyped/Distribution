package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionParams extends js.Object {
  /**
    * Allows deletion of the protected branch by anyone with write access to the repository. Set to `false` to prevent deletion of the protected branch. Default: `false`. For more information, see "[Enabling force pushes to a protected branch](https://help.github.com/en/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)" in the GitHub Help documentation.
    */
  var allow_deletions: js.UndefOr[Boolean] = js.undefined
  /**
    * Permits force pushes to the protected branch by anyone with write access to the repository. Set to `true` to allow force pushes. Set to `false` or `null` to block force pushes. Default: `false`. For more information, see "[Enabling force pushes to a protected branch](https://help.github.com/en/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)" in the GitHub Help documentation."
    */
  var allow_force_pushes: js.UndefOr[Boolean | Null] = js.undefined
  var branch: String
  /**
    * Enforce all configured restrictions for administrators. Set to `true` to enforce required status checks for repository administrators. Set to `null` to disable.
    */
  var enforce_admins: Boolean | Null
  var owner: String
  var repo: String
  /**
    * Enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch. Set to `true` to enforce a linear commit history. Set to `false` to disable a linear commit Git history. Your repository must allow squash merging or rebase merging before you can enable a linear commit history. Default: `false`. For more information, see "[Requiring a linear commit history](https://help.github.com/github/administering-a-repository/requiring-a-linear-commit-history)" in the GitHub Help documentation.
    */
  var required_linear_history: js.UndefOr[Boolean] = js.undefined
  /**
    * Require at least one approving review on a pull request, before merging. Set to `null` to disable.
    */
  var required_pull_request_reviews: ReposUpdateBranchProtectionParamsRequiredPullRequestReviews | Null
  /**
    * Require status checks to pass before merging. Set to `null` to disable.
    */
  var required_status_checks: ReposUpdateBranchProtectionParamsRequiredStatusChecks | Null
  /**
    * Restrict who can push to the protected branch. User, app, and team `restrictions` are only available for organization-owned repositories. Set to `null` to disable.
    */
  var restrictions: ReposUpdateBranchProtectionParamsRestrictions | Null
}

object ReposUpdateBranchProtectionParams {
  @scala.inline
  def apply(
    branch: String,
    owner: String,
    repo: String,
    allow_deletions: js.UndefOr[Boolean] = js.undefined,
    allow_force_pushes: js.UndefOr[Boolean] = js.undefined,
    enforce_admins: js.UndefOr[Boolean] = js.undefined,
    required_linear_history: js.UndefOr[Boolean] = js.undefined,
    required_pull_request_reviews: ReposUpdateBranchProtectionParamsRequiredPullRequestReviews = null,
    required_status_checks: ReposUpdateBranchProtectionParamsRequiredStatusChecks = null,
    restrictions: ReposUpdateBranchProtectionParamsRestrictions = null
  ): ReposUpdateBranchProtectionParams = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_deletions)) __obj.updateDynamic("allow_deletions")(allow_deletions.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_force_pushes)) __obj.updateDynamic("allow_force_pushes")(allow_force_pushes.asInstanceOf[js.Any])
    if (!js.isUndefined(enforce_admins)) __obj.updateDynamic("enforce_admins")(enforce_admins.asInstanceOf[js.Any])
    if (!js.isUndefined(required_linear_history)) __obj.updateDynamic("required_linear_history")(required_linear_history.asInstanceOf[js.Any])
    if (required_pull_request_reviews != null) __obj.updateDynamic("required_pull_request_reviews")(required_pull_request_reviews.asInstanceOf[js.Any])
    if (required_status_checks != null) __obj.updateDynamic("required_status_checks")(required_status_checks.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionParams]
  }
}


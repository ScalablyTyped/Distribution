package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateProtectedBranchPullRequestReviewEnforcementParams extends js.Object {
  var branch: java.lang.String
  /**
    * Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit.
    */
  var dismiss_stale_reviews: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify which users and teams can dismiss pull request reviews. Pass an empty `dismissal_restrictions` object to disable. User and team `dismissal_restrictions` are only available for organization-owned repositories. Omit this parameter for personal repositories.
    */
  var dismissal_restrictions: js.UndefOr[
    ReposUpdateProtectedBranchPullRequestReviewEnforcementParamsDismissalRestrictions
  ] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * Blocks merging pull requests until [code owners](https://help.github.com/articles/about-code-owners/) have reviewed.
    */
  var require_code_owner_reviews: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies the number of reviewers required to approve pull requests. Use a number between 1 and 6.
    */
  var required_approving_review_count: js.UndefOr[scala.Double] = js.undefined
}

object ReposUpdateProtectedBranchPullRequestReviewEnforcementParams {
  @scala.inline
  def apply(
    branch: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    dismiss_stale_reviews: js.UndefOr[scala.Boolean] = js.undefined,
    dismissal_restrictions: ReposUpdateProtectedBranchPullRequestReviewEnforcementParamsDismissalRestrictions = null,
    require_code_owner_reviews: js.UndefOr[scala.Boolean] = js.undefined,
    required_approving_review_count: scala.Int | scala.Double = null
  ): ReposUpdateProtectedBranchPullRequestReviewEnforcementParams = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
    if (!js.isUndefined(dismiss_stale_reviews)) __obj.updateDynamic("dismiss_stale_reviews")(dismiss_stale_reviews)
    if (dismissal_restrictions != null) __obj.updateDynamic("dismissal_restrictions")(dismissal_restrictions)
    if (!js.isUndefined(require_code_owner_reviews)) __obj.updateDynamic("require_code_owner_reviews")(require_code_owner_reviews)
    if (required_approving_review_count != null) __obj.updateDynamic("required_approving_review_count")(required_approving_review_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateProtectedBranchPullRequestReviewEnforcementParams]
  }
}


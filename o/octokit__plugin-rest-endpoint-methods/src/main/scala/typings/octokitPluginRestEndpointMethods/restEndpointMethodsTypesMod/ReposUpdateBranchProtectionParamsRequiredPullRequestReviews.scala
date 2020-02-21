package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionParamsRequiredPullRequestReviews extends js.Object {
  /**
    * Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit.
    */
  var dismiss_stale_reviews: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify which users and teams can dismiss pull request reviews. Pass an empty `dismissal_restrictions` object to disable. User and team `dismissal_restrictions` are only available for organization-owned repositories. Omit this parameter for personal repositories.
    */
  var dismissal_restrictions: js.UndefOr[ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions] = js.undefined
  /**
    * Blocks merging pull requests until [code owners](https://help.github.com/articles/about-code-owners/) review them.
    */
  var require_code_owner_reviews: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the number of reviewers required to approve pull requests. Use a number between 1 and 6.
    */
  var required_approving_review_count: js.UndefOr[Double] = js.undefined
}

object ReposUpdateBranchProtectionParamsRequiredPullRequestReviews {
  @scala.inline
  def apply(
    dismiss_stale_reviews: js.UndefOr[Boolean] = js.undefined,
    dismissal_restrictions: ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions = null,
    require_code_owner_reviews: js.UndefOr[Boolean] = js.undefined,
    required_approving_review_count: Int | Double = null
  ): ReposUpdateBranchProtectionParamsRequiredPullRequestReviews = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dismiss_stale_reviews)) __obj.updateDynamic("dismiss_stale_reviews")(dismiss_stale_reviews.asInstanceOf[js.Any])
    if (dismissal_restrictions != null) __obj.updateDynamic("dismissal_restrictions")(dismissal_restrictions.asInstanceOf[js.Any])
    if (!js.isUndefined(require_code_owner_reviews)) __obj.updateDynamic("require_code_owner_reviews")(require_code_owner_reviews.asInstanceOf[js.Any])
    if (required_approving_review_count != null) __obj.updateDynamic("required_approving_review_count")(required_approving_review_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRequiredPullRequestReviews]
  }
}


package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionParamsRequiredPullRequestReviews extends js.Object {
  var dismiss_stale_reviews: js.UndefOr[Boolean] = js.undefined
  var dismissal_restrictions: js.UndefOr[ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions] = js.undefined
  var require_code_owner_reviews: js.UndefOr[Boolean] = js.undefined
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
    if (!js.isUndefined(dismiss_stale_reviews)) __obj.updateDynamic("dismiss_stale_reviews")(dismiss_stale_reviews)
    if (dismissal_restrictions != null) __obj.updateDynamic("dismissal_restrictions")(dismissal_restrictions)
    if (!js.isUndefined(require_code_owner_reviews)) __obj.updateDynamic("require_code_owner_reviews")(require_code_owner_reviews)
    if (required_approving_review_count != null) __obj.updateDynamic("required_approving_review_count")(required_approving_review_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRequiredPullRequestReviews]
  }
}


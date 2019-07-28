package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchProtectionResponseRequiredPullRequestReviews extends js.Object {
  var dismiss_stale_reviews: Boolean
  var dismissal_restrictions: ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions
  var require_code_owner_reviews: Boolean
  var required_approving_review_count: Double
  var url: String
}

object ReposGetBranchProtectionResponseRequiredPullRequestReviews {
  @scala.inline
  def apply(
    dismiss_stale_reviews: Boolean,
    dismissal_restrictions: ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions,
    require_code_owner_reviews: Boolean,
    required_approving_review_count: Double,
    url: String
  ): ReposGetBranchProtectionResponseRequiredPullRequestReviews = {
    val __obj = js.Dynamic.literal(dismiss_stale_reviews = dismiss_stale_reviews, dismissal_restrictions = dismissal_restrictions, require_code_owner_reviews = require_code_owner_reviews, required_approving_review_count = required_approving_review_count, url = url)
  
    __obj.asInstanceOf[ReposGetBranchProtectionResponseRequiredPullRequestReviews]
  }
}


package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateProtectedBranchPullRequestReviewEnforcementResponse extends js.Object {
  var dismiss_stale_reviews: Boolean
  var dismissal_restrictions: ReposUpdateProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictions
  var require_code_owner_reviews: Boolean
  var required_approving_review_count: Double
  var url: String
}

object ReposUpdateProtectedBranchPullRequestReviewEnforcementResponse {
  @scala.inline
  def apply(
    dismiss_stale_reviews: Boolean,
    dismissal_restrictions: ReposUpdateProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictions,
    require_code_owner_reviews: Boolean,
    required_approving_review_count: Double,
    url: String
  ): ReposUpdateProtectedBranchPullRequestReviewEnforcementResponse = {
    val __obj = js.Dynamic.literal(dismiss_stale_reviews = dismiss_stale_reviews.asInstanceOf[js.Any], dismissal_restrictions = dismissal_restrictions.asInstanceOf[js.Any], require_code_owner_reviews = require_code_owner_reviews.asInstanceOf[js.Any], required_approving_review_count = required_approving_review_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateProtectedBranchPullRequestReviewEnforcementResponse]
  }
}


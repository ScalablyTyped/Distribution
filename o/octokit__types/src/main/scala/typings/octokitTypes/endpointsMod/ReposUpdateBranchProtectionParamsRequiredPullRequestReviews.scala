package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdateBranchProtectionParamsRequiredPullRequestReviews extends StObject {
  
  var dismiss_stale_reviews: js.UndefOr[Boolean] = js.native
  
  var dismissal_restrictions: js.UndefOr[ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions] = js.native
  
  var require_code_owner_reviews: js.UndefOr[Boolean] = js.native
  
  var required_approving_review_count: js.UndefOr[Double] = js.native
}
object ReposUpdateBranchProtectionParamsRequiredPullRequestReviews {
  
  @scala.inline
  def apply(): ReposUpdateBranchProtectionParamsRequiredPullRequestReviews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRequiredPullRequestReviews]
  }
  
  @scala.inline
  implicit class ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsMutableBuilder[Self <: ReposUpdateBranchProtectionParamsRequiredPullRequestReviews] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDismiss_stale_reviews(value: Boolean): Self = StObject.set(x, "dismiss_stale_reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismiss_stale_reviewsUndefined: Self = StObject.set(x, "dismiss_stale_reviews", js.undefined)
    
    @scala.inline
    def setDismissal_restrictions(value: ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions): Self = StObject.set(x, "dismissal_restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissal_restrictionsUndefined: Self = StObject.set(x, "dismissal_restrictions", js.undefined)
    
    @scala.inline
    def setRequire_code_owner_reviews(value: Boolean): Self = StObject.set(x, "require_code_owner_reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_code_owner_reviewsUndefined: Self = StObject.set(x, "require_code_owner_reviews", js.undefined)
    
    @scala.inline
    def setRequired_approving_review_count(value: Double): Self = StObject.set(x, "required_approving_review_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_approving_review_countUndefined: Self = StObject.set(x, "required_approving_review_count", js.undefined)
  }
}

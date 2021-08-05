package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposUpdateBranchProtectionParamsRequiredPullRequestReviews extends StObject {
  
  var dismiss_stale_reviews: js.UndefOr[Boolean] = js.undefined
  
  var dismissal_restrictions: js.UndefOr[ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions] = js.undefined
  
  var require_code_owner_reviews: js.UndefOr[Boolean] = js.undefined
  
  var required_approving_review_count: js.UndefOr[Double] = js.undefined
}
object ReposUpdateBranchProtectionParamsRequiredPullRequestReviews {
  
  inline def apply(): ReposUpdateBranchProtectionParamsRequiredPullRequestReviews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRequiredPullRequestReviews]
  }
  
  extension [Self <: ReposUpdateBranchProtectionParamsRequiredPullRequestReviews](x: Self) {
    
    inline def setDismiss_stale_reviews(value: Boolean): Self = StObject.set(x, "dismiss_stale_reviews", value.asInstanceOf[js.Any])
    
    inline def setDismiss_stale_reviewsUndefined: Self = StObject.set(x, "dismiss_stale_reviews", js.undefined)
    
    inline def setDismissal_restrictions(value: ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions): Self = StObject.set(x, "dismissal_restrictions", value.asInstanceOf[js.Any])
    
    inline def setDismissal_restrictionsUndefined: Self = StObject.set(x, "dismissal_restrictions", js.undefined)
    
    inline def setRequire_code_owner_reviews(value: Boolean): Self = StObject.set(x, "require_code_owner_reviews", value.asInstanceOf[js.Any])
    
    inline def setRequire_code_owner_reviewsUndefined: Self = StObject.set(x, "require_code_owner_reviews", js.undefined)
    
    inline def setRequired_approving_review_count(value: Double): Self = StObject.set(x, "required_approving_review_count", value.asInstanceOf[js.Any])
    
    inline def setRequired_approving_review_countUndefined: Self = StObject.set(x, "required_approving_review_count", js.undefined)
  }
}

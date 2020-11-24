package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdateBranchProtectionParamsRequiredPullRequestReviews extends js.Object {
  
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
  implicit class ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsOps[Self <: ReposUpdateBranchProtectionParamsRequiredPullRequestReviews] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDismiss_stale_reviews(value: Boolean): Self = this.set("dismiss_stale_reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismiss_stale_reviews: Self = this.set("dismiss_stale_reviews", js.undefined)
    
    @scala.inline
    def setDismissal_restrictions(value: ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions): Self = this.set("dismissal_restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissal_restrictions: Self = this.set("dismissal_restrictions", js.undefined)
    
    @scala.inline
    def setRequire_code_owner_reviews(value: Boolean): Self = this.set("require_code_owner_reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequire_code_owner_reviews: Self = this.set("require_code_owner_reviews", js.undefined)
    
    @scala.inline
    def setRequired_approving_review_count(value: Double): Self = this.set("required_approving_review_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired_approving_review_count: Self = this.set("required_approving_review_count", js.undefined)
  }
}

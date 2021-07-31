package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Teams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetPullRequestReviewProtectionResponseData extends StObject {
  
  var dismiss_stale_reviews: Boolean
  
  var dismissal_restrictions: Teams
  
  var require_code_owner_reviews: Boolean
  
  var required_approving_review_count: Double
  
  var url: String
}
object ReposGetPullRequestReviewProtectionResponseData {
  
  @scala.inline
  def apply(
    dismiss_stale_reviews: Boolean,
    dismissal_restrictions: Teams,
    require_code_owner_reviews: Boolean,
    required_approving_review_count: Double,
    url: String
  ): ReposGetPullRequestReviewProtectionResponseData = {
    val __obj = js.Dynamic.literal(dismiss_stale_reviews = dismiss_stale_reviews.asInstanceOf[js.Any], dismissal_restrictions = dismissal_restrictions.asInstanceOf[js.Any], require_code_owner_reviews = require_code_owner_reviews.asInstanceOf[js.Any], required_approving_review_count = required_approving_review_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetPullRequestReviewProtectionResponseData]
  }
  
  @scala.inline
  implicit class ReposGetPullRequestReviewProtectionResponseDataMutableBuilder[Self <: ReposGetPullRequestReviewProtectionResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDismiss_stale_reviews(value: Boolean): Self = StObject.set(x, "dismiss_stale_reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissal_restrictions(value: Teams): Self = StObject.set(x, "dismissal_restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_code_owner_reviews(value: Boolean): Self = StObject.set(x, "require_code_owner_reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_approving_review_count(value: Double): Self = StObject.set(x, "required_approving_review_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

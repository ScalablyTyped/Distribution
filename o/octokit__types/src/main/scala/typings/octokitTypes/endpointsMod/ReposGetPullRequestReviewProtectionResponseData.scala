package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Teams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetPullRequestReviewProtectionResponseData extends js.Object {
  
  var dismiss_stale_reviews: Boolean = js.native
  
  var dismissal_restrictions: Teams = js.native
  
  var require_code_owner_reviews: Boolean = js.native
  
  var required_approving_review_count: Double = js.native
  
  var url: String = js.native
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
  implicit class ReposGetPullRequestReviewProtectionResponseDataOps[Self <: ReposGetPullRequestReviewProtectionResponseData] (val x: Self) extends AnyVal {
    
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
    def setDismissal_restrictions(value: Teams): Self = this.set("dismissal_restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_code_owner_reviews(value: Boolean): Self = this.set("require_code_owner_reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_approving_review_count(value: Double): Self = this.set("required_approving_review_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}

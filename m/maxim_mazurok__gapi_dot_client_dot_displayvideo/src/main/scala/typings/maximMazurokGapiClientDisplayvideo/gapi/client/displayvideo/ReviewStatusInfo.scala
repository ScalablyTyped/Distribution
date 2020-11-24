package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewStatusInfo extends js.Object {
  
  /** Represents the basic approval needed for a creative to begin serving. Summary of creative_and_landing_page_review_status and content_and_policy_review_status. */
  var approvalStatus: js.UndefOr[String] = js.native
  
  /** Content and policy review status for the creative. */
  var contentAndPolicyReviewStatus: js.UndefOr[String] = js.native
  
  /** Creative and landing page review status for the creative. */
  var creativeAndLandingPageReviewStatus: js.UndefOr[String] = js.native
  
  /** Exchange review statuses for the creative. */
  var exchangeReviewStatuses: js.UndefOr[js.Array[ExchangeReviewStatus]] = js.native
  
  /** Publisher review statuses for the creative. */
  var publisherReviewStatuses: js.UndefOr[js.Array[PublisherReviewStatus]] = js.native
}
object ReviewStatusInfo {
  
  @scala.inline
  def apply(): ReviewStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewStatusInfo]
  }
  
  @scala.inline
  implicit class ReviewStatusInfoOps[Self <: ReviewStatusInfo] (val x: Self) extends AnyVal {
    
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
    def setApprovalStatus(value: String): Self = this.set("approvalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovalStatus: Self = this.set("approvalStatus", js.undefined)
    
    @scala.inline
    def setContentAndPolicyReviewStatus(value: String): Self = this.set("contentAndPolicyReviewStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentAndPolicyReviewStatus: Self = this.set("contentAndPolicyReviewStatus", js.undefined)
    
    @scala.inline
    def setCreativeAndLandingPageReviewStatus(value: String): Self = this.set("creativeAndLandingPageReviewStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeAndLandingPageReviewStatus: Self = this.set("creativeAndLandingPageReviewStatus", js.undefined)
    
    @scala.inline
    def setExchangeReviewStatusesVarargs(value: ExchangeReviewStatus*): Self = this.set("exchangeReviewStatuses", js.Array(value :_*))
    
    @scala.inline
    def setExchangeReviewStatuses(value: js.Array[ExchangeReviewStatus]): Self = this.set("exchangeReviewStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchangeReviewStatuses: Self = this.set("exchangeReviewStatuses", js.undefined)
    
    @scala.inline
    def setPublisherReviewStatusesVarargs(value: PublisherReviewStatus*): Self = this.set("publisherReviewStatuses", js.Array(value :_*))
    
    @scala.inline
    def setPublisherReviewStatuses(value: js.Array[PublisherReviewStatus]): Self = this.set("publisherReviewStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherReviewStatuses: Self = this.set("publisherReviewStatuses", js.undefined)
  }
}

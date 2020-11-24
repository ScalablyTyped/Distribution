package typings.maximMazurokGapiClientFactchecktools.gapi.client.factchecktools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse extends js.Object {
  
  /** The result list of pages of `ClaimReview` markup. */
  var claimReviewMarkupPages: js.UndefOr[js.Array[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]] = js.native
  
  /** The next pagination token in the Search response. It should be used as the `page_token` for the following request. An empty value means no more results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse {
  
  @scala.inline
  def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse]
  }
  
  @scala.inline
  implicit class GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponseOps[Self <: GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse] (val x: Self) extends AnyVal {
    
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
    def setClaimReviewMarkupPagesVarargs(value: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage*): Self = this.set("claimReviewMarkupPages", js.Array(value :_*))
    
    @scala.inline
    def setClaimReviewMarkupPages(value: js.Array[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]): Self = this.set("claimReviewMarkupPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimReviewMarkupPages: Self = this.set("claimReviewMarkupPages", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}

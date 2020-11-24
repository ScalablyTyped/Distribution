package typings.maximMazurokGapiClientFactchecktools.gapi.client.factchecktools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview extends js.Object {
  
  /** The language this review was written in. For instance, "en" or "de". */
  var languageCode: js.UndefOr[String] = js.native
  
  /** The publisher of this claim review. */
  var publisher: js.UndefOr[GoogleFactcheckingFactchecktoolsV1alpha1Publisher] = js.native
  
  /** The date the claim was reviewed. */
  var reviewDate: js.UndefOr[String] = js.native
  
  /** Textual rating. For instance, "Mostly false". */
  var textualRating: js.UndefOr[String] = js.native
  
  /** The title of this claim review, if it can be determined. */
  var title: js.UndefOr[String] = js.native
  
  /** The URL of this claim review. */
  var url: js.UndefOr[String] = js.native
}
object GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview {
  
  @scala.inline
  def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]
  }
  
  @scala.inline
  implicit class GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewOps[Self <: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview] (val x: Self) extends AnyVal {
    
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
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setPublisher(value: GoogleFactcheckingFactchecktoolsV1alpha1Publisher): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    
    @scala.inline
    def setReviewDate(value: String): Self = this.set("reviewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReviewDate: Self = this.set("reviewDate", js.undefined)
    
    @scala.inline
    def setTextualRating(value: String): Self = this.set("textualRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextualRating: Self = this.set("textualRating", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}

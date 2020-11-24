package typings.maximMazurokGapiClientFactchecktools.gapi.client.factchecktools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating extends js.Object {
  
  /** For numeric ratings, the best value possible in the scale from worst to best. Corresponds to `ClaimReview.reviewRating.bestRating`. */
  var bestRating: js.UndefOr[Double] = js.native
  
  /** Corresponds to `ClaimReview.reviewRating.image`. */
  var imageUrl: js.UndefOr[String] = js.native
  
  /** Corresponds to `ClaimReview.reviewRating.ratingExplanation`. */
  var ratingExplanation: js.UndefOr[String] = js.native
  
  /** A numeric rating of this claim, in the range worstRating — bestRating inclusive. Corresponds to `ClaimReview.reviewRating.ratingValue`. */
  var ratingValue: js.UndefOr[Double] = js.native
  
  /** The truthfulness rating as a human-readible short word or phrase. Corresponds to `ClaimReview.reviewRating.alternateName`. */
  var textualRating: js.UndefOr[String] = js.native
  
  /** For numeric ratings, the worst value possible in the scale from worst to best. Corresponds to `ClaimReview.reviewRating.worstRating`. */
  var worstRating: js.UndefOr[Double] = js.native
}
object GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating {
  
  @scala.inline
  def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating]
  }
  
  @scala.inline
  implicit class GoogleFactcheckingFactchecktoolsV1alpha1ClaimRatingOps[Self <: GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating] (val x: Self) extends AnyVal {
    
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
    def setBestRating(value: Double): Self = this.set("bestRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBestRating: Self = this.set("bestRating", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setRatingExplanation(value: String): Self = this.set("ratingExplanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingExplanation: Self = this.set("ratingExplanation", js.undefined)
    
    @scala.inline
    def setRatingValue(value: Double): Self = this.set("ratingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingValue: Self = this.set("ratingValue", js.undefined)
    
    @scala.inline
    def setTextualRating(value: String): Self = this.set("textualRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextualRating: Self = this.set("textualRating", js.undefined)
    
    @scala.inline
    def setWorstRating(value: Double): Self = this.set("worstRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorstRating: Self = this.set("worstRating", js.undefined)
  }
}

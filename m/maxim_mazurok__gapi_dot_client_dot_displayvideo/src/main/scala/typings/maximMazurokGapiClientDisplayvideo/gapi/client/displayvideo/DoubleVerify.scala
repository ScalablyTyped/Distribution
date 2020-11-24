package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleVerify extends js.Object {
  
  /** Avoid bidding on apps with the star ratings. */
  var appStarRating: js.UndefOr[DoubleVerifyAppStarRating] = js.native
  
  /** Avoid bidding on apps with the age rating. */
  var avoidedAgeRatings: js.UndefOr[js.Array[String]] = js.native
  
  /** DV Brand Safety Controls. */
  var brandSafetyCategories: js.UndefOr[DoubleVerifyBrandSafetyCategories] = js.native
  
  /**
    * The custom segment ID provided by DoubleVerify. The ID must start with "51" and consist of eight digits. Custom segment ID cannot be specified along with any of the following
    * fields: * brand_safety_categories * avoided_age_ratings * app_star_rating * fraud_invalid_traffic
    */
  var customSegmentId: js.UndefOr[String] = js.native
  
  /** Display viewability settings (applicable to display line items only). */
  var displayViewability: js.UndefOr[DoubleVerifyDisplayViewability] = js.native
  
  /** Avoid Sites and Apps with historical Fraud & IVT Rates. */
  var fraudInvalidTraffic: js.UndefOr[DoubleVerifyFraudInvalidTraffic] = js.native
  
  /** Video viewability settings (applicable to video line items only). */
  var videoViewability: js.UndefOr[DoubleVerifyVideoViewability] = js.native
}
object DoubleVerify {
  
  @scala.inline
  def apply(): DoubleVerify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleVerify]
  }
  
  @scala.inline
  implicit class DoubleVerifyOps[Self <: DoubleVerify] (val x: Self) extends AnyVal {
    
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
    def setAppStarRating(value: DoubleVerifyAppStarRating): Self = this.set("appStarRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppStarRating: Self = this.set("appStarRating", js.undefined)
    
    @scala.inline
    def setAvoidedAgeRatingsVarargs(value: String*): Self = this.set("avoidedAgeRatings", js.Array(value :_*))
    
    @scala.inline
    def setAvoidedAgeRatings(value: js.Array[String]): Self = this.set("avoidedAgeRatings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidedAgeRatings: Self = this.set("avoidedAgeRatings", js.undefined)
    
    @scala.inline
    def setBrandSafetyCategories(value: DoubleVerifyBrandSafetyCategories): Self = this.set("brandSafetyCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrandSafetyCategories: Self = this.set("brandSafetyCategories", js.undefined)
    
    @scala.inline
    def setCustomSegmentId(value: String): Self = this.set("customSegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSegmentId: Self = this.set("customSegmentId", js.undefined)
    
    @scala.inline
    def setDisplayViewability(value: DoubleVerifyDisplayViewability): Self = this.set("displayViewability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayViewability: Self = this.set("displayViewability", js.undefined)
    
    @scala.inline
    def setFraudInvalidTraffic(value: DoubleVerifyFraudInvalidTraffic): Self = this.set("fraudInvalidTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFraudInvalidTraffic: Self = this.set("fraudInvalidTraffic", js.undefined)
    
    @scala.inline
    def setVideoViewability(value: DoubleVerifyVideoViewability): Self = this.set("videoViewability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoViewability: Self = this.set("videoViewability", js.undefined)
  }
}

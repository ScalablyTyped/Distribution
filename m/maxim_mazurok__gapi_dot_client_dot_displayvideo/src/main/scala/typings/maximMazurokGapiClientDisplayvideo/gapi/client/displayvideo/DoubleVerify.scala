package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleVerify extends StObject {
  
  /** Avoid bidding on apps with the star ratings. */
  var appStarRating: js.UndefOr[DoubleVerifyAppStarRating] = js.undefined
  
  /** Avoid bidding on apps with the age rating. */
  var avoidedAgeRatings: js.UndefOr[js.Array[String]] = js.undefined
  
  /** DV Brand Safety Controls. */
  var brandSafetyCategories: js.UndefOr[DoubleVerifyBrandSafetyCategories] = js.undefined
  
  /**
    * The custom segment ID provided by DoubleVerify. The ID must start with "51" and consist of eight digits. Custom segment ID cannot be specified along with any of the following
    * fields: * brand_safety_categories * avoided_age_ratings * app_star_rating * fraud_invalid_traffic
    */
  var customSegmentId: js.UndefOr[String] = js.undefined
  
  /** Display viewability settings (applicable to display line items only). */
  var displayViewability: js.UndefOr[DoubleVerifyDisplayViewability] = js.undefined
  
  /** Avoid Sites and Apps with historical Fraud & IVT Rates. */
  var fraudInvalidTraffic: js.UndefOr[DoubleVerifyFraudInvalidTraffic] = js.undefined
  
  /** Video viewability settings (applicable to video line items only). */
  var videoViewability: js.UndefOr[DoubleVerifyVideoViewability] = js.undefined
}
object DoubleVerify {
  
  inline def apply(): DoubleVerify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleVerify]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoubleVerify] (val x: Self) extends AnyVal {
    
    inline def setAppStarRating(value: DoubleVerifyAppStarRating): Self = StObject.set(x, "appStarRating", value.asInstanceOf[js.Any])
    
    inline def setAppStarRatingUndefined: Self = StObject.set(x, "appStarRating", js.undefined)
    
    inline def setAvoidedAgeRatings(value: js.Array[String]): Self = StObject.set(x, "avoidedAgeRatings", value.asInstanceOf[js.Any])
    
    inline def setAvoidedAgeRatingsUndefined: Self = StObject.set(x, "avoidedAgeRatings", js.undefined)
    
    inline def setAvoidedAgeRatingsVarargs(value: String*): Self = StObject.set(x, "avoidedAgeRatings", js.Array(value*))
    
    inline def setBrandSafetyCategories(value: DoubleVerifyBrandSafetyCategories): Self = StObject.set(x, "brandSafetyCategories", value.asInstanceOf[js.Any])
    
    inline def setBrandSafetyCategoriesUndefined: Self = StObject.set(x, "brandSafetyCategories", js.undefined)
    
    inline def setCustomSegmentId(value: String): Self = StObject.set(x, "customSegmentId", value.asInstanceOf[js.Any])
    
    inline def setCustomSegmentIdUndefined: Self = StObject.set(x, "customSegmentId", js.undefined)
    
    inline def setDisplayViewability(value: DoubleVerifyDisplayViewability): Self = StObject.set(x, "displayViewability", value.asInstanceOf[js.Any])
    
    inline def setDisplayViewabilityUndefined: Self = StObject.set(x, "displayViewability", js.undefined)
    
    inline def setFraudInvalidTraffic(value: DoubleVerifyFraudInvalidTraffic): Self = StObject.set(x, "fraudInvalidTraffic", value.asInstanceOf[js.Any])
    
    inline def setFraudInvalidTrafficUndefined: Self = StObject.set(x, "fraudInvalidTraffic", js.undefined)
    
    inline def setVideoViewability(value: DoubleVerifyVideoViewability): Self = StObject.set(x, "videoViewability", value.asInstanceOf[js.Any])
    
    inline def setVideoViewabilityUndefined: Self = StObject.set(x, "videoViewability", js.undefined)
  }
}

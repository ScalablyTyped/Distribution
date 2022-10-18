package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BestRating extends StObject {
  
  var `@type`: String
  
  var bestRating: js.UndefOr[String] = js.undefined
  
  var ratingCount: js.UndefOr[String] = js.undefined
  
  var ratingValue: String
  
  var reviewCount: js.UndefOr[String] = js.undefined
}
object BestRating {
  
  inline def apply(`@type`: String, ratingValue: String): BestRating = {
    val __obj = js.Dynamic.literal(ratingValue = ratingValue.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BestRating]
  }
  
  extension [Self <: BestRating](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setBestRating(value: String): Self = StObject.set(x, "bestRating", value.asInstanceOf[js.Any])
    
    inline def setBestRatingUndefined: Self = StObject.set(x, "bestRating", js.undefined)
    
    inline def setRatingCount(value: String): Self = StObject.set(x, "ratingCount", value.asInstanceOf[js.Any])
    
    inline def setRatingCountUndefined: Self = StObject.set(x, "ratingCount", js.undefined)
    
    inline def setRatingValue(value: String): Self = StObject.set(x, "ratingValue", value.asInstanceOf[js.Any])
    
    inline def setReviewCount(value: String): Self = StObject.set(x, "reviewCount", value.asInstanceOf[js.Any])
    
    inline def setReviewCountUndefined: Self = StObject.set(x, "reviewCount", js.undefined)
  }
}

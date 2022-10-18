package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RatingValue extends StObject {
  
  var `@type`: String
  
  var bestRating: js.UndefOr[String] = js.undefined
  
  var ratingValue: String
  
  var worstRating: js.UndefOr[String] = js.undefined
}
object RatingValue {
  
  inline def apply(`@type`: String, ratingValue: String): RatingValue = {
    val __obj = js.Dynamic.literal(ratingValue = ratingValue.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingValue]
  }
  
  extension [Self <: RatingValue](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setBestRating(value: String): Self = StObject.set(x, "bestRating", value.asInstanceOf[js.Any])
    
    inline def setBestRatingUndefined: Self = StObject.set(x, "bestRating", js.undefined)
    
    inline def setRatingValue(value: String): Self = StObject.set(x, "ratingValue", value.asInstanceOf[js.Any])
    
    inline def setWorstRating(value: String): Self = StObject.set(x, "worstRating", value.asInstanceOf[js.Any])
    
    inline def setWorstRatingUndefined: Self = StObject.set(x, "worstRating", js.undefined)
  }
}

package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateRating extends StObject {
  
  var bestRating: js.UndefOr[String] = js.undefined
  
  var ratingCount: js.UndefOr[String] = js.undefined
  
  var ratingValue: String
  
  var reviewCount: js.UndefOr[String] = js.undefined
}
object AggregateRating {
  
  inline def apply(ratingValue: String): AggregateRating = {
    val __obj = js.Dynamic.literal(ratingValue = ratingValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateRating]
  }
  
  extension [Self <: AggregateRating](x: Self) {
    
    inline def setBestRating(value: String): Self = StObject.set(x, "bestRating", value.asInstanceOf[js.Any])
    
    inline def setBestRatingUndefined: Self = StObject.set(x, "bestRating", js.undefined)
    
    inline def setRatingCount(value: String): Self = StObject.set(x, "ratingCount", value.asInstanceOf[js.Any])
    
    inline def setRatingCountUndefined: Self = StObject.set(x, "ratingCount", js.undefined)
    
    inline def setRatingValue(value: String): Self = StObject.set(x, "ratingValue", value.asInstanceOf[js.Any])
    
    inline def setReviewCount(value: String): Self = StObject.set(x, "reviewCount", value.asInstanceOf[js.Any])
    
    inline def setReviewCountUndefined: Self = StObject.set(x, "reviewCount", js.undefined)
  }
}

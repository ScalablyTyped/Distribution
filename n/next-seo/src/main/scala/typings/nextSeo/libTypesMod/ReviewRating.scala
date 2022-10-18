package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewRating extends StObject {
  
  var bestRating: js.UndefOr[String] = js.undefined
  
  var ratingValue: String
  
  var worstRating: js.UndefOr[String] = js.undefined
}
object ReviewRating {
  
  inline def apply(ratingValue: String): ReviewRating = {
    val __obj = js.Dynamic.literal(ratingValue = ratingValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewRating]
  }
  
  extension [Self <: ReviewRating](x: Self) {
    
    inline def setBestRating(value: String): Self = StObject.set(x, "bestRating", value.asInstanceOf[js.Any])
    
    inline def setBestRatingUndefined: Self = StObject.set(x, "bestRating", js.undefined)
    
    inline def setRatingValue(value: String): Self = StObject.set(x, "ratingValue", value.asInstanceOf[js.Any])
    
    inline def setWorstRating(value: String): Self = StObject.set(x, "worstRating", value.asInstanceOf[js.Any])
    
    inline def setWorstRatingUndefined: Self = StObject.set(x, "worstRating", js.undefined)
  }
}

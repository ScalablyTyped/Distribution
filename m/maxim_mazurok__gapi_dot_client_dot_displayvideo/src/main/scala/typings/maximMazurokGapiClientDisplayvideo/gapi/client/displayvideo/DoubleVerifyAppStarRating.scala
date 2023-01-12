package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleVerifyAppStarRating extends StObject {
  
  /** Avoid bidding on apps with insufficient star ratings. */
  var avoidInsufficientStarRating: js.UndefOr[Boolean] = js.undefined
  
  /** Avoid bidding on apps with the star ratings. */
  var avoidedStarRating: js.UndefOr[String] = js.undefined
}
object DoubleVerifyAppStarRating {
  
  inline def apply(): DoubleVerifyAppStarRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleVerifyAppStarRating]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoubleVerifyAppStarRating] (val x: Self) extends AnyVal {
    
    inline def setAvoidInsufficientStarRating(value: Boolean): Self = StObject.set(x, "avoidInsufficientStarRating", value.asInstanceOf[js.Any])
    
    inline def setAvoidInsufficientStarRatingUndefined: Self = StObject.set(x, "avoidInsufficientStarRating", js.undefined)
    
    inline def setAvoidedStarRating(value: String): Self = StObject.set(x, "avoidedStarRating", value.asInstanceOf[js.Any])
    
    inline def setAvoidedStarRatingUndefined: Self = StObject.set(x, "avoidedStarRating", js.undefined)
  }
}

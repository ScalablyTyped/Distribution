package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaContentRatingUnitedKingdom extends StObject {
  
  /**
    * Movies rating selected for United Kingdom. Possible values are: allAllowed, allBlocked, general, universalChildren,
    * parentalGuidance, agesAbove12Video, agesAbove12Cinema, agesAbove15, adults.
    */
  var movieRating: js.UndefOr[RatingUnitedKingdomMoviesType] = js.undefined
  
  // TV rating selected for United Kingdom. Possible values are: allAllowed, allBlocked, caution.
  var tvRating: js.UndefOr[RatingUnitedKingdomTelevisionType] = js.undefined
}
object MediaContentRatingUnitedKingdom {
  
  inline def apply(): MediaContentRatingUnitedKingdom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingUnitedKingdom]
  }
  
  extension [Self <: MediaContentRatingUnitedKingdom](x: Self) {
    
    inline def setMovieRating(value: RatingUnitedKingdomMoviesType): Self = StObject.set(x, "movieRating", value.asInstanceOf[js.Any])
    
    inline def setMovieRatingUndefined: Self = StObject.set(x, "movieRating", js.undefined)
    
    inline def setTvRating(value: RatingUnitedKingdomTelevisionType): Self = StObject.set(x, "tvRating", value.asInstanceOf[js.Any])
    
    inline def setTvRatingUndefined: Self = StObject.set(x, "tvRating", js.undefined)
  }
}

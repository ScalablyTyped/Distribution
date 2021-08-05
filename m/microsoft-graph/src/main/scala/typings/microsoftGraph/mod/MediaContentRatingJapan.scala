package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaContentRatingJapan extends StObject {
  
  /**
    * Movies rating selected for Japan. Possible values are: allAllowed, allBlocked, general, parentalGuidance, agesAbove15,
    * agesAbove18.
    */
  var movieRating: js.UndefOr[RatingJapanMoviesType] = js.undefined
  
  // TV rating selected for Japan. Possible values are: allAllowed, allBlocked, explicitAllowed.
  var tvRating: js.UndefOr[RatingJapanTelevisionType] = js.undefined
}
object MediaContentRatingJapan {
  
  inline def apply(): MediaContentRatingJapan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingJapan]
  }
  
  extension [Self <: MediaContentRatingJapan](x: Self) {
    
    inline def setMovieRating(value: RatingJapanMoviesType): Self = StObject.set(x, "movieRating", value.asInstanceOf[js.Any])
    
    inline def setMovieRatingUndefined: Self = StObject.set(x, "movieRating", js.undefined)
    
    inline def setTvRating(value: RatingJapanTelevisionType): Self = StObject.set(x, "tvRating", value.asInstanceOf[js.Any])
    
    inline def setTvRatingUndefined: Self = StObject.set(x, "tvRating", js.undefined)
  }
}

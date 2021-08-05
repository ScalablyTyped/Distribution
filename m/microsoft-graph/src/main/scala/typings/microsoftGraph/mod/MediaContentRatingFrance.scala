package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaContentRatingFrance extends StObject {
  
  /**
    * Movies rating selected for France. Possible values are: allAllowed, allBlocked, agesAbove10, agesAbove12, agesAbove16,
    * agesAbove18.
    */
  var movieRating: js.UndefOr[RatingFranceMoviesType] = js.undefined
  
  /**
    * TV rating selected for France. Possible values are: allAllowed, allBlocked, agesAbove10, agesAbove12, agesAbove16,
    * agesAbove18.
    */
  var tvRating: js.UndefOr[RatingFranceTelevisionType] = js.undefined
}
object MediaContentRatingFrance {
  
  inline def apply(): MediaContentRatingFrance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingFrance]
  }
  
  extension [Self <: MediaContentRatingFrance](x: Self) {
    
    inline def setMovieRating(value: RatingFranceMoviesType): Self = StObject.set(x, "movieRating", value.asInstanceOf[js.Any])
    
    inline def setMovieRatingUndefined: Self = StObject.set(x, "movieRating", js.undefined)
    
    inline def setTvRating(value: RatingFranceTelevisionType): Self = StObject.set(x, "tvRating", value.asInstanceOf[js.Any])
    
    inline def setTvRatingUndefined: Self = StObject.set(x, "tvRating", js.undefined)
  }
}

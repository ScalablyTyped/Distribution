package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaContentRatingGermany extends StObject {
  
  /**
    * Movies rating selected for Germany. Possible values are: allAllowed, allBlocked, general, agesAbove6, agesAbove12,
    * agesAbove16, adults.
    */
  var movieRating: js.UndefOr[RatingGermanyMoviesType] = js.undefined
  
  /**
    * TV rating selected for Germany. Possible values are: allAllowed, allBlocked, general, agesAbove6, agesAbove12,
    * agesAbove16, adults.
    */
  var tvRating: js.UndefOr[RatingGermanyTelevisionType] = js.undefined
}
object MediaContentRatingGermany {
  
  inline def apply(): MediaContentRatingGermany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingGermany]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaContentRatingGermany] (val x: Self) extends AnyVal {
    
    inline def setMovieRating(value: RatingGermanyMoviesType): Self = StObject.set(x, "movieRating", value.asInstanceOf[js.Any])
    
    inline def setMovieRatingUndefined: Self = StObject.set(x, "movieRating", js.undefined)
    
    inline def setTvRating(value: RatingGermanyTelevisionType): Self = StObject.set(x, "tvRating", value.asInstanceOf[js.Any])
    
    inline def setTvRatingUndefined: Self = StObject.set(x, "tvRating", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaContentRatingAustralia extends StObject {
  
  /**
    * Movies rating selected for Australia. Possible values are: allAllowed, allBlocked, general, parentalGuidance, mature,
    * agesAbove15, agesAbove18.
    */
  var movieRating: js.UndefOr[RatingAustraliaMoviesType] = js.undefined
  
  /**
    * TV rating selected for Australia. Possible values are: allAllowed, allBlocked, preschoolers, children, general,
    * parentalGuidance, mature, agesAbove15, agesAbove15AdultViolence.
    */
  var tvRating: js.UndefOr[RatingAustraliaTelevisionType] = js.undefined
}
object MediaContentRatingAustralia {
  
  inline def apply(): MediaContentRatingAustralia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingAustralia]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaContentRatingAustralia] (val x: Self) extends AnyVal {
    
    inline def setMovieRating(value: RatingAustraliaMoviesType): Self = StObject.set(x, "movieRating", value.asInstanceOf[js.Any])
    
    inline def setMovieRatingUndefined: Self = StObject.set(x, "movieRating", js.undefined)
    
    inline def setTvRating(value: RatingAustraliaTelevisionType): Self = StObject.set(x, "tvRating", value.asInstanceOf[js.Any])
    
    inline def setTvRatingUndefined: Self = StObject.set(x, "tvRating", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaContentRatingNewZealand extends StObject {
  
  /**
    * Movies rating selected for New Zealand. Possible values are: allAllowed, allBlocked, general, parentalGuidance, mature,
    * agesAbove13, agesAbove15, agesAbove16, agesAbove18, restricted, agesAbove16Restricted.
    */
  var movieRating: js.UndefOr[RatingNewZealandMoviesType] = js.undefined
  
  // TV rating selected for New Zealand. Possible values are: allAllowed, allBlocked, general, parentalGuidance, adults.
  var tvRating: js.UndefOr[RatingNewZealandTelevisionType] = js.undefined
}
object MediaContentRatingNewZealand {
  
  @scala.inline
  def apply(): MediaContentRatingNewZealand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingNewZealand]
  }
  
  @scala.inline
  implicit class MediaContentRatingNewZealandMutableBuilder[Self <: MediaContentRatingNewZealand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMovieRating(value: RatingNewZealandMoviesType): Self = StObject.set(x, "movieRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovieRatingUndefined: Self = StObject.set(x, "movieRating", js.undefined)
    
    @scala.inline
    def setTvRating(value: RatingNewZealandTelevisionType): Self = StObject.set(x, "tvRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvRatingUndefined: Self = StObject.set(x, "tvRating", js.undefined)
  }
}

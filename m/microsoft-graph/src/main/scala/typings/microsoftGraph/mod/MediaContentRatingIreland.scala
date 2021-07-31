package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaContentRatingIreland extends StObject {
  
  /**
    * Movies rating selected for Ireland. Possible values are: allAllowed, allBlocked, general, parentalGuidance,
    * agesAbove12, agesAbove15, agesAbove16, adults.
    */
  var movieRating: js.UndefOr[RatingIrelandMoviesType] = js.undefined
  
  /**
    * TV rating selected for Ireland. Possible values are: allAllowed, allBlocked, general, children, youngAdults,
    * parentalSupervision, mature.
    */
  var tvRating: js.UndefOr[RatingIrelandTelevisionType] = js.undefined
}
object MediaContentRatingIreland {
  
  @scala.inline
  def apply(): MediaContentRatingIreland = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingIreland]
  }
  
  @scala.inline
  implicit class MediaContentRatingIrelandMutableBuilder[Self <: MediaContentRatingIreland] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMovieRating(value: RatingIrelandMoviesType): Self = StObject.set(x, "movieRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovieRatingUndefined: Self = StObject.set(x, "movieRating", js.undefined)
    
    @scala.inline
    def setTvRating(value: RatingIrelandTelevisionType): Self = StObject.set(x, "tvRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvRatingUndefined: Self = StObject.set(x, "tvRating", js.undefined)
  }
}

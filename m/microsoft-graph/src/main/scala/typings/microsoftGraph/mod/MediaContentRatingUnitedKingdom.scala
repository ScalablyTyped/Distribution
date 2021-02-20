package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaContentRatingUnitedKingdom extends StObject {
  
  /**
    * Movies rating selected for United Kingdom. Possible values are: allAllowed, allBlocked, general, universalChildren,
    * parentalGuidance, agesAbove12Video, agesAbove12Cinema, agesAbove15, adults.
    */
  var movieRating: js.UndefOr[RatingUnitedKingdomMoviesType] = js.native
  
  // TV rating selected for United Kingdom. Possible values are: allAllowed, allBlocked, caution.
  var tvRating: js.UndefOr[RatingUnitedKingdomTelevisionType] = js.native
}
object MediaContentRatingUnitedKingdom {
  
  @scala.inline
  def apply(): MediaContentRatingUnitedKingdom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingUnitedKingdom]
  }
  
  @scala.inline
  implicit class MediaContentRatingUnitedKingdomMutableBuilder[Self <: MediaContentRatingUnitedKingdom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMovieRating(value: RatingUnitedKingdomMoviesType): Self = StObject.set(x, "movieRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovieRatingUndefined: Self = StObject.set(x, "movieRating", js.undefined)
    
    @scala.inline
    def setTvRating(value: RatingUnitedKingdomTelevisionType): Self = StObject.set(x, "tvRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvRatingUndefined: Self = StObject.set(x, "tvRating", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaContentRatingUnitedStates extends StObject {
  
  /**
    * Movies rating selected for United States. Possible values are: allAllowed, allBlocked, general, parentalGuidance,
    * parentalGuidance13, restricted, adults.
    */
  var movieRating: js.UndefOr[RatingUnitedStatesMoviesType] = js.native
  
  /**
    * TV rating selected for United States. Possible values are: allAllowed, allBlocked, childrenAll, childrenAbove7,
    * general, parentalGuidance, childrenAbove14, adults.
    */
  var tvRating: js.UndefOr[RatingUnitedStatesTelevisionType] = js.native
}
object MediaContentRatingUnitedStates {
  
  @scala.inline
  def apply(): MediaContentRatingUnitedStates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingUnitedStates]
  }
  
  @scala.inline
  implicit class MediaContentRatingUnitedStatesMutableBuilder[Self <: MediaContentRatingUnitedStates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMovieRating(value: RatingUnitedStatesMoviesType): Self = StObject.set(x, "movieRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovieRatingUndefined: Self = StObject.set(x, "movieRating", js.undefined)
    
    @scala.inline
    def setTvRating(value: RatingUnitedStatesTelevisionType): Self = StObject.set(x, "tvRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvRatingUndefined: Self = StObject.set(x, "tvRating", js.undefined)
  }
}

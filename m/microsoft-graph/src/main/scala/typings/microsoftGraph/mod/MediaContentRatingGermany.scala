package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaContentRatingGermany extends StObject {
  
  /**
    * Movies rating selected for Germany. Possible values are: allAllowed, allBlocked, general, agesAbove6, agesAbove12,
    * agesAbove16, adults.
    */
  var movieRating: js.UndefOr[RatingGermanyMoviesType] = js.native
  
  /**
    * TV rating selected for Germany. Possible values are: allAllowed, allBlocked, general, agesAbove6, agesAbove12,
    * agesAbove16, adults.
    */
  var tvRating: js.UndefOr[RatingGermanyTelevisionType] = js.native
}
object MediaContentRatingGermany {
  
  @scala.inline
  def apply(): MediaContentRatingGermany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingGermany]
  }
  
  @scala.inline
  implicit class MediaContentRatingGermanyMutableBuilder[Self <: MediaContentRatingGermany] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMovieRating(value: RatingGermanyMoviesType): Self = StObject.set(x, "movieRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovieRatingUndefined: Self = StObject.set(x, "movieRating", js.undefined)
    
    @scala.inline
    def setTvRating(value: RatingGermanyTelevisionType): Self = StObject.set(x, "tvRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvRatingUndefined: Self = StObject.set(x, "tvRating", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaContentRatingJapan extends StObject {
  
  /**
    * Movies rating selected for Japan. Possible values are: allAllowed, allBlocked, general, parentalGuidance, agesAbove15,
    * agesAbove18.
    */
  var movieRating: js.UndefOr[RatingJapanMoviesType] = js.native
  
  // TV rating selected for Japan. Possible values are: allAllowed, allBlocked, explicitAllowed.
  var tvRating: js.UndefOr[RatingJapanTelevisionType] = js.native
}
object MediaContentRatingJapan {
  
  @scala.inline
  def apply(): MediaContentRatingJapan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingJapan]
  }
  
  @scala.inline
  implicit class MediaContentRatingJapanMutableBuilder[Self <: MediaContentRatingJapan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMovieRating(value: RatingJapanMoviesType): Self = StObject.set(x, "movieRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovieRatingUndefined: Self = StObject.set(x, "movieRating", js.undefined)
    
    @scala.inline
    def setTvRating(value: RatingJapanTelevisionType): Self = StObject.set(x, "tvRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvRatingUndefined: Self = StObject.set(x, "tvRating", js.undefined)
  }
}

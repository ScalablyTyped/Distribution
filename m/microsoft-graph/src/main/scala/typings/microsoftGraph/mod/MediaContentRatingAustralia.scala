package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaContentRatingAustralia extends StObject {
  
  /**
    * Movies rating selected for Australia. Possible values are: allAllowed, allBlocked, general, parentalGuidance, mature,
    * agesAbove15, agesAbove18.
    */
  var movieRating: js.UndefOr[RatingAustraliaMoviesType] = js.native
  
  /**
    * TV rating selected for Australia. Possible values are: allAllowed, allBlocked, preschoolers, children, general,
    * parentalGuidance, mature, agesAbove15, agesAbove15AdultViolence.
    */
  var tvRating: js.UndefOr[RatingAustraliaTelevisionType] = js.native
}
object MediaContentRatingAustralia {
  
  @scala.inline
  def apply(): MediaContentRatingAustralia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingAustralia]
  }
  
  @scala.inline
  implicit class MediaContentRatingAustraliaMutableBuilder[Self <: MediaContentRatingAustralia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMovieRating(value: RatingAustraliaMoviesType): Self = StObject.set(x, "movieRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovieRatingUndefined: Self = StObject.set(x, "movieRating", js.undefined)
    
    @scala.inline
    def setTvRating(value: RatingAustraliaTelevisionType): Self = StObject.set(x, "tvRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvRatingUndefined: Self = StObject.set(x, "tvRating", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaContentRatingCanada extends StObject {
  
  /**
    * Movies rating selected for Canada. Possible values are: allAllowed, allBlocked, general, parentalGuidance, agesAbove14,
    * agesAbove18, restricted.
    */
  var movieRating: js.UndefOr[RatingCanadaMoviesType] = js.undefined
  
  /**
    * TV rating selected for Canada. Possible values are: allAllowed, allBlocked, children, childrenAbove8, general,
    * parentalGuidance, agesAbove14, agesAbove18.
    */
  var tvRating: js.UndefOr[RatingCanadaTelevisionType] = js.undefined
}
object MediaContentRatingCanada {
  
  @scala.inline
  def apply(): MediaContentRatingCanada = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingCanada]
  }
  
  @scala.inline
  implicit class MediaContentRatingCanadaMutableBuilder[Self <: MediaContentRatingCanada] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMovieRating(value: RatingCanadaMoviesType): Self = StObject.set(x, "movieRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovieRatingUndefined: Self = StObject.set(x, "movieRating", js.undefined)
    
    @scala.inline
    def setTvRating(value: RatingCanadaTelevisionType): Self = StObject.set(x, "tvRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvRatingUndefined: Self = StObject.set(x, "tvRating", js.undefined)
  }
}

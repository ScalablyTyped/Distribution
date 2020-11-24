package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaContentRatingCanada extends js.Object {
  
  /**
    * Movies rating selected for Canada. Possible values are: allAllowed, allBlocked, general, parentalGuidance, agesAbove14,
    * agesAbove18, restricted.
    */
  var movieRating: js.UndefOr[RatingCanadaMoviesType] = js.native
  
  /**
    * TV rating selected for Canada. Possible values are: allAllowed, allBlocked, children, childrenAbove8, general,
    * parentalGuidance, agesAbove14, agesAbove18.
    */
  var tvRating: js.UndefOr[RatingCanadaTelevisionType] = js.native
}
object MediaContentRatingCanada {
  
  @scala.inline
  def apply(): MediaContentRatingCanada = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingCanada]
  }
  
  @scala.inline
  implicit class MediaContentRatingCanadaOps[Self <: MediaContentRatingCanada] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMovieRating(value: RatingCanadaMoviesType): Self = this.set("movieRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovieRating: Self = this.set("movieRating", js.undefined)
    
    @scala.inline
    def setTvRating(value: RatingCanadaTelevisionType): Self = this.set("tvRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvRating: Self = this.set("tvRating", js.undefined)
  }
}

package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContentRatingUnitedStates extends js.Object {
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
  implicit class MediaContentRatingUnitedStatesOps[Self <: MediaContentRatingUnitedStates] (val x: Self) extends AnyVal {
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
    def setMovieRating(value: RatingUnitedStatesMoviesType): Self = this.set("movieRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovieRating: Self = this.set("movieRating", js.undefined)
    @scala.inline
    def setTvRating(value: RatingUnitedStatesTelevisionType): Self = this.set("tvRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvRating: Self = this.set("tvRating", js.undefined)
  }
  
}


package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContentRatingUnitedKingdom extends js.Object {
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
  implicit class MediaContentRatingUnitedKingdomOps[Self <: MediaContentRatingUnitedKingdom] (val x: Self) extends AnyVal {
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
    def setMovieRating(value: RatingUnitedKingdomMoviesType): Self = this.set("movieRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovieRating: Self = this.set("movieRating", js.undefined)
    @scala.inline
    def setTvRating(value: RatingUnitedKingdomTelevisionType): Self = this.set("tvRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvRating: Self = this.set("tvRating", js.undefined)
  }
  
}


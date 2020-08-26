package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContentRatingNewZealand extends js.Object {
  /**
    * Movies rating selected for New Zealand. Possible values are: allAllowed, allBlocked, general, parentalGuidance, mature,
    * agesAbove13, agesAbove15, agesAbove16, agesAbove18, restricted, agesAbove16Restricted.
    */
  var movieRating: js.UndefOr[RatingNewZealandMoviesType] = js.native
  // TV rating selected for New Zealand. Possible values are: allAllowed, allBlocked, general, parentalGuidance, adults.
  var tvRating: js.UndefOr[RatingNewZealandTelevisionType] = js.native
}

object MediaContentRatingNewZealand {
  @scala.inline
  def apply(): MediaContentRatingNewZealand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingNewZealand]
  }
  @scala.inline
  implicit class MediaContentRatingNewZealandOps[Self <: MediaContentRatingNewZealand] (val x: Self) extends AnyVal {
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
    def setMovieRating(value: RatingNewZealandMoviesType): Self = this.set("movieRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovieRating: Self = this.set("movieRating", js.undefined)
    @scala.inline
    def setTvRating(value: RatingNewZealandTelevisionType): Self = this.set("tvRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvRating: Self = this.set("tvRating", js.undefined)
  }
  
}


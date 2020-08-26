package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContentRatingGermany extends js.Object {
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
  implicit class MediaContentRatingGermanyOps[Self <: MediaContentRatingGermany] (val x: Self) extends AnyVal {
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
    def setMovieRating(value: RatingGermanyMoviesType): Self = this.set("movieRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovieRating: Self = this.set("movieRating", js.undefined)
    @scala.inline
    def setTvRating(value: RatingGermanyTelevisionType): Self = this.set("tvRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvRating: Self = this.set("tvRating", js.undefined)
  }
  
}


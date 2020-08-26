package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContentRatingFrance extends js.Object {
  /**
    * Movies rating selected for France. Possible values are: allAllowed, allBlocked, agesAbove10, agesAbove12, agesAbove16,
    * agesAbove18.
    */
  var movieRating: js.UndefOr[RatingFranceMoviesType] = js.native
  /**
    * TV rating selected for France. Possible values are: allAllowed, allBlocked, agesAbove10, agesAbove12, agesAbove16,
    * agesAbove18.
    */
  var tvRating: js.UndefOr[RatingFranceTelevisionType] = js.native
}

object MediaContentRatingFrance {
  @scala.inline
  def apply(): MediaContentRatingFrance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentRatingFrance]
  }
  @scala.inline
  implicit class MediaContentRatingFranceOps[Self <: MediaContentRatingFrance] (val x: Self) extends AnyVal {
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
    def setMovieRating(value: RatingFranceMoviesType): Self = this.set("movieRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovieRating: Self = this.set("movieRating", js.undefined)
    @scala.inline
    def setTvRating(value: RatingFranceTelevisionType): Self = this.set("tvRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvRating: Self = this.set("tvRating", js.undefined)
  }
  
}


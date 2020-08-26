package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContentRatingJapan extends js.Object {
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
  implicit class MediaContentRatingJapanOps[Self <: MediaContentRatingJapan] (val x: Self) extends AnyVal {
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
    def setMovieRating(value: RatingJapanMoviesType): Self = this.set("movieRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovieRating: Self = this.set("movieRating", js.undefined)
    @scala.inline
    def setTvRating(value: RatingJapanTelevisionType): Self = this.set("tvRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvRating: Self = this.set("tvRating", js.undefined)
  }
  
}


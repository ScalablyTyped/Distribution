package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContentRatingAustralia extends js.Object {
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
  implicit class MediaContentRatingAustraliaOps[Self <: MediaContentRatingAustralia] (val x: Self) extends AnyVal {
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
    def setMovieRating(value: RatingAustraliaMoviesType): Self = this.set("movieRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovieRating: Self = this.set("movieRating", js.undefined)
    @scala.inline
    def setTvRating(value: RatingAustraliaTelevisionType): Self = this.set("tvRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvRating: Self = this.set("tvRating", js.undefined)
  }
  
}


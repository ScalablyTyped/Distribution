package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaContentRatingNewZealand extends js.Object {
  /**
    * Movies rating selected for New Zealand. Possible values are: allAllowed, allBlocked, general, parentalGuidance, mature,
    * agesAbove13, agesAbove15, agesAbove16, agesAbove18, restricted, agesAbove16Restricted.
    */
  var movieRating: js.UndefOr[RatingNewZealandMoviesType] = js.undefined
  // TV rating selected for New Zealand. Possible values are: allAllowed, allBlocked, general, parentalGuidance, adults.
  var tvRating: js.UndefOr[RatingNewZealandTelevisionType] = js.undefined
}

object MediaContentRatingNewZealand {
  @scala.inline
  def apply(movieRating: RatingNewZealandMoviesType = null, tvRating: RatingNewZealandTelevisionType = null): MediaContentRatingNewZealand = {
    val __obj = js.Dynamic.literal()
    if (movieRating != null) __obj.updateDynamic("movieRating")(movieRating.asInstanceOf[js.Any])
    if (tvRating != null) __obj.updateDynamic("tvRating")(tvRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaContentRatingNewZealand]
  }
}


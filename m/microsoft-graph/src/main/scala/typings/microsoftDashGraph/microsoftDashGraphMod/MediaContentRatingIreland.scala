package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaContentRatingIreland extends js.Object {
  /**
    * Movies rating selected for Ireland. Possible values are: allAllowed, allBlocked, general, parentalGuidance,
    * agesAbove12, agesAbove15, agesAbove16, adults.
    */
  var movieRating: js.UndefOr[RatingIrelandMoviesType] = js.undefined
  /**
    * TV rating selected for Ireland. Possible values are: allAllowed, allBlocked, general, children, youngAdults,
    * parentalSupervision, mature.
    */
  var tvRating: js.UndefOr[RatingIrelandTelevisionType] = js.undefined
}

object MediaContentRatingIreland {
  @scala.inline
  def apply(movieRating: RatingIrelandMoviesType = null, tvRating: RatingIrelandTelevisionType = null): MediaContentRatingIreland = {
    val __obj = js.Dynamic.literal()
    if (movieRating != null) __obj.updateDynamic("movieRating")(movieRating.asInstanceOf[js.Any])
    if (tvRating != null) __obj.updateDynamic("tvRating")(tvRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaContentRatingIreland]
  }
}


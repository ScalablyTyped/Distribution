package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaContentRatingAustralia extends js.Object {
  /** Movies rating selected for Australia. Possible values are: allAllowed, allBlocked, general, parentalGuidance, mature, agesAbove15, agesAbove18. */
  var movieRating: js.UndefOr[RatingAustraliaMoviesType] = js.undefined
  /** TV rating selected for Australia. Possible values are: allAllowed, allBlocked, preschoolers, children, general, parentalGuidance, mature, agesAbove15, agesAbove15AdultViolence. */
  var tvRating: js.UndefOr[RatingAustraliaTelevisionType] = js.undefined
}

object MediaContentRatingAustralia {
  @scala.inline
  def apply(movieRating: RatingAustraliaMoviesType = null, tvRating: RatingAustraliaTelevisionType = null): MediaContentRatingAustralia = {
    val __obj = js.Dynamic.literal()
    if (movieRating != null) __obj.updateDynamic("movieRating")(movieRating)
    if (tvRating != null) __obj.updateDynamic("tvRating")(tvRating)
    __obj.asInstanceOf[MediaContentRatingAustralia]
  }
}


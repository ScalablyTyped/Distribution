package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaContentRatingUnitedKingdom extends js.Object {
  /** Movies rating selected for United Kingdom. Possible values are: allAllowed, allBlocked, general, universalChildren, parentalGuidance, agesAbove12Video, agesAbove12Cinema, agesAbove15, adults. */
  var movieRating: js.UndefOr[RatingUnitedKingdomMoviesType] = js.undefined
  /** TV rating selected for United Kingdom. Possible values are: allAllowed, allBlocked, caution. */
  var tvRating: js.UndefOr[RatingUnitedKingdomTelevisionType] = js.undefined
}

object MediaContentRatingUnitedKingdom {
  @scala.inline
  def apply(
    movieRating: RatingUnitedKingdomMoviesType = null,
    tvRating: RatingUnitedKingdomTelevisionType = null
  ): MediaContentRatingUnitedKingdom = {
    val __obj = js.Dynamic.literal()
    if (movieRating != null) __obj.updateDynamic("movieRating")(movieRating)
    if (tvRating != null) __obj.updateDynamic("tvRating")(tvRating)
    __obj.asInstanceOf[MediaContentRatingUnitedKingdom]
  }
}


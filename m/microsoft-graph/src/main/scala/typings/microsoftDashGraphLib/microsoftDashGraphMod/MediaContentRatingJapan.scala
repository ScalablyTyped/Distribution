package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaContentRatingJapan extends js.Object {
  /**
    * Movies rating selected for Japan. Possible values are: allAllowed, allBlocked, general, parentalGuidance, agesAbove15,
    * agesAbove18.
    */
  var movieRating: js.UndefOr[RatingJapanMoviesType] = js.undefined
  // TV rating selected for Japan. Possible values are: allAllowed, allBlocked, explicitAllowed.
  var tvRating: js.UndefOr[RatingJapanTelevisionType] = js.undefined
}

object MediaContentRatingJapan {
  @scala.inline
  def apply(movieRating: RatingJapanMoviesType = null, tvRating: RatingJapanTelevisionType = null): MediaContentRatingJapan = {
    val __obj = js.Dynamic.literal()
    if (movieRating != null) __obj.updateDynamic("movieRating")(movieRating)
    if (tvRating != null) __obj.updateDynamic("tvRating")(tvRating)
    __obj.asInstanceOf[MediaContentRatingJapan]
  }
}


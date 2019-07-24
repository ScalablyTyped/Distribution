package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaContentRatingGermany extends js.Object {
  /**
    * Movies rating selected for Germany. Possible values are: allAllowed, allBlocked, general, agesAbove6, agesAbove12,
    * agesAbove16, adults.
    */
  var movieRating: js.UndefOr[RatingGermanyMoviesType] = js.undefined
  /**
    * TV rating selected for Germany. Possible values are: allAllowed, allBlocked, general, agesAbove6, agesAbove12,
    * agesAbove16, adults.
    */
  var tvRating: js.UndefOr[RatingGermanyTelevisionType] = js.undefined
}

object MediaContentRatingGermany {
  @scala.inline
  def apply(movieRating: RatingGermanyMoviesType = null, tvRating: RatingGermanyTelevisionType = null): MediaContentRatingGermany = {
    val __obj = js.Dynamic.literal()
    if (movieRating != null) __obj.updateDynamic("movieRating")(movieRating)
    if (tvRating != null) __obj.updateDynamic("tvRating")(tvRating)
    __obj.asInstanceOf[MediaContentRatingGermany]
  }
}


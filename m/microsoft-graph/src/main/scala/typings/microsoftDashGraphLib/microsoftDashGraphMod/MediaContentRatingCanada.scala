package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaContentRatingCanada extends js.Object {
  /**
    * Movies rating selected for Canada. Possible values are: allAllowed, allBlocked, general, parentalGuidance, agesAbove14,
    * agesAbove18, restricted.
    */
  var movieRating: js.UndefOr[RatingCanadaMoviesType] = js.undefined
  /**
    * TV rating selected for Canada. Possible values are: allAllowed, allBlocked, children, childrenAbove8, general,
    * parentalGuidance, agesAbove14, agesAbove18.
    */
  var tvRating: js.UndefOr[RatingCanadaTelevisionType] = js.undefined
}

object MediaContentRatingCanada {
  @scala.inline
  def apply(movieRating: RatingCanadaMoviesType = null, tvRating: RatingCanadaTelevisionType = null): MediaContentRatingCanada = {
    val __obj = js.Dynamic.literal()
    if (movieRating != null) __obj.updateDynamic("movieRating")(movieRating)
    if (tvRating != null) __obj.updateDynamic("tvRating")(tvRating)
    __obj.asInstanceOf[MediaContentRatingCanada]
  }
}


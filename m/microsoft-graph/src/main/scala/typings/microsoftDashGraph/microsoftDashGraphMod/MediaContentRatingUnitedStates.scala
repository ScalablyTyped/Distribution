package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaContentRatingUnitedStates extends js.Object {
  /**
    * Movies rating selected for United States. Possible values are: allAllowed, allBlocked, general, parentalGuidance,
    * parentalGuidance13, restricted, adults.
    */
  var movieRating: js.UndefOr[RatingUnitedStatesMoviesType] = js.undefined
  /**
    * TV rating selected for United States. Possible values are: allAllowed, allBlocked, childrenAll, childrenAbove7,
    * general, parentalGuidance, childrenAbove14, adults.
    */
  var tvRating: js.UndefOr[RatingUnitedStatesTelevisionType] = js.undefined
}

object MediaContentRatingUnitedStates {
  @scala.inline
  def apply(
    movieRating: RatingUnitedStatesMoviesType = null,
    tvRating: RatingUnitedStatesTelevisionType = null
  ): MediaContentRatingUnitedStates = {
    val __obj = js.Dynamic.literal()
    if (movieRating != null) __obj.updateDynamic("movieRating")(movieRating)
    if (tvRating != null) __obj.updateDynamic("tvRating")(tvRating)
    __obj.asInstanceOf[MediaContentRatingUnitedStates]
  }
}


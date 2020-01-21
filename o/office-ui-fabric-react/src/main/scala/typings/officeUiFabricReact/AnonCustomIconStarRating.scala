package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomIconStarRating extends js.Object {
  var customIconStarRating: js.UndefOr[Double] = js.undefined
  var largeStarRating: js.UndefOr[Double] = js.undefined
  var rating: js.UndefOr[Double] = js.undefined
  var smallStarRating: js.UndefOr[Double] = js.undefined
  var tenStarRating: js.UndefOr[Double] = js.undefined
  var themedStarRating: js.UndefOr[Double] = js.undefined
}

object AnonCustomIconStarRating {
  @scala.inline
  def apply(
    customIconStarRating: Int | Double = null,
    largeStarRating: Int | Double = null,
    rating: Int | Double = null,
    smallStarRating: Int | Double = null,
    tenStarRating: Int | Double = null,
    themedStarRating: Int | Double = null
  ): AnonCustomIconStarRating = {
    val __obj = js.Dynamic.literal()
    if (customIconStarRating != null) __obj.updateDynamic("customIconStarRating")(customIconStarRating.asInstanceOf[js.Any])
    if (largeStarRating != null) __obj.updateDynamic("largeStarRating")(largeStarRating.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (smallStarRating != null) __obj.updateDynamic("smallStarRating")(smallStarRating.asInstanceOf[js.Any])
    if (tenStarRating != null) __obj.updateDynamic("tenStarRating")(tenStarRating.asInstanceOf[js.Any])
    if (themedStarRating != null) __obj.updateDynamic("themedStarRating")(themedStarRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomIconStarRating]
  }
}


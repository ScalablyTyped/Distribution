package typings.officeDashUiDashFabricDashReact.libComponentsRatingRatingDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRatingStyles extends js.Object {
  var labelText: IStyle
  var ratingButton: IStyle
  var ratingFocusZone: IStyle
  var ratingStar: IStyle
  var ratingStarBack: IStyle
  var ratingStarFront: IStyle
  var ratingStarIsLarge: IStyle
  var ratingStarIsSmall: IStyle
  var root: IStyle
  var rootIsLarge: IStyle
  var rootIsSmall: IStyle
}

object IRatingStyles {
  @scala.inline
  def apply(
    labelText: IStyle = null,
    ratingButton: IStyle = null,
    ratingFocusZone: IStyle = null,
    ratingStar: IStyle = null,
    ratingStarBack: IStyle = null,
    ratingStarFront: IStyle = null,
    ratingStarIsLarge: IStyle = null,
    ratingStarIsSmall: IStyle = null,
    root: IStyle = null,
    rootIsLarge: IStyle = null,
    rootIsSmall: IStyle = null
  ): IRatingStyles = {
    val __obj = js.Dynamic.literal()
    if (labelText != null) __obj.updateDynamic("labelText")(labelText.asInstanceOf[js.Any])
    if (ratingButton != null) __obj.updateDynamic("ratingButton")(ratingButton.asInstanceOf[js.Any])
    if (ratingFocusZone != null) __obj.updateDynamic("ratingFocusZone")(ratingFocusZone.asInstanceOf[js.Any])
    if (ratingStar != null) __obj.updateDynamic("ratingStar")(ratingStar.asInstanceOf[js.Any])
    if (ratingStarBack != null) __obj.updateDynamic("ratingStarBack")(ratingStarBack.asInstanceOf[js.Any])
    if (ratingStarFront != null) __obj.updateDynamic("ratingStarFront")(ratingStarFront.asInstanceOf[js.Any])
    if (ratingStarIsLarge != null) __obj.updateDynamic("ratingStarIsLarge")(ratingStarIsLarge.asInstanceOf[js.Any])
    if (ratingStarIsSmall != null) __obj.updateDynamic("ratingStarIsSmall")(ratingStarIsSmall.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rootIsLarge != null) __obj.updateDynamic("rootIsLarge")(rootIsLarge.asInstanceOf[js.Any])
    if (rootIsSmall != null) __obj.updateDynamic("rootIsSmall")(rootIsSmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRatingStyles]
  }
}


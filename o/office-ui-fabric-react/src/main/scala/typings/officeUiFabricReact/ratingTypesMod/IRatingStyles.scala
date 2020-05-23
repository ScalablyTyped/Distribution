package typings.officeUiFabricReact.ratingTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
    labelText: js.UndefOr[Null | IStyle] = js.undefined,
    ratingButton: js.UndefOr[Null | IStyle] = js.undefined,
    ratingFocusZone: js.UndefOr[Null | IStyle] = js.undefined,
    ratingStar: js.UndefOr[Null | IStyle] = js.undefined,
    ratingStarBack: js.UndefOr[Null | IStyle] = js.undefined,
    ratingStarFront: js.UndefOr[Null | IStyle] = js.undefined,
    ratingStarIsLarge: js.UndefOr[Null | IStyle] = js.undefined,
    ratingStarIsSmall: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    rootIsLarge: js.UndefOr[Null | IStyle] = js.undefined,
    rootIsSmall: js.UndefOr[Null | IStyle] = js.undefined
  ): IRatingStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(labelText)) __obj.updateDynamic("labelText")(labelText.asInstanceOf[js.Any])
    if (!js.isUndefined(ratingButton)) __obj.updateDynamic("ratingButton")(ratingButton.asInstanceOf[js.Any])
    if (!js.isUndefined(ratingFocusZone)) __obj.updateDynamic("ratingFocusZone")(ratingFocusZone.asInstanceOf[js.Any])
    if (!js.isUndefined(ratingStar)) __obj.updateDynamic("ratingStar")(ratingStar.asInstanceOf[js.Any])
    if (!js.isUndefined(ratingStarBack)) __obj.updateDynamic("ratingStarBack")(ratingStarBack.asInstanceOf[js.Any])
    if (!js.isUndefined(ratingStarFront)) __obj.updateDynamic("ratingStarFront")(ratingStarFront.asInstanceOf[js.Any])
    if (!js.isUndefined(ratingStarIsLarge)) __obj.updateDynamic("ratingStarIsLarge")(ratingStarIsLarge.asInstanceOf[js.Any])
    if (!js.isUndefined(ratingStarIsSmall)) __obj.updateDynamic("ratingStarIsSmall")(ratingStarIsSmall.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(rootIsLarge)) __obj.updateDynamic("rootIsLarge")(rootIsLarge.asInstanceOf[js.Any])
    if (!js.isUndefined(rootIsSmall)) __obj.updateDynamic("rootIsSmall")(rootIsSmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRatingStyles]
  }
}


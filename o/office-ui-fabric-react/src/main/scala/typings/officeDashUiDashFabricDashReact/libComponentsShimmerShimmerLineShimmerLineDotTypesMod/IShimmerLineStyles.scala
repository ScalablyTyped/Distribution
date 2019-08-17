package typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerLineShimmerLineDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerLineStyles extends js.Object {
  /**
    * Bottom-left corner SVG of the ShimmerLine component.
    */
  var bottomLeftCorner: js.UndefOr[IStyle] = js.undefined
  /**
    * Bottom-right corner SVG of the ShimmerLine component.
    */
  var bottomRightCorner: js.UndefOr[IStyle] = js.undefined
  /**
    * Root of the ShimmerLine component.
    */
  var root: js.UndefOr[IStyle] = js.undefined
  /**
    * Top-left corner SVG of the ShimmerLine component.
    */
  var topLeftCorner: js.UndefOr[IStyle] = js.undefined
  /**
    * Top-right corner SVG of the ShimmerLine component.
    */
  var topRightCorner: js.UndefOr[IStyle] = js.undefined
}

object IShimmerLineStyles {
  @scala.inline
  def apply(
    bottomLeftCorner: IStyle = null,
    bottomRightCorner: IStyle = null,
    root: IStyle = null,
    topLeftCorner: IStyle = null,
    topRightCorner: IStyle = null
  ): IShimmerLineStyles = {
    val __obj = js.Dynamic.literal()
    if (bottomLeftCorner != null) __obj.updateDynamic("bottomLeftCorner")(bottomLeftCorner.asInstanceOf[js.Any])
    if (bottomRightCorner != null) __obj.updateDynamic("bottomRightCorner")(bottomRightCorner.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (topLeftCorner != null) __obj.updateDynamic("topLeftCorner")(topLeftCorner.asInstanceOf[js.Any])
    if (topRightCorner != null) __obj.updateDynamic("topRightCorner")(topRightCorner.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerLineStyles]
  }
}


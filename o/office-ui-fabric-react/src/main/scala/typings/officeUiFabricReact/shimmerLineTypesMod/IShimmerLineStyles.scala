package typings.officeUiFabricReact.shimmerLineTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
    bottomLeftCorner: js.UndefOr[Null | IStyle] = js.undefined,
    bottomRightCorner: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    topLeftCorner: js.UndefOr[Null | IStyle] = js.undefined,
    topRightCorner: js.UndefOr[Null | IStyle] = js.undefined
  ): IShimmerLineStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottomLeftCorner)) __obj.updateDynamic("bottomLeftCorner")(bottomLeftCorner.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomRightCorner)) __obj.updateDynamic("bottomRightCorner")(bottomRightCorner.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(topLeftCorner)) __obj.updateDynamic("topLeftCorner")(topLeftCorner.asInstanceOf[js.Any])
    if (!js.isUndefined(topRightCorner)) __obj.updateDynamic("topRightCorner")(topRightCorner.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerLineStyles]
  }
}


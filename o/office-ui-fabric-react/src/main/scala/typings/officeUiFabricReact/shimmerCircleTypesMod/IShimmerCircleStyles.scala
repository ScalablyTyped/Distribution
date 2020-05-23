package typings.officeUiFabricReact.shimmerCircleTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerCircleStyles extends js.Object {
  /**
    * Root of the ShimmerCircle component.
    */
  var root: js.UndefOr[IStyle] = js.undefined
  /**
    * Style for the circle SVG of the ShimmerCircle component.
    */
  var svg: js.UndefOr[IStyle] = js.undefined
}

object IShimmerCircleStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined, svg: js.UndefOr[Null | IStyle] = js.undefined): IShimmerCircleStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(svg)) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerCircleStyles]
  }
}


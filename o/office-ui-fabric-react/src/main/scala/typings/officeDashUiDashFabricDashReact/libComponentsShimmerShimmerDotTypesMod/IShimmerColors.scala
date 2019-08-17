package typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerColors extends js.Object {
  /**
    * Defines the background color of the space in between and around shimmer elements (borders, gaps and rounded corners).
    * @defaultvalue theme.palette.white
    */
  var background: js.UndefOr[String] = js.undefined
  /**
    * Defines the main background color which is the color you see when the wave is not animating.
    * @defaultvalue theme.palette.neutralLight
    */
  var shimmer: js.UndefOr[String] = js.undefined
  /**
    * Defines the tip color of the shimmer wave which gradually gets from and to `shimmer` color.
    * @defaultvalue theme.palette.neutralLighter
    */
  var shimmerWave: js.UndefOr[String] = js.undefined
}

object IShimmerColors {
  @scala.inline
  def apply(background: String = null, shimmer: String = null, shimmerWave: String = null): IShimmerColors = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (shimmer != null) __obj.updateDynamic("shimmer")(shimmer)
    if (shimmerWave != null) __obj.updateDynamic("shimmerWave")(shimmerWave)
    __obj.asInstanceOf[IShimmerColors]
  }
}


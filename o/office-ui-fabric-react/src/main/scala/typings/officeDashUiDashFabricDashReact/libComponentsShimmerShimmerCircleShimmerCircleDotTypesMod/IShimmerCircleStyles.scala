package typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerCircleShimmerCircleDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
  def apply(root: IStyle = null, svg: IStyle = null): IShimmerCircleStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerCircleStyles]
  }
}


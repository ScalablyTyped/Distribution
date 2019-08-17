package typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerGapShimmerGapDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerGapStyles extends js.Object {
  /**
    * Root of the ShimmerGap component.
    */
  var root: js.UndefOr[IStyle] = js.undefined
}

object IShimmerGapStyles {
  @scala.inline
  def apply(root: IStyle = null): IShimmerGapStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerGapStyles]
  }
}


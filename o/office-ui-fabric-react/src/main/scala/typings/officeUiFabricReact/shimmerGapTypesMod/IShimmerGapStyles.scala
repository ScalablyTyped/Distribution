package typings.officeUiFabricReact.shimmerGapTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): IShimmerGapStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerGapStyles]
  }
}


package typings.officeUiFabricReact.shimmerElementsGroupTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerElementsGroupStyles extends js.Object {
  /**
    * Represents the wrapper root element holding all elements inside.
    */
  var root: js.UndefOr[IStyle] = js.undefined
}

object IShimmerElementsGroupStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): IShimmerElementsGroupStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerElementsGroupStyles]
  }
}


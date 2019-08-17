package typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerElementsGroupShimmerElementsGroupDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
  def apply(root: IStyle = null): IShimmerElementsGroupStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerElementsGroupStyles]
  }
}


package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListShimmeredDetailsListDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmeredDetailsListStyles extends js.Object {
  /**
    * Represents styles passed to the `List` component for creating a fade-out to the bottom overlay.
    */
  var root: IStyle
}

object IShimmeredDetailsListStyles {
  @scala.inline
  def apply(root: IStyle = null): IShimmeredDetailsListStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmeredDetailsListStyles]
  }
}


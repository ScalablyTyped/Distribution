package typings.officeDashUiDashFabricDashReact.libComponentsFabricFabricDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFabricStyles extends js.Object {
  var root: IStyle
}

object IFabricStyles {
  @scala.inline
  def apply(root: IStyle = null): IFabricStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFabricStyles]
  }
}


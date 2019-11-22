package typings.officeDashUiDashFabricDashReact.libComponentsFabricFabricDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFabricStyles extends js.Object {
  var bodyThemed: IStyle
  var root: IStyle
}

object IFabricStyles {
  @scala.inline
  def apply(bodyThemed: IStyle = null, root: IStyle = null): IFabricStyles = {
    val __obj = js.Dynamic.literal()
    if (bodyThemed != null) __obj.updateDynamic("bodyThemed")(bodyThemed.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFabricStyles]
  }
}


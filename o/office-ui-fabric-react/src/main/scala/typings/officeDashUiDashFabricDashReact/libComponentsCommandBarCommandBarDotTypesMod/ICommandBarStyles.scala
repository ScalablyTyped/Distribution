package typings.officeDashUiDashFabricDashReact.libComponentsCommandBarCommandBarDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandBarStyles extends js.Object {
  var primarySet: js.UndefOr[IStyle] = js.undefined
  var root: js.UndefOr[IStyle] = js.undefined
  var secondarySet: js.UndefOr[IStyle] = js.undefined
}

object ICommandBarStyles {
  @scala.inline
  def apply(primarySet: IStyle = null, root: IStyle = null, secondarySet: IStyle = null): ICommandBarStyles = {
    val __obj = js.Dynamic.literal()
    if (primarySet != null) __obj.updateDynamic("primarySet")(primarySet.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (secondarySet != null) __obj.updateDynamic("secondarySet")(secondarySet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandBarStyles]
  }
}


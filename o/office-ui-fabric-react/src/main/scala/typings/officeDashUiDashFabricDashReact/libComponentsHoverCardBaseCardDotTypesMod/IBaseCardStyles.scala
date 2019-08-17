package typings.officeDashUiDashFabricDashReact.libComponentsHoverCardBaseCardDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseCardStyles extends js.Object {
  /**
    * Style for the root element in the default enabled, non-toggled state.
    */
  var root: js.UndefOr[IStyle] = js.undefined
}

object IBaseCardStyles {
  @scala.inline
  def apply(root: IStyle = null): IBaseCardStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseCardStyles]
  }
}


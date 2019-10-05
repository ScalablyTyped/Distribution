package typings.officeDashUiDashFabricDashReact.libComponentsLabelLabelDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabelStyles extends js.Object {
  /**
    * Styles for the root element.
    */
  var root: IStyle
}

object ILabelStyles {
  @scala.inline
  def apply(root: IStyle = null): ILabelStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILabelStyles]
  }
}


package typings.officeDashUiDashFabricDashReact.libComponentsResizeGroupResizeGroupDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizeGroupStyles extends js.Object {
  /**
    * Style for the root element.
    */
  var root: IStyle
}

object IResizeGroupStyles {
  @scala.inline
  def apply(root: IStyle = null): IResizeGroupStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResizeGroupStyles]
  }
}


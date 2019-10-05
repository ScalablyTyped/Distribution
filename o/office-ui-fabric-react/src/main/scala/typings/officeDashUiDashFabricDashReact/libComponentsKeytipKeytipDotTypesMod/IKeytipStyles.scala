package typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeytipStyles extends js.Object {
  /**
    * Style for the div container surrounding the keytip content.
    */
  var container: IStyle
  /**
    * Style for the keytip content element.
    */
  var root: IStyle
}

object IKeytipStyles {
  @scala.inline
  def apply(container: IStyle = null, root: IStyle = null): IKeytipStyles = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipStyles]
  }
}


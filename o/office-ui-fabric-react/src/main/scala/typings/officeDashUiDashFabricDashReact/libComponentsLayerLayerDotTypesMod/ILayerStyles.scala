package typings.officeDashUiDashFabricDashReact.libComponentsLayerLayerDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayerStyles extends js.Object {
  /**
    * Style for the Fabric component.
    */
  var content: js.UndefOr[IStyle] = js.undefined
  /**
    * Style for the root element when fixed.
    */
  var root: js.UndefOr[IStyle] = js.undefined
}

object ILayerStyles {
  @scala.inline
  def apply(content: IStyle = null, root: IStyle = null): ILayerStyles = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayerStyles]
  }
}


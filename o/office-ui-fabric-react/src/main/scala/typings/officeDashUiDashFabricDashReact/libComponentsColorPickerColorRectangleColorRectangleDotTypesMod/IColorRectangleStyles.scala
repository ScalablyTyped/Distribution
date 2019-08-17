package typings.officeDashUiDashFabricDashReact.libComponentsColorPickerColorRectangleColorRectangleDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorRectangleStyles extends js.Object {
  /**
    * Style set for the dark-colored rectangle.
    */
  var dark: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the light-colored rectangle.
    */
  var light: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the root element.
    */
  var root: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the draggable thumb element.
    */
  var thumb: js.UndefOr[IStyle] = js.undefined
}

object IColorRectangleStyles {
  @scala.inline
  def apply(dark: IStyle = null, light: IStyle = null, root: IStyle = null, thumb: IStyle = null): IColorRectangleStyles = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorRectangleStyles]
  }
}


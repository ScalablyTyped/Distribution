package typings.officeDashUiDashFabricDashReact.libComponentsToggleToggleDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToggleStyles extends js.Object {
  /**
    * Container for the toggle pill and the text next to it.
    */
  var container: IStyle
  /**
    * Label element above the toggle.
    */
  var label: IStyle
  /**
    * Pill, rendered as a button.
    */
  var pill: IStyle
  /** Root element. */
  var root: IStyle
  /**
    * Text next to the pill.
    */
  var text: IStyle
  /**
    * Thumb inside of the pill.
    */
  var thumb: IStyle
}

object IToggleStyles {
  @scala.inline
  def apply(container: IStyle, label: IStyle, pill: IStyle, root: IStyle, text: IStyle, thumb: IStyle): IToggleStyles = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], pill = pill.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IToggleStyles]
  }
}


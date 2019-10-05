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
  def apply(
    container: IStyle = null,
    label: IStyle = null,
    pill: IStyle = null,
    root: IStyle = null,
    text: IStyle = null,
    thumb: IStyle = null
  ): IToggleStyles = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (pill != null) __obj.updateDynamic("pill")(pill.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToggleStyles]
  }
}


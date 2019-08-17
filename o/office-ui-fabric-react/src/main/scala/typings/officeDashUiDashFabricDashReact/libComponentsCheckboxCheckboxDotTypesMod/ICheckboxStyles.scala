package typings.officeDashUiDashFabricDashReact.libComponentsCheckboxCheckboxDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckboxStyles extends js.Object {
  /**
    * Style for checkbox in its default unchecked/enabled state.
    */
  var checkbox: js.UndefOr[IStyle] = js.undefined
  /**
    * Style for the checkmark in the default enabled/unchecked state.
    */
  var checkmark: js.UndefOr[IStyle] = js.undefined
  /**
    * INTERNAL: This is mostly an internal implementation detail which you should avoid styling.
    * This refers to the <input type="checkbox"> element that is typically hidden and not rendered on screen.
    */
  var input: js.UndefOr[IStyle] = js.undefined
  /**
    * Style for the label part (contains the customized checkbox + text) when enabled.
    */
  var label: js.UndefOr[IStyle] = js.undefined
  /**
    * Style for the root element (a button) of the checkbox component in the default enabled/unchecked state.
    */
  var root: js.UndefOr[IStyle] = js.undefined
  /**
    * Style for text appearing with the checkbox in its default enabled state.
    */
  var text: js.UndefOr[IStyle] = js.undefined
}

object ICheckboxStyles {
  @scala.inline
  def apply(
    checkbox: IStyle = null,
    checkmark: IStyle = null,
    input: IStyle = null,
    label: IStyle = null,
    root: IStyle = null,
    text: IStyle = null
  ): ICheckboxStyles = {
    val __obj = js.Dynamic.literal()
    if (checkbox != null) __obj.updateDynamic("checkbox")(checkbox.asInstanceOf[js.Any])
    if (checkmark != null) __obj.updateDynamic("checkmark")(checkmark.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxStyles]
  }
}


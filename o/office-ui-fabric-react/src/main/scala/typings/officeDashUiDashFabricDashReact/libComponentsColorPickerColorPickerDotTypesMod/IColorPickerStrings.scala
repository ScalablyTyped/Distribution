package typings.officeDashUiDashFabricDashReact.libComponentsColorPickerColorPickerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPickerStrings extends js.Object {
  /**
    * Label for the alpha text field and slider.
    * @defaultvalue Alpha
    */
  var alpha: js.UndefOr[String] = js.undefined
  /**
    * Label for the blue text field.
    * @defaultvalue Blue
    */
  var blue: js.UndefOr[String] = js.undefined
  /**
    * Label for the green text field.
    * @defaultvalue Green
    */
  var green: js.UndefOr[String] = js.undefined
  /**
    * Label for the hex text field.
    * @defaultvalue Hex
    */
  var hex: js.UndefOr[String] = js.undefined
  /**
    * Aria label for the hue slider.
    * @defaultvalue Hue
    */
  var hue: js.UndefOr[String] = js.undefined
  /**
    * Label for the red text field.
    * @defaultvalue Red
    */
  var red: js.UndefOr[String] = js.undefined
  /**
    * Accessible label for the root of the color picker region.
    * The string should contain a placeholder `{0}` for the currently selected color.
    * @defaultvalue `'Color picker, {0} selected.'`
    */
  var rootAriaLabelFormat: js.UndefOr[String] = js.undefined
  /**
    * Detailed description for how to use the color rectangle. Moving the thumb horizontally adjusts
    * saturation and moving it vertically adjusts value (essentially, brightness).
    * @defaultvalue 'Use left and right arrow keys to set saturation. Use up and down arrow keys to set brightness.'
    */
  var svAriaDescription: js.UndefOr[String] = js.undefined
  /**
    * Aria label for the color rectangle, which adjusts saturation and value (brightness).
    * @defaultvalue 'Saturation and brightness'
    */
  var svAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Format string for the current values of the color rectangle.
    * The string must include descriptions and two placeholders for the current values:
    * `{0}` for saturation and `{1}` for value/brightness.
    * @defaultvalue `'Saturation {0} brightness {1}'`
    */
  var svAriaValueFormat: js.UndefOr[String] = js.undefined
}

object IColorPickerStrings {
  @scala.inline
  def apply(
    alpha: String = null,
    blue: String = null,
    green: String = null,
    hex: String = null,
    hue: String = null,
    red: String = null,
    rootAriaLabelFormat: String = null,
    svAriaDescription: String = null,
    svAriaLabel: String = null,
    svAriaValueFormat: String = null
  ): IColorPickerStrings = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha)
    if (blue != null) __obj.updateDynamic("blue")(blue)
    if (green != null) __obj.updateDynamic("green")(green)
    if (hex != null) __obj.updateDynamic("hex")(hex)
    if (hue != null) __obj.updateDynamic("hue")(hue)
    if (red != null) __obj.updateDynamic("red")(red)
    if (rootAriaLabelFormat != null) __obj.updateDynamic("rootAriaLabelFormat")(rootAriaLabelFormat)
    if (svAriaDescription != null) __obj.updateDynamic("svAriaDescription")(svAriaDescription)
    if (svAriaLabel != null) __obj.updateDynamic("svAriaLabel")(svAriaLabel)
    if (svAriaValueFormat != null) __obj.updateDynamic("svAriaValueFormat")(svAriaValueFormat)
    __obj.asInstanceOf[IColorPickerStrings]
  }
}


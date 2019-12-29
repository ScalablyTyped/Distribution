package typings.officeDashUiDashFabricDashReact.libComponentsColorPickerColorPickerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPickerStrings extends js.Object {
  /**
    * Label for the alpha text field.
    * Also used as the aria label for the alpha slider if `alphaAriaLabel` is not provided.
    * @defaultvalue Alpha
    */
  var alpha: js.UndefOr[String] = js.undefined
  /**
    * Customized aria-label for the alpha slider.
    */
  var alphaAriaLabel: js.UndefOr[String] = js.undefined
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
    * @deprecated Use `hueAriaLabel`
    */
  var hue: js.UndefOr[String] = js.undefined
  /**
    * Aria label for the hue slider.
    * @defaultvalue Hue
    */
  var hueAriaLabel: js.UndefOr[String] = js.undefined
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
    alphaAriaLabel: String = null,
    blue: String = null,
    green: String = null,
    hex: String = null,
    hue: String = null,
    hueAriaLabel: String = null,
    red: String = null,
    rootAriaLabelFormat: String = null,
    svAriaDescription: String = null,
    svAriaLabel: String = null,
    svAriaValueFormat: String = null
  ): IColorPickerStrings = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (alphaAriaLabel != null) __obj.updateDynamic("alphaAriaLabel")(alphaAriaLabel.asInstanceOf[js.Any])
    if (blue != null) __obj.updateDynamic("blue")(blue.asInstanceOf[js.Any])
    if (green != null) __obj.updateDynamic("green")(green.asInstanceOf[js.Any])
    if (hex != null) __obj.updateDynamic("hex")(hex.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (hueAriaLabel != null) __obj.updateDynamic("hueAriaLabel")(hueAriaLabel.asInstanceOf[js.Any])
    if (red != null) __obj.updateDynamic("red")(red.asInstanceOf[js.Any])
    if (rootAriaLabelFormat != null) __obj.updateDynamic("rootAriaLabelFormat")(rootAriaLabelFormat.asInstanceOf[js.Any])
    if (svAriaDescription != null) __obj.updateDynamic("svAriaDescription")(svAriaDescription.asInstanceOf[js.Any])
    if (svAriaLabel != null) __obj.updateDynamic("svAriaLabel")(svAriaLabel.asInstanceOf[js.Any])
    if (svAriaValueFormat != null) __obj.updateDynamic("svAriaValueFormat")(svAriaValueFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerStrings]
  }
}


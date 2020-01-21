package typings.officeUiFabricReact.colorPickerTypesMod

import typings.officeUiFabricReact.interfacesMod.IColor
import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLElement
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPickerProps extends js.Object {
  /**
    * Label for the alpha textfield.
    * @defaultvalue Alpha
    * @deprecated Use `strings`
    */
  var alphaLabel: js.UndefOr[String] = js.undefined
  /**
    * Whether to hide the alpha control slider.
    */
  var alphaSliderHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Label for the blue text field.
    * @defaultvalue Blue
    * @deprecated Use `strings`
    */
  var blueLabel: js.UndefOr[String] = js.undefined
  /**
    * Additional CSS class(es) to apply to the ColorPicker.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Object or CSS-compatible string to describe the color.
    */
  var color: IColor | String
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IColorPicker]] = js.undefined
  /**
    * Label for the green text field.
    * @defaultvalue Green
    * @deprecated Use `strings`
    */
  var greenLabel: js.UndefOr[String] = js.undefined
  /**
    * Label for the hex text field.
    * @defaultvalue Hex
    * @deprecated Use `strings`
    */
  var hexLabel: js.UndefOr[String] = js.undefined
  /**
    * Callback for when the user changes the color.
    * (Not called when the color is changed via props.)
    */
  var onChange: js.UndefOr[
    js.Function2[/* ev */ SyntheticEvent[HTMLElement, Event_], /* color */ IColor, Unit]
  ] = js.undefined
  /**
    * Label for the red text field.
    * @defaultvalue Red
    * @deprecated Use `strings`
    */
  var redLabel: js.UndefOr[String] = js.undefined
  /**
    * Whether to show color preview box.
    * @defaultvalue false
    */
  var showPreview: js.UndefOr[Boolean] = js.undefined
  /**
    * Labels for elements within the ColorPicker. Defaults are provided in English only.
    */
  var strings: js.UndefOr[IColorPickerStrings] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]] = js.undefined
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IColorPickerProps {
  @scala.inline
  def apply(
    color: IColor | String,
    alphaLabel: String = null,
    alphaSliderHidden: js.UndefOr[Boolean] = js.undefined,
    blueLabel: String = null,
    className: String = null,
    componentRef: IRefObject[IColorPicker] = null,
    greenLabel: String = null,
    hexLabel: String = null,
    onChange: (/* ev */ SyntheticEvent[HTMLElement, Event_], /* color */ IColor) => Unit = null,
    redLabel: String = null,
    showPreview: js.UndefOr[Boolean] = js.undefined,
    strings: IColorPickerStrings = null,
    styles: IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles] = null,
    theme: ITheme = null
  ): IColorPickerProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (alphaLabel != null) __obj.updateDynamic("alphaLabel")(alphaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(alphaSliderHidden)) __obj.updateDynamic("alphaSliderHidden")(alphaSliderHidden.asInstanceOf[js.Any])
    if (blueLabel != null) __obj.updateDynamic("blueLabel")(blueLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (greenLabel != null) __obj.updateDynamic("greenLabel")(greenLabel.asInstanceOf[js.Any])
    if (hexLabel != null) __obj.updateDynamic("hexLabel")(hexLabel.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (redLabel != null) __obj.updateDynamic("redLabel")(redLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreview)) __obj.updateDynamic("showPreview")(showPreview.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerProps]
  }
}


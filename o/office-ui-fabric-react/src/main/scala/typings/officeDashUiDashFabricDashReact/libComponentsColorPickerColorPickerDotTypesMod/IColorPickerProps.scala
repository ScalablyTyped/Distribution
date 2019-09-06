package typings.officeDashUiDashFabricDashReact.libComponentsColorPickerColorPickerDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libUtilitiesColorInterfacesMod.IColor
import typings.react.Event
import typings.react.reactMod.SyntheticEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPickerProps extends js.Object {
  /**
    * Label for the alpha textfield.
    * @defaultvalue Alpha
    */
  var alphaLabel: js.UndefOr[String] = js.undefined
  /**
    * Whether to hide the alpha control slider.
    */
  var alphaSliderHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Label for the blue text field.
    * @defaultvalue Blue
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
    */
  var greenLabel: js.UndefOr[String] = js.undefined
  /**
    * Label for the hex text field.
    * @defaultvalue Hex
    */
  var hexLabel: js.UndefOr[String] = js.undefined
  /**
    * Callback for when the user changes the color.
    * (Not called when the color is changed via props.)
    */
  var onChange: js.UndefOr[
    js.Function2[/* ev */ SyntheticEvent[HTMLElement, Event], /* color */ IColor, Unit]
  ] = js.undefined
  /**
    * Label for the red text field.
    * @defaultvalue Red
    */
  var redLabel: js.UndefOr[String] = js.undefined
  /**
    * Whether to show color preview box.
    * @defaultvalue false
    */
  var showPreview: js.UndefOr[Boolean] = js.undefined
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
    onChange: (/* ev */ SyntheticEvent[HTMLElement, Event], /* color */ IColor) => Unit = null,
    redLabel: String = null,
    showPreview: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles] = null,
    theme: ITheme = null
  ): IColorPickerProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (alphaLabel != null) __obj.updateDynamic("alphaLabel")(alphaLabel)
    if (!js.isUndefined(alphaSliderHidden)) __obj.updateDynamic("alphaSliderHidden")(alphaSliderHidden)
    if (blueLabel != null) __obj.updateDynamic("blueLabel")(blueLabel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (greenLabel != null) __obj.updateDynamic("greenLabel")(greenLabel)
    if (hexLabel != null) __obj.updateDynamic("hexLabel")(hexLabel)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (redLabel != null) __obj.updateDynamic("redLabel")(redLabel)
    if (!js.isUndefined(showPreview)) __obj.updateDynamic("showPreview")(showPreview)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IColorPickerProps]
  }
}


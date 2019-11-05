package typings.officeDashUiDashFabricDashReact.libComponentsColorPickerColorRectangleColorRectangleDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libUtilitiesColorInterfacesMod.IColor
import typings.react.NativeMouseEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorRectangleProps extends js.Object {
  /**
    * Detailed description for how to use the color rectangle. Moving the thumb horizontally adjusts
    * saturation and moving it vertically adjusts value (essentially, brightness).
    * @defaultvalue 'Use left and right arrow keys to set saturation. Use up and down arrow keys to set brightness.'
    */
  var ariaDescription: js.UndefOr[String] = js.undefined
  /**
    * Label of the ColorRectangle for the benefit of screen reader users.
    * @defaultvalue 'Saturation and brightness'
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Format string for the color rectangle's current value as read by screen readers.
    * The string must include descriptions and two placeholders for the current values:
    * `{0}` for saturation and `{1}` for value/brightness.
    * @defaultvalue `'Saturation {0} brightness {1}'`
    */
  var ariaValueFormat: js.UndefOr[String] = js.undefined
  /**
    * Additional CSS class(es) to apply to the ColorRectangle.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Current color of the rectangle.
    */
  var color: IColor
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IColorRectangle]] = js.undefined
  /**
    * Minimum width and height.
    */
  var minSize: js.UndefOr[Double] = js.undefined
  /**
    * Callback for when the color changes.
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* ev */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], 
      /* color */ IColor, 
      Unit
    ]
  ] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]] = js.undefined
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IColorRectangleProps {
  @scala.inline
  def apply(
    color: IColor,
    ariaDescription: String = null,
    ariaLabel: String = null,
    ariaValueFormat: String = null,
    className: String = null,
    componentRef: IRefObject[IColorRectangle] = null,
    minSize: Int | Double = null,
    onChange: (/* ev */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], /* color */ IColor) => Unit = null,
    styles: IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles] = null,
    theme: ITheme = null
  ): IColorRectangleProps = {
    val __obj = js.Dynamic.literal(color = color)
    if (ariaDescription != null) __obj.updateDynamic("ariaDescription")(ariaDescription)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (ariaValueFormat != null) __obj.updateDynamic("ariaValueFormat")(ariaValueFormat)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IColorRectangleProps]
  }
}


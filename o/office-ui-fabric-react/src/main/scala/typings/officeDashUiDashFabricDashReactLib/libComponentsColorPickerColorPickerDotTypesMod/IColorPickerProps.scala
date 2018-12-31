package typings
package officeDashUiDashFabricDashReactLib.libComponentsColorPickerColorPickerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPickerProps
  extends atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[IColorPicker] {
  /**
    * Label for the alpha textfield.
    * @defaultvalue Alpha
    */
  var alphaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The setting of whether to hide the alpha control slider.
    */
  var alphaSliderHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Label for the blue textfield.
    * @defaultvalue Blue
    */
  var blueLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Additional CSS class(es) to apply to the ColorPicker.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSS-compatible string to describe the initial color.
    */
  var color: java.lang.String
  /**
    * Label for the green textfield.
    * @defaultvalue Green
    */
  var greenLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label for the hex textfield.
    * @defaultvalue Hex
    */
  var hexLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback issued when the user changes the color.
    */
  var onColorChanged: js.UndefOr[
    js.Function2[
      /* color */ java.lang.String, 
      /* colorObject */ officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Label for the red textfield.
    * @defaultvalue Red
    */
  var redLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]
  ] = js.undefined
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}


package typings
package officeDashUiDashFabricDashReactLib.libComponentsColorPickerColorSliderColorSliderDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IColorSliderProps
  extends atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[IColorSlider] {
  /**
       * Additional CSS class(es) to apply to the ColorSlider.
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If true, the slider represents an alpha slider.
       * Otherwise, the slider represents a hue slider.
       */
  var isAlpha: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Maximum value of the slider.
       */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /**
       * Minimum value of the slider.
       */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /**
       * Callback issued when the value changes.
       */
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      /* newValue */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Deprecated, use `onChange` instead.
       * @deprecated Use `onChange` instead.
       */
  var onChanged: js.UndefOr[js.Function1[/* newValue */ scala.Double, scala.Unit]] = js.undefined
  /**
       * Custom style for the overlay element.
       */
  var overlayStyle: js.UndefOr[js.Any] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]
  ] = js.undefined
  /**
       * Theme (provided through customization).
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * CSS-compatible string for the color of the thumb element.
       */
  var thumbColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Current value of the slider.
       */
  var value: js.UndefOr[scala.Double] = js.undefined
}


package typings
package officeDashUiDashFabricDashReactLib.libComponentsColorPickerColorRectangleColorRectangleDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorRectangleProps
  extends atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[IColorRectangle] {
  /**
    * Additional CSS class(es) to apply to the ColorRectangle.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Current color of the rectangle.
    */
  var color: officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor
  /**
    * Minimum width and height.
    */
  var minSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback issued when the color changes.
    */
  var onSVChanged: js.UndefOr[js.Function2[/* s */ scala.Double, /* v */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]
  ] = js.undefined
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}


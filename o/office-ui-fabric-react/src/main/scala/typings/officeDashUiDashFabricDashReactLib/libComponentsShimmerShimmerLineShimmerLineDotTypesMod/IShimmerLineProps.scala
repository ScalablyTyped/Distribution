package typings
package officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerLineShimmerLineDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerLineProps
  extends reactLib.reactMod.ReactNs.AllHTMLAttributes[reactLib.HTMLElement] {
  /**
    * Use to set custom styling of the shimmerLine borders.
    * @deprecated Use `styles` prop to leverage mergeStyle API.
    */
  var borderStyle: js.UndefOr[atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle] = js.undefined
  /**
    * Optional callback to access the IShimmerLine interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IShimmerLine]] = js.undefined
  /**
    * Sets the height of the rectangle.
    * @defaultvalue 16px
    */
  @JSName("height")
  var height_IShimmerLineProps: js.UndefOr[scala.Double] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IShimmerLineStyleProps, IShimmerLineStyles]
  ] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}


package typings
package officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerCircleShimmerCircleDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerCircleProps
  extends reactLib.reactMod.ReactNs.AllHTMLAttributes[reactLib.HTMLElement] {
  /**
    * Use to set custom styling of the shimmerCircle borders.
    * @deprecated Use `styles` prop to leverage mergeStyle API.
    */
  var borderStyle: js.UndefOr[atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle] = js.undefined
  /**
    * Optional callback to access the IShimmerCircle interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IShimmerCircle]] = js.undefined
  /**
    * Sets the height of the circle.
    * @defaultvalue 24px
    */
  @JSName("height")
  var height_IShimmerCircleProps: js.UndefOr[scala.Double] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IShimmerCircleStyleProps, IShimmerCircleStyles]
  ] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}


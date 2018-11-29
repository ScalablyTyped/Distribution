package typings
package officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerGapShimmerGapDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IShimmerGapProps
  extends reactLib.reactMod.ReactNs.AllHTMLAttributes[reactLib.HTMLElement] {
  /**
       * Use to set custom styling of the shimmerGap borders.
       * @deprecated Use `styles` prop to leverage mergeStyle API.
       */
  var borderStyle: js.UndefOr[atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle] = js.undefined
  /**
       * Optional callback to access the IShimmerGap interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IShimmerGap]] = js.undefined
  /**
       * Sets the height of the gap.
       * @defaultvalue 16px
       */
  @JSName("height")
  var height_IShimmerGapProps: js.UndefOr[scala.Double] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IShimmerGapStyleProps, IShimmerGapStyles]
  ] = js.undefined
  /**
       * Theme provided by High-Order Component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}


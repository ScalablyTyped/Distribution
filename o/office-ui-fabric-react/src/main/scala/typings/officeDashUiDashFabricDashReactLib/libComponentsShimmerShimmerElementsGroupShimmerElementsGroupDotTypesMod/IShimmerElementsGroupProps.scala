package typings
package officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerElementsGroupShimmerElementsGroupDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IShimmerElementsGroupProps
  extends reactLib.reactMod.ReactNs.AllHTMLAttributes[reactLib.HTMLElement] {
  /**
       * Optional callback to access the IShimmerElementsGroup interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IShimmerElementsGroup]] = js.undefined
  /**
       * Optional boolean for enabling flexWrap of the container containing the shimmerElements.
       * @defaultvalue false
       */
  var flexWrap: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional maximum row height of the shimmerElements container.
       */
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * Elements to render in one group of the Shimmer.
       */
  var shimmerElements: js.UndefOr[
    js.Array[
      officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerDotTypesMod.IShimmerElement
    ]
  ] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IShimmerElementsGroupStyleProps, IShimmerElementsGroupStyles]
  ] = js.undefined
  /**
       * Theme provided by High-Order Component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * Optional width for ShimmerElements container.
       */
  @JSName("width")
  var width_IShimmerElementsGroupProps: js.UndefOr[java.lang.String] = js.undefined
}


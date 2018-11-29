package typings
package officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IShimmerProps
  extends reactLib.reactMod.ReactNs.AllHTMLAttributes[reactLib.HTMLElement] {
  /**
       * Localized string of the status label for screen reader
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional callback to access the IShimmer interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IShimmer]] = js.undefined
  /**
       * Custom elements when necessary to build complex placeholder skeletons.
       */
  var customElementsGroup: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
       * Controls when the shimmer is swapped with actual data through an animated transition.
       * @defaultvalue false
       */
  var isDataLoaded: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Elements to render in one line of the Shimmer.
       */
  var shimmerElements: js.UndefOr[js.Array[IShimmerElement]] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IShimmerStyleProps, IShimmerStyles]
  ] = js.undefined
  /**
       * Theme provided by High-Order Component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}


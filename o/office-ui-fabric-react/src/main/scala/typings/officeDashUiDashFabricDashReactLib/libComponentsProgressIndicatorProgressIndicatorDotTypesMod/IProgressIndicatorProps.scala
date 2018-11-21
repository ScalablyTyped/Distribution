package typings
package officeDashUiDashFabricDashReactLib.libComponentsProgressIndicatorProgressIndicatorDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IProgressIndicatorProps
  extends reactLib.reactMod.ReactNs.Props[
      officeDashUiDashFabricDashReactLib.libComponentsProgressIndicatorProgressIndicatorDotBaseMod.ProgressIndicatorBase
    ] {
  /**
       * Text alternative of the progress status, used by screen readers for reading the value of the progress.
       */
  var ariaValueText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Height of the ProgressIndicator
       * @default 2
       */
  var barHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * Additional css class to apply to the ProgressIndicator
       * @defaultvalue undefined
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Gets the component ref.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IProgressIndicator]] = js.undefined
  /**
       * Text describing or supplementing the operation. May be a string or React virtual elements.
       */
  var description: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
       * Label to display above the control. May be a string or React virtual elements.
       */
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
       * A render override for the progress track.
       */
  var onRenderProgress: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IProgressIndicatorProps]
  ] = js.undefined
  /**
       * Percentage of the operation's completeness. If this is not set, the indeterminate progress animation will be shown instead.
       */
  var percentComplete: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether or not to hide the progress state.
       */
  var progressHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles]
  ] = js.undefined
  /**
       * Theme provided by High-Order Component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * Deprecated at v0.43.0, to be removed at >= v0.53.0. Use 'label' instead.
       * @deprecated
       */
  var title: js.UndefOr[java.lang.String] = js.undefined
}


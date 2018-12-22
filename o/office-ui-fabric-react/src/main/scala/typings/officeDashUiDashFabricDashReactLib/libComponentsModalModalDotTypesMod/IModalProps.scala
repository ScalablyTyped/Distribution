package typings
package officeDashUiDashFabricDashReactLib.libComponentsModalModalDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IModalProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[officeDashUiDashFabricDashReactLib.libComponentsModalModalDotBaseMod.ModalBase]
     with officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithResponsiveModeMod.IWithResponsiveModeState
     with officeDashUiDashFabricDashReactLib.libCommonIAccessiblePopupPropsMod.IAccessiblePopupProps {
  /**
       * Optional class name to be added to the root class
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional callback to access the IDialog interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IModal]] = js.undefined
  /**
       * Optional override for container class
       */
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Whether the dialog can be light dismissed by clicking outside the dialog (on the overlay).
       * @defaultvalue false
       */
  var isBlocking: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the overlay is dark themed.
       * @defaultvalue true
       */
  var isDarkOverlay: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the dialog is displayed.
       * @defaultvalue false
       */
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Props to be passed through to Layer
       */
  var layerProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsLayerLayerDotTypesMod.ILayerProps
  ] = js.undefined
  /**
       * A callback function for when the Modal is dismissed light dismiss, before the animation completes.
       */
  var onDismiss: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[
        reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent]
      ], 
      _
    ]
  ] = js.undefined
  /**
       * A callback function which is called after the Modal is dismissed and the animation is complete.
       */
  var onDismissed: js.UndefOr[js.Function0[_]] = js.undefined
  /**
       * A callback function for when the Modal content is mounted on the overlay layer
       * @deprecated Use layerProps.onLayerDidMount instead
       */
  var onLayerDidMount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Optional override for scrollable content class
       */
  var scrollableContentClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IModalStyleProps, IModalStyles]
  ] = js.undefined
  /**
       * ARIA id for the subtitle of the Modal, if any
       */
  var subtitleAriaId: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Theme provided by High-Order Component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * ARIA id for the title of the Modal, if any
       */
  var titleAriaId: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Whether the modal should have top offset fixed once opened and expand from the bottom only
       * when the content changes dynamically.
       */
  var topOffsetFixed: js.UndefOr[scala.Boolean] = js.undefined
}


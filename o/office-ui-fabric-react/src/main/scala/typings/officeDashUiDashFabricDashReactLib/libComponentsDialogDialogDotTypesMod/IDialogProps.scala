package typings
package officeDashUiDashFabricDashReactLib.libComponentsDialogDialogDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDialogProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[
      officeDashUiDashFabricDashReactLib.libComponentsDialogDialogDotBaseMod.DialogBase
    ]
     with officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithResponsiveModeMod.IWithResponsiveModeState
     with officeDashUiDashFabricDashReactLib.libCommonIAccessiblePopupPropsMod.IAccessiblePopupProps {
  /**
       * Optional id for aria-DescribedBy
       * @deprecated Pass through via `modalProps.subtitleAriaId` instead.
       */
  var ariaDescribedById: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional id for aria-LabelledBy
       * @deprecated Pass through via `modalProps.titleAriaId` instead.
       */
  var ariaLabelledById: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional class name to be added to the root class
       * @deprecated Pass through via `modalProps.className` instead
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional callback to access the IDialog interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IDialog]] = js.undefined
  /**
       * Optional override for container class
       * @deprecated Pass through via `modalProps.className` instead
       */
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional override content class
       * @deprecated Pass through via `dialogContentProps` instead as `className`.
       */
  var contentClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Props to be passed through to Dialog Content
       */
  var dialogContentProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsDialogDialogContentDotTypesMod.IDialogContentProps
  ] = js.undefined
  /**
       * Whether the dialog is hidden.
       * @defaultvalue true
       */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the dialog can be light dismissed by clicking outside the dialog (on the overlay).
       * @defaultvalue false
       * @deprecated Pass through via `modalProps` instead
       */
  var isBlocking: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the overlay is dark themed.
       * @defaultvalue true
       * @deprecated Pass through via `modalProps` instead
       */
  var isDarkOverlay: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the dialog is displayed.
       * Deprecated, use `hidden` instead.
       * @defaultvalue false
       * @deprecated Use `hidden` instead
       */
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Sets the maximum width for the dialog. It limits the width property to be larger
       * than the value specified in max-width.
       */
  var maxWidth: js.UndefOr[
    atUifabricMergeDashStylesLib.libIRawStyleBaseMod.ICSSRule | atUifabricMergeDashStylesLib.libIRawStyleBaseMod.ICSSPixelUnitRule
  ] = js.undefined
  /**
       * Sets the minimum width of the dialog. It limits the width property to be not
       * smaller than the value specified in min-width.
       */
  var minWidth: js.UndefOr[
    atUifabricMergeDashStylesLib.libIRawStyleBaseMod.ICSSRule | atUifabricMergeDashStylesLib.libIRawStyleBaseMod.ICSSPixelUnitRule
  ] = js.undefined
  /**
       * Props to be passed through to Modal
       */
  var modalProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsModalModalDotTypesMod.IModalProps
  ] = js.undefined
  /**
       * A callback function for when the Dialog is dismissed from the close button or light dismiss.
       * Can also be specified separately in content and modal.
       */
  var onDismiss: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement]], 
      _
    ]
  ] = js.undefined
  /**
       * A callback function which is called after the Dialog is dismissed and the animation is complete.
       * @deprecated Pass through via `modalProps` instead
       */
  var onDismissed: js.UndefOr[js.Function0[_]] = js.undefined
  /**
       * A callback function for when the Dialog content is mounted on the overlay layer
       * @deprecated Pass through via `modalProps.layerProps` instead
       */
  var onLayerDidMount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Deprecated at 0.81.2, use `onLayerDidMount` instead.
       * @deprecated Use `onLayerDidMount` instead.
       */
  var onLayerMounted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles]
  ] = js.undefined
  /**
       * The subtext to display in the dialog.
       * @deprecated Pass through via `dialogContentProps` instead.
       */
  var subText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Theme provided by HOC.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * The title text to display at the top of the dialog.
       * @deprecated Pass through via `dialogContentProps` instead.
       */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Other top buttons that will show up next to the close button
       * @deprecated Pass through via `dialogContentProps` instead.
       */
  var topButtonsProps: js.UndefOr[
    js.Array[
      officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonProps
    ]
  ] = js.undefined
  /**
       * The type of Dialog to display.
       * @defaultvalue DialogType.normal
       * @deprecated Pass through via `dialogContentProps` instead.
       */
  var `type`: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsDialogDialogContentDotTypesMod.DialogType
  ] = js.undefined
}


package typings
package officeDashUiDashFabricDashReactLib.libComponentsDialogDialogContentDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDialogContentProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[
      officeDashUiDashFabricDashReactLib.libComponentsDialogDialogContentDotBaseMod.DialogContentBase
    ] {
  /**
       * Optional override class name
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Label to be passed to to aria-label of close button
       * @defaultvalue Close
       */
  var closeButtonAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional callback to access the IDialogContent interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IDialogContent]] = js.undefined
  /**
       * Is inside a multiline wrapper
       */
  var isMultiline: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A callback function for when the Dialog is dismissed from the close button or light dismiss, before the animation completes.
       */
  var onDismiss: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement]], 
      _
    ]
  ] = js.undefined
  /**
       * Responsive mode passed in from decorator.
       */
  var responsiveMode: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
  ] = js.undefined
  /**
       * Show an 'x' close button in the upper-right corner
       */
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IDialogContentStyleProps, IDialogContentStyles]
  ] = js.undefined
  /**
       * The subtext to display in the dialog
       */
  var subText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The Id for subText container
       */
  var subTextId: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Theme provided by HOC.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * The title text to display at the top of the dialog.
       */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The Id for title container
       */
  var titleId: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Other top buttons that will show up next to the close button
       */
  var topButtonsProps: js.UndefOr[
    js.Array[
      officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonProps
    ]
  ] = js.undefined
  /**
       * The type of Dialog to display.
       * @defaultvalue DialogType.normal
       */
  var `type`: js.UndefOr[DialogType] = js.undefined
}


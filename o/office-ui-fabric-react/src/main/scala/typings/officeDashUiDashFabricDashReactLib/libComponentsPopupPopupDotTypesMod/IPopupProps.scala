package typings
package officeDashUiDashFabricDashReactLib.libComponentsPopupPopupDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPopupProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[officeDashUiDashFabricDashReactLib.libComponentsPopupPopupMod.Popup] {
  /**
       * Defines the element id referencing the element containing the description for the popup.
       */
  var ariaDescribedBy: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Accessible label text for the popup.
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       *  Defines the element id referencing the element containing label text for popup.
       */
  var ariaLabelledBy: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional callback to access the IPopup interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IPopup]] = js.undefined
  /**
       * A callback function for when the popup is dismissed from the close button or light dismiss. If provided, will
       * handle escape keypresses and call this. The event will be stopped/canceled.
       */
  var onDismiss: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[
        (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement]
      ], 
      _
    ]
  ] = js.undefined
  /**
       * If true, the unmounting of this component will cause focus to be restored to the element that had focus when first mounted.
       * @defaultvalue true
       */
  var shouldRestoreFocus: js.UndefOr[scala.Boolean] = js.undefined
}


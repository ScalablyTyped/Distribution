package typings
package officeDashUiDashFabricDashReactLib.libComponentsFocusTrapZoneFocusTrapZoneDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFocusTrapZoneProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  /**
    * Sets the aria-labelledby attribute.
    */
  var ariaLabelledBy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional callback to access the IFocusTrapZone interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IFocusTrapZone]] = js.undefined
  /**
    * Do not put focus onto first element when render focus trap zone
    * @defaultvalue false
    */
  var disableFirstFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the HTMLElement to focus on when exiting the FocusTrapZone.
    * @defaultvalue The element.target that triggered the FTZ.
    */
  var elementToFocusOnDismiss: js.UndefOr[reactLib.HTMLElement] = js.undefined
  /**
    * Indicates the selector for first focusable item.  Only applies if focusPreviouslyFocusedInnerElement == false.
    */
  var firstFocusableSelector: js.UndefOr[java.lang.String | js.Function0[java.lang.String]] = js.undefined
  /**
    * Specifies the algorithm used to determine which descendant element to focus when focus() is called.
    * If false, the first focusable descendant, filtered by the firstFocusableSelector property if present, is chosen.
    * If true, the element that was focused when the Trap Zone last had a focused descendant is chosen.
    * If it has never had a focused descendant before, behavior falls back to the first focused descendant.
    * @defaultvalue false
    */
  var focusPreviouslyFocusedInnerElement: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether focus trap zone should force focus inside the focus trap zone
    * @defaultvalue true
    */
  var forceFocusInsideTrap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if this Trap Zone will ignore keeping track of HTMLElement that activated the Zone.
    * @defaultvalue false
    */
  var ignoreExternalFocusing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if this Trap Zone will allow clicks outside the FocusTrapZone
    * @defaultvalue false
    */
  var isClickableOutsideFocusTrap: js.UndefOr[scala.Boolean] = js.undefined
}


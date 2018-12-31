package typings
package officeDashUiDashFabricDashReactLib.libCommonIAccessiblePopupPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessiblePopupProps extends js.Object {
  /**
    * Aria label on close button
    */
  var closeButtonAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the HTMLElement to focus on when exiting the FocusTrapZone.
    * @defaultvalue The element.target that triggered the Panel.
    */
  var elementToFocusOnDismiss: js.UndefOr[reactLib.HTMLElement] = js.undefined
  /**
    * Indicates the selector for first focusable item
    */
  var firstFocusableSelector: js.UndefOr[java.lang.String | js.Function0[java.lang.String]] = js.undefined
  /**
    * Indicates whether dialog should force focus inside the focus trap zone
    * @defaultvalue true
    */
  var forceFocusInsideTrap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if this dialog will ignore keeping track of HTMLElement that activated the Zone.
    * @defaultvalue false
    */
  var ignoreExternalFocusing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if this dialog will allow clicks outside the FocusTrapZone
    * @defaultvalue false
    */
  var isClickableOutsideFocusTrap: js.UndefOr[scala.Boolean] = js.undefined
}


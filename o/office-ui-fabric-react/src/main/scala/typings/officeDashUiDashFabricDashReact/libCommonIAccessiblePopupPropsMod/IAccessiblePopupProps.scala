package typings.officeDashUiDashFabricDashReact.libCommonIAccessiblePopupPropsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessiblePopupProps extends js.Object {
  /**
    * Aria label on close button
    */
  var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Sets the HTMLElement to focus on when exiting the FocusTrapZone.
    * @defaultvalue The element.target that triggered the Panel.
    */
  var elementToFocusOnDismiss: js.UndefOr[HTMLElement] = js.undefined
  /**
    * Indicates the selector for first focusable item
    */
  var firstFocusableSelector: js.UndefOr[String | js.Function0[String]] = js.undefined
  /**
    * Indicates whether dialog should force focus inside the focus trap zone
    * @defaultvalue true
    */
  var forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if this dialog will ignore keeping track of HTMLElement that activated the Zone.
    * @defaultvalue false
    */
  var ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if this dialog will allow clicks outside the FocusTrapZone
    * @defaultvalue false
    */
  var isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.undefined
}

object IAccessiblePopupProps {
  @scala.inline
  def apply(
    closeButtonAriaLabel: String = null,
    elementToFocusOnDismiss: HTMLElement = null,
    firstFocusableSelector: String | js.Function0[String] = null,
    forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined,
    ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined,
    isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.undefined
  ): IAccessiblePopupProps = {
    val __obj = js.Dynamic.literal()
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (elementToFocusOnDismiss != null) __obj.updateDynamic("elementToFocusOnDismiss")(elementToFocusOnDismiss.asInstanceOf[js.Any])
    if (firstFocusableSelector != null) __obj.updateDynamic("firstFocusableSelector")(firstFocusableSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFocusInsideTrap)) __obj.updateDynamic("forceFocusInsideTrap")(forceFocusInsideTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExternalFocusing)) __obj.updateDynamic("ignoreExternalFocusing")(ignoreExternalFocusing.asInstanceOf[js.Any])
    if (!js.isUndefined(isClickableOutsideFocusTrap)) __obj.updateDynamic("isClickableOutsideFocusTrap")(isClickableOutsideFocusTrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessiblePopupProps]
  }
}


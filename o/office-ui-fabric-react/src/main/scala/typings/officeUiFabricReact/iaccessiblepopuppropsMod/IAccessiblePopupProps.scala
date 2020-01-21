package typings.officeUiFabricReact.iaccessiblepopuppropsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessiblePopupProps extends js.Object {
  /**
    * Aria label on close button.
    */
  var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Sets the element to focus on when exiting the control's FocusTrapZone.
    * @defaultvalue The `element.target` that triggered the control opening.
    */
  var elementToFocusOnDismiss: js.UndefOr[HTMLElement] = js.undefined
  /**
    * Class name (not actual selector) for first focusable item. Do not append a dot.
    */
  var firstFocusableSelector: js.UndefOr[String | js.Function0[String]] = js.undefined
  /**
    * Whether control should force focus inside its focus trap zone.
    * @defaultvalue true
    */
  var forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined
  /**
    * If false (the default), the control's FocusTrapZone will restore focus to the element which
    * activated it once the trap zone is unmounted or disabled. Set to true to disable this behavior.
    * @defaultvalue false
    */
  var ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this control will allow clicks outside its FocusTrapZone.
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


package typings.officeDashUiDashFabricDashReact.libComponentsFocusTrapZoneFocusTrapZoneDotTypesMod

import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFocusTrapZoneProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Sets the aria-labelledby attribute.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the IFocusTrapZone interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IFocusTrapZone]] = js.undefined
  /**
    * Do not put focus onto first element when render focus trap zone
    * @defaultvalue false
    */
  var disableFirstFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Disables the FocusTrapZone's focus trapping behavior when set.
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the HTMLElement to focus on when exiting the FocusTrapZone.
    * @defaultvalue element.target The element.target that triggered the FTZ.
    */
  var elementToFocusOnDismiss: js.UndefOr[HTMLElement] = js.undefined
  /**
    * Class name for first focusable item (do not append a dot).
    * Only applies if `focusPreviouslyFocusedInnerElement` is false.
    */
  var firstFocusableSelector: js.UndefOr[String | js.Function0[String]] = js.undefined
  /**
    * Specifies the algorithm used to determine which descendant element to focus when focus() is called.
    * If false, the first focusable descendant, filtered by the firstFocusableSelector property if present, is chosen.
    * If true, the element that was focused when the Trap Zone last had a focused descendant is chosen.
    * If it has never had a focused descendant before, behavior falls back to the first focused descendant.
    * @defaultvalue false
    */
  var focusPreviouslyFocusedInnerElement: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether focus trap zone should force focus inside the focus trap zone
    * @defaultvalue true
    */
  var forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if this Trap Zone will ignore keeping track of HTMLElement that activated the Zone.
    * @defaultvalue false
    */
  var ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if this Trap Zone will allow clicks outside the FocusTrapZone
    * @defaultvalue false
    */
  var isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.undefined
}

object IFocusTrapZoneProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    ariaLabelledBy: String = null,
    componentRef: IRefObject[IFocusTrapZone] = null,
    disableFirstFocus: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementToFocusOnDismiss: HTMLElement = null,
    firstFocusableSelector: String | js.Function0[String] = null,
    focusPreviouslyFocusedInnerElement: js.UndefOr[Boolean] = js.undefined,
    forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined,
    ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined,
    isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.undefined
  ): IFocusTrapZoneProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFirstFocus)) __obj.updateDynamic("disableFirstFocus")(disableFirstFocus)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (elementToFocusOnDismiss != null) __obj.updateDynamic("elementToFocusOnDismiss")(elementToFocusOnDismiss)
    if (firstFocusableSelector != null) __obj.updateDynamic("firstFocusableSelector")(firstFocusableSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(focusPreviouslyFocusedInnerElement)) __obj.updateDynamic("focusPreviouslyFocusedInnerElement")(focusPreviouslyFocusedInnerElement)
    if (!js.isUndefined(forceFocusInsideTrap)) __obj.updateDynamic("forceFocusInsideTrap")(forceFocusInsideTrap)
    if (!js.isUndefined(ignoreExternalFocusing)) __obj.updateDynamic("ignoreExternalFocusing")(ignoreExternalFocusing)
    if (!js.isUndefined(isClickableOutsideFocusTrap)) __obj.updateDynamic("isClickableOutsideFocusTrap")(isClickableOutsideFocusTrap)
    __obj.asInstanceOf[IFocusTrapZoneProps]
  }
}


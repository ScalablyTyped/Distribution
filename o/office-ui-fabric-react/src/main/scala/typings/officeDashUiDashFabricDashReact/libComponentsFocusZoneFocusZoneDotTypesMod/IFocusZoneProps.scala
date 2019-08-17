package typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod

import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneMod.FocusZone
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.ReactType
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFocusZoneProps extends HTMLAttributes[HTMLElement | FocusZone] {
  /** Allow focus to move to root */
  var allowFocusRoot: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows tab key to be handled to tab through a list of items in the focus zone,
    * an unfortunate side effect is that users will not be able to tab out of the focus zone
    * and have to hit escape or some other key.
    * @deprecated Use `handleTabKey` instead.
    *
    */
  var allowTabKey: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the aria-describedby attribute.
    * @deprecated Directly use the `aria-describedby` attribute instead
    */
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  /**
    * Sets the aria-labelledby attribute.
    * @deprecated Directly use the `aria-labelledby` attribute instead
    */
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  /**
    * A component that should be used as the root element of the FocusZone component.
    */
  var as: js.UndefOr[ReactType[_]] = js.undefined
  /**
    * Whether the to check for data-no-horizontal-wrap or data-no-vertical-wrap attributes
    * when determining how to move focus
    * @defaultvalue false
    */
  var checkForNoWrap: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional callback to access the IFocusZone interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IFocusZone]] = js.undefined
  /**
    * Optionally provide a selector for identifying the intial active element.
    */
  var defaultActiveElement: js.UndefOr[String] = js.undefined
  /**
    * Defines which arrows to react to.
    * @defaultvalue FocusZoneDirection.bidirectional
    */
  var direction: js.UndefOr[FocusZoneDirection] = js.undefined
  /**
    * If set, the FocusZone will not be tabbable and keyboard navigation will be disabled.
    * This does not affect disabled attribute of any child.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the FocusZone should allow focus events to propagate past the FocusZone
    */
  var doNotAllowFocusEventToPropagate: js.UndefOr[Boolean] = js.undefined
  /**
    * Element type the root element will use. Default is "div".
    * @deprecated Use 'as' instead.
    */
  var elementType: js.UndefOr[js.Any] = js.undefined
  /**
    * Allows tab key to be handled to tab through a list of items in the focus zone,
    * an unfortunate side effect is that users will not be able to tab out of the focus zone
    * and have to hit escape or some other key.
    */
  var handleTabKey: js.UndefOr[FocusZoneTabbableElements] = js.undefined
  /**
    * If set, will cycle to the beginning of the targets once the user navigates to the
    * next target while at the end, and to the end when navigate to the previous at the beginning.
    */
  var isCircularNavigation: js.UndefOr[Boolean] = js.undefined
  /**
    * If provided, this callback will be executed on keypresses to determine if the user
    * intends to navigate into the inner zone. Returning true will ask the first inner zone to
    * set focus.
    */
  var isInnerZoneKeystroke: js.UndefOr[js.Function1[/* ev */ KeyboardEvent[HTMLElement], Boolean]] = js.undefined
  /**
    * Callback for when one of immediate children elements gets active by getting focused
    * or by having one of its respective children elements focused.
    */
  var onActiveElementChanged: js.UndefOr[
    js.Function2[
      /* element */ js.UndefOr[HTMLElement], 
      /* ev */ js.UndefOr[FocusEvent[HTMLElement]], 
      Unit
    ]
  ] = js.undefined
  /**
    * Callback method for determining if focus should indeed be set on the given element.
    * @param element - The child element within the zone to focus.
    * @returns True if focus should be set to the given element, false to avoid setting focus.
    */
  var onBeforeFocus: js.UndefOr[js.Function1[/* childElement */ js.UndefOr[HTMLElement], Boolean]] = js.undefined
  /**
    * Callback to notify creators that focus has been set on the FocusZone
    */
  var onFocusNotification: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Deprecated at v1.12.1. DIV props provided to the FocusZone will be mixed into the root element.
    * @deprecated DIV props provided to the FocusZone will be mixed into the root element.
    */
  var rootProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
  /**
    * A callback method to determine if the input element should lose focus on arrow keys
    *  @param inputElement - The input element which is to loose focus.
    *  @returns True if input element should loose focus or false otherwise.
    */
  var shouldInputLoseFocusOnArrowKey: js.UndefOr[js.Function1[/* inputElement */ HTMLInputElement, Boolean]] = js.undefined
}

object IFocusZoneProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement | FocusZone] = null,
    allowFocusRoot: js.UndefOr[Boolean] = js.undefined,
    allowTabKey: js.UndefOr[Boolean] = js.undefined,
    ariaDescribedBy: String = null,
    ariaLabelledBy: String = null,
    as: ReactType[_] = null,
    checkForNoWrap: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    componentRef: IRefObject[IFocusZone] = null,
    defaultActiveElement: String = null,
    direction: FocusZoneDirection = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    doNotAllowFocusEventToPropagate: js.UndefOr[Boolean] = js.undefined,
    elementType: js.Any = null,
    handleTabKey: FocusZoneTabbableElements = null,
    isCircularNavigation: js.UndefOr[Boolean] = js.undefined,
    isInnerZoneKeystroke: /* ev */ KeyboardEvent[HTMLElement] => Boolean = null,
    onActiveElementChanged: (/* element */ js.UndefOr[HTMLElement], /* ev */ js.UndefOr[FocusEvent[HTMLElement]]) => Unit = null,
    onBeforeFocus: /* childElement */ js.UndefOr[HTMLElement] => Boolean = null,
    onFocusNotification: () => Unit = null,
    rootProps: HTMLAttributes[HTMLDivElement] = null,
    shouldInputLoseFocusOnArrowKey: /* inputElement */ HTMLInputElement => Boolean = null
  ): IFocusZoneProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(allowFocusRoot)) __obj.updateDynamic("allowFocusRoot")(allowFocusRoot)
    if (!js.isUndefined(allowTabKey)) __obj.updateDynamic("allowTabKey")(allowTabKey)
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy)
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(checkForNoWrap)) __obj.updateDynamic("checkForNoWrap")(checkForNoWrap)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (defaultActiveElement != null) __obj.updateDynamic("defaultActiveElement")(defaultActiveElement)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(doNotAllowFocusEventToPropagate)) __obj.updateDynamic("doNotAllowFocusEventToPropagate")(doNotAllowFocusEventToPropagate)
    if (elementType != null) __obj.updateDynamic("elementType")(elementType)
    if (handleTabKey != null) __obj.updateDynamic("handleTabKey")(handleTabKey)
    if (!js.isUndefined(isCircularNavigation)) __obj.updateDynamic("isCircularNavigation")(isCircularNavigation)
    if (isInnerZoneKeystroke != null) __obj.updateDynamic("isInnerZoneKeystroke")(js.Any.fromFunction1(isInnerZoneKeystroke))
    if (onActiveElementChanged != null) __obj.updateDynamic("onActiveElementChanged")(js.Any.fromFunction2(onActiveElementChanged))
    if (onBeforeFocus != null) __obj.updateDynamic("onBeforeFocus")(js.Any.fromFunction1(onBeforeFocus))
    if (onFocusNotification != null) __obj.updateDynamic("onFocusNotification")(js.Any.fromFunction0(onFocusNotification))
    if (rootProps != null) __obj.updateDynamic("rootProps")(rootProps)
    if (shouldInputLoseFocusOnArrowKey != null) __obj.updateDynamic("shouldInputLoseFocusOnArrowKey")(js.Any.fromFunction1(shouldInputLoseFocusOnArrowKey))
    __obj.asInstanceOf[IFocusZoneProps]
  }
}


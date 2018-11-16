package typings
package officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IFocusZoneProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[
      reactLib.HTMLElement | officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneMod.FocusZone
    ] {
  /** Allow focus to move to root */
  var allowFocusRoot: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Allows tab key to be handled to tab through a list of items in the focus zone,
       * an unfortunate side effect is that users will not be able to tab out of the focus zone
       * and have to hit escape or some other key.
       * @deprecated Use `handleTabKey` instead.
       *
       */
  var allowTabKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Sets the aria-describedby attribute.
       */
  var ariaDescribedBy: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Sets the aria-labelledby attribute.
       */
  var ariaLabelledBy: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Whether the to check for data-no-horizontal-wrap or data-no-vertical-wrap attributes
       * when determining how to move focus
       * @defaultvalue false
       */
  var checkForNoWrap: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional callback to access the IFocusZone interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IFocusZone]] = js.undefined
  /**
       * Optionally provide a selector for identifying the intial active element.
       */
  var defaultActiveElement: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Defines which arrows to react to.
       * @defaultvalue FocusZoneDirection.bidriectional
       */
  var direction: js.UndefOr[FocusZoneDirection] = js.undefined
  /**
       * If set, the FocusZone will not be tabbable and keyboard navigation will be disabled.
       * This does not affect disabled attribute of any child.
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the FocusZone should allow focus events to propagate past the FocusZone
       */
  var doNotAllowFocusEventToPropagate: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Element type the root element will use. Default is "div".
       */
  var elementType: js.UndefOr[java.lang.String] = js.undefined
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
  var isCircularNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If provided, this callback will be executed on keypresses to determine if the user
       * intends to navigate into the inner zone. Returning true will ask the first inner zone to
       * set focus.
       */
  var isInnerZoneKeystroke: js.UndefOr[
    js.Function1[
      /* ev */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      scala.Boolean
    ]
  ] = js.undefined
  /**
       * Callback for when one of immediate children elements gets active by getting focused
       * or by having one of its respective children elements focused.
       */
  var onActiveElementChanged: js.UndefOr[
    js.Function2[
      /* element */ js.UndefOr[reactLib.HTMLElement], 
      /* ev */ js.UndefOr[reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Callback method for determining if focus should indeed be set on the given element.
       * @param element - The child element within the zone to focus.
       * @returns True if focus should be set to the given element, false to avoid setting focus.
       */
  var onBeforeFocus: js.UndefOr[js.Function1[/* childElement */ js.UndefOr[reactLib.HTMLElement], scala.Boolean]] = js.undefined
  /**
       * Callback to notify creators that focus has been set on the FocusZone
       */
  var onFocusNotification: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Deprecated at v1.12.1. DIV props provided to the FocusZone will be mixed into the root element.
       * @deprecated DIV props provided to the FocusZone will be mixed into the root element.
       */
  var rootProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement]] = js.undefined
  /**
       * A callback method to determine if the input element should lose focus on arrow keys
       *  @param inputElement - The input element which is to loose focus.
       *  @returns True if input element should loose focus or false otherwise.
       */
  var shouldInputLoseFocusOnArrowKey: js.UndefOr[js.Function1[/* inputElement */ reactLib.HTMLInputElement, scala.Boolean]] = js.undefined
}


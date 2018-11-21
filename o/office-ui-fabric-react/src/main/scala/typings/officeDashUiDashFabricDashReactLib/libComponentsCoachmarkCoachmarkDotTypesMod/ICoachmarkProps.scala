package typings
package officeDashUiDashFabricDashReactLib.libComponentsCoachmarkCoachmarkDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICoachmarkProps
  extends reactLib.reactMod.ReactNs.Props[officeDashUiDashFabricDashReactLib.libComponentsCoachmarkCoachmarkMod.Coachmark] {
  /**
       * Text to announce to screen reader / narrator when Coachmark is displayed
       */
  var ariaAlertText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Defines the element id referencing the element containing the description for the Coachmark.
       */
  var ariaDescribedBy: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Defines the text content for the ariaDescribedBy element
       */
  var ariaDescribedByText: js.UndefOr[java.lang.String] = js.undefined
  /**
       *  Defines the element id referencing the element containing label text for Coachmark.
       */
  var ariaLabelledBy: js.UndefOr[java.lang.String] = js.undefined
  /**
       *  Defines the text content for the ariaLabelledBy element
       */
  var ariaLabelledByText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Beacon color one.
       */
  var beaconColorOne: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Beacon color two.
       */
  var beaconColorTwo: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The height of the Beak component.
       * @deprecated
       */
  var beakHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * The width of the Beak component.
       * @deprecated
       */
  var beakWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * The starting collapsed state for the Coachmark.  Use isCollapsed instead.
       * @default true
       * @deprecated
       */
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Color of the Coachmark/TeachingBubble.
       */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional callback to access the ICoachmark interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ICoachmark]] = js.undefined
  /**
       * Delay in milliseconds before Coachmark animation appears.
       * @default 0
       */
  var delayBeforeCoachmarkAnimation: js.UndefOr[scala.Double] = js.undefined
  /**
       * Delay before allowing mouse movements to open the Coachmark.
       * @default 3600
       */
  var delayBeforeMouseOpen: js.UndefOr[scala.Double] = js.undefined
  /**
       * The height of the Coachmark.
       * @deprecated
       */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
       * The starting collapsed state for the Coachmark.
       * @default true
       */
  var isCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether or not to force the Coachmark/TeachingBubble content to fit within the window bounds.
       * @default true
       */
  var isPositionForced: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The distance in pixels the mouse is located
       * before opening up the Coachmark.
       * @default 10
       */
  var mouseProximityOffset: js.UndefOr[scala.Double] = js.undefined
  /**
       * Callback when the opening animation completes.
       */
  var onAnimationOpenEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Callback when the opening animation begins.
       */
  var onAnimationOpenStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Callback when the Coachmark tries to close.
       */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /**
       * Callback to run when the mouse moves.
       */
  var onMouseMove: js.UndefOr[js.Function1[/* e */ reactLib.MouseEvent, scala.Unit]] = js.undefined
  /**
       * Props to pass to the PositioningContainer component. Specify the `directionalHint` to indicate
       * on which edge the Coachmark/TeachingBubble should be positioned.
       * @default directionalHint: DirectionalHint.bottomAutoEdge
       */
  var positioningContainerProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsCoachmarkPositioningContainerPositioningContainerDotTypesMod.IPositioningContainerProps
  ] = js.undefined
  /**
       * If true then the Coachmark will not dismiss when it loses focus
       * @default false
       */
  var preventDismissOnLostFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[
      officeDashUiDashFabricDashReactLib.libComponentsCoachmarkCoachmarkDotStylesMod.ICoachmarkStyleProps, 
      officeDashUiDashFabricDashReactLib.libComponentsCoachmarkCoachmarkDotStylesMod.ICoachmarkStyles
    ]
  ] = js.undefined
  /**
       * The target that the Coachmark should try to position itself based on.
       */
  var target: reactLib.HTMLElement | java.lang.String | scala.Null
  /**
       * Ref for TeachingBubble
       * @deprecated Coachmark uses focusFirstChild utility instead to focus on TeachingBubbleContent
       */
  var teachingBubbleRef: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsTeachingBubbleTeachingBubbleDotTypesMod.ITeachingBubble
  ] = js.undefined
  /**
       * The width of the Coachmark.
       * @deprecated
       */
  var width: js.UndefOr[scala.Double] = js.undefined
}


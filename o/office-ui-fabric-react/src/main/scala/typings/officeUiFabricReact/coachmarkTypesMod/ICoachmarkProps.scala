package typings.officeUiFabricReact.coachmarkTypesMod

import typings.officeUiFabricReact.coachmarkBaseMod.CoachmarkBase
import typings.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps
import typings.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubble
import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoachmarkProps extends ClassAttributes[CoachmarkBase] {
  /**
    * Text to announce to screen reader / narrator when Coachmark is displayed
    */
  var ariaAlertText: js.UndefOr[String] = js.undefined
  /**
    * Defines the element id referencing the element containing the description for the Coachmark.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  /**
    * Defines the text content for the ariaDescribedBy element
    */
  var ariaDescribedByText: js.UndefOr[String] = js.undefined
  /**
    *  Defines the element id referencing the element containing label text for Coachmark.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  /**
    *  Defines the text content for the ariaLabelledBy element
    */
  var ariaLabelledByText: js.UndefOr[String] = js.undefined
  /**
    * Beacon color one.
    */
  var beaconColorOne: js.UndefOr[String] = js.undefined
  /**
    * Beacon color two.
    */
  var beaconColorTwo: js.UndefOr[String] = js.undefined
  /**
    * The height of the Beak component.
    * @deprecated No longer used.
    */
  var beakHeight: js.UndefOr[Double] = js.undefined
  /**
    * The width of the Beak component.
    * @deprecated No longer used.
    */
  var beakWidth: js.UndefOr[Double] = js.undefined
  /**
    * If provided, additional class name to provide on the root element.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * The starting collapsed state for the Coachmark.  Use `isCollapsed` instead.
    * @defaultvalue true
    * @deprecated Use `isCollapsed` instead.
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /**
    * Color of the Coachmark/TeachingBubble.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the ICoachmark interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ICoachmark]] = js.undefined
  /**
    * Delay in milliseconds before Coachmark animation appears.
    * @defaultvalue 0
    */
  var delayBeforeCoachmarkAnimation: js.UndefOr[Double] = js.undefined
  /**
    * Delay before allowing mouse movements to open the Coachmark.
    * @defaultvalue 3600
    */
  var delayBeforeMouseOpen: js.UndefOr[Double] = js.undefined
  /**
    * The height of the Coachmark.
    * @deprecated No longer used.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The starting collapsed state for the Coachmark.
    * @defaultvalue true
    */
  var isCollapsed: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not to force the Coachmark/TeachingBubble content to fit within the window bounds.
    * @defaultvalue true
    */
  var isPositionForced: js.UndefOr[Boolean] = js.undefined
  /**
    * The distance in pixels the mouse is located
    * before opening up the Coachmark.
    * @defaultvalue 10
    */
  var mouseProximityOffset: js.UndefOr[Double] = js.undefined
  /**
    * Callback when the opening animation completes.
    */
  var onAnimationOpenEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback when the opening animation begins.
    */
  var onAnimationOpenStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback when the Coachmark tries to close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.undefined
  /**
    * Callback to run when the mouse moves.
    */
  var onMouseMove: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  /**
    * If true then the Coachmark beak (arrow pointing towards target) will always be visible as long as
    * Coachmark is visible
    * @defaultvalue false
    */
  var persistentBeak: js.UndefOr[Boolean] = js.undefined
  /**
    * Props to pass to the PositioningContainer component. Specify the `directionalHint` to indicate
    * on which edge the Coachmark/TeachingBubble should be positioned.
    * @defaultvalue directionalHint: DirectionalHint.bottomAutoEdge
    */
  var positioningContainerProps: js.UndefOr[IPositioningContainerProps] = js.undefined
  /**
    * If true then the Coachmark will not dismiss when it loses focus
    * @defaultvalue false
    */
  var preventDismissOnLostFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * If true then focus will not be set to the Coachmark when it mounts. Useful in cases where focus on coachmark
    * is causing other components in page to dismiss upon losing focus.
    * @defaultvalue false
    */
  var preventFocusOnMount: js.UndefOr[Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles]] = js.undefined
  /**
    * The target that the Coachmark should try to position itself based on.
    */
  var target: HTMLElement | String | Null
  /**
    * Ref for TeachingBubble
    * @deprecated Coachmark uses `focusFirstChild` utility instead to focus on TeachingBubbleContent
    */
  var teachingBubbleRef: js.UndefOr[ITeachingBubble] = js.undefined
  /**
    * Theme provided by higher order component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * The width of the Coachmark.
    * @deprecated No longer used.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ICoachmarkProps {
  @scala.inline
  def apply(
    ariaAlertText: String = null,
    ariaDescribedBy: String = null,
    ariaDescribedByText: String = null,
    ariaLabelledBy: String = null,
    ariaLabelledByText: String = null,
    beaconColorOne: String = null,
    beaconColorTwo: String = null,
    beakHeight: js.UndefOr[Double] = js.undefined,
    beakWidth: js.UndefOr[Double] = js.undefined,
    className: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    componentRef: IRefObject[ICoachmark] = null,
    delayBeforeCoachmarkAnimation: js.UndefOr[Double] = js.undefined,
    delayBeforeMouseOpen: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    isCollapsed: js.UndefOr[Boolean] = js.undefined,
    isPositionForced: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    mouseProximityOffset: js.UndefOr[Double] = js.undefined,
    onAnimationOpenEnd: () => Unit = null,
    onAnimationOpenStart: () => Unit = null,
    onDismiss: /* ev */ js.UndefOr[js.Any] => Unit = null,
    onMouseMove: /* e */ MouseEvent => Unit = null,
    persistentBeak: js.UndefOr[Boolean] = js.undefined,
    positioningContainerProps: IPositioningContainerProps = null,
    preventDismissOnLostFocus: js.UndefOr[Boolean] = js.undefined,
    preventFocusOnMount: js.UndefOr[Boolean] = js.undefined,
    ref: js.UndefOr[Null | LegacyRef[CoachmarkBase]] = js.undefined,
    styles: IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles] = null,
    target: HTMLElement | String = null,
    teachingBubbleRef: ITeachingBubble = null,
    theme: ITheme = null,
    width: js.UndefOr[Double] = js.undefined
  ): ICoachmarkProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (ariaAlertText != null) __obj.updateDynamic("ariaAlertText")(ariaAlertText.asInstanceOf[js.Any])
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaDescribedByText != null) __obj.updateDynamic("ariaDescribedByText")(ariaDescribedByText.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (ariaLabelledByText != null) __obj.updateDynamic("ariaLabelledByText")(ariaLabelledByText.asInstanceOf[js.Any])
    if (beaconColorOne != null) __obj.updateDynamic("beaconColorOne")(beaconColorOne.asInstanceOf[js.Any])
    if (beaconColorTwo != null) __obj.updateDynamic("beaconColorTwo")(beaconColorTwo.asInstanceOf[js.Any])
    if (!js.isUndefined(beakHeight)) __obj.updateDynamic("beakHeight")(beakHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(beakWidth)) __obj.updateDynamic("beakWidth")(beakWidth.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(delayBeforeCoachmarkAnimation)) __obj.updateDynamic("delayBeforeCoachmarkAnimation")(delayBeforeCoachmarkAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayBeforeMouseOpen)) __obj.updateDynamic("delayBeforeMouseOpen")(delayBeforeMouseOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPositionForced)) __obj.updateDynamic("isPositionForced")(isPositionForced.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseProximityOffset)) __obj.updateDynamic("mouseProximityOffset")(mouseProximityOffset.get.asInstanceOf[js.Any])
    if (onAnimationOpenEnd != null) __obj.updateDynamic("onAnimationOpenEnd")(js.Any.fromFunction0(onAnimationOpenEnd))
    if (onAnimationOpenStart != null) __obj.updateDynamic("onAnimationOpenStart")(js.Any.fromFunction0(onAnimationOpenStart))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (!js.isUndefined(persistentBeak)) __obj.updateDynamic("persistentBeak")(persistentBeak.get.asInstanceOf[js.Any])
    if (positioningContainerProps != null) __obj.updateDynamic("positioningContainerProps")(positioningContainerProps.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDismissOnLostFocus)) __obj.updateDynamic("preventDismissOnLostFocus")(preventDismissOnLostFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventFocusOnMount)) __obj.updateDynamic("preventFocusOnMount")(preventFocusOnMount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (teachingBubbleRef != null) __obj.updateDynamic("teachingBubbleRef")(teachingBubbleRef.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoachmarkProps]
  }
}


package typings.officeUiFabricReact

import typings.officeUiFabricReact.coachmarkBaseMod.CoachmarkBase
import typings.officeUiFabricReact.coachmarkTypesMod.ICoachmark
import typings.officeUiFabricReact.coachmarkTypesMod.ICoachmarkStyleProps
import typings.officeUiFabricReact.coachmarkTypesMod.ICoachmarkStyles
import typings.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps
import typings.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubble
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

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/Coachmark/Coachmark.types.ICoachmarkProps> */
trait PartialICoachmarkProps extends js.Object {
  var ariaAlertText: js.UndefOr[String] = js.undefined
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  var ariaDescribedByText: js.UndefOr[String] = js.undefined
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  var ariaLabelledByText: js.UndefOr[String] = js.undefined
  var beaconColorOne: js.UndefOr[String] = js.undefined
  var beaconColorTwo: js.UndefOr[String] = js.undefined
  var beakHeight: js.UndefOr[Double] = js.undefined
  var beakWidth: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var componentRef: js.UndefOr[IRefObject[ICoachmark]] = js.undefined
  var delayBeforeCoachmarkAnimation: js.UndefOr[Double] = js.undefined
  var delayBeforeMouseOpen: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var isCollapsed: js.UndefOr[Boolean] = js.undefined
  var isPositionForced: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var mouseProximityOffset: js.UndefOr[Double] = js.undefined
  var onAnimationOpenEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAnimationOpenStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  var persistentBeak: js.UndefOr[Boolean] = js.undefined
  var positioningContainerProps: js.UndefOr[IPositioningContainerProps] = js.undefined
  var preventDismissOnLostFocus: js.UndefOr[Boolean] = js.undefined
  var preventFocusOnMount: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[LegacyRef[CoachmarkBase]] = js.undefined
  var styles: js.UndefOr[IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles]] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
  var teachingBubbleRef: js.UndefOr[ITeachingBubble] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialICoachmarkProps {
  @scala.inline
  def apply(
    ariaAlertText: String = null,
    ariaDescribedBy: String = null,
    ariaDescribedByText: String = null,
    ariaLabelledBy: String = null,
    ariaLabelledByText: String = null,
    beaconColorOne: String = null,
    beaconColorTwo: String = null,
    beakHeight: Int | Double = null,
    beakWidth: Int | Double = null,
    className: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    componentRef: IRefObject[ICoachmark] = null,
    delayBeforeCoachmarkAnimation: Int | Double = null,
    delayBeforeMouseOpen: Int | Double = null,
    height: Int | Double = null,
    isCollapsed: js.UndefOr[Boolean] = js.undefined,
    isPositionForced: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    mouseProximityOffset: Int | Double = null,
    onAnimationOpenEnd: () => Unit = null,
    onAnimationOpenStart: () => Unit = null,
    onDismiss: /* ev */ js.UndefOr[js.Any] => Unit = null,
    onMouseMove: /* e */ MouseEvent => Unit = null,
    persistentBeak: js.UndefOr[Boolean] = js.undefined,
    positioningContainerProps: IPositioningContainerProps = null,
    preventDismissOnLostFocus: js.UndefOr[Boolean] = js.undefined,
    preventFocusOnMount: js.UndefOr[Boolean] = js.undefined,
    ref: LegacyRef[CoachmarkBase] = null,
    styles: IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles] = null,
    target: HTMLElement | String = null,
    teachingBubbleRef: ITeachingBubble = null,
    theme: ITheme = null,
    width: Int | Double = null
  ): PartialICoachmarkProps = {
    val __obj = js.Dynamic.literal()
    if (ariaAlertText != null) __obj.updateDynamic("ariaAlertText")(ariaAlertText.asInstanceOf[js.Any])
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaDescribedByText != null) __obj.updateDynamic("ariaDescribedByText")(ariaDescribedByText.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (ariaLabelledByText != null) __obj.updateDynamic("ariaLabelledByText")(ariaLabelledByText.asInstanceOf[js.Any])
    if (beaconColorOne != null) __obj.updateDynamic("beaconColorOne")(beaconColorOne.asInstanceOf[js.Any])
    if (beaconColorTwo != null) __obj.updateDynamic("beaconColorTwo")(beaconColorTwo.asInstanceOf[js.Any])
    if (beakHeight != null) __obj.updateDynamic("beakHeight")(beakHeight.asInstanceOf[js.Any])
    if (beakWidth != null) __obj.updateDynamic("beakWidth")(beakWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (delayBeforeCoachmarkAnimation != null) __obj.updateDynamic("delayBeforeCoachmarkAnimation")(delayBeforeCoachmarkAnimation.asInstanceOf[js.Any])
    if (delayBeforeMouseOpen != null) __obj.updateDynamic("delayBeforeMouseOpen")(delayBeforeMouseOpen.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(isPositionForced)) __obj.updateDynamic("isPositionForced")(isPositionForced.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (mouseProximityOffset != null) __obj.updateDynamic("mouseProximityOffset")(mouseProximityOffset.asInstanceOf[js.Any])
    if (onAnimationOpenEnd != null) __obj.updateDynamic("onAnimationOpenEnd")(js.Any.fromFunction0(onAnimationOpenEnd))
    if (onAnimationOpenStart != null) __obj.updateDynamic("onAnimationOpenStart")(js.Any.fromFunction0(onAnimationOpenStart))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (!js.isUndefined(persistentBeak)) __obj.updateDynamic("persistentBeak")(persistentBeak.asInstanceOf[js.Any])
    if (positioningContainerProps != null) __obj.updateDynamic("positioningContainerProps")(positioningContainerProps.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDismissOnLostFocus)) __obj.updateDynamic("preventDismissOnLostFocus")(preventDismissOnLostFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(preventFocusOnMount)) __obj.updateDynamic("preventFocusOnMount")(preventFocusOnMount.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (teachingBubbleRef != null) __obj.updateDynamic("teachingBubbleRef")(teachingBubbleRef.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialICoachmarkProps]
  }
}


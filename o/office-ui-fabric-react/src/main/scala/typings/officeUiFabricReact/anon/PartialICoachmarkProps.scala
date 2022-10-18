package typings.officeUiFabricReact.anon

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsCoachmarkCoachmarkDotbaseMod.CoachmarkBase
import typings.officeUiFabricReact.libComponentsCoachmarkCoachmarkDottypesMod.ICoachmark
import typings.officeUiFabricReact.libComponentsCoachmarkCoachmarkDottypesMod.ICoachmarkStyleProps
import typings.officeUiFabricReact.libComponentsCoachmarkCoachmarkDottypesMod.ICoachmarkStyles
import typings.officeUiFabricReact.libComponentsCoachmarkPositioningContainerPositioningContainerDottypesMod.IPositioningContainerProps
import typings.officeUiFabricReact.libComponentsTeachingBubbleTeachingBubbleDottypesMod.ITeachingBubble
import typings.react.mod.LegacyRef
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/Coachmark/Coachmark.types.ICoachmarkProps> */
trait PartialICoachmarkProps extends StObject {
  
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
  
  var key: js.UndefOr[typings.react.mod.Key | Null] = js.undefined
  
  var mouseProximityOffset: js.UndefOr[Double] = js.undefined
  
  var onAnimationOpenEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  
  var onAnimationOpenStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[Any], scala.Unit]] = js.undefined
  
  var onMouseMove: js.UndefOr[js.Function1[/* e */ MouseEvent, scala.Unit]] = js.undefined
  
  var persistentBeak: js.UndefOr[Boolean] = js.undefined
  
  var positioningContainerProps: js.UndefOr[IPositioningContainerProps] = js.undefined
  
  var preventDismissOnLostFocus: js.UndefOr[Boolean] = js.undefined
  
  var preventFocusOnMount: js.UndefOr[Boolean] = js.undefined
  
  var ref: js.UndefOr[LegacyRef[CoachmarkBase]] = js.undefined
  
  var styles: js.UndefOr[IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles]] = js.undefined
  
  var target: js.UndefOr[HTMLElement | String | Null] = js.undefined
  
  var teachingBubbleRef: js.UndefOr[ITeachingBubble] = js.undefined
  
  var theme: js.UndefOr[ITheme] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PartialICoachmarkProps {
  
  inline def apply(): PartialICoachmarkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialICoachmarkProps]
  }
  
  extension [Self <: PartialICoachmarkProps](x: Self) {
    
    inline def setAriaAlertText(value: String): Self = StObject.set(x, "ariaAlertText", value.asInstanceOf[js.Any])
    
    inline def setAriaAlertTextUndefined: Self = StObject.set(x, "ariaAlertText", js.undefined)
    
    inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def setAriaDescribedByText(value: String): Self = StObject.set(x, "ariaDescribedByText", value.asInstanceOf[js.Any])
    
    inline def setAriaDescribedByTextUndefined: Self = StObject.set(x, "ariaDescribedByText", js.undefined)
    
    inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
    
    inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelledByText(value: String): Self = StObject.set(x, "ariaLabelledByText", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelledByTextUndefined: Self = StObject.set(x, "ariaLabelledByText", js.undefined)
    
    inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
    
    inline def setBeaconColorOne(value: String): Self = StObject.set(x, "beaconColorOne", value.asInstanceOf[js.Any])
    
    inline def setBeaconColorOneUndefined: Self = StObject.set(x, "beaconColorOne", js.undefined)
    
    inline def setBeaconColorTwo(value: String): Self = StObject.set(x, "beaconColorTwo", value.asInstanceOf[js.Any])
    
    inline def setBeaconColorTwoUndefined: Self = StObject.set(x, "beaconColorTwo", js.undefined)
    
    inline def setBeakHeight(value: Double): Self = StObject.set(x, "beakHeight", value.asInstanceOf[js.Any])
    
    inline def setBeakHeightUndefined: Self = StObject.set(x, "beakHeight", js.undefined)
    
    inline def setBeakWidth(value: Double): Self = StObject.set(x, "beakWidth", value.asInstanceOf[js.Any])
    
    inline def setBeakWidthUndefined: Self = StObject.set(x, "beakWidth", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setComponentRef(value: IRefObject[ICoachmark]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    inline def setComponentRefFunction1(value: /* ref */ ICoachmark | Null => scala.Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
    
    inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    
    inline def setDelayBeforeCoachmarkAnimation(value: Double): Self = StObject.set(x, "delayBeforeCoachmarkAnimation", value.asInstanceOf[js.Any])
    
    inline def setDelayBeforeCoachmarkAnimationUndefined: Self = StObject.set(x, "delayBeforeCoachmarkAnimation", js.undefined)
    
    inline def setDelayBeforeMouseOpen(value: Double): Self = StObject.set(x, "delayBeforeMouseOpen", value.asInstanceOf[js.Any])
    
    inline def setDelayBeforeMouseOpenUndefined: Self = StObject.set(x, "delayBeforeMouseOpen", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
    
    inline def setIsCollapsedUndefined: Self = StObject.set(x, "isCollapsed", js.undefined)
    
    inline def setIsPositionForced(value: Boolean): Self = StObject.set(x, "isPositionForced", value.asInstanceOf[js.Any])
    
    inline def setIsPositionForcedUndefined: Self = StObject.set(x, "isPositionForced", js.undefined)
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMouseProximityOffset(value: Double): Self = StObject.set(x, "mouseProximityOffset", value.asInstanceOf[js.Any])
    
    inline def setMouseProximityOffsetUndefined: Self = StObject.set(x, "mouseProximityOffset", js.undefined)
    
    inline def setOnAnimationOpenEnd(value: () => scala.Unit): Self = StObject.set(x, "onAnimationOpenEnd", js.Any.fromFunction0(value))
    
    inline def setOnAnimationOpenEndUndefined: Self = StObject.set(x, "onAnimationOpenEnd", js.undefined)
    
    inline def setOnAnimationOpenStart(value: () => scala.Unit): Self = StObject.set(x, "onAnimationOpenStart", js.Any.fromFunction0(value))
    
    inline def setOnAnimationOpenStartUndefined: Self = StObject.set(x, "onAnimationOpenStart", js.undefined)
    
    inline def setOnDismiss(value: /* ev */ js.UndefOr[Any] => scala.Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
    
    inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    inline def setOnMouseMove(value: /* e */ MouseEvent => scala.Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setPersistentBeak(value: Boolean): Self = StObject.set(x, "persistentBeak", value.asInstanceOf[js.Any])
    
    inline def setPersistentBeakUndefined: Self = StObject.set(x, "persistentBeak", js.undefined)
    
    inline def setPositioningContainerProps(value: IPositioningContainerProps): Self = StObject.set(x, "positioningContainerProps", value.asInstanceOf[js.Any])
    
    inline def setPositioningContainerPropsUndefined: Self = StObject.set(x, "positioningContainerProps", js.undefined)
    
    inline def setPreventDismissOnLostFocus(value: Boolean): Self = StObject.set(x, "preventDismissOnLostFocus", value.asInstanceOf[js.Any])
    
    inline def setPreventDismissOnLostFocusUndefined: Self = StObject.set(x, "preventDismissOnLostFocus", js.undefined)
    
    inline def setPreventFocusOnMount(value: Boolean): Self = StObject.set(x, "preventFocusOnMount", value.asInstanceOf[js.Any])
    
    inline def setPreventFocusOnMountUndefined: Self = StObject.set(x, "preventFocusOnMount", js.undefined)
    
    inline def setRef(value: LegacyRef[CoachmarkBase]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ CoachmarkBase | Null => scala.Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setStyles(value: IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesFunction1(value: ICoachmarkStyleProps => DeepPartial[ICoachmarkStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTeachingBubbleRef(value: ITeachingBubble): Self = StObject.set(x, "teachingBubbleRef", value.asInstanceOf[js.Any])
    
    inline def setTeachingBubbleRefUndefined: Self = StObject.set(x, "teachingBubbleRef", js.undefined)
    
    inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

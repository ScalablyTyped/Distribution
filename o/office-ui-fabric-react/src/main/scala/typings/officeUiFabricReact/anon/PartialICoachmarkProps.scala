package typings.officeUiFabricReact.anon

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.coachmarkBaseMod.CoachmarkBase
import typings.officeUiFabricReact.coachmarkTypesMod.ICoachmark
import typings.officeUiFabricReact.coachmarkTypesMod.ICoachmarkStyleProps
import typings.officeUiFabricReact.coachmarkTypesMod.ICoachmarkStyles
import typings.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps
import typings.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubble
import typings.react.mod.LegacyRef
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/Coachmark/Coachmark.types.ICoachmarkProps> */
@js.native
trait PartialICoachmarkProps extends js.Object {
  
  var ariaAlertText: js.UndefOr[String] = js.native
  
  var ariaDescribedBy: js.UndefOr[String] = js.native
  
  var ariaDescribedByText: js.UndefOr[String] = js.native
  
  var ariaLabelledBy: js.UndefOr[String] = js.native
  
  var ariaLabelledByText: js.UndefOr[String] = js.native
  
  var beaconColorOne: js.UndefOr[String] = js.native
  
  var beaconColorTwo: js.UndefOr[String] = js.native
  
  var beakHeight: js.UndefOr[Double] = js.native
  
  var beakWidth: js.UndefOr[Double] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var collapsed: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var componentRef: js.UndefOr[IRefObject[ICoachmark]] = js.native
  
  var delayBeforeCoachmarkAnimation: js.UndefOr[Double] = js.native
  
  var delayBeforeMouseOpen: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var isCollapsed: js.UndefOr[Boolean] = js.native
  
  var isPositionForced: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[typings.react.mod.Key | Null] = js.native
  
  var mouseProximityOffset: js.UndefOr[Double] = js.native
  
  var onAnimationOpenEnd: js.UndefOr[js.Function0[scala.Unit]] = js.native
  
  var onAnimationOpenStart: js.UndefOr[js.Function0[scala.Unit]] = js.native
  
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], scala.Unit]] = js.native
  
  var onMouseMove: js.UndefOr[js.Function1[/* e */ MouseEvent, scala.Unit]] = js.native
  
  var persistentBeak: js.UndefOr[Boolean] = js.native
  
  var positioningContainerProps: js.UndefOr[IPositioningContainerProps] = js.native
  
  var preventDismissOnLostFocus: js.UndefOr[Boolean] = js.native
  
  var preventFocusOnMount: js.UndefOr[Boolean] = js.native
  
  var ref: js.UndefOr[LegacyRef[CoachmarkBase]] = js.native
  
  var styles: js.UndefOr[IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles]] = js.native
  
  var target: js.UndefOr[HTMLElement | String | Null] = js.native
  
  var teachingBubbleRef: js.UndefOr[ITeachingBubble] = js.native
  
  var theme: js.UndefOr[ITheme] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialICoachmarkProps {
  
  @scala.inline
  def apply(): PartialICoachmarkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialICoachmarkProps]
  }
  
  @scala.inline
  implicit class PartialICoachmarkPropsOps[Self <: PartialICoachmarkProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAriaAlertText(value: String): Self = this.set("ariaAlertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaAlertText: Self = this.set("ariaAlertText", js.undefined)
    
    @scala.inline
    def setAriaDescribedBy(value: String): Self = this.set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaDescribedBy: Self = this.set("ariaDescribedBy", js.undefined)
    
    @scala.inline
    def setAriaDescribedByText(value: String): Self = this.set("ariaDescribedByText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaDescribedByText: Self = this.set("ariaDescribedByText", js.undefined)
    
    @scala.inline
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    
    @scala.inline
    def setAriaLabelledByText(value: String): Self = this.set("ariaLabelledByText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelledByText: Self = this.set("ariaLabelledByText", js.undefined)
    
    @scala.inline
    def setBeaconColorOne(value: String): Self = this.set("beaconColorOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeaconColorOne: Self = this.set("beaconColorOne", js.undefined)
    
    @scala.inline
    def setBeaconColorTwo(value: String): Self = this.set("beaconColorTwo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeaconColorTwo: Self = this.set("beaconColorTwo", js.undefined)
    
    @scala.inline
    def setBeakHeight(value: Double): Self = this.set("beakHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeakHeight: Self = this.set("beakHeight", js.undefined)
    
    @scala.inline
    def setBeakWidth(value: Double): Self = this.set("beakWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeakWidth: Self = this.set("beakWidth", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ICoachmark | Null => scala.Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[ICoachmark]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setDelayBeforeCoachmarkAnimation(value: Double): Self = this.set("delayBeforeCoachmarkAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayBeforeCoachmarkAnimation: Self = this.set("delayBeforeCoachmarkAnimation", js.undefined)
    
    @scala.inline
    def setDelayBeforeMouseOpen(value: Double): Self = this.set("delayBeforeMouseOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayBeforeMouseOpen: Self = this.set("delayBeforeMouseOpen", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIsCollapsed(value: Boolean): Self = this.set("isCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCollapsed: Self = this.set("isCollapsed", js.undefined)
    
    @scala.inline
    def setIsPositionForced(value: Boolean): Self = this.set("isPositionForced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPositionForced: Self = this.set("isPositionForced", js.undefined)
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    
    @scala.inline
    def setMouseProximityOffset(value: Double): Self = this.set("mouseProximityOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseProximityOffset: Self = this.set("mouseProximityOffset", js.undefined)
    
    @scala.inline
    def setOnAnimationOpenEnd(value: () => scala.Unit): Self = this.set("onAnimationOpenEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAnimationOpenEnd: Self = this.set("onAnimationOpenEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationOpenStart(value: () => scala.Unit): Self = this.set("onAnimationOpenStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAnimationOpenStart: Self = this.set("onAnimationOpenStart", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: /* ev */ js.UndefOr[js.Any] => scala.Unit): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: /* e */ MouseEvent => scala.Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setPersistentBeak(value: Boolean): Self = this.set("persistentBeak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistentBeak: Self = this.set("persistentBeak", js.undefined)
    
    @scala.inline
    def setPositioningContainerProps(value: IPositioningContainerProps): Self = this.set("positioningContainerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositioningContainerProps: Self = this.set("positioningContainerProps", js.undefined)
    
    @scala.inline
    def setPreventDismissOnLostFocus(value: Boolean): Self = this.set("preventDismissOnLostFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDismissOnLostFocus: Self = this.set("preventDismissOnLostFocus", js.undefined)
    
    @scala.inline
    def setPreventFocusOnMount(value: Boolean): Self = this.set("preventFocusOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventFocusOnMount: Self = this.set("preventFocusOnMount", js.undefined)
    
    @scala.inline
    def setRefFunction1(value: /* instance */ CoachmarkBase | Null => scala.Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: LegacyRef[CoachmarkBase]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    
    @scala.inline
    def setStylesFunction1(value: ICoachmarkStyleProps => DeepPartial[ICoachmarkStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLElement | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    
    @scala.inline
    def setTeachingBubbleRef(value: ITeachingBubble): Self = this.set("teachingBubbleRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeachingBubbleRef: Self = this.set("teachingBubbleRef", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

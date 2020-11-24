package typings.officeUiFabricReact.coachmarkTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.coachmarkBaseMod.CoachmarkBase
import typings.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps
import typings.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubble
import typings.react.mod.ClassAttributes
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoachmarkProps extends ClassAttributes[CoachmarkBase] {
  
  /**
    * Text to announce to screen reader / narrator when Coachmark is displayed
    */
  var ariaAlertText: js.UndefOr[String] = js.native
  
  /**
    * Defines the element id referencing the element containing the description for the Coachmark.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  
  /**
    * Defines the text content for the ariaDescribedBy element
    */
  var ariaDescribedByText: js.UndefOr[String] = js.native
  
  /**
    *  Defines the element id referencing the element containing label text for Coachmark.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  
  /**
    *  Defines the text content for the ariaLabelledBy element
    */
  var ariaLabelledByText: js.UndefOr[String] = js.native
  
  /**
    * Beacon color one.
    */
  var beaconColorOne: js.UndefOr[String] = js.native
  
  /**
    * Beacon color two.
    */
  var beaconColorTwo: js.UndefOr[String] = js.native
  
  /**
    * The height of the Beak component.
    * @deprecated No longer used.
    */
  var beakHeight: js.UndefOr[Double] = js.native
  
  /**
    * The width of the Beak component.
    * @deprecated No longer used.
    */
  var beakWidth: js.UndefOr[Double] = js.native
  
  /**
    * If provided, additional class name to provide on the root element.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * The starting collapsed state for the Coachmark.  Use `isCollapsed` instead.
    * @defaultvalue true
    * @deprecated Use `isCollapsed` instead.
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  
  /**
    * Color of the Coachmark/TeachingBubble.
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Optional callback to access the ICoachmark interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ICoachmark]] = js.native
  
  /**
    * Delay in milliseconds before Coachmark animation appears.
    * @defaultvalue 0
    */
  var delayBeforeCoachmarkAnimation: js.UndefOr[Double] = js.native
  
  /**
    * Delay before allowing mouse movements to open the Coachmark.
    * @defaultvalue 3600
    */
  var delayBeforeMouseOpen: js.UndefOr[Double] = js.native
  
  /**
    * The height of the Coachmark.
    * @deprecated No longer used.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The starting collapsed state for the Coachmark.
    * @defaultvalue true
    */
  var isCollapsed: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to force the Coachmark/TeachingBubble content to fit within the window bounds.
    * @defaultvalue true
    */
  var isPositionForced: js.UndefOr[Boolean] = js.native
  
  /**
    * The distance in pixels the mouse is located
    * before opening up the Coachmark.
    * @defaultvalue 10
    */
  var mouseProximityOffset: js.UndefOr[Double] = js.native
  
  /**
    * Callback when the opening animation completes.
    */
  var onAnimationOpenEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback when the opening animation begins.
    */
  var onAnimationOpenStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback when the Coachmark tries to close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  
  /**
    * Callback to run when the mouse moves.
    */
  var onMouseMove: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
  
  /**
    * If true then the Coachmark beak (arrow pointing towards target) will always be visible as long as
    * Coachmark is visible
    * @defaultvalue false
    */
  var persistentBeak: js.UndefOr[Boolean] = js.native
  
  /**
    * Props to pass to the PositioningContainer component. Specify the `directionalHint` to indicate
    * on which edge the Coachmark/TeachingBubble should be positioned.
    * @defaultvalue directionalHint: DirectionalHint.bottomAutoEdge
    */
  var positioningContainerProps: js.UndefOr[IPositioningContainerProps] = js.native
  
  /**
    * If true then the Coachmark will not dismiss when it loses focus
    * @defaultvalue false
    */
  var preventDismissOnLostFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * If true then focus will not be set to the Coachmark when it mounts. Useful in cases where focus on coachmark
    * is causing other components in page to dismiss upon losing focus.
    * @defaultvalue false
    */
  var preventFocusOnMount: js.UndefOr[Boolean] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles]] = js.native
  
  /**
    * The target that the Coachmark should try to position itself based on.
    */
  var target: HTMLElement | String | Null = js.native
  
  /**
    * Ref for TeachingBubble
    * @deprecated Coachmark uses `focusFirstChild` utility instead to focus on TeachingBubbleContent
    */
  var teachingBubbleRef: js.UndefOr[ITeachingBubble] = js.native
  
  /**
    * Theme provided by higher order component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * The width of the Coachmark.
    * @deprecated No longer used.
    */
  var width: js.UndefOr[Double] = js.native
}
object ICoachmarkProps {
  
  @scala.inline
  def apply(): ICoachmarkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICoachmarkProps]
  }
  
  @scala.inline
  implicit class ICoachmarkPropsOps[Self <: ICoachmarkProps] (val x: Self) extends AnyVal {
    
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
    def setComponentRefFunction1(value: /* ref */ ICoachmark | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
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
    def setMouseProximityOffset(value: Double): Self = this.set("mouseProximityOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseProximityOffset: Self = this.set("mouseProximityOffset", js.undefined)
    
    @scala.inline
    def setOnAnimationOpenEnd(value: () => Unit): Self = this.set("onAnimationOpenEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAnimationOpenEnd: Self = this.set("onAnimationOpenEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationOpenStart(value: () => Unit): Self = this.set("onAnimationOpenStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAnimationOpenStart: Self = this.set("onAnimationOpenStart", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: /* e */ MouseEvent => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
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
    def setStylesFunction1(value: ICoachmarkStyleProps => DeepPartial[ICoachmarkStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLElement | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
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

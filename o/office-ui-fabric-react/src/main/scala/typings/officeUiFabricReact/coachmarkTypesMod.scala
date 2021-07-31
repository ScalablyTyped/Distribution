package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.coachmarkBaseMod.CoachmarkBase
import typings.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps
import typings.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubble
import typings.react.mod.ClassAttributes
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coachmarkTypesMod {
  
  trait ICoachmark extends StObject {
    
    /**
      * Forces the Coachmark to dismiss
      */
    var dismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object ICoachmark {
    
    @scala.inline
    def apply(): ICoachmark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICoachmark]
    }
    
    @scala.inline
    implicit class ICoachmarkMutableBuilder[Self <: ICoachmark] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDismiss(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "dismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDismissUndefined: Self = StObject.set(x, "dismiss", js.undefined)
    }
  }
  
  trait ICoachmarkProps
    extends StObject
       with ClassAttributes[CoachmarkBase] {
    
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
    def apply(): ICoachmarkProps = {
      val __obj = js.Dynamic.literal(target = null)
      __obj.asInstanceOf[ICoachmarkProps]
    }
    
    @scala.inline
    implicit class ICoachmarkPropsMutableBuilder[Self <: ICoachmarkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaAlertText(value: String): Self = StObject.set(x, "ariaAlertText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaAlertTextUndefined: Self = StObject.set(x, "ariaAlertText", js.undefined)
      
      @scala.inline
      def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDescribedByText(value: String): Self = StObject.set(x, "ariaDescribedByText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDescribedByTextUndefined: Self = StObject.set(x, "ariaDescribedByText", js.undefined)
      
      @scala.inline
      def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByText(value: String): Self = StObject.set(x, "ariaLabelledByText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByTextUndefined: Self = StObject.set(x, "ariaLabelledByText", js.undefined)
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setBeaconColorOne(value: String): Self = StObject.set(x, "beaconColorOne", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeaconColorOneUndefined: Self = StObject.set(x, "beaconColorOne", js.undefined)
      
      @scala.inline
      def setBeaconColorTwo(value: String): Self = StObject.set(x, "beaconColorTwo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeaconColorTwoUndefined: Self = StObject.set(x, "beaconColorTwo", js.undefined)
      
      @scala.inline
      def setBeakHeight(value: Double): Self = StObject.set(x, "beakHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakHeightUndefined: Self = StObject.set(x, "beakHeight", js.undefined)
      
      @scala.inline
      def setBeakWidth(value: Double): Self = StObject.set(x, "beakWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakWidthUndefined: Self = StObject.set(x, "beakWidth", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[ICoachmark]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ICoachmark | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDelayBeforeCoachmarkAnimation(value: Double): Self = StObject.set(x, "delayBeforeCoachmarkAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayBeforeCoachmarkAnimationUndefined: Self = StObject.set(x, "delayBeforeCoachmarkAnimation", js.undefined)
      
      @scala.inline
      def setDelayBeforeMouseOpen(value: Double): Self = StObject.set(x, "delayBeforeMouseOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayBeforeMouseOpenUndefined: Self = StObject.set(x, "delayBeforeMouseOpen", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollapsedUndefined: Self = StObject.set(x, "isCollapsed", js.undefined)
      
      @scala.inline
      def setIsPositionForced(value: Boolean): Self = StObject.set(x, "isPositionForced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPositionForcedUndefined: Self = StObject.set(x, "isPositionForced", js.undefined)
      
      @scala.inline
      def setMouseProximityOffset(value: Double): Self = StObject.set(x, "mouseProximityOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseProximityOffsetUndefined: Self = StObject.set(x, "mouseProximityOffset", js.undefined)
      
      @scala.inline
      def setOnAnimationOpenEnd(value: () => Unit): Self = StObject.set(x, "onAnimationOpenEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAnimationOpenEndUndefined: Self = StObject.set(x, "onAnimationOpenEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationOpenStart(value: () => Unit): Self = StObject.set(x, "onAnimationOpenStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAnimationOpenStartUndefined: Self = StObject.set(x, "onAnimationOpenStart", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: /* e */ MouseEvent => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setPersistentBeak(value: Boolean): Self = StObject.set(x, "persistentBeak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentBeakUndefined: Self = StObject.set(x, "persistentBeak", js.undefined)
      
      @scala.inline
      def setPositioningContainerProps(value: IPositioningContainerProps): Self = StObject.set(x, "positioningContainerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositioningContainerPropsUndefined: Self = StObject.set(x, "positioningContainerProps", js.undefined)
      
      @scala.inline
      def setPreventDismissOnLostFocus(value: Boolean): Self = StObject.set(x, "preventDismissOnLostFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDismissOnLostFocusUndefined: Self = StObject.set(x, "preventDismissOnLostFocus", js.undefined)
      
      @scala.inline
      def setPreventFocusOnMount(value: Boolean): Self = StObject.set(x, "preventFocusOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventFocusOnMountUndefined: Self = StObject.set(x, "preventFocusOnMount", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ICoachmarkStyleProps => DeepPartial[ICoachmarkStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTeachingBubbleRef(value: ITeachingBubble): Self = StObject.set(x, "teachingBubbleRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeachingBubbleRefUndefined: Self = StObject.set(x, "teachingBubbleRef", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ICoachmarkStyleProps extends StObject {
    
    /**
      * Beacon color one
      */
    var beaconColorOne: js.UndefOr[String] = js.undefined
    
    /**
      * Beacon color two
      */
    var beaconColorTwo: js.UndefOr[String] = js.undefined
    
    /**
      * ClassName to provide on the root style area.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Is the Coachmark collapsed.
      * Deprecated, use `isCollapsed` instead.
      * @deprecated Use `isCollapsed` instead.
      */
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Color
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Delay time for the animation to start
      */
    var delayBeforeCoachmarkAnimation: js.UndefOr[String] = js.undefined
    
    /**
      * The height measured before the component has been mounted
      * in pixels
      */
    var entityHostHeight: js.UndefOr[String] = js.undefined
    
    /**
      * The width measured in pixels
      */
    var entityHostWidth: js.UndefOr[String] = js.undefined
    
    /**
      * Height of the coachmark
      */
    var height: js.UndefOr[String] = js.undefined
    
    /**
      * Is the beacon currently animating.
      * @deprecated Property is never used
      */
    var isBeaconAnimating: Boolean
    
    /**
      * Is the Coachmark collapsed
      */
    var isCollapsed: Boolean
    
    /**
      * Is the Coachmark finished measuring the dimensions of innerHostElement
      * @deprecated Value is always the inverse of `isMeasuring`
      */
    var isMeasured: Boolean
    
    /**
      * Is the component taking measurements
      */
    var isMeasuring: Boolean
    
    /**
      * Current theme.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Transform origin for teaching bubble content
      */
    var transformOrigin: js.UndefOr[String] = js.undefined
    
    /**
      * Width of the coachmark
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object ICoachmarkStyleProps {
    
    @scala.inline
    def apply(isBeaconAnimating: Boolean, isCollapsed: Boolean, isMeasured: Boolean, isMeasuring: Boolean): ICoachmarkStyleProps = {
      val __obj = js.Dynamic.literal(isBeaconAnimating = isBeaconAnimating.asInstanceOf[js.Any], isCollapsed = isCollapsed.asInstanceOf[js.Any], isMeasured = isMeasured.asInstanceOf[js.Any], isMeasuring = isMeasuring.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICoachmarkStyleProps]
    }
    
    @scala.inline
    implicit class ICoachmarkStylePropsMutableBuilder[Self <: ICoachmarkStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeaconColorOne(value: String): Self = StObject.set(x, "beaconColorOne", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeaconColorOneUndefined: Self = StObject.set(x, "beaconColorOne", js.undefined)
      
      @scala.inline
      def setBeaconColorTwo(value: String): Self = StObject.set(x, "beaconColorTwo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeaconColorTwoUndefined: Self = StObject.set(x, "beaconColorTwo", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDelayBeforeCoachmarkAnimation(value: String): Self = StObject.set(x, "delayBeforeCoachmarkAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayBeforeCoachmarkAnimationUndefined: Self = StObject.set(x, "delayBeforeCoachmarkAnimation", js.undefined)
      
      @scala.inline
      def setEntityHostHeight(value: String): Self = StObject.set(x, "entityHostHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityHostHeightUndefined: Self = StObject.set(x, "entityHostHeight", js.undefined)
      
      @scala.inline
      def setEntityHostWidth(value: String): Self = StObject.set(x, "entityHostWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityHostWidthUndefined: Self = StObject.set(x, "entityHostWidth", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsBeaconAnimating(value: Boolean): Self = StObject.set(x, "isBeaconAnimating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMeasured(value: Boolean): Self = StObject.set(x, "isMeasured", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMeasuring(value: Boolean): Self = StObject.set(x, "isMeasuring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ICoachmarkStyles extends StObject {
    
    /**
      * The styles applied to the ARIA attribute container
      */
    var ariaContainer: js.UndefOr[IStyle] = js.undefined
    
    /**
      * The layer that directly contains the TeachingBubbleContent
      */
    var childrenContainer: IStyle
    
    /**
      * The styles applied when the Coachmark has collapsed.
      */
    var collapsed: js.UndefOr[IStyle] = js.undefined
    
    /**
      * The layer that content/components/elements will be hosted in.
      */
    var entityHost: js.UndefOr[IStyle] = js.undefined
    
    /**
      * The inner layer that components will be hosted in
      * and primary purpose is scaling the layer down while the
      * Coachmark collapsed.
      */
    var entityInnerHost: IStyle
    
    /**
      * The pulsing beacon that animates when the Coachmark is collapsed.
      */
    var pulsingBeacon: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the root element in the default enabled/unchecked state.
      */
    var root: js.UndefOr[IStyle] = js.undefined
    
    /**
      * The layer the Rotate animation will be applied to.
      */
    var rotateAnimationLayer: js.UndefOr[IStyle] = js.undefined
    
    /**
      * The layer the Scale animation will be applied to.
      */
    var scaleAnimationLayer: js.UndefOr[IStyle] = js.undefined
    
    /**
      * The layer, or div, that the translate animation will be applied to.
      */
    var translateAnimationContainer: js.UndefOr[IStyle] = js.undefined
  }
  object ICoachmarkStyles {
    
    @scala.inline
    def apply(): ICoachmarkStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICoachmarkStyles]
    }
    
    @scala.inline
    implicit class ICoachmarkStylesMutableBuilder[Self <: ICoachmarkStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaContainer(value: IStyle): Self = StObject.set(x, "ariaContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaContainerNull: Self = StObject.set(x, "ariaContainer", null)
      
      @scala.inline
      def setAriaContainerUndefined: Self = StObject.set(x, "ariaContainer", js.undefined)
      
      @scala.inline
      def setChildrenContainer(value: IStyle): Self = StObject.set(x, "childrenContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenContainerNull: Self = StObject.set(x, "childrenContainer", null)
      
      @scala.inline
      def setChildrenContainerUndefined: Self = StObject.set(x, "childrenContainer", js.undefined)
      
      @scala.inline
      def setCollapsed(value: IStyle): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedNull: Self = StObject.set(x, "collapsed", null)
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setEntityHost(value: IStyle): Self = StObject.set(x, "entityHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityHostNull: Self = StObject.set(x, "entityHost", null)
      
      @scala.inline
      def setEntityHostUndefined: Self = StObject.set(x, "entityHost", js.undefined)
      
      @scala.inline
      def setEntityInnerHost(value: IStyle): Self = StObject.set(x, "entityInnerHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityInnerHostNull: Self = StObject.set(x, "entityInnerHost", null)
      
      @scala.inline
      def setEntityInnerHostUndefined: Self = StObject.set(x, "entityInnerHost", js.undefined)
      
      @scala.inline
      def setPulsingBeacon(value: IStyle): Self = StObject.set(x, "pulsingBeacon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPulsingBeaconNull: Self = StObject.set(x, "pulsingBeacon", null)
      
      @scala.inline
      def setPulsingBeaconUndefined: Self = StObject.set(x, "pulsingBeacon", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setRotateAnimationLayer(value: IStyle): Self = StObject.set(x, "rotateAnimationLayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateAnimationLayerNull: Self = StObject.set(x, "rotateAnimationLayer", null)
      
      @scala.inline
      def setRotateAnimationLayerUndefined: Self = StObject.set(x, "rotateAnimationLayer", js.undefined)
      
      @scala.inline
      def setScaleAnimationLayer(value: IStyle): Self = StObject.set(x, "scaleAnimationLayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleAnimationLayerNull: Self = StObject.set(x, "scaleAnimationLayer", null)
      
      @scala.inline
      def setScaleAnimationLayerUndefined: Self = StObject.set(x, "scaleAnimationLayer", js.undefined)
      
      @scala.inline
      def setTranslateAnimationContainer(value: IStyle): Self = StObject.set(x, "translateAnimationContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateAnimationContainerNull: Self = StObject.set(x, "translateAnimationContainer", null)
      
      @scala.inline
      def setTranslateAnimationContainerUndefined: Self = StObject.set(x, "translateAnimationContainer", js.undefined)
    }
  }
  
  type ICoachmarkTypes = ICoachmarkProps
}

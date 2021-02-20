package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialICoachmarkProps
import typings.officeUiFabricReact.coachmarkTypesMod.ICoachmark
import typings.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps
import typings.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coachmarkBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.base", "COACHMARK_ATTRIBUTE_NAME")
  @js.native
  val COACHMARK_ATTRIBUTE_NAME: /* "data-coachmarkid" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.base", "CoachmarkBase")
  @js.native
  class CoachmarkBase protected ()
    extends Component[ICoachmarkProps, ICoachmarkState, js.Any]
       with ICoachmark {
    def this(props: ICoachmarkProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MCoachmarkBase(newProps: ICoachmarkProps): Unit = js.native
    
    var _addListeners: js.Any = js.native
    
    var _addProximityHandler: js.Any = js.native
    
    var _ariaAlertContainer: js.Any = js.native
    
    var _async: js.Any = js.native
    
    val _beakDirection: js.Any = js.native
    
    var _childrenContainer: js.Any = js.native
    
    var _dismissOnLostFocus: js.Any = js.native
    
    /**
      * The cached HTMLElement reference to the Entity Inner Host
      * element.
      */
    var _entityHost: js.Any = js.native
    
    var _entityInnerHostElement: js.Any = js.native
    
    var _events: js.Any = js.native
    
    var _getBounds: js.Any = js.native
    
    var _isInsideElement: js.Any = js.native
    
    var _onFocusHandler: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _onPositioned: js.Any = js.native
    
    var _openCoachmark: js.Any = js.native
    
    var _positioningContainer: js.Any = js.native
    
    var _setBeakPosition: js.Any = js.native
    
    var _setTargetElementRect: js.Any = js.native
    
    /**
      * The target element the mouse would be in
      * proximity to
      */
    var _targetElementRect: js.Any = js.native
    
    var _translateAnimationContainer: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCoachmarkBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCoachmarkBase(prevProps: ICoachmarkProps, prevState: ICoachmarkState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCoachmarkBase(): Unit = js.native
    
    @JSName("dismiss")
    def dismiss_MCoachmarkBase(): Unit = js.native
    @JSName("dismiss")
    def dismiss_MCoachmarkBase(ev: KeyboardEvent[HTMLElement]): Unit = js.native
    @JSName("dismiss")
    def dismiss_MCoachmarkBase(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
    @JSName("dismiss")
    def dismiss_MCoachmarkBase(ev: Event): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MCoachmarkBase(newProps: ICoachmarkProps, newState: ICoachmarkState): Boolean = js.native
  }
  /* static members */
  object CoachmarkBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.base", "CoachmarkBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.base", "CoachmarkBase.defaultProps")
    @js.native
    def defaultProps: PartialICoachmarkProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialICoachmarkProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ICoachmarkState extends StObject {
    
    /**
      * ARIA alert text to read aloud with Narrator once the Coachmark is mounted
      */
    var alertText: js.UndefOr[String] = js.native
    
    /**
      * The bottom position of the beak
      */
    var beakBottom: js.UndefOr[String] = js.native
    
    /**
      * The left position of the beak
      */
    var beakLeft: js.UndefOr[String] = js.native
    
    /**
      * The right position of the beak
      */
    var beakRight: js.UndefOr[String] = js.native
    
    /**
      * The right position of the beak
      */
    var beakTop: js.UndefOr[String] = js.native
    
    /**
      * Cached width and height of _entityInnerHostElement
      */
    var entityInnerHostRect: IEntityRect = js.native
    
    /**
      * Enables/Disables the beacon that radiates
      * from the center of the coachmark.
      */
    var isBeaconAnimating: Boolean = js.native
    
    /**
      * Is the Coachmark currently collapsed into
      * a tear drop shape
      */
    var isCollapsed: Boolean = js.native
    
    /**
      * Is the Coachmark done measuring the hosted entity
      */
    var isMeasured: Boolean = js.native
    
    /**
      * Is the teaching bubble currently retreiving the
      * original dimensions of the hosted entity.
      */
    var isMeasuring: Boolean = js.native
    
    /**
      * Is the mouse in proximity of the default target element
      */
    var isMouseInProximity: Boolean = js.native
    
    /**
      * Alignment edge of callout in relation to target
      */
    var targetAlignment: js.UndefOr[RectangleEdge] = js.native
    
    /**
      * Position of Coachmark/TeachingBubble in relation to target
      */
    var targetPosition: js.UndefOr[RectangleEdge] = js.native
    
    /**
      * Transform origin of teaching bubble callout
      */
    var transformOrigin: js.UndefOr[String] = js.native
  }
  object ICoachmarkState {
    
    @scala.inline
    def apply(
      entityInnerHostRect: IEntityRect,
      isBeaconAnimating: Boolean,
      isCollapsed: Boolean,
      isMeasured: Boolean,
      isMeasuring: Boolean,
      isMouseInProximity: Boolean
    ): ICoachmarkState = {
      val __obj = js.Dynamic.literal(entityInnerHostRect = entityInnerHostRect.asInstanceOf[js.Any], isBeaconAnimating = isBeaconAnimating.asInstanceOf[js.Any], isCollapsed = isCollapsed.asInstanceOf[js.Any], isMeasured = isMeasured.asInstanceOf[js.Any], isMeasuring = isMeasuring.asInstanceOf[js.Any], isMouseInProximity = isMouseInProximity.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICoachmarkState]
    }
    
    @scala.inline
    implicit class ICoachmarkStateMutableBuilder[Self <: ICoachmarkState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlertText(value: String): Self = StObject.set(x, "alertText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlertTextUndefined: Self = StObject.set(x, "alertText", js.undefined)
      
      @scala.inline
      def setBeakBottom(value: String): Self = StObject.set(x, "beakBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakBottomUndefined: Self = StObject.set(x, "beakBottom", js.undefined)
      
      @scala.inline
      def setBeakLeft(value: String): Self = StObject.set(x, "beakLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakLeftUndefined: Self = StObject.set(x, "beakLeft", js.undefined)
      
      @scala.inline
      def setBeakRight(value: String): Self = StObject.set(x, "beakRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakRightUndefined: Self = StObject.set(x, "beakRight", js.undefined)
      
      @scala.inline
      def setBeakTop(value: String): Self = StObject.set(x, "beakTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakTopUndefined: Self = StObject.set(x, "beakTop", js.undefined)
      
      @scala.inline
      def setEntityInnerHostRect(value: IEntityRect): Self = StObject.set(x, "entityInnerHostRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBeaconAnimating(value: Boolean): Self = StObject.set(x, "isBeaconAnimating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMeasured(value: Boolean): Self = StObject.set(x, "isMeasured", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMeasuring(value: Boolean): Self = StObject.set(x, "isMeasuring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMouseInProximity(value: Boolean): Self = StObject.set(x, "isMouseInProximity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetAlignment(value: RectangleEdge): Self = StObject.set(x, "targetAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetAlignmentUndefined: Self = StObject.set(x, "targetAlignment", js.undefined)
      
      @scala.inline
      def setTargetPosition(value: RectangleEdge): Self = StObject.set(x, "targetPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPositionUndefined: Self = StObject.set(x, "targetPosition", js.undefined)
      
      @scala.inline
      def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
    }
  }
  
  @js.native
  trait IEntityRect extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object IEntityRect {
    
    @scala.inline
    def apply(height: Double, width: Double): IEntityRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEntityRect]
    }
    
    @scala.inline
    implicit class IEntityRectMutableBuilder[Self <: IEntityRect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

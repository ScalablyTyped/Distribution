package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialICoachmarkProps
import typings.officeUiFabricReact.libComponentsCoachmarkCoachmarkDottypesMod.ICoachmark
import typings.officeUiFabricReact.libComponentsCoachmarkCoachmarkDottypesMod.ICoachmarkProps
import typings.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.RectangleEdge
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCoachmarkCoachmarkDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.base", "COACHMARK_ATTRIBUTE_NAME")
  @js.native
  val COACHMARK_ATTRIBUTE_NAME: /* "data-coachmarkid" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.base", "CoachmarkBase")
  @js.native
  open class CoachmarkBase protected ()
    extends Component[ICoachmarkProps, ICoachmarkState, Any]
       with ICoachmark {
    def this(props: ICoachmarkProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MCoachmarkBase(newProps: ICoachmarkProps): Unit = js.native
    
    /* private */ var _addListeners: Any = js.native
    
    /* private */ var _addProximityHandler: Any = js.native
    
    /* private */ var _ariaAlertContainer: Any = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ val _beakDirection: Any = js.native
    
    /* private */ var _childrenContainer: Any = js.native
    
    /* private */ var _dismissOnLostFocus: Any = js.native
    
    /**
      * The cached HTMLElement reference to the Entity Inner Host
      * element.
      */
    /* private */ var _entityHost: Any = js.native
    
    /* private */ var _entityInnerHostElement: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /* private */ var _getBounds: Any = js.native
    
    /* private */ var _isInsideElement: Any = js.native
    
    /* private */ var _onFocusHandler: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _onPositioned: Any = js.native
    
    /* private */ var _openCoachmark: Any = js.native
    
    /* private */ var _positioningContainer: Any = js.native
    
    /* private */ var _setBeakPosition: Any = js.native
    
    /* private */ var _setTargetElementRect: Any = js.native
    
    /**
      * The target element the mouse would be in
      * proximity to
      */
    /* private */ var _targetElementRect: Any = js.native
    
    /* private */ var _translateAnimationContainer: Any = js.native
    
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
    inline def defaultProps_=(x: PartialICoachmarkProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ICoachmarkState extends StObject {
    
    /**
      * ARIA alert text to read aloud with Narrator once the Coachmark is mounted
      */
    var alertText: js.UndefOr[String] = js.undefined
    
    /**
      * The bottom position of the beak
      */
    var beakBottom: js.UndefOr[String] = js.undefined
    
    /**
      * The left position of the beak
      */
    var beakLeft: js.UndefOr[String] = js.undefined
    
    /**
      * The right position of the beak
      */
    var beakRight: js.UndefOr[String] = js.undefined
    
    /**
      * The right position of the beak
      */
    var beakTop: js.UndefOr[String] = js.undefined
    
    /**
      * Cached width and height of _entityInnerHostElement
      */
    var entityInnerHostRect: IEntityRect
    
    /**
      * Enables/Disables the beacon that radiates
      * from the center of the coachmark.
      */
    var isBeaconAnimating: Boolean
    
    /**
      * Is the Coachmark currently collapsed into
      * a tear drop shape
      */
    var isCollapsed: Boolean
    
    /**
      * Is the Coachmark done measuring the hosted entity
      */
    var isMeasured: Boolean
    
    /**
      * Is the teaching bubble currently retreiving the
      * original dimensions of the hosted entity.
      */
    var isMeasuring: Boolean
    
    /**
      * Is the mouse in proximity of the default target element
      */
    var isMouseInProximity: Boolean
    
    /**
      * Alignment edge of callout in relation to target
      */
    var targetAlignment: js.UndefOr[RectangleEdge] = js.undefined
    
    /**
      * Position of Coachmark/TeachingBubble in relation to target
      */
    var targetPosition: js.UndefOr[RectangleEdge] = js.undefined
    
    /**
      * Transform origin of teaching bubble callout
      */
    var transformOrigin: js.UndefOr[String] = js.undefined
  }
  object ICoachmarkState {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: ICoachmarkState] (val x: Self) extends AnyVal {
      
      inline def setAlertText(value: String): Self = StObject.set(x, "alertText", value.asInstanceOf[js.Any])
      
      inline def setAlertTextUndefined: Self = StObject.set(x, "alertText", js.undefined)
      
      inline def setBeakBottom(value: String): Self = StObject.set(x, "beakBottom", value.asInstanceOf[js.Any])
      
      inline def setBeakBottomUndefined: Self = StObject.set(x, "beakBottom", js.undefined)
      
      inline def setBeakLeft(value: String): Self = StObject.set(x, "beakLeft", value.asInstanceOf[js.Any])
      
      inline def setBeakLeftUndefined: Self = StObject.set(x, "beakLeft", js.undefined)
      
      inline def setBeakRight(value: String): Self = StObject.set(x, "beakRight", value.asInstanceOf[js.Any])
      
      inline def setBeakRightUndefined: Self = StObject.set(x, "beakRight", js.undefined)
      
      inline def setBeakTop(value: String): Self = StObject.set(x, "beakTop", value.asInstanceOf[js.Any])
      
      inline def setBeakTopUndefined: Self = StObject.set(x, "beakTop", js.undefined)
      
      inline def setEntityInnerHostRect(value: IEntityRect): Self = StObject.set(x, "entityInnerHostRect", value.asInstanceOf[js.Any])
      
      inline def setIsBeaconAnimating(value: Boolean): Self = StObject.set(x, "isBeaconAnimating", value.asInstanceOf[js.Any])
      
      inline def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIsMeasured(value: Boolean): Self = StObject.set(x, "isMeasured", value.asInstanceOf[js.Any])
      
      inline def setIsMeasuring(value: Boolean): Self = StObject.set(x, "isMeasuring", value.asInstanceOf[js.Any])
      
      inline def setIsMouseInProximity(value: Boolean): Self = StObject.set(x, "isMouseInProximity", value.asInstanceOf[js.Any])
      
      inline def setTargetAlignment(value: RectangleEdge): Self = StObject.set(x, "targetAlignment", value.asInstanceOf[js.Any])
      
      inline def setTargetAlignmentUndefined: Self = StObject.set(x, "targetAlignment", js.undefined)
      
      inline def setTargetPosition(value: RectangleEdge): Self = StObject.set(x, "targetPosition", value.asInstanceOf[js.Any])
      
      inline def setTargetPositionUndefined: Self = StObject.set(x, "targetPosition", js.undefined)
      
      inline def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
    }
  }
  
  trait IEntityRect extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object IEntityRect {
    
    inline def apply(height: Double, width: Double): IEntityRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEntityRect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEntityRect] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

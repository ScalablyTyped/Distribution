package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsCoachmarkPositioningContainerPositioningContainerDottypesMod.IPositioningContainerProps
import typings.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.IPositionedData
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCoachmarkPositioningContainerPositioningContainerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/PositioningContainer/PositioningContainer", "PositioningContainer")
  @js.native
  open class PositioningContainer protected () extends Component[IPositioningContainerProps, IPositioningContainerState, Any] {
    def this(props: IPositioningContainerProps) = this()
    
    @JSName("UNSAFE_componentWillMount")
    def UNSAFE_componentWillMount_MPositioningContainer(): Unit = js.native
    
    @JSName("UNSAFE_componentWillUpdate")
    def UNSAFE_componentWillUpdate_MPositioningContainer(newProps: IPositioningContainerProps): Unit = js.native
    
    /* private */ var _arePositionsEqual: Any = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _comparePositions: Any = js.native
    
    /* private */ var _contentHost: Any = js.native
    
    /* private */ var _didSetInitialFocus: Any = js.native
    
    /* protected */ def _dismissOnLostFocus(ev: Event): Unit = js.native
    
    /* protected */ def _dismissOnScroll(ev: Event): Unit = js.native
    
    /* private */ var _events: Any = js.native
    
    /* private */ var _getBounds: Any = js.native
    
    /**
      * Return the maximum height the container can grow to
      * without going out of the specified bounds
      */
    /* private */ var _getMaxHeight: Any = js.native
    
    /* private */ var _getTarget: Any = js.native
    
    /**
      * The maximum height the PositioningContainer can grow to
      * without going being the window or target bounds
      */
    /* private */ var _maxHeight: Any = js.native
    
    /* protected */ def _onComponentDidMount(): Unit = js.native
    
    /* private */ var _positionAttempts: Any = js.native
    
    /**
      * The primary positioned div.
      */
    /* private */ var _positionedHost: Any = js.native
    
    /**
      * The bounds used when determing if and where the
      * PositioningContainer should be placed.
      */
    /* private */ var _positioningBounds: Any = js.native
    
    /**
      * Animates the height if finalHeight was given.
      */
    /* private */ var _setHeightOffsetEveryFrame: Any = js.native
    
    /* private */ var _setHeightOffsetTimer: Any = js.native
    
    /* protected */ def _setInitialFocus(): Unit = js.native
    
    /* private */ var _setTargetWindowAndElement: Any = js.native
    
    /* private */ var _target: Any = js.native
    
    /**
      * Stores an instance of Window, used to check
      * for server side rendering and if focus was lost.
      */
    /* private */ var _targetWindow: Any = js.native
    
    /* private */ var _updateAsyncPosition: Any = js.native
    
    /* private */ var _updatePosition: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPositioningContainer(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPositioningContainer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPositioningContainer(): Unit = js.native
    
    /**
      * Deprecated, use `onResize` instead.
      * @deprecated Use `onResize` instead.
      */
    def dismiss(): Unit = js.native
    def dismiss(ev: KeyboardEvent[HTMLElement]): Unit = js.native
    def dismiss(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
    def dismiss(ev: Event): Unit = js.native
    
    def onResize(): Unit = js.native
    def onResize(ev: KeyboardEvent[HTMLElement]): Unit = js.native
    def onResize(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
    def onResize(ev: Event): Unit = js.native
  }
  /* static members */
  object PositioningContainer {
    
    @JSImport("office-ui-fabric-react/lib/components/Coachmark/PositioningContainer/PositioningContainer", "PositioningContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Coachmark/PositioningContainer/PositioningContainer", "PositioningContainer.defaultProps")
    @js.native
    def defaultProps: IPositioningContainerProps = js.native
    inline def defaultProps_=(x: IPositioningContainerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IPositioningContainerState extends StObject {
    
    /**
      * Tracks the current height offset and updates during
      * the height animation when props.finalHeight is specified.
      */
    var heightOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Current set of calcualted positions for the outermost parent container.
      */
    var positions: js.UndefOr[IPositionedData] = js.undefined
  }
  object IPositioningContainerState {
    
    inline def apply(): IPositioningContainerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPositioningContainerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPositioningContainerState] (val x: Self) extends AnyVal {
      
      inline def setHeightOffset(value: Double): Self = StObject.set(x, "heightOffset", value.asInstanceOf[js.Any])
      
      inline def setHeightOffsetUndefined: Self = StObject.set(x, "heightOffset", js.undefined)
      
      inline def setPositions(value: IPositionedData): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    }
  }
}

package typings.officeUiFabricReact

import typings.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps
import typings.officeUiFabricReact.positioningTypesMod.IPositionedData
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positioningContainerPositioningContainerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/PositioningContainer/PositioningContainer", "PositioningContainer")
  @js.native
  class PositioningContainer protected ()
    extends Component[IPositioningContainerProps, IPositioningContainerState, js.Any] {
    def this(props: IPositioningContainerProps) = this()
    
    @JSName("UNSAFE_componentWillMount")
    def UNSAFE_componentWillMount_MPositioningContainer(): Unit = js.native
    
    @JSName("UNSAFE_componentWillUpdate")
    def UNSAFE_componentWillUpdate_MPositioningContainer(newProps: IPositioningContainerProps): Unit = js.native
    
    var _arePositionsEqual: js.Any = js.native
    
    var _async: js.Any = js.native
    
    var _comparePositions: js.Any = js.native
    
    var _contentHost: js.Any = js.native
    
    var _didSetInitialFocus: js.Any = js.native
    
    /* protected */ def _dismissOnLostFocus(ev: Event): Unit = js.native
    
    /* protected */ def _dismissOnScroll(ev: Event): Unit = js.native
    
    var _events: js.Any = js.native
    
    var _getBounds: js.Any = js.native
    
    /**
      * Return the maximum height the container can grow to
      * without going out of the specified bounds
      */
    var _getMaxHeight: js.Any = js.native
    
    var _getTarget: js.Any = js.native
    
    /**
      * The maximum height the PositioningContainer can grow to
      * without going being the window or target bounds
      */
    var _maxHeight: js.Any = js.native
    
    /* protected */ def _onComponentDidMount(): Unit = js.native
    
    var _positionAttempts: js.Any = js.native
    
    /**
      * The primary positioned div.
      */
    var _positionedHost: js.Any = js.native
    
    /**
      * The bounds used when determing if and where the
      * PositioningContainer should be placed.
      */
    var _positioningBounds: js.Any = js.native
    
    /**
      * Animates the height if finalHeight was given.
      */
    var _setHeightOffsetEveryFrame: js.Any = js.native
    
    var _setHeightOffsetTimer: js.Any = js.native
    
    /* protected */ def _setInitialFocus(): Unit = js.native
    
    var _setTargetWindowAndElement: js.Any = js.native
    
    var _target: js.Any = js.native
    
    /**
      * Stores an instance of Window, used to check
      * for server side rendering and if focus was lost.
      */
    var _targetWindow: js.Any = js.native
    
    var _updateAsyncPosition: js.Any = js.native
    
    var _updatePosition: js.Any = js.native
    
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
    @scala.inline
    def defaultProps_=(x: IPositioningContainerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IPositioningContainerState extends StObject {
    
    /**
      * Tracks the current height offset and updates during
      * the height animation when props.finalHeight is specified.
      */
    var heightOffset: js.UndefOr[Double] = js.native
    
    /**
      * Current set of calcualted positions for the outermost parent container.
      */
    var positions: js.UndefOr[IPositionedData] = js.native
  }
  object IPositioningContainerState {
    
    @scala.inline
    def apply(): IPositioningContainerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPositioningContainerState]
    }
    
    @scala.inline
    implicit class IPositioningContainerStateMutableBuilder[Self <: IPositioningContainerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeightOffset(value: Double): Self = StObject.set(x, "heightOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightOffsetUndefined: Self = StObject.set(x, "heightOffset", js.undefined)
      
      @scala.inline
      def setPositions(value: IPositionedData): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    }
  }
}

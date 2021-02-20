package typings.officeUiFabricReact

import typings.officeUiFabricReact.draggableZoneTypesMod.ICoordinates
import typings.officeUiFabricReact.draggableZoneTypesMod.IDraggableZoneProps
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draggableZoneDraggableZoneMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/DraggableZone/DraggableZone", "DraggableZone")
  @js.native
  class DraggableZone protected ()
    extends Component[IDraggableZoneProps, IDraggableZoneState, js.Any] {
    def this(props: IDraggableZoneProps) = this()
    
    /**
      * Create DragData based off of the last known position and the new position passed in
      * @param position The new position as part of the drag
      */
    var _createDragDataFromPosition: js.Any = js.native
    
    /**
      * Creates an updated DragData based off the current position and given baseDragData
      * @param baseDragData The base DragData (from _createDragDataFromPosition) used to calculate the updated positions
      */
    var _createUpdatedDragData: js.Any = js.native
    
    var _currentEventType: js.Any = js.native
    
    var _events: js.Any = js.native
    
    /**
      * Attempts to find the Touch that matches the identifier  we stored in dragStart
      * @param touchList The TouchList to look for the stored identifier from dragStart
      */
    var _findTouchInTouchList: js.Any = js.native
    
    /**
      * Get the active touch point that we have saved from the event's TouchList
      * @param event - The event used to get the TouchList for the active touch point
      */
    var _getActiveTouch: js.Any = js.native
    
    /**
      * Get the control position based off the event that fired
      * @param event - The event to get offsets from
      */
    var _getControlPosition: js.Any = js.native
    
    /**
      * Get the initial touch identifier associated with the given event
      * @param event - The event that contains the TouchList
      */
    var _getTouchId: js.Any = js.native
    
    /**
      * Returns if an element (or any of the element's parents) match the given selector
      */
    var _matchesSelector: js.Any = js.native
    
    var _onDrag: js.Any = js.native
    
    var _onDragStart: js.Any = js.native
    
    var _onDragStop: js.Any = js.native
    
    var _onMouseDown: js.Any = js.native
    
    var _onMouseUp: js.Any = js.native
    
    var _onTouchEnd: js.Any = js.native
    
    var _onTouchStart: js.Any = js.native
    
    var _touchId: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDraggableZone(prevProps: IDraggableZoneProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDraggableZone(): Unit = js.native
  }
  
  @js.native
  trait IDraggableZoneState extends StObject {
    
    var isDragging: Boolean = js.native
    
    var lastPosition: js.UndefOr[ICoordinates] = js.native
    
    var position: ICoordinates = js.native
  }
  object IDraggableZoneState {
    
    @scala.inline
    def apply(isDragging: Boolean, position: ICoordinates): IDraggableZoneState = {
      val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDraggableZoneState]
    }
    
    @scala.inline
    implicit class IDraggableZoneStateMutableBuilder[Self <: IDraggableZoneState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPosition(value: ICoordinates): Self = StObject.set(x, "lastPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPositionUndefined: Self = StObject.set(x, "lastPosition", js.undefined)
      
      @scala.inline
      def setPosition(value: ICoordinates): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  type MouseTouchEvent[T] = (MouseEvent[T, NativeMouseEvent]) with TouchEvent[T] with Event
}

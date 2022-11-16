package typings.officeUiFabricReact

import typings.officeUiFabricReact.libUtilitiesDraggableZoneDraggableZoneDottypesMod.ICoordinates
import typings.officeUiFabricReact.libUtilitiesDraggableZoneDraggableZoneDottypesMod.IDraggableZoneProps
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchList
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesDraggableZoneDraggableZoneMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/DraggableZone/DraggableZone", "DraggableZone")
  @js.native
  open class DraggableZone protected () extends Component[IDraggableZoneProps, IDraggableZoneState, Any] {
    def this(props: IDraggableZoneProps) = this()
    
    /**
      * Create DragData based off of the last known position and the new position passed in
      * @param position The new position as part of the drag
      */
    /* private */ var _createDragDataFromPosition: Any = js.native
    
    /**
      * Creates an updated DragData based off the current position and given baseDragData
      * @param baseDragData The base DragData (from _createDragDataFromPosition) used to calculate the updated positions
      */
    /* private */ var _createUpdatedDragData: Any = js.native
    
    /* private */ var _currentEventType: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /**
      * Attempts to find the Touch that matches the identifier  we stored in dragStart
      * @param touchList The TouchList to look for the stored identifier from dragStart
      */
    /* private */ var _findTouchInTouchList: Any = js.native
    
    /**
      * Get the active touch point that we have saved from the event's TouchList
      * @param event - The event used to get the TouchList for the active touch point
      */
    /* private */ var _getActiveTouch: Any = js.native
    
    /**
      * Get the control position based off the event that fired
      * @param event - The event to get offsets from
      */
    /* private */ var _getControlPosition: Any = js.native
    
    /**
      * Get the initial touch identifier associated with the given event
      * @param event - The event that contains the TouchList
      */
    /* private */ var _getTouchId: Any = js.native
    
    /**
      * Returns if an element (or any of the element's parents) match the given selector
      */
    /* private */ var _matchesSelector: Any = js.native
    
    /* private */ var _onDrag: Any = js.native
    
    /* private */ var _onDragStart: Any = js.native
    
    /* private */ var _onDragStop: Any = js.native
    
    /* private */ var _onMouseDown: Any = js.native
    
    /* private */ var _onMouseUp: Any = js.native
    
    /* private */ var _onTouchEnd: Any = js.native
    
    /* private */ var _onTouchStart: Any = js.native
    
    /* private */ var _touchId: Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDraggableZone(prevProps: IDraggableZoneProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDraggableZone(): Unit = js.native
  }
  
  trait IDraggableZoneState extends StObject {
    
    var isDragging: Boolean
    
    var lastPosition: js.UndefOr[ICoordinates] = js.undefined
    
    var position: ICoordinates
  }
  object IDraggableZoneState {
    
    inline def apply(isDragging: Boolean, position: ICoordinates): IDraggableZoneState = {
      val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDraggableZoneState]
    }
    
    extension [Self <: IDraggableZoneState](x: Self) {
      
      inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      inline def setLastPosition(value: ICoordinates): Self = StObject.set(x, "lastPosition", value.asInstanceOf[js.Any])
      
      inline def setLastPositionUndefined: Self = StObject.set(x, "lastPosition", js.undefined)
      
      inline def setPosition(value: ICoordinates): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.BaseSyntheticEvent because Already inherited
  - typings.react.mod.UIEvent because Already inherited
  - typings.std.Event because var conflicts: bubbles, cancelable, currentTarget, defaultPrevented, eventPhase, isTrusted, target, timeStamp, `type`. Inlined BUBBLING_PHASE, NONE, cancelBubble, composed, returnValue, AT_TARGET, CAPTURING_PHASE, srcElement, composedPath, initEvent, initEvent, initEvent, initEvent, stopImmediatePropagation
  - typings.react.mod.TouchEvent because var conflicts: altKey, bubbles, cancelable, ctrlKey, currentTarget, defaultPrevented, detail, eventPhase, isTrusted, metaKey, nativeEvent, shiftKey, target, timeStamp, `type`, view. Inlined touches, changedTouches, targetTouches */ @js.native
  trait MouseTouchEvent[T]
    extends StObject
       with MouseEvent[T, NativeMouseEvent] {
    
    /* standard dom */
    val AT_TARGET: Double = js.native
    
    /* standard dom */
    val BUBBLING_PHASE: Double = js.native
    
    /* standard dom */
    val CAPTURING_PHASE: Double = js.native
    
    /* standard dom */
    val NONE: Double = js.native
    
    /** @deprecated */
    /* standard dom */
    var cancelBubble: Boolean = js.native
    
    var changedTouches: TouchList = js.native
    
    /** Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise. */
    /* standard dom */
    val composed: Boolean = js.native
    
    /** Returns the invocation target objects of event's path (objects on which listeners will be invoked), except for any nodes in shadow trees of which the shadow root's mode is "closed" that are not reachable from event's currentTarget. */
    /* standard dom */
    def composedPath(): js.Array[EventTarget] = js.native
    
    /** @deprecated */
    /* standard dom */
    def initEvent(`type`: String): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Unit, cancelable: Boolean): Unit = js.native
    
    /** @deprecated */
    /* standard dom */
    var returnValue: Boolean = js.native
    
    /** @deprecated */
    /* standard dom */
    val srcElement: EventTarget | Null = js.native
    
    /** Invoking this method prevents event from reaching any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any other objects. */
    /* standard dom */
    def stopImmediatePropagation(): Unit = js.native
    
    var targetTouches: TouchList = js.native
    
    var touches: TouchList = js.native
  }
}

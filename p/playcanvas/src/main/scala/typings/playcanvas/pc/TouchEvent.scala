package typings.playcanvas.pc

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new TouchEvent from an existing browser event.
  * @property element - The target Element that the event was fired from.
  * @property touches - A list of all touches currently in contact with the device.
  * @property changedTouches - A list of touches that have changed since the last event.
  * @property event - The original browser TouchEvent.
  * @param device - The source device of the touch events.
  * @param event - The original browser TouchEvent.
  */
trait TouchEvent extends StObject {
  
  /**
    * A list of touches that have changed since the last event.
    */
  var changedTouches: js.Array[Touch]
  
  /**
    * The target Element that the event was fired from.
    */
  var element: Element
  
  /**
    * The original browser TouchEvent.
    */
  var event: TouchEvent
  
  /**
    * Get an event from one of the touch lists by the id. It is useful to access
    * touches by their id so that you can be sure you are referencing the same touch.
    * @param id - The identifier of the touch.
    * @param list - An array of touches to search.
    * @returns The {@link pc.Touch} object or null.
    */
  def getTouchById(id: Double, list: js.Array[Touch]): Touch
  
  /**
    * A list of all touches currently in contact with the device.
    */
  var touches: js.Array[Touch]
}
object TouchEvent {
  
  inline def apply(
    changedTouches: js.Array[Touch],
    element: Element,
    event: TouchEvent,
    getTouchById: (Double, js.Array[Touch]) => Touch,
    touches: js.Array[Touch]
  ): TouchEvent = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], getTouchById = js.Any.fromFunction2(getTouchById), touches = touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchEvent]
  }
  
  extension [Self <: TouchEvent](x: Self) {
    
    inline def setChangedTouches(value: js.Array[Touch]): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
    
    inline def setChangedTouchesVarargs(value: Touch*): Self = StObject.set(x, "changedTouches", js.Array(value :_*))
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: TouchEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setGetTouchById(value: (Double, js.Array[Touch]) => Touch): Self = StObject.set(x, "getTouchById", js.Any.fromFunction2(value))
    
    inline def setTouches(value: js.Array[Touch]): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
    
    inline def setTouchesVarargs(value: Touch*): Self = StObject.set(x, "touches", js.Array(value :_*))
  }
}

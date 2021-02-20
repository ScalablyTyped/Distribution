package typings.paper.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * ToolEvent The ToolEvent object is received by the {@link Tool}'s mouse
  * event handlers {@link Tool#onMouseDown}, {@link Tool#onMouseDrag},
  * {@link Tool#onMouseMove} and {@link Tool#onMouseUp}. The ToolEvent
  * object is the only parameter passed to these functions and contains
  * information about the mouse event.
  */
@js.native
trait ToolEvent extends Event {
  
  /** 
    * The number of times the mouse event was fired.
    */
  var count: Double = js.native
  
  /** 
    * The difference between the current position and the last position of the
    * mouse when the event was fired. In case of the mouseup event, the
    * difference to the mousedown position is returned.
    */
  var delta: Point = js.native
  
  /** 
    * The position of the mouse in project coordinates when the mouse button
    * was last clicked.
    */
  var downPoint: Point = js.native
  
  /** 
    * The item at the position of the mouse (if any).
    * 
    * If the item is contained within one or more {@link Group} or
    * {@link CompoundPath} items, the most top level group or compound path
    * that it is contained within is returned.
    */
  var item: Item = js.native
  
  /** 
    * The position of the mouse in project coordinates when the previous
    * event was fired.
    */
  var lastPoint: Point = js.native
  
  /** 
    * The point in the middle between {@link #lastPoint} and
    * {@link #point}. This is a useful position to use when creating
    * artwork based on the moving direction of the mouse, as returned by
    * {@link #delta}.
    */
  var middlePoint: Point = js.native
  
  /** 
    * The position of the mouse in project coordinates when the event was
    * fired.
    */
  var point: Point = js.native
  
  /** 
    * The type of tool event.
    */
  var `type`: String = js.native
}
object ToolEvent {
  
  @scala.inline
  def apply(
    count: Double,
    delta: Point,
    downPoint: Point,
    item: Item,
    lastPoint: Point,
    middlePoint: Point,
    modifiers: js.Any,
    point: Point,
    preventDefault: () => Unit,
    stop: () => Unit,
    stopPropagation: () => Unit,
    timeStamp: Double,
    `type`: String
  ): ToolEvent = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], downPoint = downPoint.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], lastPoint = lastPoint.asInstanceOf[js.Any], middlePoint = middlePoint.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stop = js.Any.fromFunction0(stop), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolEvent]
  }
  
  @scala.inline
  implicit class ToolEventMutableBuilder[Self <: ToolEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelta(value: Point): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownPoint(value: Point): Self = StObject.set(x, "downPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPoint(value: Point): Self = StObject.set(x, "lastPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddlePoint(value: Point): Self = StObject.set(x, "middlePoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

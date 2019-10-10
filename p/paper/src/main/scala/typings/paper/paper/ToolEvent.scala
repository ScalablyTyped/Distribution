package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * ToolEvent The ToolEvent object is received by the {@link Tool}'s mouse
  * event handlers {@link Tool#onMouseDown}, {@link Tool#onMouseDrag},
  * {@link Tool#onMouseMove} and {@link Tool#onMouseUp}. The ToolEvent
  * object is the only parameter passed to these functions and contains
  * information about the mouse event.
  */
@JSGlobal("paper.ToolEvent")
@js.native
class ToolEvent () extends Event {
  /** 
    * The number of times the mouse event was fired.
    */
  var count: Double | Null = js.native
  /** 
    * The difference between the current position and the last position of the
    * mouse when the event was fired. In case of the mouseup event, the
    * difference to the mousedown position is returned.
    */
  var delta: Point | Null = js.native
  /** 
    * The position of the mouse in project coordinates when the mouse button
    * was last clicked.
    */
  var downPoint: Point | Null = js.native
  /** 
    * The item at the position of the mouse (if any).
    * 
    * If the item is contained within one or more {@link Group} or
    * {@link CompoundPath} items, the most top level group or compound path
    * that it is contained within is returned.
    */
  var item: Item | Null = js.native
  /** 
    * The position of the mouse in project coordinates when the previous
    * event was fired.
    */
  var lastPoint: Point | Null = js.native
  /** 
    * The point in the middle between {@link #lastPoint} and
    * {@link #point}. This is a useful position to use when creating
    * artwork based on the moving direction of the mouse, as returned by
    * {@link #delta}.
    */
  var middlePoint: Point | Null = js.native
  /** 
    * The position of the mouse in project coordinates when the event was
    * fired.
    */
  var point: Point | Null = js.native
  /** 
    * The type of tool event.
    */
  var `type`: String | Null = js.native
}


package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The MouseEvent object is received by the {@link Item}'s mouse event
  * handlers {@link Item#onMouseDown}, {@link Item#onMouseDrag},
  * {@link Item#onMouseMove}, {@link Item#onMouseUp}, {@link Item#onClick},
  * {@link Item#onDoubleClick}, {@link Item#onMouseEnter} and
  * {@link Item#onMouseLeave}. The MouseEvent object is the only parameter passed
  * to these functions and contains information about the mouse event.
  */
@JSGlobal("paper.MouseEvent")
@js.native
class MouseEvent () extends Event {
  /** 
    * The current target for the event, as the event traverses the scene graph.
    * It always refers to the element the event handler has been attached to as
    * opposed to {@link #target} which identifies the element on
    * which the event occurred.
    */
  var currentTarget: Item | Null = js.native
  var delta: Point | Null = js.native
  /** 
    * The position of the mouse in project coordinates when the event was
    * fired.
    */
  var point: Point | Null = js.native
  /** 
    * The item that dispatched the event. It is different from
    * {@link #currentTarget} when the event handler is called during
    * the bubbling phase of the event.
    */
  var target: Item | Null = js.native
  /** 
    * The type of mouse event.
    */
  var `type`: String | Null = js.native
}


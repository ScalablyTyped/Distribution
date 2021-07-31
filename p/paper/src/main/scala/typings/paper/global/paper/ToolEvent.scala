package typings.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * ToolEvent The ToolEvent object is received by the {@link Tool}'s mouse
  * event handlers {@link Tool#onMouseDown}, {@link Tool#onMouseDrag},
  * {@link Tool#onMouseMove} and {@link Tool#onMouseUp}. The ToolEvent
  * object is the only parameter passed to these functions and contains
  * information about the mouse event.
  */
@JSGlobal("paper.ToolEvent")
@js.native
class ToolEvent ()
  extends StObject
     with typings.paper.paper.ToolEvent {
  
  /** 
    * The number of times the mouse event was fired.
    */
  /* CompleteClass */
  var count: Double = js.native
  
  /** 
    * The difference between the current position and the last position of the
    * mouse when the event was fired. In case of the mouseup event, the
    * difference to the mousedown position is returned.
    */
  /* CompleteClass */
  var delta: typings.paper.paper.Point = js.native
  
  /** 
    * The position of the mouse in project coordinates when the mouse button
    * was last clicked.
    */
  /* CompleteClass */
  var downPoint: typings.paper.paper.Point = js.native
  
  /** 
    * The item at the position of the mouse (if any).
    * 
    * If the item is contained within one or more {@link Group} or
    * {@link CompoundPath} items, the most top level group or compound path
    * that it is contained within is returned.
    */
  /* CompleteClass */
  var item: typings.paper.paper.Item = js.native
  
  /** 
    * The position of the mouse in project coordinates when the previous
    * event was fired.
    */
  /* CompleteClass */
  var lastPoint: typings.paper.paper.Point = js.native
  
  /** 
    * The point in the middle between {@link #lastPoint} and
    * {@link #point}. This is a useful position to use when creating
    * artwork based on the moving direction of the mouse, as returned by
    * {@link #delta}.
    */
  /* CompleteClass */
  var middlePoint: typings.paper.paper.Point = js.native
  
  /** 
    * The current state of the keyboard modifiers.
    * 
    * @see Key.modifiers
    */
  /* CompleteClass */
  override val modifiers: js.Any = js.native
  
  /** 
    * The position of the mouse in project coordinates when the event was
    * fired.
    */
  /* CompleteClass */
  var point: typings.paper.paper.Point = js.native
  
  /** 
    * Cancels the event if it is cancelable, without stopping further
    * propagation of the event.
    */
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  
  /** 
    * Cancels the event if it is cancelable, and stops stopping further
    * propagation of the event. This is has the same effect as calling both
    * {@link #stopPropagation} and {@link #preventDefault}.
    * 
    * Any handler can also return `false` to indicate that `stop()` should be
    * called right after.
    */
  /* CompleteClass */
  override def stop(): Unit = js.native
  
  /** 
    * Prevents further propagation of the current event.
    */
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
  
  /** 
    * The time at which the event was created, in milliseconds since the epoch.
    */
  /* CompleteClass */
  override val timeStamp: Double = js.native
  
  /** 
    * The type of tool event.
    */
  /* CompleteClass */
  var `type`: String = js.native
}

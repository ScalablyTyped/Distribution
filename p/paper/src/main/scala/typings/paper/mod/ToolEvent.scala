package typings.paper.mod

import typings.paper.paper.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "ToolEvent")
@js.native
class ToolEvent ()
  extends typings.paper.paper.ToolEvent {
  /** 
    * The number of times the mouse event was fired.
    */
  /* CompleteClass */
  override var count: Double = js.native
  /** 
    * The difference between the current position and the last position of the
    * mouse when the event was fired. In case of the mouseup event, the
    * difference to the mousedown position is returned.
    */
  /* CompleteClass */
  override var delta: Point = js.native
  /** 
    * The position of the mouse in project coordinates when the mouse button
    * was last clicked.
    */
  /* CompleteClass */
  override var downPoint: Point = js.native
  /** 
    * The item at the position of the mouse (if any).
    * 
    * If the item is contained within one or more {@link Group} or
    * {@link CompoundPath} items, the most top level group or compound path
    * that it is contained within is returned.
    */
  /* CompleteClass */
  override var item: typings.paper.paper.Item = js.native
  /** 
    * The position of the mouse in project coordinates when the previous
    * event was fired.
    */
  /* CompleteClass */
  override var lastPoint: Point = js.native
  /** 
    * The point in the middle between {@link #lastPoint} and
    * {@link #point}. This is a useful position to use when creating
    * artwork based on the moving direction of the mouse, as returned by
    * {@link #delta}.
    */
  /* CompleteClass */
  override var middlePoint: Point = js.native
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
  override var point: Point = js.native
  /** 
    * The time at which the event was created, in milliseconds since the epoch.
    */
  /* CompleteClass */
  override val timeStamp: Double = js.native
  /** 
    * The type of tool event.
    */
  /* CompleteClass */
  override var `type`: String = js.native
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
}


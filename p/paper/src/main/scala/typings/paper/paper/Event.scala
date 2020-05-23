package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The Event object is the base class for any of the other event types,
  * such as {@link MouseEvent}, {@link ToolEvent} and {@link KeyEvent}.
  */
trait Event extends js.Object {
  /** 
    * The current state of the keyboard modifiers.
    * 
    * @see Key.modifiers
    */
  val modifiers: js.Any
  /** 
    * The time at which the event was created, in milliseconds since the epoch.
    */
  val timeStamp: Double
  /** 
    * Cancels the event if it is cancelable, without stopping further
    * propagation of the event.
    */
  def preventDefault(): Unit
  /** 
    * Cancels the event if it is cancelable, and stops stopping further
    * propagation of the event. This is has the same effect as calling both
    * {@link #stopPropagation} and {@link #preventDefault}.
    * 
    * Any handler can also return `false` to indicate that `stop()` should be
    * called right after.
    */
  def stop(): Unit
  /** 
    * Prevents further propagation of the current event.
    */
  def stopPropagation(): Unit
}

object Event {
  @scala.inline
  def apply(
    modifiers: js.Any,
    preventDefault: () => Unit,
    stop: () => Unit,
    stopPropagation: () => Unit,
    timeStamp: Double
  ): Event = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stop = js.Any.fromFunction0(stop), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}


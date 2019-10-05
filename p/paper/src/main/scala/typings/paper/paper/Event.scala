package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Event")
@js.native
class Event () extends Base {
  /**
    * The current state of the keyboard modifiers.
    * Read Only
    */
  val modifiers: js.Any = js.native
  /**
    * The time at which the event was created, in milliseconds since the epoch.
    * Read only.
    */
  val timeStamp: Double = js.native
  /**
    * Cancels the event if it is cancelable, without stopping further propagation of the event.
    */
  def preventDefault(): Unit = js.native
  /**
    * Cancels the event if it is cancelable, and stops stopping further propagation of the event. This is has the same effect as calling both stopPropagation() and preventDefault().
    * Any handler can also return false to indicate that stop() should be called right after.
    */
  def stop(): Unit = js.native
  /**
    * Prevents further propagation of the current event.
    */
  def stopPropagation(): Unit = js.native
}


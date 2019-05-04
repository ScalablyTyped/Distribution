package typings
package atPhosphorSignalingLib.atPhosphorSignalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/signaling", "Signal")
@js.native
class Signal[T, U] protected () extends ISignal[T, U] {
  /**
    * Construct a new signal.
    *
    * @param sender - The sender which owns the signal.
    */
  def this(sender: T) = this()
  /**
    * The sender which owns the signal.
    */
  val sender: T = js.native
  /**
    * Emit the signal and invoke the connected slots.
    *
    * @param args - The args to pass to the connected slots.
    *
    * #### Notes
    * Slots are invoked synchronously in connection order.
    *
    * Exceptions thrown by connected slots will be caught and logged.
    */
  def emit(args: U): scala.Unit = js.native
}


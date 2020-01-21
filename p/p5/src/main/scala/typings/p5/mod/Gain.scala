package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gain extends js.Object {
  /**
    *   Set the output level of the gain node.
    *   @param volume amplitude between 0 and 1.0
    *   @param [rampTime] create a fade that lasts
    *   rampTime
    *   @param [timeFromNow] schedule this event to happen
    *   seconds from now
    */
  def amp(volume: Double): Unit = js.native
  def amp(volume: Double, rampTime: Double): Unit = js.native
  def amp(volume: Double, rampTime: Double, timeFromNow: Double): Unit = js.native
  /**
    *   Send output to a p5.sound or web audio object
    */
  def connect(unit: js.Object): Unit = js.native
  /**
    *   Disconnect all output.
    */
  def disconnect(): Unit = js.native
  /**
    *   Connect a source to the gain node.
    *   @param src p5.sound / Web Audio object with a
    *   sound output.
    */
  def setInput(src: js.Object): Unit = js.native
}


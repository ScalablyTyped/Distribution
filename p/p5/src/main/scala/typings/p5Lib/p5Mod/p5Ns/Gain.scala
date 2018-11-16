package typings
package p5Lib.p5Mod.p5Ns

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
  def amp(volume: scala.Double): scala.Unit = js.native
  /**
       *   Set the output level of the gain node.
       *   @param volume amplitude between 0 and 1.0
       *   @param [rampTime] create a fade that lasts
       *   rampTime
       *   @param [timeFromNow] schedule this event to happen
       *   seconds from now
       */
  def amp(volume: scala.Double, rampTime: scala.Double): scala.Unit = js.native
  /**
       *   Set the output level of the gain node.
       *   @param volume amplitude between 0 and 1.0
       *   @param [rampTime] create a fade that lasts
       *   rampTime
       *   @param [timeFromNow] schedule this event to happen
       *   seconds from now
       */
  def amp(volume: scala.Double, rampTime: scala.Double, timeFromNow: scala.Double): scala.Unit = js.native
  /**
       *   Send output to a p5.sound or web audio object
       */
  def connect(unit: js.Object): scala.Unit = js.native
  /**
       *   Disconnect all output.
       */
  def disconnect(): scala.Unit = js.native
  /**
       *   Connect a source to the gain node.
       *   @param src p5.sound / Web Audio object with a
       *   sound output.
       */
  def setInput(src: js.Object): scala.Unit = js.native
}


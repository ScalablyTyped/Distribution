package typings
package p5Lib.p5Mod.p5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Effect extends js.Object {
  /**
    *   Set the output volume of the filter.
    *   @param [vol] amplitude between 0 and 1.0
    *   @param [rampTime] create a fade that lasts until
    *   rampTime
    *   @param [tFromNow] schedule this event to happen in
    *   tFromNow seconds
    */
  def amp(): scala.Unit = js.native
  def amp(vol: scala.Double): scala.Unit = js.native
  def amp(vol: scala.Double, rampTime: scala.Double): scala.Unit = js.native
  def amp(vol: scala.Double, rampTime: scala.Double, tFromNow: scala.Double): scala.Unit = js.native
  /**
    *   Link effects together in a chainExample usage:
    *   filter.chain(reverb, delay, panner); May be used
    *   with an open-ended number of arguments
    *   @param [arguments] Chain together multiple sound
    *   objects
    */
  def chain(): scala.Unit = js.native
  def chain(arguments: js.Object): scala.Unit = js.native
  /**
    *   Send output to a p5.js-sound, Web Audio Node, or
    *   use signal to control an AudioParam
    */
  def connect(unit: js.Object): scala.Unit = js.native
  /**
    *   Disconnect all output.
    */
  def disconnect(): scala.Unit = js.native
  /**
    *   Adjust the dry/wet value.
    *   @param [fade] The desired drywet value (0 - 1.0)
    */
  def drywet(): scala.Unit = js.native
  def drywet(fade: scala.Double): scala.Unit = js.native
}


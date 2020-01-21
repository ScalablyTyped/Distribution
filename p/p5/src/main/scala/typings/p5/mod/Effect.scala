package typings.p5.mod

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
  def amp(): Unit = js.native
  def amp(vol: Double): Unit = js.native
  def amp(vol: Double, rampTime: Double): Unit = js.native
  def amp(vol: Double, rampTime: Double, tFromNow: Double): Unit = js.native
  /**
    *   Link effects together in a chainExample usage:
    *   filter.chain(reverb, delay, panner); May be used
    *   with an open-ended number of arguments
    *   @param [arguments] Chain together multiple sound
    *   objects
    */
  def chain(): Unit = js.native
  def chain(arguments: js.Object): Unit = js.native
  /**
    *   Send output to a p5.js-sound, Web Audio Node, or
    *   use signal to control an AudioParam
    */
  def connect(unit: js.Object): Unit = js.native
  /**
    *   Disconnect all output.
    */
  def disconnect(): Unit = js.native
  /**
    *   Adjust the dry/wet value.
    *   @param [fade] The desired drywet value (0 - 1.0)
    */
  def drywet(): Unit = js.native
  def drywet(fade: Double): Unit = js.native
}


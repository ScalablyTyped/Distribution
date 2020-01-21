package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Signal extends js.Object {
  /**
    *   Add a constant value to this audio signal, and
    *   return the resulting audio signal. Does not change
    *   the value of the original signal, instead it
    *   returns a new p5.SignalAdd.
    *   @return object
    */
  def add(number: Double): Signal = js.native
  /**
    *   Fade to value, for smooth transitions
    *   @param value Value to set this signal
    *   @param [secondsFromNow] Length of fade, in seconds
    *   from now
    */
  def fade(value: Double): Unit = js.native
  def fade(value: Double, secondsFromNow: Double): Unit = js.native
  /**
    *   Multiply this signal by a constant value, and
    *   return the resulting audio signal. Does not change
    *   the value of the original signal, instead it
    *   returns a new p5.SignalMult.
    *   @param number to multiply
    *   @return object
    */
  def mult(number: Double): Signal = js.native
  /**
    *   Scale this signal value to a given range, and
    *   return the result as an audio signal. Does not
    *   change the value of the original signal, instead
    *   it returns a new p5.SignalScale.
    *   @param number to multiply
    *   @param inMin input range minumum
    *   @param inMax input range maximum
    *   @param outMin input range minumum
    *   @param outMax input range maximum
    *   @return object
    */
  def scale(number: Double, inMin: Double, inMax: Double, outMin: Double, outMax: Double): Signal = js.native
  /**
    *   Connect a p5.sound object or Web Audio node to
    *   this p5.Signal so that its amplitude values can be
    *   scaled.
    */
  def setInput(input: js.Object): Unit = js.native
}


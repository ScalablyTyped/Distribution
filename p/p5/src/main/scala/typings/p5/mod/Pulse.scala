package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pulse extends Oscillator {
  /**
    *   Set the width of a Pulse object (an oscillator
    *   that implements Pulse Width Modulation).
    *   @param [width] Width between the pulses (0 to 1.0,
    *   defaults to 0)
    */
  def width(): Unit = js.native
  def width(width: Double): Unit = js.native
}


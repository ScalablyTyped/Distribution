package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Pulse")
@js.native
/**
  *   Creates a Pulse object, an oscillator that
  *   implements Pulse Width Modulation. The pulse is
  *   created with two oscillators. Accepts a parameter
  *   for frequency, and to set the width between the
  *   pulses. See  p5.Oscillator for a full list of
  *   methods.
  *
  *   @param [freq] Frequency in oscillations per second
  *   (Hz)
  *   @param [w] Width between the pulses (0 to 1.0,
  *   defaults to 0)
  */
class Pulse ()
  extends p5Lib.p5Mod.p5Ns.Pulse {
  def this(freq: scala.Double) = this()
  def this(freq: scala.Double, w: scala.Double) = this()
}


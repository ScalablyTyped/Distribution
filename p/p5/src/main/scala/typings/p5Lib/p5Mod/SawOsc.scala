package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "SawOsc")
@js.native
/**
  *   Constructor: new p5.SawOsc(). This creates a
  *   SawTooth Wave Oscillator and is equivalent to  new
  *   p5.Oscillator('sawtooth')  or creating a
  *   p5.Oscillator and then calling its method
  *   setType('sawtooth'). See p5.Oscillator for
  *   methods.
  *
  *   @param [freq] Set the frequency
  */
class SawOsc ()
  extends p5Lib.p5Mod.p5Ns.SawOsc {
  def this(freq: scala.Double) = this()
}


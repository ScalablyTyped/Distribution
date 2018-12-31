package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "TriOsc")
@js.native
/**
  *   Constructor: new p5.TriOsc(). This creates a
  *   Triangle Wave Oscillator and is equivalent to new
  *   p5.Oscillator('triangle')  or creating a
  *   p5.Oscillator and then calling its method
  *   setType('triangle'). See p5.Oscillator for
  *   methods.
  *
  *   @param [freq] Set the frequency
  */
class TriOsc ()
  extends p5Lib.p5Mod.p5Ns.TriOsc {
  def this(freq: scala.Double) = this()
}


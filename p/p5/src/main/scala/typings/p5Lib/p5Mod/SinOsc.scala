package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "SinOsc")
@js.native
class SinOsc ()
  extends p5Lib.p5Mod.p5Ns.SinOsc {
  /**
       *   Constructor: new p5.SinOsc(). This creates a Sine
       *   Wave Oscillator and is equivalent to  new
       *   p5.Oscillator('sine')  or creating a p5.Oscillator
       *   and then calling its method setType('sine'). See
       *   p5.Oscillator for methods.
       *
       *   @param [freq] Set the frequency
       */
  def this(freq: scala.Double) = this()
}


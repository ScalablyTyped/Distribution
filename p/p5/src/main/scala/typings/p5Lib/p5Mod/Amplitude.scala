package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Amplitude")
@js.native
class Amplitude ()
  extends p5Lib.p5Mod.p5Ns.Amplitude {
  /**
       *   Amplitude measures volume between 0.0 and 1.0.
       *   Listens to all p5sound by default, or use
       *   setInput() to listen to a specific sound source.
       *   Accepts an optional smoothing value, which
       *   defaults to 0.
       *
       *   @param [smoothing] between 0.0 and .999 to smooth
       *   amplitude readings (defaults to 0)
       */
  def this(smoothing: scala.Double) = this()
}


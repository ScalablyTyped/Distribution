package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Distortion")
@js.native
class Distortion ()
  extends p5Lib.p5Mod.p5Ns.Distortion {
  /**
       *   A Distortion effect created with a Waveshaper
       *   Node, with an approach adapted from Kevin Ennis
       *   This class extends p5.Effect.
       *   Methods amp(), chain(), drywet(), connect(), and
       *   disconnect() are available.
       *
       *   @param [amount] Unbounded distortion amount.
       *   Normal values range from 0-1.
       *   @param [oversample] 'none', '2x', or '4x'.
       */
  def this(amount: scala.Double) = this()
  /**
       *   A Distortion effect created with a Waveshaper
       *   Node, with an approach adapted from Kevin Ennis
       *   This class extends p5.Effect.
       *   Methods amp(), chain(), drywet(), connect(), and
       *   disconnect() are available.
       *
       *   @param [amount] Unbounded distortion amount.
       *   Normal values range from 0-1.
       *   @param [oversample] 'none', '2x', or '4x'.
       */
  def this(amount: scala.Double, oversample: java.lang.String) = this()
}


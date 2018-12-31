package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Noise")
@js.native
class Noise protected ()
  extends p5Lib.p5Mod.p5Ns.Noise {
  /**
    *   Noise is a type of oscillator that generates a
    *   buffer with random values.
    *
    *   @param type Type of noise can be 'white'
    *   (default), 'brown' or 'pink'.
    */
  def this(`type`: java.lang.String) = this()
}


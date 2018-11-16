package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Part")
@js.native
class Part ()
  extends p5Lib.p5Mod.p5Ns.Part {
  /**
       *   A p5.Part plays back one or more p5.Phrases.
       *   Instantiate a part with steps and tatums. By
       *   default, each step represents 1/16th note. See
       *   p5.Phrase for more about musical timing.
       *
       *   @param [steps] Steps in the part
       *   @param [tatums] Divisions of a beat (default is
       *   1/16, a quarter note)
       */
  def this(steps: scala.Double) = this()
  /**
       *   A p5.Part plays back one or more p5.Phrases.
       *   Instantiate a part with steps and tatums. By
       *   default, each step represents 1/16th note. See
       *   p5.Phrase for more about musical timing.
       *
       *   @param [steps] Steps in the part
       *   @param [tatums] Divisions of a beat (default is
       *   1/16, a quarter note)
       */
  def this(steps: scala.Double, tatums: scala.Double) = this()
}


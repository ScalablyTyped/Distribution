package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Part")
@js.native
/**
  *   A p5.Part plays back one or more p5.Phrases.
  *   Instantiate a part with steps and tatums. By
  *   default, each step represents a 1/16th note. See
  *   p5.Phrase for more about musical timing.
  *
  *   @param [steps] Steps in the part
  *   @param [tatums] Divisions of a beat, e.g. use 1/4,
  *   or 0.25 for a quater note (default is 1/16, a
  *   sixteenth note)
  */
class Part ()
  extends p5Lib.p5Mod.p5Ns.Part {
  def this(steps: scala.Double) = this()
  def this(steps: scala.Double, tatums: scala.Double) = this()
}


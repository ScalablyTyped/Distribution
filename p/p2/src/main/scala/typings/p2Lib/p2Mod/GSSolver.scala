package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "GSSolver")
@js.native
class GSSolver () extends Solver {
  def this(options: GSSolverOptions) = this()
  var frictionIterations: scala.Double = js.native
  var iterations: scala.Double = js.native
  var tolerance: scala.Double = js.native
  var usedIterations: scala.Double = js.native
}


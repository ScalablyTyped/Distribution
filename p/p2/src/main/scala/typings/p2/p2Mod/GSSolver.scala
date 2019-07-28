package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "GSSolver")
@js.native
class GSSolver () extends Solver {
  def this(options: GSSolverOptions) = this()
  var frictionIterations: Double = js.native
  var iterations: Double = js.native
  var tolerance: Double = js.native
  var usedIterations: Double = js.native
}


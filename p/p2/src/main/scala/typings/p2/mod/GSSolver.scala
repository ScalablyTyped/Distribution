package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "GSSolver")
@js.native
open class GSSolver () extends Solver {
  def this(options: GSSolverOptions) = this()
  
  var frictionIterations: Double = js.native
  
  var iterations: Double = js.native
  
  var tolerance: Double = js.native
  
  var usedIterations: Double = js.native
}

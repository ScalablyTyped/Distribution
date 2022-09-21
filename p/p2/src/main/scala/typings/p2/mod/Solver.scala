package typings.p2.mod

import typings.p2.p2Numbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Solver")
@js.native
open class Solver protected () extends EventEmitter {
  def this(
    options: Unit,
    `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Solver.GS */ Any
  ) = this()
  def this(
    options: SolverOptions,
    `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Solver.GS */ Any
  ) = this()
  
  def addEquation(eq: Equation): Unit = js.native
  
  def addEquations(eqs: js.Array[Equation]): Unit = js.native
  
  var equationSortFunction: Equation | Boolean = js.native
  
  var equations: js.Array[Equation] = js.native
  
  def removeAllEquations(): Unit = js.native
  
  def removeEquation(eq: Equation): Unit = js.native
  
  def solve(dt: Double, world: World): Unit = js.native
  
  def solveIsland(dt: Double, island: Island): Unit = js.native
  
  def sortEquations(): Unit = js.native
  
  var `type`: Double = js.native
}
/* static members */
object Solver {
  
  @JSImport("p2", "Solver")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("p2", "Solver.GS")
  @js.native
  def GS: `1` = js.native
  inline def GS_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GS")(x.asInstanceOf[js.Any])
}

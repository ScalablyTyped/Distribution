package typings.p2.global.p2

import typings.p2.mod.SolverOptions
import typings.p2.p2Numbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.Solver")
@js.native
open class Solver protected ()
  extends typings.p2.mod.Solver {
  def this(
    options: Unit,
    `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Solver.GS */ Any
  ) = this()
  def this(
    options: SolverOptions,
    `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Solver.GS */ Any
  ) = this()
}
/* static members */
object Solver {
  
  @JSGlobal("p2.Solver")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("p2.Solver.GS")
  @js.native
  def GS: `1` = js.native
  inline def GS_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GS")(x.asInstanceOf[js.Any])
}

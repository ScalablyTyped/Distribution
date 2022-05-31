package typings.p2.global.p2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.Solver")
@js.native
class Solver ()
  extends typings.p2.mod.Solver {
  def this(options: js.Object) = this()
  def this(options: js.Object, `type`: Double) = this()
  def this(options: Unit, `type`: Double) = this()
}
/* static members */
object Solver {
  
  @JSGlobal("p2.Solver")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("p2.Solver.GS")
  @js.native
  def GS: Double = js.native
  inline def GS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GS")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Solver.ISLAND")
  @js.native
  def ISLAND: Double = js.native
  inline def ISLAND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISLAND")(x.asInstanceOf[js.Any])
}

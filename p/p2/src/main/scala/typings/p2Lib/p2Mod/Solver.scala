package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Solver")
@js.native
class Solver ()
  extends p2Lib.p2Mod.p2Ns.Solver {
  def this(options: js.Object) = this()
  def this(options: js.Object, `type`: scala.Double) = this()
  /* CompleteClass */
  override var equationSortFunction: p2Lib.p2Mod.p2Ns.Equation = js.native
  /* CompleteClass */
  override var equations: js.Array[p2Lib.p2Mod.p2Ns.Equation] = js.native
  /* CompleteClass */
  override var `type`: scala.Double = js.native
  /* CompleteClass */
  override def addEquation(eq: p2Lib.p2Mod.p2Ns.Equation): scala.Unit = js.native
  /* CompleteClass */
  override def addEquations(eqs: js.Array[p2Lib.p2Mod.p2Ns.Equation]): scala.Unit = js.native
  /* CompleteClass */
  override def emit(event: js.Any): p2Lib.p2Mod.p2Ns.EventEmitter = js.native
  /* CompleteClass */
  override def has(`type`: java.lang.String, listener: js.Function): scala.Boolean = js.native
  /* CompleteClass */
  override def off(`type`: java.lang.String, listener: js.Function): p2Lib.p2Mod.p2Ns.EventEmitter = js.native
  /* CompleteClass */
  override def on(`type`: java.lang.String, listener: js.Function, context: js.Any): p2Lib.p2Mod.p2Ns.EventEmitter = js.native
  /* CompleteClass */
  override def removeAllEquations(): scala.Unit = js.native
  /* CompleteClass */
  override def removeEquation(eq: p2Lib.p2Mod.p2Ns.Equation): scala.Unit = js.native
   //Equation | boolean
  /* CompleteClass */
  override def solve(dy: scala.Double, world: p2Lib.p2Mod.p2Ns.World): scala.Unit = js.native
  /* CompleteClass */
  override def solveIsland(dy: scala.Double, island: p2Lib.p2Mod.p2Ns.Island): scala.Unit = js.native
  /* CompleteClass */
  override def sortEquations(): scala.Unit = js.native
}

@JSImport("p2", "Solver")
@js.native
object Solver extends js.Object {
  var GS: scala.Double = js.native
  var ISLAND: scala.Double = js.native
}


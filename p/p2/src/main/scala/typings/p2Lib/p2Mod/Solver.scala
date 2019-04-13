package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Solver")
@js.native
class Solver () extends EventEmitter {
  def this(options: js.Object) = this()
  def this(options: js.Object, `type`: scala.Double) = this()
  var equationSortFunction: Equation | scala.Boolean = js.native
  var equations: js.Array[Equation] = js.native
  var `type`: scala.Double = js.native
  def addEquation(eq: Equation): scala.Unit = js.native
  def addEquations(eqs: js.Array[Equation]): scala.Unit = js.native
  def removeAllEquations(): scala.Unit = js.native
  def removeEquation(eq: Equation): scala.Unit = js.native
  def solve(dt: scala.Double, world: World): scala.Unit = js.native
  def solveIsland(dt: scala.Double, island: Island): scala.Unit = js.native
  def sortEquations(): scala.Unit = js.native
}

/* static members */
@JSImport("p2", "Solver")
@js.native
object Solver extends js.Object {
  var GS: scala.Double = js.native
  var ISLAND: scala.Double = js.native
}


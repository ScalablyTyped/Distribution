package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Solver extends EventEmitter {
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


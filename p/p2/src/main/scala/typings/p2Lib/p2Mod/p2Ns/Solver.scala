package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Solver extends EventEmitter {
  var equationSortFunction: Equation
  var equations: js.Array[Equation]
  var `type`: scala.Double
  def addEquation(eq: Equation): scala.Unit
  def addEquations(eqs: js.Array[Equation]): scala.Unit
  def removeAllEquations(): scala.Unit
  def removeEquation(eq: Equation): scala.Unit
   //Equation | boolean
  def solve(dy: scala.Double, world: World): scala.Unit
  def solveIsland(dy: scala.Double, island: Island): scala.Unit
  def sortEquations(): scala.Unit
}


package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "IslandManager")
@js.native
class IslandManager ()
  extends p2Lib.p2Mod.p2Ns.IslandManager {
  /* CompleteClass */
  override var equationSortFunction: p2Lib.p2Mod.p2Ns.Equation = js.native
  /* CompleteClass */
  override var equations: js.Array[p2Lib.p2Mod.p2Ns.Equation] = js.native
  /* CompleteClass */
  override var islands: js.Array[p2Lib.p2Mod.p2Ns.Island] = js.native
  /* CompleteClass */
  override var nodes: js.Array[p2Lib.p2Mod.p2Ns.IslandNode] = js.native
  /* CompleteClass */
  override var `type`: scala.Double = js.native
  /* CompleteClass */
  override def addEquation(eq: p2Lib.p2Mod.p2Ns.Equation): scala.Unit = js.native
  /* CompleteClass */
  override def addEquations(eqs: js.Array[p2Lib.p2Mod.p2Ns.Equation]): scala.Unit = js.native
  /* CompleteClass */
  override def bfs(
    root: p2Lib.p2Mod.p2Ns.IslandNode,
    bds: js.Array[p2Lib.p2Mod.p2Ns.Body],
    eqs: js.Array[p2Lib.p2Mod.p2Ns.Equation]
  ): scala.Unit = js.native
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
  /* CompleteClass */
  override def split(world: p2Lib.p2Mod.p2Ns.World): js.Array[p2Lib.p2Mod.p2Ns.Island] = js.native
  /* CompleteClass */
  override def visit(
    node: p2Lib.p2Mod.p2Ns.IslandNode,
    bds: js.Array[p2Lib.p2Mod.p2Ns.Body],
    eqs: js.Array[p2Lib.p2Mod.p2Ns.Equation]
  ): scala.Unit = js.native
}

/* static members */
@JSImport("p2", "IslandManager")
@js.native
object IslandManager extends js.Object {
  def getUnvisitedNode(nodes: js.Array[p2Lib.p2Mod.p2Ns.IslandNode]): p2Lib.p2Mod.p2Ns.IslandNode = js.native
}


package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "IslandManager")
@js.native
class IslandManager () extends Solver {
  def this(options: IslandManagerOptions) = this()
  var islands: js.Array[Island] = js.native
  var nodes: js.Array[IslandNode] = js.native
  def bfs(root: IslandNode, bds: js.Array[Body], eqs: js.Array[Equation]): scala.Unit = js.native
  def split(world: World): js.Array[Island] = js.native
  def visit(node: IslandNode, bds: js.Array[Body], eqs: js.Array[Equation]): scala.Unit = js.native
}

/* static members */
@JSImport("p2", "IslandManager")
@js.native
object IslandManager extends js.Object {
  def getUnvisitedNode(nodes: js.Array[p2Lib.p2Mod.IslandNode]): p2Lib.p2Mod.IslandNode | scala.Boolean = js.native
}


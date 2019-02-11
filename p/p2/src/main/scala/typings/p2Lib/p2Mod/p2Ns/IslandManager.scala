package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IslandManager extends Solver {
  var islands: js.Array[Island] = js.native
  var nodes: js.Array[IslandNode] = js.native
  def bfs(root: IslandNode, bds: js.Array[Body], eqs: js.Array[Equation]): scala.Unit = js.native
  def split(world: World): js.Array[Island] = js.native
  def visit(node: IslandNode, bds: js.Array[Body], eqs: js.Array[Equation]): scala.Unit = js.native
}


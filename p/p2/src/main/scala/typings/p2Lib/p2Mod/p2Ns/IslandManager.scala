package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IslandManager extends Solver {
  var islands: js.Array[Island]
  var nodes: js.Array[IslandNode]
  def bfs(root: IslandNode, bds: js.Array[Body], eqs: js.Array[Equation]): scala.Unit
  def split(world: World): js.Array[Island]
  def visit(node: IslandNode, bds: js.Array[Body], eqs: js.Array[Equation]): scala.Unit
}


package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IslandNode extends js.Object {
  var body: Body
  var equations: js.Array[Equation]
  var neighbors: js.Array[IslandNode]
  var visited: scala.Boolean
  def reset(): scala.Unit
}

object IslandNode {
  @scala.inline
  def apply(
    body: Body,
    equations: js.Array[Equation],
    neighbors: js.Array[IslandNode],
    reset: () => scala.Unit,
    visited: scala.Boolean
  ): IslandNode = {
    val __obj = js.Dynamic.literal(body = body, equations = equations, neighbors = neighbors, reset = js.Any.fromFunction0(reset), visited = visited)
  
    __obj.asInstanceOf[IslandNode]
  }
}


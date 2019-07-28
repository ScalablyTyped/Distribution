package typings.pathfinding.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var walkable: Boolean
  var x: Double
  var y: Double
}

object Node {
  @scala.inline
  def apply(walkable: Boolean, x: Double, y: Double): Node = {
    val __obj = js.Dynamic.literal(walkable = walkable, x = x, y = y)
  
    __obj.asInstanceOf[Node]
  }
}


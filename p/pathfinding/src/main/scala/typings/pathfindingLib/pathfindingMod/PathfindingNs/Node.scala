package typings
package pathfindingLib.pathfindingMod.PathfindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var walkable: scala.Boolean
  var x: scala.Double
  var y: scala.Double
}

object Node {
  @scala.inline
  def apply(walkable: scala.Boolean, x: scala.Double, y: scala.Double): Node = {
    val __obj = js.Dynamic.literal(walkable = walkable, x = x, y = y)
  
    __obj.asInstanceOf[Node]
  }
}


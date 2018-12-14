package typings
package pathfindingLib.pathfindingMod.PathfindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grid
  extends org.scalablytyped.runtime.Instantiable2[/* width */ scala.Double, /* height */ scala.Double, Grid]
     with org.scalablytyped.runtime.Instantiable1[/* matrix */ js.Array[js.Array[scala.Double]], Grid] {
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  def getNeighbors(node: Node, diagonalMovement: DiagonalMovement): js.Array[Node] = js.native
  def getNodeAt(): Node = js.native
  def isInside(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def isWalkableAt(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def setWalkableAt(x: scala.Double, y: scala.Double, walkable: scala.Boolean): scala.Unit = js.native
}


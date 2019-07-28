package typings.pathfinding.pathfindingMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grid
  extends Instantiable2[/* width */ Double, /* height */ Double, Grid]
     with Instantiable1[/* matrix */ js.Array[js.Array[Double]], Grid] {
  var height: Double = js.native
  var width: Double = js.native
  def getNeighbors(node: Node, diagonalMovement: DiagonalMovement): js.Array[Node] = js.native
  def getNodeAt(): Node = js.native
  def isInside(x: Double, y: Double): Boolean = js.native
  def isWalkableAt(x: Double, y: Double): Boolean = js.native
  def setWalkableAt(x: Double, y: Double, walkable: Boolean): Unit = js.native
}

@JSImport("pathfinding", "Grid")
@js.native
class GridCls protected () extends Grid {
  def this(matrix: js.Array[js.Array[Double]]) = this()
  def this(width: Double, height: Double) = this()
}


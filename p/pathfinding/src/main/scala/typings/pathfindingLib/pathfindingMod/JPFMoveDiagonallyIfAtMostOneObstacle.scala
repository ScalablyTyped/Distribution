package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathfinding", "JPFMoveDiagonallyIfAtMostOneObstacle")
@js.native
class JPFMoveDiagonallyIfAtMostOneObstacleCls ()
  extends pathfindingLib.pathfindingMod.PathfindingNs.JPFMoveDiagonallyIfAtMostOneObstacle {
  def this(opt: pathfindingLib.pathfindingMod.PathfindingNs.JumpPointFinderBaseOptions) = this()
  /* CompleteClass */
  override def findPath(
    startX: scala.Double,
    startY: scala.Double,
    endX: scala.Double,
    endY: scala.Double,
    matrix: pathfindingLib.pathfindingMod.PathfindingNs.Grid
  ): js.Array[js.Array[scala.Double]] = js.native
}


package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathfinding", "AStarFinder")
@js.native
class AStarFinderCls ()
  extends pathfindingLib.pathfindingMod.PathfindingNs.AStarFinder {
  def this(opt: pathfindingLib.pathfindingMod.PathfindingNs.FinderOptions) = this()
  /* CompleteClass */
  override def findPath(
    startX: scala.Double,
    startY: scala.Double,
    endX: scala.Double,
    endY: scala.Double,
    matrix: pathfindingLib.pathfindingMod.PathfindingNs.Grid
  ): js.Array[js.Array[scala.Double]] = js.native
}


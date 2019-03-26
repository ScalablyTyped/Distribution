package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathfinding", "BiAStarFinder")
@js.native
class BiAStarFinderCls ()
  extends pathfindingLib.pathfindingMod.PathfindingNs.BiAStarFinder {
  def this(opt: pathfindingLib.pathfindingMod.PathfindingNs.JumpPointFinderOptions) = this()
  /* CompleteClass */
  override def findPath(
    startX: scala.Double,
    startY: scala.Double,
    endX: scala.Double,
    endY: scala.Double,
    matrix: pathfindingLib.pathfindingMod.PathfindingNs.Grid
  ): js.Array[js.Array[scala.Double]] = js.native
}


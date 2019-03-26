package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathfinding", "BestFirstFinder")
@js.native
class BestFirstFinderCls ()
  extends pathfindingLib.pathfindingMod.PathfindingNs.BestFirstFinder {
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


package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathfinding", "BiBestFirstFinder")
@js.native
class BiBestFirstFinderCls ()
  extends pathfindingLib.pathfindingMod.PathfindingNs.BiBestFirstFinder {
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


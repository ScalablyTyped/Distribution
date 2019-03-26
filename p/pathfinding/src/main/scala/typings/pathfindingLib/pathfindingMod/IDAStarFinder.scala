package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathfinding", "IDAStarFinder")
@js.native
class IDAStarFinderCls ()
  extends pathfindingLib.pathfindingMod.PathfindingNs.IDAStarFinder {
  def this(opt: pathfindingLib.pathfindingMod.PathfindingNs.IDAStarFinderOptions) = this()
  /* CompleteClass */
  override def findPath(
    startX: scala.Double,
    startY: scala.Double,
    endX: scala.Double,
    endY: scala.Double,
    matrix: pathfindingLib.pathfindingMod.PathfindingNs.Grid
  ): js.Array[js.Array[scala.Double]] = js.native
}


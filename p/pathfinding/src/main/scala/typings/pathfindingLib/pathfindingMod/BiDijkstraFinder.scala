package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathfinding", "BiDijkstraFinder")
@js.native
class BiDijkstraFinderCls ()
  extends pathfindingLib.pathfindingMod.PathfindingNs.BiDijkstraFinder {
  def this(opt: pathfindingLib.pathfindingMod.PathfindingNs.BiBreadthFirstFinderOptions) = this()
  /* CompleteClass */
  override def findPath(
    startX: scala.Double,
    startY: scala.Double,
    endX: scala.Double,
    endY: scala.Double,
    matrix: pathfindingLib.pathfindingMod.PathfindingNs.Grid
  ): js.Array[js.Array[scala.Double]] = js.native
}


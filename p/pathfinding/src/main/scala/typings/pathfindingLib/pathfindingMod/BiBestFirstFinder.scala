package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BiBestFirstFinder extends BiAStarFinder

@JSImport("pathfinding", "BiBestFirstFinder")
@js.native
class BiBestFirstFinderCls () extends BiBestFirstFinder {
  def this(opt: JumpPointFinderOptions) = this()
  /* CompleteClass */
  override def findPath(startX: scala.Double, startY: scala.Double, endX: scala.Double, endY: scala.Double, matrix: Grid): js.Array[js.Array[scala.Double]] = js.native
}


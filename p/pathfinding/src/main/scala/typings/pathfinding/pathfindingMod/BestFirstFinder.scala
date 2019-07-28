package typings.pathfinding.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BestFirstFinder extends AStarFinder

@JSImport("pathfinding", "BestFirstFinder")
@js.native
class BestFirstFinderCls () extends BestFirstFinder {
  def this(opt: JumpPointFinderOptions) = this()
  /* CompleteClass */
  override def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]] = js.native
}


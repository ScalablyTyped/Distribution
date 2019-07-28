package typings.pathfinding.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JPFMoveDiagonallyIfNoObstacles extends JumpPointFinderBase

@JSImport("pathfinding", "JPFMoveDiagonallyIfNoObstacles")
@js.native
class JPFMoveDiagonallyIfNoObstaclesCls () extends JPFMoveDiagonallyIfNoObstacles {
  def this(opt: JumpPointFinderBaseOptions) = this()
  /* CompleteClass */
  override def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]] = js.native
}


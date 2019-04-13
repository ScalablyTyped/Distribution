package typings
package pathfindingLib.pathfindingMod

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
  override def findPath(startX: scala.Double, startY: scala.Double, endX: scala.Double, endY: scala.Double, matrix: Grid): js.Array[js.Array[scala.Double]] = js.native
}


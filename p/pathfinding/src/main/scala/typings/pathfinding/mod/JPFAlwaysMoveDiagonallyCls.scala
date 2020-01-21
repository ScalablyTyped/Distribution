package typings.pathfinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathfinding", "JPFAlwaysMoveDiagonally")
@js.native
class JPFAlwaysMoveDiagonallyCls () extends JPFAlwaysMoveDiagonally {
  def this(opt: JumpPointFinderBaseOptions) = this()
  /* CompleteClass */
  override def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]] = js.native
}


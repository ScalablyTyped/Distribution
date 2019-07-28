package typings.pathfinding.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JPFNeverMoveDiagonally extends JumpPointFinderBase

@JSImport("pathfinding", "JPFNeverMoveDiagonally")
@js.native
class JPFNeverMoveDiagonallyCls () extends JPFNeverMoveDiagonally {
  def this(opt: JumpPointFinderBaseOptions) = this()
  /* CompleteClass */
  override def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]] = js.native
}


package typings
package pathfindingLib.pathfindingMod

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
  override def findPath(startX: scala.Double, startY: scala.Double, endX: scala.Double, endY: scala.Double, matrix: Grid): js.Array[js.Array[scala.Double]] = js.native
}


package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AStarFinder
  extends Finder
     with org.scalablytyped.runtime.Instantiable0[AStarFinder]
     with org.scalablytyped.runtime.Instantiable1[/* opt */ FinderOptions, AStarFinder]

@JSImport("pathfinding", "AStarFinder")
@js.native
class AStarFinderCls () extends AStarFinder {
  def this(opt: FinderOptions) = this()
  /* CompleteClass */
  override def findPath(startX: scala.Double, startY: scala.Double, endX: scala.Double, endY: scala.Double, matrix: Grid): js.Array[js.Array[scala.Double]] = js.native
}


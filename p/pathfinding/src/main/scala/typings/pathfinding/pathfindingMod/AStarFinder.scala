package typings.pathfinding.pathfindingMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AStarFinder
  extends Finder
     with Instantiable0[AStarFinder]
     with Instantiable1[/* opt */ FinderOptions, AStarFinder]

@JSImport("pathfinding", "AStarFinder")
@js.native
class AStarFinderCls () extends AStarFinder {
  def this(opt: FinderOptions) = this()
  /* CompleteClass */
  override def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]] = js.native
}


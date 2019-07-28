package typings.pathfinding.pathfindingMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BiAStarFinder
  extends Finder
     with Instantiable0[BiAStarFinder]
     with Instantiable1[/* opt */ JumpPointFinderOptions, BiAStarFinder]

@JSImport("pathfinding", "BiAStarFinder")
@js.native
class BiAStarFinderCls () extends BiAStarFinder {
  def this(opt: JumpPointFinderOptions) = this()
  /* CompleteClass */
  override def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]] = js.native
}


package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BiAStarFinder
  extends Finder
     with org.scalablytyped.runtime.Instantiable0[BiAStarFinder]
     with org.scalablytyped.runtime.Instantiable1[/* opt */ JumpPointFinderOptions, BiAStarFinder]

@JSImport("pathfinding", "BiAStarFinder")
@js.native
class BiAStarFinderCls () extends BiAStarFinder {
  def this(opt: JumpPointFinderOptions) = this()
  /* CompleteClass */
  override def findPath(startX: scala.Double, startY: scala.Double, endX: scala.Double, endY: scala.Double, matrix: Grid): js.Array[js.Array[scala.Double]] = js.native
}


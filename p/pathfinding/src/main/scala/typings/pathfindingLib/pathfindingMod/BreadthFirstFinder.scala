package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadthFirstFinder
  extends Finder
     with org.scalablytyped.runtime.Instantiable0[BreadthFirstFinder]
     with org.scalablytyped.runtime.Instantiable1[/* opt */ BiBreadthFirstFinderOptions, BreadthFirstFinder]

@JSImport("pathfinding", "BreadthFirstFinder")
@js.native
class BreadthFirstFinderCls () extends BreadthFirstFinder {
  def this(opt: BiBreadthFirstFinderOptions) = this()
  /* CompleteClass */
  override def findPath(startX: scala.Double, startY: scala.Double, endX: scala.Double, endY: scala.Double, matrix: Grid): js.Array[js.Array[scala.Double]] = js.native
}


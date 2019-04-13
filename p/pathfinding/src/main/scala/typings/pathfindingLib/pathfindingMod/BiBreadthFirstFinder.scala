package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BiBreadthFirstFinder
  extends Finder
     with org.scalablytyped.runtime.Instantiable0[BiBreadthFirstFinder]
     with org.scalablytyped.runtime.Instantiable1[/* opt */ BiBreadthFirstFinderOptions, BiBreadthFirstFinder]

@JSImport("pathfinding", "BiBreadthFirstFinder")
@js.native
class BiBreadthFirstFinderCls () extends BiBreadthFirstFinder {
  def this(opt: BiBreadthFirstFinderOptions) = this()
  /* CompleteClass */
  override def findPath(startX: scala.Double, startY: scala.Double, endX: scala.Double, endY: scala.Double, matrix: Grid): js.Array[js.Array[scala.Double]] = js.native
}


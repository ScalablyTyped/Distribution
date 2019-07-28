package typings.pathfinding.pathfindingMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadthFirstFinder
  extends Finder
     with Instantiable0[BreadthFirstFinder]
     with Instantiable1[/* opt */ BiBreadthFirstFinderOptions, BreadthFirstFinder]

@JSImport("pathfinding", "BreadthFirstFinder")
@js.native
class BreadthFirstFinderCls () extends BreadthFirstFinder {
  def this(opt: BiBreadthFirstFinderOptions) = this()
  /* CompleteClass */
  override def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]] = js.native
}


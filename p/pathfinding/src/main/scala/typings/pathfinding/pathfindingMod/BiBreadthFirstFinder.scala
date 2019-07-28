package typings.pathfinding.pathfindingMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BiBreadthFirstFinder
  extends Finder
     with Instantiable0[BiBreadthFirstFinder]
     with Instantiable1[/* opt */ BiBreadthFirstFinderOptions, BiBreadthFirstFinder]

@JSImport("pathfinding", "BiBreadthFirstFinder")
@js.native
class BiBreadthFirstFinderCls () extends BiBreadthFirstFinder {
  def this(opt: BiBreadthFirstFinderOptions) = this()
  /* CompleteClass */
  override def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]] = js.native
}


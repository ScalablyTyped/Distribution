package typings.pathfinding.pathfindingMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDAStarFinder
  extends Finder
     with Instantiable0[IDAStarFinder]
     with Instantiable1[/* opt */ IDAStarFinderOptions, IDAStarFinder]

@JSImport("pathfinding", "IDAStarFinder")
@js.native
class IDAStarFinderCls () extends IDAStarFinder {
  def this(opt: IDAStarFinderOptions) = this()
  /* CompleteClass */
  override def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]] = js.native
}


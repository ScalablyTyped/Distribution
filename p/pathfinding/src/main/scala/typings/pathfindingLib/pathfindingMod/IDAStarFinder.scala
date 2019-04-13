package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDAStarFinder
  extends Finder
     with org.scalablytyped.runtime.Instantiable0[IDAStarFinder]
     with org.scalablytyped.runtime.Instantiable1[/* opt */ IDAStarFinderOptions, IDAStarFinder]

@JSImport("pathfinding", "IDAStarFinder")
@js.native
class IDAStarFinderCls () extends IDAStarFinder {
  def this(opt: IDAStarFinderOptions) = this()
  /* CompleteClass */
  override def findPath(startX: scala.Double, startY: scala.Double, endX: scala.Double, endY: scala.Double, matrix: Grid): js.Array[js.Array[scala.Double]] = js.native
}


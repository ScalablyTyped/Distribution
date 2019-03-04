package typings
package pathfindingLib.pathfindingMod.PathfindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Finder extends js.Object {
  def findPath(startX: scala.Double, startY: scala.Double, endX: scala.Double, endY: scala.Double, matrix: Grid): js.Array[js.Array[scala.Double]]
}

object Finder {
  @scala.inline
  def apply(
    findPath: js.Function5[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      Grid, 
      js.Array[js.Array[scala.Double]]
    ]
  ): Finder = {
    val __obj = js.Dynamic.literal(findPath = findPath)
  
    __obj.asInstanceOf[Finder]
  }
}


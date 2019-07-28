package typings.pathfinding.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Finder extends js.Object {
  def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]]
}

object Finder {
  @scala.inline
  def apply(findPath: (Double, Double, Double, Double, Grid) => js.Array[js.Array[Double]]): Finder = {
    val __obj = js.Dynamic.literal(findPath = js.Any.fromFunction5(findPath))
  
    __obj.asInstanceOf[Finder]
  }
}


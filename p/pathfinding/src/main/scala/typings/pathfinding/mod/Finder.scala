package typings.pathfinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Finder extends js.Object {
  def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]] = js.native
}

object Finder {
  @scala.inline
  def apply(findPath: (Double, Double, Double, Double, Grid) => js.Array[js.Array[Double]]): Finder = {
    val __obj = js.Dynamic.literal(findPath = js.Any.fromFunction5(findPath))
    __obj.asInstanceOf[Finder]
  }
  @scala.inline
  implicit class FinderOps[Self <: Finder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFindPath(value: (Double, Double, Double, Double, Grid) => js.Array[js.Array[Double]]): Self = this.set("findPath", js.Any.fromFunction5(value))
  }
  
}


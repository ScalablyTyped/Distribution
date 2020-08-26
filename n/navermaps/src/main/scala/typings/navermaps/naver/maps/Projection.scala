package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projection extends js.Object {
  def fromCoordToPoint(coord: Coord): Point = js.native
  def fromPointToCoord(point: Point): Coord = js.native
}

object Projection {
  @scala.inline
  def apply(fromCoordToPoint: Coord => Point, fromPointToCoord: Point => Coord): Projection = {
    val __obj = js.Dynamic.literal(fromCoordToPoint = js.Any.fromFunction1(fromCoordToPoint), fromPointToCoord = js.Any.fromFunction1(fromPointToCoord))
    __obj.asInstanceOf[Projection]
  }
  @scala.inline
  implicit class ProjectionOps[Self <: Projection] (val x: Self) extends AnyVal {
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
    def setFromCoordToPoint(value: Coord => Point): Self = this.set("fromCoordToPoint", js.Any.fromFunction1(value))
    @scala.inline
    def setFromPointToCoord(value: Point => Coord): Self = this.set("fromPointToCoord", js.Any.fromFunction1(value))
  }
  
}


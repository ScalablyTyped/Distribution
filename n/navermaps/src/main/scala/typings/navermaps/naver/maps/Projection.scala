package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  def fromCoordToPoint(coord: Coord): Point
  def fromPointToCoord(point: Point): Coord
}

object Projection {
  @scala.inline
  def apply(fromCoordToPoint: Coord => Point, fromPointToCoord: Point => Coord): Projection = {
    val __obj = js.Dynamic.literal(fromCoordToPoint = js.Any.fromFunction1(fromCoordToPoint), fromPointToCoord = js.Any.fromFunction1(fromPointToCoord))
    __obj.asInstanceOf[Projection]
  }
}


package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  def fromCoordToPoint(coord: Coord): Point
  def fromPointToCoord(point: Point): Coord
}

object Projection {
  @scala.inline
  def apply(fromCoordToPoint: js.Function1[Coord, Point], fromPointToCoord: js.Function1[Point, Coord]): Projection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromCoordToPoint")(fromCoordToPoint)
    __obj.updateDynamic("fromPointToCoord")(fromPointToCoord)
    __obj.asInstanceOf[Projection]
  }
}


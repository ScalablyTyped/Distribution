package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Projection extends js.Object {
  def fromCoordToPoint(coord: Coord): Point
  def fromPointToCoord(point: Point): Coord
}


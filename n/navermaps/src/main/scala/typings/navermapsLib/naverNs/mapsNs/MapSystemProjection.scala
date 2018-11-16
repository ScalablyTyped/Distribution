package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapSystemProjection extends KVO {
  def factor(zoom: scala.Double): scala.Double = js.native
  def fromCoordToOffset(coord: Coord): Point = js.native
  def fromCoordToPoint(coord: Coord): Point = js.native
  def fromOffsetToCoord(offset: Point): Coord = js.native
  def fromOffsetToPoint(offset: Point): Point = js.native
  def fromPointToCoord(point: Point): Coord = js.native
  def fromPointToOffset(point: Point): Point = js.native
  def getDestinationCoord(fromCoord: Coord, angle: scala.Double, meter: scala.Double): Coord = js.native
  def getDistance(coord1: Coord, coord2: Coord): scala.Double = js.native
  def getProjectionName(): scala.Double = js.native
  def scaleDown(operand: Point, zoom: scala.Double): scala.Double | Point | Size = js.native
  def scaleDown(operand: Size, zoom: scala.Double): scala.Double | Point | Size = js.native
  def scaleDown(operand: scala.Double, zoom: scala.Double): scala.Double | Point | Size = js.native
  def scaleUp(operand: Point, zoom: scala.Double): scala.Double | Point | Size = js.native
  def scaleUp(operand: Size, zoom: scala.Double): scala.Double | Point | Size = js.native
  def scaleUp(operand: scala.Double, zoom: scala.Double): scala.Double | Point | Size = js.native
}


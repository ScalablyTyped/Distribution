package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.EPSG3857")
@js.native
object EPSG3857Ns extends js.Object {
  // implements Projection
  def fromCoordToPoint(coord: Coord): Point = js.native
  def fromLatLngToPoint(latlng: LatLng): Point = js.native
  def fromPointToCoord(point: Point): LatLng = js.native
  def fromPointToLatLng(point: Point): LatLng = js.native
  def getDestinationCoord(fromLatLng: LatLng, angle: Double, meter: Double): LatLng = js.native
  def getDistance(latlng1: LatLng, latlng2: LatLng): Double = js.native
}


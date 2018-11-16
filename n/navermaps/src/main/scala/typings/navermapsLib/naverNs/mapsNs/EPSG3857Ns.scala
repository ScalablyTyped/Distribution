package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.EPSG3857")
@js.native
object EPSG3857Ns extends js.Object {
  // implements Projection
  def fromCoordToPoint(coord: navermapsLib.naverNs.mapsNs.Coord): navermapsLib.naverNs.mapsNs.Point = js.native
  def fromLatLngToPoint(latlng: navermapsLib.naverNs.mapsNs.LatLng): navermapsLib.naverNs.mapsNs.Point = js.native
  def fromPointToCoord(point: navermapsLib.naverNs.mapsNs.Point): navermapsLib.naverNs.mapsNs.LatLng = js.native
  def fromPointToLatLng(point: navermapsLib.naverNs.mapsNs.Point): navermapsLib.naverNs.mapsNs.LatLng = js.native
  def getDestinationCoord(fromLatLng: navermapsLib.naverNs.mapsNs.LatLng, angle: scala.Double, meter: scala.Double): navermapsLib.naverNs.mapsNs.LatLng = js.native
  def getDistance(latlng1: navermapsLib.naverNs.mapsNs.LatLng, latlng2: navermapsLib.naverNs.mapsNs.LatLng): scala.Double = js.native
}


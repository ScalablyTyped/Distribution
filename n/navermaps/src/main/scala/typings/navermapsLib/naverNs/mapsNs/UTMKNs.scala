package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.UTMK")
@js.native
object UTMKNs extends js.Object {
  var name: java.lang.String = js.native
  var pointPerMeter: scala.Double = js.native
  def fromCoordToPoint(latlng: navermapsLib.naverNs.mapsNs.LatLng): navermapsLib.naverNs.mapsNs.Point = js.native
  def fromCoordToUTMK(latlng: navermapsLib.naverNs.mapsNs.LatLng): navermapsLib.naverNs.mapsNs.Point = js.native
  def fromLatLngToPoint(latlng: navermapsLib.naverNs.mapsNs.LatLng): navermapsLib.naverNs.mapsNs.Point = js.native
  def fromLatLngToUTMK(latlng: navermapsLib.naverNs.mapsNs.LatLng): navermapsLib.naverNs.mapsNs.Point = js.native
  def fromPointToCoord(point: navermapsLib.naverNs.mapsNs.Point): navermapsLib.naverNs.mapsNs.LatLng = js.native
  def fromPointToLatLng(point: navermapsLib.naverNs.mapsNs.Point): navermapsLib.naverNs.mapsNs.LatLng = js.native
  def fromPointToUTMK(point: navermapsLib.naverNs.mapsNs.Point): navermapsLib.naverNs.mapsNs.Point = js.native
  def fromUTMKToCoord(utmk: navermapsLib.naverNs.mapsNs.Point): navermapsLib.naverNs.mapsNs.LatLng = js.native
  def fromUTMKToLatLng(utmk: navermapsLib.naverNs.mapsNs.Point): navermapsLib.naverNs.mapsNs.LatLng = js.native
  def fromUTMKToPoint(utmk: navermapsLib.naverNs.mapsNs.Point): navermapsLib.naverNs.mapsNs.Point = js.native
  def getDestinationCoord(fromLatLng: navermapsLib.naverNs.mapsNs.LatLng, angle: scala.Double, meter: scala.Double): navermapsLib.naverNs.mapsNs.LatLng = js.native
  def getDistance(latlng1: navermapsLib.naverNs.mapsNs.LatLng, latlng2: navermapsLib.naverNs.mapsNs.LatLng): scala.Double = js.native
}


package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.UTMK")
@js.native
object UTMKNs extends js.Object {
  var name: String = js.native
  var pointPerMeter: Double = js.native
  def fromCoordToPoint(latlng: LatLng): Point = js.native
  def fromCoordToUTMK(latlng: LatLng): Point = js.native
  def fromLatLngToPoint(latlng: LatLng): Point = js.native
  def fromLatLngToUTMK(latlng: LatLng): Point = js.native
  def fromPointToCoord(point: Point): LatLng = js.native
  def fromPointToLatLng(point: Point): LatLng = js.native
  def fromPointToUTMK(point: Point): Point = js.native
  def fromUTMKToCoord(utmk: Point): LatLng = js.native
  def fromUTMKToLatLng(utmk: Point): LatLng = js.native
  def fromUTMKToPoint(utmk: Point): Point = js.native
  def getDestinationCoord(fromLatLng: LatLng, angle: Double, meter: Double): LatLng = js.native
  def getDistance(latlng1: LatLng, latlng2: LatLng): Double = js.native
}


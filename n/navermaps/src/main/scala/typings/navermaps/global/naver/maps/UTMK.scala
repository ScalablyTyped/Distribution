package typings.navermaps.global.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.UTMK")
@js.native
object UTMK extends js.Object {
  var name: String = js.native
  var pointPerMeter: Double = js.native
  def apply(): Unit = js.native
  def fromCoordToPoint(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = js.native
  def fromCoordToUTMK(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = js.native
  def fromLatLngToPoint(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = js.native
  def fromLatLngToUTMK(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = js.native
  def fromPointToCoord(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  def fromPointToLatLng(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  def fromPointToUTMK(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def fromUTMKToCoord(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  def fromUTMKToLatLng(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  def fromUTMKToPoint(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def getDestinationCoord(fromLatLng: typings.navermaps.naver.maps.LatLng, angle: Double, meter: Double): typings.navermaps.naver.maps.LatLng = js.native
  def getDistance(latlng1: typings.navermaps.naver.maps.LatLng, latlng2: typings.navermaps.naver.maps.LatLng): Double = js.native
}


package typings.navermaps.global.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.UTMK_NAVER")
@js.native
object UTMK_NAVER extends js.Object {
  // extends UTMK
  var name: String = js.native
  var pointPerMeter: Double = js.native
  def apply(): Unit = js.native
  def fromCoordToNaver(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = js.native
  def fromLatLngToNaver(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = js.native
  def fromNaverToCoord(naverPoint: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  def fromNaverToLatLng(naverPoint: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  def fromNaverToPoint(naverPoint: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def fromNaverToUTMK(naverPoint: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def fromPointToNaver(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def fromUTMKToNaver(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
}


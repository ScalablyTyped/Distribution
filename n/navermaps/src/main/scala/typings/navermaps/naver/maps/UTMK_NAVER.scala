package typings.navermaps.naver.maps

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
  def fromCoordToNaver(latlng: LatLng): Point = js.native
  def fromLatLngToNaver(latlng: LatLng): Point = js.native
  def fromNaverToCoord(naverPoint: Point): LatLng = js.native
  def fromNaverToLatLng(naverPoint: Point): LatLng = js.native
  def fromNaverToPoint(naverPoint: Point): Point = js.native
  def fromNaverToUTMK(naverPoint: Point): Point = js.native
  def fromPointToNaver(point: Point): Point = js.native
  def fromUTMKToNaver(utmk: Point): Point = js.native
}


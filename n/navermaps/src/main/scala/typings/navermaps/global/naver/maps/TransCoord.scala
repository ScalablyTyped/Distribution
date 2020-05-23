package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.TransCoord")
@js.native
object TransCoord extends js.Object {
  def apply(): Unit = js.native
  def fromEPSG3857ToLatLng(coord: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  def fromEPSG3857ToNaver(coord: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def fromEPSG3857ToTM128(coord: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def fromEPSG3857ToUTMK(coord: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def fromLatLngToEPSG3857(latlng: Coord): typings.navermaps.naver.maps.Point = js.native
  def fromLatLngToNaver(latlng: Coord): typings.navermaps.naver.maps.Point = js.native
  def fromLatLngToTM128(latlng: Coord): typings.navermaps.naver.maps.Point = js.native
  def fromLatLngToUTMK(latlng: Coord): typings.navermaps.naver.maps.Point = js.native
  def fromNaverToEPSG3857(n: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def fromNaverToLatLng(n: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  def fromNaverToTM128(n: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def fromNaverToUTMK(n: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def fromTM128ToEPSG3857(tm128: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def fromTM128ToLatLng(tm128: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  def fromTM128ToNaver(tm128: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def fromTM128ToUTMK(tm128: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def fromUTMKToEPSG3857(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def fromUTMKToLatLng(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  def fromUTMKToNaver(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  def fromUTMKToTM128(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
}


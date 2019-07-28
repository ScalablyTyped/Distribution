package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.TransCoord")
@js.native
object TransCoordNs extends js.Object {
  def fromEPSG3857ToLatLng(coord: Point): LatLng = js.native
  def fromEPSG3857ToNaver(coord: Point): Point = js.native
  def fromEPSG3857ToTM128(coord: Point): Point = js.native
  def fromEPSG3857ToUTMK(coord: Point): Point = js.native
  def fromLatLngToEPSG3857(latlng: Coord): Point = js.native
  def fromLatLngToNaver(latlng: Coord): Point = js.native
  def fromLatLngToTM128(latlng: Coord): Point = js.native
  def fromLatLngToUTMK(latlng: Coord): Point = js.native
  def fromNaverToEPSG3857(n: Point): Point = js.native
  def fromNaverToLatLng(n: Point): LatLng = js.native
  def fromNaverToTM128(n: Point): Point = js.native
  def fromNaverToUTMK(n: Point): Point = js.native
  def fromTM128ToEPSG3857(tm128: Point): Point = js.native
  def fromTM128ToLatLng(tm128: Point): LatLng = js.native
  def fromTM128ToNaver(tm128: Point): Point = js.native
  def fromTM128ToUTMK(tm128: Point): Point = js.native
  def fromUTMKToEPSG3857(utmk: Point): Point = js.native
  def fromUTMKToLatLng(utmk: Point): LatLng = js.native
  def fromUTMKToNaver(utmk: Point): Point = js.native
  def fromUTMKToTM128(utmk: Point): Point = js.native
}


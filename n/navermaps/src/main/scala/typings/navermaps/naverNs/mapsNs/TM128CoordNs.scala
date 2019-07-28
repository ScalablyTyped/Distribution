package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.TM128Coord")
@js.native
object TM128CoordNs extends js.Object {
  // extends UTMK
  def fromCoordToLatLng(tm128: Point): LatLng = js.native
  def fromCoordToPoint(tm128: Point): Point = js.native
  def fromLatLngToCoord(latlng: Coord): Point = js.native
  def fromLatLngToTM128(latlng: Coord): Point = js.native
  def fromPointToCoord(point: Point): Point = js.native
  def fromPointToTM128(point: Point): Point = js.native
  def fromTM128ToLatLng(tm128: Point): LatLng = js.native
  def fromTM128ToPoint(tm128: Point): Point = js.native
  def fromTM128ToUTMK(tm128: Point): Point = js.native
  def fromUTMKToTM128(utmk: Point): Point = js.native
}


package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.UTMKCoord")
@js.native
object UTMKCoordNs extends js.Object {
  // extends UTMK
  def fromCoordToLatLng(utmk: Point): LatLng = js.native
  def fromCoordToPoint(utmk: Point): Point = js.native
  def fromLatLngToCoord(latlng: Coord): Point = js.native
  def fromPointToCoord(point: Point): Point = js.native
}


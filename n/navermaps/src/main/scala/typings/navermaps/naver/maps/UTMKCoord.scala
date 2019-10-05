package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.UTMKCoord")
@js.native
object UTMKCoord extends js.Object {
  def apply(): Unit = js.native
  // extends UTMK
  def fromCoordToLatLng(utmk: Point): LatLng = js.native
  def fromCoordToPoint(utmk: Point): Point = js.native
  def fromLatLngToCoord(latlng: Coord): Point = js.native
  def fromPointToCoord(point: Point): Point = js.native
}


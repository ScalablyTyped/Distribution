package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.UTMK_NAVERCoord")
@js.native
object UTMKNAVERCoord extends js.Object {
  def apply(): Unit = js.native
  // extends UTMK_NAVER
  def fromCoordToLatLng(n: Point): LatLng = js.native
  def fromCoordToPoint(n: Point): Point = js.native
  def fromLatLngToCoord(latlng: Coord): Point = js.native
  def fromPointToCoord(point: Point): Point = js.native
}


package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.TM128")
@js.native
object TM128 extends js.Object {
  def apply(): Unit = js.native
  // extends TM128Coord
  def fromCoordToPoint(latlng: Coord): Point = js.native
  def fromPointToCoord(point: Point): LatLng = js.native
}


package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.TM128")
@js.native
object TM128 extends js.Object {
  
  def apply(): Unit = js.native
  
  // extends TM128Coord
  def fromCoordToPoint(latlng: Coord): typings.navermaps.naver.maps.Point = js.native
  
  def fromPointToCoord(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
}

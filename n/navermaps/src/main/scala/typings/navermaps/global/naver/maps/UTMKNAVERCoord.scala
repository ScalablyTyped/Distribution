package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.UTMK_NAVERCoord")
@js.native
object UTMKNAVERCoord extends js.Object {
  
  def apply(): Unit = js.native
  
  // extends UTMK_NAVER
  def fromCoordToLatLng(n: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  
  def fromCoordToPoint(n: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  
  def fromLatLngToCoord(latlng: Coord): typings.navermaps.naver.maps.Point = js.native
  
  def fromPointToCoord(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
}

package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.UTMKCoord")
@js.native
object UTMKCoord extends js.Object {
  
  def apply(): Unit = js.native
  
  // extends UTMK
  def fromCoordToLatLng(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  
  def fromCoordToPoint(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  
  def fromLatLngToCoord(latlng: Coord): typings.navermaps.naver.maps.Point = js.native
  
  def fromPointToCoord(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
}

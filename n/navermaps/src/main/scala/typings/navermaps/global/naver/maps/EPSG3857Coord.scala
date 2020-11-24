package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.EPSG3857Coord")
@js.native
object EPSG3857Coord extends js.Object {
  
  def apply(): Unit = js.native
  
  def fromCoordToLatLng(coord: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  
  def fromCoordToPoint(coord: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  
  def fromEPSG3857ToLatLng(coord: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  
  def fromEPSG3857ToPoint(coord: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  
  def fromLatLngToCoord(coord: Coord): typings.navermaps.naver.maps.Point = js.native
  
  def fromLatLngToEPSG3857(coord: Coord): typings.navermaps.naver.maps.Point = js.native
  
  def fromPointToCoord(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  
  def fromPointToEPSG3857(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
}

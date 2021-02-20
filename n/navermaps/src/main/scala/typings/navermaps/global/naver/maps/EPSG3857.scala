package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EPSG3857 {
  
  // Projection
  @JSGlobal("naver.maps.EPSG3857")
  @js.native
  def apply(): Unit = js.native
  
  // implements Projection
  @JSGlobal("naver.maps.EPSG3857.fromCoordToPoint")
  @js.native
  def fromCoordToPoint(coord: Coord): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.EPSG3857.fromLatLngToPoint")
  @js.native
  def fromLatLngToPoint(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.EPSG3857.fromPointToCoord")
  @js.native
  def fromPointToCoord(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  
  @JSGlobal("naver.maps.EPSG3857.fromPointToLatLng")
  @js.native
  def fromPointToLatLng(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  
  @JSGlobal("naver.maps.EPSG3857.getDestinationCoord")
  @js.native
  def getDestinationCoord(fromLatLng: typings.navermaps.naver.maps.LatLng, angle: Double, meter: Double): typings.navermaps.naver.maps.LatLng = js.native
  
  @JSGlobal("naver.maps.EPSG3857.getDistance")
  @js.native
  def getDistance(latlng1: typings.navermaps.naver.maps.LatLng, latlng2: typings.navermaps.naver.maps.LatLng): Double = js.native
}

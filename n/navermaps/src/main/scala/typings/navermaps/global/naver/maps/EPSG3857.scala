package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EPSG3857 {
  
  // Projection
  @scala.inline
  def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSGlobal("naver.maps.EPSG3857")
  @js.native
  val ^ : js.Any = js.native
  
  // implements Projection
  @scala.inline
  def fromCoordToPoint(coord: Coord): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToPoint")(coord.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  @scala.inline
  def fromLatLngToPoint(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLngToPoint")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  @scala.inline
  def fromPointToCoord(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToCoord")(point.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.LatLng]
  
  @scala.inline
  def fromPointToLatLng(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToLatLng")(point.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.LatLng]
  
  @scala.inline
  def getDestinationCoord(fromLatLng: typings.navermaps.naver.maps.LatLng, angle: Double, meter: Double): typings.navermaps.naver.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("getDestinationCoord")(fromLatLng.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], meter.asInstanceOf[js.Any])).asInstanceOf[typings.navermaps.naver.maps.LatLng]
  
  @scala.inline
  def getDistance(latlng1: typings.navermaps.naver.maps.LatLng, latlng2: typings.navermaps.naver.maps.LatLng): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistance")(latlng1.asInstanceOf[js.Any], latlng2.asInstanceOf[js.Any])).asInstanceOf[Double]
}

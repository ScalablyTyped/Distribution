package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EPSG3857Coord {
  
  @scala.inline
  def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSGlobal("naver.maps.EPSG3857Coord")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromCoordToLatLng(coord: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToLatLng")(coord.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.LatLng]
  
  @scala.inline
  def fromCoordToPoint(coord: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToPoint")(coord.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  @scala.inline
  def fromEPSG3857ToLatLng(coord: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEPSG3857ToLatLng")(coord.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.LatLng]
  
  @scala.inline
  def fromEPSG3857ToPoint(coord: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEPSG3857ToPoint")(coord.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  @scala.inline
  def fromLatLngToCoord(coord: Coord): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLngToCoord")(coord.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  @scala.inline
  def fromLatLngToEPSG3857(coord: Coord): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLngToEPSG3857")(coord.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  @scala.inline
  def fromPointToCoord(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToCoord")(point.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  @scala.inline
  def fromPointToEPSG3857(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToEPSG3857")(point.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
}

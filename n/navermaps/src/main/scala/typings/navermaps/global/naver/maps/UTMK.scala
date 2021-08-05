package typings.navermaps.global.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UTMK {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSGlobal("naver.maps.UTMK")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCoordToPoint(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToPoint")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  inline def fromCoordToUTMK(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToUTMK")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  inline def fromLatLngToPoint(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLngToPoint")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  inline def fromLatLngToUTMK(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLngToUTMK")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  inline def fromPointToCoord(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToCoord")(point.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.LatLng]
  
  inline def fromPointToLatLng(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToLatLng")(point.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.LatLng]
  
  inline def fromPointToUTMK(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToUTMK")(point.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  inline def fromUTMKToCoord(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUTMKToCoord")(utmk.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.LatLng]
  
  inline def fromUTMKToLatLng(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUTMKToLatLng")(utmk.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.LatLng]
  
  inline def fromUTMKToPoint(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUTMKToPoint")(utmk.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  inline def getDestinationCoord(fromLatLng: typings.navermaps.naver.maps.LatLng, angle: Double, meter: Double): typings.navermaps.naver.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("getDestinationCoord")(fromLatLng.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], meter.asInstanceOf[js.Any])).asInstanceOf[typings.navermaps.naver.maps.LatLng]
  
  inline def getDistance(latlng1: typings.navermaps.naver.maps.LatLng, latlng2: typings.navermaps.naver.maps.LatLng): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistance")(latlng1.asInstanceOf[js.Any], latlng2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSGlobal("naver.maps.UTMK.name")
  @js.native
  def name: String = js.native
  inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  
  @JSGlobal("naver.maps.UTMK.pointPerMeter")
  @js.native
  def pointPerMeter: Double = js.native
  inline def pointPerMeter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointPerMeter")(x.asInstanceOf[js.Any])
}

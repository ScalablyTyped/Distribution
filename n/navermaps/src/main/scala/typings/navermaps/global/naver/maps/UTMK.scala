package typings.navermaps.global.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UTMK {
  
  @JSGlobal("naver.maps.UTMK")
  @js.native
  def apply(): Unit = js.native
  @JSGlobal("naver.maps.UTMK")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("naver.maps.UTMK.fromCoordToPoint")
  @js.native
  def fromCoordToPoint(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.UTMK.fromCoordToUTMK")
  @js.native
  def fromCoordToUTMK(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.UTMK.fromLatLngToPoint")
  @js.native
  def fromLatLngToPoint(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.UTMK.fromLatLngToUTMK")
  @js.native
  def fromLatLngToUTMK(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.UTMK.fromPointToCoord")
  @js.native
  def fromPointToCoord(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  
  @JSGlobal("naver.maps.UTMK.fromPointToLatLng")
  @js.native
  def fromPointToLatLng(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  
  @JSGlobal("naver.maps.UTMK.fromPointToUTMK")
  @js.native
  def fromPointToUTMK(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.UTMK.fromUTMKToCoord")
  @js.native
  def fromUTMKToCoord(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  
  @JSGlobal("naver.maps.UTMK.fromUTMKToLatLng")
  @js.native
  def fromUTMKToLatLng(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  
  @JSGlobal("naver.maps.UTMK.fromUTMKToPoint")
  @js.native
  def fromUTMKToPoint(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.UTMK.getDestinationCoord")
  @js.native
  def getDestinationCoord(fromLatLng: typings.navermaps.naver.maps.LatLng, angle: Double, meter: Double): typings.navermaps.naver.maps.LatLng = js.native
  
  @JSGlobal("naver.maps.UTMK.getDistance")
  @js.native
  def getDistance(latlng1: typings.navermaps.naver.maps.LatLng, latlng2: typings.navermaps.naver.maps.LatLng): Double = js.native
  
  @JSGlobal("naver.maps.UTMK.name")
  @js.native
  def name: String = js.native
  @scala.inline
  def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  
  @JSGlobal("naver.maps.UTMK.pointPerMeter")
  @js.native
  def pointPerMeter: Double = js.native
  @scala.inline
  def pointPerMeter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointPerMeter")(x.asInstanceOf[js.Any])
}

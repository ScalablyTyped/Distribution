package typings.navermaps.global.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UTMK_NAVER {
  
  @JSGlobal("naver.maps.UTMK_NAVER")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCoordToNaver(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToNaver")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  inline def fromLatLngToNaver(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLngToNaver")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  inline def fromNaverToCoord(naverPoint: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNaverToCoord")(naverPoint.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.LatLng]
  
  inline def fromNaverToLatLng(naverPoint: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNaverToLatLng")(naverPoint.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.LatLng]
  
  inline def fromNaverToPoint(naverPoint: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNaverToPoint")(naverPoint.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  inline def fromNaverToUTMK(naverPoint: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNaverToUTMK")(naverPoint.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  inline def fromPointToNaver(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToNaver")(point.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  inline def fromUTMKToNaver(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUTMKToNaver")(utmk.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  @JSGlobal("naver.maps.UTMK_NAVER.name")
  @js.native
  val name: String = js.native
  
  @JSGlobal("naver.maps.UTMK_NAVER.pointPerMeter")
  @js.native
  val pointPerMeter: Double = js.native
}

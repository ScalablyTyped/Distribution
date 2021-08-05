package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UTMKNAVERCoord {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSGlobal("naver.maps.UTMK_NAVERCoord")
  @js.native
  val ^ : js.Any = js.native
  
  // extends UTMK_NAVER
  inline def fromCoordToLatLng(n: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToLatLng")(n.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.LatLng]
  
  inline def fromCoordToPoint(n: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToPoint")(n.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  inline def fromLatLngToCoord(latlng: Coord): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLngToCoord")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  inline def fromPointToCoord(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToCoord")(point.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
}

package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UTMKNAVERCoord {
  
  @scala.inline
  def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSGlobal("naver.maps.UTMK_NAVERCoord")
  @js.native
  val ^ : js.Any = js.native
  
  // extends UTMK_NAVER
  @scala.inline
  def fromCoordToLatLng(n: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToLatLng")(n.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.LatLng]
  
  @scala.inline
  def fromCoordToPoint(n: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToPoint")(n.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  @scala.inline
  def fromLatLngToCoord(latlng: Coord): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLngToCoord")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
  
  @scala.inline
  def fromPointToCoord(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToCoord")(point.asInstanceOf[js.Any]).asInstanceOf[typings.navermaps.naver.maps.Point]
}

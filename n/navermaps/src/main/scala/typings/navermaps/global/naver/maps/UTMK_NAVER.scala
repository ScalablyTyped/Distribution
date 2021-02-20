package typings.navermaps.global.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UTMK_NAVER {
  
  @JSGlobal("naver.maps.UTMK_NAVER")
  @js.native
  def apply(): Unit = js.native
  @JSGlobal("naver.maps.UTMK_NAVER")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("naver.maps.UTMK_NAVER.fromCoordToNaver")
  @js.native
  def fromCoordToNaver(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.UTMK_NAVER.fromLatLngToNaver")
  @js.native
  def fromLatLngToNaver(latlng: typings.navermaps.naver.maps.LatLng): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.UTMK_NAVER.fromNaverToCoord")
  @js.native
  def fromNaverToCoord(naverPoint: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  
  @JSGlobal("naver.maps.UTMK_NAVER.fromNaverToLatLng")
  @js.native
  def fromNaverToLatLng(naverPoint: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  
  @JSGlobal("naver.maps.UTMK_NAVER.fromNaverToPoint")
  @js.native
  def fromNaverToPoint(naverPoint: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.UTMK_NAVER.fromNaverToUTMK")
  @js.native
  def fromNaverToUTMK(naverPoint: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.UTMK_NAVER.fromPointToNaver")
  @js.native
  def fromPointToNaver(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.UTMK_NAVER.fromUTMKToNaver")
  @js.native
  def fromUTMKToNaver(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  
  // extends UTMK
  @JSGlobal("naver.maps.UTMK_NAVER.name")
  @js.native
  def name: String = js.native
  @scala.inline
  def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  
  @JSGlobal("naver.maps.UTMK_NAVER.pointPerMeter")
  @js.native
  def pointPerMeter: Double = js.native
  @scala.inline
  def pointPerMeter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointPerMeter")(x.asInstanceOf[js.Any])
}

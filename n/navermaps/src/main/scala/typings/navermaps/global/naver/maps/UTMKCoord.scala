package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UTMKCoord {
  
  @JSGlobal("naver.maps.UTMKCoord")
  @js.native
  def apply(): Unit = js.native
  
  // extends UTMK
  @JSGlobal("naver.maps.UTMKCoord.fromCoordToLatLng")
  @js.native
  def fromCoordToLatLng(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
  
  @JSGlobal("naver.maps.UTMKCoord.fromCoordToPoint")
  @js.native
  def fromCoordToPoint(utmk: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.UTMKCoord.fromLatLngToCoord")
  @js.native
  def fromLatLngToCoord(latlng: Coord): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.UTMKCoord.fromPointToCoord")
  @js.native
  def fromPointToCoord(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.Point = js.native
}

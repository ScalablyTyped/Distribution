package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TM128 {
  
  @JSGlobal("naver.maps.TM128")
  @js.native
  def apply(): Unit = js.native
  
  // extends TM128Coord
  @JSGlobal("naver.maps.TM128.fromCoordToPoint")
  @js.native
  def fromCoordToPoint(latlng: Coord): typings.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.TM128.fromPointToCoord")
  @js.native
  def fromPointToCoord(point: typings.navermaps.naver.maps.Point): typings.navermaps.naver.maps.LatLng = js.native
}

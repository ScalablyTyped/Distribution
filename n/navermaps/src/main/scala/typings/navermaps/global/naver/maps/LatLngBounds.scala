package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import typings.navermaps.naver.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.LatLngBounds")
@js.native
class LatLngBounds protected ()
  extends StObject
     with typings.navermaps.naver.maps.LatLngBounds {
  def this(sw: typings.navermaps.naver.maps.LatLng, ne: typings.navermaps.naver.maps.LatLng) = this()
}
object LatLngBounds {
  
  @JSGlobal("naver.maps.LatLngBounds")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def bounds(latlng: Coord, latlngN: Coord): typings.navermaps.naver.maps.LatLngBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(latlng.asInstanceOf[js.Any], latlngN.asInstanceOf[js.Any])).asInstanceOf[typings.navermaps.naver.maps.LatLngBounds]
  @scala.inline
  def bounds(latlng: Coord, latlngN: LatLngLiteral): typings.navermaps.naver.maps.LatLngBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(latlng.asInstanceOf[js.Any], latlngN.asInstanceOf[js.Any])).asInstanceOf[typings.navermaps.naver.maps.LatLngBounds]
  @scala.inline
  def bounds(latlng: LatLngLiteral, latlngN: Coord): typings.navermaps.naver.maps.LatLngBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(latlng.asInstanceOf[js.Any], latlngN.asInstanceOf[js.Any])).asInstanceOf[typings.navermaps.naver.maps.LatLngBounds]
  @scala.inline
  def bounds(latlng: LatLngLiteral, latlngN: LatLngLiteral): typings.navermaps.naver.maps.LatLngBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(latlng.asInstanceOf[js.Any], latlngN.asInstanceOf[js.Any])).asInstanceOf[typings.navermaps.naver.maps.LatLngBounds]
}

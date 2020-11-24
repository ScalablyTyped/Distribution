package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Coord
import typings.navermaps.naver.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.LatLngBounds")
@js.native
class LatLngBounds protected ()
  extends typings.navermaps.naver.maps.LatLngBounds {
  def this(sw: typings.navermaps.naver.maps.LatLng, ne: typings.navermaps.naver.maps.LatLng) = this()
}
/* static members */
@JSGlobal("naver.maps.LatLngBounds")
@js.native
object LatLngBounds extends js.Object {
  
  def bounds(latlng: Coord, latlngN: Coord): typings.navermaps.naver.maps.LatLngBounds = js.native
  def bounds(latlng: Coord, latlngN: LatLngLiteral): typings.navermaps.naver.maps.LatLngBounds = js.native
  def bounds(latlng: LatLngLiteral, latlngN: Coord): typings.navermaps.naver.maps.LatLngBounds = js.native
  def bounds(latlng: LatLngLiteral, latlngN: LatLngLiteral): typings.navermaps.naver.maps.LatLngBounds = js.native
}

package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.navermaps.naverNs.mapsNs.Bounds because Already inherited */ @JSGlobal("naver.maps.LatLngBounds")
@js.native
class LatLngBounds protected () extends PointBounds {
  def this(sw: LatLng, ne: LatLng) = this()
  def east(): Double = js.native
  def getNE(): LatLng = js.native
  def getSW(): LatLng = js.native
  def hasLatLng(latlng: Coord): Boolean = js.native
  def hasLatLng(latlng: LatLngLiteral): Boolean = js.native
  def north(): Double = js.native
  def south(): Double = js.native
  def toPointBounds(): PointBounds = js.native
  def west(): Double = js.native
}

/* static members */
@JSGlobal("naver.maps.LatLngBounds")
@js.native
object LatLngBounds extends js.Object {
  def bounds(latlng: Coord, latlngN: Coord): LatLngBounds = js.native
  def bounds(latlng: Coord, latlngN: LatLngLiteral): LatLngBounds = js.native
  def bounds(latlng: LatLngLiteral, latlngN: Coord): LatLngBounds = js.native
  def bounds(latlng: LatLngLiteral, latlngN: LatLngLiteral): LatLngBounds = js.native
}


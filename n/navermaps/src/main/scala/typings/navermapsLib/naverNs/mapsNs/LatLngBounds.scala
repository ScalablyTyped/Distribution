package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.LatLngBounds")
@js.native
class LatLngBounds protected () extends PointBounds {
  def this(sw: LatLng, ne: LatLng) = this()
  def east(): scala.Double = js.native
  def getNE(): LatLng = js.native
  def getSW(): LatLng = js.native
  def hasLatLng(latlng: Coord | LatLngLiteral): scala.Boolean = js.native
  def north(): scala.Double = js.native
  def south(): scala.Double = js.native
  def toPointBounds(): PointBounds = js.native
  def west(): scala.Double = js.native
}

@JSGlobal("naver.maps.LatLngBounds")
@js.native
object LatLngBounds extends js.Object {
  def bounds(
    latlng: navermapsLib.naverNs.mapsNs.Coord | navermapsLib.naverNs.mapsNs.LatLngLiteral,
    latlngN: navermapsLib.naverNs.mapsNs.Coord | navermapsLib.naverNs.mapsNs.LatLngLiteral
  ): navermapsLib.naverNs.mapsNs.LatLngBounds = js.native
}


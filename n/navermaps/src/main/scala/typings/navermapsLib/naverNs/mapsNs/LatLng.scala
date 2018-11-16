package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.LatLng")
@js.native
class LatLng protected () extends Point {
  def this(lat: scala.Double, lng: scala.Double) = this()
  def destinationPoint(angle: scala.Double, meter: scala.Double): LatLng = js.native
  def equals(point: Coord | LatLngLiteral): scala.Boolean = js.native
  def lat(): scala.Double = js.native
  def lng(): scala.Double = js.native
  def toPoint(): Point = js.native
}


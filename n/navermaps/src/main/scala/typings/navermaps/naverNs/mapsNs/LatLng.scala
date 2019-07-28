package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.navermaps.naverNs.mapsNs.Coord because Already inherited */ @JSGlobal("naver.maps.LatLng")
@js.native
class LatLng protected () extends Point {
  def this(lat: Double, lng: Double) = this()
  def destinationPoint(angle: Double, meter: Double): LatLng = js.native
  def equals(point: Coord): Boolean = js.native
  def equals(point: LatLngLiteral): Boolean = js.native
  def lat(): Double = js.native
  def lng(): Double = js.native
  def toPoint(): Point = js.native
}


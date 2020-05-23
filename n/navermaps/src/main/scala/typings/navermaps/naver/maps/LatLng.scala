package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.navermaps.naver.maps.Coord because Already inherited */ @js.native
trait LatLng extends Point {
  def destinationPoint(angle: Double, meter: Double): LatLng = js.native
  def equals(point: Coord): Boolean = js.native
  def equals(point: LatLngLiteral): Boolean = js.native
  def lat(): Double = js.native
  def lng(): Double = js.native
  def toPoint(): Point = js.native
}


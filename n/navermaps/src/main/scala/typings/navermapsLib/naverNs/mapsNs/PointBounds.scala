package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.PointBounds")
@js.native
class PointBounds protected () extends js.Object {
  def this(minPoint: Point, maxPoint: Point) = this()
  def equals(bounds: Bounds | PointBoundsLiteral): scala.Boolean = js.native
  def extend(point: Coord | PointLiteral): PointBounds = js.native
  def getCenter(): Point = js.native
  def getMax(): Point = js.native
  def getMin(): Point = js.native
  def hasBounds(bounds: Bounds | PointBoundsLiteral): scala.Boolean = js.native
  def hasPoint(point: Coord | PointLiteral): scala.Boolean = js.native
  def intersects(bounds: Bounds | PointBoundsLiteral): scala.Boolean = js.native
  def maxX(): scala.Double = js.native
  def maxY(): scala.Double = js.native
  def minX(): scala.Double = js.native
  def minY(): scala.Double = js.native
  def union(bounds: Bounds | PointBoundsLiteral): PointBounds = js.native
}

/* static members */
@JSGlobal("naver.maps.PointBounds")
@js.native
object PointBounds extends js.Object {
  def bounds(
    point: navermapsLib.naverNs.mapsNs.Coord | navermapsLib.naverNs.mapsNs.PointLiteral,
    pointN: navermapsLib.naverNs.mapsNs.Coord | navermapsLib.naverNs.mapsNs.PointLiteral
  ): navermapsLib.naverNs.mapsNs.PointBounds = js.native
}


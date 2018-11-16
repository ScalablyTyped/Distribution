package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.SkeletonBounds")
@js.native
class SkeletonBounds () extends js.Object {
  var boundingBoxes: js.Array[BoundingBoxAttachment] = js.native
  var maxX: scala.Double = js.native
  var maxY: scala.Double = js.native
  var minX: scala.Double = js.native
  var minY: scala.Double = js.native
  var polygonPool: js.Any = js.native
  var polygons: js.Array[ArrayLike[scala.Double]] = js.native
  def aabbCompute(): scala.Unit = js.native
  def aabbContainsPoint(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def aabbIntersectsSegment(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Boolean = js.native
  def aabbIntersectsSkeleton(bounds: SkeletonBounds): scala.Boolean = js.native
  def containsPoint(x: scala.Double, y: scala.Double): BoundingBoxAttachment = js.native
  def containsPointPolygon(polygon: ArrayLike[scala.Double], x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def getHeight(): scala.Double = js.native
  def getPolygon(boundingBox: BoundingBoxAttachment): ArrayLike[scala.Double] = js.native
  def getWidth(): scala.Double = js.native
  def intersectsSegment(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): BoundingBoxAttachment = js.native
  def intersectsSegmentPolygon(
    polygon: ArrayLike[scala.Double],
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double
  ): scala.Boolean = js.native
  def update(skeleton: Skeleton, updateAabb: scala.Boolean): scala.Unit = js.native
}


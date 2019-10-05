package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.SkeletonBounds")
@js.native
class SkeletonBounds () extends js.Object {
  var boundingBoxes: js.Array[BoundingBoxAttachment] = js.native
  var maxX: Double = js.native
  var maxY: Double = js.native
  var minX: Double = js.native
  var minY: Double = js.native
  var polygonPool: js.Any = js.native
  var polygons: js.Array[ArrayLike[Double]] = js.native
  def aabbCompute(): Unit = js.native
  def aabbContainsPoint(x: Double, y: Double): Boolean = js.native
  def aabbIntersectsSegment(x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  def aabbIntersectsSkeleton(bounds: SkeletonBounds): Boolean = js.native
  def containsPoint(x: Double, y: Double): BoundingBoxAttachment = js.native
  def containsPointPolygon(polygon: ArrayLike[Double], x: Double, y: Double): Boolean = js.native
  def getHeight(): Double = js.native
  def getPolygon(boundingBox: BoundingBoxAttachment): ArrayLike[Double] = js.native
  def getWidth(): Double = js.native
  def intersectsSegment(x1: Double, y1: Double, x2: Double, y2: Double): BoundingBoxAttachment = js.native
  def intersectsSegmentPolygon(polygon: ArrayLike[Double], x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  def update(skeleton: Skeleton, updateAabb: Boolean): Unit = js.native
}


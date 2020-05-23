package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonBounds extends js.Object {
  var boundingBoxes: js.Array[BoundingBoxAttachment]
  var maxX: Double
  var maxY: Double
  var minX: Double
  var minY: Double
  var polygonPool: js.Any
  var polygons: js.Array[ArrayLike[Double]]
  def aabbCompute(): Unit
  def aabbContainsPoint(x: Double, y: Double): Boolean
  def aabbIntersectsSegment(x1: Double, y1: Double, x2: Double, y2: Double): Boolean
  def aabbIntersectsSkeleton(bounds: SkeletonBounds): Boolean
  def containsPoint(x: Double, y: Double): BoundingBoxAttachment
  def containsPointPolygon(polygon: ArrayLike[Double], x: Double, y: Double): Boolean
  def getHeight(): Double
  def getPolygon(boundingBox: BoundingBoxAttachment): ArrayLike[Double]
  def getWidth(): Double
  def intersectsSegment(x1: Double, y1: Double, x2: Double, y2: Double): BoundingBoxAttachment
  def intersectsSegmentPolygon(polygon: ArrayLike[Double], x1: Double, y1: Double, x2: Double, y2: Double): Boolean
  def update(skeleton: Skeleton, updateAabb: Boolean): Unit
}

object SkeletonBounds {
  @scala.inline
  def apply(
    aabbCompute: () => Unit,
    aabbContainsPoint: (Double, Double) => Boolean,
    aabbIntersectsSegment: (Double, Double, Double, Double) => Boolean,
    aabbIntersectsSkeleton: SkeletonBounds => Boolean,
    boundingBoxes: js.Array[BoundingBoxAttachment],
    containsPoint: (Double, Double) => BoundingBoxAttachment,
    containsPointPolygon: (ArrayLike[Double], Double, Double) => Boolean,
    getHeight: () => Double,
    getPolygon: BoundingBoxAttachment => ArrayLike[Double],
    getWidth: () => Double,
    intersectsSegment: (Double, Double, Double, Double) => BoundingBoxAttachment,
    intersectsSegmentPolygon: (ArrayLike[Double], Double, Double, Double, Double) => Boolean,
    maxX: Double,
    maxY: Double,
    minX: Double,
    minY: Double,
    polygonPool: js.Any,
    polygons: js.Array[ArrayLike[Double]],
    update: (Skeleton, Boolean) => Unit
  ): SkeletonBounds = {
    val __obj = js.Dynamic.literal(aabbCompute = js.Any.fromFunction0(aabbCompute), aabbContainsPoint = js.Any.fromFunction2(aabbContainsPoint), aabbIntersectsSegment = js.Any.fromFunction4(aabbIntersectsSegment), aabbIntersectsSkeleton = js.Any.fromFunction1(aabbIntersectsSkeleton), boundingBoxes = boundingBoxes.asInstanceOf[js.Any], containsPoint = js.Any.fromFunction2(containsPoint), containsPointPolygon = js.Any.fromFunction3(containsPointPolygon), getHeight = js.Any.fromFunction0(getHeight), getPolygon = js.Any.fromFunction1(getPolygon), getWidth = js.Any.fromFunction0(getWidth), intersectsSegment = js.Any.fromFunction4(intersectsSegment), intersectsSegmentPolygon = js.Any.fromFunction5(intersectsSegmentPolygon), maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], polygonPool = polygonPool.asInstanceOf[js.Any], polygons = polygons.asInstanceOf[js.Any], update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[SkeletonBounds]
  }
}


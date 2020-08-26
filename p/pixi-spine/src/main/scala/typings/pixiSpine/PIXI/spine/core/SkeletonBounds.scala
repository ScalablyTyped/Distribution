package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonBounds extends js.Object {
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
  @scala.inline
  implicit class SkeletonBoundsOps[Self <: SkeletonBounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAabbCompute(value: () => Unit): Self = this.set("aabbCompute", js.Any.fromFunction0(value))
    @scala.inline
    def setAabbContainsPoint(value: (Double, Double) => Boolean): Self = this.set("aabbContainsPoint", js.Any.fromFunction2(value))
    @scala.inline
    def setAabbIntersectsSegment(value: (Double, Double, Double, Double) => Boolean): Self = this.set("aabbIntersectsSegment", js.Any.fromFunction4(value))
    @scala.inline
    def setAabbIntersectsSkeleton(value: SkeletonBounds => Boolean): Self = this.set("aabbIntersectsSkeleton", js.Any.fromFunction1(value))
    @scala.inline
    def setBoundingBoxesVarargs(value: BoundingBoxAttachment*): Self = this.set("boundingBoxes", js.Array(value :_*))
    @scala.inline
    def setBoundingBoxes(value: js.Array[BoundingBoxAttachment]): Self = this.set("boundingBoxes", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainsPoint(value: (Double, Double) => BoundingBoxAttachment): Self = this.set("containsPoint", js.Any.fromFunction2(value))
    @scala.inline
    def setContainsPointPolygon(value: (ArrayLike[Double], Double, Double) => Boolean): Self = this.set("containsPointPolygon", js.Any.fromFunction3(value))
    @scala.inline
    def setGetHeight(value: () => Double): Self = this.set("getHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPolygon(value: BoundingBoxAttachment => ArrayLike[Double]): Self = this.set("getPolygon", js.Any.fromFunction1(value))
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setIntersectsSegment(value: (Double, Double, Double, Double) => BoundingBoxAttachment): Self = this.set("intersectsSegment", js.Any.fromFunction4(value))
    @scala.inline
    def setIntersectsSegmentPolygon(value: (ArrayLike[Double], Double, Double, Double, Double) => Boolean): Self = this.set("intersectsSegmentPolygon", js.Any.fromFunction5(value))
    @scala.inline
    def setMaxX(value: Double): Self = this.set("maxX", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxY(value: Double): Self = this.set("maxY", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinX(value: Double): Self = this.set("minX", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinY(value: Double): Self = this.set("minY", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolygonPool(value: js.Any): Self = this.set("polygonPool", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolygonsVarargs(value: ArrayLike[Double]*): Self = this.set("polygons", js.Array(value :_*))
    @scala.inline
    def setPolygons(value: js.Array[ArrayLike[Double]]): Self = this.set("polygons", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: (Skeleton, Boolean) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
  }
  
}


package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkeletonBounds extends StObject {
  
  def aabbCompute(): Unit
  
  def aabbContainsPoint(x: Double, y: Double): Boolean
  
  def aabbIntersectsSegment(x1: Double, y1: Double, x2: Double, y2: Double): Boolean
  
  def aabbIntersectsSkeleton(bounds: SkeletonBounds): Boolean
  
  var boundingBoxes: js.Array[BoundingBoxAttachment]
  
  def containsPoint(x: Double, y: Double): BoundingBoxAttachment
  
  def containsPointPolygon(polygon: ArrayLike[Double], x: Double, y: Double): Boolean
  
  def getHeight(): Double
  
  def getPolygon(boundingBox: BoundingBoxAttachment): ArrayLike[Double]
  
  def getWidth(): Double
  
  def intersectsSegment(x1: Double, y1: Double, x2: Double, y2: Double): BoundingBoxAttachment
  
  def intersectsSegmentPolygon(polygon: ArrayLike[Double], x1: Double, y1: Double, x2: Double, y2: Double): Boolean
  
  var maxX: Double
  
  var maxY: Double
  
  var minX: Double
  
  var minY: Double
  
  /* private */ var polygonPool: js.Any
  
  var polygons: js.Array[ArrayLike[Double]]
  
  def update(skeleton: Skeleton, updateAabb: Boolean): Unit
}
object SkeletonBounds {
  
  inline def apply(
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
  
  extension [Self <: SkeletonBounds](x: Self) {
    
    inline def setAabbCompute(value: () => Unit): Self = StObject.set(x, "aabbCompute", js.Any.fromFunction0(value))
    
    inline def setAabbContainsPoint(value: (Double, Double) => Boolean): Self = StObject.set(x, "aabbContainsPoint", js.Any.fromFunction2(value))
    
    inline def setAabbIntersectsSegment(value: (Double, Double, Double, Double) => Boolean): Self = StObject.set(x, "aabbIntersectsSegment", js.Any.fromFunction4(value))
    
    inline def setAabbIntersectsSkeleton(value: SkeletonBounds => Boolean): Self = StObject.set(x, "aabbIntersectsSkeleton", js.Any.fromFunction1(value))
    
    inline def setBoundingBoxes(value: js.Array[BoundingBoxAttachment]): Self = StObject.set(x, "boundingBoxes", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxesVarargs(value: BoundingBoxAttachment*): Self = StObject.set(x, "boundingBoxes", js.Array(value :_*))
    
    inline def setContainsPoint(value: (Double, Double) => BoundingBoxAttachment): Self = StObject.set(x, "containsPoint", js.Any.fromFunction2(value))
    
    inline def setContainsPointPolygon(value: (ArrayLike[Double], Double, Double) => Boolean): Self = StObject.set(x, "containsPointPolygon", js.Any.fromFunction3(value))
    
    inline def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
    
    inline def setGetPolygon(value: BoundingBoxAttachment => ArrayLike[Double]): Self = StObject.set(x, "getPolygon", js.Any.fromFunction1(value))
    
    inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    inline def setIntersectsSegment(value: (Double, Double, Double, Double) => BoundingBoxAttachment): Self = StObject.set(x, "intersectsSegment", js.Any.fromFunction4(value))
    
    inline def setIntersectsSegmentPolygon(value: (ArrayLike[Double], Double, Double, Double, Double) => Boolean): Self = StObject.set(x, "intersectsSegmentPolygon", js.Any.fromFunction5(value))
    
    inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
    
    inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
    
    inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
    
    inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    
    inline def setPolygonPool(value: js.Any): Self = StObject.set(x, "polygonPool", value.asInstanceOf[js.Any])
    
    inline def setPolygons(value: js.Array[ArrayLike[Double]]): Self = StObject.set(x, "polygons", value.asInstanceOf[js.Any])
    
    inline def setPolygonsVarargs(value: ArrayLike[Double]*): Self = StObject.set(x, "polygons", js.Array(value :_*))
    
    inline def setUpdate(value: (Skeleton, Boolean) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}

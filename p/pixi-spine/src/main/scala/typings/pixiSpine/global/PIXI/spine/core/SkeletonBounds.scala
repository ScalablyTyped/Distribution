package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.SkeletonBounds")
@js.native
class SkeletonBounds ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.SkeletonBounds {
  
  /* CompleteClass */
  override def aabbCompute(): Unit = js.native
  
  /* CompleteClass */
  override def aabbContainsPoint(x: Double, y: Double): Boolean = js.native
  
  /* CompleteClass */
  override def aabbIntersectsSegment(x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  
  /* CompleteClass */
  override def aabbIntersectsSkeleton(bounds: typings.pixiSpine.PIXI.spine.core.SkeletonBounds): Boolean = js.native
  
  /* CompleteClass */
  var boundingBoxes: js.Array[typings.pixiSpine.PIXI.spine.core.BoundingBoxAttachment] = js.native
  
  /* CompleteClass */
  override def containsPoint(x: Double, y: Double): typings.pixiSpine.PIXI.spine.core.BoundingBoxAttachment = js.native
  
  /* CompleteClass */
  override def containsPointPolygon(polygon: ArrayLike[Double], x: Double, y: Double): Boolean = js.native
  
  /* CompleteClass */
  override def getHeight(): Double = js.native
  
  /* CompleteClass */
  override def getPolygon(boundingBox: typings.pixiSpine.PIXI.spine.core.BoundingBoxAttachment): ArrayLike[Double] = js.native
  
  /* CompleteClass */
  override def getWidth(): Double = js.native
  
  /* CompleteClass */
  override def intersectsSegment(x1: Double, y1: Double, x2: Double, y2: Double): typings.pixiSpine.PIXI.spine.core.BoundingBoxAttachment = js.native
  
  /* CompleteClass */
  override def intersectsSegmentPolygon(polygon: ArrayLike[Double], x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  
  /* CompleteClass */
  var maxX: Double = js.native
  
  /* CompleteClass */
  var maxY: Double = js.native
  
  /* CompleteClass */
  var minX: Double = js.native
  
  /* CompleteClass */
  var minY: Double = js.native
  
  /* private */ /* CompleteClass */
  var polygonPool: js.Any = js.native
  
  /* CompleteClass */
  var polygons: js.Array[ArrayLike[Double]] = js.native
  
  /* CompleteClass */
  override def update(skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton, updateAabb: Boolean): Unit = js.native
}

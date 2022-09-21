package typings.pixiSpineRuntime38.mod

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "SkeletonBounds")
@js.native
open class SkeletonBounds () extends StObject {
  
  def aabbCompute(): Unit = js.native
  
  /** Returns true if the axis aligned bounding box contains the point. */
  def aabbContainsPoint(x: Double, y: Double): Boolean = js.native
  
  /** Returns true if the axis aligned bounding box intersects the line segment. */
  def aabbIntersectsSegment(x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  
  /** Returns true if the axis aligned bounding box intersects the axis aligned bounding box of the specified bounds. */
  def aabbIntersectsSkeleton(bounds: SkeletonBounds): Boolean = js.native
  
  var boundingBoxes: js.Array[BoundingBoxAttachment] = js.native
  
  /** Returns the first bounding box attachment that contains the point, or null. When doing many checks, it is usually more
    * efficient to only call this method if {@link #aabbContainsPoint(float, float)} returns true. */
  def containsPoint(x: Double, y: Double): BoundingBoxAttachment = js.native
  
  /** Returns true if the polygon contains the point. */
  def containsPointPolygon(polygon: ArrayLike[Double], x: Double, y: Double): Boolean = js.native
  
  def getHeight(): Double = js.native
  
  /** Returns the polygon for the specified bounding box, or null. */
  def getPolygon(boundingBox: BoundingBoxAttachment): ArrayLike[Double] = js.native
  
  def getWidth(): Double = js.native
  
  /** Returns the first bounding box attachment that contains any part of the line segment, or null. When doing many checks, it
    * is usually more efficient to only call this method if {@link #aabbIntersectsSegment(float, float, float, float)} returns
    * true. */
  def intersectsSegment(x1: Double, y1: Double, x2: Double, y2: Double): BoundingBoxAttachment = js.native
  
  /** Returns true if the polygon contains any part of the line segment. */
  def intersectsSegmentPolygon(polygon: ArrayLike[Double], x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  
  var maxX: Double = js.native
  
  var maxY: Double = js.native
  
  var minX: Double = js.native
  
  var minY: Double = js.native
  
  /* private */ var polygonPool: Any = js.native
  
  var polygons: js.Array[ArrayLike[Double]] = js.native
  
  def update(skeleton: Skeleton, updateAabb: Boolean): Unit = js.native
}

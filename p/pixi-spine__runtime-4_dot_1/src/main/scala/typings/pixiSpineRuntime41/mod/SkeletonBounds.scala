package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.NumberArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "SkeletonBounds")
@js.native
open class SkeletonBounds () extends StObject {
  
  def aabbCompute(): Unit = js.native
  
  /** Returns true if the axis aligned bounding box contains the point. */
  def aabbContainsPoint(x: Double, y: Double): Boolean = js.native
  
  /** Returns true if the axis aligned bounding box intersects the line segment. */
  def aabbIntersectsSegment(x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  
  /** Returns true if the axis aligned bounding box intersects the axis aligned bounding box of the specified bounds. */
  def aabbIntersectsSkeleton(bounds: SkeletonBounds): Boolean = js.native
  
  /** The visible bounding boxes. */
  var boundingBoxes: js.Array[BoundingBoxAttachment] = js.native
  
  /** Returns the first bounding box attachment that contains the point, or null. When doing many checks, it is usually more
    * efficient to only call this method if {@link #aabbContainsPoint(float, float)} returns true. */
  def containsPoint(x: Double, y: Double): BoundingBoxAttachment | Null = js.native
  
  /** Returns true if the polygon contains the point. */
  def containsPointPolygon(polygon: NumberArrayLike, x: Double, y: Double): Boolean = js.native
  
  /** The height of the axis aligned bounding box. */
  def getHeight(): Double = js.native
  
  /** Returns the polygon for the specified bounding box, or null. */
  def getPolygon(boundingBox: BoundingBoxAttachment): NumberArrayLike = js.native
  
  /** The width of the axis aligned bounding box. */
  def getWidth(): Double = js.native
  
  /** Returns the first bounding box attachment that contains any part of the line segment, or null. When doing many checks, it
    * is usually more efficient to only call this method if {@link #aabbIntersectsSegment()} returns
    * true. */
  def intersectsSegment(x1: Double, y1: Double, x2: Double, y2: Double): BoundingBoxAttachment = js.native
  
  /** Returns true if the polygon contains any part of the line segment. */
  def intersectsSegmentPolygon(polygon: NumberArrayLike, x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  
  /** The right edge of the axis aligned bounding box. */
  var maxX: Double = js.native
  
  /** The top edge of the axis aligned bounding box. */
  var maxY: Double = js.native
  
  /** The left edge of the axis aligned bounding box. */
  var minX: Double = js.native
  
  /** The bottom edge of the axis aligned bounding box. */
  var minY: Double = js.native
  
  /* private */ var polygonPool: Any = js.native
  
  /** The world vertices for the bounding box polygons. */
  var polygons: js.Array[NumberArrayLike] = js.native
  
  /** Clears any previous polygons, finds all visible bounding box attachments, and computes the world vertices for each bounding
    * box's polygon.
    * @param updateAabb If true, the axis aligned bounding box containing all the polygons is computed. If false, the
    *           SkeletonBounds AABB methods will always return true. */
  def update(skeleton: Skeleton, updateAabb: Boolean): Unit = js.native
}

package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Axis-Aligned Bounding Box.
  */
@JSImport("playcanvas", "BoundingBox")
@js.native
/**
  * Create a new BoundingBox instance. The bounding box is axis-aligned.
  *
  * @param {Vec3} [center] - Center of box. The constructor takes a reference of this parameter.
  * @param {Vec3} [halfExtents] - Half the distance across the box in each axis. The constructor
  * takes a reference of this parameter. Defaults to 0.5 on each axis.
  */
open class BoundingBox () extends StObject {
  def this(center: Vec3) = this()
  def this(center: Unit, halfExtents: Vec3) = this()
  def this(center: Vec3, halfExtents: Vec3) = this()
  
  def _distanceToBoundingSphereSq(sphere: Any): Double = js.native
  
  def _expand(expandMin: Any, expandMax: Any): Unit = js.native
  
  def _fastIntersectsRay(ray: Any): Boolean = js.native
  
  def _intersectsRay(ray: Any, point: Any): Boolean = js.native
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var _max: Any = js.native
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var _min: Any = js.native
  
  /**
    * Combines two bounding boxes into one, enclosing both.
    *
    * @param {BoundingBox} other - Bounding box to add.
    */
  def add(other: BoundingBox): Unit = js.native
  
  /**
    * Center of box.
    *
    * @type {Vec3}
    */
  var center: Vec3 = js.native
  
  /**
    * Compute the size of the AABB to encapsulate all specified vertices.
    *
    * @param {number[]|Float32Array} vertices - The vertices used to compute the new size for the
    * AABB.
    * @param {number} [numVerts] - Number of vertices to use from the beginning of vertices array.
    * All vertices are used if not specified.
    */
  def compute(vertices: js.Array[Double]): Unit = js.native
  def compute(vertices: js.Array[Double], numVerts: Double): Unit = js.native
  def compute(vertices: js.typedarray.Float32Array): Unit = js.native
  def compute(vertices: js.typedarray.Float32Array, numVerts: Double): Unit = js.native
  
  /**
    * Test if a point is inside a AABB.
    *
    * @param {Vec3} point - Point to test.
    * @returns {boolean} True if the point is inside the AABB and false otherwise.
    */
  def containsPoint(point: Vec3): Boolean = js.native
  
  /**
    * Copies the contents of a source AABB.
    *
    * @param {BoundingBox} src - The AABB to copy from.
    */
  def copy(src: BoundingBox): Unit = js.native
  
  /**
    * Return the maximum corner of the AABB.
    *
    * @returns {Vec3} Maximum corner.
    */
  def getMax(): Vec3 = js.native
  
  /**
    * Return the minimum corner of the AABB.
    *
    * @returns {Vec3} Minimum corner.
    */
  def getMin(): Vec3 = js.native
  
  /**
    * Half the distance across the box in each axis.
    *
    * @type {Vec3}
    */
  var halfExtents: Vec3 = js.native
  
  /**
    * Test whether two axis-aligned bounding boxes intersect.
    *
    * @param {BoundingBox} other - Bounding box to test against.
    * @returns {boolean} True if there is an intersection.
    */
  def intersects(other: BoundingBox): Boolean = js.native
  
  /**
    * Test if a Bounding Sphere is overlapping, enveloping, or inside this AABB.
    *
    * @param {BoundingSphere} sphere - Bounding Sphere to test.
    * @returns {boolean} True if the Bounding Sphere is overlapping, enveloping, or inside the
    * AABB and false otherwise.
    */
  def intersectsBoundingSphere(sphere: BoundingSphere): Boolean = js.native
  
  /**
    * Test if a ray intersects with the AABB.
    *
    * @param {Ray} ray - Ray to test against (direction must be normalized).
    * @param {Vec3} [point] - If there is an intersection, the intersection point will be copied into here.
    * @returns {boolean} True if there is an intersection.
    */
  def intersectsRay(ray: Ray): Boolean = js.native
  def intersectsRay(ray: Ray, point: Vec3): Boolean = js.native
  
  /**
    * Set an AABB to enclose the specified AABB if it were to be transformed by the specified 4x4
    * matrix.
    *
    * @param {BoundingBox} aabb - Box to transform and enclose.
    * @param {Mat4} m - Transformation matrix to apply to source AABB.
    * @param {boolean} ignoreScale - If true is specified, a scale from the matrix is ignored. Defaults to false.
    */
  def setFromTransformedAabb(aabb: BoundingBox, m: Mat4): Unit = js.native
  def setFromTransformedAabb(aabb: BoundingBox, m: Mat4, ignoreScale: Boolean): Unit = js.native
  
  /**
    * Sets the minimum and maximum corner of the AABB. Using this function is faster than
    * assigning min and max separately.
    *
    * @param {Vec3} min - The minimum corner of the AABB.
    * @param {Vec3} max - The maximum corner of the AABB.
    */
  def setMinMax(min: Vec3, max: Vec3): Unit = js.native
}
object BoundingBox {
  
  @JSImport("playcanvas", "BoundingBox")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Compute the min and max bounding values to encapsulate all specified vertices.
    *
    * @param {number[]|Float32Array} vertices - The vertices used to compute the new size for the
    * AABB.
    * @param {Vec3} min - Stored computed min value.
    * @param {Vec3} max - Stored computed max value.
    * @param {number} [numVerts] - Number of vertices to use from the beginning of vertices array.
    * All vertices are used if not specified.
    */
  /* static member */
  inline def computeMinMax(vertices: js.Array[Double], min: Vec3, max: Vec3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMinMax")(vertices.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def computeMinMax(vertices: js.Array[Double], min: Vec3, max: Vec3, numVerts: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMinMax")(vertices.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], numVerts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def computeMinMax(vertices: js.typedarray.Float32Array, min: Vec3, max: Vec3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMinMax")(vertices.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def computeMinMax(vertices: js.typedarray.Float32Array, min: Vec3, max: Vec3, numVerts: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMinMax")(vertices.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], numVerts.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

package typings.playcanvas.pc

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new axis-aligned bounding box.
  * @property center - Center of box.
  * @property halfExtents - Half the distance across the box in each axis.
  * @param [center] - Center of box. The constructor takes a reference of this parameter.
  * @param [halfExtents] - Half the distance across the box in each axis. The constructor takes a reference of this parameter.
  */
@js.native
trait BoundingBox extends StObject {
  
  /**
    * Combines two bounding boxes into one, enclosing both.
    * @param other - Bounding box to add.
    */
  def add(other: BoundingBox): Unit = js.native
  
  /**
    * Center of box.
    */
  var center: Vec3 = js.native
  
  /**
    * Compute the size of the AABB to encapsulate all specified vertices.
    * @param vertices - The vertices used to compute the new size for the AABB.
    * @param [numVerts] - Number of vertices to use from the beginning of vertices array. All vertices are used if not specified.
    */
  def compute(vertices: js.Array[Double]): Unit = js.native
  def compute(vertices: js.Array[Double], numVerts: Double): Unit = js.native
  def compute(vertices: Float32Array): Unit = js.native
  def compute(vertices: Float32Array, numVerts: Double): Unit = js.native
  
  /**
    * Test if a point is inside a AABB.
    * @param point - Point to test.
    * @returns True if the point is inside the AABB and false otherwise.
    */
  def containsPoint(point: Vec3): Boolean = js.native
  
  /**
    * Copies the contents of a source AABB.
    * @param src - The AABB to copy from.
    */
  def copy(src: BoundingBox): Unit = js.native
  
  /**
    * Return the maximum corner of the AABB.
    * @returns Maximum corner.
    */
  def getMax(): Vec3 = js.native
  
  /**
    * Return the minimum corner of the AABB.
    * @returns Minimum corner.
    */
  def getMin(): Vec3 = js.native
  
  /**
    * Half the distance across the box in each axis.
    */
  var halfExtents: Vec3 = js.native
  
  /**
    * Test whether two axis-aligned bounding boxes intersect.
    * @param other - Bounding box to test against.
    * @returns True if there is an intersection.
    */
  def intersects(other: BoundingBox): Boolean = js.native
  
  /**
    * Test if a Bounding Sphere is overlapping, enveloping, or inside this AABB.
    * @param sphere - Bounding Sphere to test.
    * @returns True if the Bounding Sphere is overlapping, enveloping, or inside the AABB and false otherwise.
    */
  def intersectsBoundingSphere(sphere: BoundingSphere): Boolean = js.native
  
  /**
    * Test if a ray intersects with the AABB.
    * @param ray - Ray to test against (direction must be normalized).
    * @param [point] - If there is an intersection, the intersection point will be copied into here.
    * @returns True if there is an intersection.
    */
  def intersectsRay(ray: Ray): Boolean = js.native
  def intersectsRay(ray: Ray, point: Vec3): Boolean = js.native
  
  /**
    * Set an AABB to enclose the specified AABB if it were to be
    * transformed by the specified 4x4 matrix.
    * @param aabb - Box to transform and enclose.
    * @param m - Transformation matrix to apply to source AABB.
    */
  def setFromTransformedAabb(aabb: BoundingBox, m: Mat4): Unit = js.native
  
  /**
    * Sets the minimum and maximum corner of the AABB.
    * Using this function is faster than assigning min and max separately.
    * @param min - The minimum corner of the AABB.
    * @param max - The maximum corner of the AABB.
    */
  def setMinMax(min: Vec3, max: Vec3): Unit = js.native
}

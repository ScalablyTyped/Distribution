package typings.playcanvas.pc

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.BoundingBox
  * @description Create a new axis-aligned bounding box.
  * @classdesc Axis-Aligned Bounding Box.
  * @param {pc.Vec3} [center] - Center of box. The constructor takes a reference of this parameter.
  * @param {pc.Vec3} [halfExtents] - Half the distance across the box in each axis. The constructor takes a reference of this parameter.
  * @property {pc.Vec3} center Center of box.
  * @property {pc.Vec3} halfExtents Half the distance across the box in each axis.
  */
@JSGlobal("pc.BoundingBox")
@js.native
class BoundingBox () extends js.Object {
  def this(center: Vec3) = this()
  def this(center: Vec3, halfExtents: Vec3) = this()
  /**
    * Center of box.
    */
  var center: Vec3 = js.native
  /**
    * Half the distance across the box in each axis.
    */
  var halfExtents: Vec3 = js.native
  /**
    * @function
    * @name pc.BoundingBox#add
    * @description Combines two bounding boxes into one, enclosing both.
    * @param {pc.BoundingBox} other - Bounding box to add.
    */
  def add(other: BoundingBox): Unit = js.native
  /**
    * @function
    * @name pc.BoundingBox#compute
    * @description Compute the size of the AABB to encapsulate all specified vertices.
    * @param {number[]|Float32Array} vertices - The vertices used to compute the new size for the AABB.
    */
  def compute(vertices: js.Array[Double]): Unit = js.native
  def compute(vertices: Float32Array): Unit = js.native
  /**
    * @function
    * @name pc.BoundingBox#containsPoint
    * @description Test if a point is inside a AABB.
    * @param {pc.Vec3} point - Point to test.
    * @returns {boolean} True if the point is inside the AABB and false otherwise.
    */
  def containsPoint(point: Vec3): Boolean = js.native
  /**
    * @function
    * @name pc.BoundingBox#copy
    * @description Copies the contents of a source AABB.
    * @param {pc.BoundingBox} src - The AABB to copy from.
    */
  def copy(src: BoundingBox): Unit = js.native
  /**
    * @function
    * @name pc.BoundingBox#getMax
    * @description Return the maximum corner of the AABB.
    * @returns {pc.Vec3} Maximum corner.
    */
  def getMax(): Vec3 = js.native
  /**
    * @function
    * @name pc.BoundingBox#getMin
    * @description Return the minimum corner of the AABB.
    * @returns {pc.Vec3} Minimum corner.
    */
  def getMin(): Vec3 = js.native
  /**
    * @function
    * @name pc.BoundingBox#intersects
    * @description Test whether two axis-aligned bounding boxes intersect.
    * @param {pc.BoundingBox} other - Bounding box to test against.
    * @returns {boolean} True if there is an intersection.
    */
  def intersects(other: BoundingBox): Boolean = js.native
  /**
    * @function
    * @name pc.BoundingBox#intersectsBoundingSphere
    * @description Test if a Bounding Sphere is overlapping, enveloping, or inside this AABB.
    * @param {pc.BoundingSphere} sphere - Bounding Sphere to test.
    * @returns {boolean} True if the Bounding Sphere is overlapping, enveloping, or inside the AABB and false otherwise.
    */
  def intersectsBoundingSphere(sphere: BoundingSphere): Boolean = js.native
  /**
    * @function
    * @name pc.BoundingBox#intersectsRay
    * @description Test if a ray intersects with the AABB.
    * @param {pc.Ray} ray - Ray to test against (direction must be normalized).
    * @param {pc.Vec3} [point] - If there is an intersection, the intersection point will be copied into here.
    * @returns {boolean} True if there is an intersection.
    */
  def intersectsRay(ray: Ray): Boolean = js.native
  def intersectsRay(ray: Ray, point: Vec3): Boolean = js.native
  /**
    * @function
    * @name pc.BoundingBox#setFromTransformedAabb
    * @description Set an AABB to enclose the specified AABB if it were to be
    * transformed by the specified 4x4 matrix.
    * @param {pc.BoundingBox} aabb - Box to transform and enclose.
    * @param {pc.Mat4} m - Transformation matrix to apply to source AABB.
    */
  def setFromTransformedAabb(aabb: BoundingBox, m: Mat4): Unit = js.native
  /**
    * @function
    * @name pc.BoundingBox#setMinMax
    * @description Sets the minimum and maximum corner of the AABB.
    * Using this function is faster than assigning min and max separately.
    * @param {pc.Vec3} min - The minimum corner of the AABB.
    * @param {pc.Vec3} max - The maximum corner of the AABB.
    */
  def setMinMax(min: Vec3, max: Vec3): Unit = js.native
}


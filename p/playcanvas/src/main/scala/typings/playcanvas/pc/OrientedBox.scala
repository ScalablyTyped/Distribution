package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.OrientedBox
  * @description Create a new oriented box.
  * @classdesc Oriented Box.
  * @property {pc.Mat4} [worldTransform] The world transform of the OBB.
  * @param {pc.Mat4} [worldTransform] - Transform that has the orientation and position of the box. Scale is assumed to be one.
  * @param {pc.Vec3} [halfExtents] - Half the distance across the box in each local axis. The constructor takes a reference of this parameter.
  */
@JSGlobal("pc.OrientedBox")
@js.native
class OrientedBox () extends js.Object {
  def this(worldTransform: Mat4) = this()
  def this(worldTransform: Mat4, halfExtents: Vec3) = this()
  /**
    * The world transform of the OBB.
    */
  var worldTransform: js.UndefOr[Mat4] = js.native
  /**
    * @function
    * @name pc.OrientedBox#containsPoint
    * @description Test if a point is inside a OBB.
    * @param {pc.Vec3} point - Point to test.
    * @returns {boolean} True if the point is inside the OBB and false otherwise.
    */
  def containsPoint(point: Vec3): Boolean = js.native
  /**
    * @function
    * @name pc.OrientedBox#intersectsBoundingSphere
    * @description Test if a Bounding Sphere is overlapping, enveloping, or inside this OBB.
    * @param {pc.BoundingSphere} sphere - Bounding Sphere to test.
    * @returns {boolean} True if the Bounding Sphere is overlapping, enveloping or inside this OBB and false otherwise.
    */
  def intersectsBoundingSphere(sphere: BoundingSphere): Boolean = js.native
  /**
    * @function
    * @name pc.OrientedBox#intersectsRay
    * @description Test if a ray intersects with the OBB.
    * @param {pc.Ray} ray - Ray to test against (direction must be normalized).
    * @param {pc.Vec3} [point] - If there is an intersection, the intersection point will be copied into here.
    * @returns {boolean} True if there is an intersection.
    */
  def intersectsRay(ray: Ray): Boolean = js.native
  def intersectsRay(ray: Ray, point: Vec3): Boolean = js.native
}


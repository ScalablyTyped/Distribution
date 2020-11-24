package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new oriented box.
  * @property [worldTransform] - The world transform of the OBB.
  * @param [worldTransform] - Transform that has the orientation and position of the box. Scale is assumed to be one.
  * @param [halfExtents] - Half the distance across the box in each local axis. The constructor takes a reference of this parameter.
  */
@js.native
trait OrientedBox extends js.Object {
  
  /**
    * Test if a point is inside a OBB.
    * @param point - Point to test.
    * @returns True if the point is inside the OBB and false otherwise.
    */
  def containsPoint(point: Vec3): Boolean = js.native
  
  /**
    * Test if a Bounding Sphere is overlapping, enveloping, or inside this OBB.
    * @param sphere - Bounding Sphere to test.
    * @returns True if the Bounding Sphere is overlapping, enveloping or inside this OBB and false otherwise.
    */
  def intersectsBoundingSphere(sphere: BoundingSphere): Boolean = js.native
  
  /**
    * Test if a ray intersects with the OBB.
    * @param ray - Ray to test against (direction must be normalized).
    * @param [point] - If there is an intersection, the intersection point will be copied into here.
    * @returns True if there is an intersection.
    */
  def intersectsRay(ray: Ray): Boolean = js.native
  def intersectsRay(ray: Ray, point: Vec3): Boolean = js.native
  
  /**
    * The world transform of the OBB.
    */
  var worldTransform: js.UndefOr[Mat4] = js.native
}

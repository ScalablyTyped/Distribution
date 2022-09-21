package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Oriented Box.
  */
@JSImport("playcanvas", "OrientedBox")
@js.native
/**
  * Create a new OrientedBox instance.
  *
  * @param {Mat4} [worldTransform] - Transform that has the orientation and position of the box.
  * Scale is assumed to be one.
  * @param {Vec3} [halfExtents] - Half the distance across the box in each local axis. The
  * constructor takes a reference of this parameter.
  */
open class OrientedBox () extends StObject {
  def this(worldTransform: Mat4) = this()
  def this(worldTransform: Unit, halfExtents: Vec3) = this()
  def this(worldTransform: Mat4, halfExtents: Vec3) = this()
  
  /**
    * @type {BoundingBox}
    * @private
    */
  /* private */ var _aabb: Any = js.native
  
  /**
    * @type {Mat4}
    * @private
    */
  /* private */ var _modelTransform: Any = js.native
  
  /**
    * @type {Mat4}
    * @private
    */
  /* private */ var _worldTransform: Any = js.native
  
  /**
    * Test if a point is inside a OBB.
    *
    * @param {Vec3} point - Point to test.
    * @returns {boolean} True if the point is inside the OBB and false otherwise.
    */
  def containsPoint(point: Vec3): Boolean = js.native
  
  var halfExtents: Vec3 = js.native
  
  /**
    * Test if a Bounding Sphere is overlapping, enveloping, or inside this OBB.
    *
    * @param {BoundingSphere} sphere - Bounding Sphere to test.
    * @returns {boolean} True if the Bounding Sphere is overlapping, enveloping or inside this OBB
    * and false otherwise.
    */
  def intersectsBoundingSphere(sphere: BoundingSphere): Boolean = js.native
  
  /**
    * Test if a ray intersects with the OBB.
    *
    * @param {Ray} ray - Ray to test against (direction must be normalized).
    * @param {Vec3} [point] - If there is an intersection, the intersection point will be copied
    * into here.
    * @returns {boolean} True if there is an intersection.
    */
  def intersectsRay(ray: Ray): Boolean = js.native
  def intersectsRay(ray: Ray, point: Vec3): Boolean = js.native
  
  def worldTransform: Mat4 = js.native
  /**
    * The world transform of the OBB.
    *
    * @type {Mat4}
    */
  def worldTransform_=(arg: Mat4): Unit = js.native
}

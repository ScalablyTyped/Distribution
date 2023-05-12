package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bounding sphere is a volume for facilitating fast intersection testing.
  */
@JSImport("playcanvas", "BoundingSphere")
@js.native
/**
  * Creates a new BoundingSphere instance.
  *
  * @param {Vec3} [center] - The world space coordinate marking the center of the sphere. The
  * constructor takes a reference of this parameter.
  * @param {number} [radius] - The radius of the bounding sphere. Defaults to 0.5.
  * @example
  * // Create a new bounding sphere centered on the origin with a radius of 0.5
  * const sphere = new pc.BoundingSphere();
  */
open class BoundingSphere () extends StObject {
  def this(center: Vec3) = this()
  def this(center: Unit, radius: Double) = this()
  def this(center: Vec3, radius: Double) = this()
  
  /**
    * Center of sphere.
    *
    * @type {Vec3}
    */
  var center: Vec3 = js.native
  
  def containsPoint(point: Any): Boolean = js.native
  
  /**
    * Test if a Bounding Sphere is overlapping, enveloping, or inside this Bounding Sphere.
    *
    * @param {BoundingSphere} sphere - Bounding Sphere to test.
    * @returns {boolean} True if the Bounding Sphere is overlapping, enveloping, or inside this Bounding Sphere and false otherwise.
    */
  def intersectsBoundingSphere(sphere: BoundingSphere): Boolean = js.native
  
  /**
    * Test if a ray intersects with the sphere.
    *
    * @param {import('./ray.js').Ray} ray - Ray to test against (direction must be normalized).
    * @param {Vec3} [point] - If there is an intersection, the intersection point will be copied
    * into here.
    * @returns {boolean} True if there is an intersection.
    */
  def intersectsRay(ray: Ray): Boolean = js.native
  def intersectsRay(ray: Ray, point: Vec3): Boolean = js.native
  
  /**
    * The radius of the bounding sphere.
    *
    * @type {number}
    */
  var radius: Double = js.native
}

package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An infinite plane. Internally it's represented in a parametric equation form:
  * ax + by + cz + distance = 0.
  */
@JSImport("playcanvas", "Plane")
@js.native
/**
  * Create a new Plane instance.
  *
  * @param {Vec3} [normal] - Normal of the plane. The constructor copies this parameter. Defaults
  * to {@link Vec3.UP}.
  * @param {number} [distance] - The distance from the plane to the origin, along its normal.
  * Defaults to 0.
  */
open class Plane () extends StObject {
  def this(normal: Vec3) = this()
  def this(normal: Unit, distance: Double) = this()
  def this(normal: Vec3, distance: Double) = this()
  
  /**
    * Copies the contents of a source Plane.
    *
    * @param {Plane} src - The Plane to copy from.
    * @returns {Plane} Self for chaining.
    */
  def copy(src: Plane): Plane = js.native
  
  /**
    * The distance from the plane to the origin, along its normal.
    *
    * @readonly
    * @type {number}
    */
  val distance: Double = js.native
  
  /**
    * Test if the plane intersects between two points.
    *
    * @param {Vec3} start - Start position of line.
    * @param {Vec3} end - End position of line.
    * @param {Vec3} [point] - If there is an intersection, the intersection point will be copied
    * into here.
    * @returns {boolean} True if there is an intersection.
    */
  def intersectsLine(start: Vec3, end: Vec3): Boolean = js.native
  def intersectsLine(start: Vec3, end: Vec3, point: Vec3): Boolean = js.native
  
  /**
    * Test if a ray intersects with the infinite plane.
    *
    * @param {import('./ray.js').Ray} ray - Ray to test against (direction must be normalized).
    * @param {Vec3} [point] - If there is an intersection, the intersection point will be copied
    * into here.
    * @returns {boolean} True if there is an intersection.
    */
  def intersectsRay(ray: Ray): Boolean = js.native
  def intersectsRay(ray: Ray, point: Vec3): Boolean = js.native
  
  /**
    * The normal of the plane.
    *
    * @readonly
    * @type {Vec3}
    */
  val normal: Vec3 = js.native
  
  /**
    * Sets the plane based on a specified normal and a point on the plane.
    *
    * @param {Vec3} point - The point on the plane.
    * @param {Vec3} normal - The normal of the plane.
    * @returns {Plane} Self for chaining.
    */
  def setFromPointNormal(point: Vec3, normal: Vec3): Plane = js.native
}

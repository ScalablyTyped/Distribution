package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An infinite plane.
  *
  * @ignore
  */
@JSImport("playcanvas", "Plane")
@js.native
/**
  * Create a new Plane instance.
  *
  * @param {Vec3} [point] - Point position on the plane. The constructor takes a reference of
  * this parameter.
  * @param {Vec3} [normal] - Normal of the plane. The constructor takes a reference of this
  * parameter.
  */
open class Plane () extends StObject {
  def this(point: Vec3) = this()
  def this(point: Unit, normal: Vec3) = this()
  def this(point: Vec3, normal: Vec3) = this()
  
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
    * @param {Ray} ray - Ray to test against (direction must be normalized).
    * @param {Vec3} [point] - If there is an intersection, the intersection point will be copied
    * into here.
    * @returns {boolean} True if there is an intersection.
    */
  def intersectsRay(ray: Ray): Boolean = js.native
  def intersectsRay(ray: Ray, point: Vec3): Boolean = js.native
  
  var normal: Vec3 = js.native
  
  var point: Vec3 = js.native
}

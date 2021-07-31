package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new bounding sphere.
  * @example
  * // Create a new bounding sphere centered on the origin with a radius of 0.5
  * var sphere = new pc.BoundingSphere();
  * @param [center] - The world space coordinate marking the center of the sphere. The constructor takes a reference of this parameter.
  * @param [radius] - The radius of the bounding sphere. Defaults to 0.5.
  */
@js.native
trait BoundingSphere extends StObject {
  
  /**
    * Test if a Bounding Sphere is overlapping, enveloping, or inside this Bounding Sphere.
    * @param sphere - Bounding Sphere to test.
    * @returns True if the Bounding Sphere is overlapping, enveloping, or inside this Bounding Sphere and false otherwise.
    */
  def intersectsBoundingSphere(sphere: BoundingSphere): Boolean = js.native
  
  /**
    * Test if a ray intersects with the sphere.
    * @param ray - Ray to test against (direction must be normalized).
    * @param [point] - If there is an intersection, the intersection point will be copied into here.
    * @returns True if there is an intersection.
    */
  def intersectsRay(ray: Ray): Boolean = js.native
  def intersectsRay(ray: Ray, point: Vec3): Boolean = js.native
}

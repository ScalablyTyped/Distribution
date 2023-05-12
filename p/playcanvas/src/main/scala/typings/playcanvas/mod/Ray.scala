package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An infinite ray.
  */
@JSImport("playcanvas", "Ray")
@js.native
/**
  * Creates a new Ray instance. The ray is infinite, starting at a given origin and pointing in
  * a given direction.
  *
  * @param {Vec3} [origin] - The starting point of the ray. The constructor copies
  * this parameter. Defaults to the origin (0, 0, 0).
  * @param {Vec3} [direction] - The direction of the ray. The constructor copies
  * this parameter. Defaults to a direction down the world negative Z axis (0, 0, -1).
  * @example
  * // Create a new ray starting at the position of this entity and pointing down
  * // the entity's negative Z axis
  * const ray = new pc.Ray(this.entity.getPosition(), this.entity.forward);
  */
open class Ray () extends StObject {
  def this(origin: Vec3) = this()
  def this(origin: Unit, direction: Vec3) = this()
  def this(origin: Vec3, direction: Vec3) = this()
  
  /**
    * Copies the contents of a source Ray.
    *
    * @param {Ray} src - The Ray to copy from.
    * @returns {Ray} Self for chaining.
    */
  def copy(src: Ray): Ray = js.native
  
  /**
    * The direction of the ray.
    *
    * @readonly
    * @type {Vec3}
    */
  val direction: Vec3 = js.native
  
  /**
    * The starting point of the ray.
    *
    * @readonly
    * @type {Vec3}
    */
  val origin: Vec3 = js.native
  
  /**
    * Sets origin and direction to the supplied vector values.
    *
    * @param {Vec3} origin - The starting point of the ray.
    * @param {Vec3} direction - The direction of the ray.
    * @returns {Ray} Self for chaining.
    */
  def set(origin: Vec3, direction: Vec3): Ray = js.native
}

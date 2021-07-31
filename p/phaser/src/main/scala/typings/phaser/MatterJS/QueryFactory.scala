package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryFactory extends StObject {
  
  /**
    * Returns all bodies whose vertices contain the given point, from the given set of bodies.
    * @method point
    * @param {body[]} bodies
    * @param {vector} point
    * @return {body[]} The bodies matching the query
    */
  def point(bodies: js.Array[BodyType], point: Vector): js.Array[BodyType] = js.native
  
  /**
    * Casts a ray segment against a set of bodies and returns all collisions, ray width is optional. Intersection points are not provided.
    * @method ray
    * @param {body[]} bodies
    * @param {vector} startPoint
    * @param {vector} endPoint
    * @param {number} [rayWidth]
    * @return {object[]} Collisions
    */
  def ray(bodies: js.Array[BodyType], startPoint: Vector, endPoint: Vector): js.Array[ICollisionData] = js.native
  def ray(bodies: js.Array[BodyType], startPoint: Vector, endPoint: Vector, rayWidth: Double): js.Array[ICollisionData] = js.native
  
  /**
    * Returns all bodies whose bounds are inside (or outside if set) the given set of bounds, from the given set of bodies.
    * @method region
    * @param {body[]} bodies
    * @param {bounds} bounds
    * @param {bool} [outside=false]
    * @return {body[]} The bodies matching the query
    */
  def region(bodies: js.Array[BodyType], bounds: Bounds): js.Array[BodyType] = js.native
  def region(bodies: js.Array[BodyType], bounds: Bounds, outside: Boolean): js.Array[BodyType] = js.native
}

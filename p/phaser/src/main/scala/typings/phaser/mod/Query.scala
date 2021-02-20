package typings.phaser.mod

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.ICollisionData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Query` module contains methods for performing collision queries.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Query
  */
@JSImport("matter", "Query")
@js.native
class Query ()
  extends typings.phaser.MatterJS.Query
object Query {
  
  /**
    * Returns all bodies whose vertices contain the given point, from the given set of bodies.
    * @method point
    * @param {body[]} bodies
    * @param {vector} point
    * @return {body[]} The bodies matching the query
    */
  /* static member */
  @JSImport("matter", "Query.point")
  @js.native
  def point(bodies: js.Array[BodyType], point: typings.phaser.MatterJS.Vector): js.Array[BodyType] = js.native
  
  /**
    * Casts a ray segment against a set of bodies and returns all collisions, ray width is optional. Intersection points are not provided.
    * @method ray
    * @param {body[]} bodies
    * @param {vector} startPoint
    * @param {vector} endPoint
    * @param {number} [rayWidth]
    * @return {object[]} Collisions
    */
  /* static member */
  @JSImport("matter", "Query.ray")
  @js.native
  def ray(
    bodies: js.Array[BodyType],
    startPoint: typings.phaser.MatterJS.Vector,
    endPoint: typings.phaser.MatterJS.Vector
  ): js.Array[ICollisionData] = js.native
  @JSImport("matter", "Query.ray")
  @js.native
  def ray(
    bodies: js.Array[BodyType],
    startPoint: typings.phaser.MatterJS.Vector,
    endPoint: typings.phaser.MatterJS.Vector,
    rayWidth: Double
  ): js.Array[ICollisionData] = js.native
  
  /**
    * Returns all bodies whose bounds are inside (or outside if set) the given set of bounds, from the given set of bodies.
    * @method region
    * @param {body[]} bodies
    * @param {bounds} bounds
    * @param {bool} [outside=false]
    * @return {body[]} The bodies matching the query
    */
  /* static member */
  @JSImport("matter", "Query.region")
  @js.native
  def region(bodies: js.Array[BodyType], bounds: typings.phaser.MatterJS.Bounds): js.Array[BodyType] = js.native
  @JSImport("matter", "Query.region")
  @js.native
  def region(bodies: js.Array[BodyType], bounds: typings.phaser.MatterJS.Bounds, outside: Boolean): js.Array[BodyType] = js.native
}

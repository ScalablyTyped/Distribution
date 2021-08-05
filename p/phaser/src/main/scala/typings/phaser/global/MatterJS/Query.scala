package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.ICollisionData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Query` module contains methods for performing collision queries.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Query
  */
@JSGlobal("MatterJS.Query")
@js.native
class Query ()
  extends StObject
     with typings.phaser.MatterJS.Query
object Query {
  
  @JSGlobal("MatterJS.Query")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns all bodies whose vertices contain the given point, from the given set of bodies.
    * @method point
    * @param {body[]} bodies
    * @param {vector} point
    * @return {body[]} The bodies matching the query
    */
  /* static member */
  inline def point(bodies: js.Array[BodyType], point: typings.phaser.MatterJS.Vector): js.Array[BodyType] = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(bodies.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[js.Array[BodyType]]
  
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
  inline def ray(
    bodies: js.Array[BodyType],
    startPoint: typings.phaser.MatterJS.Vector,
    endPoint: typings.phaser.MatterJS.Vector
  ): js.Array[ICollisionData] = (^.asInstanceOf[js.Dynamic].applyDynamic("ray")(bodies.asInstanceOf[js.Any], startPoint.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any])).asInstanceOf[js.Array[ICollisionData]]
  inline def ray(
    bodies: js.Array[BodyType],
    startPoint: typings.phaser.MatterJS.Vector,
    endPoint: typings.phaser.MatterJS.Vector,
    rayWidth: Double
  ): js.Array[ICollisionData] = (^.asInstanceOf[js.Dynamic].applyDynamic("ray")(bodies.asInstanceOf[js.Any], startPoint.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], rayWidth.asInstanceOf[js.Any])).asInstanceOf[js.Array[ICollisionData]]
  
  /**
    * Returns all bodies whose bounds are inside (or outside if set) the given set of bounds, from the given set of bodies.
    * @method region
    * @param {body[]} bodies
    * @param {bounds} bounds
    * @param {bool} [outside=false]
    * @return {body[]} The bodies matching the query
    */
  /* static member */
  inline def region(bodies: js.Array[BodyType], bounds: typings.phaser.MatterJS.Bounds): js.Array[BodyType] = (^.asInstanceOf[js.Dynamic].applyDynamic("region")(bodies.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[js.Array[BodyType]]
  inline def region(bodies: js.Array[BodyType], bounds: typings.phaser.MatterJS.Bounds, outside: Boolean): js.Array[BodyType] = (^.asInstanceOf[js.Dynamic].applyDynamic("region")(bodies.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], outside.asInstanceOf[js.Any])).asInstanceOf[js.Array[BodyType]]
}

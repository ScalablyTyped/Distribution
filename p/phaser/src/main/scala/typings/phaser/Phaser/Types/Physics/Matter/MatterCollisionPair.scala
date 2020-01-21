package typings.phaser.Phaser.Types.Physics.Matter

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterCollisionPair extends js.Object {
  /**
    * An array containing all of the active contacts between bodies A and B.
    */
  var activeContacts: js.Array[Vector]
  /**
    * A reference to the first body involved in the collision.
    */
  var bodyA: BodyType
  /**
    * A reference to the second body involved in the collision.
    */
  var bodyB: BodyType
  /**
    * The collision data object.
    */
  var collision: MatterCollisionData
  /**
    * Has Matter determined the collision are being active yet?
    */
  var confirmedActive: Boolean
  /**
    * The resulting friction from the collision.
    */
  var friction: Double
  /**
    * The resulting static friction from the collision.
    */
  var frictionStatic: Double
  /**
    * The unique auto-generated collision pair id. A combination of the body A and B IDs.
    */
  var id: String
  /**
    * The resulting inverse mass from the collision.
    */
  var inverseMass: Double
  /**
    * Is the collision still active or not?
    */
  var isActive: Boolean
  /**
    * Is either body A or B a sensor?
    */
  var isSensor: Boolean
  /**
    * The resulting restitution from the collision.
    */
  var restitution: Double
  /**
    * The amount of separation that occured between bodies A and B.
    */
  var separation: Double
  /**
    * The resulting slop from the collision.
    */
  var slop: Double
  /**
    * The timestamp when the collision pair was created.
    */
  var timeCreated: Double
  /**
    * The timestamp when the collision pair was most recently updated.
    */
  var timeUpdated: Double
}

object MatterCollisionPair {
  @scala.inline
  def apply(
    activeContacts: js.Array[Vector],
    bodyA: BodyType,
    bodyB: BodyType,
    collision: MatterCollisionData,
    confirmedActive: Boolean,
    friction: Double,
    frictionStatic: Double,
    id: String,
    inverseMass: Double,
    isActive: Boolean,
    isSensor: Boolean,
    restitution: Double,
    separation: Double,
    slop: Double,
    timeCreated: Double,
    timeUpdated: Double
  ): MatterCollisionPair = {
    val __obj = js.Dynamic.literal(activeContacts = activeContacts.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collision = collision.asInstanceOf[js.Any], confirmedActive = confirmedActive.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isSensor = isSensor.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeUpdated = timeUpdated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MatterCollisionPair]
  }
}


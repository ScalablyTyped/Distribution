package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollisionPair extends js.Object {
  var activeContacts: js.Array[Vector]
  var bodyA: Body
  var bodyB: Body
  var collision: ICollisionData
  var confirmedActive: Boolean
  var friction: Double
  var frictionStatic: Double
  var id: String
  var inverseMass: Double
  var isActive: Boolean
  var isSensor: Boolean
  var restitution: Double
  var separation: Double
  var slop: Double
  var timeCreated: Double
  var timeUpdated: Double
}

object ICollisionPair {
  @scala.inline
  def apply(
    activeContacts: js.Array[Vector],
    bodyA: Body,
    bodyB: Body,
    collision: ICollisionData,
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
  ): ICollisionPair = {
    val __obj = js.Dynamic.literal(activeContacts = activeContacts.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collision = collision.asInstanceOf[js.Any], confirmedActive = confirmedActive.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isSensor = isSensor.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeUpdated = timeUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollisionPair]
  }
}


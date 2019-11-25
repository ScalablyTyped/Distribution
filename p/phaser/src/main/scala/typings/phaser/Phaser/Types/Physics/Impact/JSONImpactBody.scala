package typings.phaser.Phaser.Types.Physics.Impact

import typings.phaser.Phaser.Physics.Impact.COLLIDES
import typings.phaser.Phaser.Physics.Impact.TYPE
import typings.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONImpactBody extends js.Object {
  /**
    * Current acceleration to be added to the entity's velocity per second. E.g. an entity with a `vel.x` of 0 and `accel.x` of 10 will have a `vel.x` of 100 ten seconds later.
    */
  var accel: Vector2Like
  /**
    * [description]
    */
  var bounciness: Double
  /**
    * [description]
    */
  var checkAgainst: TYPE
  /**
    * [description]
    */
  var collides: COLLIDES
  /**
    * Deceleration to be subtracted from the entity's velocity per second. Only applies if `accel` is 0.
    */
  var friction: Vector2Like
  /**
    * [description]
    */
  var gravityFactor: Double
  /**
    * The maximum velocity a body can move.
    */
  var maxVel: Vector2Like
  /**
    * [description]
    */
  var minBounceVelocity: Double
  /**
    * [description]
    */
  var name: String
  /**
    * The entity's position in the game world.
    */
  var pos: Vector2Like
  /**
    * [description]
    */
  var size: Vector2Like
  /**
    * [description]
    */
  var `type`: TYPE
  /**
    * Current velocity in pixels per second.
    */
  var vel: Vector2Like
}

object JSONImpactBody {
  @scala.inline
  def apply(
    accel: Vector2Like,
    bounciness: Double,
    checkAgainst: TYPE,
    collides: COLLIDES,
    friction: Vector2Like,
    gravityFactor: Double,
    maxVel: Vector2Like,
    minBounceVelocity: Double,
    name: String,
    pos: Vector2Like,
    size: Vector2Like,
    `type`: TYPE,
    vel: Vector2Like
  ): JSONImpactBody = {
    val __obj = js.Dynamic.literal(accel = accel.asInstanceOf[js.Any], bounciness = bounciness.asInstanceOf[js.Any], checkAgainst = checkAgainst.asInstanceOf[js.Any], collides = collides.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], gravityFactor = gravityFactor.asInstanceOf[js.Any], maxVel = maxVel.asInstanceOf[js.Any], minBounceVelocity = minBounceVelocity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vel = vel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONImpactBody]
  }
}


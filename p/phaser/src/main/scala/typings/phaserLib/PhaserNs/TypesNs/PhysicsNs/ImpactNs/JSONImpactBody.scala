package typings
package phaserLib.PhaserNs.TypesNs.PhysicsNs.ImpactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONImpactBody extends js.Object {
  /**
    * Current acceleration to be added to the entity's velocity per second. E.g. an entity with a `vel.x` of 0 and `accel.x` of 10 will have a `vel.x` of 100 ten seconds later.
    */
  var accel: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like
  /**
    * [description]
    */
  var bounciness: scala.Double
  /**
    * [description]
    */
  var checkAgainst: phaserLib.PhaserNs.PhysicsNs.ImpactNs.TYPE
  /**
    * [description]
    */
  var collides: phaserLib.PhaserNs.PhysicsNs.ImpactNs.COLLIDES
  /**
    * Deceleration to be subtracted from the entity's velocity per second. Only applies if `accel` is 0.
    */
  var friction: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like
  /**
    * [description]
    */
  var gravityFactor: scala.Double
  /**
    * The maximum velocity a body can move.
    */
  var maxVel: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like
  /**
    * [description]
    */
  var minBounceVelocity: scala.Double
  /**
    * [description]
    */
  var name: java.lang.String
  /**
    * The entity's position in the game world.
    */
  var pos: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like
  /**
    * [description]
    */
  var size: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like
  /**
    * [description]
    */
  var `type`: phaserLib.PhaserNs.PhysicsNs.ImpactNs.TYPE
  /**
    * Current velocity in pixels per second.
    */
  var vel: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like
}

object JSONImpactBody {
  @scala.inline
  def apply(
    accel: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like,
    bounciness: scala.Double,
    checkAgainst: phaserLib.PhaserNs.PhysicsNs.ImpactNs.TYPE,
    collides: phaserLib.PhaserNs.PhysicsNs.ImpactNs.COLLIDES,
    friction: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like,
    gravityFactor: scala.Double,
    maxVel: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like,
    minBounceVelocity: scala.Double,
    name: java.lang.String,
    pos: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like,
    size: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like,
    `type`: phaserLib.PhaserNs.PhysicsNs.ImpactNs.TYPE,
    vel: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like
  ): JSONImpactBody = {
    val __obj = js.Dynamic.literal(accel = accel, bounciness = bounciness, checkAgainst = checkAgainst, collides = collides, friction = friction, gravityFactor = gravityFactor, maxVel = maxVel, minBounceVelocity = minBounceVelocity, name = name, pos = pos, size = size, vel = vel)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSONImpactBody]
  }
}


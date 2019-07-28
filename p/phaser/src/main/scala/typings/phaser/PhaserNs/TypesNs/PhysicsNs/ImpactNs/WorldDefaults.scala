package typings.phaser.PhaserNs.TypesNs.PhysicsNs.ImpactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing the 4 wall bodies that bound the physics world.
  */
trait WorldDefaults extends js.Object {
  /**
    * The color of this Body on the debug display.
    */
  var bodyDebugColor: Double
  /**
    * The default bounce, or restitution, of bodies in the world.
    */
  var bounciness: Double
  /**
    * Whether the Body's boundary is drawn to the debug display.
    */
  var debugShowBody: Boolean
  /**
    * Whether the Body's velocity is drawn to the debug display.
    */
  var debugShowVelocity: Boolean
  /**
    * Gravity multiplier. Set to 0 for no gravity.
    */
  var gravityFactor: Double
  /**
    * Maximum X velocity objects can move.
    */
  var maxVelocityX: Double
  /**
    * Maximum Y velocity objects can move.
    */
  var maxVelocityY: Double
  /**
    * The minimum velocity an object can be moving at to be considered for bounce.
    */
  var minBounceVelocity: Double
  /**
    * The color of the Body's velocity on the debug display.
    */
  var velocityDebugColor: Double
}

object WorldDefaults {
  @scala.inline
  def apply(
    bodyDebugColor: Double,
    bounciness: Double,
    debugShowBody: Boolean,
    debugShowVelocity: Boolean,
    gravityFactor: Double,
    maxVelocityX: Double,
    maxVelocityY: Double,
    minBounceVelocity: Double,
    velocityDebugColor: Double
  ): WorldDefaults = {
    val __obj = js.Dynamic.literal(bodyDebugColor = bodyDebugColor, bounciness = bounciness, debugShowBody = debugShowBody, debugShowVelocity = debugShowVelocity, gravityFactor = gravityFactor, maxVelocityX = maxVelocityX, maxVelocityY = maxVelocityY, minBounceVelocity = minBounceVelocity, velocityDebugColor = velocityDebugColor)
  
    __obj.asInstanceOf[WorldDefaults]
  }
}


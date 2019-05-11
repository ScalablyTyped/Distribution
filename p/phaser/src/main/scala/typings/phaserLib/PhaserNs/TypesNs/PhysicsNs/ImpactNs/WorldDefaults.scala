package typings
package phaserLib.PhaserNs.TypesNs.PhysicsNs.ImpactNs

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
  var bodyDebugColor: scala.Double
  /**
    * The default bounce, or restitution, of bodies in the world.
    */
  var bounciness: scala.Double
  /**
    * Whether the Body's boundary is drawn to the debug display.
    */
  var debugShowBody: scala.Boolean
  /**
    * Whether the Body's velocity is drawn to the debug display.
    */
  var debugShowVelocity: scala.Boolean
  /**
    * Gravity multiplier. Set to 0 for no gravity.
    */
  var gravityFactor: scala.Double
  /**
    * Maximum X velocity objects can move.
    */
  var maxVelocityX: scala.Double
  /**
    * Maximum Y velocity objects can move.
    */
  var maxVelocityY: scala.Double
  /**
    * The minimum velocity an object can be moving at to be considered for bounce.
    */
  var minBounceVelocity: scala.Double
  /**
    * The color of the Body's velocity on the debug display.
    */
  var velocityDebugColor: scala.Double
}

object WorldDefaults {
  @scala.inline
  def apply(
    bodyDebugColor: scala.Double,
    bounciness: scala.Double,
    debugShowBody: scala.Boolean,
    debugShowVelocity: scala.Boolean,
    gravityFactor: scala.Double,
    maxVelocityX: scala.Double,
    maxVelocityY: scala.Double,
    minBounceVelocity: scala.Double,
    velocityDebugColor: scala.Double
  ): WorldDefaults = {
    val __obj = js.Dynamic.literal(bodyDebugColor = bodyDebugColor, bounciness = bounciness, debugShowBody = debugShowBody, debugShowVelocity = debugShowVelocity, gravityFactor = gravityFactor, maxVelocityX = maxVelocityX, maxVelocityY = maxVelocityY, minBounceVelocity = minBounceVelocity, velocityDebugColor = velocityDebugColor)
  
    __obj.asInstanceOf[WorldDefaults]
  }
}


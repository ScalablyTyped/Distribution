package typings.phaser.Phaser.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The GravityWell action applies a force on the particle to draw it towards, or repel it from, a single point.
  * 
  * The force applied is inversely proportional to the square of the distance from the particle to the point, in accordance with Newton's law of gravity.
  * 
  * This simulates the effect of gravity over large distances (as between planets, for example).
  */
trait GravityWell extends js.Object {
  /**
    * The active state of the Gravity Well. An inactive Gravity Well will not influence any particles.
    */
  var active: Boolean
  /**
    * The minimum distance for which the gravity force is calculated.
    */
  var epsilon: Double
  /**
    * The strength of the gravity force - larger numbers produce a stronger force.
    */
  var power: Double
  /**
    * The x coordinate of the Gravity Well, in world space.
    */
  var x: Double
  /**
    * The y coordinate of the Gravity Well, in world space.
    */
  var y: Double
  /**
    * Takes a Particle and updates it based on the properties of this Gravity Well.
    * @param particle The Particle to update.
    * @param delta The delta time in ms.
    * @param step The delta value divided by 1000.
    */
  def update(particle: Particle, delta: Double, step: Double): Unit
}

object GravityWell {
  @scala.inline
  def apply(
    active: Boolean,
    epsilon: Double,
    power: Double,
    update: (Particle, Double, Double) => Unit,
    x: Double,
    y: Double
  ): GravityWell = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], epsilon = epsilon.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GravityWell]
  }
}


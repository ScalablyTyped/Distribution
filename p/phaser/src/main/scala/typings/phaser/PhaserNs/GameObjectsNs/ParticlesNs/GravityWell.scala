package typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs

import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.GravityWellConfig
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
@JSGlobal("Phaser.GameObjects.Particles.GravityWell")
@js.native
/**
  * 
  * @param x The x coordinate of the Gravity Well, in world space. Default 0.
  * @param y The y coordinate of the Gravity Well, in world space. Default 0.
  * @param power The strength of the gravity force - larger numbers produce a stronger force. Default 0.
  * @param epsilon The minimum distance for which the gravity force is calculated. Default 100.
  * @param gravity The gravitational force of this Gravity Well. Default 50.
  */
class GravityWell () extends js.Object {
  def this(x: Double) = this()
  def this(x: GravityWellConfig) = this()
  def this(x: Double, y: Double) = this()
  def this(x: GravityWellConfig, y: Double) = this()
  def this(x: Double, y: Double, power: Double) = this()
  def this(x: GravityWellConfig, y: Double, power: Double) = this()
  def this(x: Double, y: Double, power: Double, epsilon: Double) = this()
  def this(x: GravityWellConfig, y: Double, power: Double, epsilon: Double) = this()
  def this(x: Double, y: Double, power: Double, epsilon: Double, gravity: Double) = this()
  def this(x: GravityWellConfig, y: Double, power: Double, epsilon: Double, gravity: Double) = this()
  /**
    * The active state of the Gravity Well. An inactive Gravity Well will not influence any particles.
    */
  var active: Boolean = js.native
  /**
    * The minimum distance for which the gravity force is calculated.
    */
  var epsilon: Double = js.native
  /**
    * The strength of the gravity force - larger numbers produce a stronger force.
    */
  var power: Double = js.native
  /**
    * The x coordinate of the Gravity Well, in world space.
    */
  var x: Double = js.native
  /**
    * The y coordinate of the Gravity Well, in world space.
    */
  var y: Double = js.native
  /**
    * Takes a Particle and updates it based on the properties of this Gravity Well.
    * @param particle The Particle to update.
    * @param delta The delta time in ms.
    * @param step The delta value divided by 1000.
    */
  def update(particle: Particle, delta: Double, step: Double): Unit = js.native
}


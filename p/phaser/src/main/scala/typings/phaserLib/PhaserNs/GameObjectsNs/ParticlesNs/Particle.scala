package typings
package phaserLib.PhaserNs.GameObjectsNs.ParticlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Particle is a simple Game Object controlled by a Particle Emitter and Manager, and rendered by the Manager.
  * It uses its own lightweight physics system, and can interact only with its Emitter's bounds and zones.
  */
@JSGlobal("Phaser.GameObjects.Particles.Particle")
@js.native
class Particle protected () extends js.Object {
  /**
    * 
    * @param emitter The Emitter to which this Particle belongs.
    */
  def this(emitter: ParticleEmitter) = this()
  /**
    * The x acceleration of this Particle.
    */
  var accelerationX: scala.Double = js.native
  /**
    * The y acceleration of this Particle.
    */
  var accelerationY: scala.Double = js.native
  /**
    * The alpha value of this Particle.
    */
  var alpha: scala.Double = js.native
  /**
    * The angle of this Particle in degrees.
    */
  var angle: scala.Double = js.native
  /**
    * The bounciness, or restitution, of this Particle.
    */
  var bounce: scala.Double = js.native
  /**
    * The data used by the ease equation.
    */
  var data: js.Object = js.native
  /**
    * The delay applied to this Particle upon emission, in ms.
    */
  var delayCurrent: scala.Double = js.native
  /**
    * The Emitter to which this Particle belongs.
    * 
    * A Particle can only belong to a single Emitter and is created, updated and destroyed via it.
    */
  var emitter: ParticleEmitter = js.native
  /**
    * The texture frame used to render this Particle.
    */
  var frame: phaserLib.PhaserNs.TexturesNs.Frame = js.native
  /**
    * The lifespan of this Particle in ms.
    */
  var life: scala.Double = js.native
  /**
    * The current life of this Particle in ms.
    */
  var lifeCurrent: scala.Double = js.native
  /**
    * The normalized lifespan T value, where 0 is the start and 1 is the end.
    */
  var lifeT: scala.Double = js.native
  /**
    * The maximum horizontal velocity this Particle can travel at.
    */
  var maxVelocityX: scala.Double = js.native
  /**
    * The maximum vertical velocity this Particle can travel at.
    */
  var maxVelocityY: scala.Double = js.native
  /**
    * The angle of this Particle in radians.
    */
  var rotation: scala.Double = js.native
  /**
    * The horizontal scale of this Particle.
    */
  var scaleX: scala.Double = js.native
  /**
    * The vertical scale of this Particle.
    */
  var scaleY: scala.Double = js.native
  /**
    * The tint applied to this Particle.
    */
  var tint: phaserLib.integer = js.native
  /**
    * The x velocity of this Particle.
    */
  var velocityX: scala.Double = js.native
  /**
    * The y velocity of this Particle.
    */
  var velocityY: scala.Double = js.native
  /**
    * The x coordinate of this Particle.
    */
  var x: scala.Double = js.native
  /**
    * The y coordinate of this Particle.
    */
  var y: scala.Double = js.native
  /**
    * Checks if this Particle is still within the bounds defined by the given Emitter.
    * 
    * If not, and depending on the Emitter collision flags, the Particle may either stop or rebound.
    * @param emitter The Emitter to check the bounds against.
    */
  def checkBounds(emitter: ParticleEmitter): scala.Unit = js.native
  /**
    * An internal method that calculates the velocity of the Particle.
    * @param emitter The Emitter that is updating this Particle.
    * @param delta The delta time in ms.
    * @param step The delta value divided by 1000.
    * @param processors Particle processors (gravity wells).
    */
  def computeVelocity(emitter: ParticleEmitter, delta: scala.Double, step: scala.Double, processors: js.Array[_]): scala.Unit = js.native
  /**
    * Starts this Particle from the given coordinates.
    * @param x The x coordinate to launch this Particle from.
    * @param y The y coordinate to launch this Particle from.
    */
  def fire(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Checks to see if this Particle is alive and updating.
    */
  def isAlive(): scala.Boolean = js.native
  /**
    * Resets the position of this particle back to zero.
    */
  def resetPosition(): scala.Unit = js.native
  /**
    * The main update method for this Particle.
    * 
    * Updates its life values, computes the velocity and repositions the Particle.
    * @param delta The delta time in ms.
    * @param step The delta value divided by 1000.
    * @param processors An optional array of update processors.
    */
  def update(delta: scala.Double, step: scala.Double, processors: js.Array[_]): scala.Boolean = js.native
}


package typings.phaser.Phaser.GameObjects.Particles

import typings.phaser.Phaser.Textures.Frame
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Particle is a simple Game Object controlled by a Particle Emitter and Manager, and rendered by the Manager.
  * It uses its own lightweight physics system, and can interact only with its Emitter's bounds and zones.
  */
trait Particle extends js.Object {
  /**
    * The x acceleration of this Particle.
    */
  var accelerationX: Double
  /**
    * The y acceleration of this Particle.
    */
  var accelerationY: Double
  /**
    * The alpha value of this Particle.
    */
  var alpha: Double
  /**
    * The angle of this Particle in degrees.
    */
  var angle: Double
  /**
    * The bounciness, or restitution, of this Particle.
    */
  var bounce: Double
  /**
    * The data used by the ease equation.
    */
  var data: js.Object
  /**
    * The delay applied to this Particle upon emission, in ms.
    */
  var delayCurrent: Double
  /**
    * The Emitter to which this Particle belongs.
    * 
    * A Particle can only belong to a single Emitter and is created, updated and destroyed via it.
    */
  var emitter: ParticleEmitter
  /**
    * The texture frame used to render this Particle.
    */
  var frame: Frame
  /**
    * The lifespan of this Particle in ms.
    */
  var life: Double
  /**
    * The current life of this Particle in ms.
    */
  var lifeCurrent: Double
  /**
    * The normalized lifespan T value, where 0 is the start and 1 is the end.
    */
  var lifeT: Double
  /**
    * The maximum horizontal velocity this Particle can travel at.
    */
  var maxVelocityX: Double
  /**
    * The maximum vertical velocity this Particle can travel at.
    */
  var maxVelocityY: Double
  /**
    * The angle of this Particle in radians.
    */
  var rotation: Double
  /**
    * The horizontal scale of this Particle.
    */
  var scaleX: Double
  /**
    * The vertical scale of this Particle.
    */
  var scaleY: Double
  /**
    * The tint applied to this Particle.
    */
  var tint: integer
  /**
    * The x velocity of this Particle.
    */
  var velocityX: Double
  /**
    * The y velocity of this Particle.
    */
  var velocityY: Double
  /**
    * The x coordinate of this Particle.
    */
  var x: Double
  /**
    * The y coordinate of this Particle.
    */
  var y: Double
  /**
    * Checks if this Particle is still within the bounds defined by the given Emitter.
    * 
    * If not, and depending on the Emitter collision flags, the Particle may either stop or rebound.
    * @param emitter The Emitter to check the bounds against.
    */
  def checkBounds(emitter: ParticleEmitter): Unit
  /**
    * An internal method that calculates the velocity of the Particle.
    * @param emitter The Emitter that is updating this Particle.
    * @param delta The delta time in ms.
    * @param step The delta value divided by 1000.
    * @param processors Particle processors (gravity wells).
    */
  def computeVelocity(emitter: ParticleEmitter, delta: Double, step: Double, processors: js.Array[_]): Unit
  /**
    * Starts this Particle from the given coordinates.
    * @param x The x coordinate to launch this Particle from.
    * @param y The y coordinate to launch this Particle from.
    */
  def fire(x: Double, y: Double): Unit
  /**
    * Checks to see if this Particle is alive and updating.
    */
  def isAlive(): Boolean
  /**
    * Resets the position of this particle back to zero.
    */
  def resetPosition(): Unit
  /**
    * The main update method for this Particle.
    * 
    * Updates its life values, computes the velocity and repositions the Particle.
    * @param delta The delta time in ms.
    * @param step The delta value divided by 1000.
    * @param processors An optional array of update processors.
    */
  def update(delta: Double, step: Double, processors: js.Array[_]): Boolean
}

object Particle {
  @scala.inline
  def apply(
    accelerationX: Double,
    accelerationY: Double,
    alpha: Double,
    angle: Double,
    bounce: Double,
    checkBounds: ParticleEmitter => Unit,
    computeVelocity: (ParticleEmitter, Double, Double, js.Array[_]) => Unit,
    data: js.Object,
    delayCurrent: Double,
    emitter: ParticleEmitter,
    fire: (Double, Double) => Unit,
    frame: Frame,
    isAlive: () => Boolean,
    life: Double,
    lifeCurrent: Double,
    lifeT: Double,
    maxVelocityX: Double,
    maxVelocityY: Double,
    resetPosition: () => Unit,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    tint: integer,
    update: (Double, Double, js.Array[_]) => Boolean,
    velocityX: Double,
    velocityY: Double,
    x: Double,
    y: Double
  ): Particle = {
    val __obj = js.Dynamic.literal(accelerationX = accelerationX.asInstanceOf[js.Any], accelerationY = accelerationY.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], bounce = bounce.asInstanceOf[js.Any], checkBounds = js.Any.fromFunction1(checkBounds), computeVelocity = js.Any.fromFunction4(computeVelocity), data = data.asInstanceOf[js.Any], delayCurrent = delayCurrent.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], fire = js.Any.fromFunction2(fire), frame = frame.asInstanceOf[js.Any], isAlive = js.Any.fromFunction0(isAlive), life = life.asInstanceOf[js.Any], lifeCurrent = lifeCurrent.asInstanceOf[js.Any], lifeT = lifeT.asInstanceOf[js.Any], maxVelocityX = maxVelocityX.asInstanceOf[js.Any], maxVelocityY = maxVelocityY.asInstanceOf[js.Any], resetPosition = js.Any.fromFunction0(resetPosition), rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], tint = tint.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Particle]
  }
}


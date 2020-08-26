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
@js.native
trait Particle extends js.Object {
  /**
    * The x acceleration of this Particle.
    */
  var accelerationX: Double = js.native
  /**
    * The y acceleration of this Particle.
    */
  var accelerationY: Double = js.native
  /**
    * The alpha value of this Particle.
    */
  var alpha: Double = js.native
  /**
    * The angle of this Particle in degrees.
    */
  var angle: Double = js.native
  /**
    * The bounciness, or restitution, of this Particle.
    */
  var bounce: Double = js.native
  /**
    * The data used by the ease equation.
    */
  var data: js.Object = js.native
  /**
    * The delay applied to this Particle upon emission, in ms.
    */
  var delayCurrent: Double = js.native
  /**
    * The Emitter to which this Particle belongs.
    * 
    * A Particle can only belong to a single Emitter and is created, updated and destroyed via it.
    */
  var emitter: ParticleEmitter = js.native
  /**
    * The texture frame used to render this Particle.
    */
  var frame: Frame = js.native
  /**
    * The lifespan of this Particle in ms.
    */
  var life: Double = js.native
  /**
    * The current life of this Particle in ms.
    */
  var lifeCurrent: Double = js.native
  /**
    * The normalized lifespan T value, where 0 is the start and 1 is the end.
    */
  var lifeT: Double = js.native
  /**
    * The maximum horizontal velocity this Particle can travel at.
    */
  var maxVelocityX: Double = js.native
  /**
    * The maximum vertical velocity this Particle can travel at.
    */
  var maxVelocityY: Double = js.native
  /**
    * The angle of this Particle in radians.
    */
  var rotation: Double = js.native
  /**
    * The horizontal scale of this Particle.
    */
  var scaleX: Double = js.native
  /**
    * The vertical scale of this Particle.
    */
  var scaleY: Double = js.native
  /**
    * The tint applied to this Particle.
    */
  var tint: integer = js.native
  /**
    * The x velocity of this Particle.
    */
  var velocityX: Double = js.native
  /**
    * The y velocity of this Particle.
    */
  var velocityY: Double = js.native
  /**
    * The x coordinate of this Particle.
    */
  var x: Double = js.native
  /**
    * The y coordinate of this Particle.
    */
  var y: Double = js.native
  /**
    * Checks if this Particle is still within the bounds defined by the given Emitter.
    * 
    * If not, and depending on the Emitter collision flags, the Particle may either stop or rebound.
    * @param emitter The Emitter to check the bounds against.
    */
  def checkBounds(emitter: ParticleEmitter): Unit = js.native
  /**
    * An internal method that calculates the velocity of the Particle.
    * @param emitter The Emitter that is updating this Particle.
    * @param delta The delta time in ms.
    * @param step The delta value divided by 1000.
    * @param processors Particle processors (gravity wells).
    */
  def computeVelocity(emitter: ParticleEmitter, delta: Double, step: Double, processors: js.Array[_]): Unit = js.native
  /**
    * Starts this Particle from the given coordinates.
    * @param x The x coordinate to launch this Particle from.
    * @param y The y coordinate to launch this Particle from.
    */
  def fire(x: Double, y: Double): Unit = js.native
  /**
    * Checks to see if this Particle is alive and updating.
    */
  def isAlive(): Boolean = js.native
  /**
    * Resets the position of this particle back to zero.
    */
  def resetPosition(): Unit = js.native
  /**
    * The main update method for this Particle.
    * 
    * Updates its life values, computes the velocity and repositions the Particle.
    * @param delta The delta time in ms.
    * @param step The delta value divided by 1000.
    * @param processors An optional array of update processors.
    */
  def update(delta: Double, step: Double, processors: js.Array[_]): Boolean = js.native
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
  @scala.inline
  implicit class ParticleOps[Self <: Particle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccelerationX(value: Double): Self = this.set("accelerationX", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccelerationY(value: Double): Self = this.set("accelerationY", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounce(value: Double): Self = this.set("bounce", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckBounds(value: ParticleEmitter => Unit): Self = this.set("checkBounds", js.Any.fromFunction1(value))
    @scala.inline
    def setComputeVelocity(value: (ParticleEmitter, Double, Double, js.Array[_]) => Unit): Self = this.set("computeVelocity", js.Any.fromFunction4(value))
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelayCurrent(value: Double): Self = this.set("delayCurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmitter(value: ParticleEmitter): Self = this.set("emitter", value.asInstanceOf[js.Any])
    @scala.inline
    def setFire(value: (Double, Double) => Unit): Self = this.set("fire", js.Any.fromFunction2(value))
    @scala.inline
    def setFrame(value: Frame): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAlive(value: () => Boolean): Self = this.set("isAlive", js.Any.fromFunction0(value))
    @scala.inline
    def setLife(value: Double): Self = this.set("life", value.asInstanceOf[js.Any])
    @scala.inline
    def setLifeCurrent(value: Double): Self = this.set("lifeCurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def setLifeT(value: Double): Self = this.set("lifeT", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxVelocityX(value: Double): Self = this.set("maxVelocityX", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxVelocityY(value: Double): Self = this.set("maxVelocityY", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetPosition(value: () => Unit): Self = this.set("resetPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTint(value: integer): Self = this.set("tint", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: (Double, Double, js.Array[_]) => Boolean): Self = this.set("update", js.Any.fromFunction3(value))
    @scala.inline
    def setVelocityX(value: Double): Self = this.set("velocityX", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocityY(value: Double): Self = this.set("velocityY", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}


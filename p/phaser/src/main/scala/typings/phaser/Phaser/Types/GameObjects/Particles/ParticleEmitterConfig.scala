package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.BlendModes
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Particles.Particle
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticleEmitterConfig extends js.Object {
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#accelerationX} (emit only).
    */
  var accelerationX: js.UndefOr[EmitterOpOnEmitType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#accelerationY} (emit only).
    */
  var accelerationY: js.UndefOr[EmitterOpOnEmitType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#active}.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#alpha}.
    */
  var alpha: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#angle} (emit only).
    */
  var angle: js.UndefOr[EmitterOpOnEmitType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#blendMode}.
    */
  var blendMode: js.UndefOr[BlendModes | String] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#bounce} (emit only).
    */
  var bounce: js.UndefOr[EmitterOpOnEmitType] = js.undefined
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setBounds}.
    */
  var bounds: js.UndefOr[ParticleEmitterBounds | ParticleEmitterBoundsAlt] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallbackScope} and {@link Phaser.GameObjects.Particles.ParticleEmitter#emitCallbackScope}.
    */
  var callbackScope: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#collideBottom}.
    */
  var collideBottom: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#collideLeft}.
    */
  var collideLeft: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#collideRight}.
    */
  var collideRight: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#collideTop}.
    */
  var collideTop: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallback}.
    */
  var deathCallback: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallbackScope}.
    */
  var deathCallbackScope: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#delay} (emit only).
    */
  var delay: js.UndefOr[EmitterOpOnEmitType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#emitCallback}.
    */
  var emitCallback: js.UndefOr[js.Function] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#emitCallbackScope}.
    */
  var emitCallbackScope: js.UndefOr[js.Any] = js.undefined
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setEmitZone}.
    */
  var emitZone: js.UndefOr[js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#follow}.
    */
  var follow: js.UndefOr[GameObject] = js.undefined
  /**
    * Assigns to {@link Phaser.GameObjects.Particles.ParticleEmitter#followOffset}.
    */
  var followOffset: js.UndefOr[js.Object] = js.undefined
  /**
    * x-coordinate of the offset.
    */
  var `followOffset.x`: js.UndefOr[Double] = js.undefined
  /**
    * y-coordinate of the offset.
    */
  var `followOffset.y`: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#frames}.
    */
  var frame: js.UndefOr[
    Double | (js.Array[Double | Frame | String]) | String | Frame | ParticleEmitterFrameConfig
  ] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#frequency}.
    */
  var frequency: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#gravityX}.
    */
  var gravityX: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#gravityY}.
    */
  var gravityY: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#lifespan} (emit only).
    */
  var lifespan: js.UndefOr[EmitterOpOnEmitType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#maxParticles}.
    */
  var maxParticles: js.UndefOr[integer] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#maxVelocityX} (emit only).
    */
  var maxVelocityX: js.UndefOr[EmitterOpOnEmitType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#maxVelocityY} (emit only).
    */
  var maxVelocityY: js.UndefOr[EmitterOpOnEmitType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#moveToX} (emit only).
    */
  var moveToX: js.UndefOr[EmitterOpOnEmitType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#moveToY} (emit only).
    */
  var moveToY: js.UndefOr[EmitterOpOnEmitType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#name}.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#on}.
    */
  var on: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#particleBringToTop}.
    */
  var particleBringToTop: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#particleClass}.
    */
  var particleClass: js.UndefOr[Particle] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#quantity} (emit only).
    */
  var quantity: js.UndefOr[EmitterOpOnEmitType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#radial}.
    */
  var radial: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#rotate}.
    */
  var rotate: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.undefined
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setScale}.
    */
  var scale: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#scaleX}.
    */
  var scaleX: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#scaleY}.
    */
  var scaleY: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.undefined
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setSpeed} (emit only).
    */
  var speed: js.UndefOr[EmitterOpOnEmitType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#speedX} (emit only).
    */
  var speedX: js.UndefOr[EmitterOpOnEmitType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#speedY} (emit only).
    */
  var speedY: js.UndefOr[EmitterOpOnEmitType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#timeScale}.
    */
  var timeScale: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#tint}.
    */
  var tint: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#trackVisible}.
    */
  var trackVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#visible}.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#x} (emit only).
    */
  var x: js.UndefOr[EmitterOpOnEmitType] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#y} (emit only).
    */
  var y: js.UndefOr[EmitterOpOnEmitType] = js.undefined
}

object ParticleEmitterConfig {
  @scala.inline
  def apply(
    accelerationX: EmitterOpOnEmitType = null,
    accelerationY: EmitterOpOnEmitType = null,
    active: js.UndefOr[Boolean] = js.undefined,
    alpha: EmitterOpOnEmitType | EmitterOpOnUpdateType = null,
    angle: EmitterOpOnEmitType = null,
    blendMode: BlendModes | String = null,
    bounce: EmitterOpOnEmitType = null,
    bounds: ParticleEmitterBounds | ParticleEmitterBoundsAlt = null,
    callbackScope: js.Any = null,
    collideBottom: js.UndefOr[Boolean] = js.undefined,
    collideLeft: js.UndefOr[Boolean] = js.undefined,
    collideRight: js.UndefOr[Boolean] = js.undefined,
    collideTop: js.UndefOr[Boolean] = js.undefined,
    deathCallback: js.UndefOr[Boolean] = js.undefined,
    deathCallbackScope: js.Any = null,
    delay: EmitterOpOnEmitType = null,
    emitCallback: js.Function = null,
    emitCallbackScope: js.Any = null,
    emitZone: js.Object = null,
    follow: GameObject = null,
    followOffset: js.Object = null,
    `followOffset.x`: Int | Double = null,
    `followOffset.y`: Int | Double = null,
    frame: Double | (js.Array[Double | Frame | String]) | String | Frame | ParticleEmitterFrameConfig = null,
    frequency: Int | Double = null,
    gravityX: Int | Double = null,
    gravityY: Int | Double = null,
    lifespan: EmitterOpOnEmitType = null,
    maxParticles: Int | Double = null,
    maxVelocityX: EmitterOpOnEmitType = null,
    maxVelocityY: EmitterOpOnEmitType = null,
    moveToX: EmitterOpOnEmitType = null,
    moveToY: EmitterOpOnEmitType = null,
    name: String = null,
    on: js.UndefOr[Boolean] = js.undefined,
    particleBringToTop: js.UndefOr[Boolean] = js.undefined,
    particleClass: Particle = null,
    quantity: EmitterOpOnEmitType = null,
    radial: js.UndefOr[Boolean] = js.undefined,
    rotate: EmitterOpOnEmitType | EmitterOpOnUpdateType = null,
    scale: EmitterOpOnEmitType | EmitterOpOnUpdateType = null,
    scaleX: EmitterOpOnEmitType | EmitterOpOnUpdateType = null,
    scaleY: EmitterOpOnEmitType | EmitterOpOnUpdateType = null,
    speed: EmitterOpOnEmitType = null,
    speedX: EmitterOpOnEmitType = null,
    speedY: EmitterOpOnEmitType = null,
    timeScale: Int | Double = null,
    tint: EmitterOpOnEmitType | EmitterOpOnUpdateType = null,
    trackVisible: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: EmitterOpOnEmitType = null,
    y: EmitterOpOnEmitType = null
  ): ParticleEmitterConfig = {
    val __obj = js.Dynamic.literal()
    if (accelerationX != null) __obj.updateDynamic("accelerationX")(accelerationX.asInstanceOf[js.Any])
    if (accelerationY != null) __obj.updateDynamic("accelerationY")(accelerationY.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode.asInstanceOf[js.Any])
    if (bounce != null) __obj.updateDynamic("bounce")(bounce.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (callbackScope != null) __obj.updateDynamic("callbackScope")(callbackScope)
    if (!js.isUndefined(collideBottom)) __obj.updateDynamic("collideBottom")(collideBottom)
    if (!js.isUndefined(collideLeft)) __obj.updateDynamic("collideLeft")(collideLeft)
    if (!js.isUndefined(collideRight)) __obj.updateDynamic("collideRight")(collideRight)
    if (!js.isUndefined(collideTop)) __obj.updateDynamic("collideTop")(collideTop)
    if (!js.isUndefined(deathCallback)) __obj.updateDynamic("deathCallback")(deathCallback)
    if (deathCallbackScope != null) __obj.updateDynamic("deathCallbackScope")(deathCallbackScope)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (emitCallback != null) __obj.updateDynamic("emitCallback")(emitCallback)
    if (emitCallbackScope != null) __obj.updateDynamic("emitCallbackScope")(emitCallbackScope)
    if (emitZone != null) __obj.updateDynamic("emitZone")(emitZone)
    if (follow != null) __obj.updateDynamic("follow")(follow)
    if (followOffset != null) __obj.updateDynamic("followOffset")(followOffset)
    if (`followOffset.x` != null) __obj.updateDynamic("followOffset.x")(`followOffset.x`.asInstanceOf[js.Any])
    if (`followOffset.y` != null) __obj.updateDynamic("followOffset.y")(`followOffset.y`.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (gravityX != null) __obj.updateDynamic("gravityX")(gravityX.asInstanceOf[js.Any])
    if (gravityY != null) __obj.updateDynamic("gravityY")(gravityY.asInstanceOf[js.Any])
    if (lifespan != null) __obj.updateDynamic("lifespan")(lifespan.asInstanceOf[js.Any])
    if (maxParticles != null) __obj.updateDynamic("maxParticles")(maxParticles.asInstanceOf[js.Any])
    if (maxVelocityX != null) __obj.updateDynamic("maxVelocityX")(maxVelocityX.asInstanceOf[js.Any])
    if (maxVelocityY != null) __obj.updateDynamic("maxVelocityY")(maxVelocityY.asInstanceOf[js.Any])
    if (moveToX != null) __obj.updateDynamic("moveToX")(moveToX.asInstanceOf[js.Any])
    if (moveToY != null) __obj.updateDynamic("moveToY")(moveToY.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(on)) __obj.updateDynamic("on")(on)
    if (!js.isUndefined(particleBringToTop)) __obj.updateDynamic("particleBringToTop")(particleBringToTop)
    if (particleClass != null) __obj.updateDynamic("particleClass")(particleClass)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (!js.isUndefined(radial)) __obj.updateDynamic("radial")(radial)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (speedX != null) __obj.updateDynamic("speedX")(speedX.asInstanceOf[js.Any])
    if (speedY != null) __obj.updateDynamic("speedY")(speedY.asInstanceOf[js.Any])
    if (timeScale != null) __obj.updateDynamic("timeScale")(timeScale.asInstanceOf[js.Any])
    if (tint != null) __obj.updateDynamic("tint")(tint.asInstanceOf[js.Any])
    if (!js.isUndefined(trackVisible)) __obj.updateDynamic("trackVisible")(trackVisible)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterConfig]
  }
}


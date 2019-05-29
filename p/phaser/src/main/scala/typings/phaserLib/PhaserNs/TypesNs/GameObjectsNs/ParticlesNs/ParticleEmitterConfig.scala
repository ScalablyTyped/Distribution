package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticleEmitterConfig extends js.Object {
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#accelerationX} (emit only).
    */
  var accelerationX: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#accelerationY} (emit only).
    */
  var accelerationY: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#active}.
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#alpha}.
    */
  var alpha: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnUpdateCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#angle} (emit only)
    */
  var angle: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#blendMode}.
    */
  var blendMode: js.UndefOr[phaserLib.PhaserNs.BlendModes | java.lang.String] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#bounce} (emit only).
    */
  var bounce: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
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
  var collideBottom: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#collideLeft}.
    */
  var collideLeft: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#collideRight}.
    */
  var collideRight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#collideTop}.
    */
  var collideTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallback}.
    */
  var deathCallback: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallbackScope}.
    */
  var deathCallbackScope: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#delay} (emit only).
    */
  var delay: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
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
  var follow: js.UndefOr[phaserLib.PhaserNs.GameObjectsNs.GameObject] = js.undefined
  /**
    * Assigns to {@link Phaser.GameObjects.Particles.ParticleEmitter#followOffset}.
    */
  var followOffset: js.UndefOr[js.Object] = js.undefined
  /**
    * x-coordinate of the offset.
    */
  var `followOffset.x`: js.UndefOr[scala.Double] = js.undefined
  /**
    * y-coordinate of the offset.
    */
  var `followOffset.y`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#frames}.
    */
  var frame: js.UndefOr[
    scala.Double | (js.Array[scala.Double | phaserLib.PhaserNs.TexturesNs.Frame | java.lang.String]) | java.lang.String | phaserLib.PhaserNs.TexturesNs.Frame | ParticleEmitterFrameConfig
  ] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#frequency}.
    */
  var frequency: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#gravityX}.
    */
  var gravityX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#gravityY}.
    */
  var gravityY: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#lifespan} (emit only).
    */
  var lifespan: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#maxParticles}.
    */
  var maxParticles: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#maxVelocityX} (emit only).
    */
  var maxVelocityX: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#maxVelocityY} (emit only).
    */
  var maxVelocityY: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#moveToX} (emit only).
    */
  var moveToX: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#moveToY} (emit only).
    */
  var moveToY: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#name}.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#on}.
    */
  var on: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#particleBringToTop}.
    */
  var particleBringToTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#particleClass}.
    */
  var particleClass: js.UndefOr[phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.Particle] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#quantity} (emit only).
    */
  var quantity: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#radial}.
    */
  var radial: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#rotate}.
    */
  var rotate: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnUpdateCallback | js.Object] = js.undefined
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setScale}.
    */
  var scale: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnUpdateCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#scaleX}.
    */
  var scaleX: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnUpdateCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#scaleY}.
    */
  var scaleY: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnUpdateCallback | js.Object] = js.undefined
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setSpeed} (emit only).
    */
  var speed: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#speedX} (emit only).
    */
  var speedX: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#speedY} (emit only).
    */
  var speedY: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#timeScale}.
    */
  var timeScale: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#tint}.
    */
  var tint: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#trackVisible}.
    */
  var trackVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#visible}.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#x} (emit only).
    */
  var x: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#y} (emit only).
    */
  var y: js.UndefOr[scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object] = js.undefined
}

object ParticleEmitterConfig {
  @scala.inline
  def apply(
    accelerationX: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    accelerationY: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    alpha: scala.Double | js.Array[scala.Double] | EmitterOpOnUpdateCallback | js.Object = null,
    angle: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    blendMode: phaserLib.PhaserNs.BlendModes | java.lang.String = null,
    bounce: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    bounds: ParticleEmitterBounds | ParticleEmitterBoundsAlt = null,
    callbackScope: js.Any = null,
    collideBottom: js.UndefOr[scala.Boolean] = js.undefined,
    collideLeft: js.UndefOr[scala.Boolean] = js.undefined,
    collideRight: js.UndefOr[scala.Boolean] = js.undefined,
    collideTop: js.UndefOr[scala.Boolean] = js.undefined,
    deathCallback: js.UndefOr[scala.Boolean] = js.undefined,
    deathCallbackScope: js.Any = null,
    delay: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    emitCallback: js.Function = null,
    emitCallbackScope: js.Any = null,
    emitZone: js.Object = null,
    follow: phaserLib.PhaserNs.GameObjectsNs.GameObject = null,
    followOffset: js.Object = null,
    `followOffset.x`: scala.Int | scala.Double = null,
    `followOffset.y`: scala.Int | scala.Double = null,
    frame: scala.Double | (js.Array[scala.Double | phaserLib.PhaserNs.TexturesNs.Frame | java.lang.String]) | java.lang.String | phaserLib.PhaserNs.TexturesNs.Frame | ParticleEmitterFrameConfig = null,
    frequency: scala.Int | scala.Double = null,
    gravityX: scala.Int | scala.Double = null,
    gravityY: scala.Int | scala.Double = null,
    lifespan: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    maxParticles: js.UndefOr[phaserLib.integer] = js.undefined,
    maxVelocityX: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    maxVelocityY: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    moveToX: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    moveToY: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    name: java.lang.String = null,
    on: js.UndefOr[scala.Boolean] = js.undefined,
    particleBringToTop: js.UndefOr[scala.Boolean] = js.undefined,
    particleClass: phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.Particle = null,
    quantity: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    radial: js.UndefOr[scala.Boolean] = js.undefined,
    rotate: scala.Double | js.Array[scala.Double] | EmitterOpOnUpdateCallback | js.Object = null,
    scale: scala.Double | js.Array[scala.Double] | EmitterOpOnUpdateCallback | js.Object = null,
    scaleX: scala.Double | js.Array[scala.Double] | EmitterOpOnUpdateCallback | js.Object = null,
    scaleY: scala.Double | js.Array[scala.Double] | EmitterOpOnUpdateCallback | js.Object = null,
    speed: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    speedX: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    speedY: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    timeScale: scala.Int | scala.Double = null,
    tint: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    trackVisible: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    x: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null,
    y: scala.Double | js.Array[scala.Double] | EmitterOpOnEmitCallback | js.Object = null
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
    if (!js.isUndefined(maxParticles)) __obj.updateDynamic("maxParticles")(maxParticles)
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


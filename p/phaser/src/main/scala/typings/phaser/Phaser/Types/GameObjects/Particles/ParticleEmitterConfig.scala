package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.BlendModes
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Particles.Particle
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticleEmitterConfig extends js.Object {
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#accelerationX} (emit only).
    */
  var accelerationX: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#accelerationY} (emit only).
    */
  var accelerationY: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#active}.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#alpha}.
    */
  var alpha: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#angle} (emit only).
    */
  var angle: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#blendMode}.
    */
  var blendMode: js.UndefOr[BlendModes | String] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#bounce} (emit only).
    */
  var bounce: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setBounds}.
    */
  var bounds: js.UndefOr[ParticleEmitterBounds | ParticleEmitterBoundsAlt] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallbackScope} and {@link Phaser.GameObjects.Particles.ParticleEmitter#emitCallbackScope}.
    */
  var callbackScope: js.UndefOr[js.Any] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#collideBottom}.
    */
  var collideBottom: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#collideLeft}.
    */
  var collideLeft: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#collideRight}.
    */
  var collideRight: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#collideTop}.
    */
  var collideTop: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallback}.
    */
  var deathCallback: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallbackScope}.
    */
  var deathCallbackScope: js.UndefOr[js.Any] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#delay} (emit only).
    */
  var delay: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#emitCallback}.
    */
  var emitCallback: js.UndefOr[js.Function] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#emitCallbackScope}.
    */
  var emitCallbackScope: js.UndefOr[js.Any] = js.native
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setEmitZone}.
    */
  var emitZone: js.UndefOr[js.Object] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#follow}.
    */
  var follow: js.UndefOr[GameObject] = js.native
  /**
    * Assigns to {@link Phaser.GameObjects.Particles.ParticleEmitter#followOffset}.
    */
  var followOffset: js.UndefOr[js.Object] = js.native
  /**
    * x-coordinate of the offset.
    */
  @JSName("followOffset.x")
  var followOffsetDotx: js.UndefOr[Double] = js.native
  /**
    * y-coordinate of the offset.
    */
  @JSName("followOffset.y")
  var followOffsetDoty: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#frames}.
    */
  var frame: js.UndefOr[
    Double | (js.Array[Double | Frame | String]) | String | Frame | ParticleEmitterFrameConfig
  ] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#frequency}.
    */
  var frequency: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#gravityX}.
    */
  var gravityX: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#gravityY}.
    */
  var gravityY: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#lifespan} (emit only).
    */
  var lifespan: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#maxParticles}.
    */
  var maxParticles: js.UndefOr[integer] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#maxVelocityX} (emit only).
    */
  var maxVelocityX: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#maxVelocityY} (emit only).
    */
  var maxVelocityY: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#moveToX} (emit only).
    */
  var moveToX: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#moveToY} (emit only).
    */
  var moveToY: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#name}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#on}.
    */
  var on: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#particleBringToTop}.
    */
  var particleBringToTop: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#particleClass}.
    */
  var particleClass: js.UndefOr[Particle] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#quantity} (emit only).
    */
  var quantity: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#radial}.
    */
  var radial: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#rotate}.
    */
  var rotate: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.native
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setScale}.
    */
  var scale: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#scaleX}.
    */
  var scaleX: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#scaleY}.
    */
  var scaleY: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.native
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setSpeed} (emit only).
    */
  var speed: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#speedX} (emit only).
    */
  var speedX: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#speedY} (emit only).
    */
  var speedY: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#timeScale}.
    */
  var timeScale: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#tint}.
    */
  var tint: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#trackVisible}.
    */
  var trackVisible: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#visible}.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#x} (emit only).
    */
  var x: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#y} (emit only).
    */
  var y: js.UndefOr[EmitterOpOnEmitType] = js.native
}

object ParticleEmitterConfig {
  @scala.inline
  def apply(): ParticleEmitterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticleEmitterConfig]
  }
  @scala.inline
  implicit class ParticleEmitterConfigOps[Self <: ParticleEmitterConfig] (val x: Self) extends AnyVal {
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
    def setAccelerationXVarargs(value: Double*): Self = this.set("accelerationX", js.Array(value :_*))
    @scala.inline
    def setAccelerationXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("accelerationX", js.Any.fromFunction3(value))
    @scala.inline
    def setAccelerationX(value: EmitterOpOnEmitType): Self = this.set("accelerationX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerationX: Self = this.set("accelerationX", js.undefined)
    @scala.inline
    def setAccelerationYVarargs(value: Double*): Self = this.set("accelerationY", js.Array(value :_*))
    @scala.inline
    def setAccelerationYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("accelerationY", js.Any.fromFunction3(value))
    @scala.inline
    def setAccelerationY(value: EmitterOpOnEmitType): Self = this.set("accelerationY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerationY: Self = this.set("accelerationY", js.undefined)
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAlphaVarargs(value: Double*): Self = this.set("alpha", js.Array(value :_*))
    @scala.inline
    def setAlphaFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = this.set("alpha", js.Any.fromFunction4(value))
    @scala.inline
    def setAlphaFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("alpha", js.Any.fromFunction3(value))
    @scala.inline
    def setAlpha(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setAngleVarargs(value: Double*): Self = this.set("angle", js.Array(value :_*))
    @scala.inline
    def setAngleFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("angle", js.Any.fromFunction3(value))
    @scala.inline
    def setAngle(value: EmitterOpOnEmitType): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setBlendMode(value: BlendModes | String): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlendMode: Self = this.set("blendMode", js.undefined)
    @scala.inline
    def setBounceVarargs(value: Double*): Self = this.set("bounce", js.Array(value :_*))
    @scala.inline
    def setBounceFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("bounce", js.Any.fromFunction3(value))
    @scala.inline
    def setBounce(value: EmitterOpOnEmitType): Self = this.set("bounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounce: Self = this.set("bounce", js.undefined)
    @scala.inline
    def setBounds(value: ParticleEmitterBounds | ParticleEmitterBoundsAlt): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setCallbackScope(value: js.Any): Self = this.set("callbackScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackScope: Self = this.set("callbackScope", js.undefined)
    @scala.inline
    def setCollideBottom(value: Boolean): Self = this.set("collideBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollideBottom: Self = this.set("collideBottom", js.undefined)
    @scala.inline
    def setCollideLeft(value: Boolean): Self = this.set("collideLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollideLeft: Self = this.set("collideLeft", js.undefined)
    @scala.inline
    def setCollideRight(value: Boolean): Self = this.set("collideRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollideRight: Self = this.set("collideRight", js.undefined)
    @scala.inline
    def setCollideTop(value: Boolean): Self = this.set("collideTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollideTop: Self = this.set("collideTop", js.undefined)
    @scala.inline
    def setDeathCallback(value: Boolean): Self = this.set("deathCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeathCallback: Self = this.set("deathCallback", js.undefined)
    @scala.inline
    def setDeathCallbackScope(value: js.Any): Self = this.set("deathCallbackScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeathCallbackScope: Self = this.set("deathCallbackScope", js.undefined)
    @scala.inline
    def setDelayVarargs(value: Double*): Self = this.set("delay", js.Array(value :_*))
    @scala.inline
    def setDelayFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("delay", js.Any.fromFunction3(value))
    @scala.inline
    def setDelay(value: EmitterOpOnEmitType): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setEmitCallback(value: js.Function): Self = this.set("emitCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitCallback: Self = this.set("emitCallback", js.undefined)
    @scala.inline
    def setEmitCallbackScope(value: js.Any): Self = this.set("emitCallbackScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitCallbackScope: Self = this.set("emitCallbackScope", js.undefined)
    @scala.inline
    def setEmitZone(value: js.Object): Self = this.set("emitZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitZone: Self = this.set("emitZone", js.undefined)
    @scala.inline
    def setFollow(value: GameObject): Self = this.set("follow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    @scala.inline
    def setFollowOffset(value: js.Object): Self = this.set("followOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowOffset: Self = this.set("followOffset", js.undefined)
    @scala.inline
    def setFollowOffsetDotx(value: Double): Self = this.set("followOffset.x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowOffsetDotx: Self = this.set("followOffset.x", js.undefined)
    @scala.inline
    def setFollowOffsetDoty(value: Double): Self = this.set("followOffset.y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowOffsetDoty: Self = this.set("followOffset.y", js.undefined)
    @scala.inline
    def setFrameVarargs(value: (Double | Frame | String)*): Self = this.set("frame", js.Array(value :_*))
    @scala.inline
    def setFrame(value: Double | (js.Array[Double | Frame | String]) | String | Frame | ParticleEmitterFrameConfig): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    @scala.inline
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    @scala.inline
    def setGravityX(value: Double): Self = this.set("gravityX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravityX: Self = this.set("gravityX", js.undefined)
    @scala.inline
    def setGravityY(value: Double): Self = this.set("gravityY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravityY: Self = this.set("gravityY", js.undefined)
    @scala.inline
    def setLifespanVarargs(value: Double*): Self = this.set("lifespan", js.Array(value :_*))
    @scala.inline
    def setLifespanFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("lifespan", js.Any.fromFunction3(value))
    @scala.inline
    def setLifespan(value: EmitterOpOnEmitType): Self = this.set("lifespan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifespan: Self = this.set("lifespan", js.undefined)
    @scala.inline
    def setMaxParticles(value: integer): Self = this.set("maxParticles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxParticles: Self = this.set("maxParticles", js.undefined)
    @scala.inline
    def setMaxVelocityXVarargs(value: Double*): Self = this.set("maxVelocityX", js.Array(value :_*))
    @scala.inline
    def setMaxVelocityXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("maxVelocityX", js.Any.fromFunction3(value))
    @scala.inline
    def setMaxVelocityX(value: EmitterOpOnEmitType): Self = this.set("maxVelocityX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxVelocityX: Self = this.set("maxVelocityX", js.undefined)
    @scala.inline
    def setMaxVelocityYVarargs(value: Double*): Self = this.set("maxVelocityY", js.Array(value :_*))
    @scala.inline
    def setMaxVelocityYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("maxVelocityY", js.Any.fromFunction3(value))
    @scala.inline
    def setMaxVelocityY(value: EmitterOpOnEmitType): Self = this.set("maxVelocityY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxVelocityY: Self = this.set("maxVelocityY", js.undefined)
    @scala.inline
    def setMoveToXVarargs(value: Double*): Self = this.set("moveToX", js.Array(value :_*))
    @scala.inline
    def setMoveToXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("moveToX", js.Any.fromFunction3(value))
    @scala.inline
    def setMoveToX(value: EmitterOpOnEmitType): Self = this.set("moveToX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveToX: Self = this.set("moveToX", js.undefined)
    @scala.inline
    def setMoveToYVarargs(value: Double*): Self = this.set("moveToY", js.Array(value :_*))
    @scala.inline
    def setMoveToYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("moveToY", js.Any.fromFunction3(value))
    @scala.inline
    def setMoveToY(value: EmitterOpOnEmitType): Self = this.set("moveToY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveToY: Self = this.set("moveToY", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOn(value: Boolean): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setParticleBringToTop(value: Boolean): Self = this.set("particleBringToTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParticleBringToTop: Self = this.set("particleBringToTop", js.undefined)
    @scala.inline
    def setParticleClass(value: Particle): Self = this.set("particleClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParticleClass: Self = this.set("particleClass", js.undefined)
    @scala.inline
    def setQuantityVarargs(value: Double*): Self = this.set("quantity", js.Array(value :_*))
    @scala.inline
    def setQuantityFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("quantity", js.Any.fromFunction3(value))
    @scala.inline
    def setQuantity(value: EmitterOpOnEmitType): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setRadial(value: Boolean): Self = this.set("radial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadial: Self = this.set("radial", js.undefined)
    @scala.inline
    def setRotateVarargs(value: Double*): Self = this.set("rotate", js.Array(value :_*))
    @scala.inline
    def setRotateFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = this.set("rotate", js.Any.fromFunction4(value))
    @scala.inline
    def setRotateFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("rotate", js.Any.fromFunction3(value))
    @scala.inline
    def setRotate(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setScaleVarargs(value: Double*): Self = this.set("scale", js.Array(value :_*))
    @scala.inline
    def setScaleFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = this.set("scale", js.Any.fromFunction4(value))
    @scala.inline
    def setScaleFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("scale", js.Any.fromFunction3(value))
    @scala.inline
    def setScale(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setScaleXVarargs(value: Double*): Self = this.set("scaleX", js.Array(value :_*))
    @scala.inline
    def setScaleXFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = this.set("scaleX", js.Any.fromFunction4(value))
    @scala.inline
    def setScaleXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("scaleX", js.Any.fromFunction3(value))
    @scala.inline
    def setScaleX(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    @scala.inline
    def setScaleYVarargs(value: Double*): Self = this.set("scaleY", js.Array(value :_*))
    @scala.inline
    def setScaleYFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = this.set("scaleY", js.Any.fromFunction4(value))
    @scala.inline
    def setScaleYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("scaleY", js.Any.fromFunction3(value))
    @scala.inline
    def setScaleY(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    @scala.inline
    def setSpeedVarargs(value: Double*): Self = this.set("speed", js.Array(value :_*))
    @scala.inline
    def setSpeedFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("speed", js.Any.fromFunction3(value))
    @scala.inline
    def setSpeed(value: EmitterOpOnEmitType): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setSpeedXVarargs(value: Double*): Self = this.set("speedX", js.Array(value :_*))
    @scala.inline
    def setSpeedXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("speedX", js.Any.fromFunction3(value))
    @scala.inline
    def setSpeedX(value: EmitterOpOnEmitType): Self = this.set("speedX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeedX: Self = this.set("speedX", js.undefined)
    @scala.inline
    def setSpeedYVarargs(value: Double*): Self = this.set("speedY", js.Array(value :_*))
    @scala.inline
    def setSpeedYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("speedY", js.Any.fromFunction3(value))
    @scala.inline
    def setSpeedY(value: EmitterOpOnEmitType): Self = this.set("speedY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeedY: Self = this.set("speedY", js.undefined)
    @scala.inline
    def setTimeScale(value: Double): Self = this.set("timeScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeScale: Self = this.set("timeScale", js.undefined)
    @scala.inline
    def setTintVarargs(value: Double*): Self = this.set("tint", js.Array(value :_*))
    @scala.inline
    def setTintFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = this.set("tint", js.Any.fromFunction4(value))
    @scala.inline
    def setTintFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("tint", js.Any.fromFunction3(value))
    @scala.inline
    def setTint(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = this.set("tint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTint: Self = this.set("tint", js.undefined)
    @scala.inline
    def setTrackVisible(value: Boolean): Self = this.set("trackVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackVisible: Self = this.set("trackVisible", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setXVarargs(value: Double*): Self = this.set("x", js.Array(value :_*))
    @scala.inline
    def setXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("x", js.Any.fromFunction3(value))
    @scala.inline
    def setX(value: EmitterOpOnEmitType): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setYVarargs(value: Double*): Self = this.set("y", js.Array(value :_*))
    @scala.inline
    def setYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = this.set("y", js.Any.fromFunction3(value))
    @scala.inline
    def setY(value: EmitterOpOnEmitType): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}


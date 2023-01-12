package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.BlendModes
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Particles.Particle
import typings.phaser.Phaser.Textures.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticleEmitterConfig extends StObject {
  
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
  var callbackScope: js.UndefOr[Any] = js.undefined
  
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
  var deathCallback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallbackScope}.
    */
  var deathCallbackScope: js.UndefOr[Any] = js.undefined
  
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setDeathZone}.
    */
  var deathZone: js.UndefOr[ParticleEmitterDeathZoneConfig] = js.undefined
  
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
  var emitCallbackScope: js.UndefOr[Any] = js.undefined
  
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setEmitZone}.
    */
  var emitZone: js.UndefOr[ParticleEmitterEdgeZoneConfig | ParticleEmitterRandomZoneConfig] = js.undefined
  
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
  @JSName("followOffset.x")
  var followOffsetDotx: js.UndefOr[Double] = js.undefined
  
  /**
    * y-coordinate of the offset.
    */
  @JSName("followOffset.y")
  var followOffsetDoty: js.UndefOr[Double] = js.undefined
  
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
  var maxParticles: js.UndefOr[Double] = js.undefined
  
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
    * Creates specified number of inactive particles and adds them to this emitter's pool. {@link Phaser.GameObjects.Particles.ParticleEmitter#reserve}
    */
  var reserve: js.UndefOr[Double] = js.undefined
  
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
  
  inline def apply(): ParticleEmitterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticleEmitterConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticleEmitterConfig] (val x: Self) extends AnyVal {
    
    inline def setAccelerationX(value: EmitterOpOnEmitType): Self = StObject.set(x, "accelerationX", value.asInstanceOf[js.Any])
    
    inline def setAccelerationXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "accelerationX", js.Any.fromFunction3(value))
    
    inline def setAccelerationXUndefined: Self = StObject.set(x, "accelerationX", js.undefined)
    
    inline def setAccelerationXVarargs(value: Double*): Self = StObject.set(x, "accelerationX", js.Array(value*))
    
    inline def setAccelerationY(value: EmitterOpOnEmitType): Self = StObject.set(x, "accelerationY", value.asInstanceOf[js.Any])
    
    inline def setAccelerationYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "accelerationY", js.Any.fromFunction3(value))
    
    inline def setAccelerationYUndefined: Self = StObject.set(x, "accelerationY", js.undefined)
    
    inline def setAccelerationYVarargs(value: Double*): Self = StObject.set(x, "accelerationY", js.Array(value*))
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAlpha(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "alpha", js.Any.fromFunction3(value))
    
    inline def setAlphaFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = StObject.set(x, "alpha", js.Any.fromFunction4(value))
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setAlphaVarargs(value: Double*): Self = StObject.set(x, "alpha", js.Array(value*))
    
    inline def setAngle(value: EmitterOpOnEmitType): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "angle", js.Any.fromFunction3(value))
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setAngleVarargs(value: Double*): Self = StObject.set(x, "angle", js.Array(value*))
    
    inline def setBlendMode(value: BlendModes | String): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
    
    inline def setBounce(value: EmitterOpOnEmitType): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
    
    inline def setBounceFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "bounce", js.Any.fromFunction3(value))
    
    inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
    
    inline def setBounceVarargs(value: Double*): Self = StObject.set(x, "bounce", js.Array(value*))
    
    inline def setBounds(value: ParticleEmitterBounds | ParticleEmitterBoundsAlt): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setCallbackScope(value: Any): Self = StObject.set(x, "callbackScope", value.asInstanceOf[js.Any])
    
    inline def setCallbackScopeUndefined: Self = StObject.set(x, "callbackScope", js.undefined)
    
    inline def setCollideBottom(value: Boolean): Self = StObject.set(x, "collideBottom", value.asInstanceOf[js.Any])
    
    inline def setCollideBottomUndefined: Self = StObject.set(x, "collideBottom", js.undefined)
    
    inline def setCollideLeft(value: Boolean): Self = StObject.set(x, "collideLeft", value.asInstanceOf[js.Any])
    
    inline def setCollideLeftUndefined: Self = StObject.set(x, "collideLeft", js.undefined)
    
    inline def setCollideRight(value: Boolean): Self = StObject.set(x, "collideRight", value.asInstanceOf[js.Any])
    
    inline def setCollideRightUndefined: Self = StObject.set(x, "collideRight", js.undefined)
    
    inline def setCollideTop(value: Boolean): Self = StObject.set(x, "collideTop", value.asInstanceOf[js.Any])
    
    inline def setCollideTopUndefined: Self = StObject.set(x, "collideTop", js.undefined)
    
    inline def setDeathCallback(value: js.Function): Self = StObject.set(x, "deathCallback", value.asInstanceOf[js.Any])
    
    inline def setDeathCallbackScope(value: Any): Self = StObject.set(x, "deathCallbackScope", value.asInstanceOf[js.Any])
    
    inline def setDeathCallbackScopeUndefined: Self = StObject.set(x, "deathCallbackScope", js.undefined)
    
    inline def setDeathCallbackUndefined: Self = StObject.set(x, "deathCallback", js.undefined)
    
    inline def setDeathZone(value: ParticleEmitterDeathZoneConfig): Self = StObject.set(x, "deathZone", value.asInstanceOf[js.Any])
    
    inline def setDeathZoneUndefined: Self = StObject.set(x, "deathZone", js.undefined)
    
    inline def setDelay(value: EmitterOpOnEmitType): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "delay", js.Any.fromFunction3(value))
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDelayVarargs(value: Double*): Self = StObject.set(x, "delay", js.Array(value*))
    
    inline def setEmitCallback(value: js.Function): Self = StObject.set(x, "emitCallback", value.asInstanceOf[js.Any])
    
    inline def setEmitCallbackScope(value: Any): Self = StObject.set(x, "emitCallbackScope", value.asInstanceOf[js.Any])
    
    inline def setEmitCallbackScopeUndefined: Self = StObject.set(x, "emitCallbackScope", js.undefined)
    
    inline def setEmitCallbackUndefined: Self = StObject.set(x, "emitCallback", js.undefined)
    
    inline def setEmitZone(value: ParticleEmitterEdgeZoneConfig | ParticleEmitterRandomZoneConfig): Self = StObject.set(x, "emitZone", value.asInstanceOf[js.Any])
    
    inline def setEmitZoneUndefined: Self = StObject.set(x, "emitZone", js.undefined)
    
    inline def setFollow(value: GameObject): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    inline def setFollowOffset(value: js.Object): Self = StObject.set(x, "followOffset", value.asInstanceOf[js.Any])
    
    inline def setFollowOffsetDotx(value: Double): Self = StObject.set(x, "followOffset.x", value.asInstanceOf[js.Any])
    
    inline def setFollowOffsetDotxUndefined: Self = StObject.set(x, "followOffset.x", js.undefined)
    
    inline def setFollowOffsetDoty(value: Double): Self = StObject.set(x, "followOffset.y", value.asInstanceOf[js.Any])
    
    inline def setFollowOffsetDotyUndefined: Self = StObject.set(x, "followOffset.y", js.undefined)
    
    inline def setFollowOffsetUndefined: Self = StObject.set(x, "followOffset", js.undefined)
    
    inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    inline def setFrame(value: Double | (js.Array[Double | Frame | String]) | String | Frame | ParticleEmitterFrameConfig): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setFrameVarargs(value: (Double | Frame | String)*): Self = StObject.set(x, "frame", js.Array(value*))
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setGravityX(value: Double): Self = StObject.set(x, "gravityX", value.asInstanceOf[js.Any])
    
    inline def setGravityXUndefined: Self = StObject.set(x, "gravityX", js.undefined)
    
    inline def setGravityY(value: Double): Self = StObject.set(x, "gravityY", value.asInstanceOf[js.Any])
    
    inline def setGravityYUndefined: Self = StObject.set(x, "gravityY", js.undefined)
    
    inline def setLifespan(value: EmitterOpOnEmitType): Self = StObject.set(x, "lifespan", value.asInstanceOf[js.Any])
    
    inline def setLifespanFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "lifespan", js.Any.fromFunction3(value))
    
    inline def setLifespanUndefined: Self = StObject.set(x, "lifespan", js.undefined)
    
    inline def setLifespanVarargs(value: Double*): Self = StObject.set(x, "lifespan", js.Array(value*))
    
    inline def setMaxParticles(value: Double): Self = StObject.set(x, "maxParticles", value.asInstanceOf[js.Any])
    
    inline def setMaxParticlesUndefined: Self = StObject.set(x, "maxParticles", js.undefined)
    
    inline def setMaxVelocityX(value: EmitterOpOnEmitType): Self = StObject.set(x, "maxVelocityX", value.asInstanceOf[js.Any])
    
    inline def setMaxVelocityXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "maxVelocityX", js.Any.fromFunction3(value))
    
    inline def setMaxVelocityXUndefined: Self = StObject.set(x, "maxVelocityX", js.undefined)
    
    inline def setMaxVelocityXVarargs(value: Double*): Self = StObject.set(x, "maxVelocityX", js.Array(value*))
    
    inline def setMaxVelocityY(value: EmitterOpOnEmitType): Self = StObject.set(x, "maxVelocityY", value.asInstanceOf[js.Any])
    
    inline def setMaxVelocityYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "maxVelocityY", js.Any.fromFunction3(value))
    
    inline def setMaxVelocityYUndefined: Self = StObject.set(x, "maxVelocityY", js.undefined)
    
    inline def setMaxVelocityYVarargs(value: Double*): Self = StObject.set(x, "maxVelocityY", js.Array(value*))
    
    inline def setMoveToX(value: EmitterOpOnEmitType): Self = StObject.set(x, "moveToX", value.asInstanceOf[js.Any])
    
    inline def setMoveToXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "moveToX", js.Any.fromFunction3(value))
    
    inline def setMoveToXUndefined: Self = StObject.set(x, "moveToX", js.undefined)
    
    inline def setMoveToXVarargs(value: Double*): Self = StObject.set(x, "moveToX", js.Array(value*))
    
    inline def setMoveToY(value: EmitterOpOnEmitType): Self = StObject.set(x, "moveToY", value.asInstanceOf[js.Any])
    
    inline def setMoveToYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "moveToY", js.Any.fromFunction3(value))
    
    inline def setMoveToYUndefined: Self = StObject.set(x, "moveToY", js.undefined)
    
    inline def setMoveToYVarargs(value: Double*): Self = StObject.set(x, "moveToY", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setParticleBringToTop(value: Boolean): Self = StObject.set(x, "particleBringToTop", value.asInstanceOf[js.Any])
    
    inline def setParticleBringToTopUndefined: Self = StObject.set(x, "particleBringToTop", js.undefined)
    
    inline def setParticleClass(value: Particle): Self = StObject.set(x, "particleClass", value.asInstanceOf[js.Any])
    
    inline def setParticleClassUndefined: Self = StObject.set(x, "particleClass", js.undefined)
    
    inline def setQuantity(value: EmitterOpOnEmitType): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "quantity", js.Any.fromFunction3(value))
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setQuantityVarargs(value: Double*): Self = StObject.set(x, "quantity", js.Array(value*))
    
    inline def setRadial(value: Boolean): Self = StObject.set(x, "radial", value.asInstanceOf[js.Any])
    
    inline def setRadialUndefined: Self = StObject.set(x, "radial", js.undefined)
    
    inline def setReserve(value: Double): Self = StObject.set(x, "reserve", value.asInstanceOf[js.Any])
    
    inline def setReserveUndefined: Self = StObject.set(x, "reserve", js.undefined)
    
    inline def setRotate(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "rotate", js.Any.fromFunction3(value))
    
    inline def setRotateFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = StObject.set(x, "rotate", js.Any.fromFunction4(value))
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setRotateVarargs(value: Double*): Self = StObject.set(x, "rotate", js.Array(value*))
    
    inline def setScale(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "scale", js.Any.fromFunction3(value))
    
    inline def setScaleFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = StObject.set(x, "scale", js.Any.fromFunction4(value))
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value*))
    
    inline def setScaleX(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "scaleX", js.Any.fromFunction3(value))
    
    inline def setScaleXFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = StObject.set(x, "scaleX", js.Any.fromFunction4(value))
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleXVarargs(value: Double*): Self = StObject.set(x, "scaleX", js.Array(value*))
    
    inline def setScaleY(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "scaleY", js.Any.fromFunction3(value))
    
    inline def setScaleYFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = StObject.set(x, "scaleY", js.Any.fromFunction4(value))
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setScaleYVarargs(value: Double*): Self = StObject.set(x, "scaleY", js.Array(value*))
    
    inline def setSpeed(value: EmitterOpOnEmitType): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "speed", js.Any.fromFunction3(value))
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setSpeedVarargs(value: Double*): Self = StObject.set(x, "speed", js.Array(value*))
    
    inline def setSpeedX(value: EmitterOpOnEmitType): Self = StObject.set(x, "speedX", value.asInstanceOf[js.Any])
    
    inline def setSpeedXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "speedX", js.Any.fromFunction3(value))
    
    inline def setSpeedXUndefined: Self = StObject.set(x, "speedX", js.undefined)
    
    inline def setSpeedXVarargs(value: Double*): Self = StObject.set(x, "speedX", js.Array(value*))
    
    inline def setSpeedY(value: EmitterOpOnEmitType): Self = StObject.set(x, "speedY", value.asInstanceOf[js.Any])
    
    inline def setSpeedYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "speedY", js.Any.fromFunction3(value))
    
    inline def setSpeedYUndefined: Self = StObject.set(x, "speedY", js.undefined)
    
    inline def setSpeedYVarargs(value: Double*): Self = StObject.set(x, "speedY", js.Array(value*))
    
    inline def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
    
    inline def setTimeScaleUndefined: Self = StObject.set(x, "timeScale", js.undefined)
    
    inline def setTint(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
    
    inline def setTintFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "tint", js.Any.fromFunction3(value))
    
    inline def setTintFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = StObject.set(x, "tint", js.Any.fromFunction4(value))
    
    inline def setTintUndefined: Self = StObject.set(x, "tint", js.undefined)
    
    inline def setTintVarargs(value: Double*): Self = StObject.set(x, "tint", js.Array(value*))
    
    inline def setTrackVisible(value: Boolean): Self = StObject.set(x, "trackVisible", value.asInstanceOf[js.Any])
    
    inline def setTrackVisibleUndefined: Self = StObject.set(x, "trackVisible", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setX(value: EmitterOpOnEmitType): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "x", js.Any.fromFunction3(value))
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
    
    inline def setY(value: EmitterOpOnEmitType): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "y", js.Any.fromFunction3(value))
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value*))
  }
}

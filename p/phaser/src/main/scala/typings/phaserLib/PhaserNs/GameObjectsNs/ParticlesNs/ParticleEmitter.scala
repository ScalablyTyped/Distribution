package typings
package phaserLib.PhaserNs.GameObjectsNs.ParticlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A particle emitter represents a single particle stream.
  * It controls a pool of {@link Phaser.GameObjects.Particles.Particle Particles} and is controlled by a {@link Phaser.GameObjects.Particles.ParticleEmitterManager Particle Emitter Manager}.
  */
@JSGlobal("Phaser.GameObjects.Particles.ParticleEmitter")
@js.native
class ParticleEmitter protected ()
  extends phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.BlendMode
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Mask
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.ScrollFactor
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Visible {
  /**
    * 
    * @param manager The Emitter Manager this Emitter belongs to.
    * @param config Settings for this emitter.
    */
  def this(manager: ParticleEmitterManager, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterConfig) = this()
  /**
    * Whether accelerationX and accelerationY are non-zero. Set automatically during configuration.
    */
  var acceleration: scala.Boolean = js.native
  /**
    * Horizontal acceleration applied to emitted particles, in pixels per second squared.
    */
  var accelerationX: EmitterOp = js.native
  /**
    * Vertical acceleration applied to emitted particles, in pixels per second squared.
    */
  var accelerationY: EmitterOp = js.native
  /**
    * Whether this emitter updates itself and its particles.
    * 
    * Controlled by {@link Phaser.GameObjects.Particles.ParticleEmitter#pause}
    * and {@link Phaser.GameObjects.Particles.ParticleEmitter#resume}.
    */
  var active: scala.Boolean = js.native
  /**
    * The alpha (transparency) of emitted particles.
    */
  var alpha: EmitterOp = js.native
  /**
    * The angle of the initial velocity of emitted particles, in degrees.
    */
  var angle: EmitterOp = js.native
  /**
    * The blend mode of this emitter's particles.
    */
  @JSName("blendMode")
  var blendMode_ParticleEmitter: phaserLib.integer = js.native
  /**
    * Whether particles will rebound when they meet the emitter bounds.
    */
  var bounce: EmitterOp = js.native
  /**
    * A rectangular boundary constraining particle movement.
    */
  var bounds: phaserLib.PhaserNs.GeomNs.Rectangle = js.native
  /**
    * Whether particles interact with the bottom edge of the emitter {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds}.
    */
  var collideBottom: scala.Boolean = js.native
  /**
    * Whether particles interact with the left edge of the emitter {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds}.
    */
  var collideLeft: scala.Boolean = js.native
  /**
    * Whether particles interact with the right edge of the emitter {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds}.
    */
  var collideRight: scala.Boolean = js.native
  /**
    * Whether particles interact with the top edge of the emitter {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds}.
    */
  var collideTop: scala.Boolean = js.native
  /**
    * Names of simple configuration properties.
    */
  var configFastMap: js.Object = js.native
  /**
    * Names of complex configuration properties.
    */
  var configOpMap: js.Object = js.native
  /**
    * The current texture frame, as an index of {@link Phaser.GameObjects.Particles.ParticleEmitter#frames}.
    */
  var currentFrame: phaserLib.integer = js.native
  /**
    * The calling context for {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallback}.
    */
  var deathCallbackScope: js.Any = js.native
  /**
    * A function to call when a particle dies.
    */
  @JSName("deathCallback")
  var deathCallback_Original: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleDeathCallback = js.native
  /**
    * An object describing a shape that deactivates particles when they interact with it.
    */
  var deathZone: phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ZonesNs.DeathZone = js.native
  /**
    * The default texture frame assigned to particles.
    */
  var defaultFrame: phaserLib.PhaserNs.TexturesNs.Frame = js.native
  /**
    * How many ms to wait after emission before the particles start updating.
    */
  var delay: EmitterOp = js.native
  /**
    * The calling context for {@link Phaser.GameObjects.Particles.ParticleEmitter#emitCallback}.
    */
  var emitCallbackScope: js.Any = js.native
  /**
    * A function to call when a particle is emitted.
    */
  @JSName("emitCallback")
  var emitCallback_Original: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterCallback = js.native
  /**
    * An object describing a shape to emit particles from.
    */
  var emitZone: phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ZonesNs.EdgeZone | phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ZonesNs.RandomZone = js.native
  /**
    * A Game Object whose position is used as the particle origin.
    */
  var follow: phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * The offset of the particle origin from the {@link Phaser.GameObjects.Particles.ParticleEmitter#follow} target.
    */
  var followOffset: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * The number of consecutive particles that receive a single texture frame (per frame cycle).
    */
  var frameQuantity: phaserLib.integer = js.native
  /**
    * The texture frames assigned to particles.
    */
  var frames: js.Array[phaserLib.PhaserNs.TexturesNs.Frame] = js.native
  /**
    * For a flow emitter, the time interval (>= 0) between particle flow cycles in ms.
    * A value of 0 means there is one particle flow cycle for each logic update (the maximum flow frequency). This is the default setting.
    * For an exploding emitter, this value will be -1.
    * Calling {@link Phaser.GameObjects.Particles.ParticleEmitter#flow} also puts the emitter in flow mode (frequency >= 0).
    * Calling {@link Phaser.GameObjects.Particles.ParticleEmitter#explode} also puts the emitter in explode mode (frequency = -1).
    */
  var frequency: scala.Double = js.native
  /**
    * Horizontal acceleration applied to emitted particles, in pixels per second squared.
    */
  var gravityX: scala.Double = js.native
  /**
    * Vertical acceleration applied to emitted particles, in pixels per second squared.
    */
  var gravityY: scala.Double = js.native
  /**
    * The lifespan of emitted particles, in ms.
    */
  var lifespan: EmitterOp = js.native
  /**
    * The Emitter Manager this Emitter belongs to.
    */
  var manager: ParticleEmitterManager = js.native
  /**
    * Set to hard limit the amount of particle objects this emitter is allowed to create.
    * 0 means unlimited.
    */
  var maxParticles: phaserLib.integer = js.native
  /**
    * The maximum horizontal velocity of emitted particles, in pixels per second squared.
    */
  var maxVelocityX: EmitterOp = js.native
  /**
    * The maximum vertical velocity of emitted particles, in pixels per second squared.
    */
  var maxVelocityY: EmitterOp = js.native
  /**
    * Whether moveToX and moveToY are nonzero. Set automatically during configuration.
    */
  var moveTo: scala.Boolean = js.native
  /**
    * The x-coordinate emitted particles move toward, when {@link Phaser.GameObjects.Particles.ParticleEmitter#moveTo} is true.
    */
  var moveToX: EmitterOp = js.native
  /**
    * The y-coordinate emitted particles move toward, when {@link Phaser.GameObjects.Particles.ParticleEmitter#moveTo} is true.
    */
  var moveToY: EmitterOp = js.native
  /**
    * The name of this Particle Emitter.
    * 
    * Empty by default and never populated by Phaser, this is left for developers to use.
    */
  var name: java.lang.String = js.native
  /**
    * Controls if the emitter is currently emitting a particle flow (when frequency >= 0).
    * Already alive particles will continue to update until they expire.
    * Controlled by {@link Phaser.GameObjects.Particles.ParticleEmitter#start} and {@link Phaser.GameObjects.Particles.ParticleEmitter#stop}.
    */
  var on: scala.Boolean = js.native
  /**
    * Newly emitted particles are added to the top of the particle list, i.e. rendered above those already alive.
    * Set to false to send them to the back.
    */
  var particleBringToTop: scala.Boolean = js.native
  /**
    * The Particle Class which will be emitted by this Emitter.
    */
  var particleClass: Particle = js.native
  /**
    * How many particles are emitted each time particles are emitted (one explosion or one flow cycle).
    */
  var quantity: EmitterOp = js.native
  /**
    * A radial emitter will emit particles in all directions between angle min and max,
    * using {@link Phaser.GameObjects.Particles.ParticleEmitter#speed} as the value. If set to false then this acts as a point Emitter.
    * A point emitter will emit particles only in the direction derived from the speedX and speedY values.
    */
  var radial: scala.Boolean = js.native
  /**
    * Whether texture {@link Phaser.GameObjects.Particles.ParticleEmitter#frames} are selected at random.
    */
  var randomFrame: scala.Boolean = js.native
  /**
    * The rotation of emitted particles, in degrees.
    */
  var rotate: EmitterOp = js.native
  /**
    * The horizontal scale of emitted particles.
    */
  var scaleX: EmitterOp = js.native
  /**
    * The vertical scale of emitted particles.
    */
  var scaleY: EmitterOp = js.native
  /**
    * The initial horizontal speed of emitted particles, in pixels per second.
    */
  var speedX: EmitterOp = js.native
  /**
    * The initial vertical speed of emitted particles, in pixels per second.
    */
  var speedY: EmitterOp = js.native
  /**
    * The texture assigned to particles.
    */
  var texture: phaserLib.PhaserNs.TexturesNs.Texture = js.native
  /**
    * The time rate applied to active particles, affecting lifespan, movement, and tweens. Values larger than 1 are faster than normal.
    */
  var timeScale: scala.Double = js.native
  /**
    * Color tint applied to emitted particles. Any alpha component (0xAA000000) is ignored.
    */
  var tint: EmitterOp = js.native
  /**
    * Whether the emitter's {@link Phaser.GameObjects.Particles.ParticleEmitter#visible} state will track
    * the {@link Phaser.GameObjects.Particles.ParticleEmitter#follow} target's visibility state.
    */
  var trackVisible: scala.Boolean = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: scala.Boolean = js.native
  /**
    * The x-coordinate of the particle origin (where particles will be emitted).
    */
  var x: EmitterOp = js.native
  /**
    * The y-coordinate of the particle origin (where particles will be emitted).
    */
  var y: EmitterOp = js.native
  /**
    * Whether this emitter is at its limit (if set).
    */
  def atLimit(): scala.Boolean = js.native
  /**
    * A function to call when a particle dies.
    */
  def deathCallback(particle: Particle): scala.Unit = js.native
  /**
    * Sorts active particles with {@link Phaser.GameObjects.Particles.ParticleEmitter#depthSortCallback}.
    */
  def depthSort(): ParticleEmitter = js.native
  /**
    * Calculates the difference of two particles, for sorting them by depth.
    * @param a The first particle.
    * @param b The second particle.
    */
  def depthSortCallback(a: js.Object, b: js.Object): phaserLib.integer = js.native
  /**
    * A function to call when a particle is emitted.
    */
  def emitCallback(particle: Particle, emitter: ParticleEmitter): scala.Unit = js.native
  /**
    * Emits particles at a given position (or the emitter's current position).
    * @param count The number of Particles to emit. Default this.quantity.
    * @param x The x coordinate to emit the Particles from. Default this.x.
    * @param y The y coordinate to emit the Particles from. Default this.x.
    */
  def emitParticle(): Particle = js.native
  def emitParticle(count: phaserLib.integer): Particle = js.native
  def emitParticle(count: phaserLib.integer, x: scala.Double): Particle = js.native
  def emitParticle(count: phaserLib.integer, x: scala.Double, y: scala.Double): Particle = js.native
  /**
    * Emits particles at a given position (or the emitter's current position).
    * @param x The x coordinate to emit the Particles from. Default this.x.
    * @param y The y coordinate to emit the Particles from. Default this.x.
    * @param count The number of Particles to emit. Default this.quantity.
    */
  def emitParticleAt(): Particle = js.native
  def emitParticleAt(x: scala.Double): Particle = js.native
  def emitParticleAt(x: scala.Double, y: scala.Double): Particle = js.native
  def emitParticleAt(x: scala.Double, y: scala.Double, count: phaserLib.integer): Particle = js.native
  /**
    * Puts the emitter in explode mode (frequency = -1), stopping any current particle flow, and emits several particles all at once.
    * @param count The amount of Particles to emit.
    * @param x The x coordinate to emit the Particles from.
    * @param y The y coordinate to emit the Particles from.
    */
  def explode(count: phaserLib.integer, x: scala.Double, y: scala.Double): Particle = js.native
  /**
    * Puts the emitter in flow mode (frequency >= 0) and starts (or restarts) a particle flow.
    * 
    * To resume a flow at the current frequency and quantity, use {@link Phaser.GameObjects.Particles.ParticleEmitter#start} instead.
    * @param frequency The time interval (>= 0) of each flow cycle, in ms.
    * @param count The number of particles to emit at each flow cycle. Default 1.
    */
  def flow(frequency: scala.Double): ParticleEmitter = js.native
  def flow(frequency: scala.Double, count: js.Array[scala.Double]): ParticleEmitter = js.native
  def flow(frequency: scala.Double, count: js.Object): ParticleEmitter = js.native
  def flow(
    frequency: scala.Double,
    count: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback
  ): ParticleEmitter = js.native
  def flow(frequency: scala.Double, count: scala.Double): ParticleEmitter = js.native
  /**
    * Calls a function for each active particle in this emitter.
    * @param callback The function.
    * @param context The function's calling context.
    */
  def forEachAlive(
    callback: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterCallback,
    context: js.Any
  ): ParticleEmitter = js.native
  /**
    * Calls a function for each inactive particle in this emitter.
    * @param callback The function.
    * @param context The function's calling context.
    */
  def forEachDead(
    callback: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterCallback,
    context: js.Any
  ): ParticleEmitter = js.native
  /**
    * Merges configuration settings into the emitter's current settings.
    * @param config Settings for this emitter.
    */
  def fromJSON(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterConfig): ParticleEmitter = js.native
  /**
    * Gets the number of active (in-use) particles in this emitter.
    */
  def getAliveParticleCount(): phaserLib.integer = js.native
  /**
    * Gets the number of inactive (available) particles in this emitter.
    */
  def getDeadParticleCount(): phaserLib.integer = js.native
  /**
    * Chooses a texture frame from {@link Phaser.GameObjects.Particles.ParticleEmitter#frames}.
    */
  def getFrame(): phaserLib.PhaserNs.TexturesNs.Frame = js.native
  /**
    * Gets the total number of particles in this emitter.
    */
  def getParticleCount(): phaserLib.integer = js.native
  /**
    * Deactivates every particle in this emitter.
    */
  def killAll(): ParticleEmitter = js.native
  /**
    * Sets a function to call for each particle death.
    * @param callback The function.
    * @param context The function's calling context.
    */
  def onParticleDeath(callback: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleDeathCallback): ParticleEmitter = js.native
  def onParticleDeath(
    callback: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleDeathCallback,
    context: js.Any
  ): ParticleEmitter = js.native
  /**
    * Sets a function to call for each newly emitted particle.
    * @param callback The function.
    * @param context The calling context.
    */
  def onParticleEmit(callback: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterCallback): ParticleEmitter = js.native
  def onParticleEmit(
    callback: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterCallback,
    context: js.Any
  ): ParticleEmitter = js.native
  /**
    * {@link Phaser.GameObjects.Particles.ParticleEmitter#active Deactivates} the emitter.
    */
  def pause(): ParticleEmitter = js.native
  /**
    * Updates this emitter and its particles.
    * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  def preUpdate(time: phaserLib.integer, delta: scala.Double): scala.Unit = js.native
  /**
    * Creates inactive particles and adds them to this emitter's pool.
    * @param particleCount The number of particles to create.
    */
  def reserve(particleCount: phaserLib.integer): ParticleEmitter = js.native
  /**
    * {@link Phaser.GameObjects.Particles.ParticleEmitter#active Activates} the emitter.
    */
  def resume(): ParticleEmitter = js.native
  def setAlpha(value: js.Array[scala.Double]): ParticleEmitter = js.native
  def setAlpha(value: js.Object): ParticleEmitter = js.native
  def setAlpha(value: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnUpdateCallback): ParticleEmitter = js.native
  /**
    * Sets the opacity of emitted particles.
    * @param value A value between 0 (transparent) and 1 (opaque).
    */
  def setAlpha(value: scala.Double): ParticleEmitter = js.native
  def setAngle(value: js.Array[scala.Double]): ParticleEmitter = js.native
  def setAngle(value: js.Object): ParticleEmitter = js.native
  def setAngle(value: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback): ParticleEmitter = js.native
  /**
    * Sets the angle of a {@link Phaser.GameObjects.Particles.ParticleEmitter#radial} particle stream.
    * @param value The angle of the initial velocity of emitted particles.
    */
  def setAngle(value: scala.Double): ParticleEmitter = js.native
  def setBounds(
    x: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterBoundsAlt,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): ParticleEmitter = js.native
  def setBounds(
    x: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterBounds,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): ParticleEmitter = js.native
  /**
    * Sets or modifies a rectangular boundary constraining the particles.
    * 
    * To remove the boundary, set {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds} to null.
    * @param x The x-coordinate of the left edge of the boundary, or an object representing a rectangle.
    * @param y The y-coordinate of the top edge of the boundary.
    * @param width The width of the boundary.
    * @param height The height of the boundary.
    */
  def setBounds(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): ParticleEmitter = js.native
  /**
    * Sets or removes the {@link Phaser.GameObjects.Particles.ParticleEmitter#deathZone}.
    * @param zoneConfig An object describing the zone, or `undefined` to remove any current death zone.
    */
  def setDeathZone(): ParticleEmitter = js.native
  def setDeathZone(zoneConfig: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterDeathZoneConfig): ParticleEmitter = js.native
  /**
    * Sets or removes the {@link Phaser.GameObjects.Particles.ParticleEmitter#emitZone}.
    * 
    * An {@link Phaser.Types.GameObjects.Particles.ParticleEmitterEdgeZoneConfig EdgeZone} places particles on its edges. Its {@link Phaser.Types.GameObjects.Particles.EdgeZoneSource source} can be a Curve, Path, Circle, Ellipse, Line, Polygon, Rectangle, or Triangle; or any object with a suitable {@link Phaser.Types.GameObjects.Particles.EdgeZoneSourceCallback getPoints} method.
    * 
    * A {@link Phaser.Types.GameObjects.Particles.ParticleEmitterRandomZoneConfig RandomZone} places randomly within its interior. Its {@link RandomZoneSource source} can be a Circle, Ellipse, Line, Polygon, Rectangle, or Triangle; or any object with a suitable {@link Phaser.Types.GameObjects.Particles.RandomZoneSourceCallback getRandomPoint} method.
    * @param zoneConfig An object describing the zone, or `undefined` to remove any current emit zone.
    */
  def setEmitZone(): ParticleEmitter = js.native
  def setEmitZone(zoneConfig: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterEdgeZoneConfig): ParticleEmitter = js.native
  def setEmitZone(zoneConfig: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterRandomZoneConfig): ParticleEmitter = js.native
  def setEmitterAngle(value: js.Array[scala.Double]): ParticleEmitter = js.native
  def setEmitterAngle(value: js.Object): ParticleEmitter = js.native
  def setEmitterAngle(value: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback): ParticleEmitter = js.native
  /**
    * Sets the angle of a {@link Phaser.GameObjects.Particles.ParticleEmitter#radial} particle stream.
    * @param value The angle of the initial velocity of emitted particles.
    */
  def setEmitterAngle(value: scala.Double): ParticleEmitter = js.native
  def setFrame(frames: java.lang.String): ParticleEmitter = js.native
  def setFrame(frames: java.lang.String, pickRandom: scala.Boolean): ParticleEmitter = js.native
  def setFrame(frames: java.lang.String, pickRandom: scala.Boolean, quantity: phaserLib.integer): ParticleEmitter = js.native
  /**
    * Sets a pattern for assigning texture frames to emitted particles.
    * @param frames One or more texture frames, or a configuration object.
    * @param pickRandom Whether frames should be assigned at random from `frames`. Default true.
    * @param quantity The number of consecutive particles that will receive each frame. Default 1.
    */
  def setFrame(frames: js.Array[_]): ParticleEmitter = js.native
  def setFrame(frames: js.Array[_], pickRandom: scala.Boolean): ParticleEmitter = js.native
  def setFrame(frames: js.Array[_], pickRandom: scala.Boolean, quantity: phaserLib.integer): ParticleEmitter = js.native
  def setFrame(frames: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterFrameConfig): ParticleEmitter = js.native
  def setFrame(
    frames: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterFrameConfig,
    pickRandom: scala.Boolean
  ): ParticleEmitter = js.native
  def setFrame(
    frames: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterFrameConfig,
    pickRandom: scala.Boolean,
    quantity: phaserLib.integer
  ): ParticleEmitter = js.native
  def setFrame(frames: phaserLib.integer): ParticleEmitter = js.native
  def setFrame(frames: phaserLib.integer, pickRandom: scala.Boolean): ParticleEmitter = js.native
  def setFrame(frames: phaserLib.integer, pickRandom: scala.Boolean, quantity: phaserLib.integer): ParticleEmitter = js.native
  /**
    * Sets the emitter's {@link Phaser.GameObjects.Particles.ParticleEmitter#frequency}
    * and {@link Phaser.GameObjects.Particles.ParticleEmitter#quantity}.
    * @param frequency The time interval (>= 0) of each flow cycle, in ms; or -1 to put the emitter in explosion mode.
    * @param quantity The number of particles to release at each flow cycle or explosion.
    */
  def setFrequency(frequency: scala.Double): ParticleEmitter = js.native
  def setFrequency(frequency: scala.Double, quantity: js.Array[scala.Double]): ParticleEmitter = js.native
  def setFrequency(frequency: scala.Double, quantity: js.Object): ParticleEmitter = js.native
  def setFrequency(
    frequency: scala.Double,
    quantity: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback
  ): ParticleEmitter = js.native
  def setFrequency(frequency: scala.Double, quantity: scala.Double): ParticleEmitter = js.native
  /**
    * Sets the gravity applied to emitted particles.
    * @param x Horizontal acceleration due to gravity, in pixels per second squared.
    * @param y Vertical acceleration due to gravity, in pixels per second squared.
    */
  def setGravity(x: scala.Double, y: scala.Double): ParticleEmitter = js.native
  /**
    * Sets the horizontal gravity applied to emitted particles.
    * @param value Acceleration due to gravity, in pixels per second squared.
    */
  def setGravityX(value: scala.Double): ParticleEmitter = js.native
  /**
    * Sets the vertical gravity applied to emitted particles.
    * @param value Acceleration due to gravity, in pixels per second squared.
    */
  def setGravityY(value: scala.Double): ParticleEmitter = js.native
  def setLifespan(value: js.Array[scala.Double]): ParticleEmitter = js.native
  def setLifespan(value: js.Object): ParticleEmitter = js.native
  def setLifespan(value: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback): ParticleEmitter = js.native
  /**
    * Sets the lifespan of newly emitted particles.
    * @param value The particle lifespan, in ms.
    */
  def setLifespan(value: scala.Double): ParticleEmitter = js.native
  def setPosition(x: js.Array[scala.Double], y: js.Array[scala.Double]): ParticleEmitter = js.native
  def setPosition(x: js.Array[scala.Double], y: js.Object): ParticleEmitter = js.native
  def setPosition(
    x: js.Array[scala.Double],
    y: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback
  ): ParticleEmitter = js.native
  def setPosition(x: js.Array[scala.Double], y: scala.Double): ParticleEmitter = js.native
  def setPosition(x: js.Object, y: js.Array[scala.Double]): ParticleEmitter = js.native
  def setPosition(x: js.Object, y: js.Object): ParticleEmitter = js.native
  def setPosition(x: js.Object, y: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback): ParticleEmitter = js.native
  def setPosition(x: js.Object, y: scala.Double): ParticleEmitter = js.native
  def setPosition(
    x: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback,
    y: js.Array[scala.Double]
  ): ParticleEmitter = js.native
  def setPosition(x: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback, y: js.Object): ParticleEmitter = js.native
  def setPosition(
    x: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback,
    y: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback
  ): ParticleEmitter = js.native
  def setPosition(x: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback, y: scala.Double): ParticleEmitter = js.native
  def setPosition(x: scala.Double, y: js.Array[scala.Double]): ParticleEmitter = js.native
  def setPosition(x: scala.Double, y: js.Object): ParticleEmitter = js.native
  def setPosition(x: scala.Double, y: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback): ParticleEmitter = js.native
  /**
    * Sets the position of the emitter's particle origin.
    * New particles will be emitted here.
    * @param x The x-coordinate of the particle origin.
    * @param y The y-coordinate of the particle origin.
    */
  def setPosition(x: scala.Double, y: scala.Double): ParticleEmitter = js.native
  def setQuantity(quantity: js.Array[scala.Double]): ParticleEmitter = js.native
  def setQuantity(quantity: js.Object): ParticleEmitter = js.native
  def setQuantity(quantity: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback): ParticleEmitter = js.native
  /**
    * Sets the number of particles released at each flow cycle or explosion.
    * @param quantity The number of particles to release at each flow cycle or explosion.
    */
  def setQuantity(quantity: scala.Double): ParticleEmitter = js.native
  /**
    * Turns {@link Phaser.GameObjects.Particles.ParticleEmitter#radial} particle movement on or off.
    * @param value Radial mode (true) or point mode (true). Default true.
    */
  def setRadial(): ParticleEmitter = js.native
  def setRadial(value: scala.Boolean): ParticleEmitter = js.native
  def setScale(value: js.Array[scala.Double]): ParticleEmitter = js.native
  def setScale(value: js.Object): ParticleEmitter = js.native
  def setScale(value: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnUpdateCallback): ParticleEmitter = js.native
  /**
    * Sets the scale of emitted particles.
    * @param value The scale, relative to 1.
    */
  def setScale(value: scala.Double): ParticleEmitter = js.native
  def setScaleX(value: js.Array[scala.Double]): ParticleEmitter = js.native
  def setScaleX(value: js.Object): ParticleEmitter = js.native
  def setScaleX(value: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnUpdateCallback): ParticleEmitter = js.native
  /**
    * Sets the horizontal scale of emitted particles.
    * @param value The scale, relative to 1.
    */
  def setScaleX(value: scala.Double): ParticleEmitter = js.native
  def setScaleY(value: js.Array[scala.Double]): ParticleEmitter = js.native
  def setScaleY(value: js.Object): ParticleEmitter = js.native
  def setScaleY(value: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnUpdateCallback): ParticleEmitter = js.native
  /**
    * Sets the vertical scale of emitted particles.
    * @param value The scale, relative to 1.
    */
  def setScaleY(value: scala.Double): ParticleEmitter = js.native
  def setSpeed(value: js.Array[scala.Double]): ParticleEmitter = js.native
  def setSpeed(value: js.Object): ParticleEmitter = js.native
  def setSpeed(value: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback): ParticleEmitter = js.native
  /**
    * Sets the initial radial speed of emitted particles.
    * Changes the emitter to radial mode.
    * @param value The speed, in pixels per second.
    */
  def setSpeed(value: scala.Double): ParticleEmitter = js.native
  def setSpeedX(value: js.Array[scala.Double]): ParticleEmitter = js.native
  def setSpeedX(value: js.Object): ParticleEmitter = js.native
  def setSpeedX(value: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback): ParticleEmitter = js.native
  /**
    * Sets the initial horizontal speed of emitted particles.
    * Changes the emitter to point mode.
    * @param value The speed, in pixels per second.
    */
  def setSpeedX(value: scala.Double): ParticleEmitter = js.native
  def setSpeedY(value: js.Array[scala.Double]): ParticleEmitter = js.native
  def setSpeedY(value: js.Object): ParticleEmitter = js.native
  def setSpeedY(value: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback): ParticleEmitter = js.native
  /**
    * Sets the initial vertical speed of emitted particles.
    * Changes the emitter to point mode.
    * @param value The speed, in pixels per second.
    */
  def setSpeedY(value: scala.Double): ParticleEmitter = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: scala.Boolean): this.type = js.native
  /**
    * Turns {@link Phaser.GameObjects.Particles.ParticleEmitter#on} the emitter and resets the flow counter.
    * 
    * If this emitter is in flow mode (frequency >= 0; the default), the particle flow will start (or restart).
    * 
    * If this emitter is in explode mode (frequency = -1), nothing will happen.
    * Use {@link Phaser.GameObjects.Particles.ParticleEmitter#explode} or {@link Phaser.GameObjects.Particles.ParticleEmitter#flow} instead.
    */
  def start(): ParticleEmitter = js.native
  /**
    * Continuously moves the particle origin to follow a Game Object's position.
    * @param target The Game Object to follow.
    * @param offsetX Horizontal offset of the particle origin from the Game Object. Default 0.
    * @param offsetY Vertical offset of the particle origin from the Game Object. Default 0.
    * @param trackVisible Whether the emitter's visible state will track the target's visible state. Default false.
    */
  def startFollow(target: phaserLib.PhaserNs.GameObjectsNs.GameObject): ParticleEmitter = js.native
  def startFollow(target: phaserLib.PhaserNs.GameObjectsNs.GameObject, offsetX: scala.Double): ParticleEmitter = js.native
  def startFollow(target: phaserLib.PhaserNs.GameObjectsNs.GameObject, offsetX: scala.Double, offsetY: scala.Double): ParticleEmitter = js.native
  def startFollow(
    target: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    offsetX: scala.Double,
    offsetY: scala.Double,
    trackVisible: scala.Boolean
  ): ParticleEmitter = js.native
  /**
    * Turns {@link Phaser.GameObjects.Particles.ParticleEmitter#on off} the emitter.
    */
  def stop(): ParticleEmitter = js.native
  /**
    * Stops following a Game Object.
    */
  def stopFollow(): ParticleEmitter = js.native
  /**
    * Creates a description of this emitter suitable for JSON serialization.
    * @param output An object to copy output into.
    */
  def toJSON(): js.Object = js.native
  def toJSON(output: js.Object): js.Object = js.native
}


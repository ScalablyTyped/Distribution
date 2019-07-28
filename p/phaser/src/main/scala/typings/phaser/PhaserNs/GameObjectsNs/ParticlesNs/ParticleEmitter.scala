package typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs

import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.BlendMode
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Mask
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.ScrollFactor
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Visible
import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.ZonesNs.DeathZone
import typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.ZonesNs.EdgeZone
import typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.ZonesNs.RandomZone
import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.PhaserNs.TexturesNs.Frame
import typings.phaser.PhaserNs.TexturesNs.Texture
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitType
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnUpdateType
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleDeathCallback
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterBounds
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterBoundsAlt
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterCallback
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterConfig
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterDeathZoneConfig
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterEdgeZoneConfig
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterFrameConfig
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterRandomZoneConfig
import typings.phaser.integer
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
  extends BlendMode
     with Mask
     with ScrollFactor
     with Visible {
  /**
    * 
    * @param manager The Emitter Manager this Emitter belongs to.
    * @param config Settings for this emitter.
    */
  def this(manager: ParticleEmitterManager, config: ParticleEmitterConfig) = this()
  /**
    * Whether accelerationX and accelerationY are non-zero. Set automatically during configuration.
    */
  var acceleration: Boolean = js.native
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
  var active: Boolean = js.native
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
  var blendMode_ParticleEmitter: integer = js.native
  /**
    * Whether particles will rebound when they meet the emitter bounds.
    */
  var bounce: EmitterOp = js.native
  /**
    * A rectangular boundary constraining particle movement.
    */
  var bounds: typings.phaser.PhaserNs.GeomNs.Rectangle = js.native
  /**
    * Whether particles interact with the bottom edge of the emitter {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds}.
    */
  var collideBottom: Boolean = js.native
  /**
    * Whether particles interact with the left edge of the emitter {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds}.
    */
  var collideLeft: Boolean = js.native
  /**
    * Whether particles interact with the right edge of the emitter {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds}.
    */
  var collideRight: Boolean = js.native
  /**
    * Whether particles interact with the top edge of the emitter {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds}.
    */
  var collideTop: Boolean = js.native
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
  var currentFrame: integer = js.native
  /**
    * The calling context for {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallback}.
    */
  var deathCallbackScope: js.Any = js.native
  /**
    * A function to call when a particle dies.
    */
  @JSName("deathCallback")
  var deathCallback_Original: ParticleDeathCallback = js.native
  /**
    * An object describing a shape that deactivates particles when they interact with it.
    */
  var deathZone: DeathZone = js.native
  /**
    * The default texture frame assigned to particles.
    */
  var defaultFrame: Frame = js.native
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
  var emitCallback_Original: ParticleEmitterCallback = js.native
  /**
    * An object describing a shape to emit particles from.
    */
  var emitZone: EdgeZone | RandomZone = js.native
  /**
    * A Game Object whose position is used as the particle origin.
    */
  var follow: GameObject = js.native
  /**
    * The offset of the particle origin from the {@link Phaser.GameObjects.Particles.ParticleEmitter#follow} target.
    */
  var followOffset: Vector2 = js.native
  /**
    * The number of consecutive particles that receive a single texture frame (per frame cycle).
    */
  var frameQuantity: integer = js.native
  /**
    * The texture frames assigned to particles.
    */
  var frames: js.Array[Frame] = js.native
  /**
    * For a flow emitter, the time interval (>= 0) between particle flow cycles in ms.
    * A value of 0 means there is one particle flow cycle for each logic update (the maximum flow frequency). This is the default setting.
    * For an exploding emitter, this value will be -1.
    * Calling {@link Phaser.GameObjects.Particles.ParticleEmitter#flow} also puts the emitter in flow mode (frequency >= 0).
    * Calling {@link Phaser.GameObjects.Particles.ParticleEmitter#explode} also puts the emitter in explode mode (frequency = -1).
    */
  var frequency: Double = js.native
  /**
    * Horizontal acceleration applied to emitted particles, in pixels per second squared.
    */
  var gravityX: Double = js.native
  /**
    * Vertical acceleration applied to emitted particles, in pixels per second squared.
    */
  var gravityY: Double = js.native
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
  var maxParticles: integer = js.native
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
  var moveTo: Boolean = js.native
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
  var name: String = js.native
  /**
    * Controls if the emitter is currently emitting a particle flow (when frequency >= 0).
    * Already alive particles will continue to update until they expire.
    * Controlled by {@link Phaser.GameObjects.Particles.ParticleEmitter#start} and {@link Phaser.GameObjects.Particles.ParticleEmitter#stop}.
    */
  var on: Boolean = js.native
  /**
    * Newly emitted particles are added to the top of the particle list, i.e. rendered above those already alive.
    * Set to false to send them to the back.
    */
  var particleBringToTop: Boolean = js.native
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
  var radial: Boolean = js.native
  /**
    * Whether texture {@link Phaser.GameObjects.Particles.ParticleEmitter#frames} are selected at random.
    */
  var randomFrame: Boolean = js.native
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
  var texture: Texture = js.native
  /**
    * The time rate applied to active particles, affecting lifespan, movement, and tweens. Values larger than 1 are faster than normal.
    */
  var timeScale: Double = js.native
  /**
    * Color tint applied to emitted particles. Any alpha component (0xAA000000) is ignored.
    */
  var tint: EmitterOp = js.native
  /**
    * Whether the emitter's {@link Phaser.GameObjects.Particles.ParticleEmitter#visible} state will track
    * the {@link Phaser.GameObjects.Particles.ParticleEmitter#follow} target's visibility state.
    */
  var trackVisible: Boolean = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
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
  def atLimit(): Boolean = js.native
  /**
    * A function to call when a particle dies.
    */
  def deathCallback(particle: Particle): Unit = js.native
  /**
    * Sorts active particles with {@link Phaser.GameObjects.Particles.ParticleEmitter#depthSortCallback}.
    */
  def depthSort(): ParticleEmitter = js.native
  /**
    * Calculates the difference of two particles, for sorting them by depth.
    * @param a The first particle.
    * @param b The second particle.
    */
  def depthSortCallback(a: js.Object, b: js.Object): integer = js.native
  /**
    * A function to call when a particle is emitted.
    */
  def emitCallback(particle: Particle, emitter: ParticleEmitter): Unit = js.native
  /**
    * Emits particles at a given position (or the emitter's current position).
    * @param count The number of Particles to emit. Default this.quantity.
    * @param x The x coordinate to emit the Particles from. Default this.x.
    * @param y The y coordinate to emit the Particles from. Default this.x.
    */
  def emitParticle(): Particle = js.native
  def emitParticle(count: integer): Particle = js.native
  def emitParticle(count: integer, x: Double): Particle = js.native
  def emitParticle(count: integer, x: Double, y: Double): Particle = js.native
  /**
    * Emits particles at a given position (or the emitter's current position).
    * @param x The x coordinate to emit the Particles from. Default this.x.
    * @param y The y coordinate to emit the Particles from. Default this.x.
    * @param count The number of Particles to emit. Default this.quantity.
    */
  def emitParticleAt(): Particle = js.native
  def emitParticleAt(x: Double): Particle = js.native
  def emitParticleAt(x: Double, y: Double): Particle = js.native
  def emitParticleAt(x: Double, y: Double, count: integer): Particle = js.native
  /**
    * Puts the emitter in explode mode (frequency = -1), stopping any current particle flow, and emits several particles all at once.
    * @param count The amount of Particles to emit.
    * @param x The x coordinate to emit the Particles from.
    * @param y The y coordinate to emit the Particles from.
    */
  def explode(count: integer, x: Double, y: Double): Particle = js.native
  /**
    * Puts the emitter in flow mode (frequency >= 0) and starts (or restarts) a particle flow.
    * 
    * To resume a flow at the current frequency and quantity, use {@link Phaser.GameObjects.Particles.ParticleEmitter#start} instead.
    * @param frequency The time interval (>= 0) of each flow cycle, in ms.
    * @param count The number of particles to emit at each flow cycle. Default 1.
    */
  def flow(frequency: Double): ParticleEmitter = js.native
  def flow(frequency: Double, count: EmitterOpOnEmitType): ParticleEmitter = js.native
  /**
    * Calls a function for each active particle in this emitter.
    * @param callback The function.
    * @param context The function's calling context.
    */
  def forEachAlive(callback: ParticleEmitterCallback, context: js.Any): ParticleEmitter = js.native
  /**
    * Calls a function for each inactive particle in this emitter.
    * @param callback The function.
    * @param context The function's calling context.
    */
  def forEachDead(callback: ParticleEmitterCallback, context: js.Any): ParticleEmitter = js.native
  /**
    * Merges configuration settings into the emitter's current settings.
    * @param config Settings for this emitter.
    */
  def fromJSON(config: ParticleEmitterConfig): ParticleEmitter = js.native
  /**
    * Gets the number of active (in-use) particles in this emitter.
    */
  def getAliveParticleCount(): integer = js.native
  /**
    * Gets the number of inactive (available) particles in this emitter.
    */
  def getDeadParticleCount(): integer = js.native
  /**
    * Chooses a texture frame from {@link Phaser.GameObjects.Particles.ParticleEmitter#frames}.
    */
  def getFrame(): Frame = js.native
  /**
    * Gets the total number of particles in this emitter.
    */
  def getParticleCount(): integer = js.native
  /**
    * Deactivates every particle in this emitter.
    */
  def killAll(): ParticleEmitter = js.native
  /**
    * Sets a function to call for each particle death.
    * @param callback The function.
    * @param context The function's calling context.
    */
  def onParticleDeath(callback: ParticleDeathCallback): ParticleEmitter = js.native
  def onParticleDeath(callback: ParticleDeathCallback, context: js.Any): ParticleEmitter = js.native
  /**
    * Sets a function to call for each newly emitted particle.
    * @param callback The function.
    * @param context The calling context.
    */
  def onParticleEmit(callback: ParticleEmitterCallback): ParticleEmitter = js.native
  def onParticleEmit(callback: ParticleEmitterCallback, context: js.Any): ParticleEmitter = js.native
  /**
    * {@link Phaser.GameObjects.Particles.ParticleEmitter#active Deactivates} the emitter.
    */
  def pause(): ParticleEmitter = js.native
  /**
    * Updates this emitter and its particles.
    * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  def preUpdate(time: integer, delta: Double): Unit = js.native
  /**
    * Creates inactive particles and adds them to this emitter's pool.
    * @param particleCount The number of particles to create.
    */
  def reserve(particleCount: integer): ParticleEmitter = js.native
  /**
    * {@link Phaser.GameObjects.Particles.ParticleEmitter#active Activates} the emitter.
    */
  def resume(): ParticleEmitter = js.native
  /**
    * Sets the opacity of emitted particles.
    * @param value A value between 0 (transparent) and 1 (opaque).
    */
  def setAlpha(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): ParticleEmitter = js.native
  /**
    * Sets the angle of a {@link Phaser.GameObjects.Particles.ParticleEmitter#radial} particle stream.
    * @param value The angle of the initial velocity of emitted particles.
    */
  def setAngle(value: EmitterOpOnEmitType): ParticleEmitter = js.native
  /**
    * Sets or modifies a rectangular boundary constraining the particles.
    * 
    * To remove the boundary, set {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds} to null.
    * @param x The x-coordinate of the left edge of the boundary, or an object representing a rectangle.
    * @param y The y-coordinate of the top edge of the boundary.
    * @param width The width of the boundary.
    * @param height The height of the boundary.
    */
  def setBounds(x: Double, y: Double, width: Double, height: Double): ParticleEmitter = js.native
  def setBounds(x: ParticleEmitterBoundsAlt, y: Double, width: Double, height: Double): ParticleEmitter = js.native
  def setBounds(x: ParticleEmitterBounds, y: Double, width: Double, height: Double): ParticleEmitter = js.native
  /**
    * Sets or removes the {@link Phaser.GameObjects.Particles.ParticleEmitter#deathZone}.
    * @param zoneConfig An object describing the zone, or `undefined` to remove any current death zone.
    */
  def setDeathZone(): ParticleEmitter = js.native
  def setDeathZone(zoneConfig: ParticleEmitterDeathZoneConfig): ParticleEmitter = js.native
  /**
    * Sets or removes the {@link Phaser.GameObjects.Particles.ParticleEmitter#emitZone}.
    * 
    * An {@link Phaser.Types.GameObjects.Particles.ParticleEmitterEdgeZoneConfig EdgeZone} places particles on its edges. Its {@link Phaser.Types.GameObjects.Particles.EdgeZoneSource source} can be a Curve, Path, Circle, Ellipse, Line, Polygon, Rectangle, or Triangle; or any object with a suitable {@link Phaser.Types.GameObjects.Particles.EdgeZoneSourceCallback getPoints} method.
    * 
    * A {@link Phaser.Types.GameObjects.Particles.ParticleEmitterRandomZoneConfig RandomZone} places randomly within its interior. Its {@link RandomZoneSource source} can be a Circle, Ellipse, Line, Polygon, Rectangle, or Triangle; or any object with a suitable {@link Phaser.Types.GameObjects.Particles.RandomZoneSourceCallback getRandomPoint} method.
    * @param zoneConfig An object describing the zone, or `undefined` to remove any current emit zone.
    */
  def setEmitZone(): ParticleEmitter = js.native
  def setEmitZone(zoneConfig: ParticleEmitterEdgeZoneConfig): ParticleEmitter = js.native
  def setEmitZone(zoneConfig: ParticleEmitterRandomZoneConfig): ParticleEmitter = js.native
  /**
    * Sets the angle of a {@link Phaser.GameObjects.Particles.ParticleEmitter#radial} particle stream.
    * @param value The angle of the initial velocity of emitted particles.
    */
  def setEmitterAngle(value: EmitterOpOnEmitType): ParticleEmitter = js.native
  def setFrame(frames: String): ParticleEmitter = js.native
  def setFrame(frames: String, pickRandom: Boolean): ParticleEmitter = js.native
  def setFrame(frames: String, pickRandom: Boolean, quantity: integer): ParticleEmitter = js.native
  /**
    * Sets a pattern for assigning texture frames to emitted particles.
    * @param frames One or more texture frames, or a configuration object.
    * @param pickRandom Whether frames should be assigned at random from `frames`. Default true.
    * @param quantity The number of consecutive particles that will receive each frame. Default 1.
    */
  def setFrame(frames: js.Array[_]): ParticleEmitter = js.native
  def setFrame(frames: js.Array[_], pickRandom: Boolean): ParticleEmitter = js.native
  def setFrame(frames: js.Array[_], pickRandom: Boolean, quantity: integer): ParticleEmitter = js.native
  def setFrame(frames: ParticleEmitterFrameConfig): ParticleEmitter = js.native
  def setFrame(frames: ParticleEmitterFrameConfig, pickRandom: Boolean): ParticleEmitter = js.native
  def setFrame(frames: ParticleEmitterFrameConfig, pickRandom: Boolean, quantity: integer): ParticleEmitter = js.native
  def setFrame(frames: integer): ParticleEmitter = js.native
  def setFrame(frames: integer, pickRandom: Boolean): ParticleEmitter = js.native
  def setFrame(frames: integer, pickRandom: Boolean, quantity: integer): ParticleEmitter = js.native
  /**
    * Sets the emitter's {@link Phaser.GameObjects.Particles.ParticleEmitter#frequency}
    * and {@link Phaser.GameObjects.Particles.ParticleEmitter#quantity}.
    * @param frequency The time interval (>= 0) of each flow cycle, in ms; or -1 to put the emitter in explosion mode.
    * @param quantity The number of particles to release at each flow cycle or explosion.
    */
  def setFrequency(frequency: Double): ParticleEmitter = js.native
  def setFrequency(frequency: Double, quantity: EmitterOpOnEmitType): ParticleEmitter = js.native
  /**
    * Sets the gravity applied to emitted particles.
    * @param x Horizontal acceleration due to gravity, in pixels per second squared.
    * @param y Vertical acceleration due to gravity, in pixels per second squared.
    */
  def setGravity(x: Double, y: Double): ParticleEmitter = js.native
  /**
    * Sets the horizontal gravity applied to emitted particles.
    * @param value Acceleration due to gravity, in pixels per second squared.
    */
  def setGravityX(value: Double): ParticleEmitter = js.native
  /**
    * Sets the vertical gravity applied to emitted particles.
    * @param value Acceleration due to gravity, in pixels per second squared.
    */
  def setGravityY(value: Double): ParticleEmitter = js.native
  /**
    * Sets the lifespan of newly emitted particles.
    * @param value The particle lifespan, in ms.
    */
  def setLifespan(value: EmitterOpOnEmitType): ParticleEmitter = js.native
  /**
    * Sets the position of the emitter's particle origin.
    * New particles will be emitted here.
    * @param x The x-coordinate of the particle origin.
    * @param y The y-coordinate of the particle origin.
    */
  def setPosition(x: EmitterOpOnEmitType, y: EmitterOpOnEmitType): ParticleEmitter = js.native
  /**
    * Sets the number of particles released at each flow cycle or explosion.
    * @param quantity The number of particles to release at each flow cycle or explosion.
    */
  def setQuantity(quantity: EmitterOpOnEmitType): ParticleEmitter = js.native
  /**
    * Turns {@link Phaser.GameObjects.Particles.ParticleEmitter#radial} particle movement on or off.
    * @param value Radial mode (true) or point mode (true). Default true.
    */
  def setRadial(): ParticleEmitter = js.native
  def setRadial(value: Boolean): ParticleEmitter = js.native
  /**
    * Sets the scale of emitted particles.
    * @param value The scale, relative to 1.
    */
  def setScale(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): ParticleEmitter = js.native
  /**
    * Sets the horizontal scale of emitted particles.
    * @param value The scale, relative to 1.
    */
  def setScaleX(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): ParticleEmitter = js.native
  /**
    * Sets the vertical scale of emitted particles.
    * @param value The scale, relative to 1.
    */
  def setScaleY(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): ParticleEmitter = js.native
  /**
    * Sets the initial radial speed of emitted particles.
    * Changes the emitter to radial mode.
    * @param value The speed, in pixels per second.
    */
  def setSpeed(value: EmitterOpOnEmitType): ParticleEmitter = js.native
  /**
    * Sets the initial horizontal speed of emitted particles.
    * Changes the emitter to point mode.
    * @param value The speed, in pixels per second.
    */
  def setSpeedX(value: EmitterOpOnEmitType): ParticleEmitter = js.native
  /**
    * Sets the initial vertical speed of emitted particles.
    * Changes the emitter to point mode.
    * @param value The speed, in pixels per second.
    */
  def setSpeedY(value: EmitterOpOnEmitType): ParticleEmitter = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
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
  def startFollow(target: GameObject): ParticleEmitter = js.native
  def startFollow(target: GameObject, offsetX: Double): ParticleEmitter = js.native
  def startFollow(target: GameObject, offsetX: Double, offsetY: Double): ParticleEmitter = js.native
  def startFollow(target: GameObject, offsetX: Double, offsetY: Double, trackVisible: Boolean): ParticleEmitter = js.native
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


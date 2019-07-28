package typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs

import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Depth
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Mask
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Pipeline
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Transform
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Visible
import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import typings.phaser.PhaserNs.Scene
import typings.phaser.PhaserNs.StructsNs.List
import typings.phaser.PhaserNs.TexturesNs.Frame
import typings.phaser.PhaserNs.TexturesNs.Texture
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.GravityWellConfig
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterConfig
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Particle Emitter Manager creates and controls {@link Phaser.GameObjects.Particles.ParticleEmitter Particle Emitters} and {@link Phaser.GameObjects.Particles.GravityWell Gravity Wells}.
  */
@JSGlobal("Phaser.GameObjects.Particles.ParticleEmitterManager")
@js.native
class ParticleEmitterManager protected ()
  extends GameObject
     with Depth
     with Mask
     with Pipeline
     with Transform
     with Visible {
  /**
    * 
    * @param scene The Scene to which this Emitter Manager belongs.
    * @param texture The key of the Texture this Emitter Manager will use to render particles, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Emitter Manager will use to render particles.
    * @param emitters Configuration settings for one or more emitters to create.
    */
  def this(scene: Scene, texture: String) = this()
  def this(scene: Scene, texture: String, frame: String) = this()
  def this(scene: Scene, texture: String, frame: integer) = this()
  def this(scene: Scene, texture: String, frame: String, emitters: js.Array[ParticleEmitterConfig]) = this()
  def this(scene: Scene, texture: String, frame: String, emitters: ParticleEmitterConfig) = this()
  def this(scene: Scene, texture: String, frame: integer, emitters: js.Array[ParticleEmitterConfig]) = this()
  def this(scene: Scene, texture: String, frame: integer, emitters: ParticleEmitterConfig) = this()
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  override var depth: Double = js.native
  /**
    * A list of Emitters being managed by this Emitter Manager.
    */
  var emitters: List[ParticleEmitter] = js.native
  /**
    * The texture frame used to render this Emitter Manager's particles.
    */
  var frame: Frame = js.native
  /**
    * Names of this Emitter Manager's texture frames.
    */
  var frameNames: js.Array[String] = js.native
  /**
    * The texture used to render this Emitter Manager's particles.
    */
  var texture: Texture = js.native
  /**
    * The time scale applied to all emitters and particles, affecting flow rate, lifespan, and movement.
    * Values larger than 1 are faster than normal.
    * This is multiplied with any timeScale set on each individual emitter.
    */
  var timeScale: Double = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
  /**
    * A list of Gravity Wells being managed by this Emitter Manager.
    */
  var wells: List[GravityWell] = js.native
  /**
    * Adds an existing Particle Emitter to this Emitter Manager.
    * @param emitter The Particle Emitter to add to this Emitter Manager.
    */
  def addEmitter(emitter: ParticleEmitter): ParticleEmitter = js.native
  /**
    * Adds an existing Gravity Well object to this Emitter Manager.
    * @param well The Gravity Well to add to this Emitter Manager.
    */
  def addGravityWell(well: GravityWell): GravityWell = js.native
  /**
    * Creates a new Particle Emitter object, adds it to this Emitter Manager and returns a reference to it.
    * @param config Configuration settings for the Particle Emitter to create.
    */
  def createEmitter(config: ParticleEmitterConfig): ParticleEmitter = js.native
  /**
    * Creates a new Gravity Well, adds it to this Emitter Manager and returns a reference to it.
    * @param config Configuration settings for the Gravity Well to create.
    */
  def createGravityWell(config: GravityWellConfig): GravityWell = js.native
  /**
    * Emits particles from each active emitter.
    * @param count The number of particles to release from each emitter. The default is the emitter's own {@link Phaser.GameObjects.Particles.ParticleEmitter#quantity}.
    * @param x The x-coordinate to to emit particles from. The default is the x-coordinate of the emitter's current location.
    * @param y The y-coordinate to to emit particles from. The default is the y-coordinate of the emitter's current location.
    */
  def emitParticle(): ParticleEmitterManager = js.native
  def emitParticle(count: integer): ParticleEmitterManager = js.native
  def emitParticle(count: integer, x: Double): ParticleEmitterManager = js.native
  def emitParticle(count: integer, x: Double, y: Double): ParticleEmitterManager = js.native
  /**
    * Emits particles from each active emitter.
    * @param x The x-coordinate to to emit particles from. The default is the x-coordinate of the emitter's current location.
    * @param y The y-coordinate to to emit particles from. The default is the y-coordinate of the emitter's current location.
    * @param count The number of particles to release from each emitter. The default is the emitter's own {@link Phaser.GameObjects.Particles.ParticleEmitter#quantity}.
    */
  def emitParticleAt(): ParticleEmitterManager = js.native
  def emitParticleAt(x: Double): ParticleEmitterManager = js.native
  def emitParticleAt(x: Double, y: Double): ParticleEmitterManager = js.native
  def emitParticleAt(x: Double, y: Double, count: integer): ParticleEmitterManager = js.native
  /**
    * Gets all active particle processors (gravity wells).
    */
  def getProcessors(): js.Array[GravityWell] = js.native
  /**
    * Pauses this Emitter Manager.
    * 
    * This has the effect of pausing all emitters, and all particles of those emitters, currently under its control.
    * 
    * The particles will still render, but they will not have any of their logic updated.
    */
  def pause(): ParticleEmitterManager = js.native
  /**
    * Updates all active emitters.
    * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  def preUpdate(time: integer, delta: Double): Unit = js.native
  /**
    * Resumes this Emitter Manager, should it have been previously paused.
    */
  def resume(): ParticleEmitterManager = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object.
    */
  /* CompleteClass */
  override def setDepth(value: integer): this.type = js.native
  def setEmitterFrames(frames: js.Array[Frame], emitter: ParticleEmitter): ParticleEmitterManager = js.native
  /**
    * Assigns texture frames to an emitter.
    * @param frames The texture frames.
    * @param emitter The particle emitter to modify.
    */
  def setEmitterFrames(frames: Frame, emitter: ParticleEmitter): ParticleEmitterManager = js.native
  /**
    * Sets the frame this Emitter Manager will use to render with.
    * 
    * The Frame has to belong to the current Texture being used.
    * 
    * It can be either a string or an index.
    * @param frame The name or index of the frame within the Texture.
    */
  def setFrame(): ParticleEmitterManager = js.native
  def setFrame(frame: String): ParticleEmitterManager = js.native
  def setFrame(frame: integer): ParticleEmitterManager = js.native
  /**
    * Sets the texture and frame this Emitter Manager will use to render with.
    * 
    * Textures are referenced by their string-based keys, as stored in the Texture Manager.
    * @param key The key of the texture to be used, as stored in the Texture Manager.
    * @param frame The name or index of the frame within the Texture.
    */
  def setTexture(key: String): ParticleEmitterManager = js.native
  def setTexture(key: String, frame: String): ParticleEmitterManager = js.native
  def setTexture(key: String, frame: integer): ParticleEmitterManager = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
}


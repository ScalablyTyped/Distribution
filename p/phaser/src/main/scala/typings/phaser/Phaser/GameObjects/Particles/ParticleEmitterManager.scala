package typings.phaser.Phaser.GameObjects.Particles

import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Structs.List
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.Phaser.Types.GameObjects.Particles.GravityWellConfig
import typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterConfig
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Particle Emitter Manager creates and controls {@link Phaser.GameObjects.Particles.ParticleEmitter Particle Emitters} and {@link Phaser.GameObjects.Particles.GravityWell Gravity Wells}.
  */
@js.native
trait ParticleEmitterManager
  extends GameObject
     with Depth
     with Mask
     with Pipeline
     with Transform
     with Visible {
  
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
  def emitParticle(): this.type = js.native
  def emitParticle(count: js.UndefOr[scala.Nothing], x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
  def emitParticle(count: js.UndefOr[scala.Nothing], x: Double): this.type = js.native
  def emitParticle(count: js.UndefOr[scala.Nothing], x: Double, y: Double): this.type = js.native
  def emitParticle(count: integer): this.type = js.native
  def emitParticle(count: integer, x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
  def emitParticle(count: integer, x: Double): this.type = js.native
  def emitParticle(count: integer, x: Double, y: Double): this.type = js.native
  
  /**
    * Emits particles from each active emitter.
    * @param x The x-coordinate to to emit particles from. The default is the x-coordinate of the emitter's current location.
    * @param y The y-coordinate to to emit particles from. The default is the y-coordinate of the emitter's current location.
    * @param count The number of particles to release from each emitter. The default is the emitter's own {@link Phaser.GameObjects.Particles.ParticleEmitter#quantity}.
    */
  def emitParticleAt(): this.type = js.native
  def emitParticleAt(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], count: integer): this.type = js.native
  def emitParticleAt(x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
  def emitParticleAt(x: js.UndefOr[scala.Nothing], y: Double, count: integer): this.type = js.native
  def emitParticleAt(x: Double): this.type = js.native
  def emitParticleAt(x: Double, y: js.UndefOr[scala.Nothing], count: integer): this.type = js.native
  def emitParticleAt(x: Double, y: Double): this.type = js.native
  def emitParticleAt(x: Double, y: Double, count: integer): this.type = js.native
  
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
  def pause(): this.type = js.native
  
  /**
    * Updates all active emitters.
    * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  def preUpdate(time: integer, delta: Double): Unit = js.native
  
  /**
    * Removes a Particle Emitter from this Emitter Manager, if the Emitter belongs to this Manager.
    */
  def removeEmitter(emitter: ParticleEmitter): ParticleEmitter = js.native
  
  /**
    * Resumes this Emitter Manager, should it have been previously paused.
    */
  def resume(): this.type = js.native
  
  def setEmitterFrames(frames: js.Array[Frame], emitter: ParticleEmitter): this.type = js.native
  /**
    * Assigns texture frames to an emitter.
    * @param frames The texture frames.
    * @param emitter The particle emitter to modify.
    */
  def setEmitterFrames(frames: Frame, emitter: ParticleEmitter): this.type = js.native
  
  /**
    * Sets the frame this Emitter Manager will use to render with.
    * 
    * The Frame has to belong to the current Texture being used.
    * 
    * It can be either a string or an index.
    * @param frame The name or index of the frame within the Texture.
    */
  def setFrame(): this.type = js.native
  def setFrame(frame: String): this.type = js.native
  def setFrame(frame: integer): this.type = js.native
  
  /**
    * Sets the texture and frame this Emitter Manager will use to render with.
    * 
    * Textures are referenced by their string-based keys, as stored in the Texture Manager.
    * @param key The key of the texture to be used, as stored in the Texture Manager.
    * @param frame The name or index of the frame within the Texture.
    */
  def setTexture(key: String): this.type = js.native
  def setTexture(key: String, frame: String): this.type = js.native
  def setTexture(key: String, frame: integer): this.type = js.native
  
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
    * A list of Gravity Wells being managed by this Emitter Manager.
    */
  var wells: List[GravityWell] = js.native
}

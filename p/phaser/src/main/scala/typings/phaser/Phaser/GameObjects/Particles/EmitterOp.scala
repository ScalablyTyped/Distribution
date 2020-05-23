package typings.phaser.Phaser.GameObjects.Particles

import typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback
import typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback
import typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Particle Emitter property.
  * 
  * Facilitates changing Particle properties as they are emitted and throughout their lifetime.
  */
@js.native
trait EmitterOp extends js.Object {
  /**
    * The step counter for stepped easing, per emit.
    */
  var counter: Double = js.native
  /**
    * The default value of this property.
    */
  var defaultValue: Double = js.native
  /**
    * The easing function to use for updating this property.
    */
  var ease: js.Function = js.native
  /**
    * Whether this property can only be modified when a Particle is emitted.
    * 
    * Set to `true` to allow only {@link Phaser.GameObjects.Particles.EmitterOp#onEmit} callbacks to be set and
    * affect this property.
    * 
    * Set to `false` to allow both {@link Phaser.GameObjects.Particles.EmitterOp#onEmit} and
    * {@link Phaser.GameObjects.Particles.EmitterOp#onUpdate} callbacks to be set and affect this property.
    */
  var emitOnly: Boolean = js.native
  /**
    * The end value for this property to ease between.
    */
  var end: Double = js.native
  /**
    * The callback to run for Particles when they are emitted from the Particle Emitter.
    */
  @JSName("onEmit")
  var onEmit_Original: EmitterOpOnEmitCallback = js.native
  /**
    * The callback to run for Particles when they are updated.
    */
  @JSName("onUpdate")
  var onUpdate_Original: EmitterOpOnUpdateCallback = js.native
  /**
    * The name of this property.
    */
  var propertyKey: String = js.native
  /**
    * The value of this property.
    */
  var propertyValue: Double = js.native
  /**
    * The start value for this property to ease between.
    */
  var start: Double = js.native
  /**
    * The number of steps for stepped easing between {@link Phaser.GameObjects.Particles.EmitterOp#start} and
    * {@link Phaser.GameObjects.Particles.EmitterOp#end} values, per emit.
    */
  var steps: Double = js.native
  /**
    * The returned value sets what the property will be at the START of the particles life, on emit.
    * @param particle The particle.
    * @param key The name of the property.
    * @param value The current value of the property.
    */
  def defaultEmit(particle: Particle, key: String): Double = js.native
  def defaultEmit(particle: Particle, key: String, value: Double): Double = js.native
  /**
    * The returned value updates the property for the duration of the particles life.
    * @param particle The particle.
    * @param key The name of the property.
    * @param t The T value (between 0 and 1)
    * @param value The current value of the property.
    */
  def defaultUpdate(particle: Particle, key: String, t: Double, value: Double): Double = js.native
  /**
    * An `onUpdate` callback that returns an eased value between the
    * {@link Phaser.GameObjects.Particles.EmitterOp#start} and {@link Phaser.GameObjects.Particles.EmitterOp#end}
    * range.
    * @param particle The particle.
    * @param key The name of the property.
    * @param t The T value (between 0 and 1)
    */
  def easeValueUpdate(particle: Particle, key: String, t: Double): Double = js.native
  /**
    * An `onEmit` callback for an eased property.
    * 
    * It prepares the particle for easing by {@link Phaser.GameObjects.Particles.EmitterOp#easeValueUpdate}.
    * @param particle The particle.
    * @param key The name of the property.
    */
  def easedValueEmit(particle: Particle, key: String): Double = js.native
  /**
    * Check whether an object has the given property.
    * @param object The object to check.
    * @param key The key of the property to look for in the object.
    */
  def has(`object`: js.Object, key: String): Boolean = js.native
  /**
    * Check whether an object has both of the given properties.
    * @param object The object to check.
    * @param key1 The key of the first property to check the object for.
    * @param key2 The key of the second property to check the object for.
    */
  def hasBoth(`object`: js.Object, key1: String, key2: String): Boolean = js.native
  /**
    * Check whether an object has at least one of the given properties.
    * @param object The object to check.
    * @param key1 The key of the first property to check the object for.
    * @param key2 The key of the second property to check the object for.
    */
  def hasEither(`object`: js.Object, key1: String, key2: String): Boolean = js.native
  /**
    * Load the property from a Particle Emitter configuration object.
    * 
    * Optionally accepts a new property key to use, replacing the current one.
    * @param config Settings for the Particle Emitter that owns this property.
    * @param newKey The new key to use for this property, if any.
    */
  def loadConfig(): Unit = js.native
  def loadConfig(config: ParticleEmitterConfig): Unit = js.native
  def loadConfig(config: ParticleEmitterConfig, newKey: String): Unit = js.native
  /**
    * Change the current value of the property and update its callback methods.
    * @param value The value of the property.
    */
  def onChange(value: Double): this.type = js.native
  /**
    * The callback to run for Particles when they are emitted from the Particle Emitter.
    */
  def onEmit(particle: Particle, key: String, value: Double): Unit = js.native
  /**
    * The callback to run for Particles when they are updated.
    */
  def onUpdate(particle: Particle, key: String, t: Double, value: Double): Unit = js.native
  /**
    * An `onEmit` callback that returns a value between the {@link Phaser.GameObjects.Particles.EmitterOp#start} and
    * {@link Phaser.GameObjects.Particles.EmitterOp#end} range.
    * @param particle The particle.
    * @param key The key of the property.
    */
  def randomRangedValueEmit(particle: Particle, key: String): Double = js.native
  /**
    * An `onEmit` callback that returns a random value from the current value array.
    */
  def randomStaticValueEmit(): Double = js.native
  /**
    * Update the {@link Phaser.GameObjects.Particles.EmitterOp#onEmit} and
    * {@link Phaser.GameObjects.Particles.EmitterOp#onUpdate} callbacks based on the type of the current
    * {@link Phaser.GameObjects.Particles.EmitterOp#propertyValue}.
    */
  def setMethods(): this.type = js.native
  /**
    * An `onEmit` callback that returns the current value of the property.
    */
  def staticValueEmit(): Double = js.native
  /**
    * An `onUpdate` callback that returns the current value of the property.
    */
  def staticValueUpdate(): Double = js.native
  /**
    * An `onEmit` callback that returns a stepped value between the
    * {@link Phaser.GameObjects.Particles.EmitterOp#start} and {@link Phaser.GameObjects.Particles.EmitterOp#end}
    * range.
    */
  def steppedEmit(): Double = js.native
  /**
    * Build a JSON representation of this Particle Emitter property.
    */
  def toJSON(): js.Object = js.native
}


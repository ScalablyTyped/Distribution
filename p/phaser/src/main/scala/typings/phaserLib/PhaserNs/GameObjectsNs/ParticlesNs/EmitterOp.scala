package typings
package phaserLib.PhaserNs.GameObjectsNs.ParticlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Particle Emitter property.
  * 
  * Facilitates changing Particle properties as they are emitted and throughout their lifetime.
  */
@JSGlobal("Phaser.GameObjects.Particles.EmitterOp")
@js.native
class EmitterOp protected () extends js.Object {
  /**
    * 
    * @param config Settings for the Particle Emitter that owns this property.
    * @param key The name of the property.
    * @param defaultValue The default value of the property.
    * @param emitOnly Whether the property can only be modified when a Particle is emitted. Default false.
    */
  def this(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterConfig, key: java.lang.String, defaultValue: scala.Double) = this()
  def this(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterConfig, key: java.lang.String, defaultValue: scala.Double, emitOnly: scala.Boolean) = this()
  /**
    * The step counter for stepped easing, per emit.
    */
  var counter: scala.Double = js.native
  /**
    * The default value of this property.
    */
  var defaultValue: scala.Double = js.native
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
  var emitOnly: scala.Boolean = js.native
  /**
    * The end value for this property to ease between.
    */
  var end: scala.Double = js.native
  /**
    * The callback to run for Particles when they are emitted from the Particle Emitter.
    */
  @JSName("onEmit")
  var onEmit_Original: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnEmitCallback = js.native
  /**
    * The callback to run for Particles when they are updated.
    */
  @JSName("onUpdate")
  var onUpdate_Original: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EmitterOpOnUpdateCallback = js.native
  /**
    * The name of this property.
    */
  var propertyKey: java.lang.String = js.native
  /**
    * The value of this property.
    */
  var propertyValue: scala.Double = js.native
  /**
    * The start value for this property to ease between.
    */
  var start: scala.Double = js.native
  /**
    * The number of steps for stepped easing between {@link Phaser.GameObjects.Particles.EmitterOp#start} and
    * {@link Phaser.GameObjects.Particles.EmitterOp#end} values, per emit.
    */
  var steps: scala.Double = js.native
  /**
    * The returned value sets what the property will be at the START of the particles life, on emit.
    * @param particle The particle.
    * @param key The name of the property.
    * @param value The current value of the property.
    */
  def defaultEmit(particle: Particle, key: java.lang.String): scala.Double = js.native
  def defaultEmit(particle: Particle, key: java.lang.String, value: scala.Double): scala.Double = js.native
  /**
    * The returned value updates the property for the duration of the particles life.
    * @param particle The particle.
    * @param key The name of the property.
    * @param t The T value (between 0 and 1)
    * @param value The current value of the property.
    */
  def defaultUpdate(particle: Particle, key: java.lang.String, t: scala.Double, value: scala.Double): scala.Double = js.native
  /**
    * An `onUpdate` callback that returns an eased value between the
    * {@link Phaser.GameObjects.Particles.EmitterOp#start} and {@link Phaser.GameObjects.Particles.EmitterOp#end}
    * range.
    * @param particle The particle.
    * @param key The name of the property.
    * @param t The T value (between 0 and 1)
    */
  def easeValueUpdate(particle: Particle, key: java.lang.String, t: scala.Double): scala.Double = js.native
  /**
    * An `onEmit` callback that returns an eased value between the
    * {@link Phaser.GameObjects.Particles.EmitterOp#start} and {@link Phaser.GameObjects.Particles.EmitterOp#end}
    * range.
    * @param particle The particle.
    * @param key The name of the property.
    */
  def easedValueEmit(particle: Particle, key: java.lang.String): scala.Double = js.native
  /**
    * Check whether an object has the given property.
    * @param object The object to check.
    * @param key The key of the property to look for in the object.
    */
  def has(`object`: js.Object, key: java.lang.String): scala.Boolean = js.native
  /**
    * Check whether an object has both of the given properties.
    * @param object The object to check.
    * @param key1 The key of the first property to check the object for.
    * @param key2 The key of the second property to check the object for.
    */
  def hasBoth(`object`: js.Object, key1: java.lang.String, key2: java.lang.String): scala.Boolean = js.native
  /**
    * Check whether an object has at least one of the given properties.
    * @param object The object to check.
    * @param key1 The key of the first property to check the object for.
    * @param key2 The key of the second property to check the object for.
    */
  def hasEither(`object`: js.Object, key1: java.lang.String, key2: java.lang.String): scala.Boolean = js.native
  /**
    * Load the property from a Particle Emitter configuration object.
    * 
    * Optionally accepts a new property key to use, replacing the current one.
    * @param config Settings for the Particle Emitter that owns this property.
    * @param newKey The new key to use for this property, if any.
    */
  def loadConfig(): scala.Unit = js.native
  def loadConfig(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterConfig): scala.Unit = js.native
  def loadConfig(
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterConfig,
    newKey: java.lang.String
  ): scala.Unit = js.native
  /**
    * Change the current value of the property and update its callback methods.
    * @param value The value of the property.
    */
  def onChange(value: scala.Double): EmitterOp = js.native
  /**
    * The callback to run for Particles when they are emitted from the Particle Emitter.
    */
  def onEmit(particle: Particle, key: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
    * The callback to run for Particles when they are updated.
    */
  def onUpdate(particle: Particle, key: java.lang.String, t: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
    * An `onEmit` callback that returns a value between the {@link Phaser.GameObjects.Particles.EmitterOp#start} and
    * {@link Phaser.GameObjects.Particles.EmitterOp#end} range.
    * @param particle The particle.
    * @param key The key of the property.
    */
  def randomRangedValueEmit(particle: Particle, key: java.lang.String): scala.Double = js.native
  /**
    * An `onEmit` callback that returns a random value from the current value array.
    */
  def randomStaticValueEmit(): scala.Double = js.native
  /**
    * Update the {@link Phaser.GameObjects.Particles.EmitterOp#onEmit} and
    * {@link Phaser.GameObjects.Particles.EmitterOp#onUpdate} callbacks based on the type of the current
    * {@link Phaser.GameObjects.Particles.EmitterOp#propertyValue}.
    */
  def setMethods(): EmitterOp = js.native
  /**
    * An `onEmit` callback that returns the current value of the property.
    */
  def staticValueEmit(): scala.Double = js.native
  /**
    * An `onUpdate` callback that returns the current value of the property.
    */
  def staticValueUpdate(): scala.Double = js.native
  /**
    * An `onEmit` callback that returns a stepped value between the
    * {@link Phaser.GameObjects.Particles.EmitterOp#start} and {@link Phaser.GameObjects.Particles.EmitterOp#end}
    * range.
    */
  def steppedEmit(): scala.Double = js.native
  /**
    * Build a JSON representation of this Particle Emitter property.
    */
  def toJSON(): js.Object = js.native
}


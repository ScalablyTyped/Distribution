package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Animations.AnimationState
import typings.phaser.Phaser.GameObjects.Components.AlphaSingle
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.PostPipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.TransformMatrix
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.GameObjects.Particles.Zones.DeathZone
import typings.phaser.Phaser.GameObjects.Particles.Zones.EdgeZone
import typings.phaser.Phaser.GameObjects.Particles.Zones.RandomZone
import typings.phaser.Phaser.Geom.Point
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Physics.Arcade.Body
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.Phaser.Types.GameObjects.Particles.DeathZoneObject
import typings.phaser.Phaser.Types.GameObjects.Particles.DeathZoneSource
import typings.phaser.Phaser.Types.GameObjects.Particles.EdgeZoneSource
import typings.phaser.Phaser.Types.GameObjects.Particles.EmitZoneObject
import typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback
import typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnEmitType
import typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback
import typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateType
import typings.phaser.Phaser.Types.GameObjects.Particles.GravityWellConfig
import typings.phaser.Phaser.Types.GameObjects.Particles.ParticleDeathCallback
import typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterBounds
import typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterBoundsAlt
import typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterCallback
import typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterConfig
import typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterFrameConfig
import typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterOps
import typings.phaser.Phaser.Types.GameObjects.Particles.ParticleSortCallback
import typings.phaser.Phaser.Types.GameObjects.Particles.RandomZoneSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Particles {
  
  /**
    * This class is responsible for taking control over the color property
    * in the Particle class and managing its emission and updating functions.
    * 
    * See the `ParticleEmitter` class for more details on emitter op configuration.
    */
  trait EmitterColorOp extends StObject {
    
    /**
      * An array containing the blue color values.
      * 
      * Populated during the `setMethods` method.
      */
    var b: js.Array[Double]
    
    /**
      * An `onUpdate` callback that returns an eased value between the
      * {@link Phaser.GameObjects.Particles.EmitterColorOp#start} and {@link Phaser.GameObjects.Particles.EmitterColorOp#end}
      * range.
      * @param particle The particle.
      * @param key The name of the property.
      * @param t The current normalized lifetime of the particle, between 0 (birth) and 1 (death).
      */
    def easeValueUpdate(particle: Particle, key: String, t: Double): Double
    
    /**
      * An `onEmit` callback for an eased property.
      * 
      * It prepares the particle for easing by {@link Phaser.GameObjects.Particles.EmitterColorOp#easeValueUpdate}.
      * @param particle The particle.
      * @param key The name of the property.
      */
    def easedValueEmit(particle: Particle, key: String): Double
    
    /**
      * An array containing the green color values.
      * 
      * Populated during the `setMethods` method.
      */
    var g: js.Array[Double]
    
    /**
      * Checks the type of `EmitterOp.propertyValue` to determine which
      * method is required in order to return values from this op function.
      */
    def getMethod(): Double
    
    /**
      * An array containing the red color values.
      * 
      * Populated during the `setMethods` method.
      */
    var r: js.Array[Double]
    
    /**
      * Sets the Ease function to use for Color interpolation.
      * @param ease The string-based name of the Ease function to use.
      */
    def setEase(ease: String): Unit
    
    /**
      * Sets the EmitterColorOp method values, if in use.
      */
    def setMethods(): this.type
  }
  object EmitterColorOp {
    
    inline def apply(
      b: js.Array[Double],
      easeValueUpdate: (Particle, String, Double) => Double,
      easedValueEmit: (Particle, String) => Double,
      g: js.Array[Double],
      getMethod: () => Double,
      r: js.Array[Double],
      setEase: String => Unit,
      setMethods: () => EmitterColorOp
    ): EmitterColorOp = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], easeValueUpdate = js.Any.fromFunction3(easeValueUpdate), easedValueEmit = js.Any.fromFunction2(easedValueEmit), g = g.asInstanceOf[js.Any], getMethod = js.Any.fromFunction0(getMethod), r = r.asInstanceOf[js.Any], setEase = js.Any.fromFunction1(setEase), setMethods = js.Any.fromFunction0(setMethods))
      __obj.asInstanceOf[EmitterColorOp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmitterColorOp] (val x: Self) extends AnyVal {
      
      inline def setB(value: js.Array[Double]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBVarargs(value: Double*): Self = StObject.set(x, "b", js.Array(value*))
      
      inline def setEaseValueUpdate(value: (Particle, String, Double) => Double): Self = StObject.set(x, "easeValueUpdate", js.Any.fromFunction3(value))
      
      inline def setEasedValueEmit(value: (Particle, String) => Double): Self = StObject.set(x, "easedValueEmit", js.Any.fromFunction2(value))
      
      inline def setG(value: js.Array[Double]): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setGVarargs(value: Double*): Self = StObject.set(x, "g", js.Array(value*))
      
      inline def setGetMethod(value: () => Double): Self = StObject.set(x, "getMethod", js.Any.fromFunction0(value))
      
      inline def setR(value: js.Array[Double]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRVarargs(value: Double*): Self = StObject.set(x, "r", js.Array(value*))
      
      inline def setSetEase(value: String => Unit): Self = StObject.set(x, "setEase", js.Any.fromFunction1(value))
      
      inline def setSetMethods(value: () => EmitterColorOp): Self = StObject.set(x, "setMethods", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * This class is responsible for taking control over a single property
    * in the Particle class and managing its emission and updating functions.
    * 
    * Particles properties such as `x`, `y`, `scaleX`, `lifespan` and others all use
    * EmitterOp instances to manage them, as they can be given in a variety of
    * formats: from simple values, to functions, to dynamic callbacks.
    * 
    * See the `ParticleEmitter` class for more details on emitter op configuration.
    */
  @js.native
  trait EmitterOp extends StObject {
    
    /**
      * Set to `false` to disable this EmitterOp.
      */
    var active: Boolean = js.native
    
    /**
      * The step counter for stepped easing, per emit.
      */
    var counter: Double = js.native
    
    /**
      * The most recently calculated value. Updated every time an
      * emission or update method is called. Treat as read-only.
      */
    var current: Double = js.native
    
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
      * @param t The current normalized lifetime of the particle, between 0 (birth) and 1 (death).
      * @param value The current value of the property.
      */
    def defaultUpdate(particle: Particle, key: String, t: Double, value: Double): Double = js.native
    
    /**
      * The default value of this property.
      * 
      * This can be a simple value, an array, a function or an onEmit
      * configuration object.
      */
    var defaultValue: EmitterOpOnEmitType = js.native
    
    /**
      * Destroys this EmitterOp instance and all of its references.
      * 
      * Called automatically when the ParticleEmitter that owns this
      * EmitterOp is destroyed.
      */
    def destroy(): Unit = js.native
    
    /**
      * The counter direction. 0 for up and 1 for down.
      */
    var direction: Double = js.native
    
    /**
      * The easing function to use for updating this property, if any.
      */
    var ease: js.Function | Null = js.native
    
    /**
      * An `onUpdate` callback that returns an eased value between the
      * {@link Phaser.GameObjects.Particles.EmitterOp#start} and {@link Phaser.GameObjects.Particles.EmitterOp#end}
      * range.
      * @param particle The particle.
      * @param key The name of the property.
      * @param t The current normalized lifetime of the particle, between 0 (birth) and 1 (death).
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
      * Checks the type of `EmitterOp.propertyValue` to determine which
      * method is required in order to return values from this op function.
      */
    def getMethod(): Double = js.native
    
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
      * The interpolation function to use for updating this property, if any.
      */
    var interpolation: js.Function | Null = js.native
    
    /**
      * Load the property from a Particle Emitter configuration object.
      * 
      * Optionally accepts a new property key to use, replacing the current one.
      * @param config Settings for the Particle Emitter that owns this property.
      * @param newKey The new key to use for this property, if any.
      */
    def loadConfig(): Unit = js.native
    def loadConfig(config: Unit, newKey: String): Unit = js.native
    def loadConfig(config: ParticleEmitterConfig): Unit = js.native
    def loadConfig(config: ParticleEmitterConfig, newKey: String): Unit = js.native
    
    /**
      * The onEmit method type of this EmitterOp.
      * 
      * Set as part of `setMethod` and cached here to avoid
      * re-setting when only the value changes.
      */
    var method: Double = js.native
    
    /**
      * Change the current value of the property and update its callback methods.
      * @param value The new numeric value of this property.
      */
    def onChange(value: Double): this.type = js.native
    
    /**
      * The callback to run for Particles when they are emitted from the Particle Emitter.
      */
    def onEmit(particle: Particle, key: String, value: Double): Double = js.native
    /**
      * The callback to run for Particles when they are emitted from the Particle Emitter.
      */
    @JSName("onEmit")
    var onEmit_Original: EmitterOpOnEmitCallback = js.native
    
    /**
      * The callback to run for Particles when they are updated.
      */
    def onUpdate(particle: Particle, key: String, t: Double, value: Double): Double = js.native
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
      * The current value of this property.
      * 
      * This can be a simple value, an array, a function or an onEmit
      * configuration object.
      */
    var propertyValue: EmitterOpOnEmitType = js.native
    
    /**
      * The returned value sets what the property will be at the START of the particles life, on emit.
      * 
      * This method is only used when you have provided a custom emit callback.
      * @param particle The particle.
      * @param key The name of the property.
      * @param value The current value of the property.
      */
    def proxyEmit(particle: Particle, key: String): Double = js.native
    def proxyEmit(particle: Particle, key: String, value: Double): Double = js.native
    
    /**
      * The returned value updates the property for the duration of the particles life.
      * 
      * This method is only used when you have provided a custom update callback.
      * @param particle The particle.
      * @param key The name of the property.
      * @param t The current normalized lifetime of the particle, between 0 (birth) and 1 (death).
      * @param value The current value of the property.
      */
    def proxyUpdate(particle: Particle, key: String, t: Double, value: Double): Double = js.native
    
    /**
      * An `onEmit` callback that returns a value between the {@link Phaser.GameObjects.Particles.EmitterOp#start} and
      * {@link Phaser.GameObjects.Particles.EmitterOp#end} range.
      * @param particle The particle.
      * @param key The key of the property.
      */
    def randomRangedIntEmit(particle: Particle, key: String): Double = js.native
    
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
      * {@link Phaser.GameObjects.Particles.EmitterOp#onUpdate} callbacks based on the method returned
      * from `getMethod`. The method is stored in the `EmitterOp.method` property
      * and is a number between 0 and 9 inclusively.
      */
    def setMethods(): this.type = js.native
    
    /**
      * The start value for this property to ease between.
      * 
      * If an interpolation this holds a reference to the number data array.
      */
    var start: Double | js.Array[Double] = js.native
    
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
      * The number of steps for stepped easing between {@link Phaser.GameObjects.Particles.EmitterOp#start} and
      * {@link Phaser.GameObjects.Particles.EmitterOp#end} values, per emit.
      */
    var steps: Double = js.native
    
    /**
      * Build a JSON representation of this Particle Emitter property.
      */
    def toJSON(): js.Object = js.native
    
    /**
      * When the step counter reaches it's maximum, should it then
      * yoyo back to the start again, or flip over to it?
      */
    var yoyo: Boolean = js.native
  }
  
  /**
    * The Gravity Well Particle Processor applies a force on the particles to draw
    * them towards, or repel them from, a single point.
    * 
    * The force applied is inversely proportional to the square of the distance
    * from the particle to the point, in accordance with Newton's law of gravity.
    * 
    * This simulates the effect of gravity over large distances (as between planets, for example).
    */
  trait GravityWell
    extends StObject
       with ParticleProcessor {
    
    /**
      * The minimum distance for which the gravity force is calculated.
      * 
      * Defaults to 100.
      */
    var epsilon: Double
    
    /**
      * The gravitational force of this Gravity Well.
      * 
      * Defaults to 50.
      */
    var gravity: Double
    
    /**
      * The strength of the gravity force - larger numbers produce a stronger force.
      * 
      * Defaults to 0.
      */
    var power: Double
    
    /**
      * Takes a Particle and updates it based on the properties of this Gravity Well.
      * @param particle The Particle to update.
      * @param delta The delta time in ms.
      * @param step The delta value divided by 1000.
      */
    def update(particle: Particle, delta: Double, step: Double): Unit
  }
  object GravityWell {
    
    inline def apply(
      active: Boolean,
      destroy: () => Unit,
      epsilon: Double,
      gravity: Double,
      manager: ParticleEmitter,
      power: Double,
      update: (Particle, Double, Double) => Unit,
      x: Double,
      y: Double
    ): GravityWell = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), epsilon = epsilon.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[GravityWell]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GravityWell] (val x: Self) extends AnyVal {
      
      inline def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: (Particle, Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    }
  }
  
  /**
    * A Particle is a simple object owned and controlled by a Particle Emitter.
    * 
    * It encapsulates all of the properties required to move and update according
    * to the Emitters operations.
    */
  @js.native
  trait Particle extends StObject {
    
    /**
      * The x acceleration of this Particle.
      */
    var accelerationX: Double = js.native
    
    /**
      * The y acceleration of this Particle.
      */
    var accelerationY: Double = js.native
    
    /**
      * The alpha value of this Particle.
      */
    var alpha: Double = js.native
    
    /**
      * The angle of this Particle in degrees.
      */
    var angle: Double = js.native
    
    /**
      * The Animation State component of this Particle.
      * 
      * This component provides features to apply animations to this Particle.
      * It is responsible for playing, loading, queuing animations for later playback,
      * mixing between animations and setting the current animation frame to this Particle.
      */
    var anims: AnimationState = js.native
    
    /**
      * The bounciness, or restitution, of this Particle.
      */
    var bounce: Double = js.native
    
    /**
      * A rectangle that holds the bounds of this Particle after a call to
      * the `Particle.getBounds` method has been made.
      */
    var bounds: typings.phaser.Phaser.Geom.Rectangle = js.native
    
    /**
      * An internal method that calculates the velocity of the Particle and
      * its world position. It also runs it against any active Processors
      * that are set on the Emitter.
      * @param emitter The Emitter that is updating this Particle.
      * @param delta The delta time in ms.
      * @param step The delta value divided by 1000.
      * @param processors An array of all active Particle Processors.
      * @param t The current normalized lifetime of the particle, between 0 (birth) and 1 (death).
      */
    def computeVelocity(
      emitter: ParticleEmitter,
      delta: Double,
      step: Double,
      processors: js.Array[ParticleProcessor],
      t: Double
    ): Unit = js.native
    
    /**
      * The data used by the ease equation.
      */
    var data: js.Object = js.native
    
    /**
      * The delay applied to this Particle upon emission, in ms.
      */
    var delayCurrent: Double = js.native
    
    /**
      * Destroys this Particle.
      */
    def destroy(): Unit = js.native
    
    /**
      * The Event Emitter proxy.
      * 
      * Passes on all parameters to the `ParticleEmitter` to emit directly.
      * @param event The event name.
      * @param a1 Optional argument 1.
      * @param a2 Optional argument 2.
      * @param a3 Optional argument 3.
      * @param a4 Optional argument 4.
      * @param a5 Optional argument 5.
      */
    def emit(
      event: String | js.Symbol,
      a1: js.UndefOr[Any],
      a2: js.UndefOr[Any],
      a3: js.UndefOr[Any],
      a4: js.UndefOr[Any],
      a5: js.UndefOr[Any]
    ): Boolean = js.native
    
    /**
      * The Emitter to which this Particle belongs.
      * 
      * A Particle can only belong to a single Emitter and is created, updated and destroyed by it.
      */
    var emitter: ParticleEmitter = js.native
    
    /**
      * Starts this Particle from the given coordinates.
      * @param x The x coordinate to launch this Particle from.
      * @param y The y coordinate to launch this Particle from.
      */
    def fire(): Boolean = js.native
    def fire(x: Double): Boolean = js.native
    def fire(x: Double, y: Double): Boolean = js.native
    def fire(x: Unit, y: Double): Boolean = js.native
    
    /**
      * The texture frame used by this Particle when it renders.
      */
    var frame: Frame = js.native
    
    /**
      * Gets the bounds of this particle as a Geometry Rectangle, factoring in any
      * transforms of the parent emitter and anything else above it in the display list.
      * 
      * Once calculated the bounds can be accessed via the `Particle.bounds` property.
      * @param matrix Optional transform matrix to apply to this particle.
      */
    def getBounds(): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(matrix: TransformMatrix): typings.phaser.Phaser.Geom.Rectangle = js.native
    
    /**
      * The hold applied to this Particle before it expires, in ms.
      */
    var holdCurrent: Double = js.native
    
    /**
      * Checks to see if this Particle is alive and updating.
      */
    def isAlive(): Boolean = js.native
    
    /**
      * Kills this particle. This sets the `lifeCurrent` value to 0, which forces
      * the Particle to be removed the next time its parent Emitter runs an update.
      */
    def kill(): Unit = js.native
    
    /**
      * The lifespan of this Particle in ms.
      */
    var life: Double = js.native
    
    /**
      * The current life of this Particle in ms.
      */
    var lifeCurrent: Double = js.native
    
    /**
      * The normalized lifespan T value, where 0 is the start and 1 is the end.
      */
    var lifeT: Double = js.native
    
    /**
      * The maximum horizontal velocity this Particle can travel at.
      */
    var maxVelocityX: Double = js.native
    
    /**
      * The maximum vertical velocity this Particle can travel at.
      */
    var maxVelocityY: Double = js.native
    
    /**
      * The angle of this Particle in radians.
      */
    var rotation: Double = js.native
    
    /**
      * The horizontal scale of this Particle.
      */
    var scaleX: Double = js.native
    
    /**
      * The vertical scale of this Particle.
      */
    var scaleY: Double = js.native
    
    /**
      * A reference to the Scene to which this Game Object belongs.
      * 
      * Game Objects can only belong to one Scene.
      * 
      * You should consider this property as being read-only. You cannot move a
      * Game Object to another Scene by simply changing it.
      */
    var scene: Scene = js.native
    
    /**
      * Sets the position of this particle to the given x/y coordinates.
      * 
      * If the parameters are left undefined, it resets the particle back to 0x0.
      * @param x The x coordinate to set this Particle to. Default 0.
      * @param y The y coordinate to set this Particle to. Default 0.
      */
    def setPosition(): Unit = js.native
    def setPosition(x: Double): Unit = js.native
    def setPosition(x: Double, y: Double): Unit = js.native
    def setPosition(x: Unit, y: Double): Unit = js.native
    
    /**
      * This is a NOOP method and does nothing when called.
      */
    def setSizeToFrame(): Unit = js.native
    
    /**
      * The texture used by this Particle when it renders.
      */
    var texture: Texture = js.native
    
    /**
      * The tint applied to this Particle.
      */
    var tint: Double = js.native
    
    /**
      * The main update method for this Particle.
      * 
      * Updates its life values, computes the velocity and repositions the Particle.
      * @param delta The delta time in ms.
      * @param step The delta value divided by 1000.
      * @param processors An array of all active Particle Processors.
      */
    def update(delta: Double, step: Double, processors: js.Array[ParticleProcessor]): Boolean = js.native
    
    /**
      * The x velocity of this Particle.
      */
    var velocityX: Double = js.native
    
    /**
      * The y velocity of this Particle.
      */
    var velocityY: Double = js.native
    
    /**
      * The coordinates of this Particle in world space.
      * 
      * Updated as part of `computeVelocity`.
      */
    var worldPosition: Vector2 = js.native
    
    /**
      * The x coordinate of this Particle.
      */
    var x: Double = js.native
    
    /**
      * The y coordinate of this Particle.
      */
    var y: Double = js.native
  }
  
  /**
    * The Particle Bounds Processor.
    * 
    * Defines a rectangular region, in world space, within which particle movement
    * is restrained.
    * 
    * Use the properties `collideLeft`, `collideRight`, `collideTop` and
    * `collideBottom` to control if a particle will rebound off the sides
    * of this boundary, or not.
    * 
    * This happens when the particles worldPosition x/y coordinate hits the boundary.
    * 
    * The strength of the rebound is determined by the `Particle.bounce` property.
    */
  trait ParticleBounds
    extends StObject
       with ParticleProcessor {
    
    /**
      * A rectangular boundary constraining particle movement. Use the Emitter properties `collideLeft`,
      * `collideRight`, `collideTop` and `collideBottom` to control if a particle will rebound off
      * the sides of this boundary, or not. This happens when the particles x/y coordinate hits
      * the boundary.
      */
    var bounds: typings.phaser.Phaser.Geom.Rectangle
    
    /**
      * Whether particles interact with the bottom edge of the emitter {@link Phaser.GameObjects.Particles.ParticleBounds#bounds}.
      */
    var collideBottom: Boolean
    
    /**
      * Whether particles interact with the left edge of the emitter {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds}.
      */
    var collideLeft: Boolean
    
    /**
      * Whether particles interact with the right edge of the emitter {@link Phaser.GameObjects.Particles.ParticleBounds#bounds}.
      */
    var collideRight: Boolean
    
    /**
      * Whether particles interact with the top edge of the emitter {@link Phaser.GameObjects.Particles.ParticleBounds#bounds}.
      */
    var collideTop: Boolean
    
    /**
      * Takes a Particle and updates it against the bounds.
      * @param particle The Particle to update.
      */
    def update(particle: Particle): Unit
  }
  object ParticleBounds {
    
    inline def apply(
      active: Boolean,
      bounds: typings.phaser.Phaser.Geom.Rectangle,
      collideBottom: Boolean,
      collideLeft: Boolean,
      collideRight: Boolean,
      collideTop: Boolean,
      destroy: () => Unit,
      manager: ParticleEmitter,
      update: Particle => Unit,
      x: Double,
      y: Double
    ): ParticleBounds = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], collideBottom = collideBottom.asInstanceOf[js.Any], collideLeft = collideLeft.asInstanceOf[js.Any], collideRight = collideRight.asInstanceOf[js.Any], collideTop = collideTop.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), manager = manager.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticleBounds]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParticleBounds] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: typings.phaser.Phaser.Geom.Rectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setCollideBottom(value: Boolean): Self = StObject.set(x, "collideBottom", value.asInstanceOf[js.Any])
      
      inline def setCollideLeft(value: Boolean): Self = StObject.set(x, "collideLeft", value.asInstanceOf[js.Any])
      
      inline def setCollideRight(value: Boolean): Self = StObject.set(x, "collideRight", value.asInstanceOf[js.Any])
      
      inline def setCollideTop(value: Boolean): Self = StObject.set(x, "collideTop", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Particle => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A Particle Emitter is a special kind of Game Object that controls a pool of {@link Phaser.GameObjects.Particles.Particle Particles}.
    * 
    * Particle Emitters are created via a configuration object. The properties of this object
    * can be specified in a variety of formats, given you plenty of scope over the values they
    * return, leading to complex visual effects. Here are the different forms of configuration
    * value you can give:
    * 
    * ## An explicit static value:
    * 
    * ```js
    * x: 400
    * ```
    * 
    * The x value will always be 400 when the particle is spawned.
    * 
    * ## A random value:
    * 
    * ```js
    * x: [ 100, 200, 300, 400 ]
    * ```
    * 
    * The x value will be one of the 4 elements in the given array, picked at random on emission.
    * 
    * ## A custom callback:
    * 
    * ```js
    * x: (particle, key, t, value) => {
    *   return value + 50;
    * }
    * ```
    * 
    * The x value is the result of calling this function. This is only used when the
    * particle is emitted, so it provides it's initial starting value. It is not used
    * when the particle is updated (see the onUpdate callback for that)
    * 
    * ## A start / end object:
    * 
    * This allows you to control the change in value between the given start and
    * end parameters over the course of the particles lifetime:
    * 
    * ```js
    * scale: { start: 0, end: 1 }
    * ```
    * 
    * The particle scale will start at 0 when emitted and ease to a scale of 1
    * over the course of its lifetime. You can also specify the ease function
    * used for this change (the default is Linear):
    * 
    * ```js
    * scale: { start: 0, end: 1, ease: 'bounce.out' }
    * ```
    * 
    * ## A start / end random object:
    * 
    * The start and end object can have an optional `random` parameter.
    * This forces it to pick a random value between the two values and use
    * this as the starting value, then easing to the 'end' parameter over
    * its lifetime.
    * 
    * ```js
    * scale: { start: 4, end: 0.5, random: true }
    * ```
    * 
    * The particle will start with a random scale between 0.5 and 4 and then
    * scale to the end value over its lifetime. You can combine the above
    * with the `ease` parameter as well to control the value easing.
    * 
    * ## An interpolation object:
    * 
    * You can provide an array of values which will be used for interpolation
    * during the particles lifetime. You can also define the interpolation
    * function to be used. There are three provided: `linear` (the default),
    * `bezier` and `catmull`, or you can provide your own function.
    * 
    * ```js
    * x: { values: [ 50, 500, 200, 800 ], interpolation: 'catmull' }
    * ```
    * 
    * The particle scale will interpolate from 50 when emitted to 800 via the other
    * points over the course of its lifetime. You can also specify an ease function
    * used to control the rate of change through the values (the default is Linear):
    * 
    * ```js
    * x: { values: [ 50, 500, 200, 800 ], interpolation: 'catmull', ease: 'bounce.out }
    * ```
    * 
    * ## A stepped emitter object:
    * 
    * The `steps` parameter allows you to control the placement of sequential
    * particles across the start-end range:
    * 
    * ```js
    * x: { steps: 32, start: 0, end: 576 }
    * ```
    * 
    * Here we have a range of 576 (start to end). This is divided into 32 steps.
    * 
    * The first particle will emit at the x position of 0. The next will emit
    * at the next 'step' along, which would be 18. The following particle will emit
    * at the next step, which is 36, and so on. Because the range of 576 has been
    * divided by 32, creating 18 pixels steps. When a particle reaches the 'end'
    * value the next one will start from the beginning again.
    * 
    * ## A stepped emitter object with yoyo:
    * 
    * You can add the optional `yoyo` property to a stepped object:
    * 
    * ```js
    * x: { steps: 32, start: 0, end: 576, yoyo: true }
    * ```
    * 
    * As with the stepped emitter, particles are emitted in sequence, from 'start'
    * to 'end' in step sized jumps. Normally, when a stepped emitter reaches the
    * end it snaps around to the start value again. However, if you provide the 'yoyo'
    * parameter then when it reaches the end it will reverse direction and start
    * emitting back down to 'start' again. Depending on the effect you require this
    * can often look better.
    * 
    * ## A min / max object:
    * 
    * This allows you to pick a random float value between the min and max properties:
    * 
    * ```js
    * x: { min: 100, max: 700 }
    * ```
    * 
    * The x value will be a random float between min and max.
    * 
    * You can force it select an integer by setting the 'int' flag:
    * 
    * ```js
    * x: { min: 100, max: 700, int: true }
    * ```
    * 
    * Or, you could use the 'random' array approach (see below)
    * 
    * ## A random object:
    * 
    * This allows you to pick a random integer value between the first and second array elements:
    * 
    * ```js
    * x: { random: [ 100, 700 ] }
    * ```
    * 
    * The x value will be a random integer between 100 and 700 as it takes the first
    * element in the 'random' array as the 'min' value and the 2nd element as the 'max' value.
    * 
    * ## Custom onEmit and onUpdate callbacks:
    * 
    * If the above won't give you the effect you're after, you can provide your own
    * callbacks that will be used when the particle is both emitted and updated:
    * 
    * ```js
    * x: {
    *   onEmit: (particle, key, t, value) => {
    *     return value;
    *   },
    *   onUpdate: (particle, key, t, value) => {
    *     return value;
    *   }
    * }
    * ```
    * 
    * You can provide either one or both functions. The `onEmit` is called at the
    * start of the particles life and defines the value of the property on birth.
    * 
    * The `onUpdate` function is called every time the Particle Emitter updates
    * until the particle dies. Both must return a value.
    * 
    * The properties are:
    * 
    * particle - A reference to the Particle instance.
    * key - The string based key of the property, i.e. 'x' or 'lifespan'.
    * t - The current normalized lifetime of the particle, between 0 (birth) and 1 (death).
    * value - The current property value. At a minimum you should return this.
    * 
    * By using the above configuration options you have an unlimited about of
    * control over how your particles behave.
    * 
    * ## v3.55 Differences
    * 
    * Prior to v3.60 Phaser used a `ParticleEmitterManager`. This was removed in v3.60
    * and now calling `this.add.particles` returns a `ParticleEmitter` instance instead.
    * 
    * In order to streamline memory and the display list we have removed the
    * `ParticleEmitterManager` entirely. When you call `this.add.particles` you're now
    * creating a `ParticleEmitter` instance, which is being added directly to the
    * display list and can be manipulated just like any other Game Object, i.e.
    * scaled, rotated, positioned, added to a Container, etc. It now extends the
    * `GameObject` base class, meaning it's also an event emitter, which allowed us
    * to create some handy new events for particles.
    * 
    * So, to create an emitter, you now give it an xy coordinate, a texture and an
    * emitter configuration object (you can also set this later, but most commonly
    * you'd do it on creation). I.e.:
    * 
    * ```js
    * const emitter = this.add.particles(100, 300, 'flares', {
    *   frame: 'red',
    *   angle: { min: -30, max: 30 },
    *   speed: 150
    * });
    * ```
    * 
    * This will create a 'red flare' emitter at 100 x 300.
    * 
    * Please update your code to ensure it adheres to the new function signatures.
    */
  @js.native
  trait ParticleEmitter
    extends StObject
       with GameObject
       with AlphaSingle
       with BlendMode
       with Depth
       with Mask
       with Pipeline
       with PostPipeline
       with ScrollFactor
       with typings.phaser.Phaser.GameObjects.Components.Texture
       with Transform
       with Visible {
    
    /**
      * Whether accelerationX and accelerationY are non-zero. Set automatically during configuration.
      */
    var acceleration: Boolean = js.native
    
    /**
      * The horizontal acceleration applied to emitted particles, in pixels per second squared.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var accelerationX: EmitterOpOnEmitType = js.native
    
    /**
      * The vertical acceleration applied to emitted particles, in pixels per second squared.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var accelerationY: EmitterOpOnEmitType = js.native
    
    def addDeathZone(config: js.Array[DeathZoneObject]): DeathZone = js.native
    /**
      * Adds a new Particle Death Zone to this Emitter.
      * 
      * A particle is immediately killed as soon as its x/y coordinates intersect
      * with any of the configured Death Zones.
      * 
      * The `source` can be a Geometry Shape, such as a Circle, Rectangle or Triangle.
      * Any valid object from the `Phaser.Geometry` namespace is allowed, as long as
      * it supports a `contains` function. You can set the `type` to be either `onEnter`
      * or `onLeave`.
      * 
      * A single Death Zone instance can only exist once within this Emitter, but can belong
      * to multiple Emitters.
      * @param config A Death Zone configuration object, a Death Zone instance, a valid Geometry object or an array of them.
      */
    def addDeathZone(config: DeathZoneObject): DeathZone = js.native
    
    def addEmitZone(zone: js.Array[EmitZoneObject]): js.Array[EdgeZone | RandomZone] = js.native
    /**
      * Adds a new Particle Emission Zone to this Emitter.
      * 
      * An {@link Phaser.Types.GameObjects.Particles.ParticleEmitterEdgeZoneConfig EdgeZone} places particles on its edges.
      * Its {@link Phaser.Types.GameObjects.Particles.EdgeZoneSource source} can be a Curve, Path, Circle, Ellipse, Line, Polygon, Rectangle, or Triangle;
      * or any object with a suitable {@link Phaser.Types.GameObjects.Particles.EdgeZoneSourceCallback getPoints} method.
      * 
      * A {@link Phaser.Types.GameObjects.Particles.ParticleEmitterRandomZoneConfig RandomZone} places the particles randomly within its interior.
      * Its {@link RandomZoneSource source} can be a Circle, Ellipse, Line, Polygon, Rectangle, or Triangle; or any object with a suitable {@link Phaser.Types.GameObjects.Particles.RandomZoneSourceCallback getRandomPoint} method.
      * 
      * An Emission Zone can only exist once within this Emitter.
      * @param zone An Emission Zone configuration object, a RandomZone or EdgeZone instance, or an array of them.
      */
    def addEmitZone(zone: EmitZoneObject): js.Array[EdgeZone | RandomZone] = js.native
    
    /**
      * Creates a Particle Bounds processor and adds it to this Emitter.
      * 
      * This processor will check to see if any of the active Particles hit
      * the defined boundary, as specified by a Rectangle shape in world-space.
      * 
      * If so, they are 'rebounded' back again by having their velocity adjusted.
      * 
      * The strength of the rebound is controlled by the `Particle.bounce`
      * property.
      * 
      * You should be careful to ensure that you emit particles within a bounds,
      * if set, otherwise it will lead to unpredictable visual results as the
      * particles are hastily repositioned.
      * 
      * The Particle Bounds processor is returned from this method. If you wish
      * to modify the area you can directly change its `bounds` property, along
      * with the `collideLeft` etc values.
      * 
      * To disable the bounds you can either set its `active` property to `false`,
      * or if you no longer require it, call `ParticleEmitter.removeParticleProcessor`.
      * @param x The x-coordinate of the left edge of the boundary, or an object representing a rectangle.
      * @param y The y-coordinate of the top edge of the boundary.
      * @param width The width of the boundary.
      * @param height The height of the boundary.
      * @param collideLeft Whether particles interact with the left edge of the bounds. Default true.
      * @param collideRight Whether particles interact with the right edge of the bounds. Default true.
      * @param collideTop Whether particles interact with the top edge of the bounds. Default true.
      * @param collideBottom Whether particles interact with the bottom edge of the bounds. Default true.
      */
    def addParticleBounds(
      x: Double | ParticleEmitterBounds | ParticleEmitterBoundsAlt,
      y: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      collideLeft: js.UndefOr[Boolean],
      collideRight: js.UndefOr[Boolean],
      collideTop: js.UndefOr[Boolean],
      collideBottom: js.UndefOr[Boolean]
    ): ParticleBounds = js.native
    
    /**
      * Adds a Particle Processor, such as a Gravity Well, to this Emitter.
      * 
      * It will start processing particles from the next update as long as its `active`
      * property is set.
      * @param processor The Particle Processor to add to this Emitter Manager.
      */
    def addParticleProcessor[T /* <: ParticleProcessor */](processor: T): T = js.native
    
    /**
      * The internal animation counter.
      * 
      * Treat this property as read-only.
      */
    var animCounter: Double = js.native
    
    /**
      * The number of consecutive particles that receive a single animation (per frame cycle).
      */
    var animQuantity: Double = js.native
    
    /**
      * The animations assigned to particles.
      */
    var anims: js.Array[String] = js.native
    
    /**
      * Whether this emitter is at either its hard-cap limit (maxParticles), if set, or
      * the max allowed number of 'alive' particles (maxAliveParticles).
      */
    def atLimit(): Boolean = js.native
    
    /**
      * The amount of velocity particles will use when rebounding off the
      * emitter bounds, if set. A value of 0 means no bounce. A value of 1
      * means a full rebound.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var bounce: EmitterOpOnEmitType = js.native
    
    /**
      * Controls the easing function used when you have created an
      * Emitter that uses the `color` property to interpolate the
      * tint of Particles over their lifetime.
      * 
      * Setting this has no effect if you haven't also applied a
      * `particleColor` to this Emitter.
      */
    var colorEase: String = js.native
    
    /**
      * The internal complete flag.
      * 
      * Treat this property as read-only.
      */
    var completeFlag: Boolean = js.native
    
    /**
      * Prints a warning to the console if you mistakenly call this function
      * thinking it works the same way as Phaser v3.55.
      */
    def createEmitter(): Unit = js.native
    
    /**
      * Creates a new Gravity Well, adds it to this Emitter and returns a reference to it.
      * @param config Configuration settings for the Gravity Well to create.
      */
    def createGravityWell(config: GravityWellConfig): GravityWell = js.native
    
    /**
      * The current animation index.
      * 
      * Treat this property as read-only.
      */
    var currentAnim: Double = js.native
    
    /**
      * The current frame index.
      * 
      * Treat this property as read-only.
      */
    var currentFrame: Double = js.native
    
    /**
      * A function to call when a particle dies.
      */
    var deathCallback: ParticleDeathCallback | Null = js.native
    
    /**
      * The calling context for {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallback}.
      */
    var deathCallbackScope: Any | Null = js.native
    
    /**
      * An array containing Particle Death Zone objects. A particle is immediately killed as soon as its x/y coordinates
      * intersect with any of the configured Death Zones.
      * 
      * Prior to Phaser v3.60 an Emitter could only have one single Death Zone.
      * In 3.60 they can now have an array of Death Zones.
      */
    var deathZones: js.Array[DeathZone] = js.native
    
    /**
      * The number of milliseconds to wait after emission before
      * the particles start updating. This allows you to emit particles
      * that appear 'static' or still on-screen and then, after this value,
      * begin to move.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var delay: EmitterOpOnEmitType = js.native
    
    /**
      * Sorts active particles with {@link Phaser.GameObjects.Particles.ParticleEmitter#depthSortCallback}.
      */
    def depthSort(): this.type = js.native
    
    /**
      * Calculates the difference of two particles, for sorting them by depth.
      * @param a The first particle.
      * @param b The second particle.
      */
    def depthSortCallback(a: js.Object, b: js.Object): Double = js.native
    
    /**
      * The number of milliseconds this emitter will emit particles for when in flow mode,
      * before it stops emission. A value of 0 (the default) means there is no duration.
      * 
      * When the duration expires the `STOP` event is emitted. Note that entering a
      * stopped state doesn't mean all the particles have finished, just that it's
      * not emitting any further ones.
      * 
      * To know when the final particle expires, listen for the COMPLETE event.
      * 
      * The counter is reset each time the `ParticleEmitter.start` method is called.
      * 
      * 0 means the emitter will not stop based on duration.
      */
    var duration: Double = js.native
    
    /**
      * The internal elasped counter.
      * 
      * Treat this property as read-only.
      */
    var elapsed: Double = js.native
    
    /**
      * A function to call when a particle is emitted.
      */
    var emitCallback: ParticleEmitterCallback | Null = js.native
    
    /**
      * The calling context for {@link Phaser.GameObjects.Particles.ParticleEmitter#emitCallback}.
      */
    var emitCallbackScope: Any | Null = js.native
    
    /**
      * Emits particles at a given position (or the emitters current position).
      * @param count The number of Particles to emit. Default this.quantity.
      * @param x The x coordinate to emit the Particles from. Default this.x.
      * @param y The y coordinate to emit the Particles from. Default this.x.
      */
    def emitParticle(): Particle = js.native
    def emitParticle(count: Double): Particle = js.native
    def emitParticle(count: Double, x: Double): Particle = js.native
    def emitParticle(count: Double, x: Double, y: Double): Particle = js.native
    def emitParticle(count: Double, x: Unit, y: Double): Particle = js.native
    def emitParticle(count: Unit, x: Double): Particle = js.native
    def emitParticle(count: Unit, x: Double, y: Double): Particle = js.native
    def emitParticle(count: Unit, x: Unit, y: Double): Particle = js.native
    
    /**
      * Emits particles at the given position. If no position is given, it will
      * emit from this Emitters current location.
      * @param x The x coordinate to emit the Particles from. Default this.x.
      * @param y The y coordinate to emit the Particles from. Default this.x.
      * @param count The number of Particles to emit. Default this.quantity.
      */
    def emitParticleAt(): Particle = js.native
    def emitParticleAt(x: Double): Particle = js.native
    def emitParticleAt(x: Double, y: Double): Particle = js.native
    def emitParticleAt(x: Double, y: Double, count: Double): Particle = js.native
    def emitParticleAt(x: Double, y: Unit, count: Double): Particle = js.native
    def emitParticleAt(x: Unit, y: Double): Particle = js.native
    def emitParticleAt(x: Unit, y: Double, count: Double): Particle = js.native
    def emitParticleAt(x: Unit, y: Unit, count: Double): Particle = js.native
    
    /**
      * An array containing Particle Emission Zones. These can be either EdgeZones or RandomZones.
      * 
      * Particles are emitted from a randomly selected zone from this array.
      * 
      * Prior to Phaser v3.60 an Emitter could only have one single Emission Zone.
      * In 3.60 they can now have an array of Emission Zones.
      */
    var emitZones: js.Array[EdgeZone | RandomZone] = js.native
    
    /**
      * Controls if the emitter is currently emitting a particle flow (when frequency >= 0).
      * 
      * Already alive particles will continue to update until they expire.
      * 
      * Controlled by {@link Phaser.GameObjects.Particles.ParticleEmitter#start} and {@link Phaser.GameObjects.Particles.ParticleEmitter#stop}.
      */
    var emitting: Boolean = js.native
    
    /**
      * Puts the emitter in explode mode (frequency = -1), stopping any current particle flow, and emits several particles all at once.
      * @param count The number of Particles to emit. Default this.quantity.
      * @param x The x coordinate to emit the Particles from. Default this.x.
      * @param y The y coordinate to emit the Particles from. Default this.x.
      */
    def explode(): Particle = js.native
    def explode(count: Double): Particle = js.native
    def explode(count: Double, x: Double): Particle = js.native
    def explode(count: Double, x: Double, y: Double): Particle = js.native
    def explode(count: Double, x: Unit, y: Double): Particle = js.native
    def explode(count: Unit, x: Double): Particle = js.native
    def explode(count: Unit, x: Double, y: Double): Particle = js.native
    def explode(count: Unit, x: Unit, y: Double): Particle = js.native
    
    /**
      * Fast forwards this Particle Emitter and all of its particles.
      * 
      * Works by running the Emitter `preUpdate` handler in a loop until the `time`
      * has been reached at `delta` steps per loop.
      * 
      * All callbacks and emitter related events that would normally be fired
      * will still be invoked.
      * 
      * You can make an emitter 'fast forward' via the emitter config using the
      * `advance` property. Set this value to the number of ms you wish the
      * emitter to be fast-forwarded by. Or, call this method post-creation.
      * @param time The number of ms to advance the Particle Emitter by.
      * @param delta The amount of delta to use for each step. Defaults to 1000 / 60.
      */
    def fastForward(time: Double): this.type = js.native
    def fastForward(time: Double, delta: Double): this.type = js.native
    
    /**
      * Puts the emitter in flow mode (frequency >= 0) and starts (or restarts) a particle flow.
      * 
      * To resume a flow at the current frequency and quantity, use {@link Phaser.GameObjects.Particles.ParticleEmitter#start} instead.
      * @param frequency The time interval (>= 0) of each flow cycle, in ms.
      * @param count The number of particles to emit at each flow cycle. Default 1.
      * @param stopAfter Stop this emitter from firing any more particles once this value is reached. Set to zero for unlimited. Setting this parameter will override any `stopAfter` value already set in the Emitter configuration object.
      */
    def flow(frequency: Double): this.type = js.native
    def flow(frequency: Double, count: Unit, stopAfter: Double): this.type = js.native
    def flow(frequency: Double, count: EmitterOpOnEmitType): this.type = js.native
    def flow(frequency: Double, count: EmitterOpOnEmitType, stopAfter: Double): this.type = js.native
    
    /**
      * The internal flow counter.
      * 
      * Treat this property as read-only.
      */
    var flowCounter: Double = js.native
    
    /**
      * A Game Object whose position is used as the particle origin.
      */
    var follow: GameObject | Null = js.native
    
    /**
      * The offset of the particle origin from the {@link Phaser.GameObjects.Particles.ParticleEmitter#follow} target.
      */
    var followOffset: Vector2 = js.native
    
    /**
      * Calls a function for each active particle in this emitter. The function is
      * sent two parameters: a reference to the Particle instance and to this Emitter.
      * @param callback The function.
      * @param context The functions calling context.
      */
    def forEachAlive(callback: ParticleEmitterCallback, context: Any): this.type = js.native
    
    /**
      * Calls a function for each inactive particle in this emitter.
      * @param callback The function.
      * @param context The functions calling context.
      */
    def forEachDead(callback: ParticleEmitterCallback, context: Any): this.type = js.native
    
    /**
      * The internal frame counter.
      * 
      * Treat this property as read-only.
      */
    var frameCounter: Double = js.native
    
    /**
      * The number of consecutive particles that receive a single texture frame (per frame cycle).
      */
    var frameQuantity: Double = js.native
    
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
      * Gets the number of active (in-use) particles in this emitter.
      */
    def getAliveParticleCount(): Double = js.native
    
    /**
      * Chooses an animation from {@link Phaser.GameObjects.Particles.ParticleEmitter#anims}, if populated.
      */
    def getAnim(): String = js.native
    
    /**
      * Returns a bounds Rectangle calculated from the bounds of all currently
      * _active_ Particles in this Emitter. If this Emitter has only just been
      * created and not yet rendered, then calling this method will return a Rectangle
      * with a max safe integer for dimensions. Use the `advance` parameter to
      * avoid this.
      * 
      * Typically it takes a few seconds for a flow Emitter to 'warm up'. You can
      * use the `advance` and `delta` parameters to force the Emitter to
      * 'fast forward' in time to try and allow the bounds to be more accurate,
      * as it will calculate the bounds based on the particle bounds across all
      * timesteps, giving a better result.
      * 
      * You can also use the `padding` parameter to increase the size of the
      * bounds. Emitters with a lot of randomness in terms of direction or lifespan
      * can often return a bounds smaller than their possible maximum. By using
      * the `padding` (and `advance` if needed) you can help limit this.
      * @param padding The amount of padding, in pixels, to add to the bounds Rectangle.
      * @param advance The number of ms to advance the Particle Emitter by. Defaults to 0, i.e. not used.
      * @param delta The amount of delta to use for each step. Defaults to 1000 / 60.
      * @param output The Rectangle to store the results in. If not given a new one will be created.
      */
    def getBounds(): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(padding: Double): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(padding: Double, advance: Double): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(padding: Double, advance: Double, delta: Double): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(padding: Double, advance: Double, delta: Double, output: typings.phaser.Phaser.Geom.Rectangle): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(padding: Double, advance: Double, delta: Unit, output: typings.phaser.Phaser.Geom.Rectangle): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(padding: Double, advance: Unit, delta: Double): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(padding: Double, advance: Unit, delta: Double, output: typings.phaser.Phaser.Geom.Rectangle): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(padding: Double, advance: Unit, delta: Unit, output: typings.phaser.Phaser.Geom.Rectangle): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(padding: Unit, advance: Double): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(padding: Unit, advance: Double, delta: Double): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(padding: Unit, advance: Double, delta: Double, output: typings.phaser.Phaser.Geom.Rectangle): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(padding: Unit, advance: Double, delta: Unit, output: typings.phaser.Phaser.Geom.Rectangle): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(padding: Unit, advance: Unit, delta: Double): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(padding: Unit, advance: Unit, delta: Double, output: typings.phaser.Phaser.Geom.Rectangle): typings.phaser.Phaser.Geom.Rectangle = js.native
    def getBounds(padding: Unit, advance: Unit, delta: Unit, output: typings.phaser.Phaser.Geom.Rectangle): typings.phaser.Phaser.Geom.Rectangle = js.native
    
    /**
      * Gets the number of inactive (available) particles in this emitter.
      */
    def getDeadParticleCount(): Double = js.native
    
    /**
      * Takes the given particle and checks to see if any of the configured Death Zones
      * will kill it and returns the result. This method is called automatically as part
      * of the `Particle.update` process.
      * @param particle The particle to test against the Death Zones.
      */
    def getDeathZone(particle: Particle): Boolean = js.native
    
    /**
      * Takes the given particle and sets its x/y coordinates to match the next available
      * emission zone, if any have been configured. This method is called automatically
      * as part of the `Particle.fire` process.
      * 
      * The Emit Zones are iterated in sequence. Once a zone has had a particle emitted
      * from it, then the next zone is used and so on, in a loop.
      * @param particle The particle to set the emission zone for.
      */
    def getEmitZone(particle: Particle): Unit = js.native
    
    /**
      * Chooses a texture frame from {@link Phaser.GameObjects.Particles.ParticleEmitter#frames}.
      */
    def getFrame(): Frame = js.native
    
    /**
      * Gets the total number of particles in this emitter.
      */
    def getParticleCount(): Double = js.native
    
    /**
      * Gets all active Particle Processors.
      */
    def getProcessors(): js.Array[ParticleProcessor] = js.native
    
    /**
      * Horizontal acceleration applied to emitted particles, in pixels per second squared.
      */
    var gravityX: Double = js.native
    
    /**
      * Vertical acceleration applied to emitted particles, in pixels per second squared.
      */
    var gravityY: Double = js.native
    
    /**
      * The number of milliseconds to wait after a particle has finished
      * its life before it will be removed. This allows you to 'hold' a
      * particle on the screen once it has reached its final state
      * before it then vanishes.
      * 
      * Note that all particle updates will cease, including changing
      * alpha, scale, movement or animation.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var hold: EmitterOpOnEmitType = js.native
    
    /**
      * Deactivates every particle in this emitter immediately.
      * 
      * This particles are killed but do not emit an event or callback.
      */
    def killAll(): this.type = js.native
    
    /**
      * The lifespan of the emitted particles. This value is given
      * in milliseconds and defaults to 1000ms (1 second). When a
      * particle reaches this amount it is killed.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var lifespan: EmitterOpOnEmitType = js.native
    
    /**
      * The maximum number of alive and rendering particles this emitter will update.
      * When this limit is reached, a particle needs to die before another can be emitted.
      * 
      * 0 means no limits.
      */
    var maxAliveParticles: Double = js.native
    
    /**
      * Set to hard limit the amount of particle objects this emitter is allowed to create
      * in total. This is the number of `Particle` instances it can create, not the number
      * of 'alive' particles.
      * 
      * 0 means unlimited.
      */
    var maxParticles: Double = js.native
    
    /**
      * The maximum horizontal velocity emitted particles can reach, in pixels per second squared.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var maxVelocityX: EmitterOpOnEmitType = js.native
    
    /**
      * The maximum vertical velocity emitted particles can reach, in pixels per second squared.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var maxVelocityY: EmitterOpOnEmitType = js.native
    
    /**
      * Whether moveToX and moveToY are set. Set automatically during configuration.
      * 
      * When true the particles move toward the moveToX and moveToY coordinates and arrive at the end of their life.
      * Emitter angle, speedX, and speedY are ignored.
      */
    var moveTo: Boolean = js.native
    
    /**
      * The x coordinate emitted particles move toward, when {@link Phaser.GameObjects.Particles.ParticleEmitter#moveTo} is true.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var moveToX: EmitterOpOnEmitType = js.native
    
    /**
      * The y coordinate emitted particles move toward, when {@link Phaser.GameObjects.Particles.ParticleEmitter#moveTo} is true.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var moveToY: EmitterOpOnEmitType = js.native
    
    /**
      * Sets a function to call for each particle death.
      * @param callback The function.
      * @param context The function's calling context.
      */
    def onParticleDeath(callback: ParticleDeathCallback): this.type = js.native
    def onParticleDeath(callback: ParticleDeathCallback, context: Any): this.type = js.native
    
    /**
      * Sets a function to call for each newly emitted particle.
      * @param callback The function.
      * @param context The calling context.
      */
    def onParticleEmit(callback: ParticleEmitterCallback): this.type = js.native
    def onParticleEmit(callback: ParticleEmitterCallback, context: Any): this.type = js.native
    
    /**
      * An internal object holding all of the EmitterOp instances.
      * 
      * These are populated as part of the Emitter configuration parsing.
      * 
      * You typically do not access them directly, but instead use the
      * provided getters and setters on this class, such as `ParticleEmitter.speedX` etc.
      */
    var ops: ParticleEmitterOps = js.native
    
    /**
      * Takes either a Rectangle Geometry object or an Arcade Physics Body and tests
      * to see if it intersects with any currently alive Particle in this Emitter.
      * 
      * Overlapping particles are returned in an array, where you can perform further
      * processing on them. If nothing overlaps then the array will be empty.
      * @param target A Rectangle or Arcade Physics Body to check for intersection against all alive particles.
      */
    def overlap(target: typings.phaser.Phaser.Geom.Rectangle): js.Array[Particle] = js.native
    def overlap(target: Body): js.Array[Particle] = js.native
    
    /**
      * The alpha value of the emitted particles. This is a value
      * between 0 and 1. Particles with alpha zero are invisible
      * and are therefore not rendered, but are still processed
      * by the Emitter.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var particleAlpha: EmitterOpOnEmitType = js.native
    
    /**
      * The angle at which the particles are emitted. The values are
      * given in degrees. This allows you to control the direction
      * of the emitter. If you wish instead to change the rotation
      * of the particles themselves, see the `particleRotate` property.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var particleAngle: EmitterOpOnEmitType = js.native
    
    /**
      * Newly emitted particles are added to the top of the particle list, i.e. rendered above those already alive.
      * 
      * Set to false to send them to the back.
      * 
      * Also see the `sortOrder` property for more complex particle sorting.
      */
    var particleBringToTop: Boolean = js.native
    
    /**
      * The Particle Class which will be emitted by this Emitter.
      */
    var particleClass: js.Function = js.native
    
    /**
      * A color tint value that is applied to the texture of the emitted
      * particle. The value should be given in hex format, i.e. 0xff0000
      * for a red tint, and should not include the alpha channel.
      * 
      * Tints are additive, meaning a tint value of white (0xffffff) will
      * effectively reset the tint to nothing.
      * 
      * Modify the `ParticleEmitter.tintFill` property to change between
      * an additive and replacement tint mode.
      * 
      * When you define the color via the Emitter config you should give
      * it as an array of color values. The Particle will then interpolate
      * through these colors over the course of its lifespan. Setting this
      * will override any `tint` value that may also be given.
      * 
      * This is a WebGL only feature.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var particleColor: EmitterOpOnEmitType = js.native
    
    /**
      * The rotation (or angle) of each particle when it is emitted.
      * The value is given in degrees and uses a right-handed
      * coordinate system, where 0 degrees points to the right, 90 degrees
      * points down and -90 degrees points up.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var particleRotate: EmitterOpOnEmitType = js.native
    
    /**
      * The horizontal scale of emitted particles.
      * 
      * This is relative to the Emitters scale and that of any parent.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var particleScaleX: EmitterOpOnEmitType = js.native
    
    /**
      * The vertical scale of emitted particles.
      * 
      * This is relative to the Emitters scale and that of any parent.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var particleScaleY: EmitterOpOnEmitType = js.native
    
    /**
      * A color tint value that is applied to the texture of the emitted
      * particle. The value should be given in hex format, i.e. 0xff0000
      * for a red tint, and should not include the alpha channel.
      * 
      * Tints are additive, meaning a tint value of white (0xffffff) will
      * effectively reset the tint to nothing.
      * 
      * Modify the `ParticleEmitter.tintFill` property to change between
      * an additive and replacement tint mode.
      * 
      * The `tint` value will be overriden if a `color` array is provided.
      * 
      * This is a WebGL only feature.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var particleTint: EmitterOpOnEmitType = js.native
    
    /**
      * The x coordinate the particles are emitted from.
      * 
      * This is relative to the Emitters x coordinate and that of any parent.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var particleX: EmitterOpOnEmitType = js.native
    
    /**
      * The y coordinate the particles are emitted from.
      * 
      * This is relative to the Emitters x coordinate and that of any parent.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var particleY: EmitterOpOnEmitType = js.native
    
    /**
      * {@link Phaser.GameObjects.Particles.ParticleEmitter#active Deactivates} the emitter.
      */
    def pause(): this.type = js.native
    
    /**
      * Destroys this Particle Emitter and all Particles it owns.
      */
    def preDestroy(): Unit = js.native
    
    /**
      * Updates this emitter and its particles.
      * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
      * @param delta The delta time, in ms, elapsed since the last frame.
      */
    def preUpdate(time: Double, delta: Double): Unit = js.native
    
    /**
      * A list of Particle Processors being managed by this Emitter.
      */
    var processors: typings.phaser.Phaser.Structs.List[ParticleProcessor] = js.native
    
    /**
      * The number of particles that are emitted each time an emission
      * occurs, i.e. from one 'explosion' or each frame in a 'flow' cycle.
      * 
      * The default is 1.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var quantity: EmitterOpOnEmitType = js.native
    
    /**
      * A radial emitter will emit particles in all directions between angle min and max,
      * using {@link Phaser.GameObjects.Particles.ParticleEmitter#speed} as the value. If set to false then this acts as a point Emitter.
      * A point emitter will emit particles only in the direction derived from the speedX and speedY values.
      */
    var radial: Boolean = js.native
    
    /**
      * Whether animations {@link Phaser.GameObjects.Particles.ParticleEmitter#anims} are selected at random.
      */
    var randomAnim: Boolean = js.native
    
    /**
      * Whether texture {@link Phaser.GameObjects.Particles.ParticleEmitter#frames} are selected at random.
      */
    var randomFrame: Boolean = js.native
    
    /**
      * Removes the given Particle Death Zone from this Emitter.
      * @param zone The Death Zone that should be removed from this Emitter.
      */
    def removeDeathZone(zone: DeathZone): this.type = js.native
    
    /**
      * Removes the given Particle Emission Zone from this Emitter.
      * @param zone The Emission Zone that should be removed from this Emitter.
      */
    def removeEmitZone(zone: EdgeZone): this.type = js.native
    def removeEmitZone(zone: RandomZone): this.type = js.native
    
    /**
      * Removes a Particle Processor from this Emitter.
      * 
      * The Processor must belong to this Emitter to be removed.
      * 
      * It is not destroyed when removed, allowing you to move it to another Emitter Manager,
      * so if you no longer require it you should call its `destroy` method directly.
      * @param processor The Particle Processor to remove from this Emitter Manager.
      */
    def removeParticleProcessor[T /* <: ParticleProcessor */](processor: T): T | Null = js.native
    
    /**
      * Creates inactive particles and adds them to this emitter's pool.
      * 
      * If `ParticleEmitter.maxParticles` is set it will limit the
      * value passed to this method to make sure it's not exceeded.
      * @param count The number of particles to create.
      */
    def reserve(count: Double): this.type = js.native
    
    /**
      * Resets the internal counter trackers.
      * 
      * You shouldn't ever need to call this directly.
      * @param frequency The frequency counter.
      * @param on Set the complete flag.
      */
    def resetCounters(frequency: Double, on: Boolean): Unit = js.native
    
    /**
      * {@link Phaser.GameObjects.Particles.ParticleEmitter#active Activates} the emitter.
      */
    def resume(): this.type = js.native
    
    def setAnim(anims: String): this.type = js.native
    def setAnim(anims: String, pickRandom: Boolean): this.type = js.native
    def setAnim(anims: String, pickRandom: Boolean, quantity: Double): this.type = js.native
    def setAnim(anims: String, pickRandom: Unit, quantity: Double): this.type = js.native
    /**
      * Sets a pattern for assigning animations to emitted particles. The `anims` configuration can be any of:
      * 
      * anim: 'red'
      * anim: [ 'red', 'green', 'blue', 'pink', 'white' ]
      * anim: { anims: [ 'red', 'green', 'blue', 'pink', 'white' ], [cycle: bool], [quantity: int] }
      * @param anims One or more animations, or a configuration object.
      * @param pickRandom Whether animations should be assigned at random from `anims`. Default true.
      * @param quantity The number of consecutive particles that will receive each animation. Default 1.
      */
    def setAnim(anims: js.Array[Any]): this.type = js.native
    def setAnim(anims: js.Array[Any], pickRandom: Boolean): this.type = js.native
    def setAnim(anims: js.Array[Any], pickRandom: Boolean, quantity: Double): this.type = js.native
    def setAnim(anims: js.Array[Any], pickRandom: Unit, quantity: Double): this.type = js.native
    def setAnim(anims: ParticleEmitterFrameConfig): this.type = js.native
    def setAnim(anims: ParticleEmitterFrameConfig, pickRandom: Boolean): this.type = js.native
    def setAnim(anims: ParticleEmitterFrameConfig, pickRandom: Boolean, quantity: Double): this.type = js.native
    def setAnim(anims: ParticleEmitterFrameConfig, pickRandom: Unit, quantity: Double): this.type = js.native
    
    /**
      * Takes an Emitter Configuration file and resets this Emitter, using any
      * properties defined in the config to then set it up again.
      * @param config Settings for this emitter.
      */
    def setConfig(config: ParticleEmitterConfig): this.type = js.native
    
    /**
      * Changes the currently active Emission Zone. The zones should have already
      * been added to this Emitter either via the emitter config, or the
      * `addEmitZone` method.
      * 
      * Call this method by passing either a numeric zone index value, or
      * the zone instance itself.
      * 
      * Prior to v3.60 an Emitter could only have a single Emit Zone and this
      * method was how you set it. From 3.60 and up it now performs a different
      * function and swaps between all available active zones.
      * @param zone The Emit Zone to set as the active zone.
      */
    def setEmitZone(zone: Double): this.type = js.native
    def setEmitZone(zone: EdgeZone): this.type = js.native
    def setEmitZone(zone: RandomZone): this.type = js.native
    
    /**
      * Sets the angle of a {@link Phaser.GameObjects.Particles.ParticleEmitter#radial} particle stream.
      * 
      * The value is given in degrees using Phaser's right-handed coordinate system.
      * @param value The angle of the initial velocity of emitted particles, in degrees.
      */
    def setEmitterAngle(value: EmitterOpOnEmitType): this.type = js.native
    
    def setEmitterFrame(frames: String): this.type = js.native
    def setEmitterFrame(frames: String, pickRandom: Boolean): this.type = js.native
    def setEmitterFrame(frames: String, pickRandom: Boolean, quantity: Double): this.type = js.native
    def setEmitterFrame(frames: String, pickRandom: Unit, quantity: Double): this.type = js.native
    /**
      * Sets a pattern for assigning texture frames to emitted particles. The `frames` configuration can be any of:
      * 
      * frame: 0
      * frame: 'red'
      * frame: [ 0, 1, 2, 3 ]
      * frame: [ 'red', 'green', 'blue', 'pink', 'white' ]
      * frame: { frames: [ 'red', 'green', 'blue', 'pink', 'white' ], [cycle: bool], [quantity: int] }
      * @param frames One or more texture frames, or a configuration object.
      * @param pickRandom Whether frames should be assigned at random from `frames`. Default true.
      * @param quantity The number of consecutive particles that will receive each frame. Default 1.
      */
    def setEmitterFrame(frames: js.Array[Any]): this.type = js.native
    def setEmitterFrame(frames: js.Array[Any], pickRandom: Boolean): this.type = js.native
    def setEmitterFrame(frames: js.Array[Any], pickRandom: Boolean, quantity: Double): this.type = js.native
    def setEmitterFrame(frames: js.Array[Any], pickRandom: Unit, quantity: Double): this.type = js.native
    def setEmitterFrame(frames: Double): this.type = js.native
    def setEmitterFrame(frames: Double, pickRandom: Boolean): this.type = js.native
    def setEmitterFrame(frames: Double, pickRandom: Boolean, quantity: Double): this.type = js.native
    def setEmitterFrame(frames: Double, pickRandom: Unit, quantity: Double): this.type = js.native
    def setEmitterFrame(frames: ParticleEmitterFrameConfig): this.type = js.native
    def setEmitterFrame(frames: ParticleEmitterFrameConfig, pickRandom: Boolean): this.type = js.native
    def setEmitterFrame(frames: ParticleEmitterFrameConfig, pickRandom: Boolean, quantity: Double): this.type = js.native
    def setEmitterFrame(frames: ParticleEmitterFrameConfig, pickRandom: Unit, quantity: Double): this.type = js.native
    
    /**
      * Sets the emitter's {@link Phaser.GameObjects.Particles.ParticleEmitter#frequency}
      * and {@link Phaser.GameObjects.Particles.ParticleEmitter#quantity}.
      * @param frequency The time interval (>= 0) of each flow cycle, in ms; or -1 to put the emitter in explosion mode.
      * @param quantity The number of particles to release at each flow cycle or explosion.
      */
    def setFrequency(frequency: Double): this.type = js.native
    def setFrequency(frequency: Double, quantity: EmitterOpOnEmitType): this.type = js.native
    
    /**
      * Sets the opacity (alpha) of emitted particles.
      * 
      * You can also set the alpha of the entire emitter via `setAlpha`.
      * @param value A value between 0 (transparent) and 1 (opaque).
      */
    def setParticleAlpha(value: EmitterOpOnEmitType): this.type = js.native
    def setParticleAlpha(value: EmitterOpOnUpdateType): this.type = js.native
    
    /**
      * Sets the gravity applied to emitted particles.
      * @param x Horizontal acceleration due to gravity, in pixels per second squared. Set to zero for no gravity.
      * @param y Vertical acceleration due to gravity, in pixels per second squared. Set to zero for no gravity.
      */
    def setParticleGravity(x: Double, y: Double): this.type = js.native
    
    /**
      * Sets the lifespan of newly emitted particles in milliseconds.
      * @param value The lifespan of a particle, in ms.
      */
    def setParticleLifespan(value: EmitterOpOnEmitType): this.type = js.native
    
    /**
      * Sets the vertical and horizontal scale of the emitted particles.
      * 
      * You can also set the scale of the entire emitter via `setScale`.
      * @param x The horizontal scale of the emitted Particles. Default 1.
      * @param y The vertical scale of emitted Particles. If not set it will use the `x` value. Default x.
      */
    def setParticleScale(): this.type = js.native
    def setParticleScale(x: Double): this.type = js.native
    def setParticleScale(x: Double, y: Double): this.type = js.native
    def setParticleScale(x: Unit, y: Double): this.type = js.native
    
    /**
      * Sets the initial radial speed of emitted particles.
      * 
      * Changes the emitter to radial mode.
      * @param x The horizontal speed of the emitted Particles.
      * @param y The vertical speed of emitted Particles. If not set it will use the `x` value. Default x.
      */
    def setParticleSpeed(x: Double): this.type = js.native
    def setParticleSpeed(x: Double, y: Double): this.type = js.native
    
    /**
      * Sets the color tint of emitted particles.
      * 
      * This is a WebGL only feature.
      * @param value A value between 0 and 0xffffff.
      */
    def setParticleTint(value: EmitterOpOnEmitType): this.type = js.native
    def setParticleTint(value: EmitterOpOnUpdateType): this.type = js.native
    
    /**
      * Sets the number of particles released at each flow cycle or explosion.
      * @param quantity The number of particles to release at each flow cycle or explosion.
      */
    def setQuantity(quantity: EmitterOpOnEmitType): this.type = js.native
    
    /**
      * Turns {@link Phaser.GameObjects.Particles.ParticleEmitter#radial} particle movement on or off.
      * @param value Radial mode (true) or point mode (true). Default true.
      */
    def setRadial(): this.type = js.native
    def setRadial(value: Boolean): this.type = js.native
    
    /**
      * Sets a callback to be used to sort the particles before rendering each frame.
      * 
      * This allows you to define your own logic and behavior in the callback.
      * 
      * The callback will be sent two parameters: the two Particles being compared,
      * and must adhere to the criteria of the `compareFn` in `Array.sort`:
      * 
      * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/sort#description
      * 
      * Call this method with no parameters to reset the sort callback.
      * 
      * Setting your own callback will override both the `particleBringToTop` and
      * `sortProperty` settings of this Emitter.
      * @param callback The callback to invoke when the particles are sorted. Leave undefined to reset to the default.
      */
    def setSortCallback(): this.type = js.native
    def setSortCallback(callback: ParticleSortCallback): this.type = js.native
    
    /**
      * Set the property by which active particles are sorted prior to be rendered.
      * 
      * It allows you to control the rendering order of the particles.
      * 
      * This can be any valid property of the `Particle` class, such as `y`, `alpha`
      * or `lifeT`.
      * 
      * The 'alive' particles array is sorted in place each game frame. Setting a
      * sort property will override the `particleBringToTop` setting.
      * 
      * If you wish to use your own sorting function, see `setSortCallback` instead.
      * @param property The property on the `Particle` class to sort by.
      * @param ascending Should the particles be sorted in ascending or descending order? Default true.
      */
    def setSortProperty(): this.type = js.native
    def setSortProperty(property: String): this.type = js.native
    def setSortProperty(property: String, ascending: Boolean): this.type = js.native
    def setSortProperty(property: Unit, ascending: Boolean): this.type = js.native
    
    /**
      * An internal property used to tell when the emitter is in fast-forwarc mode.
      */
    var skipping: Boolean = js.native
    
    /**
      * The callback used to sort the particles. Only used if `sortProperty`
      * has been set. Set this via the `setSortCallback` method.
      */
    var sortCallback: ParticleSortCallback | Null = js.native
    
    /**
      * When `sortProperty` is defined this controls the sorting order,
      * either ascending or descending. Toggle to control the visual effect.
      */
    var sortOrderAsc: Boolean = js.native
    
    /**
      * Optionally sort the particles before they render based on this
      * property. The property must exist on the `Particle` class, such
      * as `y`, `lifeT`, `scaleX`, etc.
      * 
      * When set this overrides the `particleBringToTop` setting.
      * 
      * To reset this and disable sorting, so this property to an empty string.
      */
    var sortProperty: String = js.native
    
    /**
      * The initial speed of emitted particles, in pixels per second.
      * 
      * If using this as a getter it will return the `speedX` value.
      * 
      * If using it as a setter it will update both `speedX` and `speedY` to the
      * given value.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var speed: EmitterOpOnEmitType = js.native
    
    /**
      * The initial horizontal speed of emitted particles, in pixels per second.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var speedX: EmitterOpOnEmitType = js.native
    
    /**
      * The initial vertical speed of emitted particles, in pixels per second.
      * 
      * Accessing this property should typically return a number.
      * However, it can be set to any valid EmitterOp onEmit type.
      */
    var speedY: EmitterOpOnEmitType = js.native
    
    /**
      * Turns {@link Phaser.GameObjects.Particles.ParticleEmitter#on} the emitter and resets the flow counter.
      * 
      * If this emitter is in flow mode (frequency >= 0; the default), the particle flow will start (or restart).
      * 
      * If this emitter is in explode mode (frequency = -1), nothing will happen.
      * Use {@link Phaser.GameObjects.Particles.ParticleEmitter#explode} or {@link Phaser.GameObjects.Particles.ParticleEmitter#flow} instead.
      * 
      * Calling this method will emit the `START` event.
      * @param advance Advance this number of ms in time through the emitter. Default 0.
      * @param duration Limit this emitter to only emit particles for the given number of ms. Setting this parameter will override any duration already set in the Emitter configuration object. Default 0.
      */
    def start(): this.type = js.native
    def start(advance: Double): this.type = js.native
    def start(advance: Double, duration: Double): this.type = js.native
    def start(advance: Unit, duration: Double): this.type = js.native
    
    /**
      * Continuously moves the particle origin to follow a Game Object's position.
      * @param target The Game Object to follow.
      * @param offsetX Horizontal offset of the particle origin from the Game Object. Default 0.
      * @param offsetY Vertical offset of the particle origin from the Game Object. Default 0.
      * @param trackVisible Whether the emitter's visible state will track the target's visible state. Default false.
      */
    def startFollow(target: GameObject): this.type = js.native
    def startFollow(target: GameObject, offsetX: Double): this.type = js.native
    def startFollow(target: GameObject, offsetX: Double, offsetY: Double): this.type = js.native
    def startFollow(target: GameObject, offsetX: Double, offsetY: Double, trackVisible: Boolean): this.type = js.native
    def startFollow(target: GameObject, offsetX: Double, offsetY: Unit, trackVisible: Boolean): this.type = js.native
    def startFollow(target: GameObject, offsetX: Unit, offsetY: Double): this.type = js.native
    def startFollow(target: GameObject, offsetX: Unit, offsetY: Double, trackVisible: Boolean): this.type = js.native
    def startFollow(target: GameObject, offsetX: Unit, offsetY: Unit, trackVisible: Boolean): this.type = js.native
    
    /**
      * Turns {@link Phaser.GameObjects.Particles.ParticleEmitter#emitting off} the emitter and
      * stops it from emitting further particles. Currently alive particles will remain
      * active until they naturally expire unless you set the `kill` parameter to `true`.
      * 
      * Calling this method will emit the `STOP` event. When the final particle has
      * expired the `COMPLETE` event will be emitted.
      * @param kill Kill all particles immediately (true), or leave them to die after their lifespan expires? (false, the default) Default false.
      */
    def stop(): this.type = js.native
    def stop(kill: Boolean): this.type = js.native
    
    /**
      * If set, either via the Emitter config, or by directly setting this property,
      * the Particle Emitter will stop emitting particles once this total has been
      * reached. It will then enter a 'stopped' state, firing the `STOP`
      * event. Note that entering a stopped state doesn't mean all the particles
      * have finished, just that it's not emitting any further ones.
      * 
      * To know when the final particle expires, listen for the COMPLETE event.
      * 
      * Use this if you wish to launch an exact number of particles and then stop
      * your emitter afterwards.
      * 
      * The counter is reset each time the `ParticleEmitter.start` method is called.
      * 
      * 0 means the emitter will not stop based on total emitted particles.
      */
    var stopAfter: Double = js.native
    
    /**
      * The internal stop counter.
      * 
      * Treat this property as read-only.
      */
    var stopCounter: Double = js.native
    
    /**
      * Stops following a Game Object.
      */
    def stopFollow(): this.type = js.native
    
    /**
      * The time rate applied to active particles, affecting lifespan, movement, and tweens. Values larger than 1 are faster than normal.
      */
    var timeScale: Double = js.native
    
    /**
      * The tint fill mode used by the Particles in this Emitter.
      * 
      * `false` = An additive tint (the default), where vertices colors are blended with the texture.
      * `true` = A fill tint, where the vertices colors replace the texture, but respects texture alpha.
      */
    var tintFill: Boolean = js.native
    
    /**
      * Whether the emitter's {@link Phaser.GameObjects.Particles.ParticleEmitter#visible} state will track
      * the {@link Phaser.GameObjects.Particles.ParticleEmitter#follow} target's visibility state.
      */
    var trackVisible: Boolean = js.native
    
    /**
      * An optional Rectangle object that is used during rendering to cull Particles from
      * display. For example, if your particles are limited to only move within a 300x300
      * sized area from their origin, then you can set this Rectangle to those dimensions.
      * 
      * The renderer will check to see if the `viewBounds` Rectangle intersects with the
      * Camera bounds during the render step and if not it will skip rendering the Emitter
      * entirely.
      * 
      * This allows you to create many emitters in a Scene without the cost of
      * rendering if the contents aren't visible.
      * 
      * Note that the Emitter will not perform any checks to see if the Particles themselves
      * are outside of these bounds, or not. It will simply check the bounds against the
      * camera. Use the `getBounds` method with the `advance` parameter to help define
      * the location and placement of the view bounds.
      */
    var viewBounds: typings.phaser.Phaser.Geom.Rectangle | Null = js.native
    
    /**
      * An internal Transform Matrix used to cache this emitters world matrix.
      */
    var worldMatrix: TransformMatrix = js.native
    
    /**
      * The internal zone index.
      * 
      * Treat this property as read-only.
      */
    var zoneIndex: Double = js.native
    
    /**
      * The internal zone total.
      * 
      * Treat this property as read-only.
      */
    var zoneTotal: Double = js.native
  }
  
  /**
    * This class provides the structured required for all Particle Processors.
    * 
    * You should extend it and add the functionality required for your processor,
    * including tidying up any resources this may create in the `destroy` method.
    * 
    * See the GravityWell for an example of a processor.
    */
  trait ParticleProcessor extends StObject {
    
    /**
      * The active state of the Particle Processor.
      * 
      * An inactive Particle Processor will be skipped for processing by
      * its parent Emitter.
      */
    var active: Boolean
    
    /**
      * Destroys this Particle Processor by removing all external references.
      * 
      * This is called automatically when the owning Particle Emitter is destroyed.
      */
    def destroy(): Unit
    
    /**
      * A reference to the Particle Emitter that owns this Processor.
      * This is set automatically when the Processor is added to an Emitter
      * and nulled when removed or destroyed.
      */
    var manager: ParticleEmitter
    
    /**
      * The Particle Processor update method should be overriden by your own
      * method and handle the processing of the particles, typically modifying
      * their velocityX/Y values based on the criteria of this processor.
      * @param particle The Particle to update.
      * @param delta The delta time in ms.
      * @param step The delta value divided by 1000.
      * @param t The current normalized lifetime of the particle, between 0 (birth) and 1 (death).
      */
    def update(particle: Particle, delta: Double, step: Double, t: Double): Unit
    
    /**
      * The x coordinate of the Particle Processor, in world space.
      */
    var x: Double
    
    /**
      * The y coordinate of the Particle Processor, in world space.
      */
    var y: Double
  }
  object ParticleProcessor {
    
    inline def apply(
      active: Boolean,
      destroy: () => Unit,
      manager: ParticleEmitter,
      update: (Particle, Double, Double, Double) => Unit,
      x: Double,
      y: Double
    ): ParticleProcessor = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), manager = manager.asInstanceOf[js.Any], update = js.Any.fromFunction4(update), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticleProcessor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParticleProcessor] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setManager(value: ParticleEmitter): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: (Particle, Double, Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  object Zones {
    
    /**
      * A Death Zone.
      * 
      * A Death Zone is a special type of zone that will kill a Particle as soon as it either enters, or leaves, the zone.
      * 
      * The zone consists of a `source` which could be a Geometric shape, such as a Rectangle or Ellipse, or your own
      * object as long as it includes a `contains` method for which the Particles can be tested against.
      */
    trait DeathZone
      extends StObject
         with DeathZoneObject {
      
      /**
        * Set to `true` if the Particle should be killed if it enters this zone.
        * Set to `false` to kill the Particle if it leaves this zone.
        */
      var killOnEnter: Boolean
      
      /**
        * An object instance that has a `contains` method that returns a boolean when given `x` and `y` arguments.
        * This could be a Geometry shape, such as `Phaser.Geom.Circle`, or your own custom object.
        */
      var source: DeathZoneSource
      
      /**
        * Checks if the given Particle will be killed or not by this zone.
        * @param particle The particle to test against this Death Zones.
        */
      def willKill(particle: Particle): Boolean
    }
    object DeathZone {
      
      inline def apply(killOnEnter: Boolean, source: DeathZoneSource, willKill: Particle => Boolean): DeathZone = {
        val __obj = js.Dynamic.literal(killOnEnter = killOnEnter.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], willKill = js.Any.fromFunction1(willKill))
        __obj.asInstanceOf[DeathZone]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DeathZone] (val x: Self) extends AnyVal {
        
        inline def setKillOnEnter(value: Boolean): Self = StObject.set(x, "killOnEnter", value.asInstanceOf[js.Any])
        
        inline def setSource(value: DeathZoneSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setWillKill(value: Particle => Boolean): Self = StObject.set(x, "willKill", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * A zone that places particles on a shape's edges.
      */
    trait EdgeZone
      extends StObject
         with EmitZoneObject {
      
      /**
        * Change the source of the EdgeZone.
        * @param source An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
        */
      def changeSource(source: EdgeZoneSource): this.type
      
      /**
        * The counter used for iterating the EdgeZone's points.
        */
      var counter: Double
      
      /**
        * Get the next point in the Zone and set its coordinates on the given Particle.
        * @param particle The Particle.
        */
      def getPoint(particle: Particle): Unit
      
      /**
        * The points placed on the source edge.
        */
      var points: js.Array[Point]
      
      /**
        * The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
        */
      var quantity: Double
      
      /**
        * Whether one endpoint will be removed if it's identical to the other.
        */
      var seamless: Boolean
      
      /**
        * An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
        */
      var source: EdgeZoneSource | RandomZoneSource
      
      /**
        * The distance between each particle. When set, `quantity` is implied and should be set to 0.
        */
      var stepRate: Double
      
      /**
        * The total number of particles this zone will emit before the Emitter
        * transfers control over to the next zone in its emission zone list.
        * 
        * By default this is -1, meaning it will never pass over from this
        * zone to another one. You can call the `ParticleEmitter.setEmitZone`
        * method to change it, or set this value to something else via the
        * config, or directly at runtime.
        * 
        * A value of 1 would mean the zones rotate in order, but it can
        * be set to any integer value.
        */
      var total: Double
      
      /**
        * Update the {@link Phaser.GameObjects.Particles.Zones.EdgeZone#points} from the EdgeZone's
        * {@link Phaser.GameObjects.Particles.Zones.EdgeZone#source}.
        * 
        * Also updates internal properties.
        */
      def updateSource(): this.type
      
      /**
        * Whether particles are placed from start to end and then end to start.
        */
      var yoyo: Boolean
    }
    object EdgeZone {
      
      inline def apply(
        changeSource: EdgeZoneSource => EdgeZone,
        counter: Double,
        getPoint: Particle => Unit,
        points: js.Array[Point],
        quantity: Double,
        seamless: Boolean,
        source: EdgeZoneSource | RandomZoneSource,
        stepRate: Double,
        total: Double,
        updateSource: () => EdgeZone,
        yoyo: Boolean
      ): EdgeZone = {
        val __obj = js.Dynamic.literal(changeSource = js.Any.fromFunction1(changeSource), counter = counter.asInstanceOf[js.Any], getPoint = js.Any.fromFunction1(getPoint), points = points.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], seamless = seamless.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], stepRate = stepRate.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], updateSource = js.Any.fromFunction0(updateSource), yoyo = yoyo.asInstanceOf[js.Any])
        __obj.asInstanceOf[EdgeZone]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: EdgeZone] (val x: Self) extends AnyVal {
        
        inline def setChangeSource(value: EdgeZoneSource => EdgeZone): Self = StObject.set(x, "changeSource", js.Any.fromFunction1(value))
        
        inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
        
        inline def setGetPoint(value: Particle => Unit): Self = StObject.set(x, "getPoint", js.Any.fromFunction1(value))
        
        inline def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
        
        inline def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value*))
        
        inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
        
        inline def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
        
        inline def setSource(value: EdgeZoneSource | RandomZoneSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setStepRate(value: Double): Self = StObject.set(x, "stepRate", value.asInstanceOf[js.Any])
        
        inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
        
        inline def setUpdateSource(value: () => EdgeZone): Self = StObject.set(x, "updateSource", js.Any.fromFunction0(value))
        
        inline def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A zone that places particles randomly within a shapes area.
      */
    trait RandomZone
      extends StObject
         with EmitZoneObject {
      
      /**
        * Get the next point in the Zone and set its coordinates on the given Particle.
        * @param particle The Particle.
        */
      def getPoint(particle: Particle): Unit
      
      /**
        * An object instance with a `getRandomPoint(point)` method.
        */
      var source: RandomZoneSource
      
      /**
        * The total number of particles this zone will emit before the Emitter
        * transfers control over to the next zone in its emission zone list.
        * 
        * By default this is -1, meaning it will never pass over from this
        * zone to another one. You can call the `ParticleEmitter.setEmitZone`
        * method to change it, or set this value to something else via the
        * config, or directly at runtime.
        * 
        * A value of 1 would mean the zones rotate in order, but it can
        * be set to any integer value.
        */
      var total: Double
    }
    object RandomZone {
      
      inline def apply(getPoint: Particle => Unit, source: RandomZoneSource, total: Double): RandomZone = {
        val __obj = js.Dynamic.literal(getPoint = js.Any.fromFunction1(getPoint), source = source.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
        __obj.asInstanceOf[RandomZone]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RandomZone] (val x: Self) extends AnyVal {
        
        inline def setGetPoint(value: Particle => Unit): Self = StObject.set(x, "getPoint", js.Any.fromFunction1(value))
        
        inline def setSource(value: RandomZoneSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      }
    }
  }
}

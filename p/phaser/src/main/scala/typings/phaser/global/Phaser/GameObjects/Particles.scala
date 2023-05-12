package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Geom.Point
import typings.phaser.Phaser.Types.GameObjects.Particles.DeathZoneSource
import typings.phaser.Phaser.Types.GameObjects.Particles.EdgeZoneSource
import typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnEmitType
import typings.phaser.Phaser.Types.GameObjects.Particles.GravityWellConfig
import typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterConfig
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
  @JSGlobal("Phaser.GameObjects.Particles.EmitterColorOp")
  @js.native
  open class EmitterColorOp protected ()
    extends StObject
       with typings.phaser.Phaser.GameObjects.Particles.EmitterColorOp {
    /**
      * 
      * @param key The name of the property.
      */
    def this(key: String) = this()
    
    /**
      * An array containing the blue color values.
      * 
      * Populated during the `setMethods` method.
      */
    /* CompleteClass */
    var b: js.Array[Double] = js.native
    
    /**
      * An `onUpdate` callback that returns an eased value between the
      * {@link Phaser.GameObjects.Particles.EmitterColorOp#start} and {@link Phaser.GameObjects.Particles.EmitterColorOp#end}
      * range.
      * @param particle The particle.
      * @param key The name of the property.
      * @param t The current normalized lifetime of the particle, between 0 (birth) and 1 (death).
      */
    /* CompleteClass */
    override def easeValueUpdate(particle: typings.phaser.Phaser.GameObjects.Particles.Particle, key: String, t: Double): Double = js.native
    
    /**
      * An `onEmit` callback for an eased property.
      * 
      * It prepares the particle for easing by {@link Phaser.GameObjects.Particles.EmitterColorOp#easeValueUpdate}.
      * @param particle The particle.
      * @param key The name of the property.
      */
    /* CompleteClass */
    override def easedValueEmit(particle: typings.phaser.Phaser.GameObjects.Particles.Particle, key: String): Double = js.native
    
    /**
      * An array containing the green color values.
      * 
      * Populated during the `setMethods` method.
      */
    /* CompleteClass */
    var g: js.Array[Double] = js.native
    
    /**
      * Checks the type of `EmitterOp.propertyValue` to determine which
      * method is required in order to return values from this op function.
      */
    /* CompleteClass */
    override def getMethod(): Double = js.native
    
    /**
      * An array containing the red color values.
      * 
      * Populated during the `setMethods` method.
      */
    /* CompleteClass */
    var r: js.Array[Double] = js.native
    
    /**
      * Sets the Ease function to use for Color interpolation.
      * @param ease The string-based name of the Ease function to use.
      */
    /* CompleteClass */
    override def setEase(ease: String): Unit = js.native
    
    /**
      * Sets the EmitterColorOp method values, if in use.
      */
    /* CompleteClass */
    override def setMethods(): this.type = js.native
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
  @JSGlobal("Phaser.GameObjects.Particles.EmitterOp")
  @js.native
  open class EmitterOp protected ()
    extends StObject
       with typings.phaser.Phaser.GameObjects.Particles.EmitterOp {
    /**
      * 
      * @param key The name of the property.
      * @param defaultValue The default value of the property.
      * @param emitOnly Whether the property can only be modified when a Particle is emitted. Default false.
      */
    def this(key: String, defaultValue: EmitterOpOnEmitType) = this()
    def this(key: String, defaultValue: EmitterOpOnEmitType, emitOnly: Boolean) = this()
  }
  
  object Events {
    
    /**
      * The Particle Emitter Complete Event.
      * 
      * This event is dispatched when the final particle, emitted from a Particle Emitter that
      * has been stopped, dies. Upon receipt of this event you know that no particles are
      * still rendering at this point in time.
      * 
      * Listen for it on a Particle Emitter instance using `ParticleEmitter.on('complete', listener)`.
      */
    @JSGlobal("Phaser.GameObjects.Particles.Events.COMPLETE")
    @js.native
    val COMPLETE: String = js.native
    
    /**
      * The Particle Emitter Death Zone Event.
      * 
      * This event is dispatched when a Death Zone kills a Particle instance.
      * 
      * Listen for it on a Particle Emitter instance using `ParticleEmitter.on('deathzone', listener)`.
      * 
      * If you wish to know when the final particle is killed, see the `COMPLETE` event.
      */
    @JSGlobal("Phaser.GameObjects.Particles.Events.DEATH_ZONE")
    @js.native
    val DEATH_ZONE: String = js.native
    
    /**
      * The Particle Emitter Explode Event.
      * 
      * This event is dispatched when a Particle Emitter explodes a set of particles.
      * 
      * Listen for it on a Particle Emitter instance using `ParticleEmitter.on('explode', listener)`.
      */
    @JSGlobal("Phaser.GameObjects.Particles.Events.EXPLODE")
    @js.native
    val EXPLODE: String = js.native
    
    /**
      * The Particle Emitter Start Event.
      * 
      * This event is dispatched when a Particle Emitter starts emission of particles.
      * 
      * Listen for it on a Particle Emitter instance using `ParticleEmitter.on('start', listener)`.
      */
    @JSGlobal("Phaser.GameObjects.Particles.Events.START")
    @js.native
    val START: String = js.native
    
    /**
      * The Particle Emitter Stop Event.
      * 
      * This event is dispatched when a Particle Emitter is stopped. This can happen either
      * when you directly call the `ParticleEmitter.stop` method, or if the emitter has
      * been configured to stop after a set time via the `duration` property, or after a
      * set number of particles via the `stopAfter` property.
      * 
      * Listen for it on a Particle Emitter instance using `ParticleEmitter.on('stop', listener)`.
      * 
      * Note that just because the emitter has stopped, that doesn't mean there aren't still
      * particles alive and rendering. It just means the emitter has stopped emitting particles.
      * 
      * If you wish to know when the final particle is killed, see the `COMPLETE` event.
      */
    @JSGlobal("Phaser.GameObjects.Particles.Events.STOP")
    @js.native
    val STOP: String = js.native
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
  @JSGlobal("Phaser.GameObjects.Particles.GravityWell")
  @js.native
  /**
    * 
    * @param x The x coordinate of the Gravity Well, in world space. Default 0.
    * @param y The y coordinate of the Gravity Well, in world space. Default 0.
    * @param power The strength of the gravity force - larger numbers produce a stronger force. Default 0.
    * @param epsilon The minimum distance for which the gravity force is calculated. Default 100.
    * @param gravity The gravitational force of this Gravity Well. Default 50.
    */
  open class GravityWell ()
    extends StObject
       with typings.phaser.Phaser.GameObjects.Particles.GravityWell {
    def this(x: Double) = this()
    def this(x: GravityWellConfig) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: GravityWellConfig, y: Double) = this()
    def this(x: Double, y: Double, power: Double) = this()
    def this(x: Double, y: Unit, power: Double) = this()
    def this(x: Unit, y: Double, power: Double) = this()
    def this(x: Unit, y: Unit, power: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Double) = this()
    def this(x: GravityWellConfig, y: Unit, power: Double) = this()
    def this(x: Double, y: Double, power: Double, epsilon: Double) = this()
    def this(x: Double, y: Double, power: Unit, epsilon: Double) = this()
    def this(x: Double, y: Unit, power: Double, epsilon: Double) = this()
    def this(x: Double, y: Unit, power: Unit, epsilon: Double) = this()
    def this(x: Unit, y: Double, power: Double, epsilon: Double) = this()
    def this(x: Unit, y: Double, power: Unit, epsilon: Double) = this()
    def this(x: Unit, y: Unit, power: Double, epsilon: Double) = this()
    def this(x: Unit, y: Unit, power: Unit, epsilon: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Double, epsilon: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Unit, epsilon: Double) = this()
    def this(x: GravityWellConfig, y: Unit, power: Double, epsilon: Double) = this()
    def this(x: GravityWellConfig, y: Unit, power: Unit, epsilon: Double) = this()
    def this(x: Double, y: Double, power: Double, epsilon: Double, gravity: Double) = this()
    def this(x: Double, y: Double, power: Double, epsilon: Unit, gravity: Double) = this()
    def this(x: Double, y: Double, power: Unit, epsilon: Double, gravity: Double) = this()
    def this(x: Double, y: Double, power: Unit, epsilon: Unit, gravity: Double) = this()
    def this(x: Double, y: Unit, power: Double, epsilon: Double, gravity: Double) = this()
    def this(x: Double, y: Unit, power: Double, epsilon: Unit, gravity: Double) = this()
    def this(x: Double, y: Unit, power: Unit, epsilon: Double, gravity: Double) = this()
    def this(x: Double, y: Unit, power: Unit, epsilon: Unit, gravity: Double) = this()
    def this(x: Unit, y: Double, power: Double, epsilon: Double, gravity: Double) = this()
    def this(x: Unit, y: Double, power: Double, epsilon: Unit, gravity: Double) = this()
    def this(x: Unit, y: Double, power: Unit, epsilon: Double, gravity: Double) = this()
    def this(x: Unit, y: Double, power: Unit, epsilon: Unit, gravity: Double) = this()
    def this(x: Unit, y: Unit, power: Double, epsilon: Double, gravity: Double) = this()
    def this(x: Unit, y: Unit, power: Double, epsilon: Unit, gravity: Double) = this()
    def this(x: Unit, y: Unit, power: Unit, epsilon: Double, gravity: Double) = this()
    def this(x: Unit, y: Unit, power: Unit, epsilon: Unit, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Double, epsilon: Double, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Double, epsilon: Unit, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Unit, epsilon: Double, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Unit, epsilon: Unit, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Unit, power: Double, epsilon: Double, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Unit, power: Double, epsilon: Unit, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Unit, power: Unit, epsilon: Double, gravity: Double) = this()
    def this(x: GravityWellConfig, y: Unit, power: Unit, epsilon: Unit, gravity: Double) = this()
    
    /**
      * The active state of the Particle Processor.
      * 
      * An inactive Particle Processor will be skipped for processing by
      * its parent Emitter.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * Destroys this Particle Processor by removing all external references.
      * 
      * This is called automatically when the owning Particle Emitter is destroyed.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The minimum distance for which the gravity force is calculated.
      * 
      * Defaults to 100.
      */
    /* CompleteClass */
    var epsilon: Double = js.native
    
    /**
      * The gravitational force of this Gravity Well.
      * 
      * Defaults to 50.
      */
    /* CompleteClass */
    var gravity: Double = js.native
    
    /**
      * A reference to the Particle Emitter that owns this Processor.
      * This is set automatically when the Processor is added to an Emitter
      * and nulled when removed or destroyed.
      */
    /* CompleteClass */
    var manager: typings.phaser.Phaser.GameObjects.Particles.ParticleEmitter = js.native
    
    /**
      * The strength of the gravity force - larger numbers produce a stronger force.
      * 
      * Defaults to 0.
      */
    /* CompleteClass */
    var power: Double = js.native
    
    /**
      * Takes a Particle and updates it based on the properties of this Gravity Well.
      * @param particle The Particle to update.
      * @param delta The delta time in ms.
      * @param step The delta value divided by 1000.
      */
    /* CompleteClass */
    override def update(particle: typings.phaser.Phaser.GameObjects.Particles.Particle, delta: Double, step: Double): Unit = js.native
    /**
      * The Particle Processor update method should be overriden by your own
      * method and handle the processing of the particles, typically modifying
      * their velocityX/Y values based on the criteria of this processor.
      * @param particle The Particle to update.
      * @param delta The delta time in ms.
      * @param step The delta value divided by 1000.
      * @param t The current normalized lifetime of the particle, between 0 (birth) and 1 (death).
      */
    /* CompleteClass */
    override def update(
      particle: typings.phaser.Phaser.GameObjects.Particles.Particle,
      delta: Double,
      step: Double,
      t: Double
    ): Unit = js.native
    
    /**
      * The x coordinate of the Particle Processor, in world space.
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * The y coordinate of the Particle Processor, in world space.
      */
    /* CompleteClass */
    var y: Double = js.native
  }
  
  /**
    * A Particle is a simple object owned and controlled by a Particle Emitter.
    * 
    * It encapsulates all of the properties required to move and update according
    * to the Emitters operations.
    */
  @JSGlobal("Phaser.GameObjects.Particles.Particle")
  @js.native
  open class Particle protected ()
    extends StObject
       with typings.phaser.Phaser.GameObjects.Particles.Particle {
    /**
      * 
      * @param emitter The Emitter to which this Particle belongs.
      */
    def this(emitter: typings.phaser.Phaser.GameObjects.Particles.ParticleEmitter) = this()
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
  @JSGlobal("Phaser.GameObjects.Particles.ParticleBounds")
  @js.native
  open class ParticleBounds protected ()
    extends StObject
       with typings.phaser.Phaser.GameObjects.Particles.ParticleBounds {
    /**
      * 
      * @param x The x position (top-left) of the bounds, in world space.
      * @param y The y position (top-left) of the bounds, in world space.
      * @param width The width of the bounds.
      * @param height The height of the bounds.
      * @param collideLeft Whether particles interact with the left edge of the bounds. Default true.
      * @param collideRight Whether particles interact with the right edge of the bounds. Default true.
      * @param collideTop Whether particles interact with the top edge of the bounds. Default true.
      * @param collideBottom Whether particles interact with the bottom edge of the bounds. Default true.
      */
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double, collideLeft: Boolean) = this()
    def this(x: Double, y: Double, width: Double, height: Double, collideLeft: Boolean, collideRight: Boolean) = this()
    def this(x: Double, y: Double, width: Double, height: Double, collideLeft: Unit, collideRight: Boolean) = this()
    def this(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      collideLeft: Boolean,
      collideRight: Boolean,
      collideTop: Boolean
    ) = this()
    def this(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      collideLeft: Boolean,
      collideRight: Unit,
      collideTop: Boolean
    ) = this()
    def this(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      collideLeft: Unit,
      collideRight: Boolean,
      collideTop: Boolean
    ) = this()
    def this(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      collideLeft: Unit,
      collideRight: Unit,
      collideTop: Boolean
    ) = this()
    def this(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      collideLeft: Boolean,
      collideRight: Boolean,
      collideTop: Boolean,
      collideBottom: Boolean
    ) = this()
    def this(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      collideLeft: Boolean,
      collideRight: Boolean,
      collideTop: Unit,
      collideBottom: Boolean
    ) = this()
    def this(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      collideLeft: Boolean,
      collideRight: Unit,
      collideTop: Boolean,
      collideBottom: Boolean
    ) = this()
    def this(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      collideLeft: Boolean,
      collideRight: Unit,
      collideTop: Unit,
      collideBottom: Boolean
    ) = this()
    def this(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      collideLeft: Unit,
      collideRight: Boolean,
      collideTop: Boolean,
      collideBottom: Boolean
    ) = this()
    def this(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      collideLeft: Unit,
      collideRight: Boolean,
      collideTop: Unit,
      collideBottom: Boolean
    ) = this()
    def this(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      collideLeft: Unit,
      collideRight: Unit,
      collideTop: Boolean,
      collideBottom: Boolean
    ) = this()
    def this(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      collideLeft: Unit,
      collideRight: Unit,
      collideTop: Unit,
      collideBottom: Boolean
    ) = this()
    
    /**
      * The active state of the Particle Processor.
      * 
      * An inactive Particle Processor will be skipped for processing by
      * its parent Emitter.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * A rectangular boundary constraining particle movement. Use the Emitter properties `collideLeft`,
      * `collideRight`, `collideTop` and `collideBottom` to control if a particle will rebound off
      * the sides of this boundary, or not. This happens when the particles x/y coordinate hits
      * the boundary.
      */
    /* CompleteClass */
    var bounds: typings.phaser.Phaser.Geom.Rectangle = js.native
    
    /**
      * Whether particles interact with the bottom edge of the emitter {@link Phaser.GameObjects.Particles.ParticleBounds#bounds}.
      */
    /* CompleteClass */
    var collideBottom: Boolean = js.native
    
    /**
      * Whether particles interact with the left edge of the emitter {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds}.
      */
    /* CompleteClass */
    var collideLeft: Boolean = js.native
    
    /**
      * Whether particles interact with the right edge of the emitter {@link Phaser.GameObjects.Particles.ParticleBounds#bounds}.
      */
    /* CompleteClass */
    var collideRight: Boolean = js.native
    
    /**
      * Whether particles interact with the top edge of the emitter {@link Phaser.GameObjects.Particles.ParticleBounds#bounds}.
      */
    /* CompleteClass */
    var collideTop: Boolean = js.native
    
    /**
      * Destroys this Particle Processor by removing all external references.
      * 
      * This is called automatically when the owning Particle Emitter is destroyed.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * A reference to the Particle Emitter that owns this Processor.
      * This is set automatically when the Processor is added to an Emitter
      * and nulled when removed or destroyed.
      */
    /* CompleteClass */
    var manager: typings.phaser.Phaser.GameObjects.Particles.ParticleEmitter = js.native
    
    /**
      * Takes a Particle and updates it against the bounds.
      * @param particle The Particle to update.
      */
    /* CompleteClass */
    override def update(particle: typings.phaser.Phaser.GameObjects.Particles.Particle): Unit = js.native
    /**
      * The Particle Processor update method should be overriden by your own
      * method and handle the processing of the particles, typically modifying
      * their velocityX/Y values based on the criteria of this processor.
      * @param particle The Particle to update.
      * @param delta The delta time in ms.
      * @param step The delta value divided by 1000.
      * @param t The current normalized lifetime of the particle, between 0 (birth) and 1 (death).
      */
    /* CompleteClass */
    override def update(
      particle: typings.phaser.Phaser.GameObjects.Particles.Particle,
      delta: Double,
      step: Double,
      t: Double
    ): Unit = js.native
    
    /**
      * The x coordinate of the Particle Processor, in world space.
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * The y coordinate of the Particle Processor, in world space.
      */
    /* CompleteClass */
    var y: Double = js.native
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
  @JSGlobal("Phaser.GameObjects.Particles.ParticleEmitter")
  @js.native
  open class ParticleEmitter protected ()
    extends StObject
       with typings.phaser.Phaser.GameObjects.Particles.ParticleEmitter {
    /**
      * 
      * @param config Settings for this emitter.
      */
    def this(config: ParticleEmitterConfig) = this()
    
    /**
      * The depth of this Game Object within the Scene. Ensure this value is only ever set to a number data-type.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The default depth is zero. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      */
    /* CompleteClass */
    var depth: Double = js.native
    
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The default depth is zero. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      * @param value The depth of this Game Object. Ensure this value is only ever a number data-type.
      */
    /* CompleteClass */
    override def setDepth(value: Double): this.type = js.native
    
    /**
      * Sets the visibility of this Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      * @param value The visible state of the Game Object.
      */
    /* CompleteClass */
    override def setVisible(value: Boolean): this.type = js.native
    
    /**
      * The visible state of the Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      */
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  
  /**
    * This class provides the structured required for all Particle Processors.
    * 
    * You should extend it and add the functionality required for your processor,
    * including tidying up any resources this may create in the `destroy` method.
    * 
    * See the GravityWell for an example of a processor.
    */
  @JSGlobal("Phaser.GameObjects.Particles.ParticleProcessor")
  @js.native
  /**
    * 
    * @param x The x coordinate of the Particle Processor, in world space. Default 0.
    * @param y The y coordinate of the Particle Processor, in world space. Default 0.
    * @param active The active state of this Particle Processor. Default true.
    */
  open class ParticleProcessor ()
    extends StObject
       with typings.phaser.Phaser.GameObjects.Particles.ParticleProcessor {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, active: Boolean) = this()
    def this(x: Double, y: Unit, active: Boolean) = this()
    def this(x: Unit, y: Double, active: Boolean) = this()
    def this(x: Unit, y: Unit, active: Boolean) = this()
    
    /**
      * The active state of the Particle Processor.
      * 
      * An inactive Particle Processor will be skipped for processing by
      * its parent Emitter.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * Destroys this Particle Processor by removing all external references.
      * 
      * This is called automatically when the owning Particle Emitter is destroyed.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * A reference to the Particle Emitter that owns this Processor.
      * This is set automatically when the Processor is added to an Emitter
      * and nulled when removed or destroyed.
      */
    /* CompleteClass */
    var manager: typings.phaser.Phaser.GameObjects.Particles.ParticleEmitter = js.native
    
    /**
      * The Particle Processor update method should be overriden by your own
      * method and handle the processing of the particles, typically modifying
      * their velocityX/Y values based on the criteria of this processor.
      * @param particle The Particle to update.
      * @param delta The delta time in ms.
      * @param step The delta value divided by 1000.
      * @param t The current normalized lifetime of the particle, between 0 (birth) and 1 (death).
      */
    /* CompleteClass */
    override def update(
      particle: typings.phaser.Phaser.GameObjects.Particles.Particle,
      delta: Double,
      step: Double,
      t: Double
    ): Unit = js.native
    
    /**
      * The x coordinate of the Particle Processor, in world space.
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * The y coordinate of the Particle Processor, in world space.
      */
    /* CompleteClass */
    var y: Double = js.native
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
    @JSGlobal("Phaser.GameObjects.Particles.Zones.DeathZone")
    @js.native
    open class DeathZone protected ()
      extends StObject
         with typings.phaser.Phaser.GameObjects.Particles.Zones.DeathZone {
      /**
        * 
        * @param source An object instance that has a `contains` method that returns a boolean when given `x` and `y` arguments.
        * @param killOnEnter Should the Particle be killed when it enters the zone? `true` or leaves it? `false`
        */
      def this(source: DeathZoneSource, killOnEnter: Boolean) = this()
      
      /**
        * Set to `true` if the Particle should be killed if it enters this zone.
        * Set to `false` to kill the Particle if it leaves this zone.
        */
      /* CompleteClass */
      var killOnEnter: Boolean = js.native
      
      /**
        * An object instance that has a `contains` method that returns a boolean when given `x` and `y` arguments.
        * This could be a Geometry shape, such as `Phaser.Geom.Circle`, or your own custom object.
        */
      /* CompleteClass */
      var source: DeathZoneSource = js.native
      
      /**
        * Checks if the given Particle will be killed or not by this zone.
        * @param particle The particle to test against this Death Zones.
        */
      /* CompleteClass */
      override def willKill(particle: typings.phaser.Phaser.GameObjects.Particles.Particle): Boolean = js.native
    }
    
    /**
      * A zone that places particles on a shape's edges.
      */
    @JSGlobal("Phaser.GameObjects.Particles.Zones.EdgeZone")
    @js.native
    open class EdgeZone protected ()
      extends StObject
         with typings.phaser.Phaser.GameObjects.Particles.Zones.EdgeZone {
      /**
        * 
        * @param source An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
        * @param quantity The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
        * @param stepRate The distance between each particle. When set, `quantity` is implied and should be set to 0.
        * @param yoyo Whether particles are placed from start to end and then end to start. Default false.
        * @param seamless Whether one endpoint will be removed if it's identical to the other. Default true.
        * @param total The total number of particles this zone will emit before passing over to the next emission zone in the Emitter. -1 means it will never pass over and you must use `setEmitZone` to change it. Default -1.
        */
      def this(source: EdgeZoneSource, quantity: Double, stepRate: Double) = this()
      def this(source: EdgeZoneSource, quantity: Double, stepRate: Double, yoyo: Boolean) = this()
      def this(source: EdgeZoneSource, quantity: Double, stepRate: Double, yoyo: Boolean, seamless: Boolean) = this()
      def this(source: EdgeZoneSource, quantity: Double, stepRate: Double, yoyo: Unit, seamless: Boolean) = this()
      def this(
        source: EdgeZoneSource,
        quantity: Double,
        stepRate: Double,
        yoyo: Boolean,
        seamless: Boolean,
        total: Double
      ) = this()
      def this(
        source: EdgeZoneSource,
        quantity: Double,
        stepRate: Double,
        yoyo: Boolean,
        seamless: Unit,
        total: Double
      ) = this()
      def this(
        source: EdgeZoneSource,
        quantity: Double,
        stepRate: Double,
        yoyo: Unit,
        seamless: Boolean,
        total: Double
      ) = this()
      def this(
        source: EdgeZoneSource,
        quantity: Double,
        stepRate: Double,
        yoyo: Unit,
        seamless: Unit,
        total: Double
      ) = this()
      
      /**
        * Change the source of the EdgeZone.
        * @param source An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
        */
      /* CompleteClass */
      override def changeSource(source: EdgeZoneSource): this.type = js.native
      
      /**
        * The counter used for iterating the EdgeZone's points.
        */
      /* CompleteClass */
      var counter: Double = js.native
      
      /**
        * Get the next point in the Zone and set its coordinates on the given Particle.
        * @param particle The Particle.
        */
      /* CompleteClass */
      override def getPoint(particle: typings.phaser.Phaser.GameObjects.Particles.Particle): Unit = js.native
      
      /**
        * The points placed on the source edge.
        */
      /* CompleteClass */
      var points: js.Array[Point] = js.native
      
      /**
        * The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
        */
      /* CompleteClass */
      var quantity: Double = js.native
      
      /**
        * Whether one endpoint will be removed if it's identical to the other.
        */
      /* CompleteClass */
      var seamless: Boolean = js.native
      
      /**
        * An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
        */
      /* CompleteClass */
      var source: EdgeZoneSource | RandomZoneSource = js.native
      
      /**
        * The distance between each particle. When set, `quantity` is implied and should be set to 0.
        */
      /* CompleteClass */
      var stepRate: Double = js.native
      
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
      /* CompleteClass */
      var total: Double = js.native
      
      /**
        * Update the {@link Phaser.GameObjects.Particles.Zones.EdgeZone#points} from the EdgeZone's
        * {@link Phaser.GameObjects.Particles.Zones.EdgeZone#source}.
        * 
        * Also updates internal properties.
        */
      /* CompleteClass */
      override def updateSource(): this.type = js.native
      
      /**
        * Whether particles are placed from start to end and then end to start.
        */
      /* CompleteClass */
      var yoyo: Boolean = js.native
    }
    
    /**
      * A zone that places particles randomly within a shapes area.
      */
    @JSGlobal("Phaser.GameObjects.Particles.Zones.RandomZone")
    @js.native
    open class RandomZone protected ()
      extends StObject
         with typings.phaser.Phaser.GameObjects.Particles.Zones.RandomZone {
      /**
        * 
        * @param source An object instance with a `getRandomPoint(point)` method.
        */
      def this(source: RandomZoneSource) = this()
      
      /**
        * Get the next point in the Zone and set its coordinates on the given Particle.
        * @param particle The Particle.
        */
      /* CompleteClass */
      override def getPoint(particle: typings.phaser.Phaser.GameObjects.Particles.Particle): Unit = js.native
      
      /**
        * An object instance with a `getRandomPoint(point)` method.
        */
      /* CompleteClass */
      var source: RandomZoneSource = js.native
      
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
      /* CompleteClass */
      var total: Double = js.native
    }
  }
}

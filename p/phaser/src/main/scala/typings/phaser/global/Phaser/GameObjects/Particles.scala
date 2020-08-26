package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.GameObjects.Particles.DeathZoneSource
import typings.phaser.Phaser.Types.GameObjects.Particles.EdgeZoneSource
import typings.phaser.Phaser.Types.GameObjects.Particles.GravityWellConfig
import typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterConfig
import typings.phaser.Phaser.Types.GameObjects.Particles.RandomZoneSource
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.GameObjects.Particles")
@js.native
object Particles extends js.Object {
  /**
    * A Particle Emitter property.
    * 
    * Facilitates changing Particle properties as they are emitted and throughout their lifetime.
    */
  @js.native
  class EmitterOp protected ()
    extends typings.phaser.Phaser.GameObjects.Particles.EmitterOp {
    /**
      * 
      * @param config Settings for the Particle Emitter that owns this property.
      * @param key The name of the property.
      * @param defaultValue The default value of the property.
      * @param emitOnly Whether the property can only be modified when a Particle is emitted. Default false.
      */
    def this(config: ParticleEmitterConfig, key: String, defaultValue: Double) = this()
    def this(config: ParticleEmitterConfig, key: String, defaultValue: Double, emitOnly: Boolean) = this()
  }
  
  /**
    * The GravityWell action applies a force on the particle to draw it towards, or repel it from, a single point.
    * 
    * The force applied is inversely proportional to the square of the distance from the particle to the point, in accordance with Newton's law of gravity.
    * 
    * This simulates the effect of gravity over large distances (as between planets, for example).
    */
  @js.native
  /**
    * 
    * @param x The x coordinate of the Gravity Well, in world space. Default 0.
    * @param y The y coordinate of the Gravity Well, in world space. Default 0.
    * @param power The strength of the gravity force - larger numbers produce a stronger force. Default 0.
    * @param epsilon The minimum distance for which the gravity force is calculated. Default 100.
    * @param gravity The gravitational force of this Gravity Well. Default 50.
    */
  class GravityWell ()
    extends typings.phaser.Phaser.GameObjects.Particles.GravityWell {
    def this(x: Double) = this()
    def this(x: GravityWellConfig) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: GravityWellConfig, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], power: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, power: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], power: Double) = this()
    def this(x: Double, y: Double, power: Double) = this()
    def this(x: GravityWellConfig, y: js.UndefOr[scala.Nothing], power: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      power: js.UndefOr[scala.Nothing],
      epsilon: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], power: Double, epsilon: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, power: js.UndefOr[scala.Nothing], epsilon: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, power: Double, epsilon: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], power: js.UndefOr[scala.Nothing], epsilon: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], power: Double, epsilon: Double) = this()
    def this(x: Double, y: Double, power: js.UndefOr[scala.Nothing], epsilon: Double) = this()
    def this(x: Double, y: Double, power: Double, epsilon: Double) = this()
    def this(
      x: GravityWellConfig,
      y: js.UndefOr[scala.Nothing],
      power: js.UndefOr[scala.Nothing],
      epsilon: Double
    ) = this()
    def this(x: GravityWellConfig, y: js.UndefOr[scala.Nothing], power: Double, epsilon: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: js.UndefOr[scala.Nothing], epsilon: Double) = this()
    def this(x: GravityWellConfig, y: Double, power: Double, epsilon: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      power: js.UndefOr[scala.Nothing],
      epsilon: js.UndefOr[scala.Nothing],
      gravity: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      power: js.UndefOr[scala.Nothing],
      epsilon: Double,
      gravity: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      power: Double,
      epsilon: js.UndefOr[scala.Nothing],
      gravity: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      power: Double,
      epsilon: Double,
      gravity: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: Double,
      power: js.UndefOr[scala.Nothing],
      epsilon: js.UndefOr[scala.Nothing],
      gravity: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: Double,
      power: js.UndefOr[scala.Nothing],
      epsilon: Double,
      gravity: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: Double,
      power: Double,
      epsilon: js.UndefOr[scala.Nothing],
      gravity: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, power: Double, epsilon: Double, gravity: Double) = this()
    def this(
      x: Double,
      y: js.UndefOr[scala.Nothing],
      power: js.UndefOr[scala.Nothing],
      epsilon: js.UndefOr[scala.Nothing],
      gravity: Double
    ) = this()
    def this(
      x: Double,
      y: js.UndefOr[scala.Nothing],
      power: js.UndefOr[scala.Nothing],
      epsilon: Double,
      gravity: Double
    ) = this()
    def this(
      x: Double,
      y: js.UndefOr[scala.Nothing],
      power: Double,
      epsilon: js.UndefOr[scala.Nothing],
      gravity: Double
    ) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], power: Double, epsilon: Double, gravity: Double) = this()
    def this(
      x: Double,
      y: Double,
      power: js.UndefOr[scala.Nothing],
      epsilon: js.UndefOr[scala.Nothing],
      gravity: Double
    ) = this()
    def this(x: Double, y: Double, power: js.UndefOr[scala.Nothing], epsilon: Double, gravity: Double) = this()
    def this(x: Double, y: Double, power: Double, epsilon: js.UndefOr[scala.Nothing], gravity: Double) = this()
    def this(x: Double, y: Double, power: Double, epsilon: Double, gravity: Double) = this()
    def this(
      x: GravityWellConfig,
      y: js.UndefOr[scala.Nothing],
      power: js.UndefOr[scala.Nothing],
      epsilon: js.UndefOr[scala.Nothing],
      gravity: Double
    ) = this()
    def this(
      x: GravityWellConfig,
      y: js.UndefOr[scala.Nothing],
      power: js.UndefOr[scala.Nothing],
      epsilon: Double,
      gravity: Double
    ) = this()
    def this(
      x: GravityWellConfig,
      y: js.UndefOr[scala.Nothing],
      power: Double,
      epsilon: js.UndefOr[scala.Nothing],
      gravity: Double
    ) = this()
    def this(
      x: GravityWellConfig,
      y: js.UndefOr[scala.Nothing],
      power: Double,
      epsilon: Double,
      gravity: Double
    ) = this()
    def this(
      x: GravityWellConfig,
      y: Double,
      power: js.UndefOr[scala.Nothing],
      epsilon: js.UndefOr[scala.Nothing],
      gravity: Double
    ) = this()
    def this(
      x: GravityWellConfig,
      y: Double,
      power: js.UndefOr[scala.Nothing],
      epsilon: Double,
      gravity: Double
    ) = this()
    def this(
      x: GravityWellConfig,
      y: Double,
      power: Double,
      epsilon: js.UndefOr[scala.Nothing],
      gravity: Double
    ) = this()
    def this(x: GravityWellConfig, y: Double, power: Double, epsilon: Double, gravity: Double) = this()
  }
  
  /**
    * A Particle is a simple Game Object controlled by a Particle Emitter and Manager, and rendered by the Manager.
    * It uses its own lightweight physics system, and can interact only with its Emitter's bounds and zones.
    */
  @js.native
  class Particle protected ()
    extends typings.phaser.Phaser.GameObjects.Particles.Particle {
    /**
      * 
      * @param emitter The Emitter to which this Particle belongs.
      */
    def this(emitter: typings.phaser.Phaser.GameObjects.Particles.ParticleEmitter) = this()
  }
  
  /**
    * A particle emitter represents a single particle stream.
    * It controls a pool of {@link Phaser.GameObjects.Particles.Particle Particles} and is controlled by a {@link Phaser.GameObjects.Particles.ParticleEmitterManager Particle Emitter Manager}.
    */
  @js.native
  class ParticleEmitter protected ()
    extends typings.phaser.Phaser.GameObjects.Particles.ParticleEmitter {
    /**
      * 
      * @param manager The Emitter Manager this Emitter belongs to.
      * @param config Settings for this emitter.
      */
    def this(
      manager: typings.phaser.Phaser.GameObjects.Particles.ParticleEmitterManager,
      config: ParticleEmitterConfig
    ) = this()
  }
  
  /**
    * A Particle Emitter Manager creates and controls {@link Phaser.GameObjects.Particles.ParticleEmitter Particle Emitters} and {@link Phaser.GameObjects.Particles.GravityWell Gravity Wells}.
    */
  @js.native
  class ParticleEmitterManager protected ()
    extends typings.phaser.Phaser.GameObjects.Particles.ParticleEmitterManager {
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
    def this(
      scene: Scene,
      texture: String,
      frame: js.UndefOr[scala.Nothing],
      emitters: js.Array[ParticleEmitterConfig]
    ) = this()
    def this(scene: Scene, texture: String, frame: js.UndefOr[scala.Nothing], emitters: ParticleEmitterConfig) = this()
    def this(scene: Scene, texture: String, frame: String, emitters: js.Array[ParticleEmitterConfig]) = this()
    def this(scene: Scene, texture: String, frame: String, emitters: ParticleEmitterConfig) = this()
    def this(scene: Scene, texture: String, frame: integer, emitters: js.Array[ParticleEmitterConfig]) = this()
    def this(scene: Scene, texture: String, frame: integer, emitters: ParticleEmitterConfig) = this()
  }
  
  @js.native
  object Zones extends js.Object {
    /**
      * A Death Zone.
      * 
      * A Death Zone is a special type of zone that will kill a Particle as soon as it either enters, or leaves, the zone.
      * 
      * The zone consists of a `source` which could be a Geometric shape, such as a Rectangle or Ellipse, or your own
      * object as long as it includes a `contains` method for which the Particles can be tested against.
      */
    @js.native
    class DeathZone protected ()
      extends typings.phaser.Phaser.GameObjects.Particles.Zones.DeathZone {
      /**
        * 
        * @param source An object instance that has a `contains` method that returns a boolean when given `x` and `y` arguments.
        * @param killOnEnter Should the Particle be killed when it enters the zone? `true` or leaves it? `false`
        */
      def this(source: DeathZoneSource, killOnEnter: Boolean) = this()
    }
    
    /**
      * A zone that places particles on a shape's edges.
      */
    @js.native
    class EdgeZone protected ()
      extends typings.phaser.Phaser.GameObjects.Particles.Zones.EdgeZone {
      /**
        * 
        * @param source An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
        * @param quantity The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
        * @param stepRate The distance between each particle. When set, `quantity` is implied and should be set to 0.
        * @param yoyo Whether particles are placed from start to end and then end to start. Default false.
        * @param seamless Whether one endpoint will be removed if it's identical to the other. Default true.
        */
      def this(source: EdgeZoneSource, quantity: integer, stepRate: Double) = this()
      def this(source: EdgeZoneSource, quantity: integer, stepRate: Double, yoyo: Boolean) = this()
      def this(
        source: EdgeZoneSource,
        quantity: integer,
        stepRate: Double,
        yoyo: js.UndefOr[scala.Nothing],
        seamless: Boolean
      ) = this()
      def this(source: EdgeZoneSource, quantity: integer, stepRate: Double, yoyo: Boolean, seamless: Boolean) = this()
    }
    
    /**
      * A zone that places particles randomly within a shape's area.
      */
    @js.native
    class RandomZone protected ()
      extends typings.phaser.Phaser.GameObjects.Particles.Zones.RandomZone {
      /**
        * 
        * @param source An object instance with a `getRandomPoint(point)` method.
        */
      def this(source: RandomZoneSource) = this()
    }
    
  }
  
}


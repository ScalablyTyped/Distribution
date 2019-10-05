package typings.phaser.phaserMod.Physics

import typings.phaser.Phaser.Types.Physics.Impact.WorldConfig
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Impact.js compatible physics world, body and solver, for those who are used
  * to the Impact way of defining and controlling physics bodies. Also works with
  * the new Loader support for Weltmeister map data.
  * 
  * World updated to run off the Phaser main loop.
  * Body extended to support additional setter functions.
  * 
  * To create the map data you'll need Weltmeister, which comes with Impact
  * and can be purchased from http://impactjs.com
  * 
  * My thanks to Dominic Szablewski for his permission to support Impact in Phaser.
  */
@JSImport("phaser", "Physics.Impact")
@js.native
object Impact extends js.Object {
  /**
    * An Impact.js compatible physics body.
    * This re-creates the properties you'd get on an Entity and the math needed to update them.
    */
  @js.native
  class Body protected ()
    extends typings.phaser.Phaser.Physics.Impact.Body {
    /**
      * 
      * @param world [description]
      * @param x [description]
      * @param y [description]
      * @param sx [description] Default 16.
      * @param sy [description] Default 16.
      */
    def this(world: typings.phaser.Phaser.Physics.Impact.World, x: Double, y: Double) = this()
    def this(world: typings.phaser.Phaser.Physics.Impact.World, x: Double, y: Double, sx: Double) = this()
    def this(world: typings.phaser.Phaser.Physics.Impact.World, x: Double, y: Double, sx: Double, sy: Double) = this()
  }
  
  /**
    * [description]
    */
  @js.native
  /**
    * 
    * @param tilesize [description] Default 32.
    * @param data [description]
    */
  class CollisionMap ()
    extends typings.phaser.Phaser.Physics.Impact.CollisionMap {
    def this(tilesize: integer) = this()
    def this(tilesize: integer, data: js.Array[_]) = this()
  }
  
  /**
    * The Impact Physics Factory allows you to easily create Impact Physics enabled Game Objects.
    * Objects that are created by this Factory are automatically added to the physics world.
    */
  @js.native
  class Factory protected ()
    extends typings.phaser.Phaser.Physics.Impact.Factory {
    /**
      * 
      * @param world A reference to the Impact Physics world.
      */
    def this(world: typings.phaser.Phaser.Physics.Impact.World) = this()
  }
  
  /**
    * [description]
    */
  @js.native
  class ImpactBody protected ()
    extends typings.phaser.Phaser.Physics.Impact.ImpactBody {
    /**
      * 
      * @param world [description]
      * @param x x - The horizontal position of this physics body in the world.
      * @param y y - The vertical position of this physics body in the world.
      * @param width The width of the physics body in the world.
      * @param height [description]
      */
    def this(
      world: typings.phaser.Phaser.Physics.Impact.World,
      x: Double,
      y: Double,
      width: Double,
      height: Double
    ) = this()
  }
  
  /**
    * An Impact Physics Image Game Object.
    * 
    * An Image is a light-weight Game Object useful for the display of static images in your game,
    * such as logos, backgrounds, scenery or other non-animated elements. Images can have input
    * events and physics bodies, or be tweened, tinted or scrolled. The main difference between an
    * Image and a Sprite is that you cannot animate an Image as they do not have the Animation component.
    */
  @js.native
  class ImpactImage protected ()
    extends typings.phaser.Phaser.Physics.Impact.ImpactImage {
    /**
      * 
      * @param world The physics world of the Impact physics system.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      */
    def this(world: typings.phaser.Phaser.Physics.Impact.World, x: Double, y: Double, texture: String) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Impact.World,
      x: Double,
      y: Double,
      texture: String,
      frame: String
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Impact.World,
      x: Double,
      y: Double,
      texture: String,
      frame: integer
    ) = this()
  }
  
  /**
    * [description]
    */
  @js.native
  class ImpactPhysics protected ()
    extends typings.phaser.Phaser.Physics.Impact.ImpactPhysics {
    /**
      * 
      * @param scene [description]
      */
    def this(scene: typings.phaser.Phaser.Scene) = this()
  }
  
  /**
    * An Impact Physics Sprite Game Object.
    * 
    * A Sprite Game Object is used for the display of both static and animated images in your game.
    * Sprites can have input events and physics bodies. They can also be tweened, tinted, scrolled
    * and animated.
    * 
    * The main difference between a Sprite and an Image Game Object is that you cannot animate Images.
    * As such, Sprites take a fraction longer to process and have a larger API footprint due to the Animation
    * Component. If you do not require animation then you can safely use Images to replace Sprites in all cases.
    */
  @js.native
  class ImpactSprite protected ()
    extends typings.phaser.Phaser.Physics.Impact.ImpactSprite {
    /**
      * 
      * @param world [description]
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      */
    def this(world: typings.phaser.Phaser.Physics.Impact.World, x: Double, y: Double, texture: String) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Impact.World,
      x: Double,
      y: Double,
      texture: String,
      frame: String
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Impact.World,
      x: Double,
      y: Double,
      texture: String,
      frame: integer
    ) = this()
  }
  
  /**
    * [description]
    */
  @js.native
  class World protected ()
    extends typings.phaser.Phaser.Physics.Impact.World {
    /**
      * 
      * @param scene The Scene to which this Impact World instance belongs.
      * @param config [description]
      */
    def this(scene: typings.phaser.Phaser.Scene, config: WorldConfig) = this()
  }
  
  /**
    * [description]
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    * @param vel [description]
    * @param accel [description]
    * @param friction [description]
    * @param max [description]
    */
  def GetVelocity(delta: Double, vel: Double, accel: Double, friction: Double, max: Double): Double = js.native
  /**
    * [description]
    * @param world [description]
    * @param left [description]
    * @param right [description]
    * @param weak [description]
    */
  def SeparateX(
    world: typings.phaser.Phaser.Physics.Impact.World,
    left: typings.phaser.Phaser.Physics.Impact.Body,
    right: typings.phaser.Phaser.Physics.Impact.Body
  ): Unit = js.native
  def SeparateX(
    world: typings.phaser.Phaser.Physics.Impact.World,
    left: typings.phaser.Phaser.Physics.Impact.Body,
    right: typings.phaser.Phaser.Physics.Impact.Body,
    weak: typings.phaser.Phaser.Physics.Impact.Body
  ): Unit = js.native
  /**
    * [description]
    * @param world [description]
    * @param top [description]
    * @param bottom [description]
    * @param weak [description]
    */
  def SeparateY(
    world: typings.phaser.Phaser.Physics.Impact.World,
    top: typings.phaser.Phaser.Physics.Impact.Body,
    bottom: typings.phaser.Phaser.Physics.Impact.Body
  ): Unit = js.native
  def SeparateY(
    world: typings.phaser.Phaser.Physics.Impact.World,
    top: typings.phaser.Phaser.Physics.Impact.Body,
    bottom: typings.phaser.Phaser.Physics.Impact.Body,
    weak: typings.phaser.Phaser.Physics.Impact.Body
  ): Unit = js.native
  /**
    * Impact Physics Solver
    * @param world The Impact simulation to run the solver in.
    * @param bodyA The first body in the collision.
    * @param bodyB The second body in the collision.
    */
  def Solver(
    world: typings.phaser.Phaser.Physics.Impact.World,
    bodyA: typings.phaser.Phaser.Physics.Impact.Body,
    bodyB: typings.phaser.Phaser.Physics.Impact.Body
  ): Unit = js.native
  /**
    * Set up the trace-result
    * var res = {
    *     collision: {x: false, y: false, slope: false},
    *     pos: {x: x, y: y},
    *     tile: {x: 0, y: 0}
    * };
    * @param body [description]
    * @param res [description]
    */
  def UpdateMotion(body: typings.phaser.Phaser.Physics.Impact.Body, res: js.Object): Unit = js.native
  /**
    * Collision Types - Determine if and how entities collide with each other.
    * 
    * In ACTIVE vs. LITE or FIXED vs. ANY collisions, only the "weak" entity moves,
    * while the other one stays fixed. In ACTIVE vs. ACTIVE and ACTIVE vs. PASSIVE
    * collisions, both entities are moved. LITE or PASSIVE entities don't collide
    * with other LITE or PASSIVE entities at all. The behavior for FIXED vs.
    * FIXED collisions is undefined.
    */
  @js.native
  object COLLIDES extends js.Object {
    /* 3 */ val ACTIVE: typings.phaser.Phaser.Physics.Impact.COLLIDES.ACTIVE with Double = js.native
    /* 4 */ val FIXED: typings.phaser.Phaser.Physics.Impact.COLLIDES.FIXED with Double = js.native
    /* 1 */ val LITE: typings.phaser.Phaser.Physics.Impact.COLLIDES.LITE with Double = js.native
    /* 0 */ val NEVER: typings.phaser.Phaser.Physics.Impact.COLLIDES.NEVER with Double = js.native
    /* 2 */ val PASSIVE: typings.phaser.Phaser.Physics.Impact.COLLIDES.PASSIVE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.phaser.Phaser.Physics.Impact.COLLIDES with Double] = js.native
  }
  
  @js.native
  object Events extends js.Object {
    /**
      * The Impact Physics World Collide Event.
      * 
      * This event is dispatched by an Impact Physics World instance if two bodies collide.
      * 
      * Listen to it from a Scene using: `this.impact.world.on('collide', listener)`.
      */
    val COLLIDE: js.Any = js.native
    /**
      * The Impact Physics World Pause Event.
      * 
      * This event is dispatched by an Impact Physics World instance when it is paused.
      * 
      * Listen to it from a Scene using: `this.impact.world.on('pause', listener)`.
      */
    val PAUSE: js.Any = js.native
    /**
      * The Impact Physics World Resume Event.
      * 
      * This event is dispatched by an Impact Physics World instance when it resumes from a paused state.
      * 
      * Listen to it from a Scene using: `this.impact.world.on('resume', listener)`.
      */
    val RESUME: js.Any = js.native
  }
  
  /**
    * Collision Types - Determine if and how entities collide with each other.
    * 
    * In ACTIVE vs. LITE or FIXED vs. ANY collisions, only the "weak" entity moves,
    * while the other one stays fixed. In ACTIVE vs. ACTIVE and ACTIVE vs. PASSIVE
    * collisions, both entities are moved. LITE or PASSIVE entities don't collide
    * with other LITE or PASSIVE entities at all. The behavior for FIXED vs.
    * FIXED collisions is undefined.
    */
  @js.native
  object TYPE extends js.Object {
    /* 1 */ val A: typings.phaser.Phaser.Physics.Impact.TYPE.A with Double = js.native
    /* 2 */ val B: typings.phaser.Phaser.Physics.Impact.TYPE.B with Double = js.native
    /* 3 */ val BOTH: typings.phaser.Phaser.Physics.Impact.TYPE.BOTH with Double = js.native
    /* 0 */ val NONE: typings.phaser.Phaser.Physics.Impact.TYPE.NONE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.phaser.Phaser.Physics.Impact.TYPE with Double] = js.native
  }
  
}


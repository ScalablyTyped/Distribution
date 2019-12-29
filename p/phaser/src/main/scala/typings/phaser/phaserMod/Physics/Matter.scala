package typings.phaser.phaserMod.Physics

import typings.phaser.MatterJS.Body
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Tilemaps.Tile
import typings.phaser.Phaser.Types.Physics.Matter.MatterTileOptions
import typings.phaser.Phaser.Types.Physics.Matter.MatterWorldConfig
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Physics.Matter")
@js.native
object Matter extends js.Object {
  /**
    * The Matter Factory can create different types of bodies and them to a physics world.
    */
  @js.native
  class Factory protected ()
    extends typings.phaser.Phaser.Physics.Matter.Factory {
    /**
      * 
      * @param world The Matter World which this Factory adds to.
      */
    def this(world: typings.phaser.Phaser.Physics.Matter.World) = this()
  }
  
  /**
    * A Matter Physics Image Game Object.
    * 
    * An Image is a light-weight Game Object useful for the display of static images in your game,
    * such as logos, backgrounds, scenery or other non-animated elements. Images can have input
    * events and physics bodies, or be tweened, tinted or scrolled. The main difference between an
    * Image and a Sprite is that you cannot animate an Image as they do not have the Animation component.
    */
  @js.native
  class Image protected ()
    extends typings.phaser.Phaser.Physics.Matter.Image {
    /**
      * 
      * @param world [description]
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      * @param options Matter.js configuration object. Default {}.
      */
    def this(world: typings.phaser.Phaser.Physics.Matter.World, x: Double, y: Double, texture: String) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: String
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: integer
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: String,
      options: js.Object
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: integer,
      options: js.Object
    ) = this()
  }
  
  /**
    * [description]
    */
  @js.native
  class MatterPhysics protected ()
    extends typings.phaser.Phaser.Physics.Matter.MatterPhysics {
    /**
      * 
      * @param scene [description]
      */
    def this(scene: Scene) = this()
  }
  
  /**
    * A Pointer Constraint is a special type of constraint that allows you to click
    * and drag bodies in a Matter World. It monitors the active Pointers in a Scene,
    * and when one is pressed down it checks to see if that hit any part of any active
    * body in the world. If it did, and the body has input enabled, it will begin to
    * drag it until either released, or you stop it via the `stopDrag` method.
    * 
    * You can adjust the stiffness, length and other properties of the constraint via
    * the `options` object on creation.
    */
  @js.native
  class PointerConstraint protected ()
    extends typings.phaser.Phaser.Physics.Matter.PointerConstraint {
    /**
      * 
      * @param scene A reference to the Scene to which this Pointer Constraint belongs.
      * @param world A reference to the Matter World instance to which this Constraint belongs.
      * @param options A Constraint configuration object.
      */
    def this(scene: Scene, world: typings.phaser.Phaser.Physics.Matter.World) = this()
    def this(scene: Scene, world: typings.phaser.Phaser.Physics.Matter.World, options: js.Object) = this()
  }
  
  /**
    * A Matter Physics Sprite Game Object.
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
  class Sprite protected ()
    extends typings.phaser.Phaser.Physics.Matter.Sprite {
    /**
      * 
      * @param world [description]
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      * @param options Matter.js configuration object. Default {}.
      */
    def this(world: typings.phaser.Phaser.Physics.Matter.World, x: Double, y: Double, texture: String) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: String
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: integer
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: String,
      options: js.Object
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: integer,
      options: js.Object
    ) = this()
  }
  
  /**
    * A wrapper around a Tile that provides access to a corresponding Matter body. A tile can only
    * have one Matter body associated with it. You can either pass in an existing Matter body for
    * the tile or allow the constructor to create the corresponding body for you. If the Tile has a
    * collision group (defined in Tiled), those shapes will be used to create the body. If not, the
    * tile's rectangle bounding box will be used.
    * 
    * The corresponding body will be accessible on the Tile itself via Tile.physics.matterBody.
    * 
    * Note: not all Tiled collision shapes are supported. See
    * Phaser.Physics.Matter.TileBody#setFromTileCollision for more information.
    */
  @js.native
  class TileBody protected ()
    extends typings.phaser.Phaser.Physics.Matter.TileBody {
    /**
      * 
      * @param world [description]
      * @param tile The target tile that should have a Matter body.
      * @param options Options to be used when creating the Matter body.
      */
    def this(world: typings.phaser.Phaser.Physics.Matter.World, tile: Tile) = this()
    def this(world: typings.phaser.Phaser.Physics.Matter.World, tile: Tile, options: MatterTileOptions) = this()
  }
  
  /**
    * [description]
    */
  @js.native
  class World protected ()
    extends typings.phaser.Phaser.Physics.Matter.World {
    /**
      * 
      * @param scene The Scene to which this Matter World instance belongs.
      * @param config The Matter World configuration object.
      */
    def this(scene: Scene, config: MatterWorldConfig) = this()
  }
  
  /**
    * [description]
    * @param world The Matter world to add the body to.
    * @param gameObject The Game Object that will have the Matter body applied to it.
    * @param options A Matter Body configuration object, or an instance of a Matter Body.
    */
  def MatterGameObject(world: typings.phaser.Phaser.Physics.Matter.World, gameObject: GameObject, options: js.Object): GameObject = js.native
  def MatterGameObject(world: typings.phaser.Phaser.Physics.Matter.World, gameObject: GameObject, options: Body): GameObject = js.native
  @js.native
  object Events extends js.Object {
    /**
      * The Matter Physics After Update Event.
      * 
      * This event is dispatched by a Matter Physics World instance after the engine has updated and all collision events have resolved.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('afterupdate', listener)`.
      */
    val AFTER_UPDATE: js.Any = js.native
    /**
      * The Matter Physics Before Update Event.
      * 
      * This event is dispatched by a Matter Physics World instance right before all the collision processing takes place.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('beforeupdate', listener)`.
      */
    val BEFORE_UPDATE: js.Any = js.native
    /**
      * The Matter Physics Collision Active Event.
      * 
      * This event is dispatched by a Matter Physics World instance after the engine has updated.
      * It provides a list of all pairs that are colliding in the current tick (if any).
      * 
      * Listen to it from a Scene using: `this.matter.world.on('collisionactive', listener)`.
      */
    val COLLISION_ACTIVE: js.Any = js.native
    /**
      * The Matter Physics Collision End Event.
      * 
      * This event is dispatched by a Matter Physics World instance after the engine has updated.
      * It provides a list of all pairs that have finished colliding in the current tick (if any).
      * 
      * Listen to it from a Scene using: `this.matter.world.on('collisionend', listener)`.
      */
    val COLLISION_END: js.Any = js.native
    /**
      * The Matter Physics Collision Start Event.
      * 
      * This event is dispatched by a Matter Physics World instance after the engine has updated.
      * It provides a list of all pairs that have started to collide in the current tick (if any).
      * 
      * Listen to it from a Scene using: `this.matter.world.on('collisionstart', listener)`.
      */
    val COLLISION_START: js.Any = js.native
    /**
      * The Matter Physics Drag Event.
      * 
      * This event is dispatched by a Matter Physics World instance when a Pointer Constraint
      * is actively dragging a body. It is emitted each time the pointer moves.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('drag', listener)`.
      */
    val DRAG: js.Any = js.native
    /**
      * The Matter Physics Drag End Event.
      * 
      * This event is dispatched by a Matter Physics World instance when a Pointer Constraint
      * stops dragging a body.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('dragend', listener)`.
      */
    val DRAG_END: js.Any = js.native
    /**
      * The Matter Physics Drag Start Event.
      * 
      * This event is dispatched by a Matter Physics World instance when a Pointer Constraint
      * starts dragging a body.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('dragstart', listener)`.
      */
    val DRAG_START: js.Any = js.native
    /**
      * The Matter Physics World Pause Event.
      * 
      * This event is dispatched by an Matter Physics World instance when it is paused.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('pause', listener)`.
      */
    val PAUSE: js.Any = js.native
    /**
      * The Matter Physics World Resume Event.
      * 
      * This event is dispatched by an Matter Physics World instance when it resumes from a paused state.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('resume', listener)`.
      */
    val RESUME: js.Any = js.native
    /**
      * The Matter Physics Sleep End Event.
      * 
      * This event is dispatched by a Matter Physics World instance when a Body stop sleeping.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('sleepend', listener)`.
      */
    val SLEEP_END: js.Any = js.native
    /**
      * The Matter Physics Sleep Start Event.
      * 
      * This event is dispatched by a Matter Physics World instance when a Body goes to sleep.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('sleepstart', listener)`.
      */
    val SLEEP_START: js.Any = js.native
  }
  
  /**
    * Use PhysicsEditorParser.parseBody() to build a Matter body object, based on a physics data file
    * created and exported with PhysicsEditor (https://www.codeandweb.com/physicseditor).
    */
  @js.native
  object PhysicsEditorParser extends js.Object {
    /**
      * Parses a body element exported by PhysicsEditor.
      * @param x x position.
      * @param y y position.
      * @param w width.
      * @param h height.
      * @param config body configuration and fixture (child body) definitions.
      */
    def parseBody(x: Double, y: Double, w: Double, h: Double, config: js.Object): js.Object = js.native
    /**
      * Parses an element of the "fixtures" list exported by PhysicsEditor
      * @param fixtureConfig the fixture object to parse
      */
    def parseFixture(fixtureConfig: js.Object): js.Array[js.Object] = js.native
    /**
      * Parses the "vertices" lists exported by PhysicsEditor.
      * @param vertexSets The vertex lists to parse.
      * @param options Matter body options.
      */
    def parseVertices(vertexSets: js.Object, options: js.Object): js.Array[js.Object] = js.native
  }
  
}


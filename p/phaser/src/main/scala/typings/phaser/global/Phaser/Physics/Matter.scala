package typings.phaser.global.Phaser.Physics

import typings.phaser.MatterJS.Body
import typings.phaser.MatterJS.BodyType
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.Phaser.Tilemaps.Tile
import typings.phaser.Phaser.Types.Physics.Matter.MatterBodyConfig
import typings.phaser.Phaser.Types.Physics.Matter.MatterTileOptions
import typings.phaser.Phaser.Types.Physics.Matter.MatterWorldConfig
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Physics.Matter")
@js.native
object Matter extends js.Object {
  /**
    * The Body Bounds class contains methods to help you extract the world coordinates from various points around
    * the bounds of a Matter Body. Because Matter bodies are positioned based on their center of mass, and not a
    * dimension based center, you often need to get the bounds coordinates in order to properly align them in the world.
    * 
    * You can access this class via the MatterPhysics class from a Scene, i.e.:
    * 
    * ```javascript
    * this.matter.bodyBounds.getTopLeft(body);
    * ```
    * 
    * See also the `MatterPhysics.alignBody` method.
    */
  @js.native
  class BodyBounds ()
    extends typings.phaser.Phaser.Physics.Matter.BodyBounds
  
  /**
    * The Matter Factory is responsible for quickly creating a variety of different types of
    * bodies, constraints and Game Objects and adding them into the physics world.
    * 
    * You access the factory from within a Scene using `add`:
    * 
    * ```javascript
    * this.matter.add.rectangle(x, y, width, height);
    * ```
    * 
    * Use of the Factory is optional. All of the objects it creates can also be created
    * directly via your own code or constructors. It is provided as a means to keep your
    * code concise.
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
      * @param world A reference to the Matter.World instance that this body belongs to.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      * @param options An optional Body configuration object that is used to set initial Body properties on creation.
      */
    def this(world: typings.phaser.Phaser.Physics.Matter.World, x: Double, y: Double, texture: String) = this()
    def this(world: typings.phaser.Phaser.Physics.Matter.World, x: Double, y: Double, texture: Texture) = this()
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
      texture: Texture,
      frame: String
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: Texture,
      frame: integer
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: js.UndefOr[scala.Nothing],
      options: MatterBodyConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: String,
      options: MatterBodyConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: integer,
      options: MatterBodyConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: Texture,
      frame: js.UndefOr[scala.Nothing],
      options: MatterBodyConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: Texture,
      frame: String,
      options: MatterBodyConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: Texture,
      frame: integer,
      options: MatterBodyConfig
    ) = this()
  }
  
  /**
    * The Phaser Matter plugin provides the ability to use the Matter JS Physics Engine within your Phaser games.
    * 
    * Unlike Arcade Physics, the other physics system provided with Phaser, Matter JS is a full-body physics system.
    * It features:
    * 
    * * Rigid bodies
    * * Compound bodies
    * * Composite bodies
    * * Concave and convex hulls
    * * Physical properties (mass, area, density etc.)
    * * Restitution (elastic and inelastic collisions)
    * * Collisions (broad-phase, mid-phase and narrow-phase)
    * * Stable stacking and resting
    * * Conservation of momentum
    * * Friction and resistance
    * * Constraints
    * * Gravity
    * * Sleeping and static bodies
    * * Rounded corners (chamfering)
    * * Views (translate, zoom)
    * * Collision queries (raycasting, region tests)
    * * Time scaling (slow-mo, speed-up)
    * 
    * Configuration of Matter is handled via the Matter World Config object, which can be passed in either the
    * Phaser Game Config, or Phaser Scene Config. Here is a basic example:
    * 
    * ```js
    * physics: {
    *     default: 'matter',
    *     matter: {
    *         enableSleeping: true,
    *         gravity: {
    *             y: 0
    *         },
    *         debug: {
    *             showBody: true,
    *             showStaticBody: true
    *         }
    *     }
    * }
    * ```
    * 
    * This class acts as an interface between a Phaser Scene and a single instance of the Matter Engine.
    * 
    * Use it to access the most common Matter features and helper functions.
    * 
    * You can find details, documentation and examples on the Matter JS website: https://brm.io/matter-js/
    */
  @js.native
  class MatterPhysics protected ()
    extends typings.phaser.Phaser.Physics.Matter.MatterPhysics {
    /**
      * 
      * @param scene The Phaser Scene that owns this Matter Physics instance.
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
      * @param world A reference to the Matter.World instance that this body belongs to.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      * @param options An optional Body configuration object that is used to set initial Body properties on creation.
      */
    def this(world: typings.phaser.Phaser.Physics.Matter.World, x: Double, y: Double, texture: String) = this()
    def this(world: typings.phaser.Phaser.Physics.Matter.World, x: Double, y: Double, texture: Texture) = this()
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
      texture: Texture,
      frame: String
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: Texture,
      frame: integer
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: js.UndefOr[scala.Nothing],
      options: MatterBodyConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: String,
      options: MatterBodyConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: integer,
      options: MatterBodyConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: Texture,
      frame: js.UndefOr[scala.Nothing],
      options: MatterBodyConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: Texture,
      frame: String,
      options: MatterBodyConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: Texture,
      frame: integer,
      options: MatterBodyConfig
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
      * @param world The Matter world instance this body belongs to.
      * @param tile The target tile that should have a Matter body.
      * @param options Options to be used when creating the Matter body.
      */
    def this(world: typings.phaser.Phaser.Physics.Matter.World, tile: Tile) = this()
    def this(world: typings.phaser.Phaser.Physics.Matter.World, tile: Tile, options: MatterTileOptions) = this()
  }
  
  /**
    * The Matter World class is responsible for managing one single instance of a Matter Physics World for Phaser.
    * 
    * Access this via `this.matter.world` from within a Scene.
    * 
    * This class creates a Matter JS World Composite along with the Matter JS Engine during instantiation. It also
    * handles delta timing, bounds, body and constraint creation and debug drawing.
    * 
    * If you wish to access the Matter JS World object directly, see the `localWorld` property.
    * If you wish to access the Matter Engine directly, see the `engine` property.
    * 
    * This class is an Event Emitter and will proxy _all_ Matter JS events, as they are received.
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
    * A Matter Game Object is a generic object that allows you to combine any Phaser Game Object,
    * including those you have extended or created yourself, with all of the Matter Components.
    * 
    * This enables you to use component methods such as `setVelocity` or `isSensor` directly from
    * this Game Object.
    * @param world The Matter world to add the body to.
    * @param gameObject The Game Object that will have the Matter body applied to it.
    * @param options A Matter Body configuration object, or an instance of a Matter Body.
    * @param addToWorld Should the newly created body be immediately added to the World? Default true.
    */
  def MatterGameObject(world: typings.phaser.Phaser.Physics.Matter.World, gameObject: GameObject): GameObject = js.native
  def MatterGameObject(
    world: typings.phaser.Phaser.Physics.Matter.World,
    gameObject: GameObject,
    options: js.UndefOr[scala.Nothing],
    addToWorld: Boolean
  ): GameObject = js.native
  def MatterGameObject(world: typings.phaser.Phaser.Physics.Matter.World, gameObject: GameObject, options: Body): GameObject = js.native
  def MatterGameObject(
    world: typings.phaser.Phaser.Physics.Matter.World,
    gameObject: GameObject,
    options: Body,
    addToWorld: Boolean
  ): GameObject = js.native
  def MatterGameObject(
    world: typings.phaser.Phaser.Physics.Matter.World,
    gameObject: GameObject,
    options: MatterBodyConfig
  ): GameObject = js.native
  def MatterGameObject(
    world: typings.phaser.Phaser.Physics.Matter.World,
    gameObject: GameObject,
    options: MatterBodyConfig,
    addToWorld: Boolean
  ): GameObject = js.native
  @js.native
  object Events extends js.Object {
    /**
      * The Matter Physics After Add Event.
      * 
      * This event is dispatched by a Matter Physics World instance at the end of the process when a new Body
      * or Constraint has just been added to the world.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('afteradd', listener)`.
      */
    val AFTER_ADD: js.Any = js.native
    /**
      * The Matter Physics After Remove Event.
      * 
      * This event is dispatched by a Matter Physics World instance at the end of the process when a 
      * Body or Constraint was removed from the world.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('afterremove', listener)`.
      */
    val AFTER_REMOVE: js.Any = js.native
    /**
      * The Matter Physics After Update Event.
      * 
      * This event is dispatched by a Matter Physics World instance after the engine has updated and all collision events have resolved.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('afterupdate', listener)`.
      */
    val AFTER_UPDATE: js.Any = js.native
    /**
      * The Matter Physics Before Add Event.
      * 
      * This event is dispatched by a Matter Physics World instance at the start of the process when a new Body
      * or Constraint is being added to the world.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('beforeadd', listener)`.
      */
    val BEFORE_ADD: js.Any = js.native
    /**
      * The Matter Physics Before Remove Event.
      * 
      * This event is dispatched by a Matter Physics World instance at the start of the process when a 
      * Body or Constraint is being removed from the world.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('beforeremove', listener)`.
      */
    val BEFORE_REMOVE: js.Any = js.native
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
      * @param x The horizontal world location of the body.
      * @param y The vertical world location of the body.
      * @param config The body configuration and fixture (child body) definitions, as exported by PhysicsEditor.
      * @param options An optional Body configuration object that is used to set initial Body properties on creation.
      */
    def parseBody(x: Double, y: Double, config: js.Object): BodyType = js.native
    def parseBody(x: Double, y: Double, config: js.Object, options: MatterBodyConfig): BodyType = js.native
    /**
      * Parses an element of the "fixtures" list exported by PhysicsEditor
      * @param fixtureConfig The fixture object to parse.
      */
    def parseFixture(fixtureConfig: js.Object): js.Array[BodyType] = js.native
    /**
      * Parses the "vertices" lists exported by PhysicsEditor.
      * @param vertexSets The vertex lists to parse.
      * @param options An optional Body configuration object that is used to set initial Body properties on creation.
      */
    def parseVertices(vertexSets: js.Array[_]): js.Array[BodyType] = js.native
    def parseVertices(vertexSets: js.Array[_], options: MatterBodyConfig): js.Array[BodyType] = js.native
  }
  
  /**
    * Creates a body using the supplied physics data, as provided by a JSON file.
    * 
    * The data file should be loaded as JSON:
    * 
    * ```javascript
    * preload ()
    * {
    *   this.load.json('ninjas', 'assets/ninjas.json);
    * }
    * 
    * create ()
    * {
    *   const ninjaShapes = this.cache.json.get('ninjas');
    * 
    *   this.matter.add.fromJSON(400, 300, ninjaShapes.shinobi);
    * }
    * ```
    * 
    * Do not pass the entire JSON file to this method, but instead pass one of the shapes contained within it.
    * 
    * If you pas in an `options` object, any settings in there will override those in the config object.
    * 
    * The structure of the JSON file is as follows:
    * 
    * ```text
    * {
    *   'generator_info': // The name of the application that created the JSON data
    *   'shapeName': {
    *     'type': // The type of body
    *     'label': // Optional body label
    *     'vertices': // An array, or an array of arrays, containing the vertex data in x/y object pairs
    *   }
    * }
    * ```
    * 
    * At the time of writing, only the Phaser Physics Tracer App exports in this format.
    */
  @js.native
  object PhysicsJSONParser extends js.Object {
    /**
      * Parses a body element from the given JSON data.
      * @param x The horizontal world location of the body.
      * @param y The vertical world location of the body.
      * @param config The body configuration data.
      * @param options An optional Body configuration object that is used to set initial Body properties on creation.
      */
    def parseBody(x: Double, y: Double, config: js.Object): BodyType = js.native
    def parseBody(x: Double, y: Double, config: js.Object, options: MatterBodyConfig): BodyType = js.native
  }
  
}


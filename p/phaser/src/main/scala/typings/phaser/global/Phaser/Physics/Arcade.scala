package typings.phaser.global.Phaser.Physics

import typings.phaser.ArcadePhysicsCallback
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer
import typings.phaser.Phaser.Tilemaps.StaticTilemapLayer
import typings.phaser.Phaser.Tilemaps.Tile
import typings.phaser.Phaser.Types.GameObjects.Group.GroupConfig
import typings.phaser.Phaser.Types.GameObjects.Group.GroupCreateConfig
import typings.phaser.Phaser.Types.Physics.Arcade.ArcadeColliderType
import typings.phaser.Phaser.Types.Physics.Arcade.ArcadeWorldConfig
import typings.phaser.Phaser.Types.Physics.Arcade.PhysicsGroupConfig
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Phaser.Physics.Arcade")
@js.native
object Arcade extends js.Object {
  
  /**
    * Dynamic Body.
    */
  var DYNAMIC_BODY: Double = js.native
  
  /**
    * Facing down.
    */
  var FACING_DOWN: Double = js.native
  
  /**
    * Facing left.
    */
  var FACING_LEFT: Double = js.native
  
  /**
    * Facing no direction (initial value).
    */
  var FACING_NONE: Double = js.native
  
  /**
    * Facing right.
    */
  var FACING_RIGHT: Double = js.native
  
  /**
    * Facing up.
    */
  var FACING_UP: Double = js.native
  
  /**
    * Arcade Physics Group containing Dynamic Bodies.
    */
  @JSName("GROUP")
  var GROUP_ : Double = js.native
  
  /**
    * Calculates and returns the horizontal overlap between two arcade physics bodies and sets their properties
    * accordingly, including: `touching.left`, `touching.right`, `touching.none` and `overlapX'.
    * @param body1 The first Body to separate.
    * @param body2 The second Body to separate.
    * @param overlapOnly Is this an overlap only check, or part of separation?
    * @param bias A value added to the delta values during collision checks. Increase it to prevent sprite tunneling(sprites passing through another instead of colliding).
    */
  def GetOverlapX(
    body1: typings.phaser.Phaser.Physics.Arcade.Body,
    body2: typings.phaser.Phaser.Physics.Arcade.Body,
    overlapOnly: Boolean,
    bias: Double
  ): Double = js.native
  
  /**
    * Calculates and returns the vertical overlap between two arcade physics bodies and sets their properties
    * accordingly, including: `touching.up`, `touching.down`, `touching.none` and `overlapY'.
    * @param body1 The first Body to separate.
    * @param body2 The second Body to separate.
    * @param overlapOnly Is this an overlap only check, or part of separation?
    * @param bias A value added to the delta values during collision checks. Increase it to prevent sprite tunneling(sprites passing through another instead of colliding).
    */
  def GetOverlapY(
    body1: typings.phaser.Phaser.Physics.Arcade.Body,
    body2: typings.phaser.Phaser.Physics.Arcade.Body,
    overlapOnly: Boolean,
    bias: Double
  ): Double = js.native
  
  /**
    * Static Body.
    */
  var STATIC_BODY: Double = js.native
  
  /**
    * Separates two overlapping bodies on the X-axis (horizontally).
    * 
    * Separation involves moving two overlapping bodies so they don't overlap anymore and adjusting their velocities based on their mass. This is a core part of collision detection.
    * 
    * The bodies won't be separated if there is no horizontal overlap between them, if they are static, or if either one uses custom logic for its separation.
    * @param body1 The first Body to separate.
    * @param body2 The second Body to separate.
    * @param overlapOnly If `true`, the bodies will only have their overlap data set and no separation will take place.
    * @param bias A value to add to the delta value during overlap checking. Used to prevent sprite tunneling.
    */
  def SeparateX(
    body1: typings.phaser.Phaser.Physics.Arcade.Body,
    body2: typings.phaser.Phaser.Physics.Arcade.Body,
    overlapOnly: Boolean,
    bias: Double
  ): Boolean = js.native
  
  /**
    * Separates two overlapping bodies on the Y-axis (vertically).
    * 
    * Separation involves moving two overlapping bodies so they don't overlap anymore and adjusting their velocities based on their mass. This is a core part of collision detection.
    * 
    * The bodies won't be separated if there is no vertical overlap between them, if they are static, or if either one uses custom logic for its separation.
    * @param body1 The first Body to separate.
    * @param body2 The second Body to separate.
    * @param overlapOnly If `true`, the bodies will only have their overlap data set and no separation will take place.
    * @param bias A value to add to the delta value during overlap checking. Used to prevent sprite tunneling.
    */
  def SeparateY(
    body1: typings.phaser.Phaser.Physics.Arcade.Body,
    body2: typings.phaser.Phaser.Physics.Arcade.Body,
    overlapOnly: Boolean,
    bias: Double
  ): Boolean = js.native
  
  /**
    * A Tilemap Layer.
    */
  var TILEMAPLAYER: Double = js.native
  
  /**
    * The Arcade Physics Plugin belongs to a Scene and sets up and manages the Scene's physics simulation.
    * It also holds some useful methods for moving and rotating Arcade Physics Bodies.
    * 
    * You can access it from within a Scene using `this.physics`.
    * 
    * Arcade Physics uses the Projection Method of collision resolution and separation. While it's fast and suitable
    * for 'arcade' style games it lacks stability when multiple objects are in close proximity or resting upon each other.
    * The separation that stops two objects penetrating may create a new penetration against a different object. If you
    * require a high level of stability please consider using an alternative physics system, such as Matter.js.
    */
  @js.native
  class ArcadePhysics protected ()
    extends typings.phaser.Phaser.Physics.Arcade.ArcadePhysics {
    /**
      * 
      * @param scene The Scene that this Plugin belongs to.
      */
    def this(scene: Scene) = this()
  }
  
  /**
    * A Dynamic Arcade Body.
    * 
    * Its static counterpart is {@link Phaser.Physics.Arcade.StaticBody}.
    */
  @js.native
  class Body protected ()
    extends typings.phaser.Phaser.Physics.Arcade.Body {
    /**
      * 
      * @param world The Arcade Physics simulation this Body belongs to.
      * @param gameObject The Game Object this Body belongs to.
      */
    def this(world: typings.phaser.Phaser.Physics.Arcade.World, gameObject: GameObject) = this()
  }
  
  /**
    * An Arcade Physics Collider will automatically check for collision, or overlaps, between two objects
    * every step. If a collision, or overlap, occurs it will invoke the given callbacks.
    */
  @js.native
  class Collider protected ()
    extends typings.phaser.Phaser.Physics.Arcade.Collider {
    /**
      * 
      * @param world The Arcade physics World that will manage the collisions.
      * @param overlapOnly Whether to check for collisions or overlap.
      * @param object1 The first object to check for collision.
      * @param object2 The second object to check for collision.
      * @param collideCallback The callback to invoke when the two objects collide.
      * @param processCallback The callback to invoke when the two objects collide. Must return a boolean.
      * @param callbackContext The scope in which to call the callbacks.
      */
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      overlapOnly: Boolean,
      object1: ArcadeColliderType,
      object2: ArcadeColliderType,
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ) = this()
  }
  
  @js.native
  object Events extends js.Object {
    
    /**
      * The Arcade Physics World Collide Event.
      * 
      * This event is dispatched by an Arcade Physics World instance if two bodies collide _and_ at least
      * one of them has their [onCollide]{@link Phaser.Physics.Arcade.Body#onCollide} property set to `true`.
      * 
      * It provides an alternative means to handling collide events rather than using the callback approach.
      * 
      * Listen to it from a Scene using: `this.physics.world.on('collide', listener)`.
      * 
      * Please note that 'collide' and 'overlap' are two different things in Arcade Physics.
      */
    val COLLIDE: js.Any = js.native
    
    /**
      * The Arcade Physics World Overlap Event.
      * 
      * This event is dispatched by an Arcade Physics World instance if two bodies overlap _and_ at least
      * one of them has their [onOverlap]{@link Phaser.Physics.Arcade.Body#onOverlap} property set to `true`.
      * 
      * It provides an alternative means to handling overlap events rather than using the callback approach.
      * 
      * Listen to it from a Scene using: `this.physics.world.on('overlap', listener)`.
      * 
      * Please note that 'collide' and 'overlap' are two different things in Arcade Physics.
      */
    val OVERLAP: js.Any = js.native
    
    /**
      * The Arcade Physics World Pause Event.
      * 
      * This event is dispatched by an Arcade Physics World instance when it is paused.
      * 
      * Listen to it from a Scene using: `this.physics.world.on('pause', listener)`.
      */
    val PAUSE: js.Any = js.native
    
    /**
      * The Arcade Physics World Resume Event.
      * 
      * This event is dispatched by an Arcade Physics World instance when it resumes from a paused state.
      * 
      * Listen to it from a Scene using: `this.physics.world.on('resume', listener)`.
      */
    val RESUME: js.Any = js.native
    
    /**
      * The Arcade Physics Tile Collide Event.
      * 
      * This event is dispatched by an Arcade Physics World instance if a body collides with a Tile _and_
      * has its [onCollide]{@link Phaser.Physics.Arcade.Body#onCollide} property set to `true`.
      * 
      * It provides an alternative means to handling collide events rather than using the callback approach.
      * 
      * Listen to it from a Scene using: `this.physics.world.on('tilecollide', listener)`.
      * 
      * Please note that 'collide' and 'overlap' are two different things in Arcade Physics.
      */
    val TILE_COLLIDE: js.Any = js.native
    
    /**
      * The Arcade Physics Tile Overlap Event.
      * 
      * This event is dispatched by an Arcade Physics World instance if a body overlaps with a Tile _and_
      * has its [onOverlap]{@link Phaser.Physics.Arcade.Body#onOverlap} property set to `true`.
      * 
      * It provides an alternative means to handling overlap events rather than using the callback approach.
      * 
      * Listen to it from a Scene using: `this.physics.world.on('tileoverlap', listener)`.
      * 
      * Please note that 'collide' and 'overlap' are two different things in Arcade Physics.
      */
    val TILE_OVERLAP: js.Any = js.native
    
    /**
      * The Arcade Physics World Bounds Event.
      * 
      * This event is dispatched by an Arcade Physics World instance if a body makes contact with the world bounds _and_
      * it has its [onWorldBounds]{@link Phaser.Physics.Arcade.Body#onWorldBounds} property set to `true`.
      * 
      * It provides an alternative means to handling collide events rather than using the callback approach.
      * 
      * Listen to it from a Scene using: `this.physics.world.on('worldbounds', listener)`.
      */
    val WORLD_BOUNDS: js.Any = js.native
    
    /**
      * The Arcade Physics World Step Event.
      * 
      * This event is dispatched by an Arcade Physics World instance whenever a physics step is run.
      * It is emitted _after_ the bodies and colliders have been updated.
      * 
      * In high framerate settings this can be multiple times per game frame.
      * 
      * Listen to it from a Scene using: `this.physics.world.on('worldstep', listener)`.
      */
    val WORLD_STEP: js.Any = js.native
  }
  
  /**
    * The Arcade Physics Factory allows you to easily create Arcade Physics enabled Game Objects.
    * Objects that are created by this Factory are automatically added to the physics world.
    */
  @js.native
  class Factory protected ()
    extends typings.phaser.Phaser.Physics.Arcade.Factory {
    /**
      * 
      * @param world The Arcade Physics World instance.
      */
    def this(world: typings.phaser.Phaser.Physics.Arcade.World) = this()
  }
  
  /**
    * An Arcade Physics Group object.
    * 
    * All Game Objects created by or added to this Group will automatically be given dynamic Arcade Physics bodies, if they have no body.
    * 
    * Its static counterpart is {@link Phaser.Physics.Arcade.StaticGroup}.
    */
  @js.native
  class Group protected ()
    extends typings.phaser.Phaser.Physics.Arcade.Group {
    /**
      * 
      * @param world The physics simulation.
      * @param scene The scene this group belongs to.
      * @param children Game Objects to add to this group; or the `config` argument.
      * @param config Settings for this group.
      */
    def this(world: typings.phaser.Phaser.Physics.Arcade.World, scene: Scene) = this()
    def this(world: typings.phaser.Phaser.Physics.Arcade.World, scene: Scene, children: js.Array[GameObject]) = this()
    def this(world: typings.phaser.Phaser.Physics.Arcade.World, scene: Scene, children: GroupCreateConfig) = this()
    def this(world: typings.phaser.Phaser.Physics.Arcade.World, scene: Scene, children: PhysicsGroupConfig) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: js.UndefOr[scala.Nothing],
      config: GroupCreateConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: js.UndefOr[scala.Nothing],
      config: PhysicsGroupConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: js.Array[GameObject],
      config: GroupCreateConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: js.Array[GameObject],
      config: PhysicsGroupConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: GroupCreateConfig,
      config: GroupCreateConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: GroupCreateConfig,
      config: PhysicsGroupConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: PhysicsGroupConfig,
      config: GroupCreateConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: PhysicsGroupConfig,
      config: PhysicsGroupConfig
    ) = this()
  }
  
  /**
    * An Arcade Physics Image is an Image with an Arcade Physics body and related components.
    * The body can be dynamic or static.
    * 
    * The main difference between an Arcade Image and an Arcade Sprite is that you cannot animate an Arcade Image.
    */
  @js.native
  class Image protected ()
    extends typings.phaser.Phaser.Physics.Arcade.Image {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      */
    def this(scene: Scene, x: Double, y: Double, texture: String) = this()
    def this(scene: Scene, x: Double, y: Double, texture: Texture) = this()
    def this(scene: Scene, x: Double, y: Double, texture: String, frame: String) = this()
    def this(scene: Scene, x: Double, y: Double, texture: String, frame: integer) = this()
    def this(scene: Scene, x: Double, y: Double, texture: Texture, frame: String) = this()
    def this(scene: Scene, x: Double, y: Double, texture: Texture, frame: integer) = this()
  }
  
  /**
    * An Arcade Physics Sprite is a Sprite with an Arcade Physics body and related components.
    * The body can be dynamic or static.
    * 
    * The main difference between an Arcade Sprite and an Arcade Image is that you cannot animate an Arcade Image.
    * If you do not require animation then you can safely use Arcade Images instead of Arcade Sprites.
    */
  @js.native
  class Sprite protected ()
    extends typings.phaser.Phaser.Physics.Arcade.Sprite {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      */
    def this(scene: Scene, x: Double, y: Double, texture: String) = this()
    def this(scene: Scene, x: Double, y: Double, texture: Texture) = this()
    def this(scene: Scene, x: Double, y: Double, texture: String, frame: String) = this()
    def this(scene: Scene, x: Double, y: Double, texture: String, frame: integer) = this()
    def this(scene: Scene, x: Double, y: Double, texture: Texture, frame: String) = this()
    def this(scene: Scene, x: Double, y: Double, texture: Texture, frame: integer) = this()
  }
  
  /**
    * A Static Arcade Physics Body.
    * 
    * A Static Body never moves, and isn't automatically synchronized with its parent Game Object.
    * That means if you make any change to the parent's origin, position, or scale after creating or adding the body, you'll need to update the Static Body manually.
    * 
    * A Static Body can collide with other Bodies, but is never moved by collisions.
    * 
    * Its dynamic counterpart is {@link Phaser.Physics.Arcade.Body}.
    */
  @js.native
  class StaticBody protected ()
    extends typings.phaser.Phaser.Physics.Arcade.StaticBody {
    /**
      * 
      * @param world The Arcade Physics simulation this Static Body belongs to.
      * @param gameObject The Game Object this Static Body belongs to.
      */
    def this(world: typings.phaser.Phaser.Physics.Arcade.World, gameObject: GameObject) = this()
  }
  
  /**
    * An Arcade Physics Static Group object.
    * 
    * All Game Objects created by or added to this Group will automatically be given static Arcade Physics bodies, if they have no body.
    * 
    * Its dynamic counterpart is {@link Phaser.Physics.Arcade.Group}.
    */
  @js.native
  class StaticGroup protected ()
    extends typings.phaser.Phaser.Physics.Arcade.StaticGroup {
    /**
      * 
      * @param world The physics simulation.
      * @param scene The scene this group belongs to.
      * @param children Game Objects to add to this group; or the `config` argument.
      * @param config Settings for this group.
      */
    def this(world: typings.phaser.Phaser.Physics.Arcade.World, scene: Scene) = this()
    def this(world: typings.phaser.Phaser.Physics.Arcade.World, scene: Scene, children: js.Array[GameObject]) = this()
    def this(world: typings.phaser.Phaser.Physics.Arcade.World, scene: Scene, children: GroupConfig) = this()
    def this(world: typings.phaser.Phaser.Physics.Arcade.World, scene: Scene, children: GroupCreateConfig) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: js.UndefOr[scala.Nothing],
      config: GroupConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: js.UndefOr[scala.Nothing],
      config: GroupCreateConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: js.Array[GameObject],
      config: GroupConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: js.Array[GameObject],
      config: GroupCreateConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: GroupConfig,
      config: GroupConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: GroupConfig,
      config: GroupCreateConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: GroupCreateConfig,
      config: GroupConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Arcade.World,
      scene: Scene,
      children: GroupCreateConfig,
      config: GroupCreateConfig
    ) = this()
  }
  
  @js.native
  object Tilemap extends js.Object {
    
    /**
      * A function to process the collision callbacks between a single tile and an Arcade Physics enabled Game Object.
      * @param tile The Tile to process.
      * @param sprite The Game Object to process with the Tile.
      */
    def ProcessTileCallbacks(tile: Tile, sprite: typings.phaser.Phaser.GameObjects.Sprite): Boolean = js.native
    
    /**
      * Internal function to process the separation of a physics body from a tile.
      * @param body The Body object to separate.
      * @param x The x separation amount.
      */
    def ProcessTileSeparationX(body: typings.phaser.Phaser.Physics.Arcade.Body, x: Double): Unit = js.native
    
    /**
      * Internal function to process the separation of a physics body from a tile.
      * @param body The Body object to separate.
      * @param y The y separation amount.
      */
    def ProcessTileSeparationY(body: typings.phaser.Phaser.Physics.Arcade.Body, y: Double): Unit = js.native
    
    /**
      * The core separation function to separate a physics body and a tile.
      * @param i The index of the tile within the map data.
      * @param body The Body object to separate.
      * @param tile The tile to collide against.
      * @param tileWorldRect A rectangle-like object defining the dimensions of the tile.
      * @param tilemapLayer The tilemapLayer to collide against.
      * @param tileBias The tile bias value. Populated by the `World.TILE_BIAS` constant.
      * @param isLayer Is this check coming from a TilemapLayer or an array of tiles?
      */
    def SeparateTile(
      i: Double,
      body: typings.phaser.Phaser.Physics.Arcade.Body,
      tile: Tile,
      tileWorldRect: Rectangle,
      tilemapLayer: DynamicTilemapLayer,
      tileBias: Double,
      isLayer: Boolean
    ): Boolean = js.native
    def SeparateTile(
      i: Double,
      body: typings.phaser.Phaser.Physics.Arcade.Body,
      tile: Tile,
      tileWorldRect: Rectangle,
      tilemapLayer: StaticTilemapLayer,
      tileBias: Double,
      isLayer: Boolean
    ): Boolean = js.native
    
    /**
      * Check the body against the given tile on the X axis.
      * Used internally by the SeparateTile function.
      * @param body The Body object to separate.
      * @param tile The tile to check.
      * @param tileLeft The left position of the tile within the tile world.
      * @param tileRight The right position of the tile within the tile world.
      * @param tileBias The tile bias value. Populated by the `World.TILE_BIAS` constant.
      * @param isLayer Is this check coming from a TilemapLayer or an array of tiles?
      */
    def TileCheckX(
      body: typings.phaser.Phaser.Physics.Arcade.Body,
      tile: Tile,
      tileLeft: Double,
      tileRight: Double,
      tileBias: Double,
      isLayer: Boolean
    ): Double = js.native
    
    /**
      * Check the body against the given tile on the Y axis.
      * Used internally by the SeparateTile function.
      * @param body The Body object to separate.
      * @param tile The tile to check.
      * @param tileTop The top position of the tile within the tile world.
      * @param tileBottom The bottom position of the tile within the tile world.
      * @param tileBias The tile bias value. Populated by the `World.TILE_BIAS` constant.
      * @param isLayer Is this check coming from a TilemapLayer or an array of tiles?
      */
    def TileCheckY(
      body: typings.phaser.Phaser.Physics.Arcade.Body,
      tile: Tile,
      tileTop: Double,
      tileBottom: Double,
      tileBias: Double,
      isLayer: Boolean
    ): Double = js.native
    
    /**
      * Checks for intersection between the given tile rectangle-like object and an Arcade Physics body.
      * @param tileWorldRect A rectangle object that defines the tile placement in the world.
      * @param body The body to check for intersection against.
      */
    def TileIntersectsBody(tileWorldRect: js.Object, body: typings.phaser.Phaser.Physics.Arcade.Body): Boolean = js.native
  }
  
  /**
    * The Arcade Physics World.
    * 
    * The World is responsible for creating, managing, colliding and updating all of the bodies within it.
    * 
    * An instance of the World belongs to a Phaser.Scene and is accessed via the property `physics.world`.
    */
  @js.native
  class World protected ()
    extends typings.phaser.Phaser.Physics.Arcade.World {
    /**
      * 
      * @param scene The Scene to which this World instance belongs.
      * @param config An Arcade Physics Configuration object.
      */
    def this(scene: Scene, config: ArcadeWorldConfig) = this()
  }
}

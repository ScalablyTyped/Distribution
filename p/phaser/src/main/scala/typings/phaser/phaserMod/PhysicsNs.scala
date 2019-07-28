package typings.phaser.phaserMod

import typings.phaser.ArcadePhysicsCallback
import typings.phaser.MatterJSNs.Body
import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import typings.phaser.PhaserNs.GeomNs.Rectangle
import typings.phaser.PhaserNs.TilemapsNs.DynamicTilemapLayer
import typings.phaser.PhaserNs.TilemapsNs.StaticTilemapLayer
import typings.phaser.PhaserNs.TilemapsNs.Tile
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig
import typings.phaser.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType
import typings.phaser.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeWorldConfig
import typings.phaser.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig
import typings.phaser.PhaserNs.TypesNs.PhysicsNs.ImpactNs.WorldConfig
import typings.phaser.PhaserNs.TypesNs.PhysicsNs.MatterNs.MatterTileOptions
import typings.phaser.PhaserNs.TypesNs.PhysicsNs.MatterNs.MatterWorldConfig
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Physics")
@js.native
object PhysicsNs extends js.Object {
  @JSName("Arcade")
  @js.native
  object ArcadeNs extends js.Object {
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
      extends typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.ArcadePhysics {
      /**
        * 
        * @param scene The Scene that this Plugin belongs to.
        */
      def this(scene: typings.phaser.PhaserNs.Scene) = this()
    }
    
    /**
      * A Dynamic Arcade Body.
      * 
      * Its static counterpart is {@link Phaser.Physics.Arcade.StaticBody}.
      */
    @js.native
    class Body protected ()
      extends typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body {
      /**
        * 
        * @param world The Arcade Physics simulation this Body belongs to.
        * @param gameObject The Game Object this Body belongs to.
        */
      def this(world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World, gameObject: GameObject) = this()
    }
    
    /**
      * An Arcade Physics Collider will automatically check for collision, or overlaps, between two objects
      * every step. If a collision, or overlap, occurs it will invoke the given callbacks.
      */
    @js.native
    class Collider protected ()
      extends typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Collider {
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
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        overlapOnly: Boolean,
        object1: ArcadeColliderType,
        object2: ArcadeColliderType,
        collideCallback: ArcadePhysicsCallback,
        processCallback: ArcadePhysicsCallback,
        callbackContext: js.Any
      ) = this()
    }
    
    /**
      * The Arcade Physics Factory allows you to easily create Arcade Physics enabled Game Objects.
      * Objects that are created by this Factory are automatically added to the physics world.
      */
    @js.native
    class Factory protected ()
      extends typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Factory {
      /**
        * 
        * @param world The Arcade Physics World instance.
        */
      def this(world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World) = this()
    }
    
    /**
      * An Arcade Physics Group object.
      * 
      * All Game Objects created by this Group will automatically be given dynamic Arcade Physics bodies.
      * 
      * Its static counterpart is {@link Phaser.Physics.Arcade.StaticGroup}.
      */
    @js.native
    class Group protected ()
      extends typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Group {
      /**
        * 
        * @param world The physics simulation.
        * @param scene The scene this group belongs to.
        * @param children Game Objects to add to this group; or the `config` argument.
        * @param config Settings for this group.
        */
      def this(world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World, scene: typings.phaser.PhaserNs.Scene) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: js.Array[GameObject]
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: PhysicsGroupConfig
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: js.Array[GameObject],
        config: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: js.Array[GameObject],
        config: PhysicsGroupConfig
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: GroupCreateConfig,
        config: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: GroupCreateConfig,
        config: PhysicsGroupConfig
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: PhysicsGroupConfig,
        config: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
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
      extends typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Image {
      /**
        * 
        * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
        * @param x The horizontal position of this Game Object in the world.
        * @param y The vertical position of this Game Object in the world.
        * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
        * @param frame An optional frame from the Texture this Game Object is rendering with.
        */
      def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String) = this()
      def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String, frame: String) = this()
      def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String, frame: integer) = this()
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
      extends typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Sprite {
      /**
        * 
        * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
        * @param x The horizontal position of this Game Object in the world.
        * @param y The vertical position of this Game Object in the world.
        * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
        * @param frame An optional frame from the Texture this Game Object is rendering with.
        */
      def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String) = this()
      def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String, frame: String) = this()
      def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String, frame: integer) = this()
    }
    
    /**
      * A Static Arcade Physics Body.
      * 
      * A Static Body never moves, and isn't automatically synchronized with its parent Game Object.
      * That means if you make any change to the parent's origin, position, or scale after creating or adding the body, you'll need to update the Body manually.
      * 
      * A Static Body can collide with other Bodies, but is never moved by collisions.
      * 
      * Its dynamic counterpart is {@link Phaser.Physics.Arcade.Body}.
      */
    @js.native
    class StaticBody protected ()
      extends typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.StaticBody {
      /**
        * 
        * @param world The Arcade Physics simulation this Static Body belongs to.
        * @param gameObject The Game Object this Static Body belongs to.
        */
      def this(world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World, gameObject: GameObject) = this()
    }
    
    /**
      * An Arcade Physics Static Group object.
      * 
      * All Game Objects created by this Group will automatically be given static Arcade Physics bodies.
      * 
      * Its dynamic counterpart is {@link Phaser.Physics.Arcade.Group}.
      */
    @js.native
    class StaticGroup protected ()
      extends typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.StaticGroup {
      /**
        * 
        * @param world The physics simulation.
        * @param scene The scene this group belongs to.
        * @param children Game Objects to add to this group; or the `config` argument.
        * @param config Settings for this group.
        */
      def this(world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World, scene: typings.phaser.PhaserNs.Scene) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: js.Array[GameObject]
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: GroupConfig
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: js.Array[GameObject],
        config: GroupConfig
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: js.Array[GameObject],
        config: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: GroupConfig,
        config: GroupConfig
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: GroupConfig,
        config: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: GroupCreateConfig,
        config: GroupConfig
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World,
        scene: typings.phaser.PhaserNs.Scene,
        children: GroupCreateConfig,
        config: GroupCreateConfig
      ) = this()
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
      extends typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.World {
      /**
        * 
        * @param scene The Scene to which this World instance belongs.
        * @param config An Arcade Physics Configuration object.
        */
      def this(scene: typings.phaser.PhaserNs.Scene, config: ArcadeWorldConfig) = this()
    }
    
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
    var GROUP: Double = js.native
    /**
      * Static Body.
      */
    var STATIC_BODY: Double = js.native
    /**
      * A Tilemap Layer.
      */
    var TILEMAPLAYER: Double = js.native
    /**
      * Calculates and returns the horizontal overlap between two arcade physics bodies and sets their properties
      * accordingly, including: `touching.left`, `touching.right`, `touching.none` and `overlapX'.
      * @param body1 The first Body to separate.
      * @param body2 The second Body to separate.
      * @param overlapOnly Is this an overlap only check, or part of separation?
      * @param bias A value added to the delta values during collision checks. Increase it to prevent sprite tunneling(sprites passing through another instead of colliding).
      */
    def GetOverlapX(
      body1: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body,
      body2: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body,
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
      body1: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body,
      body2: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body,
      overlapOnly: Boolean,
      bias: Double
    ): Double = js.native
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
      body1: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body,
      body2: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body,
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
      body1: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body,
      body2: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body,
      overlapOnly: Boolean,
      bias: Double
    ): Boolean = js.native
    @JSName("Events")
    @js.native
    object EventsNs extends js.Object {
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
    
    @JSName("Tilemap")
    @js.native
    object TilemapNs extends js.Object {
      /**
        * A function to process the collision callbacks between a single tile and an Arcade Physics enabled Game Object.
        * @param tile The Tile to process.
        * @param sprite The Game Object to process with the Tile.
        */
      def ProcessTileCallbacks(tile: Tile, sprite: typings.phaser.PhaserNs.GameObjectsNs.Sprite): Boolean = js.native
      /**
        * Internal function to process the separation of a physics body from a tile.
        * @param body The Body object to separate.
        * @param x The x separation amount.
        */
      def ProcessTileSeparationX(body: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body, x: Double): Unit = js.native
      /**
        * Internal function to process the separation of a physics body from a tile.
        * @param body The Body object to separate.
        * @param y The y separation amount.
        */
      def ProcessTileSeparationY(body: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body, y: Double): Unit = js.native
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
        body: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body,
        tile: Tile,
        tileWorldRect: Rectangle,
        tilemapLayer: DynamicTilemapLayer,
        tileBias: Double,
        isLayer: Boolean
      ): Boolean = js.native
      def SeparateTile(
        i: Double,
        body: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body,
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
        body: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body,
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
        body: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body,
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
      def TileIntersectsBody(tileWorldRect: js.Object, body: typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Body): Boolean = js.native
    }
    
  }
  
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
  @JSName("Impact")
  @js.native
  object ImpactNs extends js.Object {
    /**
      * An Impact.js compatible physics body.
      * This re-creates the properties you'd get on an Entity and the math needed to update them.
      */
    @js.native
    class Body protected ()
      extends typings.phaser.PhaserNs.PhysicsNs.ImpactNs.Body {
      /**
        * 
        * @param world [description]
        * @param x [description]
        * @param y [description]
        * @param sx [description] Default 16.
        * @param sy [description] Default 16.
        */
      def this(world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World, x: Double, y: Double) = this()
      def this(world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World, x: Double, y: Double, sx: Double) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World,
        x: Double,
        y: Double,
        sx: Double,
        sy: Double
      ) = this()
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
      extends typings.phaser.PhaserNs.PhysicsNs.ImpactNs.CollisionMap {
      def this(tilesize: integer) = this()
      def this(tilesize: integer, data: js.Array[_]) = this()
    }
    
    /**
      * The Impact Physics Factory allows you to easily create Impact Physics enabled Game Objects.
      * Objects that are created by this Factory are automatically added to the physics world.
      */
    @js.native
    class Factory protected ()
      extends typings.phaser.PhaserNs.PhysicsNs.ImpactNs.Factory {
      /**
        * 
        * @param world A reference to the Impact Physics world.
        */
      def this(world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World) = this()
    }
    
    /**
      * [description]
      */
    @js.native
    class ImpactBody protected ()
      extends typings.phaser.PhaserNs.PhysicsNs.ImpactNs.ImpactBody {
      /**
        * 
        * @param world [description]
        * @param x x - The horizontal position of this physics body in the world.
        * @param y y - The vertical position of this physics body in the world.
        * @param width The width of the physics body in the world.
        * @param height [description]
        */
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World,
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
      extends typings.phaser.PhaserNs.PhysicsNs.ImpactNs.ImpactImage {
      /**
        * 
        * @param world The physics world of the Impact physics system.
        * @param x The horizontal position of this Game Object in the world.
        * @param y The vertical position of this Game Object in the world.
        * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
        * @param frame An optional frame from the Texture this Game Object is rendering with.
        */
      def this(world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World, x: Double, y: Double, texture: String) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World,
        x: Double,
        y: Double,
        texture: String,
        frame: String
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World,
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
      extends typings.phaser.PhaserNs.PhysicsNs.ImpactNs.ImpactPhysics {
      /**
        * 
        * @param scene [description]
        */
      def this(scene: typings.phaser.PhaserNs.Scene) = this()
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
      extends typings.phaser.PhaserNs.PhysicsNs.ImpactNs.ImpactSprite {
      /**
        * 
        * @param world [description]
        * @param x The horizontal position of this Game Object in the world.
        * @param y The vertical position of this Game Object in the world.
        * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
        * @param frame An optional frame from the Texture this Game Object is rendering with.
        */
      def this(world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World, x: Double, y: Double, texture: String) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World,
        x: Double,
        y: Double,
        texture: String,
        frame: String
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World,
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
      extends typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World {
      /**
        * 
        * @param scene The Scene to which this Impact World instance belongs.
        * @param config [description]
        */
      def this(scene: typings.phaser.PhaserNs.Scene, config: WorldConfig) = this()
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
      world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World,
      left: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.Body,
      right: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.Body
    ): Unit = js.native
    def SeparateX(
      world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World,
      left: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.Body,
      right: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.Body,
      weak: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.Body
    ): Unit = js.native
    /**
      * [description]
      * @param world [description]
      * @param top [description]
      * @param bottom [description]
      * @param weak [description]
      */
    def SeparateY(
      world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World,
      top: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.Body,
      bottom: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.Body
    ): Unit = js.native
    def SeparateY(
      world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World,
      top: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.Body,
      bottom: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.Body,
      weak: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.Body
    ): Unit = js.native
    /**
      * Impact Physics Solver
      * @param world The Impact simulation to run the solver in.
      * @param bodyA The first body in the collision.
      * @param bodyB The second body in the collision.
      */
    def Solver(
      world: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.World,
      bodyA: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.Body,
      bodyB: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.Body
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
    def UpdateMotion(body: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.Body, res: js.Object): Unit = js.native
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
      /* 3 */ val ACTIVE: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.COLLIDES.ACTIVE with Double = js.native
      /* 4 */ val FIXED: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.COLLIDES.FIXED with Double = js.native
      /* 1 */ val LITE: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.COLLIDES.LITE with Double = js.native
      /* 0 */ val NEVER: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.COLLIDES.NEVER with Double = js.native
      /* 2 */ val PASSIVE: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.COLLIDES.PASSIVE with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.phaser.PhaserNs.PhysicsNs.ImpactNs.COLLIDES with Double] = js.native
    }
    
    @JSName("Events")
    @js.native
    object EventsNs extends js.Object {
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
      /* 1 */ val A: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.TYPE.A with Double = js.native
      /* 2 */ val B: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.TYPE.B with Double = js.native
      /* 3 */ val BOTH: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.TYPE.BOTH with Double = js.native
      /* 0 */ val NONE: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.TYPE.NONE with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.phaser.PhaserNs.PhysicsNs.ImpactNs.TYPE with Double] = js.native
    }
    
  }
  
  @JSName("Matter")
  @js.native
  object MatterNs extends js.Object {
    /**
      * The Matter Factory can create different types of bodies and them to a physics world.
      */
    @js.native
    class Factory protected ()
      extends typings.phaser.PhaserNs.PhysicsNs.MatterNs.Factory {
      /**
        * 
        * @param world The Matter World which this Factory adds to.
        */
      def this(world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World) = this()
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
      extends typings.phaser.PhaserNs.PhysicsNs.MatterNs.Image {
      /**
        * 
        * @param world [description]
        * @param x The horizontal position of this Game Object in the world.
        * @param y The vertical position of this Game Object in the world.
        * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
        * @param frame An optional frame from the Texture this Game Object is rendering with.
        * @param options Matter.js configuration object. Default {}.
        */
      def this(world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World, x: Double, y: Double, texture: String) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World,
        x: Double,
        y: Double,
        texture: String,
        frame: String
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World,
        x: Double,
        y: Double,
        texture: String,
        frame: integer
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World,
        x: Double,
        y: Double,
        texture: String,
        frame: String,
        options: js.Object
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World,
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
      extends typings.phaser.PhaserNs.PhysicsNs.MatterNs.MatterPhysics {
      /**
        * 
        * @param scene [description]
        */
      def this(scene: typings.phaser.PhaserNs.Scene) = this()
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
      extends typings.phaser.PhaserNs.PhysicsNs.MatterNs.PointerConstraint {
      /**
        * 
        * @param scene A reference to the Scene to which this Pointer Constraint belongs.
        * @param world A reference to the Matter World instance to which this Constraint belongs.
        * @param options A Constraint configuration object.
        */
      def this(scene: typings.phaser.PhaserNs.Scene, world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World) = this()
      def this(
        scene: typings.phaser.PhaserNs.Scene,
        world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World,
        options: js.Object
      ) = this()
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
      extends typings.phaser.PhaserNs.PhysicsNs.MatterNs.Sprite {
      /**
        * 
        * @param world [description]
        * @param x The horizontal position of this Game Object in the world.
        * @param y The vertical position of this Game Object in the world.
        * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
        * @param frame An optional frame from the Texture this Game Object is rendering with.
        * @param options Matter.js configuration object. Default {}.
        */
      def this(world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World, x: Double, y: Double, texture: String) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World,
        x: Double,
        y: Double,
        texture: String,
        frame: String
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World,
        x: Double,
        y: Double,
        texture: String,
        frame: integer
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World,
        x: Double,
        y: Double,
        texture: String,
        frame: String,
        options: js.Object
      ) = this()
      def this(
        world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World,
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
      extends typings.phaser.PhaserNs.PhysicsNs.MatterNs.TileBody {
      /**
        * 
        * @param world [description]
        * @param tile The target tile that should have a Matter body.
        * @param options Options to be used when creating the Matter body.
        */
      def this(world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World, tile: Tile) = this()
      def this(world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World, tile: Tile, options: MatterTileOptions) = this()
    }
    
    /**
      * [description]
      */
    @js.native
    class World protected ()
      extends typings.phaser.PhaserNs.PhysicsNs.MatterNs.World {
      /**
        * 
        * @param scene The Scene to which this Matter World instance belongs.
        * @param config The Matter World configuration object.
        */
      def this(scene: typings.phaser.PhaserNs.Scene, config: MatterWorldConfig) = this()
    }
    
    /**
      * [description]
      * @param world The Matter world to add the body to.
      * @param gameObject The Game Object that will have the Matter body applied to it.
      * @param options A Matter Body configuration object, or an instance of a Matter Body.
      */
    def MatterGameObject(
      world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World,
      gameObject: GameObject,
      options: js.Object
    ): GameObject = js.native
    def MatterGameObject(world: typings.phaser.PhaserNs.PhysicsNs.MatterNs.World, gameObject: GameObject, options: Body): GameObject = js.native
    @JSName("Events")
    @js.native
    object EventsNs extends js.Object {
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
    @JSName("PhysicsEditorParser")
    @js.native
    object PhysicsEditorParserNs extends js.Object {
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
  
}


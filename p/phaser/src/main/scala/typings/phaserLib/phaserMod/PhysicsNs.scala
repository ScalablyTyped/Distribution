package typings
package phaserLib.phaserMod

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
      extends phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ArcadePhysics {
      /**
        * 
        * @param scene The Scene that this Plugin belongs to.
        */
      def this(scene: phaserLib.PhaserNs.Scene) = this()
    }
    
    /**
      * A Dynamic Arcade Body.
      * 
      * Its static counterpart is {@link Phaser.Physics.Arcade.StaticBody}.
      */
    @js.native
    class Body protected ()
      extends phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body {
      /**
        * 
        * @param world The Arcade Physics simulation this Body belongs to.
        * @param gameObject The Game Object this Body belongs to.
        */
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject) = this()
    }
    
    /**
      * An Arcade Physics Collider will automatically check for collision, or overlaps, between two objects
      * every step. If a collision, or overlap, occurs it will invoke the given callbacks.
      */
    @js.native
    class Collider protected ()
      extends phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Collider {
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
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, overlapOnly: scala.Boolean, object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType, object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType, collideCallback: phaserLib.ArcadePhysicsCallback, processCallback: phaserLib.ArcadePhysicsCallback, callbackContext: js.Any) = this()
    }
    
    /**
      * The Arcade Physics Factory allows you to easily create Arcade Physics enabled Game Objects.
      * Objects that are created by this Factory are automatically added to the physics world.
      */
    @js.native
    class Factory protected ()
      extends phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Factory {
      /**
        * 
        * @param world The Arcade Physics World instance.
        */
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World) = this()
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
      extends phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Group {
      /**
        * 
        * @param world The physics simulation.
        * @param scene The scene this group belongs to.
        * @param children Game Objects to add to this group; or the `config` argument.
        * @param config Settings for this group.
        */
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject]) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject], config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject], config: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig, config: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig, config: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig) = this()
    }
    
    /**
      * An Arcade Physics Image is an Image with an Arcade Physics body and related components.
      * The body can be dynamic or static.
      * 
      * The main difference between an Arcade Image and an Arcade Sprite is that you cannot animate an Arcade Image.
      */
    @js.native
    class Image protected ()
      extends phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Image {
      /**
        * 
        * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
        * @param x The horizontal position of this Game Object in the world.
        * @param y The vertical position of this Game Object in the world.
        * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
        * @param frame An optional frame from the Texture this Game Object is rendering with.
        */
      def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String) = this()
      def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String) = this()
      def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer) = this()
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
      extends phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Sprite {
      /**
        * 
        * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
        * @param x The horizontal position of this Game Object in the world.
        * @param y The vertical position of this Game Object in the world.
        * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
        * @param frame An optional frame from the Texture this Game Object is rendering with.
        */
      def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String) = this()
      def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String) = this()
      def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer) = this()
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
      extends phaserLib.PhaserNs.PhysicsNs.ArcadeNs.StaticBody {
      /**
        * 
        * @param world The Arcade Physics simulation this Static Body belongs to.
        * @param gameObject The Game Object this Static Body belongs to.
        */
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject) = this()
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
      extends phaserLib.PhaserNs.PhysicsNs.ArcadeNs.StaticGroup {
      /**
        * 
        * @param world The physics simulation.
        * @param scene The scene this group belongs to.
        * @param children Game Objects to add to this group; or the `config` argument.
        * @param config Settings for this group.
        */
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject]) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject], config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject], config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
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
      extends phaserLib.PhaserNs.PhysicsNs.ArcadeNs.World {
      /**
        * 
        * @param scene The Scene to which this World instance belongs.
        * @param config An Arcade Physics Configuration object.
        */
      def this(scene: phaserLib.PhaserNs.Scene, config: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeWorldConfig) = this()
    }
    
    /**
      * Dynamic Body.
      */
    var DYNAMIC_BODY: scala.Double = js.native
    /**
      * Facing down.
      */
    var FACING_DOWN: scala.Double = js.native
    /**
      * Facing left.
      */
    var FACING_LEFT: scala.Double = js.native
    /**
      * Facing no direction (initial value).
      */
    var FACING_NONE: scala.Double = js.native
    /**
      * Facing right.
      */
    var FACING_RIGHT: scala.Double = js.native
    /**
      * Facing up.
      */
    var FACING_UP: scala.Double = js.native
    /**
      * Arcade Physics Group containing Dynamic Bodies.
      */
    var GROUP: scala.Double = js.native
    /**
      * Static Body.
      */
    var STATIC_BODY: scala.Double = js.native
    /**
      * A Tilemap Layer.
      */
    var TILEMAPLAYER: scala.Double = js.native
    /**
      * Calculates and returns the horizontal overlap between two arcade physics bodies and sets their properties
      * accordingly, including: `touching.left`, `touching.right`, `touching.none` and `overlapX'.
      * @param body1 The first Body to separate.
      * @param body2 The second Body to separate.
      * @param overlapOnly Is this an overlap only check, or part of separation?
      * @param bias A value added to the delta values during collision checks. Increase it to prevent sprite tunneling(sprites passing through another instead of colliding).
      */
    def GetOverlapX(
      body1: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
      body2: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
      overlapOnly: scala.Boolean,
      bias: scala.Double
    ): scala.Double = js.native
    /**
      * Calculates and returns the vertical overlap between two arcade physics bodies and sets their properties
      * accordingly, including: `touching.up`, `touching.down`, `touching.none` and `overlapY'.
      * @param body1 The first Body to separate.
      * @param body2 The second Body to separate.
      * @param overlapOnly Is this an overlap only check, or part of separation?
      * @param bias A value added to the delta values during collision checks. Increase it to prevent sprite tunneling(sprites passing through another instead of colliding).
      */
    def GetOverlapY(
      body1: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
      body2: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
      overlapOnly: scala.Boolean,
      bias: scala.Double
    ): scala.Double = js.native
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
      body1: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
      body2: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
      overlapOnly: scala.Boolean,
      bias: scala.Double
    ): scala.Boolean = js.native
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
      body1: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
      body2: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
      overlapOnly: scala.Boolean,
      bias: scala.Double
    ): scala.Boolean = js.native
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
    }
    
    @JSName("Tilemap")
    @js.native
    object TilemapNs extends js.Object {
      /**
        * A function to process the collision callbacks between a single tile and an Arcade Physics enabled Game Object.
        * @param tile The Tile to process.
        * @param sprite The Game Object to process with the Tile.
        */
      def ProcessTileCallbacks(tile: phaserLib.PhaserNs.TilemapsNs.Tile, sprite: phaserLib.PhaserNs.GameObjectsNs.Sprite): scala.Boolean = js.native
      /**
        * Internal function to process the separation of a physics body from a tile.
        * @param body The Body object to separate.
        * @param x The x separation amount.
        */
      def ProcessTileSeparationX(body: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body, x: scala.Double): scala.Unit = js.native
      /**
        * Internal function to process the separation of a physics body from a tile.
        * @param body The Body object to separate.
        * @param y The y separation amount.
        */
      def ProcessTileSeparationY(body: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body, y: scala.Double): scala.Unit = js.native
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
        i: scala.Double,
        body: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
        tile: phaserLib.PhaserNs.TilemapsNs.Tile,
        tileWorldRect: phaserLib.PhaserNs.GeomNs.Rectangle,
        tilemapLayer: phaserLib.PhaserNs.TilemapsNs.DynamicTilemapLayer,
        tileBias: scala.Double,
        isLayer: scala.Boolean
      ): scala.Boolean = js.native
      def SeparateTile(
        i: scala.Double,
        body: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
        tile: phaserLib.PhaserNs.TilemapsNs.Tile,
        tileWorldRect: phaserLib.PhaserNs.GeomNs.Rectangle,
        tilemapLayer: phaserLib.PhaserNs.TilemapsNs.StaticTilemapLayer,
        tileBias: scala.Double,
        isLayer: scala.Boolean
      ): scala.Boolean = js.native
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
        body: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
        tile: phaserLib.PhaserNs.TilemapsNs.Tile,
        tileLeft: scala.Double,
        tileRight: scala.Double,
        tileBias: scala.Double,
        isLayer: scala.Boolean
      ): scala.Double = js.native
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
        body: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
        tile: phaserLib.PhaserNs.TilemapsNs.Tile,
        tileTop: scala.Double,
        tileBottom: scala.Double,
        tileBias: scala.Double,
        isLayer: scala.Boolean
      ): scala.Double = js.native
      /**
        * Checks for intersection between the given tile rectangle-like object and an Arcade Physics body.
        * @param tileWorldRect A rectangle object that defines the tile placement in the world.
        * @param body The body to check for intersection against.
        */
      def TileIntersectsBody(tileWorldRect: js.Object, body: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body): scala.Boolean = js.native
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
      extends phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body {
      /**
        * 
        * @param world [description]
        * @param x [description]
        * @param y [description]
        * @param sx [description] Default 16.
        * @param sy [description] Default 16.
        */
      def this(world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World, x: scala.Double, y: scala.Double) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World, x: scala.Double, y: scala.Double, sx: scala.Double) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World, x: scala.Double, y: scala.Double, sx: scala.Double, sy: scala.Double) = this()
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
      extends phaserLib.PhaserNs.PhysicsNs.ImpactNs.CollisionMap {
      def this(tilesize: phaserLib.integer) = this()
      def this(tilesize: phaserLib.integer, data: js.Array[_]) = this()
    }
    
    /**
      * The Impact Physics Factory allows you to easily create Impact Physics enabled Game Objects.
      * Objects that are created by this Factory are automatically added to the physics world.
      */
    @js.native
    class Factory protected ()
      extends phaserLib.PhaserNs.PhysicsNs.ImpactNs.Factory {
      /**
        * 
        * @param world A reference to the Impact Physics world.
        */
      def this(world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World) = this()
    }
    
    /**
      * [description]
      */
    @js.native
    class ImpactBody protected ()
      extends phaserLib.PhaserNs.PhysicsNs.ImpactNs.ImpactBody {
      /**
        * 
        * @param world [description]
        * @param x x - The horizontal position of this physics body in the world.
        * @param y y - The vertical position of this physics body in the world.
        * @param width The width of the physics body in the world.
        * @param height [description]
        */
      def this(world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World, x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
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
      extends phaserLib.PhaserNs.PhysicsNs.ImpactNs.ImpactImage {
      /**
        * 
        * @param world The physics world of the Impact physics system.
        * @param x The horizontal position of this Game Object in the world.
        * @param y The vertical position of this Game Object in the world.
        * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
        * @param frame An optional frame from the Texture this Game Object is rendering with.
        */
      def this(world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer) = this()
    }
    
    /**
      * [description]
      */
    @js.native
    class ImpactPhysics protected ()
      extends phaserLib.PhaserNs.PhysicsNs.ImpactNs.ImpactPhysics {
      /**
        * 
        * @param scene [description]
        */
      def this(scene: phaserLib.PhaserNs.Scene) = this()
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
      extends phaserLib.PhaserNs.PhysicsNs.ImpactNs.ImpactSprite {
      /**
        * 
        * @param world [description]
        * @param x The horizontal position of this Game Object in the world.
        * @param y The vertical position of this Game Object in the world.
        * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
        * @param frame An optional frame from the Texture this Game Object is rendering with.
        */
      def this(world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer) = this()
    }
    
    /**
      * [description]
      */
    @js.native
    class World protected ()
      extends phaserLib.PhaserNs.PhysicsNs.ImpactNs.World {
      /**
        * 
        * @param scene The Scene to which this Impact World instance belongs.
        * @param config [description]
        */
      def this(scene: phaserLib.PhaserNs.Scene, config: phaserLib.PhaserNs.TypesNs.PhysicsNs.ImpactNs.WorldConfig) = this()
    }
    
    /**
      * [description]
      * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
      * @param vel [description]
      * @param accel [description]
      * @param friction [description]
      * @param max [description]
      */
    def GetVelocity(
      delta: scala.Double,
      vel: scala.Double,
      accel: scala.Double,
      friction: scala.Double,
      max: scala.Double
    ): scala.Double = js.native
    /**
      * [description]
      * @param world [description]
      * @param left [description]
      * @param right [description]
      * @param weak [description]
      */
    def SeparateX(
      world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World,
      left: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body,
      right: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body
    ): scala.Unit = js.native
    def SeparateX(
      world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World,
      left: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body,
      right: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body,
      weak: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body
    ): scala.Unit = js.native
    /**
      * [description]
      * @param world [description]
      * @param top [description]
      * @param bottom [description]
      * @param weak [description]
      */
    def SeparateY(
      world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World,
      top: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body,
      bottom: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body
    ): scala.Unit = js.native
    def SeparateY(
      world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World,
      top: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body,
      bottom: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body,
      weak: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body
    ): scala.Unit = js.native
    /**
      * Impact Physics Solver
      * @param world The Impact simulation to run the solver in.
      * @param bodyA The first body in the collision.
      * @param bodyB The second body in the collision.
      */
    def Solver(
      world: phaserLib.PhaserNs.PhysicsNs.ImpactNs.World,
      bodyA: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body,
      bodyB: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body
    ): scala.Unit = js.native
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
    def UpdateMotion(body: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body, res: js.Object): scala.Unit = js.native
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
      val ACTIVE: phaserLib.PhaserNs.PhysicsNs.ImpactNs.COLLIDES.ACTIVE with java.lang.String = js.native
      val FIXED: phaserLib.PhaserNs.PhysicsNs.ImpactNs.COLLIDES.FIXED with java.lang.String = js.native
      val LITE: phaserLib.PhaserNs.PhysicsNs.ImpactNs.COLLIDES.LITE with java.lang.String = js.native
      val NEVER: phaserLib.PhaserNs.PhysicsNs.ImpactNs.COLLIDES.NEVER with java.lang.String = js.native
      val PASSIVE: phaserLib.PhaserNs.PhysicsNs.ImpactNs.COLLIDES.PASSIVE with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[phaserLib.PhaserNs.PhysicsNs.ImpactNs.COLLIDES with java.lang.String] = js.native
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
      val A: phaserLib.PhaserNs.PhysicsNs.ImpactNs.TYPE.A with java.lang.String = js.native
      val B: phaserLib.PhaserNs.PhysicsNs.ImpactNs.TYPE.B with java.lang.String = js.native
      val BOTH: phaserLib.PhaserNs.PhysicsNs.ImpactNs.TYPE.BOTH with java.lang.String = js.native
      val NONE: phaserLib.PhaserNs.PhysicsNs.ImpactNs.TYPE.NONE with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[phaserLib.PhaserNs.PhysicsNs.ImpactNs.TYPE with java.lang.String] = js.native
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
      extends phaserLib.PhaserNs.PhysicsNs.MatterNs.Factory {
      /**
        * 
        * @param world The Matter World which this Factory adds to.
        */
      def this(world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World) = this()
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
      extends phaserLib.PhaserNs.PhysicsNs.MatterNs.Image {
      /**
        * 
        * @param world [description]
        * @param x The horizontal position of this Game Object in the world.
        * @param y The vertical position of this Game Object in the world.
        * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
        * @param frame An optional frame from the Texture this Game Object is rendering with.
        * @param options Matter.js configuration object. Default {}.
        */
      def this(world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String, options: js.Object) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer, options: js.Object) = this()
    }
    
    /**
      * [description]
      */
    @js.native
    class MatterPhysics protected ()
      extends phaserLib.PhaserNs.PhysicsNs.MatterNs.MatterPhysics {
      /**
        * 
        * @param scene [description]
        */
      def this(scene: phaserLib.PhaserNs.Scene) = this()
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
      extends phaserLib.PhaserNs.PhysicsNs.MatterNs.PointerConstraint {
      /**
        * 
        * @param scene A reference to the Scene to which this Pointer Constraint belongs.
        * @param world A reference to the Matter World instance to which this Constraint belongs.
        * @param options A Constraint configuration object.
        */
      def this(scene: phaserLib.PhaserNs.Scene, world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World) = this()
      def this(scene: phaserLib.PhaserNs.Scene, world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World, options: js.Object) = this()
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
      extends phaserLib.PhaserNs.PhysicsNs.MatterNs.Sprite {
      /**
        * 
        * @param world [description]
        * @param x The horizontal position of this Game Object in the world.
        * @param y The vertical position of this Game Object in the world.
        * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
        * @param frame An optional frame from the Texture this Game Object is rendering with.
        * @param options Matter.js configuration object. Default {}.
        */
      def this(world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String, options: js.Object) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer, options: js.Object) = this()
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
      extends phaserLib.PhaserNs.PhysicsNs.MatterNs.TileBody {
      /**
        * 
        * @param world [description]
        * @param tile The target tile that should have a Matter body.
        * @param options Options to be used when creating the Matter body.
        */
      def this(world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World, tile: phaserLib.PhaserNs.TilemapsNs.Tile) = this()
      def this(world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World, tile: phaserLib.PhaserNs.TilemapsNs.Tile, options: phaserLib.PhaserNs.TypesNs.PhysicsNs.MatterNs.MatterTileOptions) = this()
    }
    
    /**
      * [description]
      */
    @js.native
    class World protected ()
      extends phaserLib.PhaserNs.PhysicsNs.MatterNs.World {
      /**
        * 
        * @param scene The Scene to which this Matter World instance belongs.
        * @param config The Matter World configuration object.
        */
      def this(scene: phaserLib.PhaserNs.Scene, config: phaserLib.PhaserNs.TypesNs.PhysicsNs.MatterNs.MatterWorldConfig) = this()
    }
    
    /**
      * [description]
      * @param world The Matter world to add the body to.
      * @param gameObject The Game Object that will have the Matter body applied to it.
      * @param options Matter options config object.
      */
    def MatterGameObject(
      world: phaserLib.PhaserNs.PhysicsNs.MatterNs.World,
      gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject,
      options: js.Object
    ): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
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
      def parseBody(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, config: js.Object): js.Object = js.native
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


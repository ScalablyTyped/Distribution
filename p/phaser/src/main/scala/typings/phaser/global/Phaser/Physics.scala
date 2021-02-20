package typings.phaser.global.Phaser

import typings.phaser.ArcadePhysicsCallback
import typings.phaser.MatterJS.Body
import typings.phaser.MatterJS.BodyType
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer
import typings.phaser.Phaser.Tilemaps.StaticTilemapLayer
import typings.phaser.Phaser.Tilemaps.Tile
import typings.phaser.Phaser.Types.GameObjects.Group.GroupConfig
import typings.phaser.Phaser.Types.GameObjects.Group.GroupCreateConfig
import typings.phaser.Phaser.Types.Physics.Arcade.ArcadeColliderType
import typings.phaser.Phaser.Types.Physics.Arcade.ArcadeWorldConfig
import typings.phaser.Phaser.Types.Physics.Arcade.PhysicsGroupConfig
import typings.phaser.Phaser.Types.Physics.Matter.MatterBodyConfig
import typings.phaser.Phaser.Types.Physics.Matter.MatterTileOptions
import typings.phaser.Phaser.Types.Physics.Matter.MatterWorldConfig
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Physics {
  
  object Arcade {
    
    @JSGlobal("Phaser.Physics.Arcade")
    @js.native
    val ^ : js.Any = js.native
    
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
    @JSGlobal("Phaser.Physics.Arcade.ArcadePhysics")
    @js.native
    class ArcadePhysics protected ()
      extends typings.phaser.Phaser.Physics.Arcade.ArcadePhysics {
      /**
        * 
        * @param scene The Scene that this Plugin belongs to.
        */
      def this(scene: typings.phaser.Phaser.Scene) = this()
    }
    
    /**
      * A Dynamic Arcade Body.
      * 
      * Its static counterpart is {@link Phaser.Physics.Arcade.StaticBody}.
      */
    @JSGlobal("Phaser.Physics.Arcade.Body")
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
    @JSGlobal("Phaser.Physics.Arcade.Collider")
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
    
    /**
      * Dynamic Body.
      */
    @JSGlobal("Phaser.Physics.Arcade.DYNAMIC_BODY")
    @js.native
    def DYNAMIC_BODY: Double = js.native
    @scala.inline
    def DYNAMIC_BODY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DYNAMIC_BODY")(x.asInstanceOf[js.Any])
    
    object Events {
      
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
      @JSGlobal("Phaser.Physics.Arcade.Events.COLLIDE")
      @js.native
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
      @JSGlobal("Phaser.Physics.Arcade.Events.OVERLAP")
      @js.native
      val OVERLAP: js.Any = js.native
      
      /**
        * The Arcade Physics World Pause Event.
        * 
        * This event is dispatched by an Arcade Physics World instance when it is paused.
        * 
        * Listen to it from a Scene using: `this.physics.world.on('pause', listener)`.
        */
      @JSGlobal("Phaser.Physics.Arcade.Events.PAUSE")
      @js.native
      val PAUSE: js.Any = js.native
      
      /**
        * The Arcade Physics World Resume Event.
        * 
        * This event is dispatched by an Arcade Physics World instance when it resumes from a paused state.
        * 
        * Listen to it from a Scene using: `this.physics.world.on('resume', listener)`.
        */
      @JSGlobal("Phaser.Physics.Arcade.Events.RESUME")
      @js.native
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
      @JSGlobal("Phaser.Physics.Arcade.Events.TILE_COLLIDE")
      @js.native
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
      @JSGlobal("Phaser.Physics.Arcade.Events.TILE_OVERLAP")
      @js.native
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
      @JSGlobal("Phaser.Physics.Arcade.Events.WORLD_BOUNDS")
      @js.native
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
      @JSGlobal("Phaser.Physics.Arcade.Events.WORLD_STEP")
      @js.native
      val WORLD_STEP: js.Any = js.native
    }
    
    /**
      * Facing down.
      */
    @JSGlobal("Phaser.Physics.Arcade.FACING_DOWN")
    @js.native
    def FACING_DOWN: Double = js.native
    @scala.inline
    def FACING_DOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACING_DOWN")(x.asInstanceOf[js.Any])
    
    /**
      * Facing left.
      */
    @JSGlobal("Phaser.Physics.Arcade.FACING_LEFT")
    @js.native
    def FACING_LEFT: Double = js.native
    @scala.inline
    def FACING_LEFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACING_LEFT")(x.asInstanceOf[js.Any])
    
    /**
      * Facing no direction (initial value).
      */
    @JSGlobal("Phaser.Physics.Arcade.FACING_NONE")
    @js.native
    def FACING_NONE: Double = js.native
    @scala.inline
    def FACING_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACING_NONE")(x.asInstanceOf[js.Any])
    
    /**
      * Facing right.
      */
    @JSGlobal("Phaser.Physics.Arcade.FACING_RIGHT")
    @js.native
    def FACING_RIGHT: Double = js.native
    @scala.inline
    def FACING_RIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACING_RIGHT")(x.asInstanceOf[js.Any])
    
    /**
      * Facing up.
      */
    @JSGlobal("Phaser.Physics.Arcade.FACING_UP")
    @js.native
    def FACING_UP: Double = js.native
    @scala.inline
    def FACING_UP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACING_UP")(x.asInstanceOf[js.Any])
    
    /**
      * The Arcade Physics Factory allows you to easily create Arcade Physics enabled Game Objects.
      * Objects that are created by this Factory are automatically added to the physics world.
      */
    @JSGlobal("Phaser.Physics.Arcade.Factory")
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
      * Arcade Physics Group containing Dynamic Bodies.
      */
    @JSGlobal("Phaser.Physics.Arcade.GROUP")
    @js.native
    def GROUP_ : Double = js.native
    
    @scala.inline
    def GROUP__=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GROUP")(x.asInstanceOf[js.Any])
    
    /**
      * Calculates and returns the horizontal overlap between two arcade physics bodies and sets their properties
      * accordingly, including: `touching.left`, `touching.right`, `touching.none` and `overlapX'.
      * @param body1 The first Body to separate.
      * @param body2 The second Body to separate.
      * @param overlapOnly Is this an overlap only check, or part of separation?
      * @param bias A value added to the delta values during collision checks. Increase it to prevent sprite tunneling(sprites passing through another instead of colliding).
      */
    @JSGlobal("Phaser.Physics.Arcade.GetOverlapX")
    @js.native
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
    @JSGlobal("Phaser.Physics.Arcade.GetOverlapY")
    @js.native
    def GetOverlapY(
      body1: typings.phaser.Phaser.Physics.Arcade.Body,
      body2: typings.phaser.Phaser.Physics.Arcade.Body,
      overlapOnly: Boolean,
      bias: Double
    ): Double = js.native
    
    /**
      * An Arcade Physics Group object.
      * 
      * All Game Objects created by or added to this Group will automatically be given dynamic Arcade Physics bodies, if they have no body.
      * 
      * Its static counterpart is {@link Phaser.Physics.Arcade.StaticGroup}.
      */
    @JSGlobal("Phaser.Physics.Arcade.Group")
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
      def this(world: typings.phaser.Phaser.Physics.Arcade.World, scene: typings.phaser.Phaser.Scene) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: js.Array[GameObject]
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: PhysicsGroupConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: js.UndefOr[scala.Nothing],
        config: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: js.UndefOr[scala.Nothing],
        config: PhysicsGroupConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: js.Array[GameObject],
        config: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: js.Array[GameObject],
        config: PhysicsGroupConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: GroupCreateConfig,
        config: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: GroupCreateConfig,
        config: PhysicsGroupConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: PhysicsGroupConfig,
        config: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
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
    @JSGlobal("Phaser.Physics.Arcade.Image")
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
      def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, texture: String) = this()
      def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, texture: Texture) = this()
      def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, texture: String, frame: String) = this()
      def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, texture: String, frame: integer) = this()
      def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, texture: Texture, frame: String) = this()
      def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, texture: Texture, frame: integer) = this()
    }
    
    /**
      * Static Body.
      */
    @JSGlobal("Phaser.Physics.Arcade.STATIC_BODY")
    @js.native
    def STATIC_BODY: Double = js.native
    @scala.inline
    def STATIC_BODY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATIC_BODY")(x.asInstanceOf[js.Any])
    
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
    @JSGlobal("Phaser.Physics.Arcade.SeparateX")
    @js.native
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
    @JSGlobal("Phaser.Physics.Arcade.SeparateY")
    @js.native
    def SeparateY(
      body1: typings.phaser.Phaser.Physics.Arcade.Body,
      body2: typings.phaser.Phaser.Physics.Arcade.Body,
      overlapOnly: Boolean,
      bias: Double
    ): Boolean = js.native
    
    /**
      * An Arcade Physics Sprite is a Sprite with an Arcade Physics body and related components.
      * The body can be dynamic or static.
      * 
      * The main difference between an Arcade Sprite and an Arcade Image is that you cannot animate an Arcade Image.
      * If you do not require animation then you can safely use Arcade Images instead of Arcade Sprites.
      */
    @JSGlobal("Phaser.Physics.Arcade.Sprite")
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
      def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, texture: String) = this()
      def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, texture: Texture) = this()
      def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, texture: String, frame: String) = this()
      def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, texture: String, frame: integer) = this()
      def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, texture: Texture, frame: String) = this()
      def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, texture: Texture, frame: integer) = this()
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
    @JSGlobal("Phaser.Physics.Arcade.StaticBody")
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
    @JSGlobal("Phaser.Physics.Arcade.StaticGroup")
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
      def this(world: typings.phaser.Phaser.Physics.Arcade.World, scene: typings.phaser.Phaser.Scene) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: js.Array[GameObject]
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: GroupConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: js.UndefOr[scala.Nothing],
        config: GroupConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: js.UndefOr[scala.Nothing],
        config: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: js.Array[GameObject],
        config: GroupConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: js.Array[GameObject],
        config: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: GroupConfig,
        config: GroupConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: GroupConfig,
        config: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: GroupCreateConfig,
        config: GroupConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: GroupCreateConfig,
        config: GroupCreateConfig
      ) = this()
    }
    
    /**
      * A Tilemap Layer.
      */
    @JSGlobal("Phaser.Physics.Arcade.TILEMAPLAYER")
    @js.native
    def TILEMAPLAYER: Double = js.native
    @scala.inline
    def TILEMAPLAYER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TILEMAPLAYER")(x.asInstanceOf[js.Any])
    
    object Tilemap {
      
      /**
        * A function to process the collision callbacks between a single tile and an Arcade Physics enabled Game Object.
        * @param tile The Tile to process.
        * @param sprite The Game Object to process with the Tile.
        */
      @JSGlobal("Phaser.Physics.Arcade.Tilemap.ProcessTileCallbacks")
      @js.native
      def ProcessTileCallbacks(tile: Tile, sprite: typings.phaser.Phaser.GameObjects.Sprite): Boolean = js.native
      
      /**
        * Internal function to process the separation of a physics body from a tile.
        * @param body The Body object to separate.
        * @param x The x separation amount.
        */
      @JSGlobal("Phaser.Physics.Arcade.Tilemap.ProcessTileSeparationX")
      @js.native
      def ProcessTileSeparationX(body: typings.phaser.Phaser.Physics.Arcade.Body, x: Double): Unit = js.native
      
      /**
        * Internal function to process the separation of a physics body from a tile.
        * @param body The Body object to separate.
        * @param y The y separation amount.
        */
      @JSGlobal("Phaser.Physics.Arcade.Tilemap.ProcessTileSeparationY")
      @js.native
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
      @JSGlobal("Phaser.Physics.Arcade.Tilemap.SeparateTile")
      @js.native
      def SeparateTile(
        i: Double,
        body: typings.phaser.Phaser.Physics.Arcade.Body,
        tile: Tile,
        tileWorldRect: Rectangle,
        tilemapLayer: DynamicTilemapLayer,
        tileBias: Double,
        isLayer: Boolean
      ): Boolean = js.native
      @JSGlobal("Phaser.Physics.Arcade.Tilemap.SeparateTile")
      @js.native
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
      @JSGlobal("Phaser.Physics.Arcade.Tilemap.TileCheckX")
      @js.native
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
      @JSGlobal("Phaser.Physics.Arcade.Tilemap.TileCheckY")
      @js.native
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
      @JSGlobal("Phaser.Physics.Arcade.Tilemap.TileIntersectsBody")
      @js.native
      def TileIntersectsBody(tileWorldRect: js.Object, body: typings.phaser.Phaser.Physics.Arcade.Body): Boolean = js.native
    }
    
    /**
      * The Arcade Physics World.
      * 
      * The World is responsible for creating, managing, colliding and updating all of the bodies within it.
      * 
      * An instance of the World belongs to a Phaser.Scene and is accessed via the property `physics.world`.
      */
    @JSGlobal("Phaser.Physics.Arcade.World")
    @js.native
    class World protected ()
      extends typings.phaser.Phaser.Physics.Arcade.World {
      /**
        * 
        * @param scene The Scene to which this World instance belongs.
        * @param config An Arcade Physics Configuration object.
        */
      def this(scene: typings.phaser.Phaser.Scene, config: ArcadeWorldConfig) = this()
    }
  }
  
  object Matter {
    
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
    @JSGlobal("Phaser.Physics.Matter.BodyBounds")
    @js.native
    class BodyBounds ()
      extends typings.phaser.Phaser.Physics.Matter.BodyBounds
    
    object Events {
      
      /**
        * The Matter Physics After Add Event.
        * 
        * This event is dispatched by a Matter Physics World instance at the end of the process when a new Body
        * or Constraint has just been added to the world.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('afteradd', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.AFTER_ADD")
      @js.native
      val AFTER_ADD: js.Any = js.native
      
      /**
        * The Matter Physics After Remove Event.
        * 
        * This event is dispatched by a Matter Physics World instance at the end of the process when a 
        * Body or Constraint was removed from the world.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('afterremove', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.AFTER_REMOVE")
      @js.native
      val AFTER_REMOVE: js.Any = js.native
      
      /**
        * The Matter Physics After Update Event.
        * 
        * This event is dispatched by a Matter Physics World instance after the engine has updated and all collision events have resolved.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('afterupdate', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.AFTER_UPDATE")
      @js.native
      val AFTER_UPDATE: js.Any = js.native
      
      /**
        * The Matter Physics Before Add Event.
        * 
        * This event is dispatched by a Matter Physics World instance at the start of the process when a new Body
        * or Constraint is being added to the world.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('beforeadd', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.BEFORE_ADD")
      @js.native
      val BEFORE_ADD: js.Any = js.native
      
      /**
        * The Matter Physics Before Remove Event.
        * 
        * This event is dispatched by a Matter Physics World instance at the start of the process when a 
        * Body or Constraint is being removed from the world.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('beforeremove', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.BEFORE_REMOVE")
      @js.native
      val BEFORE_REMOVE: js.Any = js.native
      
      /**
        * The Matter Physics Before Update Event.
        * 
        * This event is dispatched by a Matter Physics World instance right before all the collision processing takes place.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('beforeupdate', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.BEFORE_UPDATE")
      @js.native
      val BEFORE_UPDATE: js.Any = js.native
      
      /**
        * The Matter Physics Collision Active Event.
        * 
        * This event is dispatched by a Matter Physics World instance after the engine has updated.
        * It provides a list of all pairs that are colliding in the current tick (if any).
        * 
        * Listen to it from a Scene using: `this.matter.world.on('collisionactive', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.COLLISION_ACTIVE")
      @js.native
      val COLLISION_ACTIVE: js.Any = js.native
      
      /**
        * The Matter Physics Collision End Event.
        * 
        * This event is dispatched by a Matter Physics World instance after the engine has updated.
        * It provides a list of all pairs that have finished colliding in the current tick (if any).
        * 
        * Listen to it from a Scene using: `this.matter.world.on('collisionend', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.COLLISION_END")
      @js.native
      val COLLISION_END: js.Any = js.native
      
      /**
        * The Matter Physics Collision Start Event.
        * 
        * This event is dispatched by a Matter Physics World instance after the engine has updated.
        * It provides a list of all pairs that have started to collide in the current tick (if any).
        * 
        * Listen to it from a Scene using: `this.matter.world.on('collisionstart', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.COLLISION_START")
      @js.native
      val COLLISION_START: js.Any = js.native
      
      /**
        * The Matter Physics Drag Event.
        * 
        * This event is dispatched by a Matter Physics World instance when a Pointer Constraint
        * is actively dragging a body. It is emitted each time the pointer moves.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('drag', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.DRAG")
      @js.native
      val DRAG: js.Any = js.native
      
      /**
        * The Matter Physics Drag End Event.
        * 
        * This event is dispatched by a Matter Physics World instance when a Pointer Constraint
        * stops dragging a body.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('dragend', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.DRAG_END")
      @js.native
      val DRAG_END: js.Any = js.native
      
      /**
        * The Matter Physics Drag Start Event.
        * 
        * This event is dispatched by a Matter Physics World instance when a Pointer Constraint
        * starts dragging a body.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('dragstart', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.DRAG_START")
      @js.native
      val DRAG_START: js.Any = js.native
      
      /**
        * The Matter Physics World Pause Event.
        * 
        * This event is dispatched by an Matter Physics World instance when it is paused.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('pause', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.PAUSE")
      @js.native
      val PAUSE: js.Any = js.native
      
      /**
        * The Matter Physics World Resume Event.
        * 
        * This event is dispatched by an Matter Physics World instance when it resumes from a paused state.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('resume', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.RESUME")
      @js.native
      val RESUME: js.Any = js.native
      
      /**
        * The Matter Physics Sleep End Event.
        * 
        * This event is dispatched by a Matter Physics World instance when a Body stop sleeping.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('sleepend', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.SLEEP_END")
      @js.native
      val SLEEP_END: js.Any = js.native
      
      /**
        * The Matter Physics Sleep Start Event.
        * 
        * This event is dispatched by a Matter Physics World instance when a Body goes to sleep.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('sleepstart', listener)`.
        */
      @JSGlobal("Phaser.Physics.Matter.Events.SLEEP_START")
      @js.native
      val SLEEP_START: js.Any = js.native
    }
    
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
    @JSGlobal("Phaser.Physics.Matter.Factory")
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
    @JSGlobal("Phaser.Physics.Matter.Image")
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
    @JSGlobal("Phaser.Physics.Matter.MatterGameObject")
    @js.native
    def MatterGameObject(world: typings.phaser.Phaser.Physics.Matter.World, gameObject: GameObject): GameObject = js.native
    @JSGlobal("Phaser.Physics.Matter.MatterGameObject")
    @js.native
    def MatterGameObject(
      world: typings.phaser.Phaser.Physics.Matter.World,
      gameObject: GameObject,
      options: js.UndefOr[scala.Nothing],
      addToWorld: Boolean
    ): GameObject = js.native
    @JSGlobal("Phaser.Physics.Matter.MatterGameObject")
    @js.native
    def MatterGameObject(world: typings.phaser.Phaser.Physics.Matter.World, gameObject: GameObject, options: Body): GameObject = js.native
    @JSGlobal("Phaser.Physics.Matter.MatterGameObject")
    @js.native
    def MatterGameObject(
      world: typings.phaser.Phaser.Physics.Matter.World,
      gameObject: GameObject,
      options: Body,
      addToWorld: Boolean
    ): GameObject = js.native
    @JSGlobal("Phaser.Physics.Matter.MatterGameObject")
    @js.native
    def MatterGameObject(
      world: typings.phaser.Phaser.Physics.Matter.World,
      gameObject: GameObject,
      options: MatterBodyConfig
    ): GameObject = js.native
    @JSGlobal("Phaser.Physics.Matter.MatterGameObject")
    @js.native
    def MatterGameObject(
      world: typings.phaser.Phaser.Physics.Matter.World,
      gameObject: GameObject,
      options: MatterBodyConfig,
      addToWorld: Boolean
    ): GameObject = js.native
    
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
    @JSGlobal("Phaser.Physics.Matter.MatterPhysics")
    @js.native
    class MatterPhysics protected ()
      extends typings.phaser.Phaser.Physics.Matter.MatterPhysics {
      /**
        * 
        * @param scene The Phaser Scene that owns this Matter Physics instance.
        */
      def this(scene: typings.phaser.Phaser.Scene) = this()
    }
    
    /**
      * Use PhysicsEditorParser.parseBody() to build a Matter body object, based on a physics data file
      * created and exported with PhysicsEditor (https://www.codeandweb.com/physicseditor).
      */
    object PhysicsEditorParser {
      
      /**
        * Parses a body element exported by PhysicsEditor.
        * @param x The horizontal world location of the body.
        * @param y The vertical world location of the body.
        * @param config The body configuration and fixture (child body) definitions, as exported by PhysicsEditor.
        * @param options An optional Body configuration object that is used to set initial Body properties on creation.
        */
      @JSGlobal("Phaser.Physics.Matter.PhysicsEditorParser.parseBody")
      @js.native
      def parseBody(x: Double, y: Double, config: js.Object): BodyType = js.native
      @JSGlobal("Phaser.Physics.Matter.PhysicsEditorParser.parseBody")
      @js.native
      def parseBody(x: Double, y: Double, config: js.Object, options: MatterBodyConfig): BodyType = js.native
      
      /**
        * Parses an element of the "fixtures" list exported by PhysicsEditor
        * @param fixtureConfig The fixture object to parse.
        */
      @JSGlobal("Phaser.Physics.Matter.PhysicsEditorParser.parseFixture")
      @js.native
      def parseFixture(fixtureConfig: js.Object): js.Array[BodyType] = js.native
      
      /**
        * Parses the "vertices" lists exported by PhysicsEditor.
        * @param vertexSets The vertex lists to parse.
        * @param options An optional Body configuration object that is used to set initial Body properties on creation.
        */
      @JSGlobal("Phaser.Physics.Matter.PhysicsEditorParser.parseVertices")
      @js.native
      def parseVertices(vertexSets: js.Array[_]): js.Array[BodyType] = js.native
      @JSGlobal("Phaser.Physics.Matter.PhysicsEditorParser.parseVertices")
      @js.native
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
    object PhysicsJSONParser {
      
      /**
        * Parses a body element from the given JSON data.
        * @param x The horizontal world location of the body.
        * @param y The vertical world location of the body.
        * @param config The body configuration data.
        * @param options An optional Body configuration object that is used to set initial Body properties on creation.
        */
      @JSGlobal("Phaser.Physics.Matter.PhysicsJSONParser.parseBody")
      @js.native
      def parseBody(x: Double, y: Double, config: js.Object): BodyType = js.native
      @JSGlobal("Phaser.Physics.Matter.PhysicsJSONParser.parseBody")
      @js.native
      def parseBody(x: Double, y: Double, config: js.Object, options: MatterBodyConfig): BodyType = js.native
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
    @JSGlobal("Phaser.Physics.Matter.PointerConstraint")
    @js.native
    class PointerConstraint protected ()
      extends typings.phaser.Phaser.Physics.Matter.PointerConstraint {
      /**
        * 
        * @param scene A reference to the Scene to which this Pointer Constraint belongs.
        * @param world A reference to the Matter World instance to which this Constraint belongs.
        * @param options A Constraint configuration object.
        */
      def this(scene: typings.phaser.Phaser.Scene, world: typings.phaser.Phaser.Physics.Matter.World) = this()
      def this(
        scene: typings.phaser.Phaser.Scene,
        world: typings.phaser.Phaser.Physics.Matter.World,
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
    @JSGlobal("Phaser.Physics.Matter.Sprite")
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
    @JSGlobal("Phaser.Physics.Matter.TileBody")
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
    @JSGlobal("Phaser.Physics.Matter.World")
    @js.native
    class World protected ()
      extends typings.phaser.Phaser.Physics.Matter.World {
      /**
        * 
        * @param scene The Scene to which this Matter World instance belongs.
        * @param config The Matter World configuration object.
        */
      def this(scene: typings.phaser.Phaser.Scene, config: MatterWorldConfig) = this()
    }
  }
}

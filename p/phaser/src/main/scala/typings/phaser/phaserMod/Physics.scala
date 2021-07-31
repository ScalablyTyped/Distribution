package typings.phaser.phaserMod

import typings.phaser.ArcadePhysicsCallback
import typings.phaser.MatterJS.Body
import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.ConstraintType
import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Input.Pointer
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer
import typings.phaser.Phaser.Tilemaps.StaticTilemapLayer
import typings.phaser.Phaser.Tilemaps.Tile
import typings.phaser.Phaser.Types.GameObjects.Group.GroupConfig
import typings.phaser.Phaser.Types.GameObjects.Group.GroupCreateConfig
import typings.phaser.Phaser.Types.Physics.Arcade.ArcadeColliderType
import typings.phaser.Phaser.Types.Physics.Arcade.ArcadeWorldConfig
import typings.phaser.Phaser.Types.Physics.Arcade.GameObjectWithBody
import typings.phaser.Phaser.Types.Physics.Arcade.PhysicsGroupConfig
import typings.phaser.Phaser.Types.Physics.Matter.MatterBodyConfig
import typings.phaser.Phaser.Types.Physics.Matter.MatterTileOptions
import typings.phaser.Phaser.Types.Physics.Matter.MatterWorldConfig
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Physics {
  
  object Arcade {
    
    @JSImport("phaser", "Physics.Arcade")
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
    @JSImport("phaser", "Physics.Arcade.ArcadePhysics")
    @js.native
    class ArcadePhysics protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Arcade.ArcadePhysics {
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
    @JSImport("phaser", "Physics.Arcade.Body")
    @js.native
    class Body protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Arcade.Body {
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
    @JSImport("phaser", "Physics.Arcade.Collider")
    @js.native
    class Collider protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Arcade.Collider {
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
      
      /**
        * Whether the collider is active.
        */
      /* CompleteClass */
      var active: Boolean = js.native
      
      /**
        * The context the collideCallback and processCallback will run in.
        */
      /* CompleteClass */
      var callbackContext: js.Object = js.native
      
      /**
        * The callback to invoke when the two objects collide.
        */
      /* CompleteClass */
      override def collideCallback(object1: GameObjectWithBody, object2: GameObjectWithBody): Unit = js.native
      /**
        * The callback to invoke when the two objects collide.
        */
      /* CompleteClass */
      @JSName("collideCallback")
      var collideCallback_Original: ArcadePhysicsCallback = js.native
      
      /**
        * Removes Collider from World and disposes of its resources.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * The name of the collider (unused by Phaser).
        */
      /* CompleteClass */
      var name: String = js.native
      
      /**
        * The first object to check for collision.
        */
      /* CompleteClass */
      var object1: ArcadeColliderType = js.native
      
      /**
        * The second object to check for collision.
        */
      /* CompleteClass */
      var object2: ArcadeColliderType = js.native
      
      /**
        * Whether to check for collisions or overlaps.
        */
      /* CompleteClass */
      var overlapOnly: Boolean = js.native
      
      /**
        * If a processCallback exists it must return true or collision checking will be skipped.
        */
      /* CompleteClass */
      override def processCallback(object1: GameObjectWithBody, object2: GameObjectWithBody): Unit = js.native
      /**
        * If a processCallback exists it must return true or collision checking will be skipped.
        */
      /* CompleteClass */
      @JSName("processCallback")
      var processCallback_Original: ArcadePhysicsCallback = js.native
      
      /**
        * A name for the Collider.
        * 
        * Phaser does not use this value, it's for your own reference.
        * @param name The name to assign to the Collider.
        */
      /* CompleteClass */
      override def setName(name: String): typings.phaser.Phaser.Physics.Arcade.Collider = js.native
      
      /**
        * Called by World as part of its step processing, initial operation of collision checking.
        */
      /* CompleteClass */
      override def update(): Unit = js.native
      
      /**
        * The world in which the bodies will collide.
        */
      /* CompleteClass */
      var world: typings.phaser.Phaser.Physics.Arcade.World = js.native
    }
    
    /**
      * Dynamic Body.
      */
    @JSImport("phaser", "Physics.Arcade.DYNAMIC_BODY")
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
      @JSImport("phaser", "Physics.Arcade.Events.COLLIDE")
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
      @JSImport("phaser", "Physics.Arcade.Events.OVERLAP")
      @js.native
      val OVERLAP: js.Any = js.native
      
      /**
        * The Arcade Physics World Pause Event.
        * 
        * This event is dispatched by an Arcade Physics World instance when it is paused.
        * 
        * Listen to it from a Scene using: `this.physics.world.on('pause', listener)`.
        */
      @JSImport("phaser", "Physics.Arcade.Events.PAUSE")
      @js.native
      val PAUSE: js.Any = js.native
      
      /**
        * The Arcade Physics World Resume Event.
        * 
        * This event is dispatched by an Arcade Physics World instance when it resumes from a paused state.
        * 
        * Listen to it from a Scene using: `this.physics.world.on('resume', listener)`.
        */
      @JSImport("phaser", "Physics.Arcade.Events.RESUME")
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
      @JSImport("phaser", "Physics.Arcade.Events.TILE_COLLIDE")
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
      @JSImport("phaser", "Physics.Arcade.Events.TILE_OVERLAP")
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
      @JSImport("phaser", "Physics.Arcade.Events.WORLD_BOUNDS")
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
      @JSImport("phaser", "Physics.Arcade.Events.WORLD_STEP")
      @js.native
      val WORLD_STEP: js.Any = js.native
    }
    
    /**
      * Facing down.
      */
    @JSImport("phaser", "Physics.Arcade.FACING_DOWN")
    @js.native
    def FACING_DOWN: Double = js.native
    @scala.inline
    def FACING_DOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACING_DOWN")(x.asInstanceOf[js.Any])
    
    /**
      * Facing left.
      */
    @JSImport("phaser", "Physics.Arcade.FACING_LEFT")
    @js.native
    def FACING_LEFT: Double = js.native
    @scala.inline
    def FACING_LEFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACING_LEFT")(x.asInstanceOf[js.Any])
    
    /**
      * Facing no direction (initial value).
      */
    @JSImport("phaser", "Physics.Arcade.FACING_NONE")
    @js.native
    def FACING_NONE: Double = js.native
    @scala.inline
    def FACING_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACING_NONE")(x.asInstanceOf[js.Any])
    
    /**
      * Facing right.
      */
    @JSImport("phaser", "Physics.Arcade.FACING_RIGHT")
    @js.native
    def FACING_RIGHT: Double = js.native
    @scala.inline
    def FACING_RIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACING_RIGHT")(x.asInstanceOf[js.Any])
    
    /**
      * Facing up.
      */
    @JSImport("phaser", "Physics.Arcade.FACING_UP")
    @js.native
    def FACING_UP: Double = js.native
    @scala.inline
    def FACING_UP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACING_UP")(x.asInstanceOf[js.Any])
    
    /**
      * The Arcade Physics Factory allows you to easily create Arcade Physics enabled Game Objects.
      * Objects that are created by this Factory are automatically added to the physics world.
      */
    @JSImport("phaser", "Physics.Arcade.Factory")
    @js.native
    class Factory protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Arcade.Factory {
      /**
        * 
        * @param world The Arcade Physics World instance.
        */
      def this(world: typings.phaser.Phaser.Physics.Arcade.World) = this()
    }
    
    /**
      * Arcade Physics Group containing Dynamic Bodies.
      */
    @JSImport("phaser", "Physics.Arcade.GROUP")
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
    @scala.inline
    def GetOverlapX(
      body1: typings.phaser.Phaser.Physics.Arcade.Body,
      body2: typings.phaser.Phaser.Physics.Arcade.Body,
      overlapOnly: Boolean,
      bias: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetOverlapX")(body1.asInstanceOf[js.Any], body2.asInstanceOf[js.Any], overlapOnly.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Calculates and returns the vertical overlap between two arcade physics bodies and sets their properties
      * accordingly, including: `touching.up`, `touching.down`, `touching.none` and `overlapY'.
      * @param body1 The first Body to separate.
      * @param body2 The second Body to separate.
      * @param overlapOnly Is this an overlap only check, or part of separation?
      * @param bias A value added to the delta values during collision checks. Increase it to prevent sprite tunneling(sprites passing through another instead of colliding).
      */
    @scala.inline
    def GetOverlapY(
      body1: typings.phaser.Phaser.Physics.Arcade.Body,
      body2: typings.phaser.Phaser.Physics.Arcade.Body,
      overlapOnly: Boolean,
      bias: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetOverlapY")(body1.asInstanceOf[js.Any], body2.asInstanceOf[js.Any], overlapOnly.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * An Arcade Physics Group object.
      * 
      * All Game Objects created by or added to this Group will automatically be given dynamic Arcade Physics bodies, if they have no body.
      * 
      * Its static counterpart is {@link Phaser.Physics.Arcade.StaticGroup}.
      */
    @JSImport("phaser", "Physics.Arcade.Group")
    @js.native
    class Group protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Arcade.Group {
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
        children: Unit,
        config: GroupCreateConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: Unit,
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
    @JSImport("phaser", "Physics.Arcade.Image")
    @js.native
    class Image protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Arcade.Image {
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
      
      /**
        * The color of the body outline when it renders to the debug display.
        */
      /* CompleteClass */
      var debugBodyColor: Double = js.native
      
      /**
        * Set to `true` to have this body render its outline to the debug display.
        */
      /* CompleteClass */
      var debugShowBody: Boolean = js.native
      
      /**
        * Set to `true` to have this body render a velocity marker to the debug display.
        */
      /* CompleteClass */
      var debugShowVelocity: Boolean = js.native
      
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
        */
      /* CompleteClass */
      var depth: Double = js.native
      
      /**
        * The displayed height of this Game Object.
        * 
        * This value takes into account the scale factor.
        * 
        * Setting this value will adjust the Game Object's scale property.
        */
      /* CompleteClass */
      var displayHeight: Double = js.native
      
      /**
        * The displayed width of this Game Object.
        * 
        * This value takes into account the scale factor.
        * 
        * Setting this value will adjust the Game Object's scale property.
        */
      /* CompleteClass */
      var displayWidth: Double = js.native
      
      /**
        * The horizontally flipped state of the Game Object.
        * 
        * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        */
      /* CompleteClass */
      var flipX: Boolean = js.native
      
      /**
        * The vertically flipped state of the Game Object.
        * 
        * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        */
      /* CompleteClass */
      var flipY: Boolean = js.native
      
      /**
        * The native (un-scaled) height of this Game Object.
        * 
        * Changing this value will not change the size that the Game Object is rendered in-game.
        * For that you need to either set the scale of the Game Object (`setScale`) or use
        * the `displayHeight` property.
        */
      /* CompleteClass */
      var height: Double = js.native
      
      /**
        * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
        */
      /* CompleteClass */
      override def resetFlip(): this.type = js.native
      
      /**
        * Sets the angular acceleration of the body.
        * 
        * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
        * However, they can have angular motion, which is passed on to the Game Object bound to the body,
        * causing them to visually rotate, even though the body remains axis-aligned.
        * @param value The amount of angular acceleration.
        */
      /* CompleteClass */
      override def setAngularAcceleration(value: Double): this.type = js.native
      
      /**
        * Sets the angular drag of the body. Drag is applied to the current velocity, providing a form of deceleration.
        * @param value The amount of drag.
        */
      /* CompleteClass */
      override def setAngularDrag(value: Double): this.type = js.native
      
      /**
        * Sets the angular velocity of the body.
        * 
        * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
        * However, they can have angular motion, which is passed on to the Game Object bound to the body,
        * causing them to visually rotate, even though the body remains axis-aligned.
        * @param value The amount of angular velocity.
        */
      /* CompleteClass */
      override def setAngularVelocity(value: Double): this.type = js.native
      
      /**
        * Sets the debug values of this body.
        * 
        * Bodies will only draw their debug if debug has been enabled for Arcade Physics as a whole.
        * Note that there is a performance cost in drawing debug displays. It should never be used in production.
        * @param showBody Set to `true` to have this body render its outline to the debug display.
        * @param showVelocity Set to `true` to have this body render a velocity marker to the debug display.
        * @param bodyColor The color of the body outline when rendered to the debug display.
        */
      /* CompleteClass */
      override def setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Double): this.type = js.native
      
      /**
        * Sets the color of the body outline when it renders to the debug display.
        * @param value The color of the body outline when rendered to the debug display.
        */
      /* CompleteClass */
      override def setDebugBodyColor(value: Double): this.type = js.native
      
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
        * @param value The depth of this Game Object.
        */
      /* CompleteClass */
      override def setDepth(value: integer): this.type = js.native
      
      /**
        * Sets the display size of this Game Object.
        * 
        * Calling this will adjust the scale.
        * @param width The width of this Game Object.
        * @param height The height of this Game Object.
        */
      /* CompleteClass */
      override def setDisplaySize(width: Double, height: Double): this.type = js.native
      
      /**
        * Sets the horizontal and vertical flipped state of this Game Object.
        * 
        * A Game Object that is flipped will render inversed on the flipped axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
        * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
        */
      /* CompleteClass */
      override def setFlip(x: Boolean, y: Boolean): this.type = js.native
      
      /**
        * Sets the horizontal flipped state of this Game Object.
        * 
        * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        * @param value The flipped state. `false` for no flip, or `true` to be flipped.
        */
      /* CompleteClass */
      override def setFlipX(value: Boolean): this.type = js.native
      
      /**
        * Sets the vertical flipped state of this Game Object.
        * @param value The flipped state. `false` for no flip, or `true` to be flipped.
        */
      /* CompleteClass */
      override def setFlipY(value: Boolean): this.type = js.native
      
      /**
        * Sets the mass of the physics body
        * @param value New value for the mass of the body.
        */
      /* CompleteClass */
      override def setMass(value: Double): this.type = js.native
      
      /**
        * **DEPRECATED**: Please use `setBodySize` instead.
        * 
        * Sets the size of this physics body. Setting the size does not adjust the dimensions of the parent Game Object.
        * @param width The new width of the physics body, in pixels.
        * @param height The new height of the physics body, in pixels.
        * @param center Should the body be re-positioned so its center aligns with the parent Game Object? Default true.
        */
      /* InferMemberOverrides */
      override def setSize(width: Double, height: Double): this.type = js.native
      
      /**
        * Sets the size of this Game Object to be that of the given Frame.
        * 
        * This will not change the size that the Game Object is rendered in-game.
        * For that you need to either set the scale of the Game Object (`setScale`) or call the
        * `setDisplaySize` method, which is the same thing as changing the scale but allows you
        * to do so by giving pixel values.
        * 
        * If you have enabled this Game Object for input, changing the size will _not_ change the
        * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
        * @param frame The frame to base the size of this Game Object on.
        */
      /* CompleteClass */
      override def setSizeToFrame(frame: Frame): this.type = js.native
      
      /**
        * Sets the visibility of this Game Object.
        * 
        * An invisible Game Object will skip rendering, but will still process update logic.
        * @param value The visible state of the Game Object.
        */
      /* CompleteClass */
      override def setVisible(value: Boolean): this.type = js.native
      
      /**
        * Toggles the horizontal flipped state of this Game Object.
        * 
        * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        */
      /* CompleteClass */
      override def toggleFlipX(): this.type = js.native
      
      /**
        * Toggles the vertical flipped state of this Game Object.
        */
      /* CompleteClass */
      override def toggleFlipY(): this.type = js.native
      
      /**
        * The visible state of the Game Object.
        * 
        * An invisible Game Object will skip rendering, but will still process update logic.
        */
      /* CompleteClass */
      var visible: Boolean = js.native
      
      /**
        * The native (un-scaled) width of this Game Object.
        * 
        * Changing this value will not change the size that the Game Object is rendered in-game.
        * For that you need to either set the scale of the Game Object (`setScale`) or use
        * the `displayWidth` property.
        */
      /* CompleteClass */
      var width: Double = js.native
    }
    
    /**
      * Static Body.
      */
    @JSImport("phaser", "Physics.Arcade.STATIC_BODY")
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
    @scala.inline
    def SeparateX(
      body1: typings.phaser.Phaser.Physics.Arcade.Body,
      body2: typings.phaser.Phaser.Physics.Arcade.Body,
      overlapOnly: Boolean,
      bias: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("SeparateX")(body1.asInstanceOf[js.Any], body2.asInstanceOf[js.Any], overlapOnly.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
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
    @scala.inline
    def SeparateY(
      body1: typings.phaser.Phaser.Physics.Arcade.Body,
      body2: typings.phaser.Phaser.Physics.Arcade.Body,
      overlapOnly: Boolean,
      bias: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("SeparateY")(body1.asInstanceOf[js.Any], body2.asInstanceOf[js.Any], overlapOnly.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * An Arcade Physics Sprite is a Sprite with an Arcade Physics body and related components.
      * The body can be dynamic or static.
      * 
      * The main difference between an Arcade Sprite and an Arcade Image is that you cannot animate an Arcade Image.
      * If you do not require animation then you can safely use Arcade Images instead of Arcade Sprites.
      */
    @JSImport("phaser", "Physics.Arcade.Sprite")
    @js.native
    class Sprite protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Arcade.Sprite {
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
      
      /**
        * The color of the body outline when it renders to the debug display.
        */
      /* CompleteClass */
      var debugBodyColor: Double = js.native
      
      /**
        * Set to `true` to have this body render its outline to the debug display.
        */
      /* CompleteClass */
      var debugShowBody: Boolean = js.native
      
      /**
        * Set to `true` to have this body render a velocity marker to the debug display.
        */
      /* CompleteClass */
      var debugShowVelocity: Boolean = js.native
      
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
        */
      /* CompleteClass */
      var depth: Double = js.native
      
      /**
        * The displayed height of this Game Object.
        * 
        * This value takes into account the scale factor.
        * 
        * Setting this value will adjust the Game Object's scale property.
        */
      /* CompleteClass */
      var displayHeight: Double = js.native
      
      /**
        * The displayed width of this Game Object.
        * 
        * This value takes into account the scale factor.
        * 
        * Setting this value will adjust the Game Object's scale property.
        */
      /* CompleteClass */
      var displayWidth: Double = js.native
      
      /**
        * The horizontally flipped state of the Game Object.
        * 
        * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        */
      /* CompleteClass */
      var flipX: Boolean = js.native
      
      /**
        * The vertically flipped state of the Game Object.
        * 
        * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        */
      /* CompleteClass */
      var flipY: Boolean = js.native
      
      /**
        * The native (un-scaled) height of this Game Object.
        * 
        * Changing this value will not change the size that the Game Object is rendered in-game.
        * For that you need to either set the scale of the Game Object (`setScale`) or use
        * the `displayHeight` property.
        */
      /* CompleteClass */
      var height: Double = js.native
      
      /**
        * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
        */
      /* CompleteClass */
      override def resetFlip(): this.type = js.native
      
      /**
        * Sets the angular acceleration of the body.
        * 
        * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
        * However, they can have angular motion, which is passed on to the Game Object bound to the body,
        * causing them to visually rotate, even though the body remains axis-aligned.
        * @param value The amount of angular acceleration.
        */
      /* CompleteClass */
      override def setAngularAcceleration(value: Double): this.type = js.native
      
      /**
        * Sets the angular drag of the body. Drag is applied to the current velocity, providing a form of deceleration.
        * @param value The amount of drag.
        */
      /* CompleteClass */
      override def setAngularDrag(value: Double): this.type = js.native
      
      /**
        * Sets the angular velocity of the body.
        * 
        * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
        * However, they can have angular motion, which is passed on to the Game Object bound to the body,
        * causing them to visually rotate, even though the body remains axis-aligned.
        * @param value The amount of angular velocity.
        */
      /* CompleteClass */
      override def setAngularVelocity(value: Double): this.type = js.native
      
      /**
        * Sets the debug values of this body.
        * 
        * Bodies will only draw their debug if debug has been enabled for Arcade Physics as a whole.
        * Note that there is a performance cost in drawing debug displays. It should never be used in production.
        * @param showBody Set to `true` to have this body render its outline to the debug display.
        * @param showVelocity Set to `true` to have this body render a velocity marker to the debug display.
        * @param bodyColor The color of the body outline when rendered to the debug display.
        */
      /* CompleteClass */
      override def setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Double): this.type = js.native
      
      /**
        * Sets the color of the body outline when it renders to the debug display.
        * @param value The color of the body outline when rendered to the debug display.
        */
      /* CompleteClass */
      override def setDebugBodyColor(value: Double): this.type = js.native
      
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
        * @param value The depth of this Game Object.
        */
      /* CompleteClass */
      override def setDepth(value: integer): this.type = js.native
      
      /**
        * Sets the display size of this Game Object.
        * 
        * Calling this will adjust the scale.
        * @param width The width of this Game Object.
        * @param height The height of this Game Object.
        */
      /* CompleteClass */
      override def setDisplaySize(width: Double, height: Double): this.type = js.native
      
      /**
        * Sets the horizontal and vertical flipped state of this Game Object.
        * 
        * A Game Object that is flipped will render inversed on the flipped axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
        * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
        */
      /* CompleteClass */
      override def setFlip(x: Boolean, y: Boolean): this.type = js.native
      
      /**
        * Sets the horizontal flipped state of this Game Object.
        * 
        * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        * @param value The flipped state. `false` for no flip, or `true` to be flipped.
        */
      /* CompleteClass */
      override def setFlipX(value: Boolean): this.type = js.native
      
      /**
        * Sets the vertical flipped state of this Game Object.
        * @param value The flipped state. `false` for no flip, or `true` to be flipped.
        */
      /* CompleteClass */
      override def setFlipY(value: Boolean): this.type = js.native
      
      /**
        * Sets the mass of the physics body
        * @param value New value for the mass of the body.
        */
      /* CompleteClass */
      override def setMass(value: Double): this.type = js.native
      
      /**
        * **DEPRECATED**: Please use `setBodySize` instead.
        * 
        * Sets the size of this physics body. Setting the size does not adjust the dimensions of the parent Game Object.
        * @param width The new width of the physics body, in pixels.
        * @param height The new height of the physics body, in pixels.
        * @param center Should the body be re-positioned so its center aligns with the parent Game Object? Default true.
        */
      /* InferMemberOverrides */
      override def setSize(width: Double, height: Double): this.type = js.native
      
      /**
        * Sets the size of this Game Object to be that of the given Frame.
        * 
        * This will not change the size that the Game Object is rendered in-game.
        * For that you need to either set the scale of the Game Object (`setScale`) or call the
        * `setDisplaySize` method, which is the same thing as changing the scale but allows you
        * to do so by giving pixel values.
        * 
        * If you have enabled this Game Object for input, changing the size will _not_ change the
        * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
        * @param frame The frame to base the size of this Game Object on.
        */
      /* CompleteClass */
      override def setSizeToFrame(frame: Frame): this.type = js.native
      
      /**
        * Sets the visibility of this Game Object.
        * 
        * An invisible Game Object will skip rendering, but will still process update logic.
        * @param value The visible state of the Game Object.
        */
      /* CompleteClass */
      override def setVisible(value: Boolean): this.type = js.native
      
      /**
        * Toggles the horizontal flipped state of this Game Object.
        * 
        * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        */
      /* CompleteClass */
      override def toggleFlipX(): this.type = js.native
      
      /**
        * Toggles the vertical flipped state of this Game Object.
        */
      /* CompleteClass */
      override def toggleFlipY(): this.type = js.native
      
      /**
        * The visible state of the Game Object.
        * 
        * An invisible Game Object will skip rendering, but will still process update logic.
        */
      /* CompleteClass */
      var visible: Boolean = js.native
      
      /**
        * The native (un-scaled) width of this Game Object.
        * 
        * Changing this value will not change the size that the Game Object is rendered in-game.
        * For that you need to either set the scale of the Game Object (`setScale`) or use
        * the `displayWidth` property.
        */
      /* CompleteClass */
      var width: Double = js.native
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
    @JSImport("phaser", "Physics.Arcade.StaticBody")
    @js.native
    class StaticBody protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Arcade.StaticBody {
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
    @JSImport("phaser", "Physics.Arcade.StaticGroup")
    @js.native
    class StaticGroup protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Arcade.StaticGroup {
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
        children: Unit,
        config: GroupConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Arcade.World,
        scene: typings.phaser.Phaser.Scene,
        children: Unit,
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
    @JSImport("phaser", "Physics.Arcade.TILEMAPLAYER")
    @js.native
    def TILEMAPLAYER: Double = js.native
    @scala.inline
    def TILEMAPLAYER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TILEMAPLAYER")(x.asInstanceOf[js.Any])
    
    object Tilemap {
      
      @JSImport("phaser", "Physics.Arcade.Tilemap")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * A function to process the collision callbacks between a single tile and an Arcade Physics enabled Game Object.
        * @param tile The Tile to process.
        * @param sprite The Game Object to process with the Tile.
        */
      @scala.inline
      def ProcessTileCallbacks(tile: Tile, sprite: typings.phaser.Phaser.GameObjects.Sprite): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ProcessTileCallbacks")(tile.asInstanceOf[js.Any], sprite.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * Internal function to process the separation of a physics body from a tile.
        * @param body The Body object to separate.
        * @param x The x separation amount.
        */
      @scala.inline
      def ProcessTileSeparationX(body: typings.phaser.Phaser.Physics.Arcade.Body, x: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ProcessTileSeparationX")(body.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Internal function to process the separation of a physics body from a tile.
        * @param body The Body object to separate.
        * @param y The y separation amount.
        */
      @scala.inline
      def ProcessTileSeparationY(body: typings.phaser.Phaser.Physics.Arcade.Body, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ProcessTileSeparationY")(body.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
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
      @scala.inline
      def SeparateTile(
        i: Double,
        body: typings.phaser.Phaser.Physics.Arcade.Body,
        tile: Tile,
        tileWorldRect: Rectangle,
        tilemapLayer: DynamicTilemapLayer,
        tileBias: Double,
        isLayer: Boolean
      ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("SeparateTile")(i.asInstanceOf[js.Any], body.asInstanceOf[js.Any], tile.asInstanceOf[js.Any], tileWorldRect.asInstanceOf[js.Any], tilemapLayer.asInstanceOf[js.Any], tileBias.asInstanceOf[js.Any], isLayer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      @scala.inline
      def SeparateTile(
        i: Double,
        body: typings.phaser.Phaser.Physics.Arcade.Body,
        tile: Tile,
        tileWorldRect: Rectangle,
        tilemapLayer: StaticTilemapLayer,
        tileBias: Double,
        isLayer: Boolean
      ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("SeparateTile")(i.asInstanceOf[js.Any], body.asInstanceOf[js.Any], tile.asInstanceOf[js.Any], tileWorldRect.asInstanceOf[js.Any], tilemapLayer.asInstanceOf[js.Any], tileBias.asInstanceOf[js.Any], isLayer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
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
      @scala.inline
      def TileCheckX(
        body: typings.phaser.Phaser.Physics.Arcade.Body,
        tile: Tile,
        tileLeft: Double,
        tileRight: Double,
        tileBias: Double,
        isLayer: Boolean
      ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("TileCheckX")(body.asInstanceOf[js.Any], tile.asInstanceOf[js.Any], tileLeft.asInstanceOf[js.Any], tileRight.asInstanceOf[js.Any], tileBias.asInstanceOf[js.Any], isLayer.asInstanceOf[js.Any])).asInstanceOf[Double]
      
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
      @scala.inline
      def TileCheckY(
        body: typings.phaser.Phaser.Physics.Arcade.Body,
        tile: Tile,
        tileTop: Double,
        tileBottom: Double,
        tileBias: Double,
        isLayer: Boolean
      ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("TileCheckY")(body.asInstanceOf[js.Any], tile.asInstanceOf[js.Any], tileTop.asInstanceOf[js.Any], tileBottom.asInstanceOf[js.Any], tileBias.asInstanceOf[js.Any], isLayer.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Checks for intersection between the given tile rectangle-like object and an Arcade Physics body.
        * @param tileWorldRect A rectangle object that defines the tile placement in the world.
        * @param body The body to check for intersection against.
        */
      @scala.inline
      def TileIntersectsBody(tileWorldRect: js.Object, body: typings.phaser.Phaser.Physics.Arcade.Body): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("TileIntersectsBody")(tileWorldRect.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    }
    
    /**
      * The Arcade Physics World.
      * 
      * The World is responsible for creating, managing, colliding and updating all of the bodies within it.
      * 
      * An instance of the World belongs to a Phaser.Scene and is accessed via the property `physics.world`.
      */
    @JSImport("phaser", "Physics.Arcade.World")
    @js.native
    class World protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Arcade.World {
      /**
        * 
        * @param scene The Scene to which this World instance belongs.
        * @param config An Arcade Physics Configuration object.
        */
      def this(scene: typings.phaser.Phaser.Scene, config: ArcadeWorldConfig) = this()
    }
  }
  
  object Matter {
    
    @JSImport("phaser", "Physics.Matter")
    @js.native
    val ^ : js.Any = js.native
    
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
    @JSImport("phaser", "Physics.Matter.BodyBounds")
    @js.native
    class BodyBounds ()
      extends StObject
         with typings.phaser.Phaser.Physics.Matter.BodyBounds
    
    object Events {
      
      /**
        * The Matter Physics After Add Event.
        * 
        * This event is dispatched by a Matter Physics World instance at the end of the process when a new Body
        * or Constraint has just been added to the world.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('afteradd', listener)`.
        */
      @JSImport("phaser", "Physics.Matter.Events.AFTER_ADD")
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
      @JSImport("phaser", "Physics.Matter.Events.AFTER_REMOVE")
      @js.native
      val AFTER_REMOVE: js.Any = js.native
      
      /**
        * The Matter Physics After Update Event.
        * 
        * This event is dispatched by a Matter Physics World instance after the engine has updated and all collision events have resolved.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('afterupdate', listener)`.
        */
      @JSImport("phaser", "Physics.Matter.Events.AFTER_UPDATE")
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
      @JSImport("phaser", "Physics.Matter.Events.BEFORE_ADD")
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
      @JSImport("phaser", "Physics.Matter.Events.BEFORE_REMOVE")
      @js.native
      val BEFORE_REMOVE: js.Any = js.native
      
      /**
        * The Matter Physics Before Update Event.
        * 
        * This event is dispatched by a Matter Physics World instance right before all the collision processing takes place.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('beforeupdate', listener)`.
        */
      @JSImport("phaser", "Physics.Matter.Events.BEFORE_UPDATE")
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
      @JSImport("phaser", "Physics.Matter.Events.COLLISION_ACTIVE")
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
      @JSImport("phaser", "Physics.Matter.Events.COLLISION_END")
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
      @JSImport("phaser", "Physics.Matter.Events.COLLISION_START")
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
      @JSImport("phaser", "Physics.Matter.Events.DRAG")
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
      @JSImport("phaser", "Physics.Matter.Events.DRAG_END")
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
      @JSImport("phaser", "Physics.Matter.Events.DRAG_START")
      @js.native
      val DRAG_START: js.Any = js.native
      
      /**
        * The Matter Physics World Pause Event.
        * 
        * This event is dispatched by an Matter Physics World instance when it is paused.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('pause', listener)`.
        */
      @JSImport("phaser", "Physics.Matter.Events.PAUSE")
      @js.native
      val PAUSE: js.Any = js.native
      
      /**
        * The Matter Physics World Resume Event.
        * 
        * This event is dispatched by an Matter Physics World instance when it resumes from a paused state.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('resume', listener)`.
        */
      @JSImport("phaser", "Physics.Matter.Events.RESUME")
      @js.native
      val RESUME: js.Any = js.native
      
      /**
        * The Matter Physics Sleep End Event.
        * 
        * This event is dispatched by a Matter Physics World instance when a Body stop sleeping.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('sleepend', listener)`.
        */
      @JSImport("phaser", "Physics.Matter.Events.SLEEP_END")
      @js.native
      val SLEEP_END: js.Any = js.native
      
      /**
        * The Matter Physics Sleep Start Event.
        * 
        * This event is dispatched by a Matter Physics World instance when a Body goes to sleep.
        * 
        * Listen to it from a Scene using: `this.matter.world.on('sleepstart', listener)`.
        */
      @JSImport("phaser", "Physics.Matter.Events.SLEEP_START")
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
    @JSImport("phaser", "Physics.Matter.Factory")
    @js.native
    class Factory protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Matter.Factory {
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
    @JSImport("phaser", "Physics.Matter.Image")
    @js.native
    class Image protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Matter.Image {
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
        frame: String,
        options: MatterBodyConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Matter.World,
        x: Double,
        y: Double,
        texture: String,
        frame: Unit,
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
        frame: String,
        options: MatterBodyConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Matter.World,
        x: Double,
        y: Double,
        texture: Texture,
        frame: Unit,
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
      
      /**
        * Applies a force to a body.
        * @param force A Vector that specifies the force to apply.
        */
      /* CompleteClass */
      override def applyForce(force: Vector2): GameObject = js.native
      
      /**
        * Applies a force to a body from a given position.
        * @param position The position in which the force comes from.
        * @param force A Vector that specifies the force to apply.
        */
      /* CompleteClass */
      override def applyForceFrom(position: Vector2, force: Vector2): GameObject = js.native
      
      /**
        * The body's center of mass.
        * 
        * Calling this creates a new `Vector2 each time to avoid mutation.
        * 
        * If you only need to read the value and won't change it, you can get it from `GameObject.body.centerOfMass`.
        */
      /* CompleteClass */
      override val centerOfMass: Vector2 = js.native
      
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
        */
      /* CompleteClass */
      var depth: Double = js.native
      
      /**
        * The displayed height of this Game Object.
        * 
        * This value takes into account the scale factor.
        * 
        * Setting this value will adjust the Game Object's scale property.
        */
      /* CompleteClass */
      var displayHeight: Double = js.native
      
      /**
        * The displayed width of this Game Object.
        * 
        * This value takes into account the scale factor.
        * 
        * Setting this value will adjust the Game Object's scale property.
        */
      /* CompleteClass */
      var displayWidth: Double = js.native
      
      /**
        * The horizontally flipped state of the Game Object.
        * 
        * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        */
      /* CompleteClass */
      var flipX: Boolean = js.native
      
      /**
        * The vertically flipped state of the Game Object.
        * 
        * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        */
      /* CompleteClass */
      var flipY: Boolean = js.native
      
      /**
        * The native (un-scaled) height of this Game Object.
        * 
        * Changing this value will not change the size that the Game Object is rendered in-game.
        * For that you need to either set the scale of the Game Object (`setScale`) or use
        * the `displayHeight` property.
        */
      /* CompleteClass */
      var height: Double = js.native
      
      /**
        * Is the body belonging to this Game Object a sensor or not?
        */
      /* CompleteClass */
      override def isSensor(): Boolean = js.native
      
      /**
        * Returns `true` if the body is static, otherwise `false` for a dynamic body.
        */
      /* CompleteClass */
      override def isStatic(): Boolean = js.native
      
      /**
        * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
        */
      /* CompleteClass */
      override def resetFlip(): this.type = js.native
      
      /**
        * Sets the restitution on the physics object.
        * @param value A Number that defines the restitution (elasticity) of the body. The value is always positive and is in the range (0, 1). A value of 0 means collisions may be perfectly inelastic and no bouncing may occur. A value of 0.8 means the body may bounce back with approximately 80% of its kinetic energy. Note that collision response is based on pairs of bodies, and that restitution values are combined with the following formula: `Math.max(bodyA.restitution, bodyB.restitution)`
        */
      /* CompleteClass */
      override def setBounce(value: Double): GameObject = js.native
      
      /**
        * Sets density of the body.
        * @param value The new density of the body.
        */
      /* CompleteClass */
      override def setDensity(value: Double): GameObject = js.native
      
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
        * @param value The depth of this Game Object.
        */
      /* CompleteClass */
      override def setDepth(value: integer): this.type = js.native
      
      /**
        * Sets the display size of this Game Object.
        * 
        * Calling this will adjust the scale.
        * @param width The width of this Game Object.
        * @param height The height of this Game Object.
        */
      /* CompleteClass */
      override def setDisplaySize(width: Double, height: Double): this.type = js.native
      
      /**
        * Sets the horizontal and vertical flipped state of this Game Object.
        * 
        * A Game Object that is flipped will render inversed on the flipped axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
        * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
        */
      /* CompleteClass */
      override def setFlip(x: Boolean, y: Boolean): this.type = js.native
      
      /**
        * Sets the horizontal flipped state of this Game Object.
        * 
        * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        * @param value The flipped state. `false` for no flip, or `true` to be flipped.
        */
      /* CompleteClass */
      override def setFlipX(value: Boolean): this.type = js.native
      
      /**
        * Sets the vertical flipped state of this Game Object.
        * @param value The flipped state. `false` for no flip, or `true` to be flipped.
        */
      /* CompleteClass */
      override def setFlipY(value: Boolean): this.type = js.native
      
      /**
        * A togglable function for ignoring world gravity in real-time on the current body.
        * @param value Set to true to ignore the effect of world gravity, or false to not ignore it.
        */
      /* CompleteClass */
      override def setIgnoreGravity(value: Boolean): GameObject = js.native
      
      /**
        * Sets the mass of the Game Object's Matter Body.
        * @param value The new mass of the body.
        */
      /* CompleteClass */
      override def setMass(value: Double): GameObject = js.native
      
      /**
        * Set the body belonging to this Game Object to be a sensor.
        * Sensors trigger collision events, but don't react with colliding body physically.
        * @param value `true` to set the body as a sensor, or `false` to disable it.
        */
      /* CompleteClass */
      override def setSensor(value: Boolean): GameObject = js.native
      
      /**
        * Sets the internal size of this Game Object, as used for frame or physics body creation.
        * 
        * This will not change the size that the Game Object is rendered in-game.
        * For that you need to either set the scale of the Game Object (`setScale`) or call the
        * `setDisplaySize` method, which is the same thing as changing the scale but allows you
        * to do so by giving pixel values.
        * 
        * If you have enabled this Game Object for input, changing the size will _not_ change the
        * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
        * @param width The width of this Game Object.
        * @param height The height of this Game Object.
        */
      /* CompleteClass */
      override def setSize(width: Double, height: Double): this.type = js.native
      
      /**
        * Sets the size of this Game Object to be that of the given Frame.
        * 
        * This will not change the size that the Game Object is rendered in-game.
        * For that you need to either set the scale of the Game Object (`setScale`) or call the
        * `setDisplaySize` method, which is the same thing as changing the scale but allows you
        * to do so by giving pixel values.
        * 
        * If you have enabled this Game Object for input, changing the size will _not_ change the
        * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
        * @param frame The frame to base the size of this Game Object on.
        */
      /* CompleteClass */
      override def setSizeToFrame(frame: Frame): this.type = js.native
      
      /**
        * Changes the physics body to be either static `true` or dynamic `false`.
        * @param value `true` to set the body as being static, or `false` to make it dynamic.
        */
      /* CompleteClass */
      override def setStatic(value: Boolean): GameObject = js.native
      
      /**
        * Sets the visibility of this Game Object.
        * 
        * An invisible Game Object will skip rendering, but will still process update logic.
        * @param value The visible state of the Game Object.
        */
      /* CompleteClass */
      override def setVisible(value: Boolean): this.type = js.native
      
      /**
        * Apply thrust to the forward position of the body.
        * 
        * Use very small values, such as 0.1, depending on the mass and required speed.
        * @param speed A speed value to be applied to a directional force.
        */
      /* CompleteClass */
      override def thrust(speed: Double): GameObject = js.native
      
      /**
        * Apply thrust to the back position of the body.
        * 
        * Use very small values, such as 0.1, depending on the mass and required speed.
        * @param speed A speed value to be applied to a directional force.
        */
      /* CompleteClass */
      override def thrustBack(speed: Double): GameObject = js.native
      
      /**
        * Apply thrust to the left position of the body.
        * 
        * Use very small values, such as 0.1, depending on the mass and required speed.
        * @param speed A speed value to be applied to a directional force.
        */
      /* CompleteClass */
      override def thrustLeft(speed: Double): GameObject = js.native
      
      /**
        * Apply thrust to the right position of the body.
        * 
        * Use very small values, such as 0.1, depending on the mass and required speed.
        * @param speed A speed value to be applied to a directional force.
        */
      /* CompleteClass */
      override def thrustRight(speed: Double): GameObject = js.native
      
      /**
        * Toggles the horizontal flipped state of this Game Object.
        * 
        * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        */
      /* CompleteClass */
      override def toggleFlipX(): this.type = js.native
      
      /**
        * Toggles the vertical flipped state of this Game Object.
        */
      /* CompleteClass */
      override def toggleFlipY(): this.type = js.native
      
      /**
        * The visible state of the Game Object.
        * 
        * An invisible Game Object will skip rendering, but will still process update logic.
        */
      /* CompleteClass */
      var visible: Boolean = js.native
      
      /**
        * The native (un-scaled) width of this Game Object.
        * 
        * Changing this value will not change the size that the Game Object is rendered in-game.
        * For that you need to either set the scale of the Game Object (`setScale`) or use
        * the `displayWidth` property.
        */
      /* CompleteClass */
      var width: Double = js.native
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
    @scala.inline
    def MatterGameObject(world: typings.phaser.Phaser.Physics.Matter.World, gameObject: GameObject): GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("MatterGameObject")(world.asInstanceOf[js.Any], gameObject.asInstanceOf[js.Any])).asInstanceOf[GameObject]
    @scala.inline
    def MatterGameObject(
      world: typings.phaser.Phaser.Physics.Matter.World,
      gameObject: GameObject,
      options: Unit,
      addToWorld: Boolean
    ): GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("MatterGameObject")(world.asInstanceOf[js.Any], gameObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], addToWorld.asInstanceOf[js.Any])).asInstanceOf[GameObject]
    @scala.inline
    def MatterGameObject(world: typings.phaser.Phaser.Physics.Matter.World, gameObject: GameObject, options: Body): GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("MatterGameObject")(world.asInstanceOf[js.Any], gameObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GameObject]
    @scala.inline
    def MatterGameObject(
      world: typings.phaser.Phaser.Physics.Matter.World,
      gameObject: GameObject,
      options: Body,
      addToWorld: Boolean
    ): GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("MatterGameObject")(world.asInstanceOf[js.Any], gameObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], addToWorld.asInstanceOf[js.Any])).asInstanceOf[GameObject]
    @scala.inline
    def MatterGameObject(
      world: typings.phaser.Phaser.Physics.Matter.World,
      gameObject: GameObject,
      options: MatterBodyConfig
    ): GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("MatterGameObject")(world.asInstanceOf[js.Any], gameObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GameObject]
    @scala.inline
    def MatterGameObject(
      world: typings.phaser.Phaser.Physics.Matter.World,
      gameObject: GameObject,
      options: MatterBodyConfig,
      addToWorld: Boolean
    ): GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("MatterGameObject")(world.asInstanceOf[js.Any], gameObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], addToWorld.asInstanceOf[js.Any])).asInstanceOf[GameObject]
    
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
    @JSImport("phaser", "Physics.Matter.MatterPhysics")
    @js.native
    class MatterPhysics protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Matter.MatterPhysics {
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
      
      @JSImport("phaser", "Physics.Matter.PhysicsEditorParser")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Parses a body element exported by PhysicsEditor.
        * @param x The horizontal world location of the body.
        * @param y The vertical world location of the body.
        * @param config The body configuration and fixture (child body) definitions, as exported by PhysicsEditor.
        * @param options An optional Body configuration object that is used to set initial Body properties on creation.
        */
      @scala.inline
      def parseBody(x: Double, y: Double, config: js.Object): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBody")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[BodyType]
      @scala.inline
      def parseBody(x: Double, y: Double, config: js.Object, options: MatterBodyConfig): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBody")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BodyType]
      
      /**
        * Parses an element of the "fixtures" list exported by PhysicsEditor
        * @param fixtureConfig The fixture object to parse.
        */
      @scala.inline
      def parseFixture(fixtureConfig: js.Object): js.Array[BodyType] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFixture")(fixtureConfig.asInstanceOf[js.Any]).asInstanceOf[js.Array[BodyType]]
      
      /**
        * Parses the "vertices" lists exported by PhysicsEditor.
        * @param vertexSets The vertex lists to parse.
        * @param options An optional Body configuration object that is used to set initial Body properties on creation.
        */
      @scala.inline
      def parseVertices(vertexSets: js.Array[js.Any]): js.Array[BodyType] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseVertices")(vertexSets.asInstanceOf[js.Any]).asInstanceOf[js.Array[BodyType]]
      @scala.inline
      def parseVertices(vertexSets: js.Array[js.Any], options: MatterBodyConfig): js.Array[BodyType] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseVertices")(vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[BodyType]]
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
      
      @JSImport("phaser", "Physics.Matter.PhysicsJSONParser")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Parses a body element from the given JSON data.
        * @param x The horizontal world location of the body.
        * @param y The vertical world location of the body.
        * @param config The body configuration data.
        * @param options An optional Body configuration object that is used to set initial Body properties on creation.
        */
      @scala.inline
      def parseBody(x: Double, y: Double, config: js.Object): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBody")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[BodyType]
      @scala.inline
      def parseBody(x: Double, y: Double, config: js.Object, options: MatterBodyConfig): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBody")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BodyType]
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
    @JSImport("phaser", "Physics.Matter.PointerConstraint")
    @js.native
    class PointerConstraint protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Matter.PointerConstraint {
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
      
      /**
        * Is this Constraint active or not?
        * 
        * An active constraint will be processed each update. An inactive one will be skipped.
        * Use this to toggle a Pointer Constraint on and off.
        */
      /* CompleteClass */
      var active: Boolean = js.native
      
      /**
        * The body that is currently being dragged, if any.
        */
      /* CompleteClass */
      var body: BodyType = js.native
      
      /**
        * The Camera the Pointer was interacting with when the input
        * down event was processed.
        */
      /* CompleteClass */
      var camera: Camera = js.native
      
      /**
        * The native Matter Constraint that is used to attach to bodies.
        */
      /* CompleteClass */
      var constraint: ConstraintType = js.native
      
      /**
        * Destroys this Pointer Constraint instance and all of its references.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * Scans all active bodies in the current Matter World to see if any of them
        * are hit by the Pointer. The _first one_ found to hit is set as the active contraint
        * body.
        */
      /* CompleteClass */
      override def getBody(): Boolean = js.native
      
      /**
        * Scans the current body to determine if a part of it was clicked on.
        * If a part is found the body is set as the `constraint.bodyB` property,
        * as well as the `body` property of this class. The part is also set.
        * @param body The Matter Body to check.
        * @param position A translated hit test position.
        */
      /* CompleteClass */
      override def hitTestBody(body: BodyType, position: Vector2): Boolean = js.native
      
      /**
        * A Pointer has been pressed down onto the Scene.
        * 
        * If this Constraint doesn't have an active Pointer then a hit test is set to
        * run against all active bodies in the world during the _next_ call to `update`.
        * If a body is found, it is bound to this constraint and the drag begins.
        * @param pointer A reference to the Pointer that was pressed.
        */
      /* CompleteClass */
      override def onDown(pointer: Pointer): Unit = js.native
      
      /**
        * A Pointer has been released from the Scene. If it was the one this constraint was using, it's cleared.
        * @param pointer A reference to the Pointer that was pressed.
        */
      /* CompleteClass */
      override def onUp(pointer: Pointer): Unit = js.native
      
      /**
        * The part of the body that was clicked on to start the drag.
        */
      /* CompleteClass */
      var part: BodyType = js.native
      
      /**
        * A reference to the Input Pointer that activated this Constraint.
        * This is set in the `onDown` handler.
        */
      /* CompleteClass */
      var pointer: Pointer = js.native
      
      /**
        * The internal transformed position.
        */
      /* CompleteClass */
      var position: Vector2 = js.native
      
      /**
        * A reference to the Scene to which this Pointer Constraint belongs.
        * This is the same Scene as the Matter World instance.
        */
      /* CompleteClass */
      var scene: typings.phaser.Phaser.Scene = js.native
      
      /**
        * Stops the Pointer Constraint from dragging the body any further.
        * 
        * This is called automatically if the Pointer is released while actively
        * dragging a body. Or, you can call it manually to release a body from a
        * constraint without having to first release the pointer.
        */
      /* CompleteClass */
      override def stopDrag(): Unit = js.native
      
      /**
        * Internal update handler. Called in the Matter BEFORE_UPDATE step.
        */
      /* CompleteClass */
      override def update(): Unit = js.native
      
      /**
        * A reference to the Matter World instance to which this Constraint belongs.
        */
      /* CompleteClass */
      var world: typings.phaser.Phaser.Physics.Matter.World = js.native
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
    @JSImport("phaser", "Physics.Matter.Sprite")
    @js.native
    class Sprite protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Matter.Sprite {
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
        frame: String,
        options: MatterBodyConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Matter.World,
        x: Double,
        y: Double,
        texture: String,
        frame: Unit,
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
        frame: String,
        options: MatterBodyConfig
      ) = this()
      def this(
        world: typings.phaser.Phaser.Physics.Matter.World,
        x: Double,
        y: Double,
        texture: Texture,
        frame: Unit,
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
      
      /**
        * Applies a force to a body.
        * @param force A Vector that specifies the force to apply.
        */
      /* CompleteClass */
      override def applyForce(force: Vector2): GameObject = js.native
      
      /**
        * Applies a force to a body from a given position.
        * @param position The position in which the force comes from.
        * @param force A Vector that specifies the force to apply.
        */
      /* CompleteClass */
      override def applyForceFrom(position: Vector2, force: Vector2): GameObject = js.native
      
      /**
        * The body's center of mass.
        * 
        * Calling this creates a new `Vector2 each time to avoid mutation.
        * 
        * If you only need to read the value and won't change it, you can get it from `GameObject.body.centerOfMass`.
        */
      /* CompleteClass */
      override val centerOfMass: Vector2 = js.native
      
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
        */
      /* CompleteClass */
      var depth: Double = js.native
      
      /**
        * The displayed height of this Game Object.
        * 
        * This value takes into account the scale factor.
        * 
        * Setting this value will adjust the Game Object's scale property.
        */
      /* CompleteClass */
      var displayHeight: Double = js.native
      
      /**
        * The displayed width of this Game Object.
        * 
        * This value takes into account the scale factor.
        * 
        * Setting this value will adjust the Game Object's scale property.
        */
      /* CompleteClass */
      var displayWidth: Double = js.native
      
      /**
        * The horizontally flipped state of the Game Object.
        * 
        * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        */
      /* CompleteClass */
      var flipX: Boolean = js.native
      
      /**
        * The vertically flipped state of the Game Object.
        * 
        * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        */
      /* CompleteClass */
      var flipY: Boolean = js.native
      
      /**
        * The native (un-scaled) height of this Game Object.
        * 
        * Changing this value will not change the size that the Game Object is rendered in-game.
        * For that you need to either set the scale of the Game Object (`setScale`) or use
        * the `displayHeight` property.
        */
      /* CompleteClass */
      var height: Double = js.native
      
      /**
        * Is the body belonging to this Game Object a sensor or not?
        */
      /* CompleteClass */
      override def isSensor(): Boolean = js.native
      
      /**
        * Returns `true` if the body is static, otherwise `false` for a dynamic body.
        */
      /* CompleteClass */
      override def isStatic(): Boolean = js.native
      
      /**
        * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
        */
      /* CompleteClass */
      override def resetFlip(): this.type = js.native
      
      /**
        * Sets the restitution on the physics object.
        * @param value A Number that defines the restitution (elasticity) of the body. The value is always positive and is in the range (0, 1). A value of 0 means collisions may be perfectly inelastic and no bouncing may occur. A value of 0.8 means the body may bounce back with approximately 80% of its kinetic energy. Note that collision response is based on pairs of bodies, and that restitution values are combined with the following formula: `Math.max(bodyA.restitution, bodyB.restitution)`
        */
      /* CompleteClass */
      override def setBounce(value: Double): GameObject = js.native
      
      /**
        * Sets density of the body.
        * @param value The new density of the body.
        */
      /* CompleteClass */
      override def setDensity(value: Double): GameObject = js.native
      
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
        * @param value The depth of this Game Object.
        */
      /* CompleteClass */
      override def setDepth(value: integer): this.type = js.native
      
      /**
        * Sets the display size of this Game Object.
        * 
        * Calling this will adjust the scale.
        * @param width The width of this Game Object.
        * @param height The height of this Game Object.
        */
      /* CompleteClass */
      override def setDisplaySize(width: Double, height: Double): this.type = js.native
      
      /**
        * Sets the horizontal and vertical flipped state of this Game Object.
        * 
        * A Game Object that is flipped will render inversed on the flipped axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
        * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
        */
      /* CompleteClass */
      override def setFlip(x: Boolean, y: Boolean): this.type = js.native
      
      /**
        * Sets the horizontal flipped state of this Game Object.
        * 
        * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        * @param value The flipped state. `false` for no flip, or `true` to be flipped.
        */
      /* CompleteClass */
      override def setFlipX(value: Boolean): this.type = js.native
      
      /**
        * Sets the vertical flipped state of this Game Object.
        * @param value The flipped state. `false` for no flip, or `true` to be flipped.
        */
      /* CompleteClass */
      override def setFlipY(value: Boolean): this.type = js.native
      
      /**
        * A togglable function for ignoring world gravity in real-time on the current body.
        * @param value Set to true to ignore the effect of world gravity, or false to not ignore it.
        */
      /* CompleteClass */
      override def setIgnoreGravity(value: Boolean): GameObject = js.native
      
      /**
        * Sets the mass of the Game Object's Matter Body.
        * @param value The new mass of the body.
        */
      /* CompleteClass */
      override def setMass(value: Double): GameObject = js.native
      
      /**
        * Set the body belonging to this Game Object to be a sensor.
        * Sensors trigger collision events, but don't react with colliding body physically.
        * @param value `true` to set the body as a sensor, or `false` to disable it.
        */
      /* CompleteClass */
      override def setSensor(value: Boolean): GameObject = js.native
      
      /**
        * Sets the internal size of this Game Object, as used for frame or physics body creation.
        * 
        * This will not change the size that the Game Object is rendered in-game.
        * For that you need to either set the scale of the Game Object (`setScale`) or call the
        * `setDisplaySize` method, which is the same thing as changing the scale but allows you
        * to do so by giving pixel values.
        * 
        * If you have enabled this Game Object for input, changing the size will _not_ change the
        * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
        * @param width The width of this Game Object.
        * @param height The height of this Game Object.
        */
      /* CompleteClass */
      override def setSize(width: Double, height: Double): this.type = js.native
      
      /**
        * Sets the size of this Game Object to be that of the given Frame.
        * 
        * This will not change the size that the Game Object is rendered in-game.
        * For that you need to either set the scale of the Game Object (`setScale`) or call the
        * `setDisplaySize` method, which is the same thing as changing the scale but allows you
        * to do so by giving pixel values.
        * 
        * If you have enabled this Game Object for input, changing the size will _not_ change the
        * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
        * @param frame The frame to base the size of this Game Object on.
        */
      /* CompleteClass */
      override def setSizeToFrame(frame: Frame): this.type = js.native
      
      /**
        * Changes the physics body to be either static `true` or dynamic `false`.
        * @param value `true` to set the body as being static, or `false` to make it dynamic.
        */
      /* CompleteClass */
      override def setStatic(value: Boolean): GameObject = js.native
      
      /**
        * Sets the visibility of this Game Object.
        * 
        * An invisible Game Object will skip rendering, but will still process update logic.
        * @param value The visible state of the Game Object.
        */
      /* CompleteClass */
      override def setVisible(value: Boolean): this.type = js.native
      
      /**
        * Apply thrust to the forward position of the body.
        * 
        * Use very small values, such as 0.1, depending on the mass and required speed.
        * @param speed A speed value to be applied to a directional force.
        */
      /* CompleteClass */
      override def thrust(speed: Double): GameObject = js.native
      
      /**
        * Apply thrust to the back position of the body.
        * 
        * Use very small values, such as 0.1, depending on the mass and required speed.
        * @param speed A speed value to be applied to a directional force.
        */
      /* CompleteClass */
      override def thrustBack(speed: Double): GameObject = js.native
      
      /**
        * Apply thrust to the left position of the body.
        * 
        * Use very small values, such as 0.1, depending on the mass and required speed.
        * @param speed A speed value to be applied to a directional force.
        */
      /* CompleteClass */
      override def thrustLeft(speed: Double): GameObject = js.native
      
      /**
        * Apply thrust to the right position of the body.
        * 
        * Use very small values, such as 0.1, depending on the mass and required speed.
        * @param speed A speed value to be applied to a directional force.
        */
      /* CompleteClass */
      override def thrustRight(speed: Double): GameObject = js.native
      
      /**
        * Toggles the horizontal flipped state of this Game Object.
        * 
        * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        */
      /* CompleteClass */
      override def toggleFlipX(): this.type = js.native
      
      /**
        * Toggles the vertical flipped state of this Game Object.
        */
      /* CompleteClass */
      override def toggleFlipY(): this.type = js.native
      
      /**
        * The visible state of the Game Object.
        * 
        * An invisible Game Object will skip rendering, but will still process update logic.
        */
      /* CompleteClass */
      var visible: Boolean = js.native
      
      /**
        * The native (un-scaled) width of this Game Object.
        * 
        * Changing this value will not change the size that the Game Object is rendered in-game.
        * For that you need to either set the scale of the Game Object (`setScale`) or use
        * the `displayWidth` property.
        */
      /* CompleteClass */
      var width: Double = js.native
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
    @JSImport("phaser", "Physics.Matter.TileBody")
    @js.native
    class TileBody protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Matter.TileBody {
      /**
        * 
        * @param world The Matter world instance this body belongs to.
        * @param tile The target tile that should have a Matter body.
        * @param options Options to be used when creating the Matter body.
        */
      def this(world: typings.phaser.Phaser.Physics.Matter.World, tile: Tile) = this()
      def this(world: typings.phaser.Phaser.Physics.Matter.World, tile: Tile, options: MatterTileOptions) = this()
      
      /**
        * The body's center of mass.
        * 
        * Calling this creates a new `Vector2 each time to avoid mutation.
        * 
        * If you only need to read the value and won't change it, you can get it from `GameObject.body.centerOfMass`.
        */
      /* CompleteClass */
      override val centerOfMass: Vector2 = js.native
      
      /**
        * Is the body belonging to this Game Object a sensor or not?
        */
      /* CompleteClass */
      override def isSensor(): Boolean = js.native
      
      /**
        * Returns `true` if the body is static, otherwise `false` for a dynamic body.
        */
      /* CompleteClass */
      override def isStatic(): Boolean = js.native
      
      /**
        * Sets the restitution on the physics object.
        * @param value A Number that defines the restitution (elasticity) of the body. The value is always positive and is in the range (0, 1). A value of 0 means collisions may be perfectly inelastic and no bouncing may occur. A value of 0.8 means the body may bounce back with approximately 80% of its kinetic energy. Note that collision response is based on pairs of bodies, and that restitution values are combined with the following formula: `Math.max(bodyA.restitution, bodyB.restitution)`
        */
      /* CompleteClass */
      override def setBounce(value: Double): GameObject = js.native
      
      /**
        * Sets density of the body.
        * @param value The new density of the body.
        */
      /* CompleteClass */
      override def setDensity(value: Double): GameObject = js.native
      
      /**
        * A togglable function for ignoring world gravity in real-time on the current body.
        * @param value Set to true to ignore the effect of world gravity, or false to not ignore it.
        */
      /* CompleteClass */
      override def setIgnoreGravity(value: Boolean): GameObject = js.native
      
      /**
        * Sets the mass of the Game Object's Matter Body.
        * @param value The new mass of the body.
        */
      /* CompleteClass */
      override def setMass(value: Double): GameObject = js.native
      
      /**
        * Set the body belonging to this Game Object to be a sensor.
        * Sensors trigger collision events, but don't react with colliding body physically.
        * @param value `true` to set the body as a sensor, or `false` to disable it.
        */
      /* CompleteClass */
      override def setSensor(value: Boolean): GameObject = js.native
      
      /**
        * Changes the physics body to be either static `true` or dynamic `false`.
        * @param value `true` to set the body as being static, or `false` to make it dynamic.
        */
      /* CompleteClass */
      override def setStatic(value: Boolean): GameObject = js.native
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
    @JSImport("phaser", "Physics.Matter.World")
    @js.native
    class World protected ()
      extends StObject
         with typings.phaser.Phaser.Physics.Matter.World {
      /**
        * 
        * @param scene The Scene to which this Matter World instance belongs.
        * @param config The Matter World configuration object.
        */
      def this(scene: typings.phaser.Phaser.Scene, config: MatterWorldConfig) = this()
    }
  }
}

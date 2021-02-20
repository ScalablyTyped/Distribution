package typings.phaser.Phaser.Types.Physics

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Physics.Arcade.Group
import typings.phaser.Phaser.Physics.Arcade.Image
import typings.phaser.Phaser.Physics.Arcade.Sprite
import typings.phaser.Phaser.Physics.Arcade.StaticGroup
import typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer
import typings.phaser.Phaser.Tilemaps.StaticTilemapLayer
import typings.phaser.Phaser.Types.GameObjects.Group.GroupCallback
import typings.phaser.Phaser.Types.GameObjects.Group.GroupMultipleCreateCallback
import typings.phaser.Phaser.Types.Math.Vector2Like
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Arcade {
  
  @js.native
  trait ArcadeBodyBounds extends StObject {
    
    /**
      * The lower edge.
      */
    var bottom: Double = js.native
    
    /**
      * The right edge.
      */
    var right: Double = js.native
    
    /**
      * The left edge.
      */
    var x: Double = js.native
    
    /**
      * The upper edge.
      */
    var y: Double = js.native
  }
  object ArcadeBodyBounds {
    
    @scala.inline
    def apply(bottom: Double, right: Double, x: Double, y: Double): ArcadeBodyBounds = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcadeBodyBounds]
    }
    
    @scala.inline
    implicit class ArcadeBodyBoundsMutableBuilder[Self <: ArcadeBodyBounds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ArcadeBodyCollision extends StObject {
    
    /**
      * True if the Body is colliding on its lower edge.
      */
    var down: Boolean = js.native
    
    /**
      * True if the Body is colliding on its left edge.
      */
    var left: Boolean = js.native
    
    /**
      * True if the Body is not colliding.
      */
    var none: Boolean = js.native
    
    /**
      * True if the Body is colliding on its right edge.
      */
    var right: Boolean = js.native
    
    /**
      * True if the Body is colliding on its upper edge.
      */
    var up: Boolean = js.native
  }
  object ArcadeBodyCollision {
    
    @scala.inline
    def apply(down: Boolean, left: Boolean, none: Boolean, right: Boolean, up: Boolean): ArcadeBodyCollision = {
      val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcadeBodyCollision]
    }
    
    @scala.inline
    implicit class ArcadeBodyCollisionMutableBuilder[Self <: ArcadeBodyCollision] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDown(value: Boolean): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNone(value: Boolean): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUp(value: Boolean): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An Arcade Physics Collider Type.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.phaser.Phaser.GameObjects.GameObject
    - typings.phaser.Phaser.GameObjects.Group
    - typings.phaser.Phaser.Physics.Arcade.Sprite
    - typings.phaser.Phaser.Physics.Arcade.Image
    - typings.phaser.Phaser.Physics.Arcade.StaticGroup
    - typings.phaser.Phaser.Physics.Arcade.Group
    - typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer
    - typings.phaser.Phaser.Tilemaps.StaticTilemapLayer
    - js.Array[
  typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer | typings.phaser.Phaser.GameObjects.GameObject | typings.phaser.Phaser.Physics.Arcade.Group | typings.phaser.Phaser.Physics.Arcade.Image | typings.phaser.Phaser.Physics.Arcade.Sprite | typings.phaser.Phaser.Physics.Arcade.StaticGroup | typings.phaser.Phaser.Tilemaps.StaticTilemapLayer]
  */
  type ArcadeColliderType = _ArcadeColliderType | (js.Array[
    DynamicTilemapLayer | GameObject | Group | Image | Sprite | StaticGroup | StaticTilemapLayer
  ])
  
  @js.native
  trait ArcadeWorldConfig extends StObject {
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#checkCollision}.
      */
    var checkCollision: js.UndefOr[CheckCollisionObject] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#debug}.
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#defaults bodyDebugColor}.
      */
    var debugBodyColor: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowBody}.
      */
    var debugShowBody: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowStaticBody}.
      */
    var debugShowStaticBody: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowStaticBody}.
      */
    var debugShowVelocity: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#defaults staticBodyDebugColor}.
      */
    var debugStaticBodyColor: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#defaults velocityDebugColor}.
      */
    var debugVelocityColor: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#forceX}.
      */
    var forceX: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#fps}.
      */
    var fps: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#gravity}.
      */
    var gravity: js.UndefOr[Vector2Like] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.height}.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#isPaused}.
      */
    var isPaused: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#maxEntries}.
      */
    var maxEntries: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#OVERLAP_BIAS}.
      */
    var overlapBias: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#TILE_BIAS}.
      */
    var tileBias: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#timeScale}.
      */
    var timeScale: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#useTree}.
      */
    var useTree: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.width}.
      */
    var width: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.x}.
      */
    var x: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.y}.
      */
    var y: js.UndefOr[Double] = js.native
  }
  object ArcadeWorldConfig {
    
    @scala.inline
    def apply(): ArcadeWorldConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArcadeWorldConfig]
    }
    
    @scala.inline
    implicit class ArcadeWorldConfigMutableBuilder[Self <: ArcadeWorldConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckCollision(value: CheckCollisionObject): Self = StObject.set(x, "checkCollision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckCollisionUndefined: Self = StObject.set(x, "checkCollision", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugBodyColor(value: Double): Self = StObject.set(x, "debugBodyColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugBodyColorUndefined: Self = StObject.set(x, "debugBodyColor", js.undefined)
      
      @scala.inline
      def setDebugShowBody(value: Boolean): Self = StObject.set(x, "debugShowBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugShowBodyUndefined: Self = StObject.set(x, "debugShowBody", js.undefined)
      
      @scala.inline
      def setDebugShowStaticBody(value: Boolean): Self = StObject.set(x, "debugShowStaticBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugShowStaticBodyUndefined: Self = StObject.set(x, "debugShowStaticBody", js.undefined)
      
      @scala.inline
      def setDebugShowVelocity(value: Boolean): Self = StObject.set(x, "debugShowVelocity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugShowVelocityUndefined: Self = StObject.set(x, "debugShowVelocity", js.undefined)
      
      @scala.inline
      def setDebugStaticBodyColor(value: Double): Self = StObject.set(x, "debugStaticBodyColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugStaticBodyColorUndefined: Self = StObject.set(x, "debugStaticBodyColor", js.undefined)
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDebugVelocityColor(value: Double): Self = StObject.set(x, "debugVelocityColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugVelocityColorUndefined: Self = StObject.set(x, "debugVelocityColor", js.undefined)
      
      @scala.inline
      def setForceX(value: Boolean): Self = StObject.set(x, "forceX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceXUndefined: Self = StObject.set(x, "forceX", js.undefined)
      
      @scala.inline
      def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
      
      @scala.inline
      def setGravity(value: Vector2Like): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPausedUndefined: Self = StObject.set(x, "isPaused", js.undefined)
      
      @scala.inline
      def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
      
      @scala.inline
      def setOverlapBias(value: Double): Self = StObject.set(x, "overlapBias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlapBiasUndefined: Self = StObject.set(x, "overlapBias", js.undefined)
      
      @scala.inline
      def setTileBias(value: Double): Self = StObject.set(x, "tileBias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileBiasUndefined: Self = StObject.set(x, "tileBias", js.undefined)
      
      @scala.inline
      def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeScaleUndefined: Self = StObject.set(x, "timeScale", js.undefined)
      
      @scala.inline
      def setUseTree(value: Boolean): Self = StObject.set(x, "useTree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTreeUndefined: Self = StObject.set(x, "useTree", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait ArcadeWorldDefaults extends StObject {
    
    /**
      * The color of dynamic body outlines when rendered to the debug display.
      */
    var bodyDebugColor: Double = js.native
    
    /**
      * Set to `true` to render dynamic body outlines to the debug display.
      */
    var debugShowBody: Boolean = js.native
    
    /**
      * Set to `true` to render static body outlines to the debug display.
      */
    var debugShowStaticBody: Boolean = js.native
    
    /**
      * Set to `true` to render body velocity markers to the debug display.
      */
    var debugShowVelocity: Boolean = js.native
    
    /**
      * The color of static body outlines when rendered to the debug display.
      */
    var staticBodyDebugColor: Double = js.native
    
    /**
      * The color of the velocity markers when rendered to the debug display.
      */
    var velocityDebugColor: Double = js.native
  }
  object ArcadeWorldDefaults {
    
    @scala.inline
    def apply(
      bodyDebugColor: Double,
      debugShowBody: Boolean,
      debugShowStaticBody: Boolean,
      debugShowVelocity: Boolean,
      staticBodyDebugColor: Double,
      velocityDebugColor: Double
    ): ArcadeWorldDefaults = {
      val __obj = js.Dynamic.literal(bodyDebugColor = bodyDebugColor.asInstanceOf[js.Any], debugShowBody = debugShowBody.asInstanceOf[js.Any], debugShowStaticBody = debugShowStaticBody.asInstanceOf[js.Any], debugShowVelocity = debugShowVelocity.asInstanceOf[js.Any], staticBodyDebugColor = staticBodyDebugColor.asInstanceOf[js.Any], velocityDebugColor = velocityDebugColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcadeWorldDefaults]
    }
    
    @scala.inline
    implicit class ArcadeWorldDefaultsMutableBuilder[Self <: ArcadeWorldDefaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyDebugColor(value: Double): Self = StObject.set(x, "bodyDebugColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugShowBody(value: Boolean): Self = StObject.set(x, "debugShowBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugShowStaticBody(value: Boolean): Self = StObject.set(x, "debugShowStaticBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugShowVelocity(value: Boolean): Self = StObject.set(x, "debugShowVelocity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticBodyDebugColor(value: Double): Self = StObject.set(x, "staticBodyDebugColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocityDebugColor(value: Double): Self = StObject.set(x, "velocityDebugColor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ArcadeWorldTreeMinMax extends StObject {
    
    /**
      * The maximum x value used in RTree searches.
      */
    var maxX: Double = js.native
    
    /**
      * The maximum y value used in RTree searches.
      */
    var maxY: Double = js.native
    
    /**
      * The minimum x value used in RTree searches.
      */
    var minX: Double = js.native
    
    /**
      * The minimum y value used in RTree searches.
      */
    var minY: Double = js.native
  }
  object ArcadeWorldTreeMinMax {
    
    @scala.inline
    def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): ArcadeWorldTreeMinMax = {
      val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcadeWorldTreeMinMax]
    }
    
    @scala.inline
    implicit class ArcadeWorldTreeMinMaxMutableBuilder[Self <: ArcadeWorldTreeMinMax] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CheckCollisionObject extends StObject {
    
    /**
      * Will bodies collide with the bottom side of the world bounds?
      */
    var down: Boolean = js.native
    
    /**
      * Will bodies collide with the left side of the world bounds?
      */
    var left: Boolean = js.native
    
    /**
      * Will bodies collide with the right side of the world bounds?
      */
    var right: Boolean = js.native
    
    /**
      * Will bodies collide with the top side of the world bounds?
      */
    var up: Boolean = js.native
  }
  object CheckCollisionObject {
    
    @scala.inline
    def apply(down: Boolean, left: Boolean, right: Boolean, up: Boolean): CheckCollisionObject = {
      val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckCollisionObject]
    }
    
    @scala.inline
    implicit class CheckCollisionObjectMutableBuilder[Self <: CheckCollisionObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDown(value: Boolean): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUp(value: Boolean): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    }
  }
  
  type GameObjectWithBody = GameObject
  
  type GameObjectWithDynamicBody = GameObject
  
  type GameObjectWithStaticBody = GameObject
  
  type ImageWithDynamicBody = Image
  
  type ImageWithStaticBody = Image
  
  /* Inlined phaser.Phaser.Types.GameObjects.Group.GroupConfig & {  collideWorldBounds :boolean | undefined,   customBoundsRectangle :phaser.Phaser.Geom.Rectangle | undefined,   accelerationX :number | undefined,   accelerationY :number | undefined,   allowDrag :boolean | undefined,   allowGravity :boolean | undefined,   allowRotation :boolean | undefined,   bounceX :number | undefined,   bounceY :number | undefined,   dragX :number | undefined,   dragY :number | undefined,   enable :boolean | undefined,   gravityX :number | undefined,   gravityY :number | undefined,   frictionX :number | undefined,   frictionY :number | undefined,   velocityX :number | undefined,   velocityY :number | undefined,   angularVelocity :number | undefined,   angularAcceleration :number | undefined,   angularDrag :number | undefined,   mass :number | undefined,   immovable :boolean | undefined} */
  @js.native
  trait PhysicsGroupConfig extends StObject {
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#acceleration acceleration.x}.
      */
    var accelerationX: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#acceleration acceleration.y}.
      */
    var accelerationY: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#active}.
      */
    var active: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#allowDrag}.
      */
    var allowDrag: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#allowGravity}.
      */
    var allowGravity: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#allowRotation}.
      */
    var allowRotation: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#angularAcceleration}.
      */
    var angularAcceleration: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#angularDrag}.
      */
    var angularDrag: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#angularVelocity}.
      */
    var angularVelocity: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#bounce bounce.x}.
      */
    var bounceX: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#bounce bounce.y}.
      */
    var bounceY: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#classType}.
      */
    var classType: js.UndefOr[js.Function] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#collideWorldBounds}.
      */
    var collideWorldBounds: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#createCallback}.
      */
    var createCallback: js.UndefOr[GroupCallback] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#createMultipleCallback}.
      */
    var createMultipleCallback: js.UndefOr[GroupMultipleCreateCallback] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#setBoundsRectangle setBoundsRectangle}.
      */
    var customBoundsRectangle: js.UndefOr[Rectangle] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#defaultFrame}.
      */
    var defaultFrame: js.UndefOr[String | integer] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#defaultKey}.
      */
    var defaultKey: js.UndefOr[String] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#drag drag.x}.
      */
    var dragX: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#drag drag.y}.
      */
    var dragY: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#enable enable}.
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#friction friction.x}.
      */
    var frictionX: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#friction friction.y}.
      */
    var frictionY: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#gravity gravity.x}.
      */
    var gravityX: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#gravity gravity.y}.
      */
    var gravityY: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#immovable}.
      */
    var immovable: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#mass}.
      */
    var mass: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#maxSize}.
      */
    var maxSize: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#name}.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#removeCallback}.
      */
    var removeCallback: js.UndefOr[GroupCallback] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#runChildUpdate}.
      */
    var runChildUpdate: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#velocity velocity.x}.
      */
    var velocityX: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#velocity velocity.y}.
      */
    var velocityY: js.UndefOr[Double] = js.native
  }
  object PhysicsGroupConfig {
    
    @scala.inline
    def apply(): PhysicsGroupConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhysicsGroupConfig]
    }
    
    @scala.inline
    implicit class PhysicsGroupConfigMutableBuilder[Self <: PhysicsGroupConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccelerationX(value: Double): Self = StObject.set(x, "accelerationX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccelerationXUndefined: Self = StObject.set(x, "accelerationX", js.undefined)
      
      @scala.inline
      def setAccelerationY(value: Double): Self = StObject.set(x, "accelerationY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccelerationYUndefined: Self = StObject.set(x, "accelerationY", js.undefined)
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDragUndefined: Self = StObject.set(x, "allowDrag", js.undefined)
      
      @scala.inline
      def setAllowGravity(value: Boolean): Self = StObject.set(x, "allowGravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowGravityUndefined: Self = StObject.set(x, "allowGravity", js.undefined)
      
      @scala.inline
      def setAllowRotation(value: Boolean): Self = StObject.set(x, "allowRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRotationUndefined: Self = StObject.set(x, "allowRotation", js.undefined)
      
      @scala.inline
      def setAngularAcceleration(value: Double): Self = StObject.set(x, "angularAcceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngularAccelerationUndefined: Self = StObject.set(x, "angularAcceleration", js.undefined)
      
      @scala.inline
      def setAngularDrag(value: Double): Self = StObject.set(x, "angularDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngularDragUndefined: Self = StObject.set(x, "angularDrag", js.undefined)
      
      @scala.inline
      def setAngularVelocity(value: Double): Self = StObject.set(x, "angularVelocity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngularVelocityUndefined: Self = StObject.set(x, "angularVelocity", js.undefined)
      
      @scala.inline
      def setBounceX(value: Double): Self = StObject.set(x, "bounceX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceXUndefined: Self = StObject.set(x, "bounceX", js.undefined)
      
      @scala.inline
      def setBounceY(value: Double): Self = StObject.set(x, "bounceY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceYUndefined: Self = StObject.set(x, "bounceY", js.undefined)
      
      @scala.inline
      def setClassType(value: js.Function): Self = StObject.set(x, "classType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassTypeUndefined: Self = StObject.set(x, "classType", js.undefined)
      
      @scala.inline
      def setCollideWorldBounds(value: Boolean): Self = StObject.set(x, "collideWorldBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollideWorldBoundsUndefined: Self = StObject.set(x, "collideWorldBounds", js.undefined)
      
      @scala.inline
      def setCreateCallback(value: /* item */ GameObject => Unit): Self = StObject.set(x, "createCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateCallbackUndefined: Self = StObject.set(x, "createCallback", js.undefined)
      
      @scala.inline
      def setCreateMultipleCallback(value: /* items */ js.Array[GameObject] => Unit): Self = StObject.set(x, "createMultipleCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateMultipleCallbackUndefined: Self = StObject.set(x, "createMultipleCallback", js.undefined)
      
      @scala.inline
      def setCustomBoundsRectangle(value: Rectangle): Self = StObject.set(x, "customBoundsRectangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomBoundsRectangleUndefined: Self = StObject.set(x, "customBoundsRectangle", js.undefined)
      
      @scala.inline
      def setDefaultFrame(value: String | integer): Self = StObject.set(x, "defaultFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFrameUndefined: Self = StObject.set(x, "defaultFrame", js.undefined)
      
      @scala.inline
      def setDefaultKey(value: String): Self = StObject.set(x, "defaultKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultKeyUndefined: Self = StObject.set(x, "defaultKey", js.undefined)
      
      @scala.inline
      def setDragX(value: Double): Self = StObject.set(x, "dragX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragXUndefined: Self = StObject.set(x, "dragX", js.undefined)
      
      @scala.inline
      def setDragY(value: Double): Self = StObject.set(x, "dragY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragYUndefined: Self = StObject.set(x, "dragY", js.undefined)
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setFrictionX(value: Double): Self = StObject.set(x, "frictionX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrictionXUndefined: Self = StObject.set(x, "frictionX", js.undefined)
      
      @scala.inline
      def setFrictionY(value: Double): Self = StObject.set(x, "frictionY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrictionYUndefined: Self = StObject.set(x, "frictionY", js.undefined)
      
      @scala.inline
      def setGravityX(value: Double): Self = StObject.set(x, "gravityX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravityXUndefined: Self = StObject.set(x, "gravityX", js.undefined)
      
      @scala.inline
      def setGravityY(value: Double): Self = StObject.set(x, "gravityY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravityYUndefined: Self = StObject.set(x, "gravityY", js.undefined)
      
      @scala.inline
      def setImmovable(value: Boolean): Self = StObject.set(x, "immovable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmovableUndefined: Self = StObject.set(x, "immovable", js.undefined)
      
      @scala.inline
      def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRemoveCallback(value: /* item */ GameObject => Unit): Self = StObject.set(x, "removeCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveCallbackUndefined: Self = StObject.set(x, "removeCallback", js.undefined)
      
      @scala.inline
      def setRunChildUpdate(value: Boolean): Self = StObject.set(x, "runChildUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunChildUpdateUndefined: Self = StObject.set(x, "runChildUpdate", js.undefined)
      
      @scala.inline
      def setVelocityX(value: Double): Self = StObject.set(x, "velocityX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocityXUndefined: Self = StObject.set(x, "velocityX", js.undefined)
      
      @scala.inline
      def setVelocityY(value: Double): Self = StObject.set(x, "velocityY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocityYUndefined: Self = StObject.set(x, "velocityY", js.undefined)
    }
  }
  
  @js.native
  trait PhysicsGroupDefaults extends StObject {
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAccelerationX}.
      */
    var setAccelerationX: Double = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAccelerationY}.
      */
    var setAccelerationY: Double = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAllowDrag}.
      */
    var setAllowDrag: Boolean = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAllowGravity}.
      */
    var setAllowGravity: Boolean = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAllowRotation}.
      */
    var setAllowRotation: Boolean = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAngularAcceleration}.
      */
    var setAngularAcceleration: Double = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAngularDrag}.
      */
    var setAngularDrag: Double = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAngularVelocity}.
      */
    var setAngularVelocity: Double = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setBounceX}.
      */
    var setBounceX: Double = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setBounceY}.
      */
    var setBounceY: Double = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setBoundsRectangle}.
      */
    var setBoundsRectangle: Rectangle = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setCollideWorldBounds}.
      */
    var setCollideWorldBounds: Boolean = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setDragX}.
      */
    var setDragX: Double = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setDragY}.
      */
    var setDragY: Double = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setEnable}.
      */
    var setEnable: Boolean = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setFrictionX}.
      */
    var setFrictionX: Double = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setFrictionY}.
      */
    var setFrictionY: Double = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setGravityX}.
      */
    var setGravityX: Double = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setGravityY}.
      */
    var setGravityY: Double = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setImmovable}.
      */
    var setImmovable: Boolean = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setMass}.
      */
    var setMass: Double = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setVelocityX}.
      */
    var setVelocityX: Double = js.native
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setVelocityY}.
      */
    var setVelocityY: Double = js.native
  }
  object PhysicsGroupDefaults {
    
    @scala.inline
    def apply(
      setAccelerationX: Double,
      setAccelerationY: Double,
      setAllowDrag: Boolean,
      setAllowGravity: Boolean,
      setAllowRotation: Boolean,
      setAngularAcceleration: Double,
      setAngularDrag: Double,
      setAngularVelocity: Double,
      setBounceX: Double,
      setBounceY: Double,
      setBoundsRectangle: Rectangle,
      setCollideWorldBounds: Boolean,
      setDragX: Double,
      setDragY: Double,
      setEnable: Boolean,
      setFrictionX: Double,
      setFrictionY: Double,
      setGravityX: Double,
      setGravityY: Double,
      setImmovable: Boolean,
      setMass: Double,
      setVelocityX: Double,
      setVelocityY: Double
    ): PhysicsGroupDefaults = {
      val __obj = js.Dynamic.literal(setAccelerationX = setAccelerationX.asInstanceOf[js.Any], setAccelerationY = setAccelerationY.asInstanceOf[js.Any], setAllowDrag = setAllowDrag.asInstanceOf[js.Any], setAllowGravity = setAllowGravity.asInstanceOf[js.Any], setAllowRotation = setAllowRotation.asInstanceOf[js.Any], setAngularAcceleration = setAngularAcceleration.asInstanceOf[js.Any], setAngularDrag = setAngularDrag.asInstanceOf[js.Any], setAngularVelocity = setAngularVelocity.asInstanceOf[js.Any], setBounceX = setBounceX.asInstanceOf[js.Any], setBounceY = setBounceY.asInstanceOf[js.Any], setBoundsRectangle = setBoundsRectangle.asInstanceOf[js.Any], setCollideWorldBounds = setCollideWorldBounds.asInstanceOf[js.Any], setDragX = setDragX.asInstanceOf[js.Any], setDragY = setDragY.asInstanceOf[js.Any], setEnable = setEnable.asInstanceOf[js.Any], setFrictionX = setFrictionX.asInstanceOf[js.Any], setFrictionY = setFrictionY.asInstanceOf[js.Any], setGravityX = setGravityX.asInstanceOf[js.Any], setGravityY = setGravityY.asInstanceOf[js.Any], setImmovable = setImmovable.asInstanceOf[js.Any], setMass = setMass.asInstanceOf[js.Any], setVelocityX = setVelocityX.asInstanceOf[js.Any], setVelocityY = setVelocityY.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsGroupDefaults]
    }
    
    @scala.inline
    implicit class PhysicsGroupDefaultsMutableBuilder[Self <: PhysicsGroupDefaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetAccelerationX(value: Double): Self = StObject.set(x, "setAccelerationX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAccelerationY(value: Double): Self = StObject.set(x, "setAccelerationY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAllowDrag(value: Boolean): Self = StObject.set(x, "setAllowDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAllowGravity(value: Boolean): Self = StObject.set(x, "setAllowGravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAllowRotation(value: Boolean): Self = StObject.set(x, "setAllowRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAngularAcceleration(value: Double): Self = StObject.set(x, "setAngularAcceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAngularDrag(value: Double): Self = StObject.set(x, "setAngularDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAngularVelocity(value: Double): Self = StObject.set(x, "setAngularVelocity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetBounceX(value: Double): Self = StObject.set(x, "setBounceX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetBounceY(value: Double): Self = StObject.set(x, "setBounceY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetBoundsRectangle(value: Rectangle): Self = StObject.set(x, "setBoundsRectangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetCollideWorldBounds(value: Boolean): Self = StObject.set(x, "setCollideWorldBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDragX(value: Double): Self = StObject.set(x, "setDragX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDragY(value: Double): Self = StObject.set(x, "setDragY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetEnable(value: Boolean): Self = StObject.set(x, "setEnable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetFrictionX(value: Double): Self = StObject.set(x, "setFrictionX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetFrictionY(value: Double): Self = StObject.set(x, "setFrictionY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetGravityX(value: Double): Self = StObject.set(x, "setGravityX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetGravityY(value: Double): Self = StObject.set(x, "setGravityY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetImmovable(value: Boolean): Self = StObject.set(x, "setImmovable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetMass(value: Double): Self = StObject.set(x, "setMass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetVelocityX(value: Double): Self = StObject.set(x, "setVelocityX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetVelocityY(value: Double): Self = StObject.set(x, "setVelocityY", value.asInstanceOf[js.Any])
    }
  }
  
  type SpriteWithDynamicBody = Sprite
  
  type SpriteWithStaticBody = Sprite
  
  trait _ArcadeColliderType extends StObject
}

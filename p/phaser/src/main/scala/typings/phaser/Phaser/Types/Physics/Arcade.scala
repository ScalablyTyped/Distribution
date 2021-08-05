package typings.phaser.Phaser.Types.Physics

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Physics.Arcade.Group
import typings.phaser.Phaser.Physics.Arcade.Image
import typings.phaser.Phaser.Physics.Arcade.Sprite
import typings.phaser.Phaser.Physics.Arcade.StaticGroup
import typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer
import typings.phaser.Phaser.Tilemaps.StaticTilemapLayer
import typings.phaser.Phaser.Types.GameObjects.Group.GroupConfig
import typings.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Arcade {
  
  trait ArcadeBodyBounds extends StObject {
    
    /**
      * The lower edge.
      */
    var bottom: Double
    
    /**
      * The right edge.
      */
    var right: Double
    
    /**
      * The left edge.
      */
    var x: Double
    
    /**
      * The upper edge.
      */
    var y: Double
  }
  object ArcadeBodyBounds {
    
    inline def apply(bottom: Double, right: Double, x: Double, y: Double): ArcadeBodyBounds = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcadeBodyBounds]
    }
    
    extension [Self <: ArcadeBodyBounds](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArcadeBodyCollision extends StObject {
    
    /**
      * True if the Body is colliding on its lower edge.
      */
    var down: Boolean
    
    /**
      * True if the Body is colliding on its left edge.
      */
    var left: Boolean
    
    /**
      * True if the Body is not colliding.
      */
    var none: Boolean
    
    /**
      * True if the Body is colliding on its right edge.
      */
    var right: Boolean
    
    /**
      * True if the Body is colliding on its upper edge.
      */
    var up: Boolean
  }
  object ArcadeBodyCollision {
    
    inline def apply(down: Boolean, left: Boolean, none: Boolean, right: Boolean, up: Boolean): ArcadeBodyCollision = {
      val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcadeBodyCollision]
    }
    
    extension [Self <: ArcadeBodyCollision](x: Self) {
      
      inline def setDown(value: Boolean): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setNone(value: Boolean): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setUp(value: Boolean): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
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
  
  trait ArcadeWorldConfig extends StObject {
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#checkCollision}.
      */
    var checkCollision: js.UndefOr[CheckCollisionObject] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#debug}.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#defaults bodyDebugColor}.
      */
    var debugBodyColor: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowBody}.
      */
    var debugShowBody: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowStaticBody}.
      */
    var debugShowStaticBody: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowStaticBody}.
      */
    var debugShowVelocity: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#defaults staticBodyDebugColor}.
      */
    var debugStaticBodyColor: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#defaults velocityDebugColor}.
      */
    var debugVelocityColor: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#forceX}.
      */
    var forceX: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#fps}.
      */
    var fps: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#gravity}.
      */
    var gravity: js.UndefOr[Vector2Like] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.height}.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#isPaused}.
      */
    var isPaused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#maxEntries}.
      */
    var maxEntries: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#OVERLAP_BIAS}.
      */
    var overlapBias: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#TILE_BIAS}.
      */
    var tileBias: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#timeScale}.
      */
    var timeScale: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#useTree}.
      */
    var useTree: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.width}.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.x}.
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.y}.
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object ArcadeWorldConfig {
    
    inline def apply(): ArcadeWorldConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArcadeWorldConfig]
    }
    
    extension [Self <: ArcadeWorldConfig](x: Self) {
      
      inline def setCheckCollision(value: CheckCollisionObject): Self = StObject.set(x, "checkCollision", value.asInstanceOf[js.Any])
      
      inline def setCheckCollisionUndefined: Self = StObject.set(x, "checkCollision", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugBodyColor(value: Double): Self = StObject.set(x, "debugBodyColor", value.asInstanceOf[js.Any])
      
      inline def setDebugBodyColorUndefined: Self = StObject.set(x, "debugBodyColor", js.undefined)
      
      inline def setDebugShowBody(value: Boolean): Self = StObject.set(x, "debugShowBody", value.asInstanceOf[js.Any])
      
      inline def setDebugShowBodyUndefined: Self = StObject.set(x, "debugShowBody", js.undefined)
      
      inline def setDebugShowStaticBody(value: Boolean): Self = StObject.set(x, "debugShowStaticBody", value.asInstanceOf[js.Any])
      
      inline def setDebugShowStaticBodyUndefined: Self = StObject.set(x, "debugShowStaticBody", js.undefined)
      
      inline def setDebugShowVelocity(value: Boolean): Self = StObject.set(x, "debugShowVelocity", value.asInstanceOf[js.Any])
      
      inline def setDebugShowVelocityUndefined: Self = StObject.set(x, "debugShowVelocity", js.undefined)
      
      inline def setDebugStaticBodyColor(value: Double): Self = StObject.set(x, "debugStaticBodyColor", value.asInstanceOf[js.Any])
      
      inline def setDebugStaticBodyColorUndefined: Self = StObject.set(x, "debugStaticBodyColor", js.undefined)
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDebugVelocityColor(value: Double): Self = StObject.set(x, "debugVelocityColor", value.asInstanceOf[js.Any])
      
      inline def setDebugVelocityColorUndefined: Self = StObject.set(x, "debugVelocityColor", js.undefined)
      
      inline def setForceX(value: Boolean): Self = StObject.set(x, "forceX", value.asInstanceOf[js.Any])
      
      inline def setForceXUndefined: Self = StObject.set(x, "forceX", js.undefined)
      
      inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
      
      inline def setGravity(value: Vector2Like): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
      
      inline def setIsPausedUndefined: Self = StObject.set(x, "isPaused", js.undefined)
      
      inline def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
      
      inline def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
      
      inline def setOverlapBias(value: Double): Self = StObject.set(x, "overlapBias", value.asInstanceOf[js.Any])
      
      inline def setOverlapBiasUndefined: Self = StObject.set(x, "overlapBias", js.undefined)
      
      inline def setTileBias(value: Double): Self = StObject.set(x, "tileBias", value.asInstanceOf[js.Any])
      
      inline def setTileBiasUndefined: Self = StObject.set(x, "tileBias", js.undefined)
      
      inline def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
      
      inline def setTimeScaleUndefined: Self = StObject.set(x, "timeScale", js.undefined)
      
      inline def setUseTree(value: Boolean): Self = StObject.set(x, "useTree", value.asInstanceOf[js.Any])
      
      inline def setUseTreeUndefined: Self = StObject.set(x, "useTree", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ArcadeWorldDefaults extends StObject {
    
    /**
      * The color of dynamic body outlines when rendered to the debug display.
      */
    var bodyDebugColor: Double
    
    /**
      * Set to `true` to render dynamic body outlines to the debug display.
      */
    var debugShowBody: Boolean
    
    /**
      * Set to `true` to render static body outlines to the debug display.
      */
    var debugShowStaticBody: Boolean
    
    /**
      * Set to `true` to render body velocity markers to the debug display.
      */
    var debugShowVelocity: Boolean
    
    /**
      * The color of static body outlines when rendered to the debug display.
      */
    var staticBodyDebugColor: Double
    
    /**
      * The color of the velocity markers when rendered to the debug display.
      */
    var velocityDebugColor: Double
  }
  object ArcadeWorldDefaults {
    
    inline def apply(
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
    
    extension [Self <: ArcadeWorldDefaults](x: Self) {
      
      inline def setBodyDebugColor(value: Double): Self = StObject.set(x, "bodyDebugColor", value.asInstanceOf[js.Any])
      
      inline def setDebugShowBody(value: Boolean): Self = StObject.set(x, "debugShowBody", value.asInstanceOf[js.Any])
      
      inline def setDebugShowStaticBody(value: Boolean): Self = StObject.set(x, "debugShowStaticBody", value.asInstanceOf[js.Any])
      
      inline def setDebugShowVelocity(value: Boolean): Self = StObject.set(x, "debugShowVelocity", value.asInstanceOf[js.Any])
      
      inline def setStaticBodyDebugColor(value: Double): Self = StObject.set(x, "staticBodyDebugColor", value.asInstanceOf[js.Any])
      
      inline def setVelocityDebugColor(value: Double): Self = StObject.set(x, "velocityDebugColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArcadeWorldTreeMinMax extends StObject {
    
    /**
      * The maximum x value used in RTree searches.
      */
    var maxX: Double
    
    /**
      * The maximum y value used in RTree searches.
      */
    var maxY: Double
    
    /**
      * The minimum x value used in RTree searches.
      */
    var minX: Double
    
    /**
      * The minimum y value used in RTree searches.
      */
    var minY: Double
  }
  object ArcadeWorldTreeMinMax {
    
    inline def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): ArcadeWorldTreeMinMax = {
      val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcadeWorldTreeMinMax]
    }
    
    extension [Self <: ArcadeWorldTreeMinMax](x: Self) {
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    }
  }
  
  trait CheckCollisionObject extends StObject {
    
    /**
      * Will bodies collide with the bottom side of the world bounds?
      */
    var down: Boolean
    
    /**
      * Will bodies collide with the left side of the world bounds?
      */
    var left: Boolean
    
    /**
      * Will bodies collide with the right side of the world bounds?
      */
    var right: Boolean
    
    /**
      * Will bodies collide with the top side of the world bounds?
      */
    var up: Boolean
  }
  object CheckCollisionObject {
    
    inline def apply(down: Boolean, left: Boolean, right: Boolean, up: Boolean): CheckCollisionObject = {
      val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckCollisionObject]
    }
    
    extension [Self <: CheckCollisionObject](x: Self) {
      
      inline def setDown(value: Boolean): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setUp(value: Boolean): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    }
  }
  
  type GameObjectWithBody = GameObject
  
  type GameObjectWithDynamicBody = GameObject
  
  type GameObjectWithStaticBody = GameObject
  
  type ImageWithDynamicBody = Image
  
  type ImageWithStaticBody = Image
  
  trait PhysicsGroupConfig
    extends StObject
       with GroupConfig {
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#acceleration acceleration.x}.
      */
    var accelerationX: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#acceleration acceleration.y}.
      */
    var accelerationY: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#allowDrag}.
      */
    var allowDrag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#allowGravity}.
      */
    var allowGravity: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#allowRotation}.
      */
    var allowRotation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#angularAcceleration}.
      */
    var angularAcceleration: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#angularDrag}.
      */
    var angularDrag: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#angularVelocity}.
      */
    var angularVelocity: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#bounce bounce.x}.
      */
    var bounceX: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#bounce bounce.y}.
      */
    var bounceY: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#collideWorldBounds}.
      */
    var collideWorldBounds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#setBoundsRectangle setBoundsRectangle}.
      */
    var customBoundsRectangle: js.UndefOr[Rectangle] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#drag drag.x}.
      */
    var dragX: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#drag drag.y}.
      */
    var dragY: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#enable enable}.
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#friction friction.x}.
      */
    var frictionX: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#friction friction.y}.
      */
    var frictionY: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#gravity gravity.x}.
      */
    var gravityX: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#gravity gravity.y}.
      */
    var gravityY: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#immovable}.
      */
    var immovable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#mass}.
      */
    var mass: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#velocity velocity.x}.
      */
    var velocityX: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets {@link Phaser.Physics.Arcade.Body#velocity velocity.y}.
      */
    var velocityY: js.UndefOr[Double] = js.undefined
  }
  object PhysicsGroupConfig {
    
    inline def apply(): PhysicsGroupConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhysicsGroupConfig]
    }
    
    extension [Self <: PhysicsGroupConfig](x: Self) {
      
      inline def setAccelerationX(value: Double): Self = StObject.set(x, "accelerationX", value.asInstanceOf[js.Any])
      
      inline def setAccelerationXUndefined: Self = StObject.set(x, "accelerationX", js.undefined)
      
      inline def setAccelerationY(value: Double): Self = StObject.set(x, "accelerationY", value.asInstanceOf[js.Any])
      
      inline def setAccelerationYUndefined: Self = StObject.set(x, "accelerationY", js.undefined)
      
      inline def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
      
      inline def setAllowDragUndefined: Self = StObject.set(x, "allowDrag", js.undefined)
      
      inline def setAllowGravity(value: Boolean): Self = StObject.set(x, "allowGravity", value.asInstanceOf[js.Any])
      
      inline def setAllowGravityUndefined: Self = StObject.set(x, "allowGravity", js.undefined)
      
      inline def setAllowRotation(value: Boolean): Self = StObject.set(x, "allowRotation", value.asInstanceOf[js.Any])
      
      inline def setAllowRotationUndefined: Self = StObject.set(x, "allowRotation", js.undefined)
      
      inline def setAngularAcceleration(value: Double): Self = StObject.set(x, "angularAcceleration", value.asInstanceOf[js.Any])
      
      inline def setAngularAccelerationUndefined: Self = StObject.set(x, "angularAcceleration", js.undefined)
      
      inline def setAngularDrag(value: Double): Self = StObject.set(x, "angularDrag", value.asInstanceOf[js.Any])
      
      inline def setAngularDragUndefined: Self = StObject.set(x, "angularDrag", js.undefined)
      
      inline def setAngularVelocity(value: Double): Self = StObject.set(x, "angularVelocity", value.asInstanceOf[js.Any])
      
      inline def setAngularVelocityUndefined: Self = StObject.set(x, "angularVelocity", js.undefined)
      
      inline def setBounceX(value: Double): Self = StObject.set(x, "bounceX", value.asInstanceOf[js.Any])
      
      inline def setBounceXUndefined: Self = StObject.set(x, "bounceX", js.undefined)
      
      inline def setBounceY(value: Double): Self = StObject.set(x, "bounceY", value.asInstanceOf[js.Any])
      
      inline def setBounceYUndefined: Self = StObject.set(x, "bounceY", js.undefined)
      
      inline def setCollideWorldBounds(value: Boolean): Self = StObject.set(x, "collideWorldBounds", value.asInstanceOf[js.Any])
      
      inline def setCollideWorldBoundsUndefined: Self = StObject.set(x, "collideWorldBounds", js.undefined)
      
      inline def setCustomBoundsRectangle(value: Rectangle): Self = StObject.set(x, "customBoundsRectangle", value.asInstanceOf[js.Any])
      
      inline def setCustomBoundsRectangleUndefined: Self = StObject.set(x, "customBoundsRectangle", js.undefined)
      
      inline def setDragX(value: Double): Self = StObject.set(x, "dragX", value.asInstanceOf[js.Any])
      
      inline def setDragXUndefined: Self = StObject.set(x, "dragX", js.undefined)
      
      inline def setDragY(value: Double): Self = StObject.set(x, "dragY", value.asInstanceOf[js.Any])
      
      inline def setDragYUndefined: Self = StObject.set(x, "dragY", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setFrictionX(value: Double): Self = StObject.set(x, "frictionX", value.asInstanceOf[js.Any])
      
      inline def setFrictionXUndefined: Self = StObject.set(x, "frictionX", js.undefined)
      
      inline def setFrictionY(value: Double): Self = StObject.set(x, "frictionY", value.asInstanceOf[js.Any])
      
      inline def setFrictionYUndefined: Self = StObject.set(x, "frictionY", js.undefined)
      
      inline def setGravityX(value: Double): Self = StObject.set(x, "gravityX", value.asInstanceOf[js.Any])
      
      inline def setGravityXUndefined: Self = StObject.set(x, "gravityX", js.undefined)
      
      inline def setGravityY(value: Double): Self = StObject.set(x, "gravityY", value.asInstanceOf[js.Any])
      
      inline def setGravityYUndefined: Self = StObject.set(x, "gravityY", js.undefined)
      
      inline def setImmovable(value: Boolean): Self = StObject.set(x, "immovable", value.asInstanceOf[js.Any])
      
      inline def setImmovableUndefined: Self = StObject.set(x, "immovable", js.undefined)
      
      inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
      
      inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
      
      inline def setVelocityX(value: Double): Self = StObject.set(x, "velocityX", value.asInstanceOf[js.Any])
      
      inline def setVelocityXUndefined: Self = StObject.set(x, "velocityX", js.undefined)
      
      inline def setVelocityY(value: Double): Self = StObject.set(x, "velocityY", value.asInstanceOf[js.Any])
      
      inline def setVelocityYUndefined: Self = StObject.set(x, "velocityY", js.undefined)
    }
  }
  
  trait PhysicsGroupDefaults extends StObject {
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAccelerationX}.
      */
    var setAccelerationX: Double
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAccelerationY}.
      */
    var setAccelerationY: Double
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAllowDrag}.
      */
    var setAllowDrag: Boolean
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAllowGravity}.
      */
    var setAllowGravity: Boolean
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAllowRotation}.
      */
    var setAllowRotation: Boolean
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAngularAcceleration}.
      */
    var setAngularAcceleration: Double
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAngularDrag}.
      */
    var setAngularDrag: Double
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setAngularVelocity}.
      */
    var setAngularVelocity: Double
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setBounceX}.
      */
    var setBounceX: Double
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setBounceY}.
      */
    var setBounceY: Double
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setBoundsRectangle}.
      */
    var setBoundsRectangle: Rectangle
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setCollideWorldBounds}.
      */
    var setCollideWorldBounds: Boolean
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setDragX}.
      */
    var setDragX: Double
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setDragY}.
      */
    var setDragY: Double
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setEnable}.
      */
    var setEnable: Boolean
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setFrictionX}.
      */
    var setFrictionX: Double
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setFrictionY}.
      */
    var setFrictionY: Double
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setGravityX}.
      */
    var setGravityX: Double
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setGravityY}.
      */
    var setGravityY: Double
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setImmovable}.
      */
    var setImmovable: Boolean
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setMass}.
      */
    var setMass: Double
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setVelocityX}.
      */
    var setVelocityX: Double
    
    /**
      * As {@link Phaser.Physics.Arcade.Body#setVelocityY}.
      */
    var setVelocityY: Double
  }
  object PhysicsGroupDefaults {
    
    inline def apply(
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
    
    extension [Self <: PhysicsGroupDefaults](x: Self) {
      
      inline def setSetAccelerationX(value: Double): Self = StObject.set(x, "setAccelerationX", value.asInstanceOf[js.Any])
      
      inline def setSetAccelerationY(value: Double): Self = StObject.set(x, "setAccelerationY", value.asInstanceOf[js.Any])
      
      inline def setSetAllowDrag(value: Boolean): Self = StObject.set(x, "setAllowDrag", value.asInstanceOf[js.Any])
      
      inline def setSetAllowGravity(value: Boolean): Self = StObject.set(x, "setAllowGravity", value.asInstanceOf[js.Any])
      
      inline def setSetAllowRotation(value: Boolean): Self = StObject.set(x, "setAllowRotation", value.asInstanceOf[js.Any])
      
      inline def setSetAngularAcceleration(value: Double): Self = StObject.set(x, "setAngularAcceleration", value.asInstanceOf[js.Any])
      
      inline def setSetAngularDrag(value: Double): Self = StObject.set(x, "setAngularDrag", value.asInstanceOf[js.Any])
      
      inline def setSetAngularVelocity(value: Double): Self = StObject.set(x, "setAngularVelocity", value.asInstanceOf[js.Any])
      
      inline def setSetBounceX(value: Double): Self = StObject.set(x, "setBounceX", value.asInstanceOf[js.Any])
      
      inline def setSetBounceY(value: Double): Self = StObject.set(x, "setBounceY", value.asInstanceOf[js.Any])
      
      inline def setSetBoundsRectangle(value: Rectangle): Self = StObject.set(x, "setBoundsRectangle", value.asInstanceOf[js.Any])
      
      inline def setSetCollideWorldBounds(value: Boolean): Self = StObject.set(x, "setCollideWorldBounds", value.asInstanceOf[js.Any])
      
      inline def setSetDragX(value: Double): Self = StObject.set(x, "setDragX", value.asInstanceOf[js.Any])
      
      inline def setSetDragY(value: Double): Self = StObject.set(x, "setDragY", value.asInstanceOf[js.Any])
      
      inline def setSetEnable(value: Boolean): Self = StObject.set(x, "setEnable", value.asInstanceOf[js.Any])
      
      inline def setSetFrictionX(value: Double): Self = StObject.set(x, "setFrictionX", value.asInstanceOf[js.Any])
      
      inline def setSetFrictionY(value: Double): Self = StObject.set(x, "setFrictionY", value.asInstanceOf[js.Any])
      
      inline def setSetGravityX(value: Double): Self = StObject.set(x, "setGravityX", value.asInstanceOf[js.Any])
      
      inline def setSetGravityY(value: Double): Self = StObject.set(x, "setGravityY", value.asInstanceOf[js.Any])
      
      inline def setSetImmovable(value: Boolean): Self = StObject.set(x, "setImmovable", value.asInstanceOf[js.Any])
      
      inline def setSetMass(value: Double): Self = StObject.set(x, "setMass", value.asInstanceOf[js.Any])
      
      inline def setSetVelocityX(value: Double): Self = StObject.set(x, "setVelocityX", value.asInstanceOf[js.Any])
      
      inline def setSetVelocityY(value: Double): Self = StObject.set(x, "setVelocityY", value.asInstanceOf[js.Any])
    }
  }
  
  type SpriteWithDynamicBody = Sprite
  
  type SpriteWithStaticBody = Sprite
  
  trait _ArcadeColliderType extends StObject
}

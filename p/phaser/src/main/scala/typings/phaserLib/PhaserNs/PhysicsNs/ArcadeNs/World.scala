package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends phaserLib.PhaserNs.EventsNs.EventEmitter {
  /**
    * 
    * @param scene The Scene to which this World instance belongs.
    * @param config An Arcade Physics Configuration object.
    */
  def this(scene: phaserLib.PhaserNs.Scene, config: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeWorldConfig) = this()
  /**
    * The maximum absolute difference of a Body's per-step velocity and its overlap with another Body that will result in separation on *each axis*.
    * Larger values favor separation.
    * Smaller values favor no separation.
    */
  var OVERLAP_BIAS: scala.Double = js.native
  /**
    * The maximum absolute value of a Body's overlap with a tile that will result in separation on *each axis*.
    * Larger values favor separation.
    * Smaller values favor no separation.
    * The optimum value may be similar to the tile size.
    */
  var TILE_BIAS: scala.Double = js.native
  /**
    * Dynamic Bodies in this simulation.
    */
  var bodies: phaserLib.PhaserNs.StructsNs.Set[Body] = js.native
  /**
    * A boundary constraining Bodies.
    */
  var bounds: phaserLib.PhaserNs.GeomNs.Rectangle = js.native
  /**
    * The boundary edges that Bodies can collide with.
    */
  var checkCollision: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.CheckCollisionObject = js.native
  /**
    * This simulation's collision processors.
    */
  var colliders: phaserLib.PhaserNs.StructsNs.ProcessQueue[Collider] = js.native
  /**
    * The graphics object drawing the debug display.
    */
  var debugGraphic: phaserLib.PhaserNs.GameObjectsNs.Graphics = js.native
  /**
    * Default debug display settings for new Bodies.
    */
  var defaults: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeWorldDefaults = js.native
  /**
    * Enables the debug display.
    */
  var drawDebug: scala.Boolean = js.native
  /**
    * Always separate overlapping Bodies horizontally before vertically.
    * False (the default) means Bodies are first separated on the axis of greater gravity, or the vertical axis if neither is greater.
    */
  var forceX: scala.Boolean = js.native
  /**
    * The number of physics steps to be taken per second.
    * 
    * This property is read-only. Use the `setFPS` method to modify it at run-time.
    */
  val fps: scala.Double = js.native
  /**
    * Acceleration of Bodies due to gravity, in pixels per second.
    */
  var gravity: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * Whether the simulation advances with the game loop.
    */
  var isPaused: scala.Boolean = js.native
  /**
    * The maximum number of items per node on the RTree.
    * 
    * This is ignored if `useTree` is `false`. If you have a large number of bodies in
    * your world then you may find search performance improves by increasing this value,
    * to allow more items per node and less node division.
    */
  var maxEntries: phaserLib.integer = js.native
  /**
    * Static Bodies marked for deletion.
    */
  var pendingDestroy: phaserLib.PhaserNs.StructsNs.Set[Body | StaticBody] = js.native
  /**
    * The Scene this simulation belongs to.
    */
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * Static Bodies in this simulation.
    */
  var staticBodies: phaserLib.PhaserNs.StructsNs.Set[StaticBody] = js.native
  /**
    * The spatial index of Static Bodies.
    */
  var staticTree: phaserLib.PhaserNs.StructsNs.RTree = js.native
  /**
    * The number of steps that took place in the last frame.
    */
  val stepsLastFrame: scala.Double = js.native
  /**
    * Scaling factor applied to the frame rate.
    * 
    * - 1.0 = normal speed
    * - 2.0 = half speed
    * - 0.5 = double speed
    */
  var timeScale: scala.Double = js.native
  /**
    * The spatial index of Dynamic Bodies.
    */
  var tree: phaserLib.PhaserNs.StructsNs.RTree = js.native
  /**
    * Recycled input for tree searches.
    */
  var treeMinMax: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeWorldTreeMinMax = js.native
  /**
    * Should this Arcade Physics World use an RTree for Dynamic and Static Physics bodies?
    * 
    * An RTree is a fast way of spatially sorting of all the bodies in the world.
    * However, at certain limits, the cost of clearing and inserting the bodies into the
    * tree every frame becomes more expensive than the search speed gains it provides.
    * 
    * If you have a large number of dynamic bodies in your world then it may be best to
    * disable the use of the RTree by setting this property to `false` in the physics config.
    * 
    * The number it can cope with depends on browser and device, but a conservative estimate
    * of around 5,000 bodies should be considered the max before disabling it.
    * 
    * This only applies to dynamic bodies. Static bodies are always kept in an RTree,
    * because they don't have to be cleared every frame, so you benefit from the
    * massive search speeds all the time.
    */
  var useTree: scala.Boolean = js.native
  /**
    * Adds an existing Arcade Physics Body or StaticBody to the simulation.
    * 
    * The body is enabled and added to the local search trees.
    * @param body The Body to be added to the simulation.
    */
  def add(body: Body): Body | StaticBody = js.native
  def add(body: StaticBody): Body | StaticBody = js.native
  /**
    * Creates a new Collider object and adds it to the simulation.
    * 
    * A Collider is a way to automatically perform collision checks between two objects,
    * calling the collide and process callbacks if they occur.
    * 
    * Colliders are run as part of the World update, after all of the Bodies have updated.
    * 
    * By creating a Collider you don't need then call `World.collide` in your `update` loop,
    * as it will be handled for you automatically.
    * @param object1 The first object to check for collision.
    * @param object2 The second object to check for collision.
    * @param collideCallback The callback to invoke when the two objects collide.
    * @param processCallback The callback to invoke when the two objects collide. Must return a boolean.
    * @param callbackContext The scope in which to call the callbacks.
    */
  def addCollider(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType
  ): Collider = js.native
  def addCollider(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def addCollider(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def addCollider(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  /**
    * Creates a new Overlap Collider object and adds it to the simulation.
    * 
    * A Collider is a way to automatically perform overlap checks between two objects,
    * calling the collide and process callbacks if they occur.
    * 
    * Colliders are run as part of the World update, after all of the Bodies have updated.
    * 
    * By creating a Collider you don't need then call `World.overlap` in your `update` loop,
    * as it will be handled for you automatically.
    * @param object1 The first object to check for overlap.
    * @param object2 The second object to check for overlap.
    * @param collideCallback The callback to invoke when the two objects overlap.
    * @param processCallback The callback to invoke when the two objects overlap. Must return a boolean.
    * @param callbackContext The scope in which to call the callbacks.
    */
  def addOverlap(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType
  ): Collider = js.native
  def addOverlap(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def addOverlap(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def addOverlap(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  /**
    * Tests if a circular Body intersects with another Body.
    * @param circle The circular body to test.
    * @param body The rectangular body to test.
    */
  def circleBodyIntersects(circle: Body, body: Body): scala.Boolean = js.native
  /**
    * Performs a collision check and separation between the two physics enabled objects given, which can be single
    * Game Objects, arrays of Game Objects, Physics Groups, arrays of Physics Groups or normal Groups.
    * 
    * If you don't require separation then use {@link #overlap} instead.
    * 
    * If two Groups or arrays are passed, each member of one will be tested against each member of the other.
    * 
    * If **only** one Group is passed (as `object1`), each member of the Group will be collided against the other members.
    * 
    * If **only** one Array is passed, the array is iterated and every element in it is tested against the others.
    * 
    * Two callbacks can be provided. The `collideCallback` is invoked if a collision occurs and the two colliding
    * objects are passed to it.
    * 
    * Arcade Physics uses the Projection Method of collision resolution and separation. While it's fast and suitable
    * for 'arcade' style games it lacks stability when multiple objects are in close proximity or resting upon each other.
    * The separation that stops two objects penetrating may create a new penetration against a different object. If you
    * require a high level of stability please consider using an alternative physics system, such as Matter.js.
    * @param object1 The first object or array of objects to check.
    * @param object2 The second object or array of objects to check, or `undefined`.
    * @param collideCallback An optional callback function that is called if the objects collide.
    * @param processCallback An optional callback function that lets you perform additional checks against the two objects if they collide. If this is set then `collideCallback` will only be called if this callback returns `true`.
    * @param callbackContext The context in which to run the callbacks.
    */
  def collide(object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType): scala.Boolean = js.native
  def collide(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType
  ): scala.Boolean = js.native
  def collide(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): scala.Boolean = js.native
  def collide(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): scala.Boolean = js.native
  def collide(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): scala.Boolean = js.native
  /**
    * Internal handler for Sprite vs. Tilemap collisions.
    * Please use Phaser.Physics.Arcade.World#collide instead.
    * @param sprite The first object to check for collision.
    * @param tilemapLayer The second object to check for collision.
    * @param collideCallback An optional callback function that is called if the objects collide.
    * @param processCallback An optional callback function that lets you perform additional checks against the two objects if they collide. If this is set then `collideCallback` will only be called if this callback returns `true`.
    * @param callbackContext The context in which to run the callbacks.
    * @param overlapOnly Whether this is a collision or overlap check.
    */
  def collideSpriteVsTilemapLayer(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tilemapLayer: phaserLib.PhaserNs.TilemapsNs.DynamicTilemapLayer
  ): scala.Boolean = js.native
  def collideSpriteVsTilemapLayer(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tilemapLayer: phaserLib.PhaserNs.TilemapsNs.DynamicTilemapLayer,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): scala.Boolean = js.native
  def collideSpriteVsTilemapLayer(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tilemapLayer: phaserLib.PhaserNs.TilemapsNs.DynamicTilemapLayer,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): scala.Boolean = js.native
  def collideSpriteVsTilemapLayer(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tilemapLayer: phaserLib.PhaserNs.TilemapsNs.DynamicTilemapLayer,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): scala.Boolean = js.native
  def collideSpriteVsTilemapLayer(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tilemapLayer: phaserLib.PhaserNs.TilemapsNs.DynamicTilemapLayer,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any,
    overlapOnly: scala.Boolean
  ): scala.Boolean = js.native
  def collideSpriteVsTilemapLayer(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tilemapLayer: phaserLib.PhaserNs.TilemapsNs.StaticTilemapLayer
  ): scala.Boolean = js.native
  def collideSpriteVsTilemapLayer(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tilemapLayer: phaserLib.PhaserNs.TilemapsNs.StaticTilemapLayer,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): scala.Boolean = js.native
  def collideSpriteVsTilemapLayer(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tilemapLayer: phaserLib.PhaserNs.TilemapsNs.StaticTilemapLayer,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): scala.Boolean = js.native
  def collideSpriteVsTilemapLayer(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tilemapLayer: phaserLib.PhaserNs.TilemapsNs.StaticTilemapLayer,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): scala.Boolean = js.native
  def collideSpriteVsTilemapLayer(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tilemapLayer: phaserLib.PhaserNs.TilemapsNs.StaticTilemapLayer,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any,
    overlapOnly: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * This advanced method is specifically for testing for collision between a single Sprite and an array of Tile objects.
    * 
    * You should generally use the `collide` method instead, with a Sprite vs. a Tilemap Layer, as that will perform
    * tile filtering and culling for you, as well as handle the interesting face collision automatically.
    * 
    * This method is offered for those who would like to check for collision with specific Tiles in a layer, without
    * having to set any collision attributes on the tiles in question. This allows you to perform quick dynamic collisions
    * on small sets of Tiles. As such, no culling or checks are made to the array of Tiles given to this method,
    * you should filter them before passing them to this method.
    * 
    * Important: Use of this method skips the `interesting faces` system that Tilemap Layers use. This means if you have
    * say a row or column of tiles, and you jump into, or walk over them, it's possible to get stuck on the edges of the
    * tiles as the interesting face calculations are skipped. However, for quick-fire small collision set tests on
    * dynamic maps, this method can prove very useful.
    * @param sprite The first object to check for collision.
    * @param tiles An array of Tiles to check for collision against.
    * @param collideCallback An optional callback function that is called if the objects collide.
    * @param processCallback An optional callback function that lets you perform additional checks against the two objects if they collide. If this is set then `collideCallback` will only be called if this callback returns `true`.
    * @param callbackContext The context in which to run the callbacks.
    */
  def collideTiles(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tiles: js.Array[phaserLib.PhaserNs.TilemapsNs.Tile]
  ): scala.Boolean = js.native
  def collideTiles(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tiles: js.Array[phaserLib.PhaserNs.TilemapsNs.Tile],
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): scala.Boolean = js.native
  def collideTiles(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tiles: js.Array[phaserLib.PhaserNs.TilemapsNs.Tile],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): scala.Boolean = js.native
  def collideTiles(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tiles: js.Array[phaserLib.PhaserNs.TilemapsNs.Tile],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): scala.Boolean = js.native
  /**
    * Calculates a Body's angular velocity.
    * @param body The Body to compute the velocity for.
    * @param delta The delta value to be used in the calculation, in seconds.
    */
  def computeAngularVelocity(body: Body, delta: scala.Double): scala.Unit = js.native
  /**
    * Calculates a Body's per-axis velocity.
    * @param body The Body to compute the velocity for.
    * @param delta The delta value to be used in the calculation, in seconds.
    */
  def computeVelocity(body: Body, delta: scala.Double): scala.Unit = js.native
  /**
    * Creates a Graphics Game Object that the world will use to render the debug display to.
    * 
    * This is called automatically when the World is instantiated if the `debug` config property
    * was set to `true`. However, you can call it at any point should you need to display the
    * debug Graphic from a fixed point.
    * 
    * You can control which objects are drawn to the Graphics object, and the colors they use,
    * by setting the debug properties in the physics config.
    * 
    * You should not typically use this in a production game. Use it to aid during debugging.
    */
  def createDebugGraphic(): phaserLib.PhaserNs.GameObjectsNs.Graphics = js.native
  def disable(
    `object`: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ]
  ): scala.Unit = js.native
  /**
    * Disables the Arcade Physics Body of a Game Object, an array of Game Objects, or the children of a Group.
    * 
    * The difference between this and the `disableBody` method is that you can pass arrays or Groups
    * to this method.
    * 
    * The body itself is not deleted, it just has its `enable` property set to false, which
    * means you can re-enable it again at any point by passing it to enable `World.enable` or `World.add`.
    * @param object The object, or objects, on which to disable the bodies.
    */
  def disable(`object`: phaserLib.PhaserNs.GameObjectsNs.GameObject): scala.Unit = js.native
  def disable(`object`: phaserLib.PhaserNs.GameObjectsNs.Group): scala.Unit = js.native
  /**
    * Disables an existing Arcade Physics Body or StaticBody and removes it from the simulation.
    * 
    * The body is disabled and removed from the local search trees.
    * 
    * The body itself is not deleted, it just has its `enable` property set to false, which
    * means you can re-enable it again at any point by passing it to enable `World.enable` or `World.add`.
    * @param body The Body to be disabled.
    */
  def disableBody(body: Body): scala.Unit = js.native
  def disableBody(body: StaticBody): scala.Unit = js.native
  def enable(
    `object`: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ]
  ): scala.Unit = js.native
  def enable(
    `object`: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    bodyType: phaserLib.integer
  ): scala.Unit = js.native
  /**
    * Adds an Arcade Physics Body to a Game Object, an array of Game Objects, or the children of a Group.
    * 
    * The difference between this and the `enableBody` method is that you can pass arrays or Groups
    * to this method.
    * 
    * You can specify if the bodies are to be Dynamic or Static. A dynamic body can move via velocity and
    * acceleration. A static body remains fixed in place and as such is able to use an optimized search
    * tree, making it ideal for static elements such as level objects. You can still collide and overlap
    * with static bodies.
    * 
    * Normally, rather than calling this method directly, you'd use the helper methods available in the
    * Arcade Physics Factory, such as:
    * 
    * ```javascript
    * this.physics.add.image(x, y, textureKey);
    * this.physics.add.sprite(x, y, textureKey);
    * ```
    * 
    * Calling factory methods encapsulates the creation of a Game Object and the creation of its
    * body at the same time. If you are creating custom classes then you can pass them to this
    * method to have their bodies created.
    * @param object The object, or objects, on which to create the bodies.
    * @param bodyType The type of Body to create. Either `DYNAMIC_BODY` or `STATIC_BODY`.
    */
  def enable(`object`: phaserLib.PhaserNs.GameObjectsNs.GameObject): scala.Unit = js.native
  def enable(`object`: phaserLib.PhaserNs.GameObjectsNs.GameObject, bodyType: phaserLib.integer): scala.Unit = js.native
  def enable(`object`: phaserLib.PhaserNs.GameObjectsNs.Group): scala.Unit = js.native
  def enable(`object`: phaserLib.PhaserNs.GameObjectsNs.Group, bodyType: phaserLib.integer): scala.Unit = js.native
  /**
    * Creates an Arcade Physics Body on a single Game Object.
    * 
    * If the Game Object already has a body, this method will simply add it back into the simulation.
    * 
    * You can specify if the body is Dynamic or Static. A dynamic body can move via velocity and
    * acceleration. A static body remains fixed in place and as such is able to use an optimized search
    * tree, making it ideal for static elements such as level objects. You can still collide and overlap
    * with static bodies.
    * 
    * Normally, rather than calling this method directly, you'd use the helper methods available in the
    * Arcade Physics Factory, such as:
    * 
    * ```javascript
    * this.physics.add.image(x, y, textureKey);
    * this.physics.add.sprite(x, y, textureKey);
    * ```
    * 
    * Calling factory methods encapsulates the creation of a Game Object and the creation of its
    * body at the same time. If you are creating custom classes then you can pass them to this
    * method to have their bodies created.
    * @param object The Game Object on which to create the body.
    * @param bodyType The type of Body to create. Either `DYNAMIC_BODY` or `STATIC_BODY`.
    */
  def enableBody(`object`: phaserLib.PhaserNs.GameObjectsNs.GameObject): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def enableBody(`object`: phaserLib.PhaserNs.GameObjectsNs.GameObject, bodyType: phaserLib.integer): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Checks to see if two Bodies intersect at all.
    * @param body1 The first body to check.
    * @param body2 The second body to check.
    */
  def intersects(body1: Body, body2: Body): scala.Boolean = js.native
  /**
    * Tests if Game Objects overlap.
    * @param object1 The first object or array of objects to check.
    * @param object2 The second object or array of objects to check, or `undefined`.
    * @param overlapCallback An optional callback function that is called if the objects overlap.
    * @param processCallback An optional callback function that lets you perform additional checks against the two objects if they overlap. If this is set then `overlapCallback` will only be called if this callback returns `true`.
    * @param callbackContext The context in which to run the callbacks.
    */
  def overlap(object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType): scala.Boolean = js.native
  def overlap(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType
  ): scala.Boolean = js.native
  def overlap(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    overlapCallback: phaserLib.ArcadePhysicsCallback
  ): scala.Boolean = js.native
  def overlap(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    overlapCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): scala.Boolean = js.native
  def overlap(
    object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType,
    overlapCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): scala.Boolean = js.native
  /**
    * This advanced method is specifically for testing for overlaps between a single Sprite and an array of Tile objects.
    * 
    * You should generally use the `overlap` method instead, with a Sprite vs. a Tilemap Layer, as that will perform
    * tile filtering and culling for you, as well as handle the interesting face collision automatically.
    * 
    * This method is offered for those who would like to check for overlaps with specific Tiles in a layer, without
    * having to set any collision attributes on the tiles in question. This allows you to perform quick dynamic overlap
    * tests on small sets of Tiles. As such, no culling or checks are made to the array of Tiles given to this method,
    * you should filter them before passing them to this method.
    * @param sprite The first object to check for collision.
    * @param tiles An array of Tiles to check for collision against.
    * @param collideCallback An optional callback function that is called if the objects overlap.
    * @param processCallback An optional callback function that lets you perform additional checks against the two objects if they collide. If this is set then `collideCallback` will only be called if this callback returns `true`.
    * @param callbackContext The context in which to run the callbacks.
    */
  def overlapTiles(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tiles: js.Array[phaserLib.PhaserNs.TilemapsNs.Tile]
  ): scala.Boolean = js.native
  def overlapTiles(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tiles: js.Array[phaserLib.PhaserNs.TilemapsNs.Tile],
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): scala.Boolean = js.native
  def overlapTiles(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tiles: js.Array[phaserLib.PhaserNs.TilemapsNs.Tile],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): scala.Boolean = js.native
  def overlapTiles(
    sprite: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    tiles: js.Array[phaserLib.PhaserNs.TilemapsNs.Tile],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): scala.Boolean = js.native
  /**
    * Pauses the simulation.
    * 
    * A paused simulation does not update any existing bodies, or run any Colliders.
    * 
    * However, you can still enable and disable bodies within it, or manually run collide or overlap
    * checks.
    */
  def pause(): World = js.native
  /**
    * Updates bodies, draws the debug display, and handles pending queue operations.
    */
  def postUpdate(): scala.Unit = js.native
  /**
    * Removes an existing Arcade Physics Body or StaticBody from the simulation.
    * 
    * The body is disabled and removed from the local search trees.
    * 
    * The body itself is not deleted, it just has its `enabled` property set to false, which
    * means you can re-enable it again at any point by passing it to enable `enable` or `add`.
    * @param body The body to be removed from the simulation.
    */
  def remove(body: Body): scala.Unit = js.native
  def remove(body: StaticBody): scala.Unit = js.native
  /**
    * Removes a Collider from the simulation so it is no longer processed.
    * 
    * This method does not destroy the Collider. If you wish to add it back at a later stage you can call
    * `World.colliders.add(Collider)`.
    * 
    * If you no longer need the Collider you can call the `Collider.destroy` method instead, which will
    * automatically clear all of its references and then remove it from the World. If you call destroy on
    * a Collider you _don't_ need to pass it to this method too.
    * @param collider The Collider to remove from the simulation.
    */
  def removeCollider(collider: Collider): World = js.native
  /**
    * Resumes the simulation, if paused.
    */
  def resume(): World = js.native
  /**
    * Separates two Bodies.
    * @param body1 The first Body to be separated.
    * @param body2 The second Body to be separated.
    * @param processCallback The process callback.
    * @param callbackContext The context in which to invoke the callback.
    * @param overlapOnly If this a collide or overlap check?
    */
  def separate(body1: Body, body2: Body): scala.Boolean = js.native
  def separate(body1: Body, body2: Body, processCallback: phaserLib.ArcadePhysicsCallback): scala.Boolean = js.native
  def separate(
    body1: Body,
    body2: Body,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): scala.Boolean = js.native
  def separate(
    body1: Body,
    body2: Body,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any,
    overlapOnly: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * Separates two Bodies, when both are circular.
    * @param body1 The first Body to be separated.
    * @param body2 The second Body to be separated.
    * @param overlapOnly If this a collide or overlap check?
    * @param bias A small value added to the calculations.
    */
  def separateCircle(body1: Body, body2: Body): scala.Boolean = js.native
  def separateCircle(body1: Body, body2: Body, overlapOnly: scala.Boolean): scala.Boolean = js.native
  def separateCircle(body1: Body, body2: Body, overlapOnly: scala.Boolean, bias: scala.Double): scala.Boolean = js.native
  /**
    * Sets the position, size and properties of the World boundary.
    * 
    * The World boundary is an invisible rectangle that defines the edges of the World.
    * If a Body is set to collide with the world bounds then it will automatically stop
    * when it reaches any of the edges. You can optionally set which edges of the boundary
    * should be checked against.
    * @param x The top-left x coordinate of the boundary.
    * @param y The top-left y coordinate of the boundary.
    * @param width The width of the boundary.
    * @param height The height of the boundary.
    * @param checkLeft Should bodies check against the left edge of the boundary?
    * @param checkRight Should bodies check against the right edge of the boundary?
    * @param checkUp Should bodies check against the top edge of the boundary?
    * @param checkDown Should bodies check against the bottom edge of the boundary?
    */
  def setBounds(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): World = js.native
  def setBounds(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    checkLeft: scala.Boolean
  ): World = js.native
  def setBounds(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    checkLeft: scala.Boolean,
    checkRight: scala.Boolean
  ): World = js.native
  def setBounds(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    checkLeft: scala.Boolean,
    checkRight: scala.Boolean,
    checkUp: scala.Boolean
  ): World = js.native
  def setBounds(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    checkLeft: scala.Boolean,
    checkRight: scala.Boolean,
    checkUp: scala.Boolean,
    checkDown: scala.Boolean
  ): World = js.native
  /**
    * Enables or disables collisions on each edge of the World boundary.
    * @param left Should bodies check against the left edge of the boundary? Default true.
    * @param right Should bodies check against the right edge of the boundary? Default true.
    * @param up Should bodies check against the top edge of the boundary? Default true.
    * @param down Should bodies check against the bottom edge of the boundary? Default true.
    */
  def setBoundsCollision(): World = js.native
  def setBoundsCollision(left: scala.Boolean): World = js.native
  def setBoundsCollision(left: scala.Boolean, right: scala.Boolean): World = js.native
  def setBoundsCollision(left: scala.Boolean, right: scala.Boolean, up: scala.Boolean): World = js.native
  def setBoundsCollision(left: scala.Boolean, right: scala.Boolean, up: scala.Boolean, down: scala.Boolean): World = js.native
  /**
    * Sets the frame rate to run the simulation at.
    * 
    * The frame rate value is used to simulate a fixed update time step. This fixed
    * time step allows for a straightforward implementation of a deterministic game state.
    * 
    * This frame rate is independent of the frequency at which the game is rendering. The
    * higher you set the fps, the more physics simulation steps will occur per game step.
    * Conversely, the lower you set it, the less will take place.
    * 
    * You can optionally advance the simulation directly yourself by calling the `step` method.
    * @param framerate The frame rate to advance the simulation at.
    */
  def setFPS(framerate: phaserLib.integer): this.type = js.native
  /**
    * Advances the simulation by a time increment.
    * @param delta The delta time amount, in seconds, by which to advance the simulation.
    */
  def step(delta: scala.Double): scala.Unit = js.native
  /**
    * Advances the simulation based on the elapsed time and fps rate.
    * 
    * This is called automatically by your Scene and does not need to be invoked directly.
    * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  /* protected */ def update(time: scala.Double, delta: scala.Double): scala.Unit = js.native
  /**
    * Calculates a Body's velocity and updates its position.
    * @param body The Body to be updated.
    * @param delta The delta value to be used in the motion calculations, in seconds.
    */
  def updateMotion(body: Body, delta: scala.Double): scala.Unit = js.native
  /**
    * Wrap an object's coordinates (or several objects' coordinates) within {@link Phaser.Physics.Arcade.World#bounds}.
    * 
    * If the object is outside any boundary edge (left, top, right, bottom), it will be moved to the same offset from the opposite edge (the interior).
    * @param object A Game Object, a Group, an object with `x` and `y` coordinates, or an array of such objects.
    * @param padding An amount added to each boundary edge during the operation. Default 0.
    */
  def wrap(`object`: js.Any): scala.Unit = js.native
  def wrap(`object`: js.Any, padding: scala.Double): scala.Unit = js.native
  /**
    * Wrap each object's coordinates within {@link Phaser.Physics.Arcade.World#bounds}.
    * @param objects An array of objects to be wrapped.
    * @param padding An amount added to the boundary. Default 0.
    */
  def wrapArray(objects: js.Array[_]): scala.Unit = js.native
  def wrapArray(objects: js.Array[_], padding: scala.Double): scala.Unit = js.native
  /**
    * Wrap an object's coordinates within {@link Phaser.Physics.Arcade.World#bounds}.
    * @param object A Game Object, a Physics Body, or any object with `x` and `y` coordinates
    * @param padding An amount added to the boundary. Default 0.
    */
  def wrapObject(`object`: js.Any): scala.Unit = js.native
  def wrapObject(`object`: js.Any, padding: scala.Double): scala.Unit = js.native
}


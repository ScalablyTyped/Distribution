package typings.phaser.PhaserNs.PhysicsNs.ArcadeNs

import typings.phaser.ArcadePhysicsCallback
import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.PhaserNs.Scene
import typings.phaser.PhaserNs.ScenesNs.Systems
import typings.phaser.PhaserNs.TilemapsNs.Tile
import typings.phaser.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
class ArcadePhysics protected () extends js.Object {
  /**
    * 
    * @param scene The Scene that this Plugin belongs to.
    */
  def this(scene: Scene) = this()
  /**
    * An object holding the Arcade Physics factory methods.
    */
  var add: Factory = js.native
  /**
    * A configuration object. Union of the `physics.arcade.*` properties of the GameConfig and SceneConfig objects.
    */
  var config: js.Object = js.native
  /**
    * The Scene that this Plugin belongs to.
    */
  var scene: Scene = js.native
  /**
    * The Scene's Systems.
    */
  var systems: Systems = js.native
  /**
    * The physics simulation.
    */
  var world: World = js.native
  /**
    * Sets the acceleration.x/y property on the game object so it will move towards the x/y coordinates at the given rate (in pixels per second squared)
    * 
    * You must give a maximum speed value, beyond which the game object won't go any faster.
    * 
    * Note: The game object does not continuously track the target. If the target changes location during transit the game object will not modify its course.
    * Note: The game object doesn't stop moving once it reaches the destination coordinates.
    * @param gameObject Any Game Object with an Arcade Physics body.
    * @param x The x coordinate to accelerate towards.
    * @param y The y coordinate to accelerate towards.
    * @param speed The acceleration (change in speed) in pixels per second squared. Default 60.
    * @param xSpeedMax The maximum x velocity the game object can reach. Default 500.
    * @param ySpeedMax The maximum y velocity the game object can reach. Default 500.
    */
  def accelerateTo(gameObject: GameObject, x: Double, y: Double): Double = js.native
  def accelerateTo(gameObject: GameObject, x: Double, y: Double, speed: Double): Double = js.native
  def accelerateTo(gameObject: GameObject, x: Double, y: Double, speed: Double, xSpeedMax: Double): Double = js.native
  def accelerateTo(gameObject: GameObject, x: Double, y: Double, speed: Double, xSpeedMax: Double, ySpeedMax: Double): Double = js.native
  /**
    * Sets the acceleration.x/y property on the game object so it will move towards the x/y coordinates at the given rate (in pixels per second squared)
    * 
    * You must give a maximum speed value, beyond which the game object won't go any faster.
    * 
    * Note: The game object does not continuously track the target. If the target changes location during transit the game object will not modify its course.
    * Note: The game object doesn't stop moving once it reaches the destination coordinates.
    * @param gameObject Any Game Object with an Arcade Physics body.
    * @param destination The Game Object to move towards. Can be any object but must have visible x/y properties.
    * @param speed The acceleration (change in speed) in pixels per second squared. Default 60.
    * @param xSpeedMax The maximum x velocity the game object can reach. Default 500.
    * @param ySpeedMax The maximum y velocity the game object can reach. Default 500.
    */
  def accelerateToObject(gameObject: GameObject, destination: GameObject): Double = js.native
  def accelerateToObject(gameObject: GameObject, destination: GameObject, speed: Double): Double = js.native
  def accelerateToObject(gameObject: GameObject, destination: GameObject, speed: Double, xSpeedMax: Double): Double = js.native
  def accelerateToObject(
    gameObject: GameObject,
    destination: GameObject,
    speed: Double,
    xSpeedMax: Double,
    ySpeedMax: Double
  ): Double = js.native
  /**
    * Finds the Dynamic Body closest to a source point or object.
    * 
    * If two or more bodies are the exact same distance from the source point, only the first body
    * is returned.
    * @param source Any object with public `x` and `y` properties, such as a Game Object or Geometry object.
    */
  def closest(source: js.Any): Body = js.native
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
  def collide(object1: ArcadeColliderType): Boolean = js.native
  def collide(object1: ArcadeColliderType, object2: ArcadeColliderType): Boolean = js.native
  def collide(object1: ArcadeColliderType, object2: ArcadeColliderType, collideCallback: ArcadePhysicsCallback): Boolean = js.native
  def collide(
    object1: ArcadeColliderType,
    object2: ArcadeColliderType,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Boolean = js.native
  def collide(
    object1: ArcadeColliderType,
    object2: ArcadeColliderType,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Boolean = js.native
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
  def collideTiles(sprite: GameObject, tiles: js.Array[Tile]): Boolean = js.native
  def collideTiles(sprite: GameObject, tiles: js.Array[Tile], collideCallback: ArcadePhysicsCallback): Boolean = js.native
  def collideTiles(
    sprite: GameObject,
    tiles: js.Array[Tile],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Boolean = js.native
  def collideTiles(
    sprite: GameObject,
    tiles: js.Array[Tile],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Boolean = js.native
  /**
    * The Scene that owns this plugin is being destroyed.
    * We need to shutdown and then kill off all external references.
    */
  def destroy(): Unit = js.native
  /**
    * Finds the Dynamic Body farthest from a source point or object.
    * 
    * If two or more bodies are the exact same distance from the source point, only the first body
    * is returned.
    * @param source Any object with public `x` and `y` properties, such as a Game Object or Geometry object.
    */
  def furthest(source: js.Any): Body = js.native
  /**
    * Creates the physics configuration for the current Scene.
    */
  def getConfig(): js.Object = js.native
  /**
    * Move the given display object towards the x/y coordinates at a steady velocity.
    * If you specify a maxTime then it will adjust the speed (over-writing what you set) so it arrives at the destination in that number of seconds.
    * Timings are approximate due to the way browser timers work. Allow for a variance of +- 50ms.
    * Note: The display object does not continuously track the target. If the target changes location during transit the display object will not modify its course.
    * Note: The display object doesn't stop moving once it reaches the destination coordinates.
    * Note: Doesn't take into account acceleration, maxVelocity or drag (if you've set drag or acceleration too high this object may not move at all)
    * @param gameObject Any Game Object with an Arcade Physics body.
    * @param x The x coordinate to move towards.
    * @param y The y coordinate to move towards.
    * @param speed The speed it will move, in pixels per second (default is 60 pixels/sec) Default 60.
    * @param maxTime Time given in milliseconds (1000 = 1 sec). If set the speed is adjusted so the object will arrive at destination in the given number of ms. Default 0.
    */
  def moveTo(gameObject: GameObject, x: Double, y: Double): Double = js.native
  def moveTo(gameObject: GameObject, x: Double, y: Double, speed: Double): Double = js.native
  def moveTo(gameObject: GameObject, x: Double, y: Double, speed: Double, maxTime: Double): Double = js.native
  /**
    * Move the given display object towards the destination object at a steady velocity.
    * If you specify a maxTime then it will adjust the speed (overwriting what you set) so it arrives at the destination in that number of seconds.
    * Timings are approximate due to the way browser timers work. Allow for a variance of +- 50ms.
    * Note: The display object does not continuously track the target. If the target changes location during transit the display object will not modify its course.
    * Note: The display object doesn't stop moving once it reaches the destination coordinates.
    * Note: Doesn't take into account acceleration, maxVelocity or drag (if you've set drag or acceleration too high this object may not move at all)
    * @param gameObject Any Game Object with an Arcade Physics body.
    * @param destination Any object with public `x` and `y` properties, such as a Game Object or Geometry object.
    * @param speed The speed it will move, in pixels per second (default is 60 pixels/sec) Default 60.
    * @param maxTime Time given in milliseconds (1000 = 1 sec). If set the speed is adjusted so the object will arrive at destination in the given number of ms. Default 0.
    */
  def moveToObject(gameObject: GameObject, destination: js.Object): Double = js.native
  def moveToObject(gameObject: GameObject, destination: js.Object, speed: Double): Double = js.native
  def moveToObject(gameObject: GameObject, destination: js.Object, speed: Double, maxTime: Double): Double = js.native
  /**
    * Tests if Game Objects overlap. See {@link Phaser.Physics.Arcade.World#overlap}
    * @param object1 The first object or array of objects to check.
    * @param object2 The second object or array of objects to check, or `undefined`.
    * @param collideCallback An optional callback function that is called if the objects collide.
    * @param processCallback An optional callback function that lets you perform additional checks against the two objects if they overlap. If this is set then `collideCallback` will only be called if this callback returns `true`.
    * @param callbackContext The context in which to run the callbacks.
    */
  def overlap(object1: ArcadeColliderType): Boolean = js.native
  def overlap(object1: ArcadeColliderType, object2: ArcadeColliderType): Boolean = js.native
  def overlap(object1: ArcadeColliderType, object2: ArcadeColliderType, collideCallback: ArcadePhysicsCallback): Boolean = js.native
  def overlap(
    object1: ArcadeColliderType,
    object2: ArcadeColliderType,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Boolean = js.native
  def overlap(
    object1: ArcadeColliderType,
    object2: ArcadeColliderType,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Boolean = js.native
  /**
    * This method will search the given rectangular area and return an array of all physics bodies that
    * overlap with it. It can return either Dynamic, Static bodies or a mixture of both.
    * 
    * A body only has to intersect with the search area to be considered, it doesn't have to be fully
    * contained within it.
    * 
    * If Arcade Physics is set to use the RTree (which it is by default) then the search for is extremely fast,
    * otherwise the search is O(N) for Dynamic Bodies.
    * @param x The top-left x coordinate of the area to search within.
    * @param y The top-left y coordinate of the area to search within.
    * @param width The width of the area to search within.
    * @param height The height of the area to search within.
    * @param includeDynamic Should the search include Dynamic Bodies? Default true.
    * @param includeStatic Should the search include Static Bodies? Default false.
    */
  def overlapRect(x: Double, y: Double, width: Double, height: Double): js.Array[Body | StaticBody] = js.native
  def overlapRect(x: Double, y: Double, width: Double, height: Double, includeDynamic: Boolean): js.Array[Body | StaticBody] = js.native
  def overlapRect(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    includeDynamic: Boolean,
    includeStatic: Boolean
  ): js.Array[Body | StaticBody] = js.native
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
  def overlapTiles(sprite: GameObject, tiles: js.Array[Tile]): Boolean = js.native
  def overlapTiles(sprite: GameObject, tiles: js.Array[Tile], collideCallback: ArcadePhysicsCallback): Boolean = js.native
  def overlapTiles(
    sprite: GameObject,
    tiles: js.Array[Tile],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Boolean = js.native
  def overlapTiles(
    sprite: GameObject,
    tiles: js.Array[Tile],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Boolean = js.native
  /**
    * Pauses the simulation.
    */
  def pause(): World = js.native
  /**
    * Resumes the simulation (if paused).
    */
  def resume(): World = js.native
  /**
    * The Scene that owns this plugin is shutting down.
    * We need to kill and reset all internal properties as well as stop listening to Scene events.
    */
  def shutdown(): Unit = js.native
  /**
    * Given the angle (in degrees) and speed calculate the velocity and return it as a vector, or set it to the given vector object.
    * One way to use this is: velocityFromAngle(angle, 200, sprite.body.velocity) which will set the values directly to the sprite's velocity and not create a new vector object.
    * @param angle The angle in degrees calculated in clockwise positive direction (down = 90 degrees positive, right = 0 degrees positive, up = 90 degrees negative)
    * @param speed The speed it will move, in pixels per second squared. Default 60.
    * @param vec2 The Vector2 in which the x and y properties will be set to the calculated velocity.
    */
  def velocityFromAngle(angle: Double): Vector2 = js.native
  def velocityFromAngle(angle: Double, speed: Double): Vector2 = js.native
  def velocityFromAngle(angle: Double, speed: Double, vec2: Vector2): Vector2 = js.native
  /**
    * Given the rotation (in radians) and speed calculate the velocity and return it as a vector, or set it to the given vector object.
    * One way to use this is: velocityFromRotation(rotation, 200, sprite.body.velocity) which will set the values directly to the sprite's velocity and not create a new vector object.
    * @param rotation The angle in radians.
    * @param speed The speed it will move, in pixels per second squared Default 60.
    * @param vec2 The Vector2 in which the x and y properties will be set to the calculated velocity.
    */
  def velocityFromRotation(rotation: Double): Vector2 = js.native
  def velocityFromRotation(rotation: Double, speed: Double): Vector2 = js.native
  def velocityFromRotation(rotation: Double, speed: Double, vec2: Vector2): Vector2 = js.native
}


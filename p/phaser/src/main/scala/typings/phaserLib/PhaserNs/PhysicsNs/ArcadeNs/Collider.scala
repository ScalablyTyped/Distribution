package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Arcade Physics Collider will automatically check for collision, or overlaps, between two objects
  * every step. If a collision, or overlap, occurs it will invoke the given callbacks.
  */
@JSGlobal("Phaser.Physics.Arcade.Collider")
@js.native
class Collider protected () extends js.Object {
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
  def this(world: World, overlapOnly: scala.Boolean, object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType, object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType, collideCallback: phaserLib.ArcadePhysicsCallback, processCallback: phaserLib.ArcadePhysicsCallback, callbackContext: js.Any) = this()
  /**
    * Whether the collider is active.
    */
  var active: scala.Boolean = js.native
  /**
    * The context the collideCallback and processCallback will run in.
    */
  var callbackContext: js.Object = js.native
  /**
    * The callback to invoke when the two objects collide.
    */
  @JSName("collideCallback")
  var collideCallback_Original: phaserLib.ArcadePhysicsCallback = js.native
  /**
    * The name of the collider (unused by Phaser).
    */
  var name: java.lang.String = js.native
  /**
    * The first object to check for collision.
    */
  var object1: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType = js.native
  /**
    * The second object to check for collision.
    */
  var object2: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeColliderType = js.native
  /**
    * Whether to check for collisions or overlaps.
    */
  var overlapOnly: scala.Boolean = js.native
  /**
    * If a processCallback exists it must return true or collision checking will be skipped.
    */
  @JSName("processCallback")
  var processCallback_Original: phaserLib.ArcadePhysicsCallback = js.native
  /**
    * The world in which the bodies will collide.
    */
  var world: World = js.native
  /**
    * The callback to invoke when the two objects collide.
    */
  def collideCallback(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): scala.Unit = js.native
  /**
    * Removes Collider from World and disposes of its resources.
    */
  def destroy(): scala.Unit = js.native
  /**
    * If a processCallback exists it must return true or collision checking will be skipped.
    */
  def processCallback(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): scala.Unit = js.native
  /**
    * A name for the Collider.
    * 
    * Phaser does not use this value, it's for your own reference.
    * @param name The name to assign to the Collider.
    */
  def setName(name: java.lang.String): Collider = js.native
  /**
    * Called by World as part of its step processing, initial operation of collision checking.
    */
  def update(): scala.Unit = js.native
}


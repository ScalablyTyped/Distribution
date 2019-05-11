package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Arcade Physics Factory allows you to easily create Arcade Physics enabled Game Objects.
  * Objects that are created by this Factory are automatically added to the physics world.
  */
@JSGlobal("Phaser.Physics.Arcade.Factory")
@js.native
class Factory protected () extends js.Object {
  /**
    * 
    * @param world The Arcade Physics World instance.
    */
  def this(world: World) = this()
  /**
    * A reference to the Scene this Arcade Physics instance belongs to.
    */
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * A reference to the Scene.Systems this Arcade Physics instance belongs to.
    */
  var sys: phaserLib.PhaserNs.ScenesNs.Systems = js.native
  /**
    * A reference to the Arcade Physics World.
    */
  var world: World = js.native
  def collider(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ]
  ): Collider = js.native
  def collider(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def collider(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): Collider = js.native
  def collider(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def collider(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.Group
  ): Collider = js.native
  def collider(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ]
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  /**
    * Creates a new Arcade Physics Collider object.
    * @param object1 The first object to check for collision.
    * @param object2 The second object to check for collision.
    * @param collideCallback The callback to invoke when the two objects collide.
    * @param processCallback The callback to invoke when the two objects collide. Must return a boolean.
    * @param callbackContext The scope in which to call the callbacks.
    */
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.Group
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ]
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def collider(object1: phaserLib.PhaserNs.GameObjectsNs.Group, object2: phaserLib.PhaserNs.GameObjectsNs.Group): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  /**
    * Destroys this Factory.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Adds an Arcade Physics Body to the given Game Object.
    * @param gameObject A Game Object.
    * @param isStatic Create a Static body (true) or Dynamic body (false). Default false.
    */
  def existing(gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def existing(gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject, isStatic: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Creates a Physics Group object.
    * All Game Objects created by this Group will automatically be dynamic Arcade Physics objects.
    * @param children Game Objects to add to this group; or the `config` argument.
    * @param config Settings for this group.
    */
  def group(): Group = js.native
  def group(children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject]): Group = js.native
  def group(
    children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject],
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig
  ): Group = js.native
  def group(
    children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject],
    config: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig
  ): Group = js.native
  def group(children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig): Group = js.native
  def group(
    children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig,
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig
  ): Group = js.native
  def group(
    children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig,
    config: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig
  ): Group = js.native
  def group(children: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig): Group = js.native
  def group(
    children: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig,
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig
  ): Group = js.native
  def group(
    children: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig,
    config: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig
  ): Group = js.native
  /**
    * Creates a new Arcade Image object with a Dynamic body.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def image(x: scala.Double, y: scala.Double, texture: java.lang.String): Image = js.native
  def image(x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String): Image = js.native
  def image(x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer): Image = js.native
  def overlap(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ]
  ): Collider = js.native
  def overlap(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def overlap(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): Collider = js.native
  def overlap(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def overlap(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.Group
  ): Collider = js.native
  def overlap(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ]
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  /**
    * Creates a new Arcade Physics Collider Overlap object.
    * @param object1 The first object to check for overlap.
    * @param object2 The second object to check for overlap.
    * @param collideCallback The callback to invoke when the two objects collide.
    * @param processCallback The callback to invoke when the two objects collide. Must return a boolean.
    * @param callbackContext The scope in which to call the callbacks.
    */
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.Group
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ]
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: js.Array[
      phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.GameObjectsNs.Group
    ],
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def overlap(object1: phaserLib.PhaserNs.GameObjectsNs.Group, object2: phaserLib.PhaserNs.GameObjectsNs.Group): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: phaserLib.PhaserNs.GameObjectsNs.Group,
    object2: phaserLib.PhaserNs.GameObjectsNs.Group,
    collideCallback: phaserLib.ArcadePhysicsCallback,
    processCallback: phaserLib.ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  /**
    * Creates a new Arcade Sprite object with a Dynamic body.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param key The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def sprite(x: scala.Double, y: scala.Double, key: java.lang.String): Sprite = js.native
  def sprite(x: scala.Double, y: scala.Double, key: java.lang.String, frame: java.lang.String): Sprite = js.native
  def sprite(x: scala.Double, y: scala.Double, key: java.lang.String, frame: phaserLib.integer): Sprite = js.native
  /**
    * Creates a Static Physics Group object.
    * All Game Objects created by this Group will automatically be static Arcade Physics objects.
    * @param children Game Objects to add to this group; or the `config` argument.
    * @param config Settings for this group.
    */
  def staticGroup(): StaticGroup = js.native
  def staticGroup(children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject]): StaticGroup = js.native
  def staticGroup(
    children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject],
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig
  ): StaticGroup = js.native
  def staticGroup(
    children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject],
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig
  ): StaticGroup = js.native
  def staticGroup(children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig): StaticGroup = js.native
  def staticGroup(
    children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig,
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig
  ): StaticGroup = js.native
  def staticGroup(
    children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig,
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig
  ): StaticGroup = js.native
  def staticGroup(children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig): StaticGroup = js.native
  def staticGroup(
    children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig,
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig
  ): StaticGroup = js.native
  def staticGroup(
    children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig,
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig
  ): StaticGroup = js.native
  /**
    * Creates a new Arcade Image object with a Static body.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def staticImage(x: scala.Double, y: scala.Double, texture: java.lang.String): Image = js.native
  def staticImage(x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String): Image = js.native
  def staticImage(x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer): Image = js.native
  /**
    * Creates a new Arcade Sprite object with a Static body.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def staticSprite(x: scala.Double, y: scala.Double, texture: java.lang.String): Sprite = js.native
  def staticSprite(x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String): Sprite = js.native
  def staticSprite(x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer): Sprite = js.native
}


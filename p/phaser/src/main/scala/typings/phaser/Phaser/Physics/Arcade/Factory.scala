package typings.phaser.Phaser.Physics.Arcade

import typings.phaser.ArcadePhysicsCallback
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Types.GameObjects.Group.GroupConfig
import typings.phaser.Phaser.Types.GameObjects.Group.GroupCreateConfig
import typings.phaser.Phaser.Types.Physics.Arcade.PhysicsGroupConfig
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Arcade Physics Factory allows you to easily create Arcade Physics enabled Game Objects.
  * Objects that are created by this Factory are automatically added to the physics world.
  */
@js.native
trait Factory extends js.Object {
  /**
    * A reference to the Scene this Arcade Physics instance belongs to.
    */
  var scene: Scene = js.native
  /**
    * A reference to the Scene.Systems this Arcade Physics instance belongs to.
    */
  var sys: Systems = js.native
  /**
    * A reference to the Arcade Physics World.
    */
  var world: World = js.native
  def collider(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group]
  ): Collider = js.native
  def collider(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def collider(object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group], object2: GameObject): Collider = js.native
  def collider(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def collider(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: typings.phaser.Phaser.GameObjects.Group
  ): Collider = js.native
  def collider(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def collider(object1: GameObject, object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group]): Collider = js.native
  def collider(
    object1: GameObject,
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: GameObject,
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: GameObject,
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
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
  def collider(object1: GameObject, object2: GameObject): Collider = js.native
  def collider(object1: GameObject, object2: GameObject, collideCallback: ArcadePhysicsCallback): Collider = js.native
  def collider(
    object1: GameObject,
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: GameObject,
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def collider(object1: GameObject, object2: typings.phaser.Phaser.GameObjects.Group): Collider = js.native
  def collider(
    object1: GameObject,
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: GameObject,
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: GameObject,
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def collider(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group]
  ): Collider = js.native
  def collider(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def collider(object1: typings.phaser.Phaser.GameObjects.Group, object2: GameObject): Collider = js.native
  def collider(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def collider(object1: typings.phaser.Phaser.GameObjects.Group, object2: typings.phaser.Phaser.GameObjects.Group): Collider = js.native
  def collider(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def collider(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  /**
    * Destroys this Factory.
    */
  def destroy(): Unit = js.native
  /**
    * Adds an Arcade Physics Body to the given Game Object.
    * @param gameObject A Game Object.
    * @param isStatic Create a Static body (true) or Dynamic body (false). Default false.
    */
  def existing(gameObject: GameObject): GameObject = js.native
  def existing(gameObject: GameObject, isStatic: Boolean): GameObject = js.native
  /**
    * Creates a Physics Group object.
    * All Game Objects created by this Group will automatically be dynamic Arcade Physics objects.
    * @param children Game Objects to add to this group; or the `config` argument.
    * @param config Settings for this group.
    */
  def group(): Group = js.native
  def group(children: js.Array[GameObject]): Group = js.native
  def group(children: js.Array[GameObject], config: GroupCreateConfig): Group = js.native
  def group(children: js.Array[GameObject], config: PhysicsGroupConfig): Group = js.native
  def group(children: GroupCreateConfig): Group = js.native
  def group(children: GroupCreateConfig, config: GroupCreateConfig): Group = js.native
  def group(children: GroupCreateConfig, config: PhysicsGroupConfig): Group = js.native
  def group(children: PhysicsGroupConfig): Group = js.native
  def group(children: PhysicsGroupConfig, config: GroupCreateConfig): Group = js.native
  def group(children: PhysicsGroupConfig, config: PhysicsGroupConfig): Group = js.native
  /**
    * Creates a new Arcade Image object with a Dynamic body.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def image(x: Double, y: Double, texture: String): Image = js.native
  def image(x: Double, y: Double, texture: String, frame: String): Image = js.native
  def image(x: Double, y: Double, texture: String, frame: integer): Image = js.native
  def overlap(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group]
  ): Collider = js.native
  def overlap(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def overlap(object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group], object2: GameObject): Collider = js.native
  def overlap(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def overlap(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: typings.phaser.Phaser.GameObjects.Group
  ): Collider = js.native
  def overlap(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def overlap(object1: GameObject, object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group]): Collider = js.native
  def overlap(
    object1: GameObject,
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: GameObject,
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: GameObject,
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
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
  def overlap(object1: GameObject, object2: GameObject): Collider = js.native
  def overlap(object1: GameObject, object2: GameObject, collideCallback: ArcadePhysicsCallback): Collider = js.native
  def overlap(
    object1: GameObject,
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: GameObject,
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def overlap(object1: GameObject, object2: typings.phaser.Phaser.GameObjects.Group): Collider = js.native
  def overlap(
    object1: GameObject,
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: GameObject,
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: GameObject,
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def overlap(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group]
  ): Collider = js.native
  def overlap(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group],
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def overlap(object1: typings.phaser.Phaser.GameObjects.Group, object2: GameObject): Collider = js.native
  def overlap(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: GameObject,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  def overlap(object1: typings.phaser.Phaser.GameObjects.Group, object2: typings.phaser.Phaser.GameObjects.Group): Collider = js.native
  def overlap(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Collider = js.native
  def overlap(
    object1: typings.phaser.Phaser.GameObjects.Group,
    object2: typings.phaser.Phaser.GameObjects.Group,
    collideCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: js.Any
  ): Collider = js.native
  /**
    * Creates a new Arcade Sprite object with a Dynamic body.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param key The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def sprite(x: Double, y: Double, key: String): Sprite = js.native
  def sprite(x: Double, y: Double, key: String, frame: String): Sprite = js.native
  def sprite(x: Double, y: Double, key: String, frame: integer): Sprite = js.native
  /**
    * Creates a Static Physics Group object.
    * All Game Objects created by this Group will automatically be static Arcade Physics objects.
    * @param children Game Objects to add to this group; or the `config` argument.
    * @param config Settings for this group.
    */
  def staticGroup(): StaticGroup = js.native
  def staticGroup(children: js.Array[GameObject]): StaticGroup = js.native
  def staticGroup(children: js.Array[GameObject], config: GroupConfig): StaticGroup = js.native
  def staticGroup(children: js.Array[GameObject], config: GroupCreateConfig): StaticGroup = js.native
  def staticGroup(children: GroupConfig): StaticGroup = js.native
  def staticGroup(children: GroupConfig, config: GroupConfig): StaticGroup = js.native
  def staticGroup(children: GroupConfig, config: GroupCreateConfig): StaticGroup = js.native
  def staticGroup(children: GroupCreateConfig): StaticGroup = js.native
  def staticGroup(children: GroupCreateConfig, config: GroupConfig): StaticGroup = js.native
  def staticGroup(children: GroupCreateConfig, config: GroupCreateConfig): StaticGroup = js.native
  /**
    * Creates a new Arcade Image object with a Static body.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def staticImage(x: Double, y: Double, texture: String): Image = js.native
  def staticImage(x: Double, y: Double, texture: String, frame: String): Image = js.native
  def staticImage(x: Double, y: Double, texture: String, frame: integer): Image = js.native
  /**
    * Creates a new Arcade Sprite object with a Static body.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def staticSprite(x: Double, y: Double, texture: String): Sprite = js.native
  def staticSprite(x: Double, y: Double, texture: String, frame: String): Sprite = js.native
  def staticSprite(x: Double, y: Double, texture: String, frame: integer): Sprite = js.native
}


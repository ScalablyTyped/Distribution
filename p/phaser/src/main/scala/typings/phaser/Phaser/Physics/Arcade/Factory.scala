package typings.phaser.Phaser.Physics.Arcade

import typings.phaser.ArcadePhysicsCallback
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.Phaser.Types.GameObjects.Group.GroupConfig
import typings.phaser.Phaser.Types.GameObjects.Group.GroupCreateConfig
import typings.phaser.Phaser.Types.Physics.Arcade.GameObjectWithBody
import typings.phaser.Phaser.Types.Physics.Arcade.ImageWithDynamicBody
import typings.phaser.Phaser.Types.Physics.Arcade.ImageWithStaticBody
import typings.phaser.Phaser.Types.Physics.Arcade.PhysicsGroupConfig
import typings.phaser.Phaser.Types.Physics.Arcade.SpriteWithDynamicBody
import typings.phaser.Phaser.Types.Physics.Arcade.SpriteWithStaticBody
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Arcade Physics Factory allows you to easily create Arcade Physics enabled Game Objects.
  * Objects that are created by this Factory are automatically added to the physics world.
  */
@js.native
trait Factory extends js.Object {
  
  /**
    * Creates a new Arcade Physics Collider object.
    * @param object1 The first object to check for collision.
    * @param object2 The second object to check for collision.
    * @param collideCallback The callback to invoke when the two objects collide.
    * @param processCallback The callback to invoke when the two objects collide. Must return a boolean.
    * @param callbackContext The scope in which to call the callbacks.
    */
  def collider(
    object1: GameObject | (js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group]) | typings.phaser.Phaser.GameObjects.Group,
    object2: GameObject | (js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group]) | typings.phaser.Phaser.GameObjects.Group,
    collideCallback: js.UndefOr[ArcadePhysicsCallback],
    processCallback: js.UndefOr[ArcadePhysicsCallback],
    callbackContext: js.UndefOr[js.Any]
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
  def existing(gameObject: GameObject): GameObjectWithBody = js.native
  def existing(gameObject: GameObject, isStatic: Boolean): GameObjectWithBody = js.native
  
  /**
    * Creates a Physics Group object.
    * All Game Objects created by this Group will automatically be dynamic Arcade Physics objects.
    * @param children Game Objects to add to this group; or the `config` argument.
    * @param config Settings for this group.
    */
  def group(): Group = js.native
  def group(children: js.UndefOr[scala.Nothing], config: GroupCreateConfig): Group = js.native
  def group(children: js.UndefOr[scala.Nothing], config: PhysicsGroupConfig): Group = js.native
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
    * @param texture The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def image(x: Double, y: Double, texture: String): ImageWithDynamicBody = js.native
  def image(x: Double, y: Double, texture: String, frame: String): ImageWithDynamicBody = js.native
  def image(x: Double, y: Double, texture: String, frame: integer): ImageWithDynamicBody = js.native
  def image(x: Double, y: Double, texture: Texture): ImageWithDynamicBody = js.native
  def image(x: Double, y: Double, texture: Texture, frame: String): ImageWithDynamicBody = js.native
  def image(x: Double, y: Double, texture: Texture, frame: integer): ImageWithDynamicBody = js.native
  
  /**
    * Creates a new Arcade Physics Collider Overlap object.
    * @param object1 The first object to check for overlap.
    * @param object2 The second object to check for overlap.
    * @param collideCallback The callback to invoke when the two objects collide.
    * @param processCallback The callback to invoke when the two objects collide. Must return a boolean.
    * @param callbackContext The scope in which to call the callbacks.
    */
  def overlap(
    object1: GameObject | (js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group]) | typings.phaser.Phaser.GameObjects.Group,
    object2: GameObject | (js.Array[GameObject | typings.phaser.Phaser.GameObjects.Group]) | typings.phaser.Phaser.GameObjects.Group,
    collideCallback: js.UndefOr[ArcadePhysicsCallback],
    processCallback: js.UndefOr[ArcadePhysicsCallback],
    callbackContext: js.UndefOr[js.Any]
  ): Collider = js.native
  
  /**
    * A reference to the Scene this Arcade Physics instance belongs to.
    */
  var scene: Scene = js.native
  
  /**
    * Creates a new Arcade Sprite object with a Dynamic body.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param key The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def sprite(x: Double, y: Double, key: String): SpriteWithDynamicBody = js.native
  def sprite(x: Double, y: Double, key: String, frame: String): SpriteWithDynamicBody = js.native
  def sprite(x: Double, y: Double, key: String, frame: integer): SpriteWithDynamicBody = js.native
  
  /**
    * Creates a Static Physics Group object.
    * All Game Objects created by this Group will automatically be static Arcade Physics objects.
    * @param children Game Objects to add to this group; or the `config` argument.
    * @param config Settings for this group.
    */
  def staticGroup(): StaticGroup = js.native
  def staticGroup(children: js.UndefOr[scala.Nothing], config: GroupConfig): StaticGroup = js.native
  def staticGroup(children: js.UndefOr[scala.Nothing], config: GroupCreateConfig): StaticGroup = js.native
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
    * @param texture The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def staticImage(x: Double, y: Double, texture: String): ImageWithStaticBody = js.native
  def staticImage(x: Double, y: Double, texture: String, frame: String): ImageWithStaticBody = js.native
  def staticImage(x: Double, y: Double, texture: String, frame: integer): ImageWithStaticBody = js.native
  def staticImage(x: Double, y: Double, texture: Texture): ImageWithStaticBody = js.native
  def staticImage(x: Double, y: Double, texture: Texture, frame: String): ImageWithStaticBody = js.native
  def staticImage(x: Double, y: Double, texture: Texture, frame: integer): ImageWithStaticBody = js.native
  
  /**
    * Creates a new Arcade Sprite object with a Static body.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def staticSprite(x: Double, y: Double, texture: String): SpriteWithStaticBody = js.native
  def staticSprite(x: Double, y: Double, texture: String, frame: String): SpriteWithStaticBody = js.native
  def staticSprite(x: Double, y: Double, texture: String, frame: integer): SpriteWithStaticBody = js.native
  def staticSprite(x: Double, y: Double, texture: Texture): SpriteWithStaticBody = js.native
  def staticSprite(x: Double, y: Double, texture: Texture, frame: String): SpriteWithStaticBody = js.native
  def staticSprite(x: Double, y: Double, texture: Texture, frame: integer): SpriteWithStaticBody = js.native
  
  /**
    * A reference to the Scene.Systems this Arcade Physics instance belongs to.
    */
  var sys: Systems = js.native
  
  /**
    * A reference to the Arcade Physics World.
    */
  var world: World = js.native
}

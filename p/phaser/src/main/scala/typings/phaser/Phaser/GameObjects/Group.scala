package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Structs.Set
import typings.phaser.Phaser.Types.GameObjects.Group.GroupCallback
import typings.phaser.Phaser.Types.GameObjects.Group.GroupCreateConfig
import typings.phaser.Phaser.Types.GameObjects.Group.GroupMultipleCreateCallback
import typings.phaser.Phaser.Types.Input.HitAreaCallback
import typings.phaser.Phaser.Types.Math.Vector2Like
import typings.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Group is a way for you to create, manipulate, or recycle similar Game Objects.
  * 
  * Group membership is non-exclusive. A Game Object can belong to several groups, one group, or none.
  * 
  * Groups themselves aren't displayable, and can't be positioned, rotated, scaled, or hidden.
  */
@js.native
trait Group extends _ArcadeColliderType {
  
  /**
    * Whether this group runs its {@link Phaser.GameObjects.Group#preUpdate} method (which may update any members).
    */
  var active: Boolean = js.native
  
  /**
    * Adds a Game Object to this group.
    * 
    * Calls {@link Phaser.GameObjects.Group#createCallback}.
    * @param child The Game Object to add.
    * @param addToScene Also add the Game Object to the scene. Default false.
    */
  def add(child: GameObject): this.type = js.native
  def add(child: GameObject, addToScene: Boolean): this.type = js.native
  
  /**
    * Adds several Game Objects to this group.
    * 
    * Calls {@link Phaser.GameObjects.Group#createCallback}.
    * @param children The Game Objects to add.
    * @param addToScene Also add the Game Objects to the scene. Default false.
    */
  def addMultiple(children: js.Array[GameObject]): this.type = js.native
  def addMultiple(children: js.Array[GameObject], addToScene: Boolean): this.type = js.native
  
  /**
    * Sets the angle of each group member.
    * @param value The amount to set the angle to, in degrees.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    */
  def angle(value: Double): this.type = js.native
  def angle(value: Double, step: Double): this.type = js.native
  
  /**
    * Members of this group.
    */
  var children: Set[GameObject] = js.native
  
  /**
    * The class to create new group members from.
    */
  var classType: js.Function = js.native
  
  /**
    * Removes all members of this Group and optionally removes them from the Scene and / or destroys them.
    * 
    * Does not call {@link Phaser.GameObjects.Group#removeCallback}.
    * @param removeFromScene Optionally remove each Group member from the Scene. Default false.
    * @param destroyChild Optionally call destroy on the removed Group members. Default false.
    */
  def clear(): this.type = js.native
  def clear(removeFromScene: js.UndefOr[scala.Nothing], destroyChild: Boolean): this.type = js.native
  def clear(removeFromScene: Boolean): this.type = js.native
  def clear(removeFromScene: Boolean, destroyChild: Boolean): this.type = js.native
  
  /**
    * Tests if a Game Object is a member of this group.
    * @param child A Game Object.
    */
  def contains(child: GameObject): Boolean = js.native
  
  /**
    * Counts the number of active (or inactive) group members.
    * @param value Count active (true) or inactive (false) group members. Default true.
    */
  def countActive(): integer = js.native
  def countActive(value: Boolean): integer = js.native
  
  /**
    * Creates a new Game Object and adds it to this group, unless the group {@link Phaser.GameObjects.Group#isFull is full}.
    * 
    * Calls {@link Phaser.GameObjects.Group#createCallback}.
    * @param x The horizontal position of the new Game Object in the world. Default 0.
    * @param y The vertical position of the new Game Object in the world. Default 0.
    * @param key The texture key of the new Game Object. Default defaultKey.
    * @param frame The texture frame of the new Game Object. Default defaultFrame.
    * @param visible The {@link Phaser.GameObjects.Components.Visible#visible} state of the new Game Object. Default true.
    * @param active The {@link Phaser.GameObjects.GameObject#active} state of the new Game Object. Default true.
    */
  def create(
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    key: js.UndefOr[String],
    frame: js.UndefOr[String | integer],
    visible: js.UndefOr[Boolean],
    active: js.UndefOr[Boolean]
  ): js.Any = js.native
  
  /**
    * A function to be called when adding or creating group members.
    */
  def createCallback(item: GameObject): Unit = js.native
  /**
    * A function to be called when adding or creating group members.
    */
  @JSName("createCallback")
  var createCallback_Original: GroupCallback = js.native
  
  /**
    * A helper for {@link Phaser.GameObjects.Group#createMultiple}.
    * @param options Creation settings.
    */
  def createFromConfig(options: GroupCreateConfig): js.Array[_] = js.native
  
  def createMultiple(config: js.Array[GroupCreateConfig]): js.Array[_] = js.native
  /**
    * Creates several Game Objects and adds them to this group.
    * 
    * If the group becomes {@link Phaser.GameObjects.Group#isFull}, no further Game Objects are created.
    * 
    * Calls {@link Phaser.GameObjects.Group#createMultipleCallback} and {@link Phaser.GameObjects.Group#createCallback}.
    * @param config Creation settings. This can be a single configuration object or an array of such objects, which will be applied in turn.
    */
  def createMultiple(config: GroupCreateConfig): js.Array[_] = js.native
  
  /**
    * A function to be called when creating several group members at once.
    */
  def createMultipleCallback(items: js.Array[GameObject]): Unit = js.native
  /**
    * A function to be called when creating several group members at once.
    */
  @JSName("createMultipleCallback")
  var createMultipleCallback_Original: GroupMultipleCreateCallback = js.native
  
  /**
    * A default texture frame to use when creating new group members.
    */
  var defaultFrame: String | integer = js.native
  
  /**
    * A default texture key to use when creating new group members.
    * 
    * This is used in {@link Phaser.GameObjects.Group#create}
    * but not in {@link Phaser.GameObjects.Group#createMultiple}.
    */
  var defaultKey: String = js.native
  
  /**
    * Empties this group and removes it from the Scene.
    * 
    * Does not call {@link Phaser.GameObjects.Group#removeCallback}.
    * @param destroyChildren Also {@link Phaser.GameObjects.GameObject#destroy} each group member. Default false.
    */
  def destroy(): Unit = js.native
  def destroy(destroyChildren: Boolean): Unit = js.native
  
  /**
    * Scans the group for the first member that has an {@link Phaser.GameObjects.GameObject#active} state set to `false`,
    * assigns `x` and `y`, and returns the member.
    * 
    * If no inactive member is found and the group isn't full then it will create a new Game Object using `x`, `y`, `key`, `frame`, and `visible`.
    * The new Game Object will have its active state set to `true`.
    * Unless a new member is created, `key`, `frame`, and `visible` are ignored.
    * @param x The horizontal position of the Game Object in the world.
    * @param y The vertical position of the Game Object in the world.
    * @param key The texture key assigned to a new Game Object (if one is created). Default defaultKey.
    * @param frame A texture frame assigned to a new Game Object (if one is created). Default defaultFrame.
    * @param visible The {@link Phaser.GameObjects.Components.Visible#visible} state of a new Game Object (if one is created). Default true.
    */
  def get(): js.Any = js.native
  def get(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    frame: js.UndefOr[scala.Nothing],
    visible: Boolean
  ): js.Any = js.native
  def get(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    frame: String
  ): js.Any = js.native
  def get(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    frame: String,
    visible: Boolean
  ): js.Any = js.native
  def get(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    frame: integer
  ): js.Any = js.native
  def get(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    frame: integer,
    visible: Boolean
  ): js.Any = js.native
  def get(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], key: String): js.Any = js.native
  def get(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    key: String,
    frame: js.UndefOr[scala.Nothing],
    visible: Boolean
  ): js.Any = js.native
  def get(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], key: String, frame: String): js.Any = js.native
  def get(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    key: String,
    frame: String,
    visible: Boolean
  ): js.Any = js.native
  def get(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], key: String, frame: integer): js.Any = js.native
  def get(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    key: String,
    frame: integer,
    visible: Boolean
  ): js.Any = js.native
  def get(x: js.UndefOr[scala.Nothing], y: Double): js.Any = js.native
  def get(
    x: js.UndefOr[scala.Nothing],
    y: Double,
    key: js.UndefOr[scala.Nothing],
    frame: js.UndefOr[scala.Nothing],
    visible: Boolean
  ): js.Any = js.native
  def get(x: js.UndefOr[scala.Nothing], y: Double, key: js.UndefOr[scala.Nothing], frame: String): js.Any = js.native
  def get(
    x: js.UndefOr[scala.Nothing],
    y: Double,
    key: js.UndefOr[scala.Nothing],
    frame: String,
    visible: Boolean
  ): js.Any = js.native
  def get(x: js.UndefOr[scala.Nothing], y: Double, key: js.UndefOr[scala.Nothing], frame: integer): js.Any = js.native
  def get(
    x: js.UndefOr[scala.Nothing],
    y: Double,
    key: js.UndefOr[scala.Nothing],
    frame: integer,
    visible: Boolean
  ): js.Any = js.native
  def get(x: js.UndefOr[scala.Nothing], y: Double, key: String): js.Any = js.native
  def get(
    x: js.UndefOr[scala.Nothing],
    y: Double,
    key: String,
    frame: js.UndefOr[scala.Nothing],
    visible: Boolean
  ): js.Any = js.native
  def get(x: js.UndefOr[scala.Nothing], y: Double, key: String, frame: String): js.Any = js.native
  def get(x: js.UndefOr[scala.Nothing], y: Double, key: String, frame: String, visible: Boolean): js.Any = js.native
  def get(x: js.UndefOr[scala.Nothing], y: Double, key: String, frame: integer): js.Any = js.native
  def get(x: js.UndefOr[scala.Nothing], y: Double, key: String, frame: integer, visible: Boolean): js.Any = js.native
  def get(x: Double): js.Any = js.native
  def get(
    x: Double,
    y: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    frame: js.UndefOr[scala.Nothing],
    visible: Boolean
  ): js.Any = js.native
  def get(x: Double, y: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], frame: String): js.Any = js.native
  def get(
    x: Double,
    y: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    frame: String,
    visible: Boolean
  ): js.Any = js.native
  def get(x: Double, y: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], frame: integer): js.Any = js.native
  def get(
    x: Double,
    y: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    frame: integer,
    visible: Boolean
  ): js.Any = js.native
  def get(x: Double, y: js.UndefOr[scala.Nothing], key: String): js.Any = js.native
  def get(
    x: Double,
    y: js.UndefOr[scala.Nothing],
    key: String,
    frame: js.UndefOr[scala.Nothing],
    visible: Boolean
  ): js.Any = js.native
  def get(x: Double, y: js.UndefOr[scala.Nothing], key: String, frame: String): js.Any = js.native
  def get(x: Double, y: js.UndefOr[scala.Nothing], key: String, frame: String, visible: Boolean): js.Any = js.native
  def get(x: Double, y: js.UndefOr[scala.Nothing], key: String, frame: integer): js.Any = js.native
  def get(x: Double, y: js.UndefOr[scala.Nothing], key: String, frame: integer, visible: Boolean): js.Any = js.native
  def get(x: Double, y: Double): js.Any = js.native
  def get(
    x: Double,
    y: Double,
    key: js.UndefOr[scala.Nothing],
    frame: js.UndefOr[scala.Nothing],
    visible: Boolean
  ): js.Any = js.native
  def get(x: Double, y: Double, key: js.UndefOr[scala.Nothing], frame: String): js.Any = js.native
  def get(x: Double, y: Double, key: js.UndefOr[scala.Nothing], frame: String, visible: Boolean): js.Any = js.native
  def get(x: Double, y: Double, key: js.UndefOr[scala.Nothing], frame: integer): js.Any = js.native
  def get(x: Double, y: Double, key: js.UndefOr[scala.Nothing], frame: integer, visible: Boolean): js.Any = js.native
  def get(x: Double, y: Double, key: String): js.Any = js.native
  def get(x: Double, y: Double, key: String, frame: js.UndefOr[scala.Nothing], visible: Boolean): js.Any = js.native
  def get(x: Double, y: Double, key: String, frame: String): js.Any = js.native
  def get(x: Double, y: Double, key: String, frame: String, visible: Boolean): js.Any = js.native
  def get(x: Double, y: Double, key: String, frame: integer): js.Any = js.native
  def get(x: Double, y: Double, key: String, frame: integer, visible: Boolean): js.Any = js.native
  
  /**
    * All members of the group.
    */
  def getChildren(): js.Array[GameObject] = js.native
  
  /**
    * Scans the Group, from top to bottom, for the first member that has an {@link Phaser.GameObjects.GameObject#active} state matching the argument,
    * assigns `x` and `y`, and returns the member.
    * 
    * If no matching member is found and `createIfNull` is true and the group isn't full then it will create a new Game Object using `x`, `y`, `key`, `frame`, and `visible`.
    * Unless a new member is created, `key`, `frame`, and `visible` are ignored.
    * @param state The {@link Phaser.GameObjects.GameObject#active} value to match. Default false.
    * @param createIfNull Create a new Game Object if no matching members are found, using the following arguments. Default false.
    * @param x The horizontal position of the Game Object in the world.
    * @param y The vertical position of the Game Object in the world.
    * @param key The texture key assigned to a new Game Object (if one is created). Default defaultKey.
    * @param frame A texture frame assigned to a new Game Object (if one is created). Default defaultFrame.
    * @param visible The {@link Phaser.GameObjects.Components.Visible#visible} state of a new Game Object (if one is created). Default true.
    */
  def getFirst(
    state: js.UndefOr[Boolean],
    createIfNull: js.UndefOr[Boolean],
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    key: js.UndefOr[String],
    frame: js.UndefOr[String | integer],
    visible: js.UndefOr[Boolean]
  ): js.Any = js.native
  
  /**
    * Scans the group for the first member that has an {@link Phaser.GameObjects.GameObject#active} state set to `true`,
    * assigns `x` and `y`, and returns the member.
    * 
    * If no active member is found and `createIfNull` is `true` and the group isn't full then it will create a new one using `x`, `y`, `key`, `frame`, and `visible`.
    * Unless a new member is created, `key`, `frame`, and `visible` are ignored.
    * @param createIfNull Create a new Game Object if no matching members are found, using the following arguments. Default false.
    * @param x The horizontal position of the Game Object in the world.
    * @param y The vertical position of the Game Object in the world.
    * @param key The texture key assigned to a new Game Object (if one is created). Default defaultKey.
    * @param frame A texture frame assigned to a new Game Object (if one is created). Default defaultFrame.
    * @param visible The {@link Phaser.GameObjects.Components.Visible#visible} state of a new Game Object (if one is created). Default true.
    */
  def getFirstAlive(
    createIfNull: js.UndefOr[Boolean],
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    key: js.UndefOr[String],
    frame: js.UndefOr[String | integer],
    visible: js.UndefOr[Boolean]
  ): js.Any = js.native
  
  /**
    * Scans the group for the first member that has an {@link Phaser.GameObjects.GameObject#active} state set to `false`,
    * assigns `x` and `y`, and returns the member.
    * 
    * If no inactive member is found and `createIfNull` is `true` and the group isn't full then it will create a new one using `x`, `y`, `key`, `frame`, and `visible`.
    * The new Game Object will have an active state set to `true`.
    * Unless a new member is created, `key`, `frame`, and `visible` are ignored.
    * @param createIfNull Create a new Game Object if no matching members are found, using the following arguments. Default false.
    * @param x The horizontal position of the Game Object in the world.
    * @param y The vertical position of the Game Object in the world.
    * @param key The texture key assigned to a new Game Object (if one is created). Default defaultKey.
    * @param frame A texture frame assigned to a new Game Object (if one is created). Default defaultFrame.
    * @param visible The {@link Phaser.GameObjects.Components.Visible#visible} state of a new Game Object (if one is created). Default true.
    */
  def getFirstDead(
    createIfNull: js.UndefOr[Boolean],
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    key: js.UndefOr[String],
    frame: js.UndefOr[String | integer],
    visible: js.UndefOr[Boolean]
  ): js.Any = js.native
  
  /**
    * Scans the Group, from top to bottom, for the nth member that has an {@link Phaser.GameObjects.GameObject#active} state matching the argument,
    * assigns `x` and `y`, and returns the member.
    * 
    * If no matching member is found and `createIfNull` is true and the group isn't full then it will create a new Game Object using `x`, `y`, `key`, `frame`, and `visible`.
    * Unless a new member is created, `key`, `frame`, and `visible` are ignored.
    * @param nth The nth matching Group member to search for.
    * @param state The {@link Phaser.GameObjects.GameObject#active} value to match. Default false.
    * @param createIfNull Create a new Game Object if no matching members are found, using the following arguments. Default false.
    * @param x The horizontal position of the Game Object in the world.
    * @param y The vertical position of the Game Object in the world.
    * @param key The texture key assigned to a new Game Object (if one is created). Default defaultKey.
    * @param frame A texture frame assigned to a new Game Object (if one is created). Default defaultFrame.
    * @param visible The {@link Phaser.GameObjects.Components.Visible#visible} state of a new Game Object (if one is created). Default true.
    */
  def getFirstNth(
    nth: integer,
    state: js.UndefOr[Boolean],
    createIfNull: js.UndefOr[Boolean],
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    key: js.UndefOr[String],
    frame: js.UndefOr[String | integer],
    visible: js.UndefOr[Boolean]
  ): js.Any = js.native
  
  /**
    * Scans the Group for the last member that has an {@link Phaser.GameObjects.GameObject#active} state matching the argument,
    * assigns `x` and `y`, and returns the member.
    * 
    * If no matching member is found and `createIfNull` is true and the group isn't full then it will create a new Game Object using `x`, `y`, `key`, `frame`, and `visible`.
    * Unless a new member is created, `key`, `frame`, and `visible` are ignored.
    * @param state The {@link Phaser.GameObjects.GameObject#active} value to match. Default false.
    * @param createIfNull Create a new Game Object if no matching members are found, using the following arguments. Default false.
    * @param x The horizontal position of the Game Object in the world.
    * @param y The vertical position of the Game Object in the world.
    * @param key The texture key assigned to a new Game Object (if one is created). Default defaultKey.
    * @param frame A texture frame assigned to a new Game Object (if one is created). Default defaultFrame.
    * @param visible The {@link Phaser.GameObjects.Components.Visible#visible} state of a new Game Object (if one is created). Default true.
    */
  def getLast(
    state: js.UndefOr[Boolean],
    createIfNull: js.UndefOr[Boolean],
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    key: js.UndefOr[String],
    frame: js.UndefOr[String | integer],
    visible: js.UndefOr[Boolean]
  ): js.Any = js.native
  
  /**
    * Scans the Group for the last nth member that has an {@link Phaser.GameObjects.GameObject#active} state matching the argument,
    * assigns `x` and `y`, and returns the member.
    * 
    * If no matching member is found and `createIfNull` is true and the group isn't full then it will create a new Game Object using `x`, `y`, `key`, `frame`, and `visible`.
    * Unless a new member is created, `key`, `frame`, and `visible` are ignored.
    * @param nth The nth matching Group member to search for.
    * @param state The {@link Phaser.GameObjects.GameObject#active} value to match. Default false.
    * @param createIfNull Create a new Game Object if no matching members are found, using the following arguments. Default false.
    * @param x The horizontal position of the Game Object in the world.
    * @param y The vertical position of the Game Object in the world.
    * @param key The texture key assigned to a new Game Object (if one is created). Default defaultKey.
    * @param frame A texture frame assigned to a new Game Object (if one is created). Default defaultFrame.
    * @param visible The {@link Phaser.GameObjects.Components.Visible#visible} state of a new Game Object (if one is created). Default true.
    */
  def getLastNth(
    nth: integer,
    state: js.UndefOr[Boolean],
    createIfNull: js.UndefOr[Boolean],
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    key: js.UndefOr[String],
    frame: js.UndefOr[String | integer],
    visible: js.UndefOr[Boolean]
  ): js.Any = js.native
  
  /**
    * The number of members of the group.
    */
  def getLength(): integer = js.native
  
  /**
    * The difference of {@link Phaser.GameObjects.Group#maxSize} and the number of active group members.
    * 
    * This represents the number of group members that could be created or reactivated before reaching the size limit.
    */
  def getTotalFree(): integer = js.native
  
  /**
    * Counts the number of in-use (active) group members.
    */
  def getTotalUsed(): integer = js.native
  
  /**
    * Adds the given value to the x of each group member.
    * @param value The amount to be added to the `x` property.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    */
  def incX(value: Double): this.type = js.native
  def incX(value: Double, step: Double): this.type = js.native
  
  /**
    * Adds the given value to the x, y of each group member.
    * @param x The amount to be added to the `x` property.
    * @param y The amount to be added to the `y` property. If `undefined` or `null` it uses the `x` value. Default x.
    * @param stepX This is added to the `x` amount, multiplied by the iteration counter. Default 0.
    * @param stepY This is added to the `y` amount, multiplied by the iteration counter. Default 0.
    */
  def incXY(x: Double): this.type = js.native
  def incXY(x: Double, y: js.UndefOr[scala.Nothing], stepX: js.UndefOr[scala.Nothing], stepY: Double): this.type = js.native
  def incXY(x: Double, y: js.UndefOr[scala.Nothing], stepX: Double): this.type = js.native
  def incXY(x: Double, y: js.UndefOr[scala.Nothing], stepX: Double, stepY: Double): this.type = js.native
  def incXY(x: Double, y: Double): this.type = js.native
  def incXY(x: Double, y: Double, stepX: js.UndefOr[scala.Nothing], stepY: Double): this.type = js.native
  def incXY(x: Double, y: Double, stepX: Double): this.type = js.native
  def incXY(x: Double, y: Double, stepX: Double, stepY: Double): this.type = js.native
  
  /**
    * Adds the given value to the y of each group member.
    * @param value The amount to be added to the `y` property.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    */
  def incY(value: Double): this.type = js.native
  def incY(value: Double, step: Double): this.type = js.native
  
  /**
    * Whether this group's size at its {@link Phaser.GameObjects.Group#maxSize maximum}.
    */
  def isFull(): Boolean = js.native
  
  /**
    * A flag identifying this object as a group.
    */
  var isParent: Boolean = js.native
  
  /**
    * Deactivates a member of this group.
    * @param gameObject A member of this group.
    */
  def kill(gameObject: GameObject): Unit = js.native
  
  /**
    * Deactivates and hides a member of this group.
    * @param gameObject A member of this group.
    */
  def killAndHide(gameObject: GameObject): Unit = js.native
  
  /**
    * The maximum size of this group, if used as a pool. -1 is no limit.
    */
  var maxSize: integer = js.native
  
  /**
    * The name of this group.
    * Empty by default and never populated by Phaser, this is left for developers to use.
    */
  var name: String = js.native
  
  /**
    * {@link Phaser.GameObjects.Components.Animation#play Plays} an animation for all members of this group.
    * @param key The string-based key of the animation to play.
    * @param startFrame Optionally start the animation playing from this frame index. Default 0.
    */
  def playAnimation(key: String): this.type = js.native
  def playAnimation(key: String, startFrame: String): this.type = js.native
  
  /**
    * Updates any group members, if {@link Phaser.GameObjects.Group#runChildUpdate} is enabled.
    * @param time The current timestamp.
    * @param delta The delta time elapsed since the last frame.
    */
  def preUpdate(time: Double, delta: Double): Unit = js.native
  
  /**
    * Adds the given value to the property as defined in `key` of each group member.
    * @param key The property to be updated.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  def propertyValueInc(key: String, value: Double): this.type = js.native
  def propertyValueInc(
    key: String,
    value: Double,
    step: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    direction: integer
  ): this.type = js.native
  def propertyValueInc(key: String, value: Double, step: js.UndefOr[scala.Nothing], index: integer): this.type = js.native
  def propertyValueInc(key: String, value: Double, step: js.UndefOr[scala.Nothing], index: integer, direction: integer): this.type = js.native
  def propertyValueInc(key: String, value: Double, step: Double): this.type = js.native
  def propertyValueInc(key: String, value: Double, step: Double, index: js.UndefOr[scala.Nothing], direction: integer): this.type = js.native
  def propertyValueInc(key: String, value: Double, step: Double, index: integer): this.type = js.native
  def propertyValueInc(key: String, value: Double, step: Double, index: integer, direction: integer): this.type = js.native
  
  /**
    * Sets the property as defined in `key` of each group member to the given value.
    * @param key The property to be updated.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  def propertyValueSet(key: String, value: Double): this.type = js.native
  def propertyValueSet(
    key: String,
    value: Double,
    step: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    direction: integer
  ): this.type = js.native
  def propertyValueSet(key: String, value: Double, step: js.UndefOr[scala.Nothing], index: integer): this.type = js.native
  def propertyValueSet(key: String, value: Double, step: js.UndefOr[scala.Nothing], index: integer, direction: integer): this.type = js.native
  def propertyValueSet(key: String, value: Double, step: Double): this.type = js.native
  def propertyValueSet(key: String, value: Double, step: Double, index: js.UndefOr[scala.Nothing], direction: integer): this.type = js.native
  def propertyValueSet(key: String, value: Double, step: Double, index: integer): this.type = js.native
  def propertyValueSet(key: String, value: Double, step: Double, index: integer, direction: integer): this.type = js.native
  
  /**
    * Removes a member of this Group and optionally removes it from the Scene and / or destroys it.
    * 
    * Calls {@link Phaser.GameObjects.Group#removeCallback}.
    * @param child The Game Object to remove.
    * @param removeFromScene Optionally remove the Group member from the Scene it belongs to. Default false.
    * @param destroyChild Optionally call destroy on the removed Group member. Default false.
    */
  def remove(child: GameObject): this.type = js.native
  def remove(child: GameObject, removeFromScene: js.UndefOr[scala.Nothing], destroyChild: Boolean): this.type = js.native
  def remove(child: GameObject, removeFromScene: Boolean): this.type = js.native
  def remove(child: GameObject, removeFromScene: Boolean, destroyChild: Boolean): this.type = js.native
  
  /**
    * A function to be called when removing group members.
    */
  def removeCallback(item: GameObject): Unit = js.native
  /**
    * A function to be called when removing group members.
    */
  @JSName("removeCallback")
  var removeCallback_Original: GroupCallback = js.native
  
  /**
    * Sets the rotation of each group member.
    * @param value The amount to set the rotation to, in radians.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    */
  def rotate(value: Double): this.type = js.native
  def rotate(value: Double, step: Double): this.type = js.native
  
  /**
    * Rotates each group member around the given point by the given angle.
    * @param point Any object with public `x` and `y` properties.
    * @param angle The angle to rotate by, in radians.
    */
  def rotateAround(point: Vector2Like, angle: Double): this.type = js.native
  
  /**
    * Rotates each group member around the given point by the given angle and distance.
    * @param point Any object with public `x` and `y` properties.
    * @param angle The angle to rotate by, in radians.
    * @param distance The distance from the point of rotation in pixels.
    */
  def rotateAroundDistance(point: Vector2Like, angle: Double, distance: Double): this.type = js.native
  
  /**
    * Whether to call the update method of any members.
    */
  var runChildUpdate: Boolean = js.native
  
  /**
    * Sets the scaleX of each group member.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    */
  def scaleX(value: Double): this.type = js.native
  def scaleX(value: Double, step: Double): this.type = js.native
  
  /**
    * Sets the scaleX, scaleY of each group member.
    * @param scaleX The amount to be added to the `scaleX` property.
    * @param scaleY The amount to be added to the `scaleY` property. If `undefined` or `null` it uses the `scaleX` value.
    * @param stepX This is added to the `scaleX` amount, multiplied by the iteration counter. Default 0.
    * @param stepY This is added to the `scaleY` amount, multiplied by the iteration counter. Default 0.
    */
  def scaleXY(scaleX: Double): this.type = js.native
  def scaleXY(scaleX: Double, scaleY: js.UndefOr[scala.Nothing], stepX: js.UndefOr[scala.Nothing], stepY: Double): this.type = js.native
  def scaleXY(scaleX: Double, scaleY: js.UndefOr[scala.Nothing], stepX: Double): this.type = js.native
  def scaleXY(scaleX: Double, scaleY: js.UndefOr[scala.Nothing], stepX: Double, stepY: Double): this.type = js.native
  def scaleXY(scaleX: Double, scaleY: Double): this.type = js.native
  def scaleXY(scaleX: Double, scaleY: Double, stepX: js.UndefOr[scala.Nothing], stepY: Double): this.type = js.native
  def scaleXY(scaleX: Double, scaleY: Double, stepX: Double): this.type = js.native
  def scaleXY(scaleX: Double, scaleY: Double, stepX: Double, stepY: Double): this.type = js.native
  
  /**
    * Sets the scaleY of each group member.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    */
  def scaleY(value: Double): this.type = js.native
  def scaleY(value: Double, step: Double): this.type = js.native
  
  /**
    * This scene this group belongs to.
    */
  var scene: Scene = js.native
  
  /**
    * Sets the `active` property of this Group.
    * When active, this Group runs its `preUpdate` method.
    * @param value True if this Group should be set as active, false if not.
    */
  def setActive(value: Boolean): this.type = js.native
  
  /**
    * Sets the alpha of each group member.
    * @param value The amount to set the alpha to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    */
  def setAlpha(value: Double): this.type = js.native
  def setAlpha(value: Double, step: Double): this.type = js.native
  
  /**
    * Sets the blendMode of each group member.
    * @param value The amount to set the property to.
    */
  def setBlendMode(value: Double): this.type = js.native
  
  /**
    * Sets the depth of each group member.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    */
  def setDepth(value: Double): this.type = js.native
  def setDepth(value: Double, step: Double): this.type = js.native
  
  /**
    * Passes all group members to the Input Manager to enable them for input with identical areas and callbacks.
    * @param hitArea Either an input configuration object, or a geometric shape that defines the hit area for the Game Object. If not specified a Rectangle will be used.
    * @param hitAreaCallback A callback to be invoked when the Game Object is interacted with. If you provide a shape you must also provide a callback.
    */
  def setHitArea(hitArea: js.Any, hitAreaCallback: HitAreaCallback): this.type = js.native
  
  /**
    * Sets the `name` property of this Group.
    * The `name` property is not populated by Phaser and is presented for your own use.
    * @param value The name to be given to this Group.
    */
  def setName(value: String): this.type = js.native
  
  /**
    * Sets the originX, originY of each group member.
    * @param originX The amount to set the `originX` property to.
    * @param originY The amount to set the `originY` property to. If `undefined` or `null` it uses the `originX` value.
    * @param stepX This is added to the `originX` amount, multiplied by the iteration counter. Default 0.
    * @param stepY This is added to the `originY` amount, multiplied by the iteration counter. Default 0.
    */
  def setOrigin(originX: Double): this.type = js.native
  def setOrigin(
    originX: Double,
    originY: js.UndefOr[scala.Nothing],
    stepX: js.UndefOr[scala.Nothing],
    stepY: Double
  ): this.type = js.native
  def setOrigin(originX: Double, originY: js.UndefOr[scala.Nothing], stepX: Double): this.type = js.native
  def setOrigin(originX: Double, originY: js.UndefOr[scala.Nothing], stepX: Double, stepY: Double): this.type = js.native
  def setOrigin(originX: Double, originY: Double): this.type = js.native
  def setOrigin(originX: Double, originY: Double, stepX: js.UndefOr[scala.Nothing], stepY: Double): this.type = js.native
  def setOrigin(originX: Double, originY: Double, stepX: Double): this.type = js.native
  def setOrigin(originX: Double, originY: Double, stepX: Double, stepY: Double): this.type = js.native
  
  /**
    * Sets the tint of each group member.
    * @param topLeft The tint being applied to top-left corner of item. If other parameters are given no value, this tint will be applied to whole item.
    * @param topRight The tint to be applied to top-right corner of item.
    * @param bottomLeft The tint to be applied to the bottom-left corner of item.
    * @param bottomRight The tint to be applied to the bottom-right corner of item.
    */
  def setTint(topLeft: Double): this.type = js.native
  def setTint(
    topLeft: Double,
    topRight: js.UndefOr[scala.Nothing],
    bottomLeft: js.UndefOr[scala.Nothing],
    bottomRight: Double
  ): this.type = js.native
  def setTint(topLeft: Double, topRight: js.UndefOr[scala.Nothing], bottomLeft: Double): this.type = js.native
  def setTint(topLeft: Double, topRight: js.UndefOr[scala.Nothing], bottomLeft: Double, bottomRight: Double): this.type = js.native
  def setTint(topLeft: Double, topRight: Double): this.type = js.native
  def setTint(topLeft: Double, topRight: Double, bottomLeft: js.UndefOr[scala.Nothing], bottomRight: Double): this.type = js.native
  def setTint(topLeft: Double, topRight: Double, bottomLeft: Double): this.type = js.native
  def setTint(topLeft: Double, topRight: Double, bottomLeft: Double, bottomRight: Double): this.type = js.native
  
  /**
    * Sets the visible of each group member.
    * @param value The value to set the property to.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  def setVisible(value: Boolean): this.type = js.native
  def setVisible(value: Boolean, index: js.UndefOr[scala.Nothing], direction: integer): this.type = js.native
  def setVisible(value: Boolean, index: integer): this.type = js.native
  def setVisible(value: Boolean, index: integer, direction: integer): this.type = js.native
  
  /**
    * Sets the x of each group member.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    */
  def setX(value: Double): this.type = js.native
  def setX(value: Double, step: Double): this.type = js.native
  
  /**
    * Sets the x, y of each group member.
    * @param x The amount to set the `x` property to.
    * @param y The amount to set the `y` property to. If `undefined` or `null` it uses the `x` value. Default x.
    * @param stepX This is added to the `x` amount, multiplied by the iteration counter. Default 0.
    * @param stepY This is added to the `y` amount, multiplied by the iteration counter. Default 0.
    */
  def setXY(x: Double): this.type = js.native
  def setXY(x: Double, y: js.UndefOr[scala.Nothing], stepX: js.UndefOr[scala.Nothing], stepY: Double): this.type = js.native
  def setXY(x: Double, y: js.UndefOr[scala.Nothing], stepX: Double): this.type = js.native
  def setXY(x: Double, y: js.UndefOr[scala.Nothing], stepX: Double, stepY: Double): this.type = js.native
  def setXY(x: Double, y: Double): this.type = js.native
  def setXY(x: Double, y: Double, stepX: js.UndefOr[scala.Nothing], stepY: Double): this.type = js.native
  def setXY(x: Double, y: Double, stepX: Double): this.type = js.native
  def setXY(x: Double, y: Double, stepX: Double, stepY: Double): this.type = js.native
  
  /**
    * Sets the y of each group member.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    */
  def setY(value: Double): this.type = js.native
  def setY(value: Double, step: Double): this.type = js.native
  
  /**
    * Iterate through the group members changing the position of each element to be that of the element that came before
    * it in the array (or after it if direction = 1)
    * 
    * The first group member position is set to x/y.
    * @param x The x coordinate to place the first item in the array at.
    * @param y The y coordinate to place the first item in the array at.
    * @param direction The iteration direction. 0 = first to last and 1 = last to first. Default 0.
    */
  def shiftPosition(x: Double, y: Double): this.type = js.native
  def shiftPosition(x: Double, y: Double, direction: integer): this.type = js.native
  
  /**
    * Shuffles the group members in place.
    */
  def shuffle(): this.type = js.native
  
  /**
    * Toggles (flips) the visible state of each member of this group.
    */
  def toggleVisible(): this.type = js.native
  
  /**
    * A textual representation of this Game Object.
    * Used internally by Phaser but is available for your own custom classes to populate.
    */
  var `type`: String = js.native
}

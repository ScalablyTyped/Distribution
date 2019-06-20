package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Group is a way for you to create, manipulate, or recycle similar Game Objects.
  * 
  * Group membership is non-exclusive. A Game Object can belong to several groups, one group, or none.
  * 
  * Groups themselves aren't displayable, and can't be positioned, rotated, scaled, or hidden.
  */
@JSGlobal("Phaser.GameObjects.Group")
@js.native
class Group protected ()
  extends phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs._ArcadeColliderType {
  /**
    * 
    * @param scene The scene this group belongs to.
    * @param children Game Objects to add to this group; or the `config` argument.
    * @param config Settings for this group. If `key` is set, Phaser.GameObjects.Group#createMultiple is also called with these settings.
    */
  def this(scene: phaserLib.PhaserNs.Scene) = this()
  def this(scene: phaserLib.PhaserNs.Scene, children: js.Array[GameObject]) = this()
  def this(scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig) = this()
  def this(scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
  def this(scene: phaserLib.PhaserNs.Scene, children: js.Array[GameObject], config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig) = this()
  def this(scene: phaserLib.PhaserNs.Scene, children: js.Array[GameObject], config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
  def this(scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig) = this()
  def this(scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
  def this(scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig) = this()
  def this(scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
  /**
    * Whether this group runs its {@link Phaser.GameObjects.Group#preUpdate} method
    * (which may update any members).
    */
  var active: scala.Boolean = js.native
  /**
    * Members of this group.
    */
  var children: phaserLib.PhaserNs.StructsNs.Set[GameObject] = js.native
  /**
    * The class to create new group members from.
    */
  var classType: js.Function = js.native
  /**
    * A function to be called when adding or creating group members.
    */
  @JSName("createCallback")
  var createCallback_Original: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCallback = js.native
  /**
    * A function to be called when creating several group members at once.
    */
  @JSName("createMultipleCallback")
  var createMultipleCallback_Original: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupMultipleCreateCallback = js.native
  /**
    * A default texture frame to use when creating new group members.
    */
  var defaultFrame: java.lang.String | phaserLib.integer = js.native
  /**
    * A default texture key to use when creating new group members.
    * 
    * This is used in {@link Phaser.GameObjects.Group#create}
    * but not in {@link Phaser.GameObjects.Group#createMultiple}.
    */
  var defaultKey: java.lang.String = js.native
  /**
    * A flag identifying this object as a group.
    */
  var isParent: scala.Boolean = js.native
  /**
    * The maximum size of this group, if used as a pool. -1 is no limit.
    */
  var maxSize: phaserLib.integer = js.native
  /**
    * The name of this group.
    * Empty by default and never populated by Phaser, this is left for developers to use.
    */
  var name: java.lang.String = js.native
  /**
    * A function to be called when removing group members.
    */
  @JSName("removeCallback")
  var removeCallback_Original: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCallback = js.native
  /**
    * Whether to call the update method of any members.
    */
  var runChildUpdate: scala.Boolean = js.native
  /**
    * This scene this group belongs to.
    */
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * Adds a Game Object to this group.
    * 
    * Calls {@link Phaser.GameObjects.Group#createCallback}.
    * @param child The Game Object to add.
    * @param addToScene Also add the Game Object to the scene. Default false.
    */
  def add(child: GameObject): Group = js.native
  def add(child: GameObject, addToScene: scala.Boolean): Group = js.native
  /**
    * Adds several Game Objects to this group.
    * 
    * Calls {@link Phaser.GameObjects.Group#createCallback}.
    * @param children The Game Objects to add.
    * @param addToScene Also add the Game Objects to the scene. Default false.
    */
  def addMultiple(children: js.Array[GameObject]): Group = js.native
  def addMultiple(children: js.Array[GameObject], addToScene: scala.Boolean): Group = js.native
  /**
    * Removes all members of this Group and optionally removes them from the Scene and / or destroys them.
    * 
    * Does not call {@link Phaser.GameObjects.Group#removeCallback}.
    * @param removeFromScene Optionally remove each Group member from the Scene. Default false.
    * @param destroyChild Optionally call destroy on the removed Group members. Default false.
    */
  def clear(): Group = js.native
  def clear(removeFromScene: scala.Boolean): Group = js.native
  def clear(removeFromScene: scala.Boolean, destroyChild: scala.Boolean): Group = js.native
  /**
    * Tests if a Game Object is a member of this group.
    * @param child A Game Object.
    */
  def contains(child: GameObject): scala.Boolean = js.native
  /**
    * Counts the number of active (or inactive) group members.
    * @param value Count active (true) or inactive (false) group members. Default true.
    */
  def countActive(): phaserLib.integer = js.native
  def countActive(value: scala.Boolean): phaserLib.integer = js.native
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
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    key: js.UndefOr[java.lang.String],
    frame: js.UndefOr[java.lang.String | phaserLib.integer],
    visible: js.UndefOr[scala.Boolean],
    active: js.UndefOr[scala.Boolean]
  ): js.Any = js.native
  /**
    * A function to be called when adding or creating group members.
    */
  def createCallback(item: GameObject): scala.Unit = js.native
  /**
    * A helper for {@link Phaser.GameObjects.Group#createMultiple}.
    * @param options Creation settings.
    */
  def createFromConfig(options: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig): js.Array[_] = js.native
  def createMultiple(config: js.Array[phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig]): js.Array[_] = js.native
  /**
    * Creates several Game Objects and adds them to this group.
    * 
    * If the group becomes {@link Phaser.GameObjects.Group#isFull}, no further Game Objects are created.
    * 
    * Calls {@link Phaser.GameObjects.Group#createMultipleCallback} and {@link Phaser.GameObjects.Group#createCallback}.
    * @param config Creation settings. This can be a single configuration object or an array of such objects, which will be applied in turn.
    */
  def createMultiple(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig): js.Array[_] = js.native
  /**
    * A function to be called when creating several group members at once.
    */
  def createMultipleCallback(items: js.Array[GameObject]): scala.Unit = js.native
  /**
    * Empties this group and removes it from the Scene.
    * 
    * Does not call {@link Phaser.GameObjects.Group#removeCallback}.
    * @param destroyChildren Also {@link Phaser.GameObjects.GameObject#destroy} each group member. Default false.
    */
  def destroy(): scala.Unit = js.native
  def destroy(destroyChildren: scala.Boolean): scala.Unit = js.native
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
  def get(x: scala.Double): js.Any = js.native
  def get(x: scala.Double, y: scala.Double): js.Any = js.native
  def get(x: scala.Double, y: scala.Double, key: java.lang.String): js.Any = js.native
  def get(x: scala.Double, y: scala.Double, key: java.lang.String, frame: java.lang.String): js.Any = js.native
  def get(
    x: scala.Double,
    y: scala.Double,
    key: java.lang.String,
    frame: java.lang.String,
    visible: scala.Boolean
  ): js.Any = js.native
  def get(x: scala.Double, y: scala.Double, key: java.lang.String, frame: phaserLib.integer): js.Any = js.native
  def get(
    x: scala.Double,
    y: scala.Double,
    key: java.lang.String,
    frame: phaserLib.integer,
    visible: scala.Boolean
  ): js.Any = js.native
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
    state: js.UndefOr[scala.Boolean],
    createIfNull: js.UndefOr[scala.Boolean],
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    key: js.UndefOr[java.lang.String],
    frame: js.UndefOr[java.lang.String | phaserLib.integer],
    visible: js.UndefOr[scala.Boolean]
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
    createIfNull: js.UndefOr[scala.Boolean],
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    key: js.UndefOr[java.lang.String],
    frame: js.UndefOr[java.lang.String | phaserLib.integer],
    visible: js.UndefOr[scala.Boolean]
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
    createIfNull: js.UndefOr[scala.Boolean],
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    key: js.UndefOr[java.lang.String],
    frame: js.UndefOr[java.lang.String | phaserLib.integer],
    visible: js.UndefOr[scala.Boolean]
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
    nth: phaserLib.integer,
    state: js.UndefOr[scala.Boolean],
    createIfNull: js.UndefOr[scala.Boolean],
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    key: js.UndefOr[java.lang.String],
    frame: js.UndefOr[java.lang.String | phaserLib.integer],
    visible: js.UndefOr[scala.Boolean]
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
    state: js.UndefOr[scala.Boolean],
    createIfNull: js.UndefOr[scala.Boolean],
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    key: js.UndefOr[java.lang.String],
    frame: js.UndefOr[java.lang.String | phaserLib.integer],
    visible: js.UndefOr[scala.Boolean]
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
    nth: phaserLib.integer,
    state: js.UndefOr[scala.Boolean],
    createIfNull: js.UndefOr[scala.Boolean],
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    key: js.UndefOr[java.lang.String],
    frame: js.UndefOr[java.lang.String | phaserLib.integer],
    visible: js.UndefOr[scala.Boolean]
  ): js.Any = js.native
  /**
    * The number of members of the group.
    */
  def getLength(): phaserLib.integer = js.native
  /**
    * The difference of {@link Phaser.GameObjects.Group#maxSize} and the number of active group members.
    * 
    * This represents the number of group members that could be created or reactivated before reaching the size limit.
    */
  def getTotalFree(): phaserLib.integer = js.native
  /**
    * Counts the number of in-use (active) group members.
    */
  def getTotalUsed(): phaserLib.integer = js.native
  /**
    * Whether this group's size at its {@link Phaser.GameObjects.Group#maxSize maximum}.
    */
  def isFull(): scala.Boolean = js.native
  /**
    * Deactivates a member of this group.
    * @param gameObject A member of this group.
    */
  def kill(gameObject: GameObject): scala.Unit = js.native
  /**
    * Deactivates and hides a member of this group.
    * @param gameObject A member of this group.
    */
  def killAndHide(gameObject: GameObject): scala.Unit = js.native
  /**
    * {@link Phaser.GameObjects.Components.Animation#play Plays} an animation for all members of this group.
    * @param key The string-based key of the animation to play.
    * @param startFrame Optionally start the animation playing from this frame index. Default 0.
    */
  def playAnimation(key: java.lang.String): Group = js.native
  def playAnimation(key: java.lang.String, startFrame: java.lang.String): Group = js.native
  /**
    * Updates any group members, if {@link Phaser.GameObjects.Group#runChildUpdate} is enabled.
    * @param time The current timestamp.
    * @param delta The delta time elapsed since the last frame.
    */
  def preUpdate(time: scala.Double, delta: scala.Double): scala.Unit = js.native
  /**
    * Removes a member of this Group and optionally removes it from the Scene and / or destroys it.
    * 
    * Calls {@link Phaser.GameObjects.Group#removeCallback}.
    * @param child The Game Object to remove.
    * @param removeFromScene Optionally remove the Group member from the Scene it belongs to. Default false.
    * @param destroyChild Optionally call destroy on the removed Group member. Default false.
    */
  def remove(child: GameObject): Group = js.native
  def remove(child: GameObject, removeFromScene: scala.Boolean): Group = js.native
  def remove(child: GameObject, removeFromScene: scala.Boolean, destroyChild: scala.Boolean): Group = js.native
  /**
    * A function to be called when removing group members.
    */
  def removeCallback(item: GameObject): scala.Unit = js.native
  /**
    * Sets the depth of each group member.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter.
    */
  def setDepth(value: scala.Double, step: scala.Double): Group = js.native
  /**
    * Toggles (flips) the visible state of each member of this group.
    */
  def toggleVisible(): Group = js.native
}


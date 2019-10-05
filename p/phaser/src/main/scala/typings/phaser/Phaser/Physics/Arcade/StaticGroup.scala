package typings.phaser.Phaser.Physics.Arcade

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.GameObjects.Group.GroupConfig
import typings.phaser.Phaser.Types.GameObjects.Group.GroupCreateConfig
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Arcade Physics Static Group object.
  * 
  * All Game Objects created by this Group will automatically be given static Arcade Physics bodies.
  * 
  * Its dynamic counterpart is {@link Phaser.Physics.Arcade.Group}.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited */ @JSGlobal("Phaser.Physics.Arcade.StaticGroup")
@js.native
class StaticGroup protected ()
  extends typings.phaser.Phaser.GameObjects.Group {
  /**
    * 
    * @param world The physics simulation.
    * @param scene The scene this group belongs to.
    * @param children Game Objects to add to this group; or the `config` argument.
    * @param config Settings for this group.
    */
  def this(world: World, scene: Scene) = this()
  def this(world: World, scene: Scene, children: js.Array[GameObject]) = this()
  def this(world: World, scene: Scene, children: GroupConfig) = this()
  def this(world: World, scene: Scene, children: GroupCreateConfig) = this()
  def this(world: World, scene: Scene, children: js.Array[GameObject], config: GroupConfig) = this()
  def this(world: World, scene: Scene, children: js.Array[GameObject], config: GroupCreateConfig) = this()
  def this(world: World, scene: Scene, children: GroupConfig, config: GroupConfig) = this()
  def this(world: World, scene: Scene, children: GroupConfig, config: GroupCreateConfig) = this()
  def this(world: World, scene: Scene, children: GroupCreateConfig, config: GroupConfig) = this()
  def this(world: World, scene: Scene, children: GroupCreateConfig, config: GroupCreateConfig) = this()
  /**
    * The scene this group belongs to.
    */
  var physicsType: integer = js.native
  /**
    * The physics simulation.
    */
  var world: World = js.native
  /**
    * Adds a static physics body to the new group member (if it lacks one) and adds it to the simulation.
    * @param child The new group member.
    */
  def createCallbackHandler(child: GameObject): Unit = js.native
  /**
    * Refreshes the group.
    * @param entries The newly created group members.
    */
  def createMultipleCallbackHandler(entries: js.Array[GameObject]): Unit = js.native
  /**
    * Resets each Body to the position of its parent Game Object.
    * Body sizes aren't changed (use {@link Phaser.Physics.Arcade.Components.Enable#refreshBody} for that).
    */
  def refresh(): StaticGroup = js.native
  /**
    * Disables the group member's physics body, removing it from the simulation.
    * @param child The group member being removed.
    */
  def removeCallbackHandler(child: GameObject): Unit = js.native
}


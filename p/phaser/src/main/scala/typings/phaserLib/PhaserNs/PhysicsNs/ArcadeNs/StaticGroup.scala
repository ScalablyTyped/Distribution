package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs

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
- phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs._ArcadeColliderType because Already inherited */ @JSGlobal("Phaser.Physics.Arcade.StaticGroup")
@js.native
class StaticGroup protected ()
  extends phaserLib.PhaserNs.GameObjectsNs.Group {
  /**
    * 
    * @param world The physics simulation.
    * @param scene The scene this group belongs to.
    * @param children Game Objects to add to this group; or the `config` argument.
    * @param config Settings for this group.
    */
  def this(world: World, scene: phaserLib.PhaserNs.Scene) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject]) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject], config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject], config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
  /**
    * The scene this group belongs to.
    */
  var physicsType: phaserLib.integer = js.native
  /**
    * The physics simulation.
    */
  var world: World = js.native
  /**
    * Adds a static physics body to the new group member (if it lacks one) and adds it to the simulation.
    * @param child The new group member.
    */
  def createCallbackHandler(child: phaserLib.PhaserNs.GameObjectsNs.GameObject): scala.Unit = js.native
  /**
    * Refreshes the group.
    * @param entries The newly created group members.
    */
  def createMultipleCallbackHandler(entries: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject]): scala.Unit = js.native
  /**
    * Resets each Body to the position of its parent Game Object.
    * Body sizes aren't changed (use {@link Phaser.Physics.Arcade.Components.Enable#refreshBody} for that).
    */
  def refresh(): StaticGroup = js.native
  /**
    * Disables the group member's physics body, removing it from the simulation.
    * @param child The group member being removed.
    */
  def removeCallbackHandler(child: phaserLib.PhaserNs.GameObjectsNs.GameObject): scala.Unit = js.native
}


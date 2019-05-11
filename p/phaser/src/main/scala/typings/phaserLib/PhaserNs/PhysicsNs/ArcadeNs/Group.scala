package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Arcade Physics Group object.
  * 
  * All Game Objects created by this Group will automatically be given dynamic Arcade Physics bodies.
  * 
  * Its static counterpart is {@link Phaser.Physics.Arcade.StaticGroup}.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs._ArcadeColliderType because Already inherited */ @JSGlobal("Phaser.Physics.Arcade.Group")
@js.native
class Group protected ()
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
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject], config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject], config: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig, config: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig, config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig) = this()
  def this(world: World, scene: phaserLib.PhaserNs.Scene, children: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig, config: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupConfig) = this()
  /**
    * Default physics properties applied to Game Objects added to the Group or created by the Group. Derived from the `config` argument.
    */
  var defaults: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.PhysicsGroupDefaults = js.native
  /**
    * The physics type of the Group's members.
    */
  var physicsType: phaserLib.integer = js.native
  /**
    * The physics simulation.
    */
  var world: World = js.native
  /**
    * Enables a Game Object's Body and assigns `defaults`. Called when a Group member is added or created.
    * @param child The Game Object being added.
    */
  def createCallbackHandler(child: phaserLib.PhaserNs.GameObjectsNs.GameObject): scala.Unit = js.native
  /**
    * Disables a Game Object's Body. Called when a Group member is removed.
    * @param child The Game Object being removed.
    */
  def removeCallbackHandler(child: phaserLib.PhaserNs.GameObjectsNs.GameObject): scala.Unit = js.native
  /**
    * Sets the velocity of each Group member.
    * @param x The horizontal velocity.
    * @param y The vertical velocity.
    * @param step The velocity increment. When set, the first member receives velocity (x, y), the second (x + step, y + step), and so on. Default 0.
    */
  def setVelocity(x: scala.Double, y: scala.Double): Group = js.native
  def setVelocity(x: scala.Double, y: scala.Double, step: scala.Double): Group = js.native
  /**
    * Sets the horizontal velocity of each Group member.
    * @param value The velocity value.
    * @param step The velocity increment. When set, the first member receives velocity (x), the second (x + step), and so on. Default 0.
    */
  def setVelocityX(value: scala.Double): Group = js.native
  def setVelocityX(value: scala.Double, step: scala.Double): Group = js.native
  /**
    * Sets the vertical velocity of each Group member.
    * @param value The velocity value.
    * @param step The velocity increment. When set, the first member receives velocity (y), the second (y + step), and so on. Default 0.
    */
  def setVelocityY(value: scala.Double): Group = js.native
  def setVelocityY(value: scala.Double, step: scala.Double): Group = js.native
}


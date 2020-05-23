package typings.phaser.Phaser.Physics.Arcade

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Types.Physics.Arcade.PhysicsGroupDefaults
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Arcade Physics Group object.
  * 
  * All Game Objects created by or added to this Group will automatically be given dynamic Arcade Physics bodies, if they have no body.
  * 
  * Its static counterpart is {@link Phaser.Physics.Arcade.StaticGroup}.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited */ @js.native
trait Group
  extends typings.phaser.Phaser.GameObjects.Group {
  /**
    * Default physics properties applied to Game Objects added to the Group or created by the Group. Derived from the `config` argument.
    */
  var defaults: PhysicsGroupDefaults = js.native
  /**
    * The physics type of the Group's members.
    */
  var physicsType: integer = js.native
  /**
    * The physics simulation.
    */
  var world: World = js.native
  /**
    * Enables a Game Object's Body and assigns `defaults`. Called when a Group member is added or created.
    * @param child The Game Object being added.
    */
  def createCallbackHandler(child: GameObject): Unit = js.native
  /**
    * Disables a Game Object's Body. Called when a Group member is removed.
    * @param child The Game Object being removed.
    */
  def removeCallbackHandler(child: GameObject): Unit = js.native
  /**
    * Sets the velocity of each Group member.
    * @param x The horizontal velocity.
    * @param y The vertical velocity.
    * @param step The velocity increment. When set, the first member receives velocity (x, y), the second (x + step, y + step), and so on. Default 0.
    */
  def setVelocity(x: Double, y: Double): Group = js.native
  def setVelocity(x: Double, y: Double, step: Double): Group = js.native
  /**
    * Sets the horizontal velocity of each Group member.
    * @param value The velocity value.
    * @param step The velocity increment. When set, the first member receives velocity (x), the second (x + step), and so on. Default 0.
    */
  def setVelocityX(value: Double): Group = js.native
  def setVelocityX(value: Double, step: Double): Group = js.native
  /**
    * Sets the vertical velocity of each Group member.
    * @param value The velocity value.
    * @param step The velocity increment. When set, the first member receives velocity (y), the second (y + step), and so on. Default 0.
    */
  def setVelocityY(value: Double): Group = js.native
  def setVelocityY(value: Double, step: Double): Group = js.native
}


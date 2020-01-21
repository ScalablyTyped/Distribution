package typings.phaser.Phaser.Physics.Matter.Components

import typings.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains methods for changing the velocity of a Matter Body. Should be used as a mixin and not called directly.
  */
@js.native
trait Velocity extends js.Object {
  /**
    * Sets the angular velocity of the body instantly.
    * Position, angle, force etc. are unchanged.
    * @param value The angular velocity.
    */
  def setAngularVelocity(value: Double): GameObject = js.native
  /**
    * Sets both the horizontal and vertical velocity of the physics body.
    * @param x The horizontal velocity value.
    * @param y The vertical velocity value, it can be either positive or negative. If not given, it will be the same as the `x` value. Default x.
    */
  def setVelocity(x: Double): GameObject = js.native
  def setVelocity(x: Double, y: Double): GameObject = js.native
  /**
    * Sets the horizontal velocity of the physics body.
    * @param x The horizontal velocity value.
    */
  def setVelocityX(x: Double): GameObject = js.native
  /**
    * Sets vertical velocity of the physics body.
    * @param y The vertical velocity value.
    */
  def setVelocityY(y: Double): GameObject = js.native
}


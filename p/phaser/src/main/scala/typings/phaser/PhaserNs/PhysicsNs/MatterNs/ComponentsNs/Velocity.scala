package typings.phaser.PhaserNs.PhysicsNs.MatterNs.ComponentsNs

import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@js.native
trait Velocity extends js.Object {
  /**
    * [description]
    * @param value [description]
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


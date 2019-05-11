package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs

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
  def setAngularVelocity(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets both the horizontal and vertical velocity of the physics body.
    * @param x The horizontal velocity value.
    * @param y The vertical velocity value, it can be either positive or negative. If not given, it will be the same as the `x` value. Default x.
    */
  def setVelocity(x: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def setVelocity(x: scala.Double, y: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets the horizontal velocity of the physics body.
    * @param x The horizontal velocity value.
    */
  def setVelocityX(x: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets vertical velocity of the physics body.
    * @param y The vertical velocity value.
    */
  def setVelocityY(y: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
}


package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods for modifying the velocity of an Arcade Physics body.
  * 
  * Should be applied as a mixin and not used directly.
  */
@js.native
trait Velocity extends js.Object {
  /**
    * Sets the maximum velocity of the body.
    * @param x The new maximum horizontal velocity.
    * @param y The new maximum vertical velocity. Default x.
    */
  def setMaxVelocity(x: scala.Double): this.type = js.native
  def setMaxVelocity(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Sets the velocity of the Body.
    * @param x The horizontal velocity of the body. Positive values move the body to the right, while negative values move it to the left.
    * @param y The vertical velocity of the body. Positive values move the body down, while negative values move it up. Default x.
    */
  def setVelocity(x: scala.Double): this.type = js.native
  def setVelocity(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Sets the horizontal component of the body's velocity.
    * 
    * Positive values move the body to the right, while negative values move it to the left.
    * @param x The new horizontal velocity.
    */
  def setVelocityX(x: scala.Double): this.type = js.native
  /**
    * Sets the vertical component of the body's velocity.
    * 
    * Positive values move the body down, while negative values move it up.
    * @param y The new vertical velocity of the body.
    */
  def setVelocityY(y: scala.Double): this.type = js.native
}


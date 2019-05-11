package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the acceleration properties of an Arcade Physics Body.
  */
@js.native
trait Acceleration extends js.Object {
  /**
    * Sets the body's horizontal and vertical acceleration. If the vertical acceleration value is not provided, the vertical acceleration is set to the same value as the horizontal acceleration.
    * @param x The horizontal acceleration
    * @param y The vertical acceleration Default x.
    */
  def setAcceleration(x: scala.Double): this.type = js.native
  def setAcceleration(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Sets the body's horizontal acceleration.
    * @param value The horizontal acceleration
    */
  def setAccelerationX(value: scala.Double): this.type = js.native
  /**
    * Sets the body's vertical acceleration.
    * @param value The vertical acceleration
    */
  def setAccelerationY(value: scala.Double): this.type = js.native
}


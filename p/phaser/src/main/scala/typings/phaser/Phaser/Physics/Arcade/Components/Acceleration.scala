package typings.phaser.Phaser.Physics.Arcade.Components

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
  def setAcceleration(x: Double): this.type = js.native
  def setAcceleration(x: Double, y: Double): this.type = js.native
  /**
    * Sets the body's horizontal acceleration.
    * @param value The horizontal acceleration
    */
  def setAccelerationX(value: Double): this.type = js.native
  /**
    * Sets the body's vertical acceleration.
    * @param value The vertical acceleration
    */
  def setAccelerationY(value: Double): this.type = js.native
}


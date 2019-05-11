package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Acceleration component.
  * Should be applied as a mixin.
  */
trait Acceleration extends js.Object {
  /**
    * Sets the horizontal and vertical acceleration of this body.
    * @param x The amount of horizontal acceleration to apply.
    * @param y The amount of vertical acceleration to apply.
    */
  def setAcceleration(x: scala.Double, y: scala.Double): this.type
  /**
    * Sets the horizontal acceleration of this body.
    * @param x The amount of acceleration to apply.
    */
  def setAccelerationX(x: scala.Double): this.type
  /**
    * Sets the vertical acceleration of this body.
    * @param y The amount of acceleration to apply.
    */
  def setAccelerationY(y: scala.Double): this.type
}

object Acceleration {
  @scala.inline
  def apply(
    setAcceleration: (scala.Double, scala.Double) => Acceleration,
    setAccelerationX: scala.Double => Acceleration,
    setAccelerationY: scala.Double => Acceleration
  ): Acceleration = {
    val __obj = js.Dynamic.literal(setAcceleration = js.Any.fromFunction2(setAcceleration), setAccelerationX = js.Any.fromFunction1(setAccelerationX), setAccelerationY = js.Any.fromFunction1(setAccelerationY))
  
    __obj.asInstanceOf[Acceleration]
  }
}


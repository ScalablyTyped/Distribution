package typings.phaser.Phaser.Physics.Arcade.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the angular acceleration properties of an Arcade Physics Body.
  */
trait Angular extends js.Object {
  /**
    * Sets the angular acceleration of the body.
    * 
    * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
    * However, they can have angular motion, which is passed on to the Game Object bound to the body,
    * causing them to visually rotate, even though the body remains axis-aligned.
    * @param value The amount of angular acceleration.
    */
  def setAngularAcceleration(value: Double): this.type
  /**
    * Sets the angular drag of the body. Drag is applied to the current velocity, providing a form of deceleration.
    * @param value The amount of drag.
    */
  def setAngularDrag(value: Double): this.type
  /**
    * Sets the angular velocity of the body.
    * 
    * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
    * However, they can have angular motion, which is passed on to the Game Object bound to the body,
    * causing them to visually rotate, even though the body remains axis-aligned.
    * @param value The amount of angular velocity.
    */
  def setAngularVelocity(value: Double): this.type
}

object Angular {
  @scala.inline
  def apply(
    setAngularAcceleration: Double => Angular,
    setAngularDrag: Double => Angular,
    setAngularVelocity: Double => Angular
  ): Angular = {
    val __obj = js.Dynamic.literal(setAngularAcceleration = js.Any.fromFunction1(setAngularAcceleration), setAngularDrag = js.Any.fromFunction1(setAngularDrag), setAngularVelocity = js.Any.fromFunction1(setAngularVelocity))
  
    __obj.asInstanceOf[Angular]
  }
}


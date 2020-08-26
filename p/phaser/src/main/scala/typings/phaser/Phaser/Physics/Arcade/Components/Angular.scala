package typings.phaser.Phaser.Physics.Arcade.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the angular acceleration properties of an Arcade Physics Body.
  */
@js.native
trait Angular extends js.Object {
  /**
    * Sets the angular acceleration of the body.
    * 
    * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
    * However, they can have angular motion, which is passed on to the Game Object bound to the body,
    * causing them to visually rotate, even though the body remains axis-aligned.
    * @param value The amount of angular acceleration.
    */
  def setAngularAcceleration(value: Double): this.type = js.native
  /**
    * Sets the angular drag of the body. Drag is applied to the current velocity, providing a form of deceleration.
    * @param value The amount of drag.
    */
  def setAngularDrag(value: Double): this.type = js.native
  /**
    * Sets the angular velocity of the body.
    * 
    * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
    * However, they can have angular motion, which is passed on to the Game Object bound to the body,
    * causing them to visually rotate, even though the body remains axis-aligned.
    * @param value The amount of angular velocity.
    */
  def setAngularVelocity(value: Double): this.type = js.native
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
  @scala.inline
  implicit class AngularOps[Self <: Angular] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetAngularAcceleration(value: Double => Angular): Self = this.set("setAngularAcceleration", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAngularDrag(value: Double => Angular): Self = this.set("setAngularDrag", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAngularVelocity(value: Double => Angular): Self = this.set("setAngularVelocity", js.Any.fromFunction1(value))
  }
  
}


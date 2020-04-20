package typings.phaser.Phaser.Physics.Impact.Components

import typings.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Friction component.
  * Should be applied as a mixin.
  */
trait Friction extends js.Object {
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    */
  def setFriction(x: Double, y: Double): GameObject
  /**
    * [description]
    * @param x [description]
    */
  def setFrictionX(x: Double): GameObject
  /**
    * [description]
    * @param y [description]
    */
  def setFrictionY(y: Double): GameObject
}

object Friction {
  @scala.inline
  def apply(
    setFriction: (Double, Double) => GameObject,
    setFrictionX: Double => GameObject,
    setFrictionY: Double => GameObject
  ): Friction = {
    val __obj = js.Dynamic.literal(setFriction = js.Any.fromFunction2(setFriction), setFrictionX = js.Any.fromFunction1(setFrictionX), setFrictionY = js.Any.fromFunction1(setFrictionY))
    __obj.asInstanceOf[Friction]
  }
}


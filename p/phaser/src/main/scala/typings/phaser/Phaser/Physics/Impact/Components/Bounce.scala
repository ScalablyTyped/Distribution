package typings.phaser.Phaser.Physics.Impact.Components

import typings.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Bounce component.
  * Should be applied as a mixin.
  */
trait Bounce extends js.Object {
  /**
    * The bounce, or restitution, value of this body.
    * A value between 0 (no rebound) and 1 (full rebound)
    */
  var bounce: Double
  /**
    * Sets the impact physics bounce, or restitution, value.
    * @param value A value between 0 (no rebound) and 1 (full rebound)
    */
  def setBounce(value: Double): GameObject
  /**
    * Sets the minimum velocity the body is allowed to be moving to be considered for rebound.
    * @param value The minimum allowed velocity.
    */
  def setMinBounceVelocity(value: Double): GameObject
}

object Bounce {
  @scala.inline
  def apply(bounce: Double, setBounce: Double => GameObject, setMinBounceVelocity: Double => GameObject): Bounce = {
    val __obj = js.Dynamic.literal(bounce = bounce.asInstanceOf[js.Any], setBounce = js.Any.fromFunction1(setBounce), setMinBounceVelocity = js.Any.fromFunction1(setMinBounceVelocity))
  
    __obj.asInstanceOf[Bounce]
  }
}


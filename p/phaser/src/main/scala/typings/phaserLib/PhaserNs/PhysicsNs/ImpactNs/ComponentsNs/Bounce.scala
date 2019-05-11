package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs

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
  var bounce: scala.Double
  /**
    * Sets the impact physics bounce, or restitution, value.
    * @param value A value between 0 (no rebound) and 1 (full rebound)
    */
  def setBounce(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * Sets the minimum velocity the body is allowed to be moving to be considered for rebound.
    * @param value The minimum allowed velocity.
    */
  def setMinBounceVelocity(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject
}

object Bounce {
  @scala.inline
  def apply(
    bounce: scala.Double,
    setBounce: scala.Double => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setMinBounceVelocity: scala.Double => phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): Bounce = {
    val __obj = js.Dynamic.literal(bounce = bounce, setBounce = js.Any.fromFunction1(setBounce), setMinBounceVelocity = js.Any.fromFunction1(setMinBounceVelocity))
  
    __obj.asInstanceOf[Bounce]
  }
}


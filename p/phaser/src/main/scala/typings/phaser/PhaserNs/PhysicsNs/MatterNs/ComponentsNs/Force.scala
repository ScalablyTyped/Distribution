package typings.phaser.PhaserNs.PhysicsNs.MatterNs.ComponentsNs

import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import typings.phaser.PhaserNs.MathNs.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A component to apply force to Matter.js bodies.
  */
trait Force extends js.Object {
  /**
    * Applies a force to a body.
    * @param force A Vector that specifies the force to apply.
    */
  def applyForce(force: Vector2): GameObject
  /**
    * Applies a force to a body from a given position.
    * @param position The position in which the force comes from.
    * @param force A Vector that specifies the force to apply.
    */
  def applyForceFrom(position: Vector2, force: Vector2): GameObject
  /**
    * Apply thrust to the forward position of the body.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrust(speed: Double): GameObject
  /**
    * Apply thrust to the back position of the body.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrustBack(speed: Double): GameObject
  /**
    * Apply thrust to the left position of the body.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrustLeft(speed: Double): GameObject
  /**
    * Apply thrust to the right position of the body.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrustRight(speed: Double): GameObject
}

object Force {
  @scala.inline
  def apply(
    applyForce: Vector2 => GameObject,
    applyForceFrom: (Vector2, Vector2) => GameObject,
    thrust: Double => GameObject,
    thrustBack: Double => GameObject,
    thrustLeft: Double => GameObject,
    thrustRight: Double => GameObject
  ): Force = {
    val __obj = js.Dynamic.literal(applyForce = js.Any.fromFunction1(applyForce), applyForceFrom = js.Any.fromFunction2(applyForceFrom), thrust = js.Any.fromFunction1(thrust), thrustBack = js.Any.fromFunction1(thrustBack), thrustLeft = js.Any.fromFunction1(thrustLeft), thrustRight = js.Any.fromFunction1(thrustRight))
  
    __obj.asInstanceOf[Force]
  }
}

